package ru.geekbrains.Home_Work_5;

public class Main {

    public static void main(String[] args) {

        Employee [] employees = new Employee[5];
        employees [0] = new Employee ("Иванов Иван Иванович", "Инженер", "ivanov@gmail.com",
                "+79134562112", 35000, 45);
        employees [1] = new Employee("Сидоров Семен Евгеньевич", "Уборщик", "sidor@yandex.ru",
                "+79115552223", 20000, 39);
        employees [2] = new Employee( "Ермаков Данил Игоревич", "логист", "d4122@yandex.ru",
                "89137935063", 40000, 26);
        employees [3] = new Employee( "Сергеев Сергей Сергеевич", "Охранник", "serg@mail.ru",
                "+79232215447", 32000, 47);
        employees [4] = new Employee("Иванова Наталья Ивановна", "Учитель", "Ivanova@mail.ru",
                "+79835632145", 37000, 33);


        System.out.println("Сотрудники старше 40 лет:");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }

        }






//	Employee employee = new Employee("Ермаков Данил Игоревич", "логист", "d4122@yandex.ru",
//			"89137935063", 40000, 26);
//	employee.name = "Ермаков Данил Игоревич";
//	employee.work = "Логист";
//	employee.mail = "d4122@yandex.ru";
//	employee.salary = 40000;
//	employee.telephoneNumber = "89137935063";
//	employee.age = 26;
//
//	employee.info();

    }
}

//		  1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//		  4. Создать массив из 5 сотрудников.
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//    ...
//    persArray[4] = new Person(...);
//
//         5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
