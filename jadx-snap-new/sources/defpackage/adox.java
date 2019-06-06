package defpackage;

import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.LocalMessageBodyType.Companion;
import com.snap.core.db.column.SnapServerStatus;
import defpackage.aehb.a;
import java.util.Map;

/* renamed from: adox */
public final class adox {
    public static final SnapServerStatus a(aehb aehb, boolean z) {
        akcr.b(aehb, "receiver$0");
        Long l = aehb.c;
        return (((l != null ? l.longValue() : 0) > 0 ? 1 : ((l != null ? l.longValue() : 0) == 0 ? 0 : -1)) > 0 ? 1 : null) != null ? SnapServerStatus.SCREENSHOT : adox.a(aehb) ? SnapServerStatus.VIEWED : z ? SnapServerStatus.SENT : SnapServerStatus.DELIVERED;
    }

    public static final SnapServerStatus a(aeyr aeyr, boolean z) {
        akcr.b(aeyr, "receiver$0");
        Long l = aeyr.d;
        return (((l != null ? l.longValue() : 0) > 0 ? 1 : ((l != null ? l.longValue() : 0) == 0 ? 0 : -1)) > 0 ? 1 : null) != null ? SnapServerStatus.SCREENSHOT : adox.a(aeyr) ? SnapServerStatus.VIEWED : z ? SnapServerStatus.SENT : SnapServerStatus.DELIVERED;
    }

    public static final String a(aeie aeie) {
        akcr.b(aeie, "receiver$0");
        StringBuilder stringBuilder = new StringBuilder("id=");
        stringBuilder.append(aeie.p);
        stringBuilder.append(", convId=");
        stringBuilder.append(aeie.i.c);
        stringBuilder.append(", from=");
        stringBuilder.append(aeie.i.a);
        stringBuilder.append(", type=");
        stringBuilder.append(aeie.o);
        stringBuilder.append(", seqNum=");
        stringBuilder.append(aeie.m);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(aeie.n);
        return stringBuilder.toString();
    }

    public static final boolean a(aegj aegj) {
        akcr.b(aegj, "receiver$0");
        return adox.b((aeie) aegj) && aegj.a.e.equals(aesq.SNAP.a());
    }

    public static final boolean a(aehb aehb) {
        akcr.b(aehb, "receiver$0");
        Long l = aehb.c;
        return ajym.b((Object[]) new a[]{a.VIEW, a.REPLAY}).contains(aehb.a()) | ((l != null ? l.longValue() : 0) > 0 ? 1 : 0);
    }

    public static final boolean a(aeyr aeyr) {
        akcr.b(aeyr, "receiver$0");
        Boolean bool = aeyr.b;
        if (!(bool != null ? bool.booleanValue() : false)) {
            bool = aeyr.c;
            if (!(bool != null ? bool.booleanValue() : false)) {
                Long l = aeyr.d;
                if ((l != null ? l.longValue() : 0) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final LocalMessageBodyType b(aegj aegj) {
        Companion companion;
        String str;
        akcr.b(aegj, "receiver$0");
        if (akcr.a(aegj.a.e, aesq.MESSAGE_PARCEL.a())) {
            companion = LocalMessageBodyType.Companion;
            str = aegj.a.w.b;
        } else {
            companion = LocalMessageBodyType.Companion;
            str = aegj.a.e;
        }
        return companion.getEnum(str);
    }

    public static final Boolean b(aehb aehb) {
        akcr.b(aehb, "receiver$0");
        return Boolean.valueOf(aehb.a() == a.REPLAY);
    }

    public static final boolean b(aeie aeie) {
        akcr.b(aeie, "receiver$0");
        return abpp.a(aeie.i.d);
    }

    public static final long c(aeie aeie) {
        akcr.b(aeie, "receiver$0");
        if (adox.b(aeie)) {
            Map map = aeie.k;
            if (map != null) {
                Long l = (Long) map.get(aeie.i.a);
                if (l != null) {
                    return l.longValue();
                }
            }
            return 0;
        }
        Object obj = aeie.m;
        akcr.a(obj, "seqNum");
        return obj.longValue();
    }
}
