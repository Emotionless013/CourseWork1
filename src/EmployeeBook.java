import java.util.Arrays;
import java.util.Comparator;

public class EmployeeBook {
    private Employee[] employeeBook;

    public EmployeeBook(int employeeBookSize) {
        this.employeeBook = new Employee[employeeBookSize];
    }

    //добавляем сотрудника
    public void addEmployee(Employee employee) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employee;
                break;
            }
        }
    }

    //выводим полный список сотрудников
    public void allEmployees() {
        System.out.println("Полный список сотрудников:");
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    //выводим только имена
    public void allEmployeesNames() {
        System.out.println("Полный список имен сотрудников:");
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }
        }
    }

    //считаем сумму расходов на зарплату в месяц
    public double monthlySum() {
        double sum = 0;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                sum = sum + employee.getEmployeeSalary();
            }
        }
        return sum;
    }

    //ищем сотрудника с минимальной зарплатой
    public StringBuilder minSalaryEmploee() {
        StringBuilder minSalaryEmploee = new StringBuilder();
        double minSalary = 100000000;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                if (employee.getEmployeeSalary() <= minSalary) {
                    minSalary = employee.getEmployeeSalary();
                }
            }
        }
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeSalary() == minSalary) {
                minSalaryEmploee = minSalaryEmploee.append(employee.getEmployeeName() + System.lineSeparator());
            }
        }
        return minSalaryEmploee;
    }

    //ищем сотрудника с максимальной зарплатой
    public StringBuilder maxSalaryEmploee() {
        StringBuilder maxSalaryEmploee = new StringBuilder();
        double maxSalary = 1;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                if (employee.getEmployeeSalary() >= maxSalary) {
                    maxSalary = employee.getEmployeeSalary();
                }
            }
        }
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeSalary() == maxSalary) {
                maxSalaryEmploee = maxSalaryEmploee.append(employee.getEmployeeName() + System.lineSeparator());
            }
        }
        return maxSalaryEmploee;
    }

    //ищем среднюю зарплату в месяц
    public double averageMonthlySalary() {
        int employeeCount = 0;
        double averageMonthlySalary = 0;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                employeeCount++;
                averageMonthlySalary = monthlySum() / employeeCount;
            }
        }
        return averageMonthlySalary;
    }

    //Индексация зарплаты
    public void indexSalary(double index) {
        for (Employee employee : employeeBook) {
            if (employee != null) {
                employee.setEmployeeSalary(employee.getEmployeeSalary() * (1 + index / 100));
            }
        }
    }

    //Ищем сотрудника с минимальной ЗП в отделе
    public StringBuilder minSalaryEmploeeDepartment(int employeeDepartment) {
        StringBuilder minSalaryEmploee = new StringBuilder();
        double minSalary = 100000000;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment) {
                if (employee.getEmployeeSalary() <= minSalary) {
                    minSalary = employee.getEmployeeSalary();
                }
            }
        }
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment
                    && employee.getEmployeeSalary() == minSalary) {
                minSalaryEmploee = minSalaryEmploee.append(employee.getEmployeeName() + System.lineSeparator());
            }
        }
        return minSalaryEmploee;
    }

    //Ищем сотрудника с максимальной ЗП в отделе
    public StringBuilder maxSalaryEmploeeDepartment(int employeeDepartment) {
        StringBuilder maxSalaryEmploee = new StringBuilder();
        double maxSalary = 1;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment) {
                if (employee.getEmployeeSalary() >= maxSalary) {
                    maxSalary = employee.getEmployeeSalary();
                }
            }
        }
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment
                    && employee.getEmployeeSalary() == maxSalary) {
                maxSalaryEmploee = maxSalaryEmploee.append(employee.getEmployeeName() + System.lineSeparator());
            }
        }
        return maxSalaryEmploee;
    }

    //считаем сумму расходов на зарплату в месяц по отделу
    public double monthlySumDepartment(int employeeDepartment) {
        double sumDepartment = 0;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment) {
                sumDepartment = sumDepartment + employee.getEmployeeSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в отделе" + employeeDepartment + ": " + sumDepartment);
        return sumDepartment;
    }

    //ищем среднюю зарплату по отделу в месяц
    public void averageMonthlySalaryDepartment(int employeeDepartment) {
        int employeeDepartmentCount = 0;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment) {
                employeeDepartmentCount++;
            }
        }
        double averageMonthlySalary = monthlySumDepartment(employeeDepartment) / employeeDepartmentCount;
        System.out.println("Средняя сумма затрат на зарплату в отделе" + employeeDepartment + ": "
                + averageMonthlySalary);
    }

    //Индексация зарплаты в отделе
    public void indexSalaryDept(int employeeDepartment, double index) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment) {
                employee.setEmployeeSalary(employee.getEmployeeSalary() * (1 + index / 100));
            }
        }
    }

    //выводим данные отрудников отдела
    public void allEmployeesDepartment(int employeeDepartment) {
        System.out.println("Полный список сотрудников отдела:");
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeDepartment() == employeeDepartment) {
                System.out.println(employee.getEmployeeName() + ". Salary: " + employee.getEmployeeSalary());
            }
        }
    }

    //ищем сотрудников с зарплатой больше параметра
    public void checkMaxSalaryEmploee(double floor) {
        StringBuilder floorSalaryEmploee = new StringBuilder();
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeSalary() >= floor) {
                floorSalaryEmploee = floorSalaryEmploee.append(employee.getEmployeeName() + System.lineSeparator());
            }
        }
        System.out.println("Сотрудники, зарплата которых превышает " + floor + ": " + System.lineSeparator()
                + floorSalaryEmploee);
    }

    //ищем сотрудников с зарплатой меньше параметра
    public void checkMinSalaryEmploee(double ground) {
        StringBuilder floorSalaryEmploee = new StringBuilder();
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeSalary() < ground) {
                floorSalaryEmploee = floorSalaryEmploee.append(employee.getEmployeeName() + System.lineSeparator());
            }
        }
        System.out.println("Сотрудники, зарплата которых ниже " + ground + ": " + System.lineSeparator()
                + floorSalaryEmploee);
    }

    //удаляем сотрудника
    public void deleteEmployee(String name, int ID) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeName() == name &&
                    employeeBook[i].getEmployeeID() == ID) {
                employeeBook[i] = null;
            }
        }
    }

    public void deleteEmployee(String name) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeName() == name) {
                employeeBook[i] = null;
            }
        }
    }

    public void deleteEmployee(int ID) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getEmployeeID() == ID) {
                employeeBook[i] = null;
            }
        }
    }

    //изменяем отдел
    public void editEmployeeDepartment(String name, int newDept) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeName() == name) {
                employee.setEmployeeDepartment(newDept);
            }
        }
    }

    //изменяем зарплату
    public void editEmployeeSalary(String name, double newSalary) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getEmployeeName() == name) {
                employee.setEmployeeSalary(newSalary);
            }
        }
    }

    //список сотрудников по отделам
    public void allEmployeesByDepartment() {
        System.out.println("Полный список сотрудников, отсортированный по отделам:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел № " + i);
            for (Employee employee : employeeBook) {
                if (employee != null && employee.getEmployeeDepartment() == i) {
                    System.out.println(employee.toString());
                }
            }
        }
    }
}
