package com.brightcove.player.edge;

import android.util.Log;

public abstract class ErrorListener {
    private final String a = getClass().getSimpleName();

    public void onError(String str) {
        Log.e(this.a, str);
    }
}
