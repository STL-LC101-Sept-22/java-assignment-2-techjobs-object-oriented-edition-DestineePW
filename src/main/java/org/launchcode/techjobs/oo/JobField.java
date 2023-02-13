package org.launchcode.techjobs.oo;

public class JobField {

    //Fields
    private int id;
    private static int nextId = 1;
    private String value;

    //Constructors
    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    //Custom methods
    @Override
    public String toString(){return value;}

    @Override
    public boolean equals(Object toBeCompared){
        if (this == toBeCompared) return true;
        if(toBeCompared == null) return false;

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
