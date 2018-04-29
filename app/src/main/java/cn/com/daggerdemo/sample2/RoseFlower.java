package cn.com.daggerdemo.sample2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 作者：fcy on 2018/4/9 10:53
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface RoseFlower {
}
