package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {

    Button btnIQTest;
    Button btnJobTest;
    Button btnPersosnalityTest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnIQTest = findViewById(R.id.buttonIQ);
        btnJobTest = findViewById(R.id.buttonJob);
        btnPersosnalityTest = findViewById(R.id.buttonPersonality);

        btnIQTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        btnJobTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        });

        btnPersosnalityTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity19();
            }
        });



    }



    private void openActivity13() {
        Intent intent = new Intent(this, Main13Activity.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    private void openActivity19() {
        Intent intent = new Intent(this, Main19Activity.class);
        startActivity(intent);
    }
}
