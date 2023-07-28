package Question4;

public class Main {
    public static void main(String[] args) {
        // 4) ii) 
        Person person1 = new Person("Victoria", 20, 1000000);
        // person1.salary; // generates error because it is a hidden attribute
        person1.setName("Vicky"); 
        System.out.println(person1.getName());
        person1.setSalary(1200000);

        System.out.println(".................................");

        // 4) iii)
        Box box1 = new Box(4.3f);
        System.out.println(String.format("Initial width: %s", box1.getWidth()));
        box1.setWidth(4.5f);
        System.out.println(String.format("Updated width: %s", box1.getWidth()));
    }
}
