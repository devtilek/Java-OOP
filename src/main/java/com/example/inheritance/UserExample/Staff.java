package com.example.inheritance.UserExample;

public class Staff extends User{
    private int salary;
    private String[] subjects = new String[100];
    private int indexOfSubjects = 0;

    public Staff(){

    }

    public Staff(int id, String login, String password, String name, int salary) {
        super(id, login, password, name);
        this.salary = salary;
    }

    public Staff(int salary, String[] subjects, int indexOfSubjects) {
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubjects = indexOfSubjects;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addSubject(String subject){
        subjects[indexOfSubjects] = subject;
        indexOfSubjects++;
    }

    public void getInfo(){
        System.out.println("ID: " + id + " Login: " + login + " Password: " + password + " Name: " + name + " Salary: " + salary);


        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null){
                System.out.println("Subjects list: " + subjects[i]);
            }
        }
    }
}
