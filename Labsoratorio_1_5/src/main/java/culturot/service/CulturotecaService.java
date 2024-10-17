package culturoteca.service;

import java.util.List;
import culturoteca.model.Video;
import culturoteca.model.View;

public interface CulturotecaService {

    public List<Video> listAll();
    public Video add(Video video);
    public View add(View view);

}
