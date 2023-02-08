package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
     @Override
    public String toString() {
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object toBeCompared) {

        //refrence check - if two object are the same return true right away
        if (this == toBeCompared) return true;

        // null check - if argument is null return false
        if (toBeCompared == null) return false;

        //class check - return false if classes are different
        if(getClass() != toBeCompared.getClass()) return false;

        //cast
        PositionType differentPositionType = (PositionType) toBeCompared;
        // check if both ID numbers are the same, if NOT return false
        if (getId() != differentPositionType.getId()){
            return false;
        }

        return id == differentPositionType.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // Getters and Setters:

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
