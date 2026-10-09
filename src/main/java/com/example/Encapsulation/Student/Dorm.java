package com.example.Encapsulation.Student;

public class Dorm {
    private String name;
    private Student[] students = new Student[10];
    private int index = 0;

    public void addStudent(Student student){
        students[index] = student;
        index++;
    }

    public void printStudents(){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                System.out.println(students[i].toString());
            }

        }
    }

    public boolean removeStudentFromDorm(int id){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getId() == id){
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public Student getMaxGpa(){
        double max = students[0].getGpa();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (max < students[i].getGpa()){
                    max = students[i].getGpa();
                    index = i;
                }
            }
        }
        return students[index];
    }

}
