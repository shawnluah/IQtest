package sg.edu.rp.c346.iqtest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class Main10Activity extends AppCompatActivity {


    ImageButton imgBtnAns1;
    ImageButton imgBtnAns2;
    ImageButton imgBtnAns3;
    ImageButton imgBtnAns4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        imgBtnAns1 = findViewById(R.id.imageButtonAns1);
        imgBtnAns2 = findViewById(R.id.imageButtonAns2);
        imgBtnAns3 = findViewById(R.id.imageButtonAns3);
        imgBtnAns4 = findViewById(R.id.imageButtonAns4);


        Integer totalMarks = 0;

        imgBtnAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();

            }
        });
        imgBtnAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });
        imgBtnAns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });
        imgBtnAns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });


    }



    private void openActivity11() {
        Intent intent = new Intent(this, Main11Activity.class);
        startActivity(intent);
    }
}
