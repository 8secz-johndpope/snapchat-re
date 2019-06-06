package defpackage;

import defpackage.ryz.c;
import defpackage.rzf.a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rzl */
public final class rzl<Req extends ryz> implements rzd<Req> {
    private final AtomicLong a = new AtomicLong(0);
    private final rzn<Req> b;

    /* renamed from: rzl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static defpackage.rzf.a a(c cVar) {
            int i = rzm.a[cVar.ordinal()];
            if (i == 1) {
                return defpackage.rzf.a.METADATA;
            }
            if (i == 2) {
                return defpackage.rzf.a.SMALL_MEDIA;
            }
            if (i == 3) {
                return defpackage.rzf.a.LARGE_MEDIA;
            }
            if (i == 4) {
                return defpackage.rzf.a.UPLOAD;
            }
            if (i == 5) {
                return defpackage.rzf.a.STREAMING;
            }
            throw new ajxk();
        }
    }

    /* renamed from: rzl$b */
    public static final class b<Req extends sak<?>> implements rzf<Req> {
        private final Req a;
        private final String b;
        private final a c;
        private final long d;

        public b(Req req, String str, a aVar, long j) {
            akcr.b(req, "request");
            akcr.b(str, "id");
            akcr.b(aVar, "queueType");
            this.a = req;
            this.b = str;
            this.c = aVar;
            this.d = j;
        }

        public final Req a() {
            return this.a;
        }

        public final long b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final a d() {
            return this.c;
        }
    }

    static {
        a aVar = new a();
    }

    public rzl(rzn<Req> rzn) {
        akcr.b(rzn, "eventLogger");
        this.b = rzn;
    }

    public final rzf<Req> a(Req req) {
        akcr.b(req, "request");
        Object b = req.b();
        akcr.a(b, "request.type");
        return a(req, a.a(b));
    }

    public final rzf<Req> a(Req req, a aVar) {
        akcr.b(req, "request");
        akcr.b(aVar, "queueType");
        Object a = this.b.a((sak) req);
        akcr.a(a, "eventLogger.asLoggableRequest(request)");
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        return new b(a, uuid, aVar, this.a.getAndIncrement());
    }
}
