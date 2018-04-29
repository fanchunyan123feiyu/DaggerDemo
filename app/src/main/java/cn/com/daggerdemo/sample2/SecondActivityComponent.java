package cn.com.daggerdemo.sample2;

import dagger.Component;

/**
 * 作者：fcy on 2018/4/8 15:24
 */
@Component(modules = {FlowerModule.class,PotModule.class})
public interface SecondActivityComponent {
    void  inject(SecondActivity activity);
}
