public class Student extends User{

    private double studentNumber;

    public Student(int id, String name, int age, String mailAdress) {
        super(id, name, age, mailAdress);
    }

    public Student() {

    }

    public double getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(double studentNumber) {
        this.studentNumber = studentNumber;
    }
}
