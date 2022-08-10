package uz.gita.mantiqiysavollartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btn_start).setOnClickListener(view -> {
            CategoryActivity.start(this);
//            GameActivity.start(this);
        });

        findViewById(R.id.btn_about).setOnClickListener(view -> {
            AboutActivity.start(this);
        });

        findViewById(R.id.btn_exit).setOnClickListener(view -> {
            finish();
        });
    }
}