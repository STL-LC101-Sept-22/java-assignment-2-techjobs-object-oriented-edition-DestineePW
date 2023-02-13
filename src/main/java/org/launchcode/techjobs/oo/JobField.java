package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private static int nextId = 1;
    //Fields
    private int id;
    private String value;

    //Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //Custom methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (toBeCompared == null) return false;
        if (getClass() != toBeCompared.getClass()) return false;

        JobField newJobField = (JobField) toBeCompared;

        if (getId() != newJobField.getId()) {
            return false;
        }

        return id == newJobField.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


//Getters and Setters


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
