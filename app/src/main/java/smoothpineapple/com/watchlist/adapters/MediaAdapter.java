package smoothpineapple.com.watchlist.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import smoothpineapple.com.watchlist.R;
import smoothpineapple.com.watchlist.listpojo.MediaItem;

public class MediaAdapter extends ArrayAdapter<MediaItem> {
    private Context m_context;
    private List<MediaItem> m_mediaItems;

    public MediaAdapter(Context context, List<MediaItem> mediaItems) {
        super(context, 0, mediaItems);

        m_context = context;
        m_mediaItems = mediaItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewItem = convertView;

        if(viewItem == null) {
            viewItem = LayoutInflater.from(m_context).inflate(R.layout.media_item, parent, false);
        }

        MediaItem mediaItem = m_mediaItems.get(position);

        ImageView mediaPoster = viewItem.findViewById(R.id.mediaPoster);
        if(mediaPoster == null) {
            Log.e(this.getClass().getName(), "Error inflating Media Poster");
            return null;
        }
        mediaPoster.setImageDrawable(mediaItem.getCover());

        TextView mediaName = viewItem.findViewById(R.id.mediaName);
        if(mediaName == null) {
            Log.e(this.getClass().getName(), "Error inflating Media Name");
            return null;
        }
        mediaName.setText(mediaItem.getName());

        TextView mediaDescription = viewItem.findViewById(R.id.mediaDescription);
        if(mediaDescription == null) {
            Log.e(this.getClass().getName(), "Error inflating Media Description");
            return null;
        }
        mediaDescription.setText(mediaItem.getDescription());

        return viewItem;
    }
}
