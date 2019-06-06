package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import defpackage.akgx.a;
import java.io.Closeable;

/* renamed from: dlc */
public final class dlc implements a {
    private final a a;
    private final ftl b;

    /* renamed from: dlc$a */
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

    public dlc(a aVar, ftl ftl) {
        akcr.b(aVar, "callFactory");
        akcr.b(ftl, "configurationProvider");
        this.a = aVar;
        this.b = ftl;
    }

    private static akhu a(akhu akhu) {
        akcr.b(akhu, Tags.BODY);
        akkd akkd = new akkd();
        Closeable a = akko.a((akku) new akkl(akkd));
        try {
            akhu.writeTo((akke) a);
            akax.a(a, null);
            return new a(akhu, akkd);
        } catch (Throwable th) {
            akax.a(a, th);
        }
    }

    public final akgx newCall(akht akht) {
        akcr.b(akht, "request");
        if (akht.c() != null) {
            Object c = akht.c();
            if (c == null) {
                akcr.a();
            }
            akcr.a(c, "request.body()!!");
            Object obj = (c.contentLength() == -1 || c.contentLength() > 1024) ? 1 : null;
            if (obj != null) {
                akht = akht.d().a("Content-Encoding", "gzip").a(akht.b(), dlc.a(c)).a();
                akcr.a((Object) akht, "request.newBuilder()\n   …                 .build()");
            }
        }
        Object newCall = this.a.newCall(akht);
        akcr.a(newCall, "callFactory.newCall(newRequest)");
        return newCall;
    }
}
