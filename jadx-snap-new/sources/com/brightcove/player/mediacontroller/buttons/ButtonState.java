package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;

public class ButtonState {
    private String a;
    private Drawable b;
    private String c;
    private OnClickListener d;
    private CharSequence e;

    public ButtonState(Context context, int i, int i2, Drawable drawable, OnClickListener onClickListener) {
        this(context, i, i2, drawable, null, onClickListener);
    }

    public ButtonState(Context context, int i, int i2, Drawable drawable, String str) {
        this(context, i, i2, drawable, str, null);
    }

    public ButtonState(Context context, int i, int i2, Drawable drawable, String str, OnClickListener onClickListener) {
        this.e = context.getResources().getString(i);
        this.a = context.getResources().getString(i2);
        this.b = drawable;
        this.c = str;
        this.d = onClickListener;
    }

    public String getContentDescription() {
        return this.a;
    }

    public String getEventType() {
        return this.c;
    }

    public OnClickListener getHandler() {
        return this.d;
    }

    public Drawable getImage() {
        return this.b;
    }

    public CharSequence getText() {
        return this.e;
    }
}
