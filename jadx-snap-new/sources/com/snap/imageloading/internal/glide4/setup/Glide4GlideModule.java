package com.snap.imageloading.internal.glide4.setup;

import android.content.Context;
import defpackage.acj;
import defpackage.acr;
import defpackage.aff;
import defpackage.afg;
import defpackage.afs;
import defpackage.agh;
import defpackage.ags;
import defpackage.akcr;
import defpackage.ihl;
import defpackage.jvx;
import defpackage.jwf;
import defpackage.jwq;
import defpackage.jxh;
import defpackage.kaf;
import defpackage.kap.b;
import defpackage.yh;
import defpackage.yi;
import defpackage.yj;
import defpackage.yl;
import java.io.InputStream;

public final class Glide4GlideModule extends afs {

    static final class a implements afg {

        public static final class a implements aff {
            a() {
            }

            public final void a() {
            }

            public final void b() {
            }

            public final void c() {
            }
        }

        public final aff a(Context context, defpackage.aff.a aVar) {
            akcr.b(context, "context");
            akcr.b(aVar, "listener");
            return new a();
        }
    }

    public final void a(Context context, yh yhVar, yl ylVar) {
        akcr.b(context, "context");
        akcr.b(yhVar, "glide");
        akcr.b(ylVar, "registry");
        super.a(context, yhVar, ylVar);
        Object a = jvx.a();
        akcr.a(a, "ImageLoading.getSettings()");
        jwq jwq = a.d;
        if (jwq != null) {
            ylVar.a(jwf.class, InputStream.class, (acr) new b(jwq.j));
            ylVar.a(jxh.class, InputStream.class, (acr) new defpackage.kar.a(jwq.d, jwq.j));
            ylVar.b(acj.class, InputStream.class, (acr) new defpackage.kas.a(jwq.e, jwq.j));
        }
        if (a.a) {
            yhVar.a(yj.LOW);
        }
    }

    public final void a(Context context, yi yiVar) {
        akcr.b(context, "context");
        akcr.b(yiVar, "builder");
        super.a(context, yiVar);
        Object a = jvx.a();
        akcr.a(a, "ImageLoading.getSettings()");
        yiVar.a(new defpackage.aby.a(context).a());
        yiVar.a((afg) new a());
        if (!a.c) {
            yiVar.a((defpackage.abq.a) new defpackage.abr.a());
        }
        jwq jwq = a.d;
        if (jwq != null) {
            yiVar.a((agh) new kaf(jwq.i, new ihl()));
        }
        ags.g();
    }

    public final boolean c() {
        return false;
    }
}
