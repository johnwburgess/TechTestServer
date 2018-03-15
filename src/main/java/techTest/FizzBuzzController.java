package techTest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// FizzBuzz controller that delegates all calls to the FizzBuzzService
// The service could e packaged separately and used elsewhere
@RestController
public class FizzBuzzController {

    // GET API that handles a query string parameter
    @RequestMapping("/fizzbuzz")
    public FizzBuzz fizzBuzzParam(@RequestParam(value="inputInteger") Integer inputInteger) {
        FizzBuzzService service = new FizzBuzzService();
        return new FizzBuzz(
                service.getFizzBuzz(inputInteger));
    }

    // GET API that handles a path variable parameter
    @RequestMapping("/fizzbuzz/{inputInteger}")
    public FizzBuzz fizzBuzzPath(@PathVariable(value="inputInteger") Integer inputInteger) {
        FizzBuzzService service = new FizzBuzzService();
        return new FizzBuzz(
                service.getFizzBuzz(inputInteger));
    }
}
