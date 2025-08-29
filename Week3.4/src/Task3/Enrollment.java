package Task3;

import java.io.Serializable;

public class Enrollment implements Serializable {

    private Student student;
    private Course course;
    private String enrollmentDate;



    public Enrollment (Student student, Course course, String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String printInfo() {
        return "Enrollment date" + this.enrollmentDate;
    }
}
