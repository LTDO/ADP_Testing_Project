package za.ac.cput;
/**
 * PersonTest.java
 * This is used to test object of Person class.
 * @author Lunga Tshila
 * Date: Wednesday, 31 March 2021
 * ObjectEquality
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    public void testEquality(){

        Person person1 = new Person("Lunga", 20);
        Person person2 = new Person("ovayo", 20);
        assertEquals(person1.equals(person2), false);
    }
}