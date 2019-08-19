package smoothpineapple.com.watchlist.database.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "media_genre_table", foreignKeys = {
        @ForeignKey(entity = MediaTable.class, parentColumns = "id", childColumns = "media_id"),
        @ForeignKey(entity = GenreTable.class, parentColumns = "id", childColumns = "genre_id")
})
public class MediaGenreTable implements ITable {
    @ColumnInfo(name = "media_id")
    private int m_media_id;

    @ColumnInfo(name = "genre_id")
    private String m_genre_id;
}
