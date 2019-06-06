package defpackage;

import defpackage.sar.a;
import java.util.Date;

/* renamed from: sas */
public final class sas {
    public static final ifl a = new ifl(-1, -1);
    public static final rzz b = new rzz();
    public static final sar c = new a().a();
    public static final sao d = new sao.a().a();

    public static final long a(Long l) {
        return l != null ? l.longValue() : -1;
    }

    public static final long a(Date date, Date date2) {
        return (date2 == null || date == null) ? -1 : Math.max(date2.getTime() - date.getTime(), -1);
    }
}
