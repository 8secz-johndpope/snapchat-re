package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import defpackage.aivn.a;
import defpackage.aiwn.c;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aiwc */
public abstract class aiwc<T extends aiwc<T>> extends aivj<T> {
    static final long a = TimeUnit.SECONDS.toMillis(1);
    private static long p = TimeUnit.MINUTES.toMillis(30);
    private static final aiyi<? extends Executor> q = aiyz.a(aixo.m);
    private static final a r = aivo.b;
    private static final aiuu s = aiuu.a;
    private static final aiun t = aiun.a;
    private boolean A = true;
    private boolean B = true;
    aiyi<? extends Executor> b = q;
    a c = r;
    final String d;
    String e;
    aiuu f = s;
    aiun g = t;
    long h = p;
    int i = 5;
    int j = 5;
    long k = 16777216;
    long l = 1048576;
    aiva m = aiva.b;
    protected aizf.a n = aizf.a;
    protected int o = 4194304;
    private final List<aiui> u = new ArrayList();
    private final SocketAddress v;
    private boolean w = false;
    private boolean x;
    private boolean y = true;
    private boolean z = true;

    protected aiwc(String str) {
        this.d = (String) Preconditions.checkNotNull(str, "target");
        this.v = null;
    }

    public final /* synthetic */ aivj a(TimeUnit timeUnit) {
        Preconditions.checkArgument(true, "idle timeout is %s, but must be positive", 270);
        this.h = timeUnit.toDays(270) >= 30 ? -1 : Math.max(timeUnit.toMillis(270), a);
        return this;
    }

    public final aivi b() {
        aiwv c = c();
        aixf.a aVar = new aixf.a();
        aiyz a = aiyz.a(aixo.m);
        Supplier supplier = aixo.o;
        ArrayList arrayList = new ArrayList(this.u);
        this.x = false;
        if (this.y) {
            this.x = true;
            arrayList.add(0, new c(this.z, this.A));
        }
        if (this.B) {
            this.x = true;
            arrayList.add(0, new aiwo(ajcp.a.a(), ajcp.a.b().a()).f);
        }
        return new aiyc(new aiyb(this, c, aVar, a, supplier, arrayList, aizd.a));
    }

    public final /* bridge */ /* synthetic */ aivj b(String str) {
        this.e = str;
        return this;
    }

    public abstract aiwv c();

    /* Access modifiers changed, original: protected */
    public aiud d() {
        return aiud.b;
    }
}
