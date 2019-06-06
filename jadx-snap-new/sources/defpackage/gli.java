package defpackage;

import defpackage.rzf.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gli */
public final class gli {
    final a a;
    final Map<String, Integer> b;

    /* renamed from: gli$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Map<String, Integer> a(String str) {
            try {
                HashMap hashMap = new HashMap();
                if (str == null) {
                    return ajyx.a;
                }
                for (String a : akgc.a((CharSequence) str, new String[]{ppy.b}, 0, 6)) {
                    String a2;
                    List a3 = akgc.a((CharSequence) a2, new String[]{"="}, 0, 6);
                    if (a3.size() == 2) {
                        String str2 = (String) a3.get(0);
                        String str3 = "null cannot be cast to non-null type kotlin.CharSequence";
                        if (str2 != null) {
                            str2 = akgc.b(str2).toString();
                            a2 = (String) a3.get(1);
                            if (a2 != null) {
                                hashMap.put(str2, Integer.valueOf(Integer.parseInt(akgc.b(a2).toString())));
                            } else {
                                throw new ajxt(str3);
                            }
                        }
                        throw new ajxt(str3);
                    }
                    throw new IllegalArgumentException();
                }
                return hashMap;
            } catch (Exception unused) {
                return ajyx.a;
            }
        }
    }

    static {
        a aVar = new a();
    }

    public gli(a aVar, Map<String, Integer> map) {
        akcr.b(aVar, "queueType");
        akcr.b(map, "limitByContentType");
        this.a = aVar;
        this.b = map;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.gli;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.gli) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gli.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Map map = this.b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentTypeConcurrencyConfiguration(queueType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", limitByContentType=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
