package com.snap.mushroom.base;

import android.app.Activity;
import defpackage.ajej;

public interface ActivityPreInjector<T extends Activity> {
    ajej inceptionTask(T t);
}
