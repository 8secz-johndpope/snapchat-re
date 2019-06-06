package defpackage;

import defpackage.adbe.b;
import java.lang.ref.WeakReference;

/* renamed from: adbf */
public class adbf {
    private final WeakReference<adbe> a;
    private final int b;
    private final adaq c;
    private final WeakReference<b> d;

    adbf(b bVar, adaq adaq, adbe adbe, int i) {
        this.c = adaq;
        this.b = i;
        this.a = new WeakReference(adbe);
        this.d = new WeakReference(bVar);
    }

    public final void a() {
        adbe adbe = (adbe) this.a.get();
        if (adbe != null) {
            adbe.d(this.c);
        }
    }

    public final void a(ajei ajei, kaz<jwj> kaz) {
        adbe adbe = (adbe) this.a.get();
        try {
            ajej a = kaz.a("MapBitmojiResultCallback");
            if (adbe != null) {
                acua a2 = acua.a((kaz) a);
                adbe.d(this.c);
                adaq adaq = this.c;
                adbe.a.a(adaq, new adao(adaq, a2, false));
                String str = this.c.a;
                b bVar = (b) this.d.get();
                if (bVar != null) {
                    bVar.a(str);
                }
            }
            ajei.a(a);
        } catch (Exception unused) {
        } finally {
            kaz.dispose();
        }
    }
}
