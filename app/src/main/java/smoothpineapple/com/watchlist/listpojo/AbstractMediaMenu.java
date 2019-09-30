package smoothpineapple.com.watchlist.listpojo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import smoothpineapple.com.watchlist.adapters.MediaAdapter;
import smoothpineapple.com.watchlist.events.InterfaceEventManager;

public abstract class AbstractMediaMenu {
    private Activity m_parentActivity;
    private ListView m_listView;

    public AbstractMediaMenu(Activity activity, ListView listView) {
        m_parentActivity = activity;
        m_listView = listView;
        
    }

    protected Activity getParentActivity() {
        return m_parentActivity;
    }
    protected ListView getListView() {
        return m_listView;
    }

    protected MediaAdapter createAdapter(Object items) {
        List<MediaItem> mediaItems = new ArrayList<>();

        if(items instanceof List) {
            List<Object> itemList = (List<Object>)items;
            for (Object item : itemList) {
                if (item instanceof String) {
                    String name = (String)item;

                    MediaItem mediaItem = new MediaItem(name, null, "");
                    mediaItems.add(mediaItem);
                } else if (item instanceof MediaItem) {
                    mediaItems.add((MediaItem) item);
                }
            }
        } else if(items instanceof Map) {
            Map<Object, Object> itemMap = (Map<Object, Object>) items;
            Iterator itemIt = itemMap.entrySet().iterator();

            while(itemIt.hasNext()) {
                Map.Entry item = (Map.Entry)itemIt.next();
                if(item.getKey() instanceof  String) {
                    String name = (String)item.getKey();
                    if(item.getValue() instanceof Drawable) {
                        Drawable image = (Drawable) item.getValue();

                        MediaItem mediaItem = new MediaItem(name, image, "");
                        mediaItems.add(mediaItem);
                    }
                }
            }
        }
        return new MediaAdapter(m_parentActivity, mediaItems);
    }

    protected void setAdapter(MediaAdapter adapter) throws NullPointerException {
        if(m_listView == null) { throw new NullPointerException(); }
        m_listView.setAdapter(adapter);
    }

    protected abstract void setClickListener(ListView clickableView, final InterfaceEventManager callBack) ;
}
