package com.example.lcc.schoolnews;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ImageView menu;
    private ImageView img_header;//头像
    private TextView tv_name;//名字
    private TextView tv_info;//个人简介
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.main_nav);
        menu= (ImageView) findViewById(R.id.main_img_menu);
        //获取头布局
        View headerView = navigationView.getHeaderView(0);
        img_header=headerView.findViewById(R.id.header_img);
        tv_name=headerView.findViewById(R.id.header_name);
        tv_info=headerView.findViewById(R.id.header_info);
        menu.setOnClickListener(this);
        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo
                //个人编辑界面
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.menu_dynamic:
                        Toast.makeText(MainActivity.this, ""+"动态", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_notify:

                        Toast.makeText(MainActivity.this, ""+"通知", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_news:

                        Toast.makeText(MainActivity.this, ""+"新闻", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                drawerLayout.closeDrawer(navigationView);
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_img_menu://点击菜单，跳出侧滑菜单
                if (drawerLayout.isDrawerOpen(navigationView)){
                    drawerLayout.closeDrawer(navigationView);
                }else{
                    drawerLayout.openDrawer(navigationView);
                }
                break;
        }

    }
    private void showDynamic(){

    }
    private void showNotify(){

    }
    private void showNews(){

    }

}
