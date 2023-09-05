package cs301.birthdaycake;

import android.app.Activity;
import android.content.pm.ActivityInfo;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.birthdaycake2.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }
}
