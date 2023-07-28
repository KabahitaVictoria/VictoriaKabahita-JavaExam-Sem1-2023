import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1)i)
        SumOfEvenNumbersLessThanEight.sumEvenNumbers();

        System.out.println("............................");

        // 1)ii)
        Scanner input = new Scanner(System.in);
        System.out.println("Please input any 5 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        FindAverage findAverageObj1 = new FindAverage(num1, num2, num3, num4, num5);
        findAverageObj1.calculateAverage();

        input.close();

        System.out.println("............................");

        // 1)iii)
        OutputOfOperations.printOutput();

        System.out.println("............................");

        // 1)iv)
        ArrayOfAnimals myDomesticAnimalArray = new ArrayOfAnimals();
        myDomesticAnimalArray.addAnimal("Cat");
        myDomesticAnimalArray.addAnimal("Dog");
        myDomesticAnimalArray.addAnimal("Cow");
        myDomesticAnimalArray.printAllAnimals();

        System.out.println("............................");
        
    }
}
