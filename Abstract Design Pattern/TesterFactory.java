public class TesterFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
       return new Tester();
    }
    
}

