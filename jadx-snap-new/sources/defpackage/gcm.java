package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: gcm */
public final class gcm {
    public static final a b = new a();
    public final Map<String, aewk> a;

    /* renamed from: gcm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static gcm a(String str, defpackage.aesx.a aVar, int i) {
            akcr.b(str, "username");
            akcr.b(aVar, "messageState");
            return a.a(str, aVar == defpackage.aesx.a.SAVED, i);
        }

        public static gcm a(String str, boolean z, int i) {
            akcr.b(str, "username");
            aewk aewk = new aewk();
            aewk.a = Boolean.valueOf(z);
            aewk.b = Integer.valueOf(i);
            return a.a(ajzl.a(ajxs.a(str, aewk)));
        }

        public static gcm a(Map<String, ? extends aewk> map) {
            Map map2;
            if (map2 == null) {
                map2 = ajyx.a;
            }
            return new gcm(new HashMap(map2), (byte) 0);
        }
    }

    private gcm(Map<String, ? extends aewk> map) {
        this.a = map;
    }

    public /* synthetic */ gcm(Map map, byte b) {
        this(map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x001c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    public final defpackage.gcm a(defpackage.gcm r6) {
        /*
        r5 = this;
        if (r6 == 0) goto L_0x006d;
    L_0x0002:
        r0 = r6.a;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x006d;
    L_0x000b:
        r0 = new java.util.HashMap;
        r1 = r5.a;
        r0.<init>(r1);
        r6 = r6.a;
        r6 = r6.entrySet();
        r6 = r6.iterator();
    L_0x001c:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x0066;
    L_0x0022:
        r1 = r6.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r5.a;
        r3 = r1.getKey();
        r2 = r2.get(r3);
        r2 = (defpackage.aewk) r2;
        if (r2 == 0) goto L_0x003f;
    L_0x0036:
        r2 = r2.b;
        if (r2 == 0) goto L_0x003f;
    L_0x003a:
        r2 = r2.intValue();
        goto L_0x0040;
    L_0x003f:
        r2 = -1;
    L_0x0040:
        r3 = r1.getValue();
        r3 = (defpackage.aewk) r3;
        r3 = r3.b;
        r4 = "it.value.version";
        defpackage.akcr.a(r3, r4);
        r3 = r3.intValue();
        r2 = defpackage.akcr.a(r2, r3);
        if (r2 >= 0) goto L_0x001c;
    L_0x0057:
        r2 = r0;
        r2 = (java.util.Map) r2;
        r3 = r1.getKey();
        r1 = r1.getValue();
        r2.put(r3, r1);
        goto L_0x001c;
    L_0x0066:
        r0 = (java.util.Map) r0;
        r6 = defpackage.gcm.a.a(r0);
        return r6;
    L_0x006d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcm.a(gcm):gcm");
    }
}
