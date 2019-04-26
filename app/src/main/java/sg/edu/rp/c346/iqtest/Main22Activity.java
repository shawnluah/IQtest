package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main22Activity extends AppCompatActivity {

    RadioGroup radioGrpQ4;
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        radioGrpQ4 = findViewById(R.id.RadioGroupQ4);
        btnContinue = findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity23();
            }
        });

    }
    private void openActivity23() {
        Intent intent = new Intent(this, Main23Activity.class);
        startActivity(intent);
    }
}
