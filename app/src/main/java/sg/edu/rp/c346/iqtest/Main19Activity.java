package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main19Activity extends AppCompatActivity {

    RadioGroup radioGrpQ1;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        radioGrpQ1 = findViewById(R.id.RadioGroupQ1);
        btnContinue = findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity20();
            }
        });

    }
    private void openActivity20() {
        Intent intent = new Intent(this, Main20Activity.class);
        startActivity(intent);
    }
}
