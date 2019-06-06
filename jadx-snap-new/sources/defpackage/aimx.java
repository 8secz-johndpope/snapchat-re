package defpackage;

import android.database.Cursor;
import defpackage.aimz.c;
import java.util.List;

/* renamed from: aimx */
final class aimx<T> implements ajds<List<T>, c> {
    private final ajfc<Cursor, T> a;

    /* renamed from: aimx$a */
    static final class a<T> extends ajvf<c> {
        private final ajdv<? super List<T>> a;
        private final ajfc<Cursor, T> b;

        a(ajdv<? super List<T>> ajdv, ajfc<Cursor, T> ajfc) {
            this.a = ajdv;
            this.b = ajfc;
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

    aimx(ajfc<Cursor, T> ajfc) {
        this.a = ajfc;
    }

    public final ajdv<? super c> a(ajdv<? super List<T>> ajdv) {
        return new a(ajdv, this.a);
    }
}
