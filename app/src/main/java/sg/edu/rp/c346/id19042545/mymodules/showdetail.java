package sg.edu.rp.c346.id19042545.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class showdetail extends AppCompatActivity {

    TextView tvanswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetail);

        tvanswer=findViewById(R.id.textView);
        Intent intent=getIntent();
        String module = intent.getStringExtra("module");
        if (module.equals("C203")){
            tvanswer.setText("Module Code:"+module+"\n Module Name: WebAppln Development in php \n Academic Year:2020 \n " +
                    "Semester:1 \n Module Credit: 4 \n Venue: W67H");
        }
        else if (module.equals("C206")){
            tvanswer.setText("Module Code:"+module+"\n Module Name: Software Development Process \n Academic Year:2020 \n " +
                    "Semester:1 \n Module Credit: 4 \n Venue: W67H");
        }
        else if (module.equals("C235")){
            tvanswer.setText("Module Code:"+module+"\n Module Name: IT Security and Management \n Academic Year:2020 \n " +
                    "Semester:1 \n Module Credit: 4 \n Venue: W67H");
        }
        else if (module.equals("C306")){
            tvanswer.setText("Module Code:"+module+"\n Module Name: Data Structures and Algoithms \n Academic Year:2020 \n " +
                    "Semester:1 \n Module Credit: 4 \n Venue: W67H");
        }
        else if (module.equals("C346")){
            tvanswer.setText("Module Code:"+module+"\n Module Name: Android Programming \n Academic Year:2020 \n " +
                    "Semester:1 \n Module Credit: 4 \n Venue: W67H");
        }
    }
}
