public class FindAverage {
    double num1;
    double num2;
    double num3;
    double num4;
    double num5;

    public FindAverage(double num1, double num2, double num3, double num4, double num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public void calculateAverage() {
        double average = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println(String.format("The average of %s, %s, %s, %s, %s is: %s", num1, num2, num3, num4, num5, average));
    }
}
