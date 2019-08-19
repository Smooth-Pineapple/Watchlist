package smoothpineapple.com.watchlist.database.dao;

import java.util.List;

import androidx.room.Query;
import smoothpineapple.com.watchlist.database.models.MediaGenreTable;

public class MediaGenreTableDAO implements IMediaTableDAO<MediaGenreTable> {
    @Query("SELECT * FROM media_genre_table")
    List<MediaGenreTable> getMediaGenreTableList() { return null; }

    @Override
    public void insert(MediaGenreTable tableData) {}

    @Override
    public void update(MediaGenreTable tableData) {}

    @Override
    public void delete(MediaGenreTable tableData) {}
}
