package Question2;

import java.util.ArrayList;

public class Student {
    String name;
    int grade;
    ArrayList <String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        courses = new ArrayList<String>();
    }

    public void addCourse(String course) {
        int index = this.courses.indexOf(course);

        if(index < 0) {
            courses.add(course);
            System.out.println("Course added successfully!");
        } else {
            System.out.println("Sorry! That course already exists.");
        }
    }

    public void removeCourse(String course) {
        int index = this.courses.indexOf(course);

        if(index >= 0) {
            courses.remove(course);
            System.out.println("Course removed successfully!");
        } else {
            System.out.println("Sorry! That course does not exist.");
        }
    }

    public void seeAllCourses() {
        System.out.println(courses);
    } 
}
