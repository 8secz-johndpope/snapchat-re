package defpackage;

import android.graphics.Rect;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.snap.ui.view.TakeSnapButton;
import defpackage.acmj.a;
import defpackage.acvu.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: acqp */
public final class acqp {
    public acmi a;

    private static String a(String str, ImmutableList<acvm> immutableList) {
        if (str != null) {
            UnmodifiableIterator it = immutableList.iterator();
            while (it.hasNext()) {
                if (str.equals(((acvm) it.next()).a)) {
                    return str;
                }
            }
        }
        UnmodifiableIterator it2 = immutableList.iterator();
        while (it2.hasNext()) {
            acvm acvm = (acvm) it2.next();
            if (acvm.b.q instanceof acwa) {
                return acvm.a;
            }
        }
        return ((acvm) immutableList.get(0)).a;
    }

    private void a(acqq acqq, acmj acmj, acwk acwk, String str) {
        this.a = acqq.a(acmj, acqp.a(str, acwk.c()));
    }

    public final void a(aclo aclo, adbv adbv) {
        aclo.f();
        final acmi acmi = this.a;
        if (acmi != null) {
            acmj j = adbv.j();
            if (j != null) {
                j.a(acmi.a, acmi.b, (int) TakeSnapButton.LONG_PRESS_TIME, new a() {
                    public final void a() {
                    }

                    public final void b() {
                    }
                });
                this.a = null;
            }
        }
    }

    public final void a(String str, b bVar, acqq acqq, aclg aclg, Rect rect) {
        String str2 = str;
        b bVar2 = bVar;
        acqq acqq2 = acqq;
        aclg aclg2 = aclg;
        Rect rect2 = rect;
        acmj j = aclg2.a.j();
        if (!(j == null || bVar2 == null || bVar2.a.isEmpty())) {
            Object obj;
            if (bVar2.a.size() == 1 && ((acwk) bVar2.a.get(0)).k.size() == 1) {
                obj = bVar2.a.get(0);
            } else {
                List arrayList = new ArrayList();
                Iterator it = bVar2.a.iterator();
                acvp acvp = null;
                acvp acvp2 = null;
                acvp acvp3 = acvp2;
                while (it.hasNext()) {
                    Iterator it2;
                    acwk acwk = (acwk) it.next();
                    for (alhm alhm : acwk.k) {
                        it2 = it;
                        arrayList.add(new je(Float.valueOf(alhm.c), Float.valueOf(alhm.d)));
                        it = it2;
                    }
                    it2 = it;
                    if (acvp == null || acvp.d.a > acwk.a.d.a) {
                        acvp = acwk.a;
                    }
                    if (acvp2 == null || acvp2.d.c < acwk.a.d.c) {
                        acvp2 = acwk.a;
                    }
                    if (acvp3 == null || acvp3.d.b < acwk.a.d.b) {
                        acvp3 = acwk.a;
                    }
                    it = it2;
                }
                final cgj b = adbu.b(arrayList);
                if (b != null) {
                    int a = acvp != null ? (adbu.a(acvp.d.c, j.c()) - adbu.a(acvp.d.a, j.c())) / 2 : 0;
                    Rect rect3 = new Rect();
                    rect3.left = rect2.left + a;
                    rect3.right = rect2.right + (acvp2 != null ? (adbu.a(acvp2.d.c, j.c()) - adbu.a(acvp2.d.a, j.c())) / 2 : 0);
                    rect3.top = rect2.top + (acvp3 != null ? (adbu.b(acvp3.d.d, j.d()) - adbu.b(acvp3.d.b, j.d())) / 2 : 0);
                    rect3.bottom = rect2.bottom;
                    acmj j2 = aclg2.a.j();
                    if (j2 != null && aclg2.a.e()) {
                        double i = j2.i();
                        acmg b2 = j.b(b, rect3);
                        if (b2 == null || Double.compare(b2.d, i) != 0) {
                            adbu.a(b, rect3, aclg2.a, new a() {
                                public final void a() {
                                }

                                public final void b() {
                                }
                            });
                        } else {
                            obj = bVar2.a.get(0);
                        }
                    }
                } else {
                    return;
                }
            }
            a(acqq2, j, (acwk) obj, str2);
        }
    }
}
