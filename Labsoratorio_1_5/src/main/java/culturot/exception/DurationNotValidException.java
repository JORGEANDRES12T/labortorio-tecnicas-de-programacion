package culturoteca.exception;

public class DurationNotValidException extends CulturotecaException {
    public DurationNotValidException(String title, Double duration) {
        super("The duration "  + duration + " for the video " + title + " is not valid");
    }
}
