package smoothpineapple.com.watchlist.listpojo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

import smoothpineapple.com.watchlist.MediaListActivity;
import smoothpineapple.com.watchlist.R;
import smoothpineapple.com.watchlist.adapters.MediaAdapter;
import smoothpineapple.com.watchlist.events.InterfaceEventManager;

public class CategoryMenu extends AbstractMediaMenu{
    public CategoryMenu(Activity activity) {
        super(activity, (ListView)activity.findViewById(R.id.categoryList));

        setClickListener(getListView(), new InterfaceEventManager() {
            @Override
            public void onEvent(View parent, Object clickedItem) {
                Intent categoryIntent = new Intent(getParentActivity().getApplicationContext(), MediaListActivity.class);
                getParentActivity().startActivity(categoryIntent);
            }
        } );

        Map<String, Drawable> categoryMap = new HashMap<>();
        String[] categoryNames = activity.getResources().getStringArray(R.array.categories);

        for(String categoryName : categoryNames) {
            Drawable drawable = activity.getResources().getDrawable(activity.getResources().getIdentifier(categoryName, "drawable", activity.getPackageName()));
            if(drawable != null) {
                categoryMap.put(categoryName, drawable);
            }
        }

        MediaAdapter adapter = createAdapter(categoryMap);
        setAdapter(adapter);
    }

    @Override
    protected void setClickListener(ListView clickableView, final InterfaceEventManager callBack) {
        clickableView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object clickedItem = parent.getItemAtPosition(position);
                if(clickedItem instanceof MediaItem) {
                    callBack.onEvent(parent, clickedItem);
                }
            }
        });
    }
}
