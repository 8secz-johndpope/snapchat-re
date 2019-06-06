package defpackage;

import android.util.Pair;
import defpackage.akoz.a;
import defpackage.akpm.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: akqe */
public class akqe extends a {
    private static final String a = "akqe";
    private final akpq b;
    private final String c;
    private final b d;
    private final Executor e;
    private String f;
    private final ArrayList<Pair<String, String>> g = new ArrayList();
    private int h = 3;
    private Collection<Object> i;
    private akpk j;
    private Executor k;
    private boolean l = false;

    akqe(String str, b bVar, Executor executor, akpq akpq) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (bVar == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor != null) {
            this.c = str;
            this.d = bVar;
            this.e = executor;
            this.b = akpq;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    public final a a(String str) {
        if (str != null) {
            this.f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    public final /* synthetic */ akoz a() {
        akqd a = this.b.a(this.c, this.d, this.e, this.h, this.i);
        String str = this.f;
        if (str != null) {
            a.a(str);
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            a.a((String) pair.first, (String) pair.second);
        }
        akpk akpk = this.j;
        if (akpk != null) {
            a.a(akpk, this.k);
        }
        return a;
    }
}
