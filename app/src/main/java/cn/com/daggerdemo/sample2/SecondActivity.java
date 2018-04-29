package cn.com.daggerdemo.sample2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * 作者：fcy on 2018/4/8 15:24
 */

public class SecondActivity extends AppCompatActivity {
   /* @Inject
    Flower flower;*///1

   /* @Inject
    Flower flower;//@Named限定  2*/

   @Inject//3
   @RoseFlower
   Flower flower;

    @Inject
    Pot pot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DaggerSecondActivityComponent.create().inject(this);
        DaggerSecondActivityComponent.builder()
                .flowerModule(new FlowerModule())
                .potModule(new PotModule())
                .build().inject(this);
       Toast.makeText(this,flower.whisper()+pot.show(), Toast.LENGTH_LONG).show();
    }
}
