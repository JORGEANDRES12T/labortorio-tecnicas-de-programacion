package culturoteca.repository;

import java.util.List;

import culturoteca.model.Video;

public interface VideoRepository {

    List<Video> findAll();

    Video save(Video video);

    List<Video> find(String title);

    List<Video> find(Double fromDuration, Double toDuration);

}
