package uz.gita.mantiqiysavollartest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import uz.gita.mantiqiysavollartest.AppController.AppController;
import uz.gita.mantiqiysavollartest.model.TestData;

public class GameActivity extends AppCompatActivity {
    TextView questionTest;

    TextView questionNum; // bunga set qilish kerak pos
    int pos; // 0 dan boshlanadi
    int limitGivenQues = 10;
    int category;

    List<AppCompatButton> choices = new ArrayList<>(4); // A B C D
    AppCompatButton choiceA;
    AppCompatButton choiceB;
    AppCompatButton choiceC;
    AppCompatButton choiceD;
    AppCompatButton btnNext;

    AppController controller = AppController.getInstance();
    TestData tempData;

    AppCompatButton myAnswer;

    int correctAnswers;
    int incorrectAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        category = intent.getIntExtra("category", 1);

        findViewById(R.id.btn_back).setOnClickListener(view -> {
            onBackPressed();
        });

        controller.shuffle(category);
        loadViews();
        loadData();


    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        View view = LayoutInflater.from(GameActivity.this).inflate(R.layout.dialog_exit, null);
        TextView title = view.findViewById(R.id.title);
        title.setVisibility(View.GONE);
        AlertDialog dialog = new AlertDialog.Builder(GameActivity.this)
                .setView(view)
                .setCancelable(false)
                .create();

        dialog.show();

        view.findViewById(R.id.buttonHa).setOnClickListener(view1 -> {
            finish();
        });

        view.findViewById(R.id.buttonYoq).setOnClickListener(view1 -> {
            dialog.dismiss();
        });

    }

    private void loadData() {
        if (pos == limitGivenQues) {
            finishTest();
            return;
        }

        tempData = controller.getTestDataInPos(category, pos++);
        questionNum.setText(pos + "/" + limitGivenQues);

        questionTest.setText(tempData.getQuestion());

        choiceA.setText(tempData.getVariantA());
        choiceB.setText(tempData.getVariantB());
        choiceC.setText(tempData.getVariantC());
        choiceD.setText(tempData.getVariantD());

        btnNext.setEnabled(false);
    }

    private void loadViews() {
        questionTest = findViewById(R.id.questionTest);
        questionNum = findViewById(R.id.questionNumber);

        choiceA = findViewById(R.id.variant_a);
        choiceB = findViewById(R.id.variant_b);
        choiceC = findViewById(R.id.variant_c);
        choiceD = findViewById(R.id.variant_d);

        choices.add(choiceA);
        choices.add(choiceB);
        choices.add(choiceC);
        choices.add(choiceD);

        for (int i = 0; i < choices.size(); i++) {
            choices.get(i).setOnClickListener(view -> {
                if(myAnswer != null && !myAnswer.equals(view)){
                    myAnswer.setBackgroundResource(R.drawable.btn_variant);
                }
                myAnswer = (AppCompatButton)view;
                view.setBackgroundResource(R.drawable.btn_variant_selected);
                btnNext.setEnabled(true);
            });
        }

        btnNext = findViewById(R.id.btn_next);

        btnNext.setOnClickListener(view -> {
            checkChoice();
            clearSelections();
            loadData();
        });
    }

    private void clearSelections() {
        for(AppCompatButton choice : choices){
            choice.setBackgroundResource(R.drawable.btn_variant);
        }
    }

    private void checkChoice() {
        String ans = (String) myAnswer.getText();
//        Log.w("TTT", ""+this.getResources().getString(tempData.getAnswer()).equals(ans));
        if(this.getResources().getString(tempData.getAnswer()).equals(ans)){
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
    }

    private void finishTest() {
        View view = LayoutInflater.from(GameActivity.this).inflate(R.layout.dialog_exit, null);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(view)
                .setCancelable(false)
                .create();

        TextView title = view.findViewById(R.id.title);
        TextView text = view.findViewById(R.id.text);
        AppCompatButton buttonHa = view.findViewById(R.id.buttonHa);
        AppCompatButton buttonYoq = view.findViewById(R.id.buttonYoq);

        title.setVisibility(View.VISIBLE);
        text.setText("To'g'ri javoblar soni: " + correctAnswers + "\n" + "Xato javoblar soni: " + incorrectAnswers);
        buttonHa.setText("Qaytadan boshlash");
        buttonYoq.setText("Yakunlash");

        dialog.show();

        buttonYoq.setOnClickListener(view1 -> {
            dialog.dismiss();
            finish();
        });

        buttonHa.setOnClickListener(view1 -> {
            correctAnswers = 0;
            incorrectAnswers = 0;
            pos = 0;
            controller.shuffle(category);
            clearSelections();
            loadData();
            dialog.dismiss();
        });
    }

    public static void start(Activity activity){
        Intent intent = new Intent(activity, GameActivity.class);
        activity.startActivity(intent);
    }
}