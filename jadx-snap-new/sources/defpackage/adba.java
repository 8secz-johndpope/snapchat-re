package defpackage;

import android.content.Context;
import android.text.TextUtils;
import defpackage.aczu.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: adba */
public final class adba {
    final Object a;
    public final adch<String, acua> b;
    final HashSet<String> c;
    final adbv d;
    final aczr e;
    final a f;
    private final adcl g;
    private final WeakReference<adba> h;
    private final jwb i;
    private final adcg j;
    private jwa k;

    /* renamed from: adba$1 */
    class 1 implements a {
        1() {
        }

        public final void a(String str, kaz<jwj> kaz) {
            adba.this.b.a(str, acua.a((kaz) kaz));
            adba.this.d.m();
        }
    }

    /* renamed from: adba$a */
    static class a implements aczq<byte[]> {
        private final String a;
        private final WeakReference<adba> b;

        a(String str, WeakReference<adba> weakReference) {
            this.a = str;
            this.b = weakReference;
        }

        public final /* synthetic */ void a(Object obj, aczw aczw) {
            byte[] bArr = (byte[]) obj;
            adba adba = (adba) this.b.get();
            if (adba != null) {
                String str = this.a;
                synchronized (adba.a) {
                    adba.c.remove(str);
                }
                if (bArr != null) {
                    adba.e.a(str, bArr, adba.f);
                }
            }
        }
    }

    public adba(adcl adcl, adbv adbv, aczr aczr, jwb jwb) {
        this(adcl, adbv, aczr, jwb, new aday.a());
    }

    private adba(adcl adcl, adbv adbv, aczr aczr, jwb jwb, adcg adcg) {
        this.a = new Object();
        this.b = new adch("ImageBitmapFetcher", 20);
        this.c = new HashSet();
        this.h = new WeakReference(this);
        this.f = new 1();
        this.g = adcl;
        this.d = adbv;
        this.e = aczr;
        this.i = jwb;
        this.j = adcg;
    }

    public static String a(aljh aljh) {
        if (aljh != null) {
            String str = aljh.a;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return null;
    }

    private boolean a(int i) {
        if (i == 0) {
            return false;
        }
        String valueOf = String.valueOf(i);
        return this.b.b(valueOf) || a(valueOf, i) != null;
    }

    public final acua a(String str, int i) {
        if (this.k == null) {
            this.k = this.i.a(adcw.b);
        }
        Context i2 = this.d.i();
        if (i2 != null) {
            acua a = this.j.a(i2, this.k, i, "ImageBitmapFetcher");
            if (a != null) {
                this.b.a(str, a);
                return a;
            }
        }
        return null;
    }

    public final void a(String str) {
        synchronized (this.a) {
            if (this.c.contains(str)) {
                return;
            }
            this.c.add(str);
            this.g.a(str, str, new a(str, this.h));
        }
    }

    public final boolean a(aljh aljh, int i) {
        String a = adba.a(aljh);
        if (a != null) {
            if (this.b.b(a)) {
                return true;
            }
            a(a);
        }
        return a(i);
    }
}
