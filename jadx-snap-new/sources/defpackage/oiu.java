package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: oiu */
public final class oiu extends adiv {
    private final adiv a;
    private final adiv b;
    private final boolean c;
    private a d = a.FIRST_RENDER_TO_DRAW_FIRST_FRAME;
    private adne e;

    /* renamed from: oiu$a */
    enum a {
        FIRST_RENDER_TO_DRAW_FIRST_FRAME,
        SECOND_RENDER_TO_SETUP_SMOOTHING_FILTER,
        SMOOTHING_FILTER_READY
    }

    /* renamed from: oiu$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.oiu.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.oiu.a.FIRST_RENDER_TO_DRAW_FIRST_FRAME;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.oiu.a.SECOND_RENDER_TO_SETUP_SMOOTHING_FILTER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.oiu.a.SMOOTHING_FILTER_READY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oiu$1.<clinit>():void");
        }
    }

    public oiu(adiv adiv, adiv adiv2, boolean z) {
        this.a = (adiv) Preconditions.checkNotNull(adiv);
        this.b = (adiv) Preconditions.checkNotNull(adiv2);
        this.c = z;
    }

    public final void a(int i, int i2, adic adic) {
        this.a.a(i, i2, adic);
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        if (this.d == a.FIRST_RENDER_TO_DRAW_FIRST_FRAME) {
            adne adne = this.e;
            if (adne != null) {
                adne.a();
            }
        }
        if (this.d == a.SECOND_RENDER_TO_SETUP_SMOOTHING_FILTER && this.c) {
            this.b.a(i, j, adie, adhu);
        }
        this.a.a(i, j, adie, adhu);
        a aVar = this.d;
        int i2 = 1.a[aVar.ordinal()];
        if (i2 == 1) {
            aVar = a.SECOND_RENDER_TO_SETUP_SMOOTHING_FILTER;
        } else if (i2 == 2 || i2 == 3) {
            aVar = a.SMOOTHING_FILTER_READY;
        } else {
            throw new IllegalStateException("Unexpected render state: ".concat(String.valueOf(aVar)));
        }
        this.d = aVar;
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        this.a.a(adie, adie2, i, i2, adic, adne, adhz);
        this.e = adne;
    }

    public final void e() {
        this.a.e();
    }
}
