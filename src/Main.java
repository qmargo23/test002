public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("ВАВИЛОВ Олег Сергееевич", 1, 80_000.500f);
        employees[1] = new Employee("ЕВГЕНОВ Иван Викторович", 3, 90_000.400f);
        employees[2] = new Employee("ЖАБРАК Сергей Анатольевич", 1, 70_000.500f);
        employees[3] = new Employee("ЗАБЕЛИН Михаил Викторович", 5, 96_000f);
        employees[4] = new Employee("ВАВИЛОВ Олег Анатольевич", 2, 89_000.500f);
        employees[5] = new Employee("КАБАНЕЦ Сергей Николаевич", 4, 95_000f);
        employees[6] = new Employee("ИВАКИН Олег Анатольевич", 2, 66_000.500f);
        employees[7] = new Employee("ЛАБУТКИН Михаил Анатольевич", 1, 93_000f);
        employees[8] = new Employee("НАБИЕВ Николай Сергееевич", 1, 78_000.500f);
        employees[9] = new Employee("НАБОКОВ Иван Николаевич", 1, 56_000f);

        printLine();
        printEmployees(employees);
        printLine();
        costAmount(employees);
        printLine();
        calcMinSalary(employees);
        printLine();
        calcMaxSalary(employees);
        printLine();
        averageValue(employees);
        printLine();
        printStaffList(employees);
        printLine();
    }
    public static void printEmployees(Employee[] employees) {
        System.out.println("1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).");
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void costAmount(Employee[] employees) {
        System.out.println("2. Посчитать сумму затрат на зарплаты в месяц.");
        System.out.println();
        float sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет - " + sum + "р.");
    }
    public static void calcMinSalary(Employee[] employees) {
        System.out.println("3. Найти сотрудника с минимальной зарплатой.");
        Employee min = employees[0]; // нахождение мин значачения и индекса в массиве
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: "+ min.getFIO());
    }
    public static void calcMaxSalary(Employee[] employees) {
        System.out.println("4. Найти сотрудника с максимальной зарплатой.");
        Employee max = employees[0]; // нахождение max значачения и индекса в массиве
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        System.out.println("Максимальная зарплата у сотрудника: "+ max.getFIO());
    }
    public static void averageValue(Employee[] employees) {
        System.out.println("5. Подсчитать среднее значение зарплат");
        System.out.println();
        float sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Среднее значение зарплат в месяц составляет - " + sum/2 + "р.");
    }
    public static void printStaffList(Employee[] employees) {
        System.out.println("6. Получить Ф. И. О. всех сотрудников (вывести в консоль)");
        System.out.println();
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }
    public static void printLine() {
        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println();
    }
}



