package defpackage;

import android.content.Context;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.abwu.a;

/* renamed from: abxj */
public final class abxj {
    public akbk<ajxw> a;
    public akbk<ajxw> b;
    public akbk<ajxw> c;
    private final Context d;
    private final abxi e;

    /* renamed from: abxj$b */
    static final class b implements Runnable {
        private /* synthetic */ abxj a;

        b(abxj abxj) {
            this.a = abxj;
        }

        public final void run() {
            akbk akbk = this.a.a;
            if (akbk != null) {
                akbk.invoke();
            }
            akbk = this.a.b;
            if (akbk != null) {
                akbk.invoke();
            }
            akbk = this.a.c;
            if (akbk != null) {
                akbk.invoke();
            }
        }
    }

    /* renamed from: abxj$a */
    public static final class a implements abva {
        private /* synthetic */ abxj a;

        a(abxj abxj) {
            this.a = abxj;
        }

        public final void a() {
            akbk akbk = this.a.c;
            if (akbk != null) {
                akbk.invoke();
            }
        }

        public final void a(int i, int i2) {
            akbk akbk = this.a.a;
            if (akbk != null) {
                akbk.invoke();
            }
            akbk = this.a.b;
            if (akbk != null) {
                akbk.invoke();
            }
        }

        public final void a(boolean z, int i, int i2) {
            akbk akbk = this.a.c;
            if (akbk != null) {
                akbk.invoke();
            }
        }

        public final void b(int i, int i2) {
        }
    }

    public abxj(Context context, abxi abxi) {
        akcr.b(context, "context");
        akcr.b(abxi, MapboxEvent.KEY_GESTURE_ID);
        this.d = context;
        this.e = abxi;
    }

    private final void b() {
        Object obj = (this.b == null && this.c == null) ? null : 1;
        if (this.a != null) {
            if (obj == null) {
                obj = 1;
            } else {
                throw new IllegalStateException("Gestures cannot have an action listener and completeAndDo since completeAndDo will immediately dismiss.");
            }
        }
        if (obj == null) {
            throw new IllegalStateException("A gesture must have an action handler.");
        }
    }

    public final abwx a() {
        abws abwu;
        b();
        int i = abxk.a[this.e.ordinal()];
        if (i == 1) {
            abwu = new abwu(this.d, new a());
            abwu.a((abva) new a(this));
        } else if (i == 2) {
            abwu = new abws();
            abwu.a((Runnable) new b(this));
        } else {
            throw new ajxk();
        }
        return abwu;
    }
}
