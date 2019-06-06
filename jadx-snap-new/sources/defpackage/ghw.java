package defpackage;

import defpackage.gdx.a;
import defpackage.gdx.b;

/* renamed from: ghw */
public final class ghw {

    /* renamed from: ghw$a */
    static final class a extends akcs implements akbl<defpackage.gdx.a, gjb> {
        private /* synthetic */ int a;

        a(int i) {
            this.a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.gdx.a aVar = (defpackage.gdx.a) obj;
            akcr.b(aVar, "cacheProperties");
            return new gjb(aVar, this.a);
        }
    }

    static {
        ghw ghw = new ghw();
    }

    private ghw() {
    }

    public static akbl<a, b> a(int i) {
        return new a(i);
    }
}
