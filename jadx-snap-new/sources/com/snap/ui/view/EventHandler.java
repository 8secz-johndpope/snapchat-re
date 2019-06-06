package com.snap.ui.view;

import android.view.View;

public abstract class EventHandler<T> {
    public void onClick(T t, View view) {
    }

    public void onLongPress(T t, View view) {
    }
}
