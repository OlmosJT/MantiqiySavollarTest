package uz.gita.mantiqiysavollartest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        findViewById(R.id.categotyLogic).setOnClickListener(view -> {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("category", 1);
            startActivity(intent);
        });

        findViewById(R.id.categotyMath).setOnClickListener(view -> {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("category", 2);
            startActivity(intent);
        });

        findViewById(R.id.categotyPhysics).setOnClickListener(view -> {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("category", 3);
            startActivity(intent);
        });

        findViewById(R.id.categotyChemistry).setOnClickListener(view -> {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("category", 4);
            startActivity(intent);
        });

    }

    public static void start(Activity activity) {
        Intent intent = new Intent(activity, CategoryActivity.class);
        activity.startActivity(intent);
    }
}