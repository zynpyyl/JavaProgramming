package day42_Exceptions;

class FadyException extends RuntimeException{
    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message) {
        super(message);
    }
}

public class CustomExceptions extends RuntimeException {
    public static void main(String[] args) {
        //throw new FadyException();
        throw new FadyException("Its time for lunch break");

    }
}
