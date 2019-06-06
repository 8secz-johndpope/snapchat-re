package com.snap.ui.view;

import android.view.View;

public class ViewEvent<T> {
    public T data;
    public ViewEventType eventType;
    public View view;

    public enum ViewEventType {
        ONCLICK,
        LONG_PRESS
    }

    public ViewEvent(T t, View view, ViewEventType viewEventType) {
        this.data = t;
        this.view = view;
        this.eventType = viewEventType;
    }
}
