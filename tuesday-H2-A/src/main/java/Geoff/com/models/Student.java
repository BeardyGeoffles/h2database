package Geoff.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int regno;
    private int marks;
    private String name;


    public void setRegno(int regno) {
        this.regno = regno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

}
