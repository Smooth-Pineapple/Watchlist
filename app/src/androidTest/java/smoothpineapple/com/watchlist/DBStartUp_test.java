package smoothpineapple.com.watchlist;

import android.app.PendingIntent;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DBStartUp_test {
    @Rule
    public final ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void DBSetupTimeLimit() throws InterruptedException {
        MainActivity mainActivity = mainActivityRule.getActivity();
        assertNotNull(mainActivity);

        Thread.sleep(5000);
        assertTrue("DB should have loaded and closed MainActivity", mainActivity.isFinishing());
    }
}
