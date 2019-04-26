package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main20Activity extends AppCompatActivity {

    RadioGroup radioGrpQ2;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        radioGrpQ2 = findViewById(R.id.RadioGroupQ2);
        btnContinue = findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity21();
            }
        });

    }
    private void openActivity21() {
        Intent intent = new Intent(this, Main21Activity.class);
        startActivity(intent);
    }
}
