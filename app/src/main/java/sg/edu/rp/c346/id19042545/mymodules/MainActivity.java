package sg.edu.rp.c346.id19042545.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvwebAppDev;
    TextView tvsoftDevPro;
    TextView tvitSecure;
    TextView tvadvJava;
    TextView tvAndProgramme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvwebAppDev = findViewById(R.id.textViewC203);
        tvsoftDevPro = findViewById(R.id.textViewC206);
        tvitSecure = findViewById(R.id.textViewC235);
        tvadvJava = findViewById(R.id.textViewC306);
        tvAndProgramme = findViewById(R.id.textViewC346);

        tvwebAppDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,showdetail.class);
                intent.putExtra("module","C203");
                startActivity(intent);
            }
        });
        tvsoftDevPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,showdetail.class);
                intent.putExtra("module","C206");
                startActivity(intent);
            }
        });
        tvitSecure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,showdetail.class);
                intent.putExtra("module","C235");
                startActivity(intent);
            }
        });
        tvadvJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,showdetail.class);
                intent.putExtra("module","C306");
                startActivity(intent);
            }
        });
        tvAndProgramme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,showdetail.class);
                intent.putExtra("module","C346");
                startActivity(intent);
            }
        });
    }
}
