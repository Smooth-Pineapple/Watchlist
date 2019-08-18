package smoothpineapple.com.watchlist.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
import smoothpineapple.com.watchlist.database.models.ITable;

@Dao
public interface IMediaTableDAO<T extends ITable> {
    @Insert
    void insert(T tableData);

    @Update
    void update(T tableData);

    @Delete
    void delete(T tableData);
}
