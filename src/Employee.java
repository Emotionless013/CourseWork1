public class Employee {
    private String employeeName;
    private int employeeDepartment;
    private double employeeSalary;
    private int employeeID;

    private static int counter = 1;

    public Employee(String employeeName, int employeeDepartment, double salary) {
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = salary;
        this.employeeID = counter;
        counter++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee: " + employeeID + " " + employeeName + " works at department " + employeeDepartment +
                ". Salary: " + employeeSalary;
    }


}
