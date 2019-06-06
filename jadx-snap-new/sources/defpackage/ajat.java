package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: ajat */
public final class ajat {

    /* renamed from: ajat$a */
    static final class a implements aiui {
        final aivl a;

        /* renamed from: ajat$a$a */
        final class a<ReqT, RespT> extends defpackage.aiux.a<ReqT, RespT> {
            a(aiuh<ReqT, RespT> aiuh) {
                super(aiuh);
            }

            public final void a(defpackage.aiuh.a<RespT> aVar, aivl aivl) {
                aivl.a(a.this.a);
                super.a((defpackage.aiuh.a) aVar, aivl);
            }
        }

        a(aivl aivl) {
            this.a = (aivl) Preconditions.checkNotNull(aivl, aivl);
        }

        public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf, aiug aiug) {
            return new a(aiug.a(aivm, aiuf));
        }
    }

    public static <T extends ajar<T>> T a(T t, aivl aivl) {
        return t.a(new a(aivl));
    }
}
