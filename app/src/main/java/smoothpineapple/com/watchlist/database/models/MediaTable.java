package smoothpineapple.com.watchlist.database.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "media_table")
public final class MediaTable implements ITable{
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "played")
    private String played;

    @ColumnInfo(name = "runtime")
    private int runtime;

    @ColumnInfo(name = "tagline")
    private String tagline;

    @ColumnInfo(name = "rating")
    private int rating;

    @ColumnInfo(name = "age")
    private String age;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "year")
    private int year;

    @ColumnInfo(name = "imdb_path")
    private String imdb_path;

    @ColumnInfo(name = "poster_path")
    private String poster_path;

    @ColumnInfo(name = "media_path")
    private String media_path;

    public MediaTable(int id, String title, String played, int runtime, String tagline, int rating, String age,
                      String description, int year, String imdb_path, String poster_path, String media_path) {
        this.id = id;
        this.title = title;
        this.played = played;
        this.runtime = runtime;
        this.tagline = tagline;
        this.rating = rating;
        this.age = age;
        this.description = description;
        this.year = year;
        this.imdb_path = imdb_path;
        this.poster_path = poster_path;
        this.media_path = media_path;
    }

}
