package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bdw */
public final class bdw {
    public final long a;
    public final List<bdp> b;
    private String c;

    public bdw(String str, long j, List<bdp> list) {
        this.c = str;
        this.a = j;
        this.b = Collections.unmodifiableList(list);
    }
}
