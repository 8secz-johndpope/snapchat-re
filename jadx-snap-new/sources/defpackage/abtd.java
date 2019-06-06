package defpackage;

import android.media.CamcorderProfile;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.abtm.a;

/* renamed from: abtd */
final class abtd implements a {
    private final Supplier<abtl> a = Suppliers.memoize(new 1());

    /* renamed from: abtd$1 */
    class 1 implements Supplier<abtl> {
        1() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
        public final /* synthetic */ java.lang.Object get() {
            /*
            r4 = this;
            r0 = 1;
            r1 = defpackage.abtd.a(r0);
            if (r1 == 0) goto L_0x000c;
        L_0x0007:
            r0 = android.media.CamcorderProfile.get(r0);
            goto L_0x0015;
        L_0x000c:
            r0 = 0;
            r1 = defpackage.abtd.a(r0);
            if (r1 == 0) goto L_0x0014;
        L_0x0013:
            goto L_0x0007;
        L_0x0014:
            r0 = 0;
        L_0x0015:
            r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            if (r0 == 0) goto L_0x0024;
        L_0x001a:
            r1 = r0.videoFrameHeight;
            r0 = r0.videoFrameWidth;
            if (r1 <= r0) goto L_0x0027;
        L_0x0020:
            r3 = r1;
            r1 = r0;
            r0 = r3;
            goto L_0x0027;
        L_0x0024:
            r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        L_0x0027:
            r2 = new abtl;
            r2.<init>(r1, r0);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abtd$1.get():java.lang.Object");
        }
    }

    abtd() {
    }

    static boolean a(int i) {
        try {
            return CamcorderProfile.hasProfile(i);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public final int a() {
        return ((abtl) this.a.get()).c();
    }

    public final int b() {
        return ((abtl) this.a.get()).b();
    }
}
