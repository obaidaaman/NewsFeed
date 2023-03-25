 package com.example.newsapp_project;

 import static com.example.newsapp_project.PagerAdapter.titles;

 import android.os.Bundle;

 import androidx.appcompat.app.AppCompatActivity;
 import androidx.appcompat.widget.Toolbar;
 import androidx.viewpager2.widget.ViewPager2;

 import com.google.android.material.tabs.TabLayout;
 import com.google.android.material.tabs.TabLayoutMediator;

 public class MainActivity extends AppCompatActivity {
TabLayout tab;
Toolbar toolbar;
ViewPager2 viewPager2;
PagerAdapter pagerAdapter;

String api="85b7b68ca4f54672ab1471ac67dbce8e";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=(TabLayout)findViewById(R.id.include);
        viewPager2=findViewById(R.id.fragmentContainer);

       toolbar=findViewById(R.id.toolbar);

       setSupportActionBar(toolbar);

       pagerAdapter= new PagerAdapter(this);
       viewPager2.setAdapter(pagerAdapter);

       new TabLayoutMediator(tab,viewPager2,((tab, position) -> tab.setText(titles[position]))).attach();

//       tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//           @Override
//           public void onTabSelected(TabLayout.Tab tab) {
//               viewPager2.setCurrentItem(tab.getPosition());
//
//           }
//
//           @Override
//           public void onTabUnselected(TabLayout.Tab tab) {
//
//           }
//
//           @Override
//           public void onTabReselected(TabLayout.Tab tab) {
//
//           }
//       });
//



    }


}