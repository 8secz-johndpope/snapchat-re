package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: dkt */
public final class dkt {
    public final List<dks> a;
    public final int b;
    public long c;
    public long d;

    private dkt(List<dks> list) {
        this.a = list;
        int i = 0;
        for (dks c : list) {
            if (dhx.c.contains(c.c())) {
                i++;
            }
        }
        this.b = i;
    }

    public dkt(List<dks> list, long j, long j2) {
        this(list);
        this.d = j;
        this.c = j2;
    }

    private static Map<String, Object> a(dks dks, long j) {
        Map d = dks.d();
        double d2 = (double) j;
        Double.isNaN(d2);
        d.put("client_upload_ts", Double.valueOf(d2 / 1000.0d));
        if (dks.b() != null) {
            j = dks.b().longValue();
        }
        double d3 = (double) j;
        Double.isNaN(d3);
        d.put("first_upload_attempt_ts", Double.valueOf(d3 / 1000.0d));
        return d;
    }

    public final String a(long j) {
        ArrayList arrayList = new ArrayList();
        for (dks a : this.a) {
            arrayList.add(dih.a(dkt.a(a, j)));
        }
        return arrayList.toString();
    }

    public final List<dks> a() {
        return ImmutableList.copyOf(this.a);
    }

    public final int b() {
        return this.a.size();
    }

    public final List<Map<String, Object>> b(long j) {
        ArrayList arrayList = new ArrayList();
        for (dks a : this.a) {
            arrayList.add(dkt.a(a, j));
        }
        return arrayList;
    }
}
