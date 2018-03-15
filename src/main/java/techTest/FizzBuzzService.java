package techTest;

// Simple FizzBuzz service class that provides a method to return the appropriate Fizz/Buzz/FizzBuzz string
public class FizzBuzzService {
    public String getFizzBuzz(Integer inputInteger) {

        // NB input not tested for <= 0
        // A future requirement may be to validate inputs - this would be done in a separate validator class
        // that throws an application-specific exception
        // It is suggested that an exception handler is configured to catch all application exceptions and translate them
        // into appropriate HHTP status codes and error json message (NB standard practice is to remove all sensitive information)
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
