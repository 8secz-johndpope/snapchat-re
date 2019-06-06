package defpackage;

import android.app.admin.DevicePolicyManager;
import android.graphics.Rect;
import android.graphics.RectF;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.framework.misc.AppContext;
import java.util.List;

/* renamed from: dvf */
public class dvf {
    public static final abpr a = new abpr(59.0f, 42.0f);

    public static int a(boolean z, ede[] edeArr) {
        for (int i = 0; i < edeArr.length; i++) {
            if (edeArr[i].a() == z) {
                return i;
            }
        }
        return -1;
    }

    public static abpr a(abpr abpr, float f, abpr abpr2) {
        if (f <= MapboxConstants.MINIMUM_ZOOM || abpr.a <= MapboxConstants.MINIMUM_ZOOM || abpr.b <= MapboxConstants.MINIMUM_ZOOM) {
            return abpr2;
        }
        double d = (double) f;
        return new abpr((float) (Math.toDegrees(Math.atan2((double) (abpr.a / 2.0f), d)) * 2.0d), (float) (Math.toDegrees(Math.atan2((double) (abpr.b / 2.0f), d)) * 2.0d));
    }

    public static ecb a(List<ecb> list) {
        ecb ecb = new ecb(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (ecb ecb2 : list) {
            if (ecb2.b < ecb.b || (ecb2.b == ecb.b && ecb2.a < ecb.a)) {
                ecb = ecb2;
            }
        }
        return ecb;
    }

    public static ecc a() {
        return dpg.a().m() ? ecc.TORCH : ecc.SINGLE_FLASH;
    }

    public static ecd a(List<ecd> list, boolean z, ecd ecd) {
        Object obj = z ? ecd.CONTINUOUS_VIDEO : ecd.CONTINUOUS_PICTURE;
        return list.contains(obj) ? obj : ecd;
    }

    public static void a(RectF rectF, Rect rect) {
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
    }

    /* JADX WARNING: Missing block: B:6:0x000b, code skipped:
            if (r3 != 3) goto L_0x001e;
     */
    public static boolean a(defpackage.ede r2, int r3) {
        /*
        r2 = r2.c;
        r0 = 1;
        if (r3 == 0) goto L_0x0015;
    L_0x0005:
        if (r3 == r0) goto L_0x000e;
    L_0x0007:
        r1 = 2;
        if (r3 == r1) goto L_0x0015;
    L_0x000a:
        r1 = 3;
        if (r3 == r1) goto L_0x000e;
    L_0x000d:
        goto L_0x001e;
    L_0x000e:
        if (r2 == 0) goto L_0x0014;
    L_0x0010:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r2 != r3) goto L_0x001e;
    L_0x0014:
        return r0;
    L_0x0015:
        r3 = 90;
        if (r2 == r3) goto L_0x0020;
    L_0x0019:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r2 != r3) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r2 = 0;
        return r2;
    L_0x0020:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvf.a(ede, int):boolean");
    }

    public static boolean a(List<ecd> list, ecd ecd) {
        return list.contains(ecd);
    }

    public static void b() {
        DevicePolicyManager devicePolicyManager;
        try {
            devicePolicyManager = (DevicePolicyManager) AppContext.get().getSystemService("device_policy");
        } catch (Exception unused) {
            devicePolicyManager = null;
        }
        if (devicePolicyManager != null && devicePolicyManager.getCameraDisabled(null)) {
            throw new ecq("device policy has disabled the camera");
        }
    }
}
