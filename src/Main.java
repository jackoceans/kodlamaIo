public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.getName();
        user.getId();
        user.getAge();
        user.getMailAdress();

        Student student = new Student();
        student.getStudentNumber();

        Instructor instructor = new Instructor();
        instructor.getInstructorNumber();

        UserManager userManager = new UserManager();
        userManager.remove();


    }
}
