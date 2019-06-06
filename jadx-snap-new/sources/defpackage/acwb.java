package defpackage;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acvm.c;
import defpackage.acvm.e;

/* renamed from: acwb */
public final class acwb {
    static final a[][] a;
    static final a[][] b;
    private static final a[] c = new a[]{new a(-0.55f, 1.0f, 0), new a(0.55f, 1.0f, 0), new a(-0.22f, 1.15f, 0), new a(0.22f, 1.15f, 0), new a(-0.5f, 1.375f, 0), new a(0.5f, 1.375f, 0), new a(0.001f, 1.375f, 0), new a(-0.22f, 1.675f, 0), new a(0.22f, 1.675f, 0)};
    private static final a[] d = new a[]{new a(0.01f, 0.8f, 0), new a(-0.35f, 0.9f, 2.0f, 0.94f, (byte) 0), new a(0.35f, 0.9f, -2.0f, 0.94f, (byte) 0), new a(-0.65f, 1.0f, 7.0f, 0.87f, (byte) 0), new a(0.65f, 1.0f, -7.0f, 0.87f, (byte) 0), new a(-0.2f, 1.3f, 2.0f, 0.87f, (byte) 0), new a(0.2f, 1.3f, -2.0f, 0.87f, (byte) 0), new a(-0.6f, 1.3f, 2.0f, 0.87f, (byte) 0), new a(0.6f, 1.3f, -2.0f, 0.87f, (byte) 0), new a(-0.4f, 1.5f, 7.0f, 0.87f, (byte) 0), new a(0.01f, 1.5f, MapboxConstants.MINIMUM_ZOOM, 0.87f, (byte) 0), new a(0.4f, 1.5f, 7.0f, 0.87f, (byte) 0)};

    /* renamed from: acwb$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[c.values().length];
        static final /* synthetic */ int[] b = new int[e.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|5|6|7|8|9|11|12|(3:13|14|16)) */
        static {
            /*
            r0 = defpackage.acvm.e.a();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 3;
            r2[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r2 = defpackage.acvm.c.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x002c }
            r3 = defpackage.acvm.c.LEFT;	 Catch:{ NoSuchFieldError -> 0x002c }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x002c }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r2 = defpackage.acvm.c.RIGHT;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0036 }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x0036 }
        L_0x0036:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acwb$1.<clinit>():void");
        }
    }

    /* renamed from: acwb$a */
    static class a {
        final float a;
        final float b;
        final float c;
        final float d;

        private a(float f, float f2) {
            this(f, f2, (byte) 0);
        }

        private a(float f, float f2, byte b) {
            this(f, f2, MapboxConstants.MINIMUM_ZOOM, 1.0f);
        }

        private a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        /* synthetic */ a(float f, float f2, float f3, float f4, byte b) {
            this(f, f2, f3, f4);
        }
    }

    static {
        r1 = new a[9][];
        r1[0] = new a[]{new a((float) MapboxConstants.MINIMUM_ZOOM, 1.02f, (short) 0)};
        r1[1] = new a[]{new a(-0.35f, 1.02f, (short) 0), new a(0.35f, 1.02f, (short) 0)};
        r1[2] = new a[]{new a(-0.5f, 1.02f, (short) 0), new a(0.5f, 1.02f, (short) 0), new a(-0.03f, 1.15f, MapboxConstants.MINIMUM_ZOOM, 0.95f, (byte) 0)};
        r1[3] = new a[]{new a(-0.6f, 1.02f, (short) 0), new a(0.6f, 1.02f, (short) 0), new a(-0.2f, 1.25f, MapboxConstants.MINIMUM_ZOOM, 0.95f, (byte) 0), new a(0.2f, 1.25f, MapboxConstants.MINIMUM_ZOOM, 0.95f, (byte) 0)};
        r1[4] = new a[]{new a(-0.63f, 1.0f, 0), new a(0.63f, 1.0f, 0), new a(-0.37f, 1.35f, MapboxConstants.MINIMUM_ZOOM, 0.95f, (byte) 0), new a(0.37f, 1.35f, MapboxConstants.MINIMUM_ZOOM, 0.95f, (byte) 0), new a(0.01f, 1.45f, MapboxConstants.MINIMUM_ZOOM, 0.93f, (byte) 0)};
        a[] aVarArr = c;
        r1[5] = aVarArr;
        r1[6] = aVarArr;
        r1[7] = aVarArr;
        r1[8] = aVarArr;
        a = r1;
        r1 = new a[12][];
        r1[0] = new a[]{new a(0.01f, 1.0f, (short) 0)};
        r1[1] = new a[]{new a(0.2f, 1.0f, (short) 0), new a(-0.2f, 1.0f, (short) 0)};
        r1[2] = new a[]{new a(0.01f, 0.95f, (short) 0), new a(-0.3f, 1.0f, 4.0f, 0.96f, (byte) 0), new a(0.3f, 1.0f, -4.0f, 0.96f, (byte) 0)};
        r1[3] = new a[]{new a(0.2f, 0.95f, (short) 0), new a(-0.2f, 0.95f, (short) 0), new a(-0.4f, 1.05f, 6.0f, 0.96f, (byte) 0), new a(0.4f, 1.05f, -6.0f, 0.96f, (byte) 0)};
        aVarArr = d;
        r1[4] = aVarArr;
        r1[5] = aVarArr;
        r1[6] = aVarArr;
        r1[7] = aVarArr;
        r1[8] = aVarArr;
        r1[9] = aVarArr;
        r1[10] = aVarArr;
        r1[11] = aVarArr;
        b = r1;
    }

    public static float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        float f = Float.MIN_VALUE;
        int i2 = 0;
        for (a aVar : a[Math.min(i, 9) - 1]) {
            if (f < aVar.b) {
                f = aVar.b;
            }
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return ((f - 1.0f) / 2.0f) + 1.0f;
    }

    public static String a(acqw acqw, c cVar) {
        String str;
        if (1.a[cVar.ordinal()] != 1) {
            if (!(acqw == null || acqw.c == null)) {
                str = acqw.c;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            return "10220701";
        }
        if (!(acqw == null || acqw.b == null)) {
            str = acqw.b;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "10220700";
    }

    public static String b(acqw acqw, c cVar) {
        if (acqw != null) {
            String str = acqw.a;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        int i = 1.a[cVar.ordinal()];
        String str2 = "10220700";
        return (i == 1 || i != 2) ? str2 : "10220701";
    }
}
