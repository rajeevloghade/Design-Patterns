public class EmployeeFactory {

    public static Employee getEmployee(String employeeType) {
        if (employeeType == null) {
            return null;
        }
        if (employeeType.equalsIgnoreCase("DEVELOPER")) {
            return new Developer();
        } else if (employeeType.equalsIgnoreCase("TESTER")) {
            return new Tester();
        }
        return null;
    }
}
