public class SumOfEvenNumbersLessThanEight {
    static void sumEvenNumbers() {
        int sum = 0;
        for(int i = 0; i < 8; i++) {
            
            if(i % 2 == 1) {
                continue;
            }
            sum +=i;
        }
        System.out.println(String.format("The sum of even numbers less than 8 is: %s", sum));
    } 

}
