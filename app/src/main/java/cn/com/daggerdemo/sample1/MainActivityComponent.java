package cn.com.daggerdemo.sample1;

import dagger.Component;

/**
 * 作者：fcy on 2018/4/8 10:50
 */
@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
    void inject(MainActivity1 activity);
}
