package practice.javaPro.MockSpy;

public class ZeroSubscribersException extends RuntimeException {
    public ZeroSubscribersException() {
    }

    public ZeroSubscribersException(String message) {
        super(message);
    }
}
