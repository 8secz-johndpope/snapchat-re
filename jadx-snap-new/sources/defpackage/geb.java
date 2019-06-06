package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: geb */
public final class geb implements gfs {
    private final Set<gfs> a;

    public geb(Set<? extends gfs> set) {
        akcr.b(set, "providers");
        this.a = set;
    }

    public final ajdj<Uri> a(Uri uri) {
        Object a;
        String str;
        akcr.b(uri, "primaryUri");
        if (this.a.isEmpty()) {
            a = ajvo.a(ajlu.a);
            str = "Maybe.empty()";
        } else {
            Iterable<gfs> iterable = this.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (gfs a2 : iterable) {
                arrayList.add(a2.a(uri));
            }
            a = ajdj.a((Iterable) (List) arrayList).b();
            str = "Maybe.concat(providers.m…aryUri) }).firstElement()";
        }
        akcr.a(a, str);
        return a;
    }
}
