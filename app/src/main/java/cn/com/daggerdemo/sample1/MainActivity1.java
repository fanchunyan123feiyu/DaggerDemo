package cn.com.daggerdemo.sample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import cn.com.daggerdemo.R;

public class MainActivity1 extends AppCompatActivity {
   private Pot pot;//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.create().inject(this);
        Toast.makeText(this,pot.show(),Toast.LENGTH_LONG).show();
    }

    @Inject//标注在public方法上，Dagger2会在构造器执行之后立即调用这个方法。
    public void setPot(Pot pot){//方法注入
        this.pot=pot;
    }
    //方法注入和属性注入没啥区别
    //比如该依赖需要this对象的时候，使用方法注入可以提供安全的this对象，因为方法注入是在构造器之后执行的。
}
