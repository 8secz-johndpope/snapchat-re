package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: gkv */
public final class gkv {
    static {
        gkv gkv = new gkv();
    }

    private gkv() {
    }

    public static final String a(idl idl) {
        if (idl != null) {
            List hierarchy = idl.getHierarchy();
            if (hierarchy != null) {
                String str = (String) ajyu.g(hierarchy);
                if (str != null) {
                    return str;
                }
            }
        }
        return (String) ajyu.f(idn.a.getHierarchy());
    }

    public static final String a(String str) {
        akcr.b(str, "key");
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return "invalid";
        }
        if (str.length() < 64) {
            return str;
        }
        Object substring = str.substring(0, 63);
        akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String a(boolean z, Set<rzg> set) {
        akcr.b(set, "contexts");
        return gkv.a(z, gkv.a((Set) set));
    }

    /* JADX WARNING: Missing block: B:7:0x000f, code skipped:
            if (r0 == null) goto L_0x0011;
     */
    public static final java.lang.String a(boolean r0, defpackage.rzg r1) {
        /*
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0 = "Query";
        return r0;
    L_0x0005:
        if (r1 == 0) goto L_0x0011;
    L_0x0007:
        r0 = r1.b;
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = r0.name();
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        r0 = "invalid";
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkv.a(boolean, rzg):java.lang.String");
    }

    public static final rzg a(Set<rzg> set) {
        akcr.b(set, "contexts");
        rzg rzg = null;
        for (rzg rzg2 : set) {
            if (rzg == null || rzg2.b.ordinal() < rzg.b.ordinal()) {
                rzg = rzg2;
            }
        }
        return rzg;
    }

    public static void a(iff<? extends Object> iff, akbk<ajxw> akbk) {
        akcr.b(iff, "event");
        akcr.b(akbk, "run");
        if (iff.b.b < 0.1d) {
            akbk.invoke();
        }
    }
}
