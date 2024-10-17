package culturoteca.exception;

public class VideoNotFoundException extends CulturotecaException {
    public VideoNotFoundException() {
        super("Video not found");
    }
    public VideoNotFoundException(String title) {
        super("The video " + title + " was not found");
    }
}
