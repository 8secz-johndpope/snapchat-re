package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import defpackage.ald.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* renamed from: ahx */
public class ahx {
    public static volatile boolean a = true;
    public static volatile boolean b = true;
    private static volatile ahx l;
    final aje c;
    public final ajr d;
    public final akg e;
    final aim f;
    final ajd g;
    final aly h;
    final ani i;
    final amc j;
    final ani k;
    private final akn m;
    private final ape n = new ape();
    private final ann o = new ann();
    private final aog p;
    private final Handler q;
    private final akl r;

    /* renamed from: ahx$a */
    static class a extends apj<View, Object> {
        public a(View view) {
            super(view);
        }

        public final void a(Drawable drawable) {
        }

        public final void a(Exception exception, Drawable drawable) {
        }

        public final void a(Object obj, aou<? super Object> aou) {
        }

        public final void b(Drawable drawable) {
        }
    }

    private ahx(aje aje, akg akg, ajr ajr, Context context, aim aim, ajd ajd) {
        this.c = aje;
        this.d = ajr;
        this.e = akg;
        this.f = aim;
        this.g = ajd;
        this.m = new akn(context);
        this.q = new Handler(Looper.getMainLooper());
        this.r = new akl(akg, ajr, aim);
        this.p = new aog();
        amj amj = new amj(ajr, aim);
        this.p.a(InputStream.class, Bitmap.class, amj);
        ama ama = new ama(ajr, aim);
        this.p.a(ParcelFileDescriptor.class, Bitmap.class, ama);
        amh amh = new amh(amj, ama);
        this.p.a(akr.class, Bitmap.class, amh);
        amv amv = new amv(context, ajr);
        this.p.a(InputStream.class, amu.class, amv);
        this.p.a(akr.class, and.class, new anj(amh, amv, ajr));
        this.p.a(InputStream.class, File.class, new ams());
        a(File.class, ParcelFileDescriptor.class, new a());
        a(File.class, InputStream.class, new alk.a());
        a(Integer.TYPE, ParcelFileDescriptor.class, new alf.a());
        a(Integer.TYPE, InputStream.class, new alm.a());
        a(Integer.class, ParcelFileDescriptor.class, new alf.a());
        a(Integer.class, InputStream.class, new alm.a());
        a(String.class, ParcelFileDescriptor.class, new alg.a());
        a(String.class, InputStream.class, new aln.a());
        a(Uri.class, ParcelFileDescriptor.class, new alh.a());
        a(Uri.class, InputStream.class, new alo.a());
        a(URL.class, InputStream.class, new alp.a());
        a(ako.class, InputStream.class, new ali.a());
        a(byte[].class, InputStream.class, new alj.a());
        this.o.a(Bitmap.class, amd.class, new anl(context.getResources(), ajr));
        this.o.a(and.class, amo.class, new ank(new anl(context.getResources(), ajr)));
        this.h = new aly(ajr);
        this.i = new ani(ajr, this.h);
        this.j = new amc(ajr);
        this.k = new ani(ajr, this.j);
    }

    public static ahx a(Context context) {
        if (l == null) {
            synchronized (ahx.class) {
                if (l == null) {
                    context = context.getApplicationContext();
                    List<aoc> a = new aod(context).a();
                    ahy ahy = new ahy(context);
                    for (aoc a2 : a) {
                        a2.a(context, ahy);
                    }
                    if (ahy.e == null) {
                        ahy.e = new akj(Math.max(1, Runtime.getRuntime().availableProcessors()));
                    }
                    if (ahy.f == null) {
                        ahy.f = new akj(1);
                    }
                    akh akh = new akh(ahy.a);
                    if (ahy.c == null) {
                        ahy.c = new aju(akh.a);
                    }
                    if (ahy.d == null) {
                        ahy.d = new akf(akh.b);
                    }
                    if (ahy.i == null) {
                        ahy.i = new ake(ahy.a);
                    }
                    if (ahy.b == null) {
                        ahy.b = new aje(ahy.d, ahy.i, ahy.f, ahy.e);
                    }
                    if (ahy.g == null) {
                        ahy.g = aim.DEFAULT;
                    }
                    if (ahy.h == null) {
                        ahy.h = ajd.RESULT;
                    }
                    l = new ahx(ahy.b, ahy.d, ahy.c, ahy.a, ahy.g, ahy.h);
                    for (aoc a3 : a) {
                        a3.a(l);
                    }
                }
            }
        }
        return l;
    }

    public static <T, Y> akw<T, Y> a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return ahx.a(context).m.a(cls, cls2);
        }
        String str = "Glide";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Unable to load null model, setting placeholder only");
        }
        return null;
    }

    public static void a(View view) {
        ahx.a(new a(view));
    }

    public static void a(api<?> api) {
        aps.a();
        aol e = api.e();
        if (e != null) {
            e.c();
            api.a(null);
        }
    }

    public static aib b(Context context) {
        return anz.a.a(context);
    }

    /* Access modifiers changed, original: final */
    public final <Z, R> anm<Z, R> a(Class<Z> cls, Class<R> cls2) {
        return this.o.a(cls, cls2);
    }

    public final void a() {
        aps.a();
        this.e.a();
        this.d.a();
    }

    public final void a(int i) {
        aps.a();
        this.e.a(i);
        this.d.a(i);
    }

    public final <T, Y> void a(Class<T> cls, Class<Y> cls2, akx<T, Y> akx) {
        this.m.a((Class) cls, (Class) cls2, (akx) akx);
    }

    /* Access modifiers changed, original: final */
    public final <T, Z> aof<T, Z> b(Class<T> cls, Class<Z> cls2) {
        return this.p.a(cls, cls2);
    }
}
