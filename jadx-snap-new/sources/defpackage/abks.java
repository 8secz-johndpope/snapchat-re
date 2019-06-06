package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: abks */
public abstract class abks {
    final Map<String, String> a;
    private abku b;
    private final AtomicBoolean c;
    private String d;

    protected abks() {
        this(abku.a());
    }

    private abks(abku abku) {
        this.c = new AtomicBoolean(false);
        this.a = new HashMap();
        this.b = abku;
        this.d = this.b.a(a(), "experimentId");
        String a = a();
        this.a.put("Experiment Name", a);
        this.a.put("Experiment Id", this.d);
        this.a.put("Experiment Group", this.b.a(a, "groupId"));
    }

    public abstract String a();
}
