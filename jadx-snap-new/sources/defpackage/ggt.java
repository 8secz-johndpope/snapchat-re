package defpackage;

import com.google.common.base.Preconditions;
import defpackage.gfl.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ggt */
public final class ggt implements a {
    private final ajdx<iha> a;

    public ggt(ajdx<iha> ajdx) {
        akcr.b(ajdx, "serializationHelper");
        this.a = ajdx;
    }

    public final List<gdt> a(gez gez) {
        akcr.b(gez, "fileLease");
        int a = gez.a();
        boolean z = false;
        if (a == 1) {
            return ajyl.a(new ggs("media", 0, gez));
        }
        Object a2 = ((iha) this.a.b()).a((InputStream) iga.a(gez.b(0)), gga.a);
        akcr.a(a2, "serializationHelper.bloc…        LIST_STRING_TYPE)");
        List list = (List) a2;
        if (list.size() + 1 == a) {
            z = true;
        }
        Preconditions.checkArgument(z);
        Iterable<ajzd> n = ajyu.n(list);
        Collection arrayList = new ArrayList(ajyn.a((Iterable) n, 10));
        for (ajzd ajzd : n) {
            arrayList.add(new ggs((String) ajzd.b, ajzd.a + 1, gez));
        }
        return ajyu.k((List) arrayList);
    }
}
