package ru.skypro;

public class Main {
    public static void main(String[] args) {
        //Код для проверки написанных методов
        EmployeeMap employeeMap1 = new EmployeeMap();
        employeeMap1.addOrEditEmployee("Иванов Иван Иванович", 2, 60000);
        employeeMap1.addOrEditEmployee("Семенов Константин Григорьевич", 2, 80000);
        employeeMap1.addOrEditEmployee("Петров Сергей Анатольевич", 1, 77000);
        employeeMap1.addOrEditEmployee("Мишустин Михаил Владимирович", 1, 70000);
        employeeMap1.addOrEditEmployee("Сидоров Александр Степанович", 3, 50000);
        employeeMap1.addOrEditEmployee("Медведев Степан Александрович", 3, 40000);
        employeeMap1.printAllEmployee();
        System.out.println();

        employeeMap1.addOrEditEmployee("Сидоров Александр Степанович", 3, 90000);
        System.out.println();

        employeeMap1.printAllEmployee();
        System.out.println();

        employeeMap1.removeEmployee("Иванов Иван Иванович");
        System.out.println();

        employeeMap1.printAllEmployee();
        System.out.println();

        System.out.println("Затраты на зарплату в месяц составляют:" +
                employeeMap1.calculationSalariesOfMonth() + "" + " руб.");
        System.out.println();

        System.out.println("Поиск сотрудника в книге: ");
        System.out.println(employeeMap1.searchEmployee("Петров Сергей Анатольевич"));

    }
}
