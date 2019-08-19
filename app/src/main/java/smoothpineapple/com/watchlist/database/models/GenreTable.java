package smoothpineapple.com.watchlist.database.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "genre_table")
public class GenreTable implements ITable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int m_id;

    @ColumnInfo(name = "genre")
    private String m_genre;

    public GenreTable(int m_id, String m_genre) {
        this.m_id = m_id;
        this.m_genre = m_genre;
    }
}
