public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Alice", "Alice@gmail.com"));
        userManagement.addUser(new User("Bob", "Bob@gmail.com"));
        userManagement.addUser(new User("Joe", "Joe@gmail.com"));
        userManagement.addUser(new User("Jerry", "Jerry@gmail.com"));

        MyIterator iterator = userManagement.getIterator();

        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user.getName() + " - " + user.getEmail());
        }

    }
}
