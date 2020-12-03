import java.util.ArrayList;
import java.util.List;


public class Student {
    int rating;
    private String name;
    static int studentCounter = 0;
    static double ratingSum;


    // TODO implement Student class according to the instructions provided in the README.md file
    public Student() {
        studentCounter++;
    }

    public Student(String name) {
        studentCounter++;
        this.name = name;
    }


    public static double getAvgRating() {
        if (studentCounter == 0) return 0.0;
        return ratingSum / studentCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        ratingSum += rating;
    }

    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
        ratingSum -= this.getRating();
        this.rating = rating;
        ratingSum += this.getRating();
    }

    public static void removeStudent(Student student) {
        student = null;
        System.gc();
    }

    @Override
    public String toString() {
        String nameAndRating = this.getName() + " " + this.getRating();
        return nameAndRating;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Petro");
        s1.setRating(14);
        Student s2 = new Student();
        s2.setName("Vasya");
        s2.setRating(13);
        Student s3 = new Student("Bohdan");
        s3.setRating(14);
        System.out.println("rating before: " + Student.getAvgRating());
        s2.changeRating(17);
        System.out.println(s3.toString());
        System.out.println(s1.toString()+"; "+s2.toString()+"; "+s3.toString()+";");
        System.out.println("Rating after:  " + Student.getAvgRating());

    }
}