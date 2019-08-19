package smoothpineapple.com.watchlist.database.dao;

import java.util.List;

import androidx.room.Query;
import smoothpineapple.com.watchlist.database.models.GenreTable;

public class GenreTableDAO implements IMediaTableDAO<GenreTable> {
    @Query("SELECT * FROM genre_table")
    List<GenreTable> getGenreTableList() { return null; }

    @Override
    public void insert(GenreTable tableData) {}

    @Override
    public void update(GenreTable tableData) {}

    @Override
    public void delete(GenreTable tableData) {}
}
