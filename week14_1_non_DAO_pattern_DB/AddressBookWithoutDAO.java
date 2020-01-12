package week14_1_non_DAO_pattern_DB;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * DB를 사용하지만, DAO패턴을 따르지 않고 있다.
 * client에서 DB에 직접 접근 하고 있다. 
 * 사용 DB sqlite
 * 생성 되는 database파일이름 addressdb 
 */
public class AddressBookWithoutDAO {
	
    final static String DB_FILE_NAME = "addressbook.db";
    final static String DB_TABLE_NAME = "persons";

    public static void main (String[] args){
    	
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            final String table = " (ID INTEGER PRIMARY KEY AUTOINCREMENT, name text, address text)";

            // create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);

            System.out.println("--- inserting...");
            statement.execute("INSERT INTO persons(name, address) VALUES('Seonyoung Kim','1 Hongji Dong')");
            statement.execute("INSERT INTO persons(name, address) VALUES('Jangkwon Lee','2 Hongji Dong')");

            System.out.println("--- finding all...");
            rs = statement.executeQuery("SELECT * FROM persons WHERE id < 4 ORDER BY id");
            while (rs.next()) {
                System.out.println("" + rs.getInt("ID") + ", " + rs.getString("name") + ", " + rs.getString("address"));
            }

            System.out.println("--- updating...");
            statement.execute("UPDATE persons SET name = 'Sooyoung Lim' WHERE id = 1");

            System.out.println("--- see if updated...");
            rs = statement.executeQuery("SELECT * FROM persons WHERE id = 1");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("address"));
            }

            System.out.println("--- deleting...");
            statement.execute("DELETE FROM persons WHERE id = 1");

            System.out.println("--- finding all after deleting...");
            rs = statement.executeQuery("SELECT * FROM persons WHERE id < 4 ORDER BY id");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("address"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        finally {
            try {
                if(rs != null) {
                    rs.close();
                }
                if(statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}