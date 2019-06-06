package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: xyx */
public final class xyx implements ajej, xyy {
    public final ajei a = new ajei();
    public boolean b;
    ajwo<yac> c;
    ajwo<yad> d;
    public ajwo<yad> e;
    public ajwo<yaa> f;
    public ajwo<yaf> g;
    ajwo<View> h;
    public ajwo<xzx> i;
    ajwo<yae> j;
    ajwo<yab> k;
    public ajwo<xzy> l;

    /* renamed from: xyx$a */
    static final class a implements ajev {
        private /* synthetic */ xyx a;

        a(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.h = null;
        }
    }

    /* renamed from: xyx$b */
    static final class b implements ajev {
        private /* synthetic */ xyx a;

        b(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.d = null;
        }
    }

    /* renamed from: xyx$c */
    public static final class c implements ajev {
        private /* synthetic */ xyx a;

        public c(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.i = null;
        }
    }

    /* renamed from: xyx$d */
    public static final class d implements ajev {
        private /* synthetic */ xyx a;

        public d(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.l = null;
        }
    }

    /* renamed from: xyx$e */
    public static final class e implements ajev {
        private /* synthetic */ xyx a;

        public e(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.e = null;
        }
    }

    /* renamed from: xyx$f */
    public static final class f implements ajev {
        private /* synthetic */ xyx a;

        public f(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.g = null;
        }
    }

    /* renamed from: xyx$g */
    public static final class g implements ajev {
        private /* synthetic */ xyx a;

        public g(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.f = null;
        }
    }

    /* renamed from: xyx$h */
    static final class h implements ajev {
        private /* synthetic */ xyx a;

        h(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.c = null;
        }
    }

    /* renamed from: xyx$i */
    static final class i implements ajev {
        private /* synthetic */ xyx a;

        i(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.j = null;
        }
    }

    /* renamed from: xyx$j */
    static final class j implements ajev {
        private /* synthetic */ xyx a;

        j(xyx xyx) {
            this.a = xyx;
        }

        public final void run() {
            this.a.k = null;
        }
    }

    public final WeakReference<ajwo<yac>> a() {
        ajwo ajwo = this.c;
        if (ajwo == null) {
            ajwo = new ajwo();
            akcr.a((Object) ajwo, "PublishSubject.create()");
        }
        if (this.c == null) {
            this.c = ajwo;
            ajej a = ajek.a((ajev) new h(this));
            akcr.a((Object) a, "Disposables.fromAction {…tricPublisherRef = null }");
            ajvv.a(a, this.a);
        }
        return new WeakReference(ajwo);
    }

    public final WeakReference<ajwo<yad>> b() {
        ajwo ajwo = this.d;
        if (ajwo == null) {
            ajwo = new ajwo();
            akcr.a((Object) ajwo, "PublishSubject.create()");
        }
        if (this.d == null) {
            this.d = ajwo;
            ajej a = ajek.a((ajev) new b(this));
            akcr.a((Object) a, "Disposables.fromAction {…lickPublisherRef = null }");
            ajvv.a(a, this.a);
        }
        return new WeakReference(ajwo);
    }

    public final WeakReference<ajwo<View>> c() {
        ajwo ajwo = this.h;
        if (ajwo == null) {
            ajwo = new ajwo();
            akcr.a((Object) ajwo, "PublishSubject.create()");
        }
        if (this.h == null) {
            this.h = ajwo;
            ajej a = ajek.a((ajev) new a(this));
            akcr.a((Object) a, "Disposables.fromAction {…ressPublisherRef = null }");
            ajvv.a(a, this.a);
        }
        return new WeakReference(ajwo);
    }

    public final WeakReference<ajwo<yae>> d() {
        ajwo ajwo = this.j;
        if (ajwo == null) {
            ajwo = new ajwo();
            akcr.a((Object) ajwo, "PublishSubject.create()");
        }
        if (this.j == null) {
            this.j = ajwo;
            ajej a = ajek.a((ajev) new i(this));
            akcr.a((Object) a, "Disposables.fromAction {…ckerDragEventRef = null }");
            ajvv.a(a, this.a);
        }
        return new WeakReference(ajwo);
    }

    public final void dispose() {
        this.a.a();
    }

    public final WeakReference<ajwo<yab>> e() {
        ajwo ajwo = this.k;
        if (ajwo == null) {
            ajwo = new ajwo();
            akcr.a((Object) ajwo, "PublishSubject.create()");
        }
        if (this.k == null) {
            this.k = ajwo;
            ajej a = ajek.a((ajev) new j(this));
            akcr.a((Object) a, "Disposables.fromAction {…olDeleteEventRef = null }");
            ajvv.a(a, this.a);
        }
        return new WeakReference(ajwo);
    }

    public final boolean isDisposed() {
        return this.a.isDisposed();
    }

    @akqq
    public final void onClick(yad yad) {
        akcr.b(yad, "event");
        ajwo ajwo;
        if (this.b) {
            ajwo = this.e;
            if (ajwo != null) {
                ajwo.a((Object) yad);
            }
            return;
        }
        ajwo = this.d;
        if (ajwo != null) {
            ajwo.a((Object) yad);
        }
    }

    @akqq
    public final void onExpandStickerToggleClicked(xzx xzx) {
        akcr.b(xzx, "event");
        if (!this.b) {
            ajwo ajwo = this.i;
            if (ajwo != null) {
                ajwo.a((Object) xzx);
            }
        }
    }

    @akqq
    public final void onFriendmojiPicked(xzy xzy) {
        akcr.b(xzy, "event");
        ajwo ajwo = this.l;
        if (ajwo != null) {
            ajwo.a((Object) xzy);
        }
    }

    @akqq
    public final void onLongClick(yaf yaf) {
        akcr.b(yaf, "event");
        ajwo ajwo = this.g;
        if (ajwo != null) {
            ajwo.a((Object) yaf);
        }
    }

    @akqq
    public final void onMetaStickerClick(yaa yaa) {
        akcr.b(yaa, "event");
        if (!this.b) {
            ajwo ajwo = this.f;
            if (ajwo != null) {
                ajwo.a((Object) yaa);
            }
        }
    }

    @akqq
    public final void onMetricEvent(yac yac) {
        akcr.b(yac, "event");
        ajwo ajwo = this.c;
        if (ajwo != null) {
            ajwo.a((Object) yac);
        }
    }

    @akqq
    public final void onStickerDeleteToolChangeEvent(yab yab) {
        akcr.b(yab, "event");
        if (!this.b) {
            ajwo ajwo = this.k;
            if (ajwo != null) {
                ajwo.a((Object) yab);
            }
        }
    }

    @akqq
    public final void onStickerDragEvent(yae yae) {
        akcr.b(yae, "event");
        if (!this.b) {
            ajwo ajwo = this.j;
            if (ajwo != null) {
                ajwo.a((Object) yae);
            }
        }
    }

    @akqq
    public final void onTouch(yag yag) {
        akcr.b(yag, "event");
    }
}
