package defpackage;

import android.text.TextUtils;
import com.google.common.base.Supplier;
import defpackage.aesm.a;
import java.util.Iterator;
import java.util.List;

/* renamed from: ibk */
public final class ibk implements hyy {
    private final hyw a;
    private final ajwy<hyk> b;
    private final ajwy<hys> c;
    private final Supplier<byte[]> d;

    ibk(hyw hyw, ajwy<hyk> ajwy, ajwy<hys> ajwy2, Supplier<byte[]> supplier) {
        this.a = hyw;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = supplier;
    }

    private icj a(aenb aenb, String str) {
        if (aenb.a == null) {
            return new icj(false, false);
        }
        return a(aenb.O, ibk.a(aenb.P), icg.a(aenb.w, Boolean.valueOf(Boolean.TRUE.equals(aenb.M)), aenb.I, aenb.C), str, TextUtils.isEmpty(aenb.E) ^ 1);
    }

    private icj a(icg icg, String str, String str2, boolean z) {
        String a = abne.a((byte[]) this.d.get());
        if (TextUtils.isEmpty(a)) {
            ((hyk) this.b.get()).b("no_beta_".concat(String.valueOf(str2)), z, null);
            return new icj(true, true);
        } else if (!icg.d.containsKey(a)) {
            ((hyk) this.b.get()).b("beta_mismatch_".concat(String.valueOf(str2)), z, a);
            hyv c = this.a.c("retry_service_retry_beta_mismatch");
            if (c != null) {
                c.a(str, false, str2);
            }
            return new icj(true, false);
        } else if (((ahqf) icg.d.get(a)).k.intValue() == 9) {
            return new icj(false, false);
        } else {
            ((hyk) this.b.get()).b("version_mismatch_".concat(String.valueOf(str2)), z, a);
            return new icj(true, false);
        }
    }

    private icj a(String str, boolean z, icg icg, String str2, boolean z2) {
        return (icg == null || z) ? new icj(false, false) : a(icg, str, str2, z2);
    }

    private static boolean a(Integer num) {
        int a = abpp.a(num, -1);
        return (a == 0 || a == 1) ? false : true;
    }

    public final icj a(aesm aesm) {
        if (!(aesm instanceof aevu) || aesm.b() != a.RECEIVED_SNAP) {
            return new icj(false, false);
        }
        aevu aevu = (aevu) aesm;
        String str = aevu.d;
        if (TextUtils.isEmpty(str)) {
            return new icj(false, false);
        }
        return a(str, ibk.a(aevu.c), icg.a(aevu.x, Boolean.valueOf(Boolean.TRUE.equals(aevu.P)), aevu.L, aevu.B), "sccp_message", TextUtils.isEmpty(aevu.E) ^ 1);
    }

    public final boolean a(List<aefi> list, String str) {
        hyr a = ((hys) this.c.get()).a(hyt.FIDELIUS_SUPPRESS_FILTER_LATENCY).a();
        while (true) {
            boolean z = false;
            for (aefi aefi : list) {
                boolean z2;
                aenb aenb = aefi.c;
                if (aenb != null) {
                    icj a2 = a(aenb, str);
                    if (a2.a) {
                        aefi.c = null;
                    }
                    z2 = a2.b;
                } else {
                    z2 = false;
                }
                aeft aeft = aefi.j;
                if (aeft != null) {
                    List list2 = aeft.b;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            aenb aenb2 = ((aegn) it.next()).a;
                            if (aenb2 != null) {
                                icj a3 = a(aenb2, str);
                                if (a3.a) {
                                    it.remove();
                                }
                                z2 = z2 || a3.b;
                            }
                        }
                    }
                }
                List list3 = aefi.i;
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        icj a4 = a((aenb) it2.next(), str);
                        if (a4.a) {
                            it2.remove();
                        }
                        z2 = z2 || a4.b;
                    }
                }
                if (z || r4) {
                    z = true;
                }
            }
            ((hyk) this.b.get()).b(a);
            return z;
        }
    }
}
