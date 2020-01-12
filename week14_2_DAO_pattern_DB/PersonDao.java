package week14_2_DAO_pattern_DB;
import java.util.List;

/*
 * interface코드는 건드리지 말것.
 * DAO interface 
 * 
 * ConcreteDaoImpl에서 각각 구현 해야한다.
 * 이 때 ConcreteDaoImpl에서는 실제 DB 명령어.
 */

public interface PersonDao {
    public void insert(Person p);
    public List<Person> findAll();
    public Person findById(int id);
    public void update(Person p, int id);
    public void delete(int id);
    public void delete(Person p);
}
