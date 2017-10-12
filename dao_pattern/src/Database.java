import java.util.ArrayList;
import java.util.List;

public class Database implements PersonDAO {

    private List<Person> mPeople;

    public Database() {
        mPeople = new ArrayList<>();
    }

    @Override
    public void insert(Person person) {
        mPeople.add(person);
    }

    @Override
    public void remove(Person person) {
        mPeople.remove(person);
    }

    @Override
    public List<Person> getPeople() {
        return mPeople;
    }
}
