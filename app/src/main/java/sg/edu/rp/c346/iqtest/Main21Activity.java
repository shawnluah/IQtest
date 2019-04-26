package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main21Activity extends AppCompatActivity {

    RadioGroup radioGrpQ3;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        radioGrpQ3 = findViewById(R.id.RadioGroupQ3);
        btnContinue = findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity22();
            }
        });

    }
    private void openActivity22() {
        Intent intent = new Intent(this, Main22Activity.class);
        startActivity(intent);
    }
}
