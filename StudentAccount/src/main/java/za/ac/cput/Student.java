package za.ac.cput;


public class Student {
    private String name;
    private long studentNumber;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
