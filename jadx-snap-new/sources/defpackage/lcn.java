package defpackage;

import android.net.Uri;
import defpackage.miq.d.a;

/* renamed from: lcn */
public final class lcn implements mof {
    private final gfu a;
    private final idl b;
    private final zfw c;
    private final akbl<a, Uri> d;

    /* renamed from: lcn$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ defpackage.miq.d.a a;

        a(defpackage.miq.d.a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            if (!gej.a()) {
                obj = ajvo.a(ajsn.a);
                str = "Single.never()";
            } else if (gej.c().size() == 1) {
                obj = ajdx.b(new ler(gej, this.a.a()));
                str = "just(SingleFileResourceResolver(it, content.uri))";
            } else {
                obj = ajdx.b(new lcm(gej, this.a.a()));
                str = "just(DefaultResourceResolver(it, content.uri))";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    public lcn(gfu gfu, idl idl, zfw zfw, akbl<a, Uri> akbl) {
        akcr.b(gfu, "contentResolver");
        akcr.b(idl, "uiPage");
        akcr.b(zfw, "schedulers");
        akcr.b(akbl, "uriTransformer");
        this.a = gfu;
        this.b = idl;
        this.c = zfw;
        this.d = akbl;
    }

    public final ajdx<moe> a(a aVar) {
        akcr.b(aVar, "content");
        Object b = this.a.a((Uri) this.d.invoke(aVar), this.b, false, new gdy[0]).a((ajfc) new a(aVar)).b((ajdw) this.c.f());
        akcr.a(b, "contentResolver.resolve(…scribeOn(schedulers.io())");
        return b;
    }
}
