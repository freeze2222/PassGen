package com.example.passgen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=findViewById(R.id.textView);
        final Button Button=findViewById(R.id.button);
        final CheckBox checkNum=findViewById(R.id.checkNum);
        final CheckBox checkABC=findViewById(R.id.checkABC);
        final CheckBox checkSpecial=findViewById(R.id.checkSpecial);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkABC.isChecked()) {
                    Character[] pass = new Character[8];
                    double c;
                    Character character;
                    for (int i = 0; i < 8; i++) {
                        c = (int) (1040 + ((Math.random()) * 10));

                        System.out.println(c);
                        character = (char) c;
                        pass[i] = character;
                    }
                    textView.setText(Arrays.toString(pass).replace(",", ""));
                } else if (checkNum.isChecked() && checkSpecial.isChecked()) {
                    Character[] pass = new Character[8];
                    double c;
                    Character character;
                    for (int i = 0; i < 8; i++) {
                        c = (int) (32 + ((Math.random()) * 30));

                        System.out.println(c);
                        character = (char) c;
                        pass[i] = character;
                    }
                    textView.setText(Arrays.toString(pass).replace(",", ""));

                }

            }

        });
    }
}

