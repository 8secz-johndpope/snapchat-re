package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import defpackage.absj.a;
import defpackage.adbv.b;
import defpackage.adbv.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: acqj */
public final class acqj implements b, c {
    public boolean a = false;
    private final adcc b = new adcc();
    private final aclu c;
    private final boolean d;
    private int e;
    private int f;
    private int g;
    private boolean h = false;
    private final WeakReference<a> i;
    private final ajwo<cgi> j = new ajwo();
    private final ajdp<cgi> k = this.j.f();
    private final int l;

    /* renamed from: acqj$a */
    public interface a {
        void a();

        void a(acuu acuu, List<acuu> list);

        void a(acxz acxz);

        void a(cgi cgi);

        aclg b();

        void c();

        acqp d();

        acqq e();
    }

    public acqj(Context context, a aVar, aclu aclu, boolean z) {
        this.l = abtp.b(20.0f, context);
        this.i = new WeakReference(aVar);
        this.c = aclu;
        this.d = z;
    }

    private static Object a(aclg aclg, cgi cgi) {
        ackt ackt = aclg.u;
        return ackt == null ? null : ackt.a(aclg.a, cgi, 1);
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void a(cgi cgi) {
        a aVar = (a) this.i.get();
        if (aVar != null) {
            aclg b = aVar.b();
            aclo aclo = b.f;
            if (b.a.e()) {
                Object a = acqj.a(b, cgi);
                if (!(a instanceof adag.b)) {
                    boolean z = false;
                    b.h.a(false);
                    List list = null;
                    if (a instanceof acvu.b) {
                        if (!this.a && !this.h) {
                            b.t.a(b);
                            acvu.b bVar = (acvu.b) a;
                            b.g.a(null, null);
                            acvm d = aclo.h.d();
                            if (d != null) {
                                boolean z2 = false;
                                for (acwk acwk : bVar.a) {
                                    if (!acwk.b()) {
                                        for (alhm alhm : acwk.k) {
                                            for (alhq alhq : alhm.e) {
                                                if (TextUtils.equals(alhq.a, d.a)) {
                                                    aVar.d().a(b.f, b.a);
                                                    z2 = true;
                                                    continue;
                                                    break;
                                                }
                                            }
                                            if (z2) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                z = z2;
                            }
                            if (!z) {
                                acqp d2 = aVar.d();
                                String a2 = b.s.a();
                                acqq e = aVar.e();
                                int i = this.l;
                                int b2 = (a.a.b() + i) + this.g;
                                int i2 = this.l;
                                d2.a(a2, bVar, e, b, new Rect(i, b2, i2, (this.e + i2) + this.f));
                            }
                        } else {
                            return;
                        }
                    } else if (a instanceof acuu) {
                        acuu acuu = (acuu) a;
                        if (a instanceof acxz) {
                            acxz acxz = (acxz) a;
                            aVar.a(acxz);
                            aclt aclt = this.c.a;
                            String str = acxz.e.a.b;
                            aark aark = new aark();
                            if (aclt.a > 0) {
                                aark.a = Long.valueOf(aclt.a);
                            }
                            aark.f = str;
                            aclt.b.a(aark);
                            return;
                        }
                        ackq d3 = b.d();
                        if (d3 != null) {
                            list = new ArrayList(d3.b);
                        }
                        if (list == null) {
                            list = Collections.emptyList();
                        }
                        Collections.sort(list, this.b);
                        aVar.a(acuu, list);
                    } else if (!this.a) {
                        b.t.a(b);
                        aVar.a(cgi);
                    }
                    b.t.a(b);
                    this.j.a((Object) cgi);
                }
            }
        }
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a_(cgi cgi) {
        a aVar = (a) this.i.get();
        if (aVar != null) {
            this.c.b.d.a();
            aclg b = aVar.b();
            if (b.a.e()) {
                Object a = acqj.a(b, cgi);
                if (a instanceof acuu) {
                    aljy aljy = ((acuu) a).k().a;
                    Object obj = null;
                    if (!(aljy.j == 2 || aljy.k == null || aljy.k.b == null)) {
                        aVar.a();
                        obj = 1;
                    }
                    if (obj != null) {
                        return;
                    }
                }
                aVar.c();
            }
        }
    }

    public final void b(int i) {
        this.f = i;
    }

    public final void c(int i) {
        this.g = i;
    }
}
