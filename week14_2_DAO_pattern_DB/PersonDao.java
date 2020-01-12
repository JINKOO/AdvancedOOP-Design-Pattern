package week14_2_DAO_pattern_DB;
import java.util.List;

/*
 * interface�ڵ�� �ǵ帮�� ����.
 * DAO interface 
 * 
 * ConcreteDaoImpl���� ���� ���� �ؾ��Ѵ�.
 * �� �� ConcreteDaoImpl������ ���� DB ��ɾ�.
 */

public interface PersonDao {
    public void insert(Person p);
    public List<Person> findAll();
    public Person findById(int id);
    public void update(Person p, int id);
    public void delete(int id);
    public void delete(Person p);
}
