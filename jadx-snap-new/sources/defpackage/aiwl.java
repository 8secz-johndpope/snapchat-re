package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import defpackage.aiwv.a;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aiwl */
final class aiwl implements aiwv {
    final Executor a;
    private final aiwv b;

    /* renamed from: aiwl$a */
    class a extends aixk {
        private final aiwx a;
        private final String b;

        a(aiwx aiwx, String str) {
            this.a = (aiwx) Preconditions.checkNotNull(aiwx, "delegate");
            this.b = (String) Preconditions.checkNotNull(str, "authority");
        }

        public final aiws a(aivm<?, ?> aivm, aivl aivl, aiuf aiuf) {
            if (aiuf.e == null) {
                return this.a.a(aivm, aivl, aiuf);
            }
            aiyg aiyg = new aiyg(this.a, aivm, aivl, aiuf);
            defpackage.aiud.a a = aiud.a().a(aiue.b, this.b).a(aiue.a, aivt.NONE);
            aiud c = this.a.c();
            a.a(c.a.size()).putAll(c.a);
            if (aiuf.d != null) {
                a.a(aiue.b, aiuf.d);
            }
            try {
                a.a();
                MoreObjects.firstNonNull(aiuf.c, aiwl.this.a);
            } catch (Throwable th) {
                aivw b = aivw.g.a("Credentials should use fail() instead of throwing exceptions").b(th);
                boolean z = true;
                Preconditions.checkArgument(b.b() ^ 1, "Cannot fail with OK status");
                Preconditions.checkState(aiyg.c ^ 1, "apply() or fail() already called");
                aiws aixg = new aixg(b);
                Preconditions.checkState(aiyg.c ^ 1, "already finalized");
                aiyg.c = true;
                synchronized (aiyg.a) {
                    if (aiyg.b == null) {
                        aiyg.b = aixg;
                    } else {
                        if (aiyg.d == null) {
                            z = false;
                        }
                        Preconditions.checkState(z, "delayedStream is null");
                        aiyg.d.a(aixg);
                    }
                }
            }
            return aiyg.a();
        }

        /* Access modifiers changed, original: protected|final */
        public final aiwx a() {
            return this.a;
        }
    }

    aiwl(aiwv aiwv, Executor executor) {
        this.b = (aiwv) Preconditions.checkNotNull(aiwv, "delegate");
        this.a = (Executor) Preconditions.checkNotNull(executor, "appExecutor");
    }

    public final aiwx a(SocketAddress socketAddress, a aVar) {
        return new a(this.b.a(socketAddress, aVar), aVar.a);
    }

    public final ScheduledExecutorService a() {
        return this.b.a();
    }

    public final void close() {
        this.b.close();
    }
}
