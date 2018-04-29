package cn.com.daggerdemo.sample2;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：fcy on 2018/4/8 15:19
 */
@Module
public class FlowerModule {
   /* @Provides
    Flower provideFlower(){ //1  只有一种类型
        return new Rose();
    }*/

    //两种类型即以上需要限定符@Qualifie  而@Named则是基于String的限定符
   // @Qualifier的作用和@Named是完全一样的，不过更推荐使用@Qualifier，因为@Named需要手写字符串，容易出错。
    //2
  /* @Provides
   @Named("Rose")
    Flower provideRose(){
        return  new Rose();
    }

   @Provides
   @Named("Lily")
    Flower provideLily(){
        return  new Lily();
    }*/

  //3
    @Provides
    @RoseFlower
    Flower provideRose(){
        return  new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily(){
        return  new Lily();
    }
}
