package payroll;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id){
        super("Could not find employee " + id);
        System.out.println("i'm here");

    }
}

