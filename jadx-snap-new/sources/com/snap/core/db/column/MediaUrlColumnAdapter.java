package com.snap.core.db.column;

import defpackage.abss;
import defpackage.aesg;
import defpackage.ainu;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akgc;
import java.util.List;

public final class MediaUrlColumnAdapter implements ainu<aesg, String> {
    private final abss releaseManager;

    public MediaUrlColumnAdapter() {
        Object a = abss.a();
        akcr.a(a, "ReleaseManager.getInstance()");
        this(a);
    }

    public MediaUrlColumnAdapter(abss abss) {
        akcr.b(abss, "releaseManager");
        this.releaseManager = abss;
    }

    public final aesg decode(String str) {
        try {
            aesg aesg = new aesg();
            if (str != null) {
                List a = akgc.a((CharSequence) str, new String[]{"\t"}, 0, 6);
                if (a != null) {
                    aesg.a = (String) a.get(0);
                    aesg.b = Long.valueOf(Long.parseLong((String) a.get(1)));
                    aesg.c = (String) a.get(2);
                    aesg.d = (String) a.get(3);
                }
            }
            return aesg;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Unable to decode MediaUrl Error - ");
            stringBuilder.append(e.getMessage());
            stringBuilder.append(" Db value - ");
            stringBuilder.append(str);
            Object stringBuilder2 = stringBuilder.toString();
            akcr.a(stringBuilder2, "StringBuilder()\n        …              .toString()");
            if (!this.releaseManager.k()) {
                return new aesg();
            }
            throw new IllegalStateException(stringBuilder2);
        }
    }

    public final String encode(aesg aesg) {
        akcr.b(aesg, "value");
        return ajyu.a((Iterable) ajym.b(aesg.a, aesg.b, aesg.c, aesg.d), (CharSequence) "\t", null, null, 0, null, (akbl) MediaUrlColumnAdapter$encode$1.INSTANCE, 30);
    }
}
