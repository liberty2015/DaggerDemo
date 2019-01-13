package com.example.administrator.daggerdemo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by liberty on 2019/1/13.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ScopeActivity {
}
