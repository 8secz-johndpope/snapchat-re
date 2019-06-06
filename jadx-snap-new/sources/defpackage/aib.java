package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import defpackage.anr.a;
import java.io.InputStream;
import java.util.Random;

/* renamed from: aib */
public final class aib implements anw {
    final Context a;
    final anv b;
    final aob c;
    public final ahx d;
    final b e;
    private final aoa f;

    /* renamed from: aib$b */
    public class b {
        b() {
        }
    }

    /* renamed from: aib$c */
    static class c implements a {
        private final aob a;

        public c(aob aob) {
            this.a = aob;
        }

        public final void a(boolean z) {
            if (z) {
                aob aob = this.a;
                for (aol aol : aps.a(aob.a)) {
                    if (!(aol.g() || aol.i())) {
                        aol.e();
                        if (aob.c) {
                            aob.b.add(aol);
                        } else {
                            aol.b();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: aib$a */
    public final class a<A, T> {
        final akw<A, T> a;
        final Class<T> b;

        /* renamed from: aib$a$a */
        public final class a {
            private final A a;
            private final Class<A> b;
            private final boolean c;

            a(Class<A> cls) {
                this.c = false;
                this.a = null;
                this.b = cls;
            }

            public a(A a) {
                this.c = true;
                this.a = a;
                this.b = aib.b(a);
            }

            public final <Z> ahu<A, T, Z> a(Class<Z> cls) {
                ahu ahu = new ahu(aib.this.a, aib.this.d, this.b, a.this.a, a.this.b, cls, aib.this.c, aib.this.b, aib.this.e);
                if (this.c) {
                    ahu.a(this.a);
                }
                return ahu;
            }
        }

        a(akw<A, T> akw, Class<T> cls) {
            this.a = akw;
            this.b = cls;
        }

        public final a a(Class<A> cls) {
            return new a((Class) cls);
        }
    }

    static {
        Random random = new Random();
    }

    public aib(Context context, anv anv, aoa aoa) {
        aob aob = new aob();
        ans ans = new ans();
        this(context, anv, aoa, aob);
    }

    private aib(Context context, final anv anv, aoa aoa, aob aob) {
        this.a = context.getApplicationContext();
        this.b = anv;
        this.f = aoa;
        this.c = aob;
        this.d = ahx.a(context);
        this.e = new b();
        anw ant = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null) != null ? new ant(context, new c(aob)) : new anx();
        if (aps.c()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    anv.a(aib.this);
                }
            });
        } else {
            anv.a(this);
        }
        anv.a(ant);
    }

    private <T> ahs<T> a(Class<T> cls) {
        akw a = ahx.a((Class) cls, InputStream.class, this.a);
        akw a2 = ahx.a((Class) cls, ParcelFileDescriptor.class, this.a);
        if (cls != null && a == null && a2 == null) {
            StringBuilder stringBuilder = new StringBuilder("Unknown type ");
            stringBuilder.append(cls);
            stringBuilder.append(". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return new ahs(cls, a, a2, this.a, this.d, this.c, this.b, this.e);
    }

    static <T> Class<T> b(T t) {
        return t != null ? t.getClass() : null;
    }

    public final ahs<Uri> a(Uri uri) {
        return (ahs) a(Uri.class).b((Object) uri);
    }

    public final <T> ahs<T> a(T t) {
        return (ahs) a(aib.b(t)).b((Object) t);
    }

    public final <A, T> a<A, T> a(akw<A, T> akw, Class<T> cls) {
        return new a(akw, cls);
    }

    public final void a() {
        aps.a();
        aob aob = this.c;
        aob.c = false;
        for (aol aol : aps.a(aob.a)) {
            if (!(aol.g() || aol.i() || aol.f())) {
                aol.b();
            }
        }
        aob.b.clear();
    }

    public final void b() {
        aps.a();
        aob aob = this.c;
        aob.c = true;
        for (aol aol : aps.a(aob.a)) {
            if (aol.f()) {
                aol.e();
                aob.b.add(aol);
            }
        }
    }

    public final void c_() {
        aob aob = this.c;
        for (aol c : aps.a(aob.a)) {
            c.c();
        }
        aob.b.clear();
    }
}
