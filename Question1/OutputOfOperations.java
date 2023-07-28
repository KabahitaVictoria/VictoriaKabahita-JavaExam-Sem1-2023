public class OutputOfOperations {
    static void printOutput() {
        // 1 iii) a)
        double output1 = -5 + 8 * 6;
        System.out.println(String.format("The output of -5 + 8 * 6 is: %s", output1));

        // 1) iii) b)
        double output2 = (55 + 9) % 9;
        System.out.println("The output of (55 + 9) % 9 is: " + output2);

        // 1) iii) c)
        double output3 = 20 + -3 * 5 / 8;
        System.out.println(String.format("The output of 20 + -3 * 5 / 8 is: %s", output3));

        // 1) iii) d)
        double output4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("The output of 5 + 15 / 3 * 2 - 8 % 3 is: " + output4);
    }
}
