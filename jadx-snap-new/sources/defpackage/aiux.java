package defpackage;

import defpackage.aiuh.a;

/* renamed from: aiux */
public abstract class aiux<ReqT, RespT> extends aivp<ReqT, RespT> {

    /* renamed from: aiux$a */
    public static abstract class a<ReqT, RespT> extends aiux<ReqT, RespT> {
        protected final aiuh<ReqT, RespT> a;

        protected a(aiuh<ReqT, RespT> aiuh) {
            this.a = aiuh;
        }

        public final /* bridge */ /* synthetic */ void a() {
            super.a();
        }

        public final /* bridge */ /* synthetic */ void a(int i) {
            super.a(i);
        }

        public final /* bridge */ /* synthetic */ void a(String str, Throwable th) {
            super.a(str, th);
        }

        /* Access modifiers changed, original: protected|final */
        public final aiuh<ReqT, RespT> b() {
            return this.a;
        }

        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public void a(a<RespT> aVar, aivl aivl) {
        b().a((a) aVar, aivl);
    }

    public final void a(ReqT reqT) {
        b().a((Object) reqT);
    }

    public abstract aiuh<ReqT, RespT> b();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
