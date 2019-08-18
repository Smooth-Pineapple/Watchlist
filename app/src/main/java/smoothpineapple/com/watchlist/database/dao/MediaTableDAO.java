package smoothpineapple.com.watchlist.database.dao;

import java.util.List;
import androidx.room.Query;
import smoothpineapple.com.watchlist.database.models.ITable;
import smoothpineapple.com.watchlist.database.models.MediaTable;

public class MediaTableDAO implements IMediaTableDAO<MediaTable> {
    @Query("SELECT * FROM media_table")
    List<ITable> getMediaTableList() {
        return null;
    }

    @Override
    public void insert(MediaTable tableData) {}

    @Override
    public void update(MediaTable tableData) {}

    @Override
    public void delete(MediaTable tableData) {}
}
