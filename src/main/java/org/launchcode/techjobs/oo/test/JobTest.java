package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

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

}
