package exceptions;

public class UserNotFoundException extends Exception{ // come l'altra exception
    public UserNotFoundException(String message) {
        super(message);
    }
}
