import java.util.List;

public interface PersonDAO {

    void insert(Person person);
    void remove(Person person);
    List<Person> getPeople();

}
