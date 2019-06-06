package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: pzi */
public abstract class pzi implements pzh {
    private ajei a;
    private final ajdp<Integer> b;
    private final ajdp<ajxm<pvh, achi<zjm, zjk>>> c;
    final pxq f;

    /* renamed from: pzi$a */
    static final class a<T> implements ajfl<Integer> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "it");
            return akcr.a(num.intValue(), (int) Callback.DEFAULT_DRAG_ANIMATION_DURATION) > 0;
        }
    }

    /* renamed from: pzi$b */
    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ pzi a;

        b(pzi pzi) {
            this.a = pzi;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.f();
        }
    }

    /* renamed from: pzi$c */
    static final class c<T> implements ajfl<ajxm<? extends pvh, ? extends achi<zjm, zjk>>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return ((pvh) ajxm.a) == pvh.ON_HIDDEN;
        }
    }

    /* renamed from: pzi$d */
    static final class d<T> implements ajfb<ajxm<? extends pvh, ? extends achi<zjm, zjk>>> {
        private /* synthetic */ pzi a;

        d(pzi pzi) {
            this.a = pzi;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.a(pzj.COLLAPSED, true);
        }
    }

    public pzi(pxq pxq, ajdp<Integer> ajdp, ajdp<ajxm<pvh, achi<zjm, zjk>>> ajdp2) {
        akcr.b(pxq, "orchestrator");
        akcr.b(ajdp, "keyboardHeight");
        akcr.b(ajdp2, "navigateObservable");
        this.f = pxq;
        this.b = ajdp;
        this.c = ajdp2;
    }

    public final ajej Q_() {
        this.a = new ajei();
        ajej f = this.b.b(1).a((ajfl) a.a).f((ajfb) new b(this));
        akcr.a((Object) f, "keyboardHeight.skip(1)\n …rawer()\n                }");
        ajei ajei = this.a;
        String str = "disposables";
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(f, ajei);
        f = this.c.a((ajfl) c.a).f((ajfb) new d(this));
        akcr.a((Object) f, "navigateObservable\n     …LAPSED)\n                }");
        ajei = this.a;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(f, ajei);
        ajei ajei2 = this.a;
        if (ajei2 == null) {
            akcr.a(str);
        }
        return ajei2;
    }
}
