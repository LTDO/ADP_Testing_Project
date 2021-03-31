/**
 * StudentTest.java
 * This class is mainly for testing methods of class Stundent.java
 * @author Lunga Tshila
 * Student number: 216282934
 * Date: Wednesday, 31 March 2021
 */
package za.ac.cput;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void test() {
        Student lunga = new Student("lunga", 18, "#100");
        Student lungaFromSomewhere = new Student("lungaFromSomewhere", 18, "#100");
        assertEquals(lunga, lungaFromSomewhere);
    }
    @Test
    public void testingUsingEquals() {
        Student sino = new Student("sino", 18, "#13");
        Student sinoFromSomewhere = new Student("sinoFromSomewhere", 18, "#13");
        assertEquals(sino.equals(sinoFromSomewhere), true);
    }

    @Test
    public void testingUsingHashCode1(){
        Student ovayo = new Student("ovayo", 18, "#123");
        assertEquals(ovayo.hashCode(), 1092004);
    }

    @Test
    public void testingUsingHashCode2() {
        Student bobFromDb = new Student("Bobby", 18, "#123");
        assertEquals(bobFromDb.hashCode(), 1092004);
    }
}