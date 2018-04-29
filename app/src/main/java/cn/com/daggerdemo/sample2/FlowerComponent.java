package cn.com.daggerdemo.sample2;

import dagger.Component;

/**
 * 作者：fcy on 2018/4/9 11:46
 */
@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();
}
