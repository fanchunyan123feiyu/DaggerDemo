package cn.com.daggerdemo.sample1;

import javax.inject.Inject;

/**
 * 作者：fcy on 2018/4/8 10:48
 */

public class Rose {
    @Inject
    public Rose() {//告诉Dagger2可以使用这个构造器构建对象
    }
    public  String whisper(){
        return "热恋";
    }
}
