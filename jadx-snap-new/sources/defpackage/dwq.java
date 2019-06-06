package defpackage;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: dwq */
final class dwq extends dvf {

    /* renamed from: dwq$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[ecc.values().length];
        static final /* synthetic */ int[] b = new int[ecd.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.ecd.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.ecd.AUTO;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.ecd.CONTINUOUS_PICTURE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = defpackage.ecd.CONTINUOUS_VIDEO;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = defpackage.ecc.values();
            r3 = r3.length;
            r3 = new int[r3];
            a = r3;
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = defpackage.ecc.OFF;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x003d }
        L_0x003d:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = defpackage.ecc.TORCH;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = defpackage.ecc.SINGLE_FLASH;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0051 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0051 }
        L_0x0051:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dwq$1.<clinit>():void");
        }
    }

    public static abpr a(Parameters parameters, boolean z, dpf dpf) {
        try {
            float horizontalViewAngle = parameters.getHorizontalViewAngle();
            float verticalViewAngle = parameters.getVerticalViewAngle();
            if (horizontalViewAngle >= 5.8f && verticalViewAngle >= 5.8f && horizontalViewAngle < 180.0f && verticalViewAngle < 180.0f) {
                return new abpr(horizontalViewAngle, verticalViewAngle);
            }
        } catch (NullPointerException | NumberFormatException unused) {
        }
        abpr m = dpf.m(z);
        return m == null ? dvf.a : dvf.a(m, parameters.getFocalLength(), dvf.a);
    }

    public static dwj a(int i) {
        dvf.b();
        try {
            Camera open = Camera.open(i);
            if (open != null) {
                return new dwj(open);
            }
            throw new ecr("null camera from open call");
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public static ecc a(String str) {
        if (str == null) {
            return ecc.UNKNOWN;
        }
        int i = -1;
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 110547964 && str.equals("torch")) {
                    i = 1;
                }
            } else if (str.equals("off")) {
                i = 0;
            }
        } else if (str.equals("on")) {
            i = 2;
        }
        return i != 0 ? i != 1 ? i != 2 ? ecc.UNKNOWN : ecc.SINGLE_FLASH : ecc.TORCH : ecc.OFF;
    }

    public static String a(ecd ecd) {
        int i = 1.b[ecd.ordinal()];
        if (i == 1) {
            return "auto";
        }
        if (i == 2) {
            return "continuous-picture";
        }
        if (i == 3) {
            return "continuous-video";
        }
        throw new IllegalStateException("unexpected ScFocusMode ".concat(String.valueOf(ecd)));
    }

    public static List<ecd> a(Parameters parameters) {
        ArrayList arrayList = new ArrayList();
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (String b : supportedFocusModes) {
                ecd b2 = dwq.b(b);
                if (b2 != ecd.UNKNOWN) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    public static ecd b(String str) {
        if (str == null) {
            return ecd.UNKNOWN;
        }
        int i = -1;
        int hashCode = str.hashCode();
        if (hashCode != -194628547) {
            if (hashCode != 3005871) {
                if (hashCode == 910005312 && str.equals("continuous-picture")) {
                    i = 1;
                }
            } else if (str.equals("auto")) {
                i = 0;
            }
        } else if (str.equals("continuous-video")) {
            i = 2;
        }
        return i != 0 ? i != 1 ? i != 2 ? ecd.UNKNOWN : ecd.CONTINUOUS_VIDEO : ecd.CONTINUOUS_PICTURE : ecd.AUTO;
    }

    public static List<ecb> b(List<int[]> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new ecb(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<abtl> c(List<Size> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Size size : list) {
            if (size != null) {
                arrayList.add(new abtl(size.width, size.height));
            }
        }
        return arrayList;
    }
}
