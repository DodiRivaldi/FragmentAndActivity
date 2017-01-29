package developerkampus.fragmentandactivity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import developerkampus.fragmentandactivity.R;

public class HasilActivity extends AppCompatActivity {

    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvHasil = (TextView) findViewById(R.id.tv_hasil);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null){
            String hasil = (String) b.get("hasilnya");
            tvHasil.setText(hasil);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
