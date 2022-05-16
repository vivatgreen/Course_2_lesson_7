package ru.skypro;

import ru.skypro.course1.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class EmployeeMap {
    private final Map<String, Employee> employeeMap;
//    private Object NullPointerException;

    public EmployeeMap() {
        this.employeeMap = new HashMap<String, Employee>();
    }

    //Добавление сотрудника в книгу или редактирование
    public void addOrEditEmployee(String fullName, int department, double salary) {
        if (employeeMap.containsKey(fullName)) {
            System.out.println("В книге уже есть запись о сотруднике " + fullName +
                    ". Она будет отредактирована в соответствии с предоставленными данными.");
        }
        Employee employee = new Employee(fullName, department, salary);
        employeeMap.put(fullName, employee);}
    //Вывод всех записей в книге сотрудников
    public void printAllEmployee() {
        if (employeeMap.isEmpty()) {
            System.out.println("В книге сотрудников нет записей.");
            return;
        }
        for (Employee employee : employeeMap.values()) {
            System.out.println(employee);
        }
    }
    // Удаление записи из книги сотрудников
    public void removeEmployee(String fullName) {
        if (employeeMap.isEmpty()) {
            System.out.println("В книге сотрудников нет записей.");
            return;
        }
        if (employeeMap.remove(fullName) == null) {
            System.out.println("В книге нет записи о сотруднике: " + fullName);
        } else {
            System.out.println("В книге удалена запись о сотруднике: " + fullName);
        }
    }
    //Рассчет затрат на зарплату в месяц
    public double calculationSalariesOfMonth() {
        double sumSalaries = 0;
        if (employeeMap.isEmpty()) {
            System.out.println("В книге сотрудников нет записей.");
            return sumSalaries;
        }
        for (Employee employee : employeeMap.values()) {
            sumSalaries = sumSalaries + employee.getSalary();
        }
        return sumSalaries;
    }

    //Поиск сотрудника
    public Employee searchEmployee(String fullName) {
        if (employeeMap.isEmpty()) {
            throw new NullPointerException("Employee book is empty");
        }
        if (employeeMap.containsKey(fullName)) {
            return employeeMap.get(fullName);
        }
        throw new NoSuchElementException("Employee not found");
    }


}
