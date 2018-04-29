package cn.com.daggerdemo.sample2;

import javax.inject.Inject;

/**
 * 作者：fcy on 2018/4/8 17:09
 */

public class Pot {
    private Flower flower;

   /* @Inject
    public Pot(@Named("Rose") Flower flower) {
        this.flower = flower;
    }*/
    @Inject
    public Pot(Flower flower) {
        this.flower = flower;
    }

    public String show(){
        return  flower.whisper();
    }
}
