public class Main {
/*    public static Employee[] employees = new Employee[10];

    //выводим полный список сотрудников
    public static void allEmployees() {
        System.out.println("Полный список сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    //выводим только имена
    public static void allEmployeesNames() {
        System.out.println("Полный список имен сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getEmployeeName());
            }
        }
    }

    //считаем сумму расходов на зарплату в месяц
    public static double monthlySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getEmployeeSalary();
            }
        }
        return sum;
    }

    //ищем сотрудника с минимальной зарплатой
    public static StringBuilder minSalaryEmploee() {
        StringBuilder minSalaryEmploee = new StringBuilder();
        double minSalary = 100000000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeSalary() <= minSalary) {
                    minSalary = employees[i].getEmployeeSalary();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() == minSalary) {
                minSalaryEmploee = minSalaryEmploee.append(employees[i].getEmployeeName() + System.lineSeparator());
            }
        }
        return minSalaryEmploee;
    }

    //ищем сотрудника с максимальной зарплатой
    public static StringBuilder maxSalaryEmploee() {
        StringBuilder maxSalaryEmploee = new StringBuilder();
        double maxSalary = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getEmployeeSalary() >= maxSalary) {
                    maxSalary = employees[i].getEmployeeSalary();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() == maxSalary) {
                maxSalaryEmploee = maxSalaryEmploee.append(employees[i].getEmployeeName() + System.lineSeparator());
            }
        }
        return maxSalaryEmploee;
    }

    //ищем среднюю зарплату в месяц
    public static double averageMonthlySalary() {
        double averageMonthlySalary = monthlySum() / employees.length;
        return averageMonthlySalary;
    }

    //Индексация зарплаты
    public static void indexSalary(double index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setEmployeeSalary(employees[i].getEmployeeSalary() * (1 + index / 100));
            }
        }
    }

    //Ищем сотрудника с минимальной ЗП в отделе
    public static StringBuilder minSalaryEmploeeDepartment(int employeeDepartment) {
        StringBuilder minSalaryEmploee = new StringBuilder();
        double minSalary = 100000000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                if (employees[i].getEmployeeSalary() <= minSalary) {
                    minSalary = employees[i].getEmployeeSalary();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment
                    && employees[i].getEmployeeSalary() == minSalary) {
                minSalaryEmploee = minSalaryEmploee.append(employees[i].getEmployeeName() + System.lineSeparator());
            }
        }
        return minSalaryEmploee;
    }

    //Ищем сотрудника с максимальной ЗП в отделе
    public static StringBuilder maxSalaryEmploeeDepartment(int employeeDepartment) {
        StringBuilder maxSalaryEmploee = new StringBuilder();
        double maxSalary = 1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                if (employees[i].getEmployeeSalary() >= maxSalary) {
                    maxSalary = employees[i].getEmployeeSalary();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment
                    && employees[i].getEmployeeSalary() == maxSalary) {
                maxSalaryEmploee = maxSalaryEmploee.append(employees[i].getEmployeeName() + System.lineSeparator());
            }
        }
        return maxSalaryEmploee;
    }

    //считаем сумму расходов на зарплату в месяц по отделу
    public static double monthlySumDepartment(int employeeDepartment) {
        double sumDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                sumDepartment = sumDepartment + employees[i].getEmployeeSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в отделе" + employeeDepartment + ": " + sumDepartment);
        return sumDepartment;
    }

    //ищем среднюю зарплату по отделу в месяц
    public static void averageMonthlySalaryDepartment(int employeeDepartment) {
        int employeeDepartmentCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                employeeDepartmentCount++;
            }
        }
        double averageMonthlySalary = monthlySumDepartment(employeeDepartment) / employeeDepartmentCount;
        System.out.println("Средняя сумма затрат на зарплату в отделе" + employeeDepartment + ": "
                + averageMonthlySalary);
    }

    //Индексация зарплаты в отделе
    public static void indexSalaryDept(int employeeDepartment, double index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                employees[i].setEmployeeSalary(employees[i].getEmployeeSalary() * (1 + index / 100));
            }
        }
    }
    //выводим данные отрудников отдела
    public static void allEmployeesDepartment(int employeeDepartment) {
        System.out.println("Полный список сотрудников отдела:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                System.out.println(employees[i].getEmployeeName() + ". Salary: " + employees[i].getEmployeeSalary());
            }
        }
    }
    //ищем сотрудников с зарплатой больше параметра
    public static void checkMaxSalaryEmploee(double floor) {
        StringBuilder floorSalaryEmploee = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() >= floor) {
                floorSalaryEmploee = floorSalaryEmploee.append(employees[i].getEmployeeName() + System.lineSeparator());
            }
        }
        System.out.println("Сотрудники, зарплата которых превышает " + floor + ": " + System.lineSeparator()
                + floorSalaryEmploee);
    }
    //ищем сотрудников с зарплатой меньше параметра
    public static void checkMinSalaryEmploee(double ground) {
        StringBuilder floorSalaryEmploee = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() < ground) {
                floorSalaryEmploee = floorSalaryEmploee.append(employees[i].getEmployeeName() + System.lineSeparator());
            }
        }
        System.out.println("Сотрудники, зарплата которых ниже " + ground + ": " + System.lineSeparator()
                + floorSalaryEmploee);
    }*/

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Ivanov Ivan Ivanovich", 1, 120000));
        employeeBook.addEmployee(new Employee("Ivanov Aleksander Ivanovich", 2, 210000));
        employeeBook.addEmployee(new Employee("Ivanov Ivan Aleksandrovich", 3, 310000.5));
        employeeBook.addEmployee(new Employee("Sidorov Ivan Ivanovich", 4, 120000));
        employeeBook.addEmployee(new Employee("Sidorov Aleksander Ivanovich", 5, 210134));
        employeeBook.addEmployee(new Employee("Sidorov Ivan Aleksandrovich", 1, 210000.5));
        employeeBook.addEmployee(new Employee("Petrov Ivan Ivanovich", 2, 345128));
        employeeBook.addEmployee(new Employee("Petrov Aleksander Ivanovich", 3, 123098));
        employeeBook.addEmployee(new Employee("Petrov Ivan Aleksandrovich", 4, 265400.12));
        employeeBook.addEmployee(new Employee("Aleksandrov Ivan Aleksandrovich", 5, 310000.5));

