package developerkampus.fragmentandactivity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import developerkampus.fragmentandactivity.adapter.ViewPagerAdapter;
import developerkampus.fragmentandactivity.fragment.GradeFragment;
import developerkampus.fragmentandactivity.fragment.HitungFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private EditText edt1,edt2,edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);
        SetupViewPager(viewPager);
    }

    private void SetupViewPager (ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new GradeFragment(),"GRADE");
        adapter.addFragment(new HitungFragment(),"HITUNG");
        viewPager.setAdapter(adapter);
    }

}
