package com.java8;

public class Employee {

    private int Id;
<<<<<<< HEAD
    private String Name="ECLIPSE";
=======
    private String Name="INTELLIJ";
>>>>>>> 9b66201e224f65d02cad223b38895ba17eabed7b
    private String Email;
    private String Dept;
    private  double Salary;

    public Employee(int id, String name, String email, String dept, double salary) {
        Id = id;
        Name = name;
        Email = email;
        Dept = dept;
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public  String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
