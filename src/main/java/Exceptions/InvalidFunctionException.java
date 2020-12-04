package Exceptions;

public class InvalidFunctionException extends ArithmeticException{

    public InvalidFunctionException(){
        super();
    }
    public InvalidFunctionException(String message){
        super(message);
    }
}
