package defpackage;

import defpackage.miq.d.a;

/* renamed from: mof */
public interface mof {

    /* renamed from: mof$a */
    public static final class a implements mof {
        public static final a a = new a();

        private a() {
        }

        public final /* synthetic */ ajdx a(defpackage.miq.d.a aVar) {
            akcr.b(aVar, "content");
            StringBuilder stringBuilder = new StringBuilder("asking noop ResourceResolverFactory to get instance for ");
            stringBuilder.append(aVar.a());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    ajdx<moe> a(a aVar);
}