        employeeBook.allEmployees();
        System.out.println("Сумма расходов на зарплату в месяц: " + employeeBook.monthlySum());
        System.out.println("Сотрудники с самой низкой зарплатой: " + employeeBook.minSalaryEmploee());
        System.out.println("Сотрудники с самой высокой зарплатой: " + employeeBook.maxSalaryEmploee());
        System.out.println("Средняя зарплата в месяц: " + employeeBook.averageMonthlySalary());
        employeeBook.allEmployeesNames();
        employeeBook.indexSalary(0);
        System.out.println("Сотрудник с самой низкой ЗП в отделе: " + employeeBook.minSalaryEmploeeDepartment(1));
        System.out.println("Сотрудник с самой высокой ЗП в отделе: " + employeeBook.maxSalaryEmploeeDepartment(1));
        employeeBook.monthlySumDepartment(3);
        employeeBook.averageMonthlySalaryDepartment(3);
        employeeBook.indexSalaryDept(2,100);
        employeeBook.allEmployeesDepartment(2);
        employeeBook.checkMaxSalaryEmploee(300000);
        employeeBook.checkMinSalaryEmploee(200000);
        employeeBook.editEmployeeDepartment("Aleksandrov Ivan Aleksandrovich", 1);
        employeeBook.editEmployeeSalary("Aleksandrov Ivan Aleksandrovich", 800000);
        employeeBook.deleteEmployee("Sidorov Ivan Ivanovich", 4);
        employeeBook.deleteEmployee(1);
        employeeBook.deleteEmployee("Petrov Aleksander Ivanovich");
        employeeBook.allEmployees();
        employeeBook.allEmployeesByDepartment();
    }
}
