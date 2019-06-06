package defpackage;

import android.graphics.Canvas;
import android.view.View;

/* renamed from: acxa */
public abstract class acxa<T> {
    final String a;
    private final ajxe b = ajxh.a(b.a);

    /* renamed from: acxa$a */
    final class a implements acus, Runnable {
        final T a;
        final actz b;
        final aclg c;
        final acwz<T> d;
        private /* synthetic */ acxa e;

        /* renamed from: acxa$a$a */
        static final class a implements Runnable {
            private /* synthetic */ a a;
            private /* synthetic */ acxn b;

            a(a aVar, acxn acxn) {
                this.a = aVar;
                this.b = acxn;
            }

            public final void run() {
                this.a.d.a(this.a.a, this.b, this.a.b);
                this.a.c.j().m();
            }
        }

        public a(acxa acxa, T t, actz actz, aclg aclg, acwz<T> acwz) {
            akcr.b(actz, "glThread");
            akcr.b(aclg, "snapMap");
            akcr.b(acwz, "dataHolder");
            this.e = acxa;
            this.a = t;
            this.b = actz;
            this.c = aclg;
            this.d = acwz;
        }

        public final void onTextureUploaded(acxn acxn) {
            this.c.j().a((Runnable) new a(this, acxn));
        }

        public final void run() {
            System.currentTimeMillis();
            View a = this.e.a(this.a, this.c);
            int measuredWidth = a.getMeasuredWidth();
            int measuredHeight = a.getMeasuredHeight();
            if (measuredWidth >= 0 && measuredHeight >= 0) {
                kaz a2 = this.c.r().a(measuredWidth, measuredHeight, this.e.a);
                akcr.a((Object) a2, "snapMap.bitmapFactory.cr…      width, height, tag)");
                Canvas a3 = ((Canvas) this.e.b.b());
                Object a4 = a2.a();
                akcr.a(a4, "b.get()");
                a3.setBitmap(((jwj) a4).a());
                a.layout(0, 0, measuredWidth, measuredHeight);
                a.draw(((Canvas) this.e.b.b()));
                ((Canvas) this.e.b.b()).setBitmap(null);
                this.b.a(a2, this.e.a, (acus) this);
                a2.dispose();
            }
        }
    }

    /* renamed from: acxa$b */
    static final class b extends akcs implements akbk<Canvas> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Canvas();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acxa.class), "canvas", "getCanvas()Landroid/graphics/Canvas;");
    }

    public acxa(String str) {
        akcr.b(str, "name");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_ViewRenderer");
        this.a = stringBuilder.toString();
    }

    public final acxn a(T t, aclg aclg, acwz<T> acwz) {
        akcr.b(aclg, "snapMap");
        akcr.b(acwz, "dataHolder");
        Object a = acwz.a();
        Object a2 = a((Object) t, a);
        String str = "snapMap.glThread";
        if (a2 == null) {
            Object w = aclg.w();
            akcr.a(w, str);
            acwz.a(t, w);
            return null;
        } else if (a2 == a) {
            return acwz.b();
        } else {
            actz w2 = aclg.w();
            akcr.a((Object) w2, str);
            acwz.a(a2, w2);
            w2.a((Runnable) new a(this, a2, w2, aclg, acwz));
            return null;
        }
    }

    public abstract View a(T t, aclg aclg);

    public abstract T a(T t, T t2);
}
