package defpackage;

import defpackage.miq.b;

/* renamed from: mok */
public interface mok<T extends moc> {

    /* renamed from: mok$a */
    public static final class a implements mok<moc> {
        public static final a a = new a();

        private a() {
        }

        public final ajdj<miq> a(moc moc) {
            akcr.b(moc, "request");
            Object a = ajvo.a(ajlu.a);
            akcr.a(a, "Maybe.empty()");
            return a;
        }

        public final miq b(moc moc) {
            akcr.b(moc, "request");
            return b.a;
        }

        public final boolean c(moc moc) {
            akcr.b(moc, "request");
            return false;
        }

        public final ajdp<moh> d(moc moc) {
            akcr.b(moc, "request");
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    ajdj<miq> a(T t);

    miq b(T t);

    boolean c(T t);

    ajdp<moh> d(moc moc);
}
