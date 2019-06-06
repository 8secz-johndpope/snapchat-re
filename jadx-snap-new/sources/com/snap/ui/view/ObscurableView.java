package com.snap.ui.view;

public interface ObscurableView<T> {
    T obscureView();

    void unobscureView(T t);
}
