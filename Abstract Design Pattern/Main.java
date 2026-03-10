public class Main {
    public static void main(String[] args) {

        Employee developer = EmployeeFactory.getEmployee(new DeveloperFactory());
        System.out.println(developer.getName());

        Employee tester = EmployeeFactory.getEmployee(new TesterFactory());
        System.out.println(tester.getName());
    }

}
