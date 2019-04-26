package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main16Activity extends AppCompatActivity {

    RadioGroup radiogrpQuestion7;
    RadioGroup radiogrpQuestion8;
    Button btnContinue;
    Button btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        radiogrpQuestion7 = findViewById(R.id.RadioGroupQ7);
        radiogrpQuestion8 = findViewById(R.id.RadioGroupQ8);
        btnContinue = findViewById(R.id.buttonContinue);
        btnPrevious = findViewById(R.id.buttonPrevious);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity17();
            }
        });
    }

    private void openActivity17() {
        Intent intent = new Intent(this, Main17Activity.class);
        startActivity(intent);
    }
    private void openActivity15() {
        Intent intent = new Intent(this, Main15Activity.class);
        startActivity(intent);
    }
}
