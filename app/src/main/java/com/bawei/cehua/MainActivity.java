package com.bawei.cehua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bawei.view.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    private SlidingMenu mLeftMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mLeftMenu = (SlidingMenu) findViewById(R.id.id_menu);
    }

    //Botton的点击事件
    public void toggleMenu(View view) {
        //调用切换菜单的方法
        mLeftMenu.toggle();
    }
}
