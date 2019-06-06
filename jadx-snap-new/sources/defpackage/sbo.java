package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.rzu.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: sbo */
public final class sbo implements rzw {
    final saa[] a;
    final Executor b;
    final rzy<sai> c;
    final sbw d;
    final ihh e;
    final a f;

    /* renamed from: sbo$a */
    public static class a {
        public rzy<sai> a = sbv.a;
        public final List<saa> b = new ArrayList();
        public final Executor c;
        public sbw d = sbx.a("FilterChainClient");
        public ihh e;
        public defpackage.rzu.a f = null;

        public a(Executor executor, ihh ihh) {
            this.c = (Executor) Preconditions.checkNotNull(executor);
            this.e = ihh;
        }
    }

    /* renamed from: sbo$b */
    class b implements sab {
        private final sak a;
        private final sbq b;
        private int c;

        private b(sak sak, rzv<sai> rzv) {
            this.a = sak;
            this.b = new sbq(sak, rzv, sbu.a(MoreExecutors.directExecutor(), sbo.this.d), sbo.this.e, sbo.this.f);
            this.c = 0;
        }

        /* synthetic */ b(sbo sbo, sak sak, rzv rzv, byte b) {
            this(sak, rzv);
        }

        private /* synthetic */ void c() {
            try {
                rzy rzy = sbo.this.c;
                sak sak = this.a;
                Preconditions.checkNotNull(sak);
                Preconditions.checkNotNull(rzy);
                sak a = rzy.a(sak);
                if (a != null) {
                    a(a);
                } else {
                    throw new IllegalArgumentException(String.format("Request<%s> can't be converted to Request<Payload>", new Object[]{sbg.a(sak.n())}));
                }
            } catch (Throwable th) {
                a(th);
            }
        }

        public final sal a() {
            return this.b;
        }

        public final void a(Throwable th) {
            try {
                Preconditions.checkNotNull(th);
                while (this.c > 0) {
                    this.c--;
                }
                this.b.a(this.b.a(th));
            } catch (Throwable th2) {
                sbo.this.d.onError(th2);
            }
        }

        public final void a(sak<sai> sak) {
            try {
                Preconditions.checkNotNull(sak);
                if (this.c < sbo.this.a.length) {
                    this.b.b((sak) sak);
                    saa[] saaArr = sbo.this.a;
                    int i = this.c;
                    this.c = i + 1;
                    saaArr[i].a((sak) sak, (sab) this);
                    return;
                }
                throw new IllegalStateException("End of the filter chain, request can't be sent");
            } catch (Throwable th) {
                a(th);
            }
        }

        public final void a(saq<sai> saq) {
            try {
                Preconditions.checkNotNull(saq);
                if (this.c > 0) {
                    this.b.a((saq) saq);
                    saa[] saaArr = sbo.this.a;
                    int i = this.c - 1;
                    this.c = i;
                    saaArr[i].a((saq) saq, (sab) this);
                    return;
                }
                this.b.a(this.b.b((saq) saq));
            } catch (Throwable th) {
                this.c++;
                a(th);
            }
        }

        /* Access modifiers changed, original: final */
        public final rzu b() {
            this.b.a(this.a);
            sbo.this.b.execute(new -$$Lambda$sbo$b$uMWpFKUT7GsvtWP3NYcRHr2SlTk(this));
            return this.b.c;
        }
    }

    private sbo(rzy rzy, List<saa> list, Executor executor, sbw sbw, ihh ihh, a aVar) {
        this.c = rzy;
        this.a = (saa[]) list.toArray(new saa[list.size()]);
        this.b = executor;
        this.d = sbw;
        this.e = ihh;
        this.f = aVar;
    }

    public /* synthetic */ sbo(rzy rzy, List list, Executor executor, sbw sbw, ihh ihh, a aVar, byte b) {
        this(rzy, list, executor, sbw, ihh, aVar);
    }

    public final rzu a(sak<?> sak, rzv<sai> rzv) {
        return new b(this, (sak) Preconditions.checkNotNull(sak), (rzv) Preconditions.checkNotNull(rzv), (byte) 0).b();
    }
}
