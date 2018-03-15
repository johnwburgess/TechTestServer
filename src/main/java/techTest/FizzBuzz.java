package techTest;

// POJO to represent the response to the getFizzBuzz REST api call
// Will be serialized as JSON by default
public class FizzBuzz {

    private final String content;

    public FizzBuzz(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
