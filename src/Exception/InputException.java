package Exception;

public class InputException extends RuntimeException{
    public InputException(){
        super("다시 입력해주세요");
    }
    public InputException(String message) {
        super(message);
    }
}
