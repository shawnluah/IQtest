package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main14Activity extends AppCompatActivity {

    RadioGroup radiogrpQuestion3;
    RadioGroup radiogrpQuestion4;
    Button btnContinue;
    Button btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        radiogrpQuestion3 = findViewById(R.id.RadioGroupQ3);
        radiogrpQuestion4 = findViewById(R.id.RadioGroupQ4);
        btnContinue = findViewById(R.id.buttonContinue);
        btnPrevious = findViewById(R.id.buttonPrevious);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }
        });
    }


    private void openActivity15() {
        Intent intent = new Intent(this, Main15Activity.class);
        startActivity(intent);
    }
    private void openActivity13() {
        Intent intent = new Intent(this, Main13Activity.class);
        startActivity(intent);
    }
}
