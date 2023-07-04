package Geoff.com.models;

import jakarta.persistence.*;

@Entity
@Table(name="Personal") //change the name of the Table
public class StudentPersonal {
    @Id
    @Column(name="pid") //Changes the name of the column in the table
    public int personalID;
    public String name;
    @Column(name="HomeAddress") //Changes the name of the column in the table
    public String Address;

    @Transient
    @Column(name="HotOrNot")
    public float studentRating;
}
