package sg.edu.rp.c346.id20047778.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnChecked;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnChecked = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "Button Clicked", Toast.LENGTH_LONG).show();
                if(cbEnabled.isChecked() == true){
                    tvShow.setText("Discount is given.");
                } else {
                    tvShow.setText("Discount is not given.");
                }
            }
        });

    }
}