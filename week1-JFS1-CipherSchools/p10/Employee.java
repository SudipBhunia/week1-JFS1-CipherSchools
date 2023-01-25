public class Employee {


    int EmployeeId;
    int salary;
    String dept;
    Employee(int empid, int sal, String dep) {
        EmployeeId=empid;
        salary=sal;
        dept = dep;
    }

    public static void main(String[] args) {
        Employee ayan = new Employee(101, 3000, "Test");
        
        Employee sudip = new Employee(102, 5000, "Dev");

        System.out.println(ayan.EmployeeId+" "+ayan.salary+" "+ayan.dept);
        System.out.println(sudip.EmployeeId+" "+sudip.salary+" "+sudip.dept);
    }
}