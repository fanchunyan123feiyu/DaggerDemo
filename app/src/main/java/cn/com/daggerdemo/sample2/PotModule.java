package cn.com.daggerdemo.sample2;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：fcy on 2018/4/8 17:38
 */
@Module
public class PotModule {
    @Provides
    Pot providePot(@LilyFlower Flower flower){
        return  new Pot(flower);
    }
}
