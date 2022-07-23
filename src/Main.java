public class Main {
    public static Employee[] employees = new Employee[10];

    //выводим полный список сотрудников
    public static void allEmployees() {
        System.out.println("Full list of employees:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    //выводим только имена
    public static void allEmployeesNames() {
        System.out.println("Full list of employees' names:");
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
        return sumDepartment;
    }

    //ищем среднюю зарплату по отделу в месяц
    public static double averageMonthlySalaryDepartment(int employeeDepartment) {
        int employeeDepartmentCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeDepartment() == employeeDepartment) {
                employeeDepartmentCount++;
            }
        }
        double averageMonthlySalary = monthlySumDepartment(employeeDepartment) / employeeDepartmentCount;
        return averageMonthlySalary;
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
        System.out.println("Full list of employees in department:");
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
    }

    public static void main(String[] args) {

        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 120000);
        employees[1] = new Employee("Ivanov Aleksander Ivanovich", 2, 210000);
        employees[2] = new Employee("Ivanov Ivan Aleksandrovich", 3, 310000.5);
        employees[3] = new Employee("Sidorov Ivan Ivanovich", 4, 120000);
        employees[4] = new Employee("Sidorov Aleksander Ivanovich", 5, 210134);
        employees[5] = new Employee("Sidorov Ivan Aleksandrovich", 1, 210000.5);
        employees[6] = new Employee("Petrov Ivan Ivanovich", 2, 345128);
        employees[7] = new Employee("Petrov Aleksander Ivanovich", 3, 123098);
        employees[8] = new Employee("Petrov Ivan Aleksandrovich", 4, 265400.12);
        employees[9] = new Employee("Aleksandrov Ivan Aleksandrovich", 5, 310000.5);
        employees[1].setEmployeeDepartment(4);
        allEmployees();
        System.out.println("Сумма расходов на зарплату в месяц: " + monthlySum());
        System.out.println("Сотрудники с самой низкой зарплатой: " + minSalaryEmploee());
        System.out.println("Сотрудники с самой высокой зарплатой: " + maxSalaryEmploee());
        System.out.println("Средняя зарплата в месяц: " + averageMonthlySalary());
        allEmployeesNames();
        indexSalary(0);
        System.out.println("Сотрудник с самой низкой ЗП в отделе: " + minSalaryEmploeeDepartment(1));
        System.out.println("Сотрудник с самой высокой ЗП в отделе: " + maxSalaryEmploeeDepartment(1));
        System.out.println("Сумма затрат на зарплату в отделе: " + monthlySumDepartment(3));
        System.out.println("Средняя сумма затрат на зарплату в отделе: " + averageMonthlySalaryDepartment(3));
        indexSalaryDept(2,100);
        allEmployeesDepartment(2);
        checkMaxSalaryEmploee(300000);
        checkMinSalaryEmploee(200000);
    }
}