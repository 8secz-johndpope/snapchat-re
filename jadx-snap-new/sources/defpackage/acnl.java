package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: acnl */
public final class acnl implements acwe {
    private final WeakReference<acnt> a;
    private final WeakReference<acqq> b;
    private final WeakReference<acol> c;

    public acnl(WeakReference<acnt> weakReference, WeakReference<acqq> weakReference2, WeakReference<acol> weakReference3) {
        this.a = weakReference;
        this.b = weakReference2;
        this.c = weakReference3;
    }

    public final void a(String str, String str2) {
        acnt acnt = (acnt) this.a.get();
        if (acnt != null) {
            abmr.a();
            if (acnt.g == null) {
                acnt.a();
            }
            if (acnt.q) {
                acnt.l = acnt.g.h();
                if (str2 == null || !TextUtils.equals(str, str2)) {
                    if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
                        acnt.b.c();
                    }
                    acnt.a.get(str2);
                    if (str2 != null) {
                        Integer num = (Integer) acnt.i.b.get(str2);
                        int intValue = num == null ? -1 : num.intValue();
                        if (intValue != -1) {
                            for (int i = 0; i < acnt.g.getChildCount(); i++) {
                                acnz acnz = (acnz) acnt.g.getChildAt(i);
                                acow b = acnz.c.b();
                                if (b.a.contains(str2)) {
                                    b.a(str2);
                                    acnz.a(b);
                                }
                            }
                            if (acnt.h.c(acnt.g.b()) != intValue || acnt.g.h() == 0) {
                                acnt.g.a(intValue, false);
                            } else {
                                acnt.f.a(str2, aarb.CAROUSEL);
                            }
                            if (acnt.g != null && (acnt.o || !acnt.b())) {
                                acnt.p.reset();
                                acnt.g.clearAnimation();
                                acnt.g.startAnimation(acnt.p);
                            }
                        }
                    } else if (acnt.f.c() == null) {
                        acnt.g();
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                acol acol = (acol) this.c.get();
                if (acol != null) {
                    acol.a();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (!z) {
            acqq acqq = (acqq) this.b.get();
            if (acqq != null) {
                acqq.d();
            }
        }
    }
}
