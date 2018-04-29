package cn.com.daggerdemo.sample1;

import javax.inject.Inject;

/**
 * 作者：fcy on 2018/4/8 10:48
 */

public class Pot {

    private Rose rose;
    //构造器注入的局限：如果有多个构造器，我们只能标注其中一个，无法标注多个。
    @Inject
    public Pot(Rose rose) {//注入构造器所需要的参数的依赖
        this.rose = rose;
    }

    public  String show(){
        return  rose.whisper();
    }
}
