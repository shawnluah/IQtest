package sg.edu.rp.c346.iqtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Main17Activity extends AppCompatActivity {

    RadioGroup radiogrpQuestion9;
    RadioGroup radiogrpQuestion10;
    Button btnFinish;
    Button btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        radiogrpQuestion9 = findViewById(R.id.RadioGroupQ9);
        radiogrpQuestion10 = findViewById(R.id.RadioGroupQ10);
        btnFinish = findViewById(R.id.buttonFinish);
        btnPrevious = findViewById(R.id.buttonPrevious);

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity18();
            }
        });
    }

    private void openActivity18() {
        Intent intent = new Intent(this, Main18Activity.class);
        startActivity(intent);
    }
    private void openActivity16() {
        Intent intent = new Intent(this, Main16Activity.class);
        startActivity(intent);
    }
}
