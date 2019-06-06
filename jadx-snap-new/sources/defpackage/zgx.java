package defpackage;

import android.app.Activity;
import com.snap.ui.view.CustomVolumeView;
import com.snap.ui.view.ViewStubWrapper;
import com.snapchat.android.R;
import defpackage.zhb.a;

/* renamed from: zgx */
public final class zgx extends a {
    private final Activity a;
    private final int b = R.id.custom_volume_stub;
    private final achb<zjm, zjk> c;
    private final zkq d;
    private final ajei e;
    private ViewStubWrapper<CustomVolumeView> f;

    public zgx(Activity activity, achb<zjm, zjk> achb, zkq zkq, ajei ajei) {
        this.a = activity;
        this.c = achb;
        this.d = zkq;
        this.e = ajei;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A:{RETURN} */
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
        r3 = this;
        r5 = r5.getAction();
        r0 = 0;
        if (r5 != 0) goto L_0x0066;
    L_0x0007:
        r5 = 25;
        r1 = 24;
        if (r4 == r5) goto L_0x000f;
    L_0x000d:
        if (r4 != r1) goto L_0x0066;
    L_0x000f:
        r5 = r3.c;
        r5 = r5.c;
        r2 = 1;
        if (r5 == 0) goto L_0x0026;
    L_0x0016:
        r5 = r3.c;
        r5 = r5.h();
        r5 = (defpackage.zjm) r5;
        if (r5 == 0) goto L_0x0026;
    L_0x0020:
        r5 = r5.j;
        if (r5 == 0) goto L_0x0026;
    L_0x0024:
        r5 = 1;
        goto L_0x0027;
    L_0x0026:
        r5 = 0;
    L_0x0027:
        if (r5 != 0) goto L_0x002a;
    L_0x0029:
        return r0;
    L_0x002a:
        if (r4 != r1) goto L_0x002e;
    L_0x002c:
        r4 = 1;
        goto L_0x002f;
    L_0x002e:
        r4 = -1;
    L_0x002f:
        r5 = r3.f;
        if (r5 != 0) goto L_0x0058;
    L_0x0033:
        r5 = new com.snap.ui.view.ViewStubWrapper;
        r0 = r3.a;
        r1 = 2131428211; // 0x7f0b0373 float:1.847806E38 double:1.0530654556E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.view.ViewStub) r0;
        r5.<init>(r0);
        r3.f = r5;
        r5 = r3.e;
        r0 = r3.f;
        r0 = r0.get();
        r0 = (com.snap.ui.view.CustomVolumeView) r0;
        r1 = r3.d;
        r0 = r0.setInsetsDetector(r1);
        r5.a(r0);
    L_0x0058:
        r5 = r3.f;
        r5 = r5.get();
        r5 = (com.snap.ui.view.CustomVolumeView) r5;
        r0 = r3.a;
        r5.onVolumeLevelChanged(r0, r4);
        return r2;
    L_0x0066:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgx.onKeyDown(int, android.view.KeyEvent):boolean");
    }
}
