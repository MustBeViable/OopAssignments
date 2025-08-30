package Task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {


        Student student1 = new Student("Elias", 24);
        Student student2 = new Student("Ellu", 26);
        Student student3 = new Student("Elkku", 69);

        Course course1 = new Course("1234", "oop1", "Juhatti");
        Course course2 = new Course("1235", "oop2", "Juhatti");
        Course course3 = new Course("1236", "oop3", "Juhatti");

        Enrollment enrollment1 = new Enrollment(student1, course1, "29.08.2025");
        Enrollment enrollment2 = new Enrollment(student2, course2, "29.08.2025");
        Enrollment enrollment3 = new Enrollment(student3, course3, "29.08.2025");

        File file = new File(FILENAME);
        if (file.exists() && file.isFile()) {
            try (FileInputStream inputStream = new FileInputStream(FILENAME);
                 ObjectInputStream obj = new ObjectInputStream(inputStream);) {
                List<Enrollment> enrollments = (List<Enrollment>) obj.readObject();
                //enrollment1 = (Enrollment) obj.readObject();
                //enrollment2 = (Enrollment) obj.readObject();
                //enrollment3 = (Enrollment) obj.readObject();
                //enrollments.add(enrollment1); enrollments.add(enrollment2); enrollments.add(enrollment3);
                System.out.println("Deserialized enrollment(s):");
                for (Enrollment e : enrollments) {
                    System.out.println(e.getStudent().printInfo() + e.getCourse().printInfo() + e.printInfo());
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            List<Enrollment> enrollments = new ArrayList<>();
            enrollments.add(enrollment1);
            enrollments.add(enrollment2);
            enrollments.add(enrollment3);
            try (
                    FileOutputStream outputStream = new FileOutputStream(FILENAME);
                    ObjectOutputStream obj = new ObjectOutputStream(outputStream);) {
                obj.writeObject(enrollments);

            } catch (Exception e) {
                System.err.println(e);
            }
        }

        //Printtaan ja deserialisoin enrollmentit

        try {
            FileInputStream inputStream = new FileInputStream(FILENAME);
            ObjectInputStream obj = new ObjectInputStream(inputStream);
            List<Enrollment> enrollments = (List<Enrollment>) obj.readObject();
            //enrollment1 = (Enrollment) obj.readObject();
            //enrollment2 = (Enrollment) obj.readObject();
            //enrollment3 = (Enrollment) obj.readObject();
            //enrollments.add(enrollment1); enrollments.add(enrollment2); enrollments.add(enrollment3);
            System.out.println("Deserialized enrollment(s):");
            for (Enrollment e : enrollments) {
                System.out.println(e.getStudent().printInfo() + e.getCourse().printInfo() + e.printInfo());
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
