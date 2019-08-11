package smoothpineapple.com.watchlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import smoothpineapple.com.watchlist.listpojo.AbstractMediaMenu;
import smoothpineapple.com.watchlist.listpojo.CategoryMenu;

public class CategoryMenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_menu);

        Intent categoryMenuIntent = getIntent();

        AbstractMediaMenu categoryMenu = new CategoryMenu(this);
    }
}
