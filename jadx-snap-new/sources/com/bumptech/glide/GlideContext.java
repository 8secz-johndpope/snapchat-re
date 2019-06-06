package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import defpackage.aam;
import defpackage.abd;
import defpackage.agh;
import defpackage.agi;
import defpackage.ago;
import defpackage.yg;
import defpackage.yl;
import defpackage.yo;
import java.util.List;
import java.util.Map;

public class GlideContext extends ContextWrapper {
    public static final yo<?, ?> a = new yg();
    public final abd b;
    public final yl c;
    public final agi d;
    public final List<agh<Object>> e;
    public final Map<Class<?>, yo<?, ?>> f;
    public final aam g;
    public final boolean h = false;
    public final int i;
    private final ago j;

    public GlideContext(Context context, abd abd, yl ylVar, ago ago, agi agi, Map<Class<?>, yo<?, ?>> map, List<agh<Object>> list, aam aam, boolean z, int i) {
        super(context.getApplicationContext());
        this.b = abd;
        this.c = ylVar;
        this.j = ago;
        this.d = agi;
        this.e = list;
        this.f = map;
        this.g = aam;
        this.i = i;
    }
}
