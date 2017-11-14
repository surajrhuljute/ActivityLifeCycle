package nareshit.com.activitylifecycle;
import nareshit.com.activitylifecycle.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;



/**
 * Created by nareshit on 6/8/2017.
 */

public class ActivityLifecycle extends Activity {

    private static final String TAG = "Activity Life cycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.e(TAG, "onCreate called");
        Toast.makeText(this,"onCreate called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart called");
        Toast.makeText(this,"onStart called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume called");
        Toast.makeText(this,"onResume called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause called");
        Toast.makeText(this,"onPause called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop called");
        Toast.makeText(this,"onStop called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy called");
        Toast.makeText(this,"onDestroy called",Toast.LENGTH_LONG).show();

    }
}
