package smoothpineapple.com.watchlist.listpojo;

import android.graphics.drawable.Drawable;

public class MediaItem {
    private Drawable m_cover;
    private String m_name;
    private String m_description;

    public MediaItem(String name, Drawable cover, String description) {
        setCover(cover);
        setName(name);
        setDescription(description);
    }

    public void setCover(Drawable cover) {
        m_cover = cover;
    }

    public Drawable getCover() {
        return m_cover;
    }

    public void setName(String name) {
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public void setDescription(String description) {
        m_description = description;
    }

    public String getDescription() {
        return m_description;
    }
}
