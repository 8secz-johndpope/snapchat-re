package com.snap.imageloading.internal.glide3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.snapchat.android.R;
import defpackage.ahx;
import defpackage.ahy;
import defpackage.ahz;
import defpackage.aim;
import defpackage.ajd;
import defpackage.ajr;
import defpackage.ajs;
import defpackage.aju;
import defpackage.akf;
import defpackage.ako;
import defpackage.aoc;
import defpackage.apj;
import defpackage.aps;
import defpackage.jvx;
import defpackage.jvx.a;
import defpackage.jwf;
import defpackage.jwh;
import defpackage.jwi;
import defpackage.jwp;
import defpackage.jwq;
import defpackage.jws;
import defpackage.jwx;
import defpackage.jxo;
import defpackage.jyx;
import defpackage.jyy.b;
import defpackage.jyz;
import defpackage.jza;
import defpackage.jzv;
import defpackage.zgb;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class SnapGlideModule implements aoc {
    private final a a = jvx.a();

    /* renamed from: com.snap.imageloading.internal.glide3.SnapGlideModule$1 */
    class AnonymousClass1 extends aju {
        private /* synthetic */ boolean a = false;
        private /* synthetic */ jwq b;
        private /* synthetic */ jxo c;
        private /* synthetic */ Executor d;

        AnonymousClass1(int i, boolean z, jwq jwq, jxo jxo, Executor executor) {
            this.b = jwq;
            this.c = jxo;
            this.d = executor;
            super(i);
        }

        private synchronized void b(Bitmap bitmap) {
            try {
                super.a(bitmap);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }

        private /* synthetic */ void c(Bitmap bitmap) {
            b(bitmap);
        }

        public final void a() {
            try {
                super.a();
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }

        public final void a(int i) {
            try {
                super.a(Math.max(i, 40));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }

        public final void a(Bitmap bitmap) {
            if (this.a) {
                ((jwx) this.b.g.get()).a(bitmap);
                return;
            }
            -$$Lambda$SnapGlideModule$1$x9jePM2wZaVhClURLK5jMcVEOJQ -__lambda_snapglidemodule_1_x9jepm2wzavhclurlk5jmcveojq = new -$$Lambda$SnapGlideModule$1$x9jePM2wZaVhClURLK5jMcVEOJQ(this, bitmap);
            if (this.c == null || !jxo.a()) {
                -__lambda_snapglidemodule_1_x9jepm2wzavhclurlk5jmcveojq.run();
            } else {
                this.d.execute(-__lambda_snapglidemodule_1_x9jepm2wzavhclurlk5jmcveojq);
            }
        }

        public final synchronized Bitmap b(int i, int i2, Config config) {
            try {
            } catch (ArrayIndexOutOfBoundsException unused) {
                return null;
            }
            return super.b(i, i2, config);
        }
    }

    public final void a(ahx ahx) {
        ahx.a(jwf.class, InputStream.class, new jyx.a());
        jwq jwq = jvx.a().d;
        if (jwq != null) {
            ahx.a(jwh.class, InputStream.class, new jyz.a((jwi) jwq.c.get()));
        }
        if (!this.a.b) {
            ahx.a(ako.class, InputStream.class, new jza.a());
        } else if (jwq != null) {
            ahx.a(ako.class, InputStream.class, new b((jws) jwq.e.get()));
        }
        if (this.a.a) {
            ahz ahz = ahz.LOW;
            aps.a();
            ahx.e.a(ahz.multiplier);
            ahx.d.a(ahz.multiplier);
        }
    }

    public final void a(Context context, ahy ahy) {
        Executor a;
        jxo jxo;
        ajr ajs;
        jwq jwq = this.a.d;
        if (jwq != null) {
            jwq.f.get();
            a = zgb.a(jwp.a, "glide").a();
            jxo = (jxo) jwq.b.b();
        } else {
            jxo = null;
            a = jxo;
        }
        jzv jzv = new jzv(new jzv.a(context));
        int i = jzv.a;
        if (i > 0) {
            ajr anonymousClass1 = new AnonymousClass1(i, false, jwq, jxo, a);
        } else {
            ajs = new ajs();
        }
        ahy.c = ajs;
        ahy.d = new akf(jzv.b) {
            public final void a(int i) {
                super.a(Math.max(i, 40));
            }
        };
        ahy.g = aim.PREFER_ARGB_8888;
        ahx.b = false;
        if (apj.b != null || apj.a) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        apj.b = Integer.valueOf(R.id.glide_request);
        ahy.h = ajd.NONE;
        if (!this.a.c) {
            ahy.i = -$$Lambda$sOLr6JbXoQOXQ3O5y2vkGLgUc-w.INSTANCE;
        }
    }
}
