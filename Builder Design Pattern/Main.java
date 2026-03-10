public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setId("1")
                .setName("John Doe")
                .setEmail("johndoe@gmail.com").build();
        System.out.println(user);

        User jerry = User.UserBuilder.builder()
                .setId("2")
                .setName("Jerry")
                .setEmail("jerry@gmail.com").build();
        System.out.println(jerry);
    }
}
