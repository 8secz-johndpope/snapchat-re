package com.snap.ui.view.stackdraw;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import defpackage.akbk;
import defpackage.akcs;
import java.lang.reflect.Constructor;

final class TextHolder$Companion$staticLayoutConstructor$2 extends akcs implements akbk<Constructor<StaticLayout>> {
    public static final TextHolder$Companion$staticLayoutConstructor$2 INSTANCE = new TextHolder$Companion$staticLayoutConstructor$2();

    TextHolder$Companion$staticLayoutConstructor$2() {
        super(0);
    }

    public final Constructor<StaticLayout> invoke() {
        Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TruncateAt.class, Integer.TYPE, Integer.TYPE});
        declaredConstructor.setAccessible(true);
        return declaredConstructor;
    }
}
