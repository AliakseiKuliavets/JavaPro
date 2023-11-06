package lesson.lesson21.mockEx;

public class CreateTradeException extends RuntimeException{
    public CreateTradeException(){
        super("Cannot create trade");
    }
}
