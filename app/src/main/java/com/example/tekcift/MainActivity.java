package com.example.tekcift;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button ciftButton;
    Button tekButton;
    Button tumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciftButton = findViewById(R.id.button_cift);
        tekButton = findViewById(R.id.button_tek);
        tumButton = findViewById(R.id.button_tum);
        editText = findViewById(R.id.editTextText);

        ciftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ciftSayilar(view);
            }
        });
        tekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekSayilar(view);
            }
        });
        tumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tumSayilar(view);
            }
        });


    }

    public void ciftSayilar(View view){
        editText.setText("");
        for (int a=0; a<=15;a++) {
            if(a%2==0){
                editText.setText( editText.getText()+ "\n" +a + "\n");
            }
        }
    }

    public void tekSayilar(View view) {
        editText.setText("");
        for (int h=0;h<=15;h++){
            if (h%2!=0) {
                editText.setText(editText.getText()+ "\n"+h + "\n");
            }
        }
    }

    public void tumSayilar(View view) {
        editText.setText("");
        for (int f=0;f<=15;f++){
                editText.setText(editText.getText()+ "\n"+f + "\n");
        }

    }
}