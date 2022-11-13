package com.example.myquizapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.R.id;
import android.view.View.OnClickListener;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myquizapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button optA,optB,optC,optD;
        TextView tv;

        optA = findViewById(R.id.option_a);
        optB = findViewById(R.id.option_b);
        optC = findViewById(R.id.option_c);
        optD = findViewById(R.id.option_d);

        tv = findViewById(R.id.question);

        String [] answers = {"false","false","false","false","false","false","false","false","false","false"};
        String[] questions ={"What is 2 * 3 ?","What is 5 + 7 ?","What is 12 - 5 ?","What is 18 / 2 ?","What is 2 ^ 3 ?","what log2(32) ?"
        ,"What is value of x when 2x + 3x = 35 ?"};
        int [] ans_0 = {4,5,6,10};
        int [] ans_1 = {5,7,10,12};
        int [] ans_2 = {5,7,10,12};
        int [] ans_3 = {6,9,12,15};
        int [] ans_4 = {2,3,5,8};
        int [] ans_5 = {2,5,8,32};
        int [] ans_6 = {5,6,7,8};




//        Button btn_question;
//        btn_question = findViewById(R.id.startQuestion);
//
//        btn_question.setOnClickListener(new View.OnClickListener(){
//
//            public void startQuiz(View view){
//
//        }
//        });


//        btnAdd =findViewById(R.id.buttonIncrement);
//        textView = findViewById(R.id.textCount);

//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                value++;
//                textView.setText(Integer.toString(value));
//            }
//        });
    }
}


