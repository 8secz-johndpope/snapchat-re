package defpackage;

import android.database.Cursor;
import defpackage.aimz.c;

/* renamed from: aimy */
final class aimy<T> implements ajds<T, c> {
    private final ajfc<Cursor, T> a;
    private final T b;

    /* renamed from: aimy$a */
    static final class a<T> extends ajvf<c> {
        private final ajdv<? super T> a;
        private final ajfc<Cursor, T> b;
        private final T c;

        a(ajdv<? super T> ajdv, ajfc<Cursor, T> ajfc, T t) {
            this.a = ajdv;
            this.b = ajfc;
            this.c = t;
        }

        public final void a() {
            if (!isDisposed()) {
                this.a.a();
            }
        }

        public final void a(Throwable th) {
            if (isDisposed()) {
                ajvo.a(th);
            } else {
                this.a.a(th);
            }
        }

        public final void b() {
            this.a.a((ajej) this);
        }
    }

    aimy(ajfc<Cursor, T> ajfc, T t) {
        this.a = ajfc;
        this.b = t;
    }

    public final ajdv<? super c> a(ajdv<? super T> ajdv) {
        return new a(ajdv, this.a, this.b);
    }
}
