package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private static int nextId = 1;
    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object toBeCompared) {

        if (this == toBeCompared) return true;

        if (toBeCompared == null) return false;

        if (getClass() != toBeCompared.getClass()) return false;

        Job job = (Job) toBeCompared;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        StringBuilder toStringResult = new StringBuilder("\n" + "ID: " + getId() + "\n");

        if (getName() != null) {
            toStringResult.append("Name: " + getName() + "\n");
        } else {
            toStringResult.append("Name: " + "Data not available" + "\n");
        }

        if (getEmployer().toString() != null && getEmployer().toString() != "") {
            toStringResult.append("Employer: " + getEmployer() + "\n");
        } else {
            toStringResult.append("Employer: " + "Data not available" + "\n");
        }

        if (getLocation().toString() != null && getLocation().toString() != "") {
            toStringResult.append("Location: " + getLocation() + "\n");
        } else {
            toStringResult.append("Location: " + "Data not available" + "\n");
        }

        if (getPositionType().toString() != null && getPositionType().toString() != "") {
            toStringResult.append("Position Type: " + getPositionType() + "\n");
        } else {
            toStringResult.append("Position Type: " + "Data not available" + "\n");
        }

        if (getCoreCompetency().toString() != null && getCoreCompetency().toString() != "") {
            toStringResult.append("Core Competency: " + getCoreCompetency() + "\n");
        } else {
            toStringResult.append("Core Competency: " + "Data not available" + "\n");
        }

        if (
                (getName() == null || getName() == "") &&
                        (getEmployer().toString() == null || getEmployer().toString() == "") &&
                        (getLocation().toString() == null || getLocation().toString() == "") &&
                        (getPositionType().toString() == null || getPositionType().toString() == "") &&
                        (getCoreCompetency().toString() == null || getCoreCompetency().toString() == "")
        ) {
            return "OOPS! This job does not seem to exist.";
        } else {

            return toStringResult.toString();
        }
    }


// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and ID


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
