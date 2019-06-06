package defpackage;

import defpackage.ebp.b;
import defpackage.ebp.c;
import defpackage.ebp.d;
import defpackage.ebp.e;
import defpackage.ebp.f;

/* renamed from: tpu */
public final class tpu {
    public static final aasc a(aeew aeew) {
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
        aesf a2 = aesf.a(aeew.a);
        akcr.a((Object) a2, str);
        return abyp.d(a2) ? aasc.VIDEO_NO_SOUND : null;
    }

    public static final aasc a(ebp ebp) {
        akcr.b(ebp, "receiver$0");
        if ((ebp instanceof c) || (ebp instanceof b)) {
            return aasc.IMAGE;
        }
        if ((ebp instanceof f) || (ebp instanceof e)) {
            return aasc.VIDEO;
        }
        if (ebp instanceof d) {
            return null;
        }
        throw new ajxk();
    }
}
