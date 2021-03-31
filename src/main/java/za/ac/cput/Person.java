package za.ac.cput;
/**
 * Person.java
 * This is a concrete class for a Person object
 * @author Lunga Tshila
 * Date: Wednesday, 31 March 2021
 * ObjectEquality
 */


public class Person {
    private final String name;

    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!Person.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        Person other = (Person)obj;
        return other.name.equals(name) && other.age == age;
    }
}