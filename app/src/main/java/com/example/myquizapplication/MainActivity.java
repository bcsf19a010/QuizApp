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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


