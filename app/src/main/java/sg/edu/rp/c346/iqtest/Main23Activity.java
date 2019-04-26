package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main23Activity extends AppCompatActivity {

    RadioGroup radioGrpQ5;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        radioGrpQ5 = findViewById(R.id.RadioGroupQ5);
        btnFinish = findViewById(R.id.buttonFinish);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity24();
            }
        });

    }
    private void openActivity24() {
        Intent intent = new Intent(this, Main24Activity.class);
        startActivity(intent);
    }
}
