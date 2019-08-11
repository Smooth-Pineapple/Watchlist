package smoothpineapple.com.watchlist.messaging;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class NotifyUser {
    /**
     * int msgLength: <br/>
     * * 0 = Long <br/>
     * * -1 = Short <br/>
     * * -2 = Indefinite
     */
    public static void Snackbar(View view, String msg, int msgLength) {
        Snackbar.make(view, msg, msgLength).show();
    }

    /**
     * int msgLength: <br/>
     * * 0 = Long <br/>
     * * -1 = Short <br/>
     * * -2 = Indefinite
     */
    public static void Toast(Context context, String msg, int msgLength) {
        Toast.makeText(context, msg, msgLength).show();
    }
}
