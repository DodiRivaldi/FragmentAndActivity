package developerkampus.fragmentandactivity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import developerkampus.fragmentandactivity.R;

public class HasilActivity extends AppCompatActivity {

    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvHasil = (TextView) findViewById(R.id.tv_hasil);


    }
}