package cn.com.daggerdemo.sample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import cn.com.daggerdemo.R;


public class MainActivity extends AppCompatActivity {
    @Inject
    Pot pot;//属性注入  被标注的属性不能使用private修饰，


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
        Toast.makeText(this,pot.show(),Toast.LENGTH_LONG).show();
    }
}
