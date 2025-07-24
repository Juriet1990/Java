package exceptions;

public class UserAlreadyExistsException extends Exception{ // ereditarietà classe exception

    public UserAlreadyExistsException(String message) {
        super(message);
    } // chiama la super classe e passa il messaggio
}
