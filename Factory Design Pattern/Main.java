public class Main {
    public static void main(String[] args) {
        // Using the EmployeeFactory to create different types of employees
        Employee developer = EmployeeFactory.getEmployee("DEVELOPER");
        System.out.println("Employee Type: " + developer.getName());

        Employee tester = EmployeeFactory.getEmployee("TESTER");
        System.out.println("Employee Type: " + tester.getName());
    }

}
