package defpackage;

import android.util.ArrayMap;
import com.google.common.collect.Sets;
import defpackage.abln.a;
import defpackage.abln.b;
import defpackage.abln.c;
import defpackage.abln.d;
import defpackage.abln.f;
import defpackage.abln.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ablm */
public final class ablm {
    public Long a;
    public a b;
    public final Map<b, Long> c = new ArrayMap();
    public final Map<d, Long> d = new HashMap();
    public final HashSet<abll> e = Sets.newHashSet();
    public final Map<f, Collection<String>> f = new ArrayMap();
    public final Map<c, Object> g = new ArrayMap();
    public h h;
    public Long i;
    public StringBuilder j = new StringBuilder();

    public static Long a(Long l) {
        return l == null ? null : Long.valueOf(l.longValue() / 1000);
    }

    public static Long a(Long l, Long l2) {
        return (l == null || l2 == null) ? null : ablm.a(Long.valueOf(l.longValue() - l2.longValue()));
    }

    public static Long b(Long l) {
        return l == null ? null : Long.valueOf(l.longValue() / 1000000);
    }
}
