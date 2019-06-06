package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Supplier;

/* renamed from: dvo */
public final class dvo {
    private final dqo a;
    private final dpf b;
    private final dny c;
    private final gqr d;
    private final Context e;
    private final Supplier<Handler> f;
    private final jwa g;
    private final Supplier<dyw> h;
    private final adhk i;
    private final dvq j;

    /* renamed from: dvo$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[eca.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.eca.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.eca.CAMERA1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.eca.CAMERA2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.eca.ARCORE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dvo$1.<clinit>():void");
        }
    }

    public dvo(dqo dqo, dpf dpf, dny dny, gqr gqr, Context context, Supplier<Handler> supplier, jwa jwa, Supplier<dyw> supplier2, adhk adhk, dvq dvq) {
        this.a = dqo;
        this.b = dpf;
        this.c = dny;
        this.d = gqr;
        this.e = context;
        this.f = supplier;
        this.g = jwa;
        this.h = supplier2;
        this.i = adhk;
        this.j = dvq;
    }

    private dvn a(eca eca) {
        int i = 1.a[eca.ordinal()];
        if (i == 1) {
            return new dwm(this.f, this.g, this.c, this.d, this.e, (dyw) this.h.get(), this.j, this.a);
        } else if (i == 2) {
            return new dwy(this.f, this.g, this.c, this.d, this.e, this.a, (dyw) this.h.get(), this.j, this.i);
        } else {
            if (i == 3) {
                return new dvh((dyw) this.h.get(), this.c, this.d, this.e, this.f);
            }
            throw new IllegalArgumentException("Unknown camera api: ".concat(String.valueOf(eca)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    public final defpackage.eca a() {
        /*
        r9 = this;
        r0 = defpackage.abnl.c;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x005a;
    L_0x0006:
        r0 = r9.a;
        r3 = r9.b;
        r3 = r3.as();
        r4 = r0.a();
        r5 = defpackage.ebz.UNKNOWN;
        if (r4 != r5) goto L_0x004d;
    L_0x0016:
        r4 = defpackage.dxa.c();
        if (r4 != 0) goto L_0x001f;
    L_0x001c:
        r4 = defpackage.ebz.UNKNOWN;
        goto L_0x004a;
    L_0x001f:
        r5 = 0;
        r4 = r4.values();
        r4 = r4.iterator();
    L_0x0028:
        r6 = r4.hasNext();
        if (r6 == 0) goto L_0x0046;
    L_0x002e:
        r6 = r4.next();
        r6 = (defpackage.ebz) r6;
        r7 = defpackage.ebz.LEGACY;
        if (r6 != r7) goto L_0x003b;
    L_0x0038:
        r4 = defpackage.ebz.LEGACY;
        goto L_0x004a;
    L_0x003b:
        if (r5 != 0) goto L_0x003f;
    L_0x003d:
        r5 = r6;
        goto L_0x0028;
    L_0x003f:
        r7 = r5.value;
        r8 = r6.value;
        if (r7 >= r8) goto L_0x0028;
    L_0x0045:
        goto L_0x003d;
    L_0x0046:
        if (r5 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x001c;
    L_0x0049:
        r4 = r5;
    L_0x004a:
        r0.a(r4);
    L_0x004d:
        r0 = r4.ordinal();
        if (r0 < r3) goto L_0x0055;
    L_0x0053:
        r0 = 1;
        goto L_0x0056;
    L_0x0055:
        r0 = 0;
    L_0x0056:
        if (r0 == 0) goto L_0x005a;
    L_0x0058:
        r0 = 1;
        goto L_0x005b;
    L_0x005a:
        r0 = 0;
    L_0x005b:
        if (r0 == 0) goto L_0x0066;
    L_0x005d:
        r0 = r9.b;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0067;
    L_0x0066:
        r1 = 0;
    L_0x0067:
        if (r1 == 0) goto L_0x006c;
    L_0x0069:
        r0 = defpackage.eca.CAMERA2;
        return r0;
    L_0x006c:
        r0 = defpackage.eca.CAMERA1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvo.a():eca");
    }

    public final dvn b() {
        return a(a());
    }
}
