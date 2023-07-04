package Geoff.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainers {

    @Id
    private int trainerID;

    private String name;

    public int getTrainerID() {
        return trainerID;
    }

    public String getName() {
        return name;
    }
}
