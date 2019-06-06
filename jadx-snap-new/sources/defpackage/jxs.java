package defpackage;

import android.content.Context;

/* renamed from: jxs */
public final class jxs implements jwg {
    private final Context a;
    private final int b;
    private final int c;
    private final int d;

    /* renamed from: jxs$a */
    public enum a {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: jxs$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.jxs.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jxs$1.<clinit>():void");
        }
    }

    public jxs(Context context, int i) {
        this(context, 25, 1, i);
    }

    public jxs(Context context, int i, byte b) {
        this(context, i, 1);
    }

    public jxs(Context context, int i, int i2) {
        this(context, i, i2, 1);
    }

    private jxs(Context context, int i, int i2, int i3) {
        this.a = context.getApplicationContext();
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder("BlurTransformation(radius=");
        stringBuilder.append(this.b);
        stringBuilder.append(", downsampling=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    /* JADX WARNING: Missing block: B:4:0x0053, code skipped:
            if (r5 != 3) goto L_0x006b;
     */
    public final defpackage.kaz<defpackage.jwj> a(defpackage.jwa r4, defpackage.kaz<defpackage.jwj> r5, int r6, int r7) {
        /*
        r3 = this;
        r5 = r5.a();
        r5 = (defpackage.jwj) r5;
        r5 = r5.a();
        r6 = r5.getWidth();
        r7 = r5.getHeight();
        r0 = r3.c;
        r6 = r6 / r0;
        r7 = r7 / r0;
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = "BlurTransformation";
        r4 = r4.a(r6, r7, r0, r1);
        r6 = r4.a();
        r6 = (defpackage.jwj) r6;
        r6 = r6.a();
        r7 = new android.graphics.Canvas;
        r7.<init>(r6);
        r0 = r3.c;
        r1 = (float) r0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r2 / r1;
        r0 = (float) r0;
        r2 = r2 / r0;
        r7.scale(r1, r2);
        r0 = new android.graphics.Paint;
        r0.<init>();
        r1 = 2;
        r0.setFlags(r1);
        r2 = 0;
        r7.drawBitmap(r5, r2, r2, r0);
        r5 = defpackage.jxs.1.a;
        r7 = r3.d;
        r0 = 1;
        r7 = r7 - r0;
        r5 = r5[r7];
        if (r5 == r0) goto L_0x0064;
    L_0x0050:
        if (r5 == r1) goto L_0x005c;
    L_0x0052:
        r7 = 3;
        if (r5 == r7) goto L_0x0056;
    L_0x0055:
        goto L_0x006b;
    L_0x0056:
        r5 = r3.b;
        defpackage.jxt.a(r6, r5);
        goto L_0x006b;
    L_0x005c:
        r5 = r3.a;
        r7 = r3.b;
        defpackage.jxu.a(r5, r6, r7);
        goto L_0x006b;
    L_0x0064:
        r5 = r3.a;	 Catch:{ RSRuntimeException -> 0x0056 }
        r7 = r3.b;	 Catch:{ RSRuntimeException -> 0x0056 }
        defpackage.jxu.a(r5, r6, r7);	 Catch:{ RSRuntimeException -> 0x0056 }
    L_0x006b:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxs.a(jwa, kaz, int, int):kaz");
    }
}
