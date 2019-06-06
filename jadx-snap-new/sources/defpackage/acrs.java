package defpackage;

import defpackage.ssj.a;
import defpackage.ssj.a.o;
import java.util.List;

/* renamed from: acrs */
public final class acrs implements ajfb<actc> {
    private int a;
    private final acrv b;
    private final List<acuu> c;
    private final stl d;

    public acrs(acrv acrv, List<? extends acuu> list, stl stl) {
        akcr.b(acrv, "mapPlaybackAnimations");
        akcr.b(list, "poiSceneObjects");
        akcr.b(stl, "presenterContext");
        this.b = acrv;
        this.c = list;
        this.d = stl;
    }

    private final void a(acuu acuu, stl stl) {
        sri b = this.b.b(acuu);
        Object obj = acuu.k().a.f;
        akcr.a(obj, "sceneObject.poiContainer…ointOfInterest.thumbnails");
        alkh alkh = (alkh) ajyi.a((Object[]) obj, 0);
        stl.e().a((a) new o(alkh != null ? alkh.b() : null, b));
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (r2 != null) goto L_0x0026;
     */
    public final /* synthetic */ void accept(java.lang.Object r2) {
        /*
        r1 = this;
        r2 = (defpackage.actc) r2;
        if (r2 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = defpackage.acrt.a;
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        if (r2 == r0) goto L_0x002c;
    L_0x0010:
        r0 = 2;
        if (r2 == r0) goto L_0x0014;
    L_0x0013:
        goto L_0x002b;
    L_0x0014:
        r2 = r1.a;
        r2 = r2 + -1;
        r1.a = r2;
        r2 = r1.c;
        r0 = r1.a;
        r2 = defpackage.ajyu.a(r2, r0);
        r2 = (defpackage.acuu) r2;
        if (r2 == 0) goto L_0x002b;
    L_0x0026:
        r0 = r1.d;
        r1.a(r2, r0);
    L_0x002b:
        return;
    L_0x002c:
        r2 = r1.a;
        r2 = r2 + r0;
        r1.a = r2;
        r2 = r1.c;
        r0 = r1.a;
        r2 = defpackage.ajyu.a(r2, r0);
        r2 = (defpackage.acuu) r2;
        if (r2 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0026;
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrs.accept(java.lang.Object):void");
    }
}
