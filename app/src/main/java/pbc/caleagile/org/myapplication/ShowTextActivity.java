package pbc.caleagile.org.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class ShowTextActivity extends AppCompatActivity {

    public final static String KEY_EXTRA_MESSAGE =
            "com.example.android.testing.espresso.basicsample.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_text);


        Intent intent = getIntent();
        //String message = Strings.nullToEmpty(intent.getStringExtra(KEY_EXTRA_MESSAGE));
        String message = intent.getStringExtra(KEY_EXTRA_MESSAGE);

        ((TextView) findViewById(R.id.show_text_view)).setText(message);


    }

    static protected Intent newStartIntent(Context context, String message) {
        Intent newIntent = new Intent(context, ShowTextActivity.class);
        newIntent.putExtra(KEY_EXTRA_MESSAGE, message);
        return newIntent;
    }

}
