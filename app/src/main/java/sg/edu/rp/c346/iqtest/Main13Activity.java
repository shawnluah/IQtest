package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main13Activity extends AppCompatActivity {

    RadioGroup radiogrpQuestion1;
    RadioGroup radiogrpQuestion2;
    RadioButton radiobtnQuestion1Ans1;
    RadioButton radiobtnQuestion1Ans2;
    RadioButton radiobtnQuestion2Ans1;
    RadioButton radiobtnQuestion2Ans2;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        radiogrpQuestion1 = findViewById(R.id.RadioGroupQ1);
        radiogrpQuestion2 = findViewById(R.id.RadioGroupQ2);
        radiobtnQuestion1Ans1 = findViewById(R.id.radioButtonQuestion1Ans1);
        radiobtnQuestion1Ans2 = findViewById(R.id.radioButtonQuestion1Ans2);
        radiobtnQuestion2Ans1 = findViewById(R.id.radioButtonQuestion2Ans1);
        radiobtnQuestion2Ans2 = findViewById(R.id.radioButtonQuestion2Ans2);
        btnContinue = findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });
    }

    private void openActivity14() {
        Intent intent = new Intent(this, Main14Activity.class);
        startActivity(intent);
    }
}
