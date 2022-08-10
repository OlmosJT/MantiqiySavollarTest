package uz.gita.mantiqiysavollartest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        findViewById(R.id.btn_back).setOnClickListener(view -> {
            onBackPressed();
        });
    }

    public static void start(Activity activity){
        Intent intent = new Intent(activity, AboutActivity.class);
        activity.startActivity(intent);
    }
}