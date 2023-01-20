package StudentWork;

import org.example.Print;

import java.util.Random;

public class Student implements Print {
    private int id;
    private String name;
    private String surname;

    private int marks[];

    private int dateOfBirth;

    public void estimation() {
        Random random = new Random();
        for (int a = 0; a < 10; a++) {
            marks[a] = random.nextInt(4) + 2;
        }
    }

    public void printMarks() {
        for (int a = 0; a < marks.length; a++) {
            System.out.print(marks[a] + " ");
        }
    }

    public double chelItogMark() {
        double buffer = 0;
        for (int a = 0; a < marks.length; a++) {
            buffer = buffer + marks[a];
        }
        return buffer / marks.length;
    }

    public Student(String name, String surname, int id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.marks = new int[10];
    }

    public String info() {
        return "Имя: " + name + " " + "Фамилия: " + surname + " " + "Id: " + id;
    }


    public String getName(String name) {
        return name;
    }

    public String getSurname(String surname) {
        return surname;
    }

    public int getId(int id) {
        return id;
    }

    public int dateOfBirth(int dateOfBirth) {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void print(){
        System.out.println(this.surname);
    }

}

