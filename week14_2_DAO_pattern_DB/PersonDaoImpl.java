package week14_2_DAO_pattern_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Client에서 직접 DB를 조작하지 않도록 한 class
 * 즉 DAO패턴을 따르며
 * DAO interface의 메소드들을 구현하여
 * client에서 DB를 조작하는 것을 떨어뜨린다.
 */

public class PersonDaoImpl implements PersonDao {
    
	final static String DB_FILE_NAME = "addressbook.db";
    final static String DB_TABLE_NAME = "persons";
	
    private Connection connection = null;
    private ResultSet rs = null;
    private Statement statement = null;

    public PersonDaoImpl() {
    	
    	try {
    		this.connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            this.statement = connection.createStatement();
            this.statement.setQueryTimeout(30);  // set timeout to 30 sec.

            final String table = " (ID INTEGER PRIMARY KEY AUTOINCREMENT, name text, address text)";
            
            //create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);

            
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

    public void insert(Person p) {
    	
    	try {
    		 statement.execute("INSERT INTO " + DB_TABLE_NAME + " VALUES(" + p.getId() + ", '"
                     + p.getName() + "', '" + p.getAddress() + "')");
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

    public List<Person> findAll() {
    	
    	ArrayList<Person> persons = new ArrayList<>();
    	
    	try {
    		rs = statement.executeQuery("SELECT * FROM "+DB_TABLE_NAME+" WHERE id < 4 ORDER BY id");
            while (rs.next()) {
            	persons.add(new Person(rs.getInt("id"), rs.getString("name"), rs.getString("address")));
//                System.out.println("" + rs.getInt("ID") + ", " + rs.getString("name") + ", " + rs.getString("address"));
            }
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return persons;
    }

    public Person findById(int id) {
    	Person person = null;
    	try {
    		statement.executeQuery("SELECT * FROM "+DB_TABLE_NAME+" WHERE ID = "+id+"");
    		if(rs.next()) {
    			person = new Person(rs.getInt("id"), rs.getString("name"), rs.getString("address"));
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return person;
    }

    public void update(Person p, int id) {
    	Person person = findById(id);
    	if(person != null) {
    		try {
    			statement.execute("UPDATE " + DB_TABLE_NAME + " SET " + "name = '" + p.getName() + "', address = '"
                        + p.getAddress() + "' WHERE id = " + id);
//        		statement.execute("UPDATE "+DB_TABLE_NAME+" SET name = " + p.getName() + " WHERE id = "+id+"");
        	} catch(SQLException e) {
        		e.printStackTrace();
        	}
    	}
    }

    public void delete(int id) {
    	try {
    		statement.execute("DELETE FROM "+DB_TABLE_NAME+" WHERE id = "+id+" ");
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    }

    public void delete(Person p) {
    	delete(p.getId());
    }
}

