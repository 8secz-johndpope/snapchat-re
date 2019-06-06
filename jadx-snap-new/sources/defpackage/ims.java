package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import defpackage.akgx.a;

/* renamed from: ims */
public final class ims implements a {
    private final a a;

    /* renamed from: ims$b */
    public static final class b extends akhu {
        private /* synthetic */ akhu a;

        b(akhu akhu) {
            this.a = akhu;
        }

        public final long contentLength() {
            return -1;
        }

        public final akho contentType() {
            return this.a.contentType();
        }

        /* JADX WARNING: Missing block: B:9:0x0025, code skipped:
            defpackage.akax.a(r4, r0);
     */
        public final void writeTo(defpackage.akke r4) {
            /*
            r3 = this;
            r0 = "sink";
            defpackage.akcr.b(r4, r0);
            r0 = new akkl;
            r4 = (defpackage.akku) r4;
            r0.<init>(r4);
            r0 = (defpackage.akku) r0;
            r4 = defpackage.akko.a(r0);
            r4 = (java.io.Closeable) r4;
            r0 = 0;
            r1 = r4;
            r1 = (defpackage.akke) r1;	 Catch:{ Throwable -> 0x0023 }
            r2 = r3.a;	 Catch:{ Throwable -> 0x0023 }
            r2.writeTo(r1);	 Catch:{ Throwable -> 0x0023 }
            defpackage.akax.a(r4, r0);
            return;
        L_0x0021:
            r1 = move-exception;
            goto L_0x0025;
        L_0x0023:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0021 }
        L_0x0025:
            defpackage.akax.a(r4, r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ims$b.writeTo(akke):void");
        }
    }

    /* renamed from: ims$a */
    public static final class a extends akhu {
        private /* synthetic */ akhu a;
        private /* synthetic */ akkd b;

        a(akhu akhu, akkd akkd) {
            this.a = akhu;
            this.b = akkd;
        }

        public final long contentLength() {
            return this.b.b();
        }

        public final akho contentType() {
            return this.a.contentType();
        }

        public final void writeTo(akke akke) {
            akcr.b(akke, "sink");
            akke.c(this.b.u());
        }
    }

    public ims(a aVar) {
        akcr.b(aVar, "callFactory");
        this.a = aVar;
    }

    private static akht a(akht akht) {
        String str = Tags.BODY;
        akcr.b(akht, "request");
        Object c = akht.c();
        if (c == null || c.contentLength() <= 0) {
            return akht;
        }
        akcr.a(c, "it");
        akcr.b(c, str);
        akhu bVar = new b(c);
        akcr.b(bVar, str);
        akkd akkd = new akkd();
        bVar.writeTo(akkd);
        Object a = akht.d().a("Content-Encoding", "gzip").a(akht.b(), (akhu) new a(bVar, akkd)).a();
        akcr.a(a, "request.newBuilder()\n   …                 .build()");
        return a;
    }

    public final akgx newCall(akht akht) {
        akcr.b(akht, "request");
        Object newCall = this.a.newCall(ims.a(akht));
        akcr.a(newCall, "callFactory.newCall(compress(request))");
        return newCall;
    }
}
