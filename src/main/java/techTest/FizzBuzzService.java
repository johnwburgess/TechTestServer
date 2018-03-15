package techTest;

// Simple FizzBuzz service class that provides a method to return the appropriate Fizz/Buzz/FizzBuzz string
public class FizzBuzzService {
    public String getFizzBuzz(Integer inputInteger) {
        boolean isDivisibleBy3 = (0 == inputInteger % 3);
        boolean isDivisibleBy5 = (0 == inputInteger % 5);

        if (isDivisibleBy3) {
            if (isDivisibleBy5) {
                return "FizzBuzz";
            }
            else {
                return "Fizz";
            }
        } else if (isDivisibleBy5) {
            return "Buzz";
        }
        return inputInteger.toString();
    }
}
