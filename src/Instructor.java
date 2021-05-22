public class Instructor extends User {

    private String professionLanguage;
    private double instructorNumber;

    public Instructor(int id, String name, int age, String mailAdress) {
        super(id, name, age, mailAdress);
    }

    public Instructor() {

    }


    public String getProfessionLanguage() {
        return professionLanguage;
    }

    public void setProfessionLanguage(String professionLanguage) {
        this.professionLanguage = professionLanguage;
    }

    public double getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(double instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
}
