package smoothpineapple.com.watchlist.database.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "media_table")
public final class MediaTable implements ITable{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int m_id;

    @ColumnInfo(name = "title")
    private String m_title;

    @ColumnInfo(name = "played")
    private String m_played;

    @ColumnInfo(name = "runtime")
    private int m_runtime;

    @ColumnInfo(name = "tagline")
    private String m_tagline;

    @ColumnInfo(name = "rating")
    private int m_rating;

    @ColumnInfo(name = "age")
    private String m_age;

    @ColumnInfo(name = "description")
    private String m_description;

    @ColumnInfo(name = "year")
    private int m_year;

    @ColumnInfo(name = "imdb_path")
    private String m_imdb_path;

    @ColumnInfo(name = "poster_path")
    private String m_poster_path;

    @ColumnInfo(name = "media_path")
    private String m_media_path;

    public MediaTable(int id, String title, String played, int runtime, String tagline, int rating, String age,
                      String description, int year, String imdb_path, String poster_path, String media_path) {
        this.m_id = id;
        this.m_title = title;
        this.m_played = played;
        this.m_runtime = runtime;
        this.m_tagline = tagline;
        this.m_rating = rating;
        this.m_age = age;
        this.m_description = description;
        this.m_year = year;
        this.m_imdb_path = imdb_path;
        this.m_poster_path = poster_path;
        this.m_media_path = media_path;
    }

}
