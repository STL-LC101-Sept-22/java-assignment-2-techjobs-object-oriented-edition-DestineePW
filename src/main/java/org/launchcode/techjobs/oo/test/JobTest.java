package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
public void testSettingJobId(){
        String testSpec = "verifies that the IDs of two objects are distinct";
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testSpec, testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob.getName()instanceof String);
        assertTrue(testJob.getEmployer()instanceof Employer);
        assertTrue(testJob.getLocation()instanceof Location);
        assertTrue(testJob.getPositionType()instanceof PositionType);
        assertTrue(testJob.getCoreCompetency()instanceof CoreCompetency);

        assertEquals("Product tester",testJob.getName());
        assertEquals("ACME",testJob.getEmployer().getValue());
        assertEquals("Desert",testJob.getLocation().getValue());
        assertEquals("Quality control",testJob.getPositionType().getValue());
        assertEquals("Persistence",testJob.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){

        Job testJob1 = new Job("Kitchen Manager",new Employer("Chipotle Mexican Grill"),new Location("STL"),new PositionType("Quality Control"),new CoreCompetency("Kitchen Knowledge"));
        Job testJob2 = new Job("Kitchen Manager",new Employer("Chipotle Mexican Grill"),new Location("STL"),new PositionType("Quality Control"),new CoreCompetency("Kitchen Knowledge"));

        boolean isNotEqual = testJob1.equals(testJob2);

        assertFalse(isNotEqual);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char firstChar = testJob.toString().charAt(0);
        char lastChar = testJob.toString().charAt(testJob.toString().length()-1);

        assertEquals('\n', firstChar);
        assertEquals('\n', lastChar);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = "\n" + "ID: " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + testJob.getCoreCompetency() + "\n";

        assertEquals(jobString,testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location(), new PositionType(), new CoreCompetency());

        String expectedValue = "\n" + "ID: " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n";

        assertEquals(expectedValue, testJob.toString());
    }

   @Test
    public void testToStringHandlesIdOnly(){

       Job testJob = new Job(null, new Employer(), new Location(), new PositionType(), new CoreCompetency());

       String expectedValue = "OOPS! This job does not seem to exist.";

       assertEquals(expectedValue,testJob.toString());

    }

    

    
}
