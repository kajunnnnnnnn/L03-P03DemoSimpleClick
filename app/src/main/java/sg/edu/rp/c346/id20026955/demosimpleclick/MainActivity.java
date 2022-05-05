package sg.edu.rp.c346.id20026955.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Handles
    Button btnDisplay;
    EditText etInput;
    TextView tv;
    ToggleButton tgbtn;
    RadioGroup rgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //bridge
        btnDisplay = findViewById(R.id.buttonDisplay);
        tv = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editInput);
        tgbtn = findViewById(R.id.tgbtn);
        rgButton = findViewById(R.id.rbGender);


        //set event
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set actions
                //grab input from edit text
                //set to textview
                if(tgbtn.isChecked() == true) {
                    String data = etInput.getText().toString();
                    int selectedID = rgButton.getCheckedRadioButtonId();

                    if (selectedID == R.id.rbMale){
                        tv.setText("Hello Mr, \n" + data);
                    } else{
                        tv.setText("Hello Ms, \n" + data);
                    }
                }
            }
        });

//        tgbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (tgbtn.isChecked() == true){
//                    tv.setText("enabled");
//                }else{
//                    tv.setText("disabled");
//                }
//            }
//        });




    }
}