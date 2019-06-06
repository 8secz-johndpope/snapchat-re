package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.gmk.b;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gmg */
public abstract class gmg implements akgx {
    final akht a;
    protected final Executor b;
    private SettableFuture<akhv> c = SettableFuture.create();
    private volatile a d = null;
    private AtomicBoolean e = new AtomicBoolean(false);
    private AtomicBoolean f = new AtomicBoolean(false);

    /* renamed from: gmg$a */
    interface a {
        void cancel();
    }

    gmg(akht akht, Executor executor) {
        this.a = akht;
        this.b = executor;
    }

    private void a(sat<sai> sat) {
        try {
            this.c.set(gmk.a(this.a, sat.a(), sat.c()));
        } catch (Throwable th) {
            this.c.setException(th);
        }
    }

    private void e() {
        if (!this.e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already executed");
        }
    }

    private SettableFuture<akhv> f() {
        try {
            if (!this.f.get()) {
                akht akht = this.a;
                Map b = akht.c.b();
                Map a = sbc.a(b, Predicates.not(gmj.a()));
                b = sbc.a(b, gmj.a());
                b a2 = gmk.a(akht.d);
                Boolean bool = a2.b;
                Map newHashMap = Maps.newHashMap();
                if (bool != null) {
                    newHashMap.put("isauth", bool);
                }
                newHashMap.putAll(b);
                this.d = a(new a(akht.a.a().toString(), sac.valueOf(akht.b), c.METADATA, Collections.emptySet()).a(a).b(newHashMap).a(a2.a).a().e(), new -$$Lambda$gmg$MBjAtlXm57YTRD_L0Ch5MmLS1P0(this));
                if (this.f.get()) {
                    g();
                }
            }
        } catch (Throwable th) {
            this.c.setException(th);
        }
        return this.c;
    }

    private void g() {
        if (this.d != null) {
            this.b.execute(new -$$Lambda$gmg$FW3_XcaYnTp1zP9A6cYAJaWczdQ(this));
        }
    }

    private /* synthetic */ void h() {
        this.d.cancel();
    }

    /* renamed from: a */
    public abstract akgx clone();

    public abstract a a(ryz ryz, rzv<sai> rzv);

    public final void a(final akgy akgy) {
        e();
        Preconditions.checkNotNull(akgy);
        SettableFuture f = f();
        final akht akht = this.a;
        Futures.addCallback(f, new FutureCallback<akhv>() {
            public final void onFailure(Throwable th) {
                akgy.onFailure(gmg.this, gmk.a(akht, sbx.a(th)));
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                try {
                    akgy.onResponse(gmg.this, (akhv) Preconditions.checkNotNull((akhv) obj));
                } catch (IOException e) {
                    onFailure(e);
                }
            }
        }, this.b);
    }

    public final akhv b() {
        e();
        try {
            return (akhv) f().get();
        } catch (Exception e) {
            throw sbx.a(e);
        }
    }

    public final void c() {
        if (this.c.setException(new IOException("Canceled")) && this.f.compareAndSet(false, true)) {
            g();
        }
    }

    public final boolean d() {
        return this.f.get();
    }
}
