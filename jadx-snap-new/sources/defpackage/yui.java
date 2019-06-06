package defpackage;

/* renamed from: yui */
public final class yui {
    public volatile boolean a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    final ymw h;
    private final ftl i;
    private final zfw j;

    /* renamed from: yui$1 */
    static final class 1 implements Runnable {
        private /* synthetic */ yui a;

        1(yui yui) {
            this.a = yui;
        }

        public final void run() {
            yui yui = this.a;
            yui.a(gvt.OPT_IN_NOTIFICATIONS_ENABLED, new b(yui));
            yui.a(gvt.OPT_IN_USER_NOTIFICATIONS_ENABLED, new c(yui));
            yui.a(gvt.OPT_IN_NOTIFICATIONS_ENABLE_SOUND, new d(yui));
            yui.a(gvt.OPT_IN_NOTIFICATIONS_DROP_DOWN_PROMPT_ENABLED, new e(yui));
            yui.a(gvt.OPT_IN_NOTIFICATIONS_SWIPE_UP_PROMPT_ENABLED, new f(yui));
            yui.a(gvt.OPT_IN_USER_NOTIFICATIONS_PROMPT_DROP_DOWN, new g(yui));
            yui.a(gvt.OPT_IN_NOTIFICATIONS_CLOSE_TO_FIRST_STORY, new h(yui));
        }
    }

    /* renamed from: yui$b */
    static final class b extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        b(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$c */
    static final class c extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        c(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.b = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$d */
    static final class d extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        d(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.c = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$e */
    static final class e extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        e(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.d = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$f */
    static final class f extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        f(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.e = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$g */
    static final class g extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        g(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.f = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$h */
    static final class h extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yui a;

        h(yui yui) {
            this.a = yui;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.g = ((Boolean) obj).booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yui$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yui a;

        a(yui yui) {
            this.a = yui;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Boolean) obj;
            akcr.b(obj, "holdout");
            if (akcr.a(obj, Boolean.TRUE)) {
                obj = ajdx.b(Boolean.FALSE);
                akcr.a(obj, "Single.just(false)");
                return obj;
            } else if (akcr.a(obj, Boolean.FALSE)) {
                return this.a.h.a();
            } else {
                throw new ajxk();
            }
        }
    }

    public yui(ftl ftl, ymw ymw, zfw zfw) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(ymw, "friendStoryNotificationExperiment");
        akcr.b(zfw, "schedulers");
        this.i = ftl;
        this.h = ymw;
        this.j = zfw;
        this.j.a().execute(new 1(this));
    }

    public final ajdx<Boolean> a() {
        Object a = this.i.b((fth) gvt.OPT_IN_NOTIFICATIONS_HOLDOUT).a((ajfc) new a(this));
        akcr.a(a, "configurationProvider\n  …      }\n                }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void a(gvt gvt, akbl<? super Boolean, ajxw> akbl) {
        akbl.invoke(Boolean.valueOf(this.i.a((fth) gvt)));
    }
}
