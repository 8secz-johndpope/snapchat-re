package defpackage;

import android.view.ViewStub;

/* renamed from: tqx */
public abstract class tqx {

    /* renamed from: tqx$a */
    public static abstract class a {
        public volatile boolean d;

        /* renamed from: tqx$a$a */
        static final class a<T> implements ajfb<Boolean> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (Boolean) obj;
                a aVar = this.a;
                akcr.a(obj, "enabled");
                aVar.d = obj.booleanValue();
            }
        }

        public abstract a a(ViewStub viewStub);

        public abstract a a(tpl tpl);

        public abstract a a(boolean z);

        public abstract tqx a();
    }

    public abstract tpw a();
}
