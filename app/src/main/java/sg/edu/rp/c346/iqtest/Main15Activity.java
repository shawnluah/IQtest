package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main15Activity extends AppCompatActivity {

    RadioGroup radiogrpQuestion5;
    RadioGroup radiogrpQuestion6;
    Button btnContinue;
    Button btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        radiogrpQuestion5 = findViewById(R.id.RadioGroupQ5);
        radiogrpQuestion6 = findViewById(R.id.RadioGroupQ6);
        btnContinue = findViewById(R.id.buttonContinue);
        btnPrevious = findViewById(R.id.buttonPrevious);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });
    }

    private void openActivity16() {
        Intent intent = new Intent(this, Main16Activity.class);
        startActivity(intent);
    }
    private void openActivity14() {
        Intent intent = new Intent(this, Main14Activity.class);
        startActivity(intent);
    }
}
