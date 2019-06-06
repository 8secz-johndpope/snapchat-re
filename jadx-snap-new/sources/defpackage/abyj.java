package defpackage;

import com.brightcove.player.captioning.TTMLParser.Attributes;
import java.util.Set;

/* renamed from: abyj */
public final class abyj {
    private static final Set<aesf> a = ajzt.a((Object[]) new aesf[]{aesf.GIF, aesf.AUDIO});

    public static final aasc a(int i) {
        aasc[] values = aasc.values();
        return (i < 0 || i >= values.length) ? null : values[i];
    }

    public static final Long a(aeew aeew) {
        akcr.b(aeew, "receiver$0");
        Object obj = aeew.a;
        akcr.a(obj, "this.mediaType");
        long j = abyp.i(obj.intValue()) ? 2 : akcr.a(aeew.k, Boolean.TRUE) ? 1 : 0;
        return Long.valueOf(j);
    }

    /* JADX WARNING: Missing block: B:14:0x0052, code skipped:
            if ((r0 != null ? (int) r0.longValue() : 0) > 11000) goto L_0x0054;
     */
    public static final boolean a(defpackage.abyi r5) {
        /*
        r0 = "mediaPackage";
        defpackage.akcr.b(r5, r0);
        r0 = r5.e;
        r0 = r0.a;
        r1 = "this.mediaType";
        defpackage.akcr.a(r0, r1);
        r0 = r0.intValue();
        r0 = defpackage.abyp.c(r0);
        if (r0 != 0) goto L_0x005c;
    L_0x0018:
        r0 = a;
        r1 = r5.e;
        r1 = r1.a;
        r1 = defpackage.aesf.a(r1);
        r2 = "MediaType.fromValue(this.mediaType)";
        defpackage.akcr.a(r1, r2);
        r0 = r0.contains(r1);
        if (r0 != 0) goto L_0x005c;
    L_0x002d:
        r0 = r5.a();
        r0 = r0.b;
        r1 = r5.e;
        r1 = r1.u;
        r2 = 0;
        if (r1 == 0) goto L_0x0040;
    L_0x003a:
        r3 = r1.longValue();
        r1 = (int) r3;
        goto L_0x0041;
    L_0x0040:
        r1 = 0;
    L_0x0041:
        if (r0 != r1) goto L_0x0054;
    L_0x0043:
        r0 = r5.e;
        r0 = r0.u;
        if (r0 == 0) goto L_0x004f;
    L_0x0049:
        r0 = r0.longValue();
        r1 = (int) r0;
        goto L_0x0050;
    L_0x004f:
        r1 = 0;
    L_0x0050:
        r0 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
        if (r1 <= r0) goto L_0x005c;
    L_0x0054:
        r5 = r5.g;
        r0 = defpackage.abyl.ZIPPED;
        if (r5 != r0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        return r2;
    L_0x005c:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyj.a(abyi):boolean");
    }

    public static final abtl b(aeew aeew) {
        akcr.b(aeew, "receiver$0");
        Object obj = aeew.q;
        Integer num = aeew.p;
        Integer num2 = aeew.b;
        Object obj2 = null;
        if ((num2 != null ? num2.intValue() : 0) % 180 != 0) {
            obj2 = 1;
        }
        Object obj3 = obj2 != null ? num : obj;
        if (obj2 == null) {
            obj = num;
        }
        akcr.a(obj3, "outWidth");
        int intValue = obj3.intValue();
        akcr.a(obj, "outHeight");
        return new abtl(intValue, obj.intValue());
    }

    public static final abtl c(aeew aeew) {
        akcr.b(aeew, "receiver$0");
        abtl b = abyj.b(aeew);
        Float f = aeew.d;
        float f2 = 1.0f;
        float floatValue = f != null ? f.floatValue() : 1.0f;
        Float f3 = aeew.e;
        if (f3 != null) {
            f2 = f3.floatValue();
        }
        return new abtl(akdp.a(((float) b.b()) * floatValue), akdp.a(((float) b.c()) * f2));
    }

    public static final aasc d(aeew aeew) {
        akcr.b(aeew, "receiver$0");
        Object obj = aeew.a;
        akcr.a(obj, "this.mediaType");
        if (abyp.c(obj.intValue())) {
            return aasc.IMAGE;
        }
        aesf a = aesf.a(aeew.a);
        String str = "MediaType.fromValue(this.mediaType)";
        akcr.a((Object) a, str);
        if (abyp.c(a)) {
            return aasc.VIDEO;
        }
        a = aesf.a(aeew.a);
        akcr.a((Object) a, str);
        if (abyp.d(a)) {
            return aasc.VIDEO_NO_SOUND;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid media type: ");
        Object a2 = aesf.a(aeew.a);
        akcr.a(a2, str);
        stringBuilder.append(a2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final aeew e(aeew aeew) {
        akcr.b(aeew, Attributes.ORIGIN);
        aeew aeew2 = new aeew();
        aeew2.f = aeew.f;
        aeew2.s = aeew.s;
        aeew2.i = aeew.i;
        aeew2.g = aeew.g;
        aeew2.h = aeew.h;
        aeew2.p = aeew.p;
        aeew2.e = aeew.e;
        aeew2.j = aeew.j;
        aeew2.k = aeew.k;
        aeew2.l = aeew.l;
        aeew2.c = aeew.c;
        aeew2.m = aeew.m;
        aeew2.w = aeew.w;
        aeew2.n = aeew.n;
        aeew2.o = aeew.o;
        aeew2.a = aeew.a;
        aeew2.b = aeew.b;
        aeew2.r = aeew.r;
        aeew2.t = aeew.t;
        aeew2.u = aeew.u;
        aeew2.q = aeew.q;
        aeew2.d = aeew.d;
        aeew2.v = aeew.v;
        aeew2.x = aeew.x;
        aeew2.y = aeew.y;
        return aeew2;
    }
}
