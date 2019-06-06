package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import defpackage.aiuk.a;
import defpackage.aivl.d;
import defpackage.aivl.e;
import defpackage.ajce.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiwo */
final class aiwo {
    static final Logger a = Logger.getLogger(aiwo.class.getName());
    static final AtomicIntegerFieldUpdater<a> b;
    static final AtomicIntegerFieldUpdater<c> c;
    final ajco d;
    final e<ajci> e;
    final e f = new e();
    private final d g = new d();

    /* renamed from: aiwo$c */
    final class c extends aivu {
        volatile int a;
        private final ajcg b;
        private volatile boolean c;

        public final void a(int i, long j) {
            aiwo.a(this.b, b.RECEIVED, i, j, -1);
        }

        public final void a(int i, long j, long j2) {
            aiwo.a(this.b, b.SENT, i, j, j2);
        }

        public final void a(aivw aivw) {
            if (aiwo.c != null) {
                if (aiwo.c.getAndSet(this, 1) != 0) {
                    return;
                }
            } else if (this.a == 0) {
                this.a = 1;
            } else {
                return;
            }
            aiwo.a(aivw, this.c);
        }
    }

    /* renamed from: aiwo$a */
    final class a extends defpackage.aiuk.a {
        volatile int a;
        final boolean b;
        private final ajcg c;

        a(ajcg ajcg) {
            Preconditions.checkNotNull(ajcg, "method");
            this.b = ajcg.e;
            ajco ajco = aiwo.this.d;
            String str = ajcg.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sent");
            stringBuilder.append(".");
            stringBuilder.append(str.replace('/', '.'));
            this.c = ajco.a(stringBuilder.toString()).a().b();
        }

        public final aiuk a(aivl aivl) {
            if (this.c != ajcc.a) {
                aivl.b(aiwo.this.e);
                aivl.a(aiwo.this.e, this.c.b);
            }
            return new b(this.c);
        }
    }

    /* renamed from: aiwo$e */
    final class e implements aiui {
        e() {
        }

        public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf, aiug aiug) {
            aiwo aiwo = aiwo.this;
            aiuq.a();
            final a aVar = new a(aivm);
            return new aiux.a<ReqT, RespT>(aiug.a(aivm, aiuf.a(aVar))) {
                public final void a(aiuh.a<RespT> aVar, aivl aivl) {
                    this.a.a(new aiuy.a<RespT>(aVar) {
                        /* JADX WARNING: Missing block: B:3:0x000f, code skipped:
            if (defpackage.aiwo.b.getAndSet(r0, 1) != 0) goto L_0x001d;
     */
                        public final void a(defpackage.aivw r4, defpackage.aivl r5) {
                            /*
                            r3 = this;
                            r0 = defpackage.aiwo.e.1.this;
                            r0 = r1;
                            r1 = defpackage.aiwo.b;
                            r2 = 1;
                            if (r1 == 0) goto L_0x0012;
                        L_0x0009:
                            r1 = defpackage.aiwo.b;
                            r1 = r1.getAndSet(r0, r2);
                            if (r1 == 0) goto L_0x0018;
                        L_0x0011:
                            goto L_0x001d;
                        L_0x0012:
                            r1 = r0.a;
                            if (r1 != 0) goto L_0x001d;
                        L_0x0016:
                            r0.a = r2;
                        L_0x0018:
                            r0 = r0.b;
                            defpackage.aiwo.a(r4, r0);
                        L_0x001d:
                            super.a(r4, r5);
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwo$e$1$1.a(aivw, aivl):void");
                        }
                    }, aivl);
                }
            };
        }
    }

    /* renamed from: aiwo$d */
    final class d extends aivu.a {
        d() {
        }
    }

    /* renamed from: aiwo$b */
    static final class b extends aiuk {
        private final ajcg a;

        b(ajcg ajcg) {
            this.a = (ajcg) Preconditions.checkNotNull(ajcg, Tags.SPAN);
        }

        public final void a(int i, long j) {
            aiwo.a(this.a, defpackage.ajce.b.RECEIVED, i, j, -1);
        }

        public final void a(int i, long j, long j2) {
            aiwo.a(this.a, defpackage.ajce.b.SENT, i, j, j2);
        }
    }

    static {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        String str = "a";
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = null;
        try {
            AtomicIntegerFieldUpdater newUpdater = AtomicIntegerFieldUpdater.newUpdater(a.class, str);
            atomicIntegerFieldUpdater2 = AtomicIntegerFieldUpdater.newUpdater(c.class, str);
            atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
            atomicIntegerFieldUpdater2 = newUpdater;
        } catch (Throwable th) {
            a.log(Level.SEVERE, "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
        }
        b = atomicIntegerFieldUpdater2;
        c = atomicIntegerFieldUpdater;
    }

    aiwo(ajco ajco, final ajct ajct) {
        this.d = (ajco) Preconditions.checkNotNull(ajco, "censusTracer");
        Preconditions.checkNotNull(ajct, "censusPropagationBinaryFormat");
        this.e = e.a("grpc-trace-bin", new d<ajci>() {
            private ajci b(byte[] bArr) {
                try {
                    return ajct.a(bArr);
                } catch (Exception e) {
                    aiwo.a.log(Level.FINE, "Failed to parse tracing header", e);
                    return ajci.b;
                }
            }
        });
    }

    static /* synthetic */ ajcd a(aivw aivw, boolean z) {
        ajck ajck;
        ajcd.a c = ajcd.c();
        switch (aivw.m) {
            case OK:
                ajck = ajck.b;
                break;
            case CANCELLED:
                ajck = ajck.c;
                break;
            case UNKNOWN:
                ajck = ajck.d;
                break;
            case INVALID_ARGUMENT:
                ajck = ajck.e;
                break;
            case DEADLINE_EXCEEDED:
                ajck = ajck.f;
                break;
            case NOT_FOUND:
                ajck = ajck.g;
                break;
            case ALREADY_EXISTS:
                ajck = ajck.h;
                break;
            case PERMISSION_DENIED:
                ajck = ajck.i;
                break;
            case RESOURCE_EXHAUSTED:
                ajck = ajck.k;
                break;
            case FAILED_PRECONDITION:
                ajck = ajck.l;
                break;
            case ABORTED:
                ajck = ajck.m;
                break;
            case OUT_OF_RANGE:
                ajck = ajck.n;
                break;
            case UNIMPLEMENTED:
                ajck = ajck.o;
                break;
            case INTERNAL:
                ajck = ajck.p;
                break;
            case UNAVAILABLE:
                ajck = ajck.q;
                break;
            case DATA_LOSS:
                ajck = ajck.r;
                break;
            case UNAUTHENTICATED:
                ajck = ajck.j;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unhandled status code ");
                stringBuilder.append(aivw.m);
                throw new AssertionError(stringBuilder.toString());
        }
        if (aivw.n != null) {
            String str = aivw.n;
            if (!Objects.equal(ajck.t, str)) {
                ajck = new ajck(ajck.s, str);
            }
        }
        return c.a(ajck).a(z).a();
    }

    static /* synthetic */ void a(ajcg ajcg, b bVar, int i, long j, long j2) {
        ajce.a a = ajce.a(bVar, (long) i);
        if (j2 != -1) {
            a.b(j2);
        }
        if (j != -1) {
            a.c(j);
        }
        ajcg.a(a.a());
    }
}
