import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> users;
    private int position;

    public MyIteratorImpl(List<User> users) {
        this.users = users;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < users.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return users.get(position++);
        }
        return null;
    }
}
