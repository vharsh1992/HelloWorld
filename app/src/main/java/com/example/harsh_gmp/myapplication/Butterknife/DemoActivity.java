package com.example.harsh_gmp.myapplication.Butterknife;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.harsh_gmp.myapplication.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindAnim;
import butterknife.BindBitmap;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindFont;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @ Java doc comment
 */

public class DemoActivity extends AppCompatActivity {

    final public static String TAG = DemoActivity.class.getSimpleName();
    @BindView(R.id.lbl_title)
    TextView lblTitle;
    @BindView(R.id.input_name)
    EditText inputName;
    @BindString(R.string.toast_text)
    String toastText;

    @BindColor(R.color.colorPrimaryDark)
    int colorPrimary;

    @BindDimen(R.dimen.layout_padding)
    float paddingLayout;

    @BindAnim(R.anim.demo)
    Animation animMoveUp;

    @BindBitmap(R.mipmap.ic_launcher)
    Bitmap logo;

    @BindDrawable(R.drawable.ic_launcher_background)
    Drawable background;

    @BindString(R.string.url)
    String serverUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ButterKnife.bind(this);

        getCurrentTime();

        Log.i(TAG, toastText);
        Log.i(TAG, serverUrl);
    }

    @OnClick(R.id.btn_enter)
    void onClick() {
        Toast.makeText(DemoActivity.this, inputName.getText().toString(), Toast.LENGTH_LONG).show();
    }


    public void getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        Date currentLocalTime = cal.getTime();

        DateFormat date = new SimpleDateFormat("HH:mm a");

        String localTime = date.format(currentLocalTime);

        Log.i(TAG, localTime);
    }
}
