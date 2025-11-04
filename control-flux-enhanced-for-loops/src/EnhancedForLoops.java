import java.util.List;
import java.util.Arrays;

public class EnhancedForLoops {
    public static void main(String[] args) {
        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19 };

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }

        int[] randomNumbers = { 23, 51, 72, 84, 1, 60, 34, 102 };

        for(int randomNumber : randomNumbers) {
            if(randomNumber > 50) {
                System.out.println(randomNumber);
            } 
        }
    }
}
