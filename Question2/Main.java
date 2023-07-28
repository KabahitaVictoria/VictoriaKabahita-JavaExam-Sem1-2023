package Question2;

public class Main {
    public static void main(String[] args) {
        // 2) ii)
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.addItem("Rice and Chicken", 12000);
        myRestaurant.addItem("Pineapple Pizza", 20000);
        myRestaurant.seeAllItems();
        myRestaurant.removeItem("Pineapple Pizza");
        // myRestaurant.addItem("Rice and Chicken", 12000);
        myRestaurant.addRating("Rice and Chicken", 4);
        // myRestaurant.addRating("Rice and Chicken", -1);
        // myRestaurant.addRating("Rice and Chicken", 6);
        myRestaurant.addRating("Rice and Chicken", 5);
        myRestaurant.averageRating("Rice and Chicken");
        myRestaurant.seeAllItems();

        System.out.println("...............................");

        // 2) iii)
        Student student1 = new Student("Mary", 8);
        student1.addCourse("Math");
        // student1.addCourse("Math");
        student1.addCourse("Physics");
        student1.addCourse("Chemistry");
        student1.addCourse("Geography");
        student1.seeAllCourses();

        student1.removeCourse("Geography");
        // student1.removeCourse("Geography");
        student1.seeAllCourses();
    }
}
