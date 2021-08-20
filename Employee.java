package ru.geekbrains.Home_Work_5;

public class Employee {
    private String name;
    private String work;
    private String mail;
    private String telephoneNumber;
    private int salary;
    private int age;


    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }


    public String getWork() {
        return work;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }



    public void info (){
        System.out.println(name + "; " + work + "; " + mail + "; " + telephoneNumber + "; " + salary + " руб.; " + age + " лет;");
    }

    public Employee (String name, String work, String mail, String telephoneNumber, int salary, int age) {
        this.name = name;
        this.work = work;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;

    }


    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
