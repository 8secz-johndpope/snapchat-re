package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.akdd.e;
import defpackage.git.a;
import java.util.Set;

/* renamed from: giu */
public final class giu {
    static final ghx a = new ghx(new gey(-2, new Throwable("Request was canceled ")), new gff(gfc.CANCELED, false, 0, null, null, null, null, 254));

    /* renamed from: giu$a */
    static final class a<T> implements ajfb<ajej> {
        private /* synthetic */ defpackage.git.a a;
        private /* synthetic */ e b;
        private /* synthetic */ git c;
        private /* synthetic */ ggo d;

        a(defpackage.git.a aVar, e eVar, git git, ggo ggo) {
            this.a = aVar;
            this.b = eVar;
            this.c = git;
            this.d = ggo;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
            this.b.a = this.c.a(this.d);
        }
    }

    /* renamed from: giu$b */
    static final class b<T> implements ajfb<gej> {
        private /* synthetic */ git a;
        private /* synthetic */ ggo b;
        private /* synthetic */ e c;
        private /* synthetic */ Uri d;
        private /* synthetic */ long e;
        private /* synthetic */ rzg f;
        private /* synthetic */ a g;

        b(git git, ggo ggo, e eVar, Uri uri, long j, rzg rzg, a aVar) {
            this.a = git;
            this.b = ggo;
            this.c = eVar;
            this.d = uri;
            this.e = j;
            this.f = rzg;
            this.g = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "result");
            this.a.a(this.b, (ifl) this.c.a, gej);
            this.g.a(gej);
        }
    }

    /* renamed from: giu$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            a aVar = this.a;
            akcr.a((Object) th, "e");
            aVar.a(ghx.a.a(th, null));
        }
    }

    /* renamed from: giu$d */
    static final class d implements ajev {
        private /* synthetic */ a a;

        d(a aVar) {
            this.a = aVar;
        }

        public final void run() {
            this.a.a(giu.a);
        }
    }

    public static final ajdx<gej> a(ajdx<gej> ajdx, git git, Uri uri, rzg rzg, Set<? extends gdy> set, long j) {
        ajdx<gej> ajdx2 = ajdx;
        git git2 = git;
        akcr.b(ajdx, "receiver$0");
        akcr.b(git, "resolveStatusTracker");
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        rzg rzg2 = rzg;
        akcr.b(rzg, "schedulingContext");
        akcr.b(set, "cacheAccessControls");
        a a = git.a(uri);
        ggo a2 = git.a(uri, rzg, (Set) set);
        e eVar = new e();
        eVar.a = null;
        Object c = ajdx.b((ajfb) new a(a, eVar, git, a2)).c((ajfb) new b(git2, a2, eVar, uri2, j, rzg2, a)).d((ajfb) new c(a)).c((ajev) new d(a));
        akcr.a(c, "this.doOnSubscribe {\n   …esult(CANCELLED_RESULT) }");
        return c;
    }

    static final Uri a(geg geg) {
        for (rzg rzg : geg.g()) {
            Uri uri = rzg.d;
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
