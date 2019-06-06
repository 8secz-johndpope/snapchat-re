package defpackage;

import android.database.sqlite.SQLiteDiskIOException;
import android.util.Log;
import defpackage.dui.a;
import defpackage.dui.b;
import defpackage.dui.c;
import defpackage.ebi.d;
import defpackage.ebi.l;
import defpackage.ebi.n;
import defpackage.ebi.o;

/* renamed from: duj */
public final class duj {
    public static ebi a(Throwable th, boolean z) {
        d dVar;
        akcr.b(th, "throwable");
        Object stackTraceString = Log.getStackTraceString(th);
        aasc aasc = z ? aasc.VIDEO : aasc.IMAGE;
        String str = "stackTrace";
        if (th instanceof a) {
            akcr.a(stackTraceString, str);
            dVar = new d(stackTraceString);
        } else if (th instanceof c) {
            akcr.a(stackTraceString, str);
            dVar = new o(stackTraceString);
        } else if (th instanceof b) {
            akcr.a(stackTraceString, str);
            dVar = new n(stackTraceString);
        } else if (th instanceof SQLiteDiskIOException) {
            akcr.a(stackTraceString, str);
            dVar = new l(stackTraceString, aasc);
        } else {
            akcr.a(stackTraceString, str);
            dVar = new ebi.b(stackTraceString, aasc);
        }
        return dVar;
    }
}
