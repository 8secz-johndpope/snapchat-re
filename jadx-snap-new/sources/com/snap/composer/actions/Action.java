package com.snap.composer.actions;

import defpackage.ajdx;
import java.util.Map;

public interface Action {
    ajdx<Object> execute(Map<String, ? extends Object> map);

    String getName();
}
