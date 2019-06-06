package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import com.brightcove.player.event.Event;
import defpackage.jn.d;

/* renamed from: mit */
public final class mit {

    /* renamed from: mit$a */
    public static final class a<RV> implements ajdu<ViewGroup, RV> {
        final int a;
        final Class<RV> b;
        final boolean c = true;
        final akbl<Context, jn> d;
        final boolean e;
        final boolean f;
        private final ajxe g;

        /* renamed from: mit$a$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final ViewGroup viewGroup = (ViewGroup) obj;
                akcr.b(viewGroup, "viewParent");
                return ajdp.a((ajdr) new ajdr<T>(this) {
                    final /* synthetic */ a a;

                    /* renamed from: mit$a$a$1$1 */
                    static final class 1 extends akcs implements akbl<View, ajxw> {
                        private /* synthetic */ 1 a;
                        private /* synthetic */ String b;
                        private /* synthetic */ int c = -1;
                        private /* synthetic */ ajdq d;

                        1(1 1, String str, int i, ajdq ajdq) {
                            this.a = 1;
                            this.b = str;
                            this.d = ajdq;
                            super(1);
                        }

                        public final void a(View view) {
                            akcr.b(view, "view");
                            zgo.a(this.c);
                            view.setVisibility(0);
                            Object obj = this.d;
                            akcr.a(obj, Event.EMITTER);
                            if (!obj.isDisposed()) {
                                this.d.a(this.a.a.a.b.cast(view));
                            }
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            a((View) obj);
                            return ajxw.a;
                        }
                    }

                    public final void subscribe(ajdq<RV> ajdq) {
                        akcr.b(ajdq, Event.EMITTER);
                        if (!ajdq.isDisposed()) {
                            zgo.a();
                            final 1 1 = new 1(this, "ViewObservables#inflateToViewGroup", -1, ajdq);
                            final 2 2 = new akbl<View, ajxw>(this) {
                                private /* synthetic */ 1 a;

                                public final void a(View view) {
                                    akcr.b(view, "view");
                                    if (((Number) this.a.a.a.g.b()).intValue() != -1) {
                                        view.setId(((Number) this.a.a.a.g.b()).intValue());
                                    }
                                    viewGroup.addView(view);
                                    1.a(view);
                                }

                                public final /* synthetic */ Object invoke(Object obj) {
                                    a((View) obj);
                                    return ajxw.a;
                                }
                            };
                            View findViewById = viewGroup.findViewById(((Number) this.a.a.g.b()).intValue());
                            if (findViewById == null) {
                                akbl akbl = this.a.a.d;
                                Object obj = viewGroup;
                                akcr.a(obj, "viewParent");
                                obj = obj.getContext();
                                akcr.a(obj, "viewParent.context");
                                ((jn) akbl.invoke(obj)).a(this.a.a.a, viewGroup, new d() {
                                    public final void a(View view, ViewGroup viewGroup) {
                                        akcr.b(view, "inflatedView");
                                        2.a(view);
                                    }
                                });
                                return;
                            }
                            1.a(findViewById);
                        }
                    }
                });
            }
        }

        /* renamed from: mit$a$b */
        static final class b extends akcs implements akbk<Integer> {
            public static final b a = new b();

            b() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(View.generateViewId());
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(a.class), "inflatedViewId", "getInflatedViewId()I");
        }

        public a(int i, Class<RV> cls, akbl<Context, jn> akbl) {
            akcr.b(cls, "viewClass");
            akcr.b(akbl, "asyncLayoutInflaterFactory");
            this.a = i;
            this.b = cls;
            this.d = akbl;
            this.e = true;
            this.f = false;
            this.g = ajxh.a(b.a);
        }

        public final ajdt<RV> apply(ajdp<ViewGroup> ajdp) {
            akcr.b(ajdp, "upstream");
            Object u = ajdp.u(new a(this));
            akcr.a(u, "upstream.switchMap { vie…          }\n            }");
            return (ajdt) u;
        }
    }

    /* renamed from: mit$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            View view = (View) obj;
            akcr.b(view, "parent");
            obj = view.findViewById(this.a);
            if (obj != null) {
                ajdp b = ajdp.b(obj);
                if (b != null) {
                    return b;
                }
            }
            return ajvo.a(ajot.a);
        }
    }

    /* renamed from: mit$b */
    static final class b<RV> implements ajdu<ViewStub, RV> {
        final int a;
        final Class<RV> b;
        final boolean c;
        final akbl<Context, jn> d;
        final boolean e;
        final boolean f;

        /* renamed from: mit$b$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final ViewStub viewStub = (ViewStub) obj;
                akcr.b(viewStub, "viewStub");
                return ajdp.a((ajdr) new ajdr<T>(this) {
                    final /* synthetic */ a a;

                    /* renamed from: mit$b$a$1$1 */
                    static final class 1 extends akcs implements akbl<View, ajxw> {
                        private /* synthetic */ 1 a;
                        private /* synthetic */ String b;
                        private /* synthetic */ int c = -1;
                        private /* synthetic */ ajdq d;

                        1(1 1, String str, int i, ajdq ajdq) {
                            this.a = 1;
                            this.b = str;
                            this.d = ajdq;
                            super(1);
                        }

                        public final void a(final View view) {
                            Object obj;
                            akcr.b(view, "view");
                            zgo.a(this.c);
                            if (this.a.a.a.e) {
                                view.setVisibility(0);
                            }
                            boolean z = this.a.a.a.f;
                            String str = Event.EMITTER;
                            if (z) {
                                obj = this.d;
                                akcr.a(obj, str);
                                if (!obj.isDisposed()) {
                                    this.d.a(ajek.a((ajev) new ajev() {
                                        public final void run() {
                                            view.setVisibility(8);
                                        }
                                    }));
                                }
                            }
                            obj = this.d;
                            akcr.a(obj, str);
                            if (!obj.isDisposed()) {
                                this.d.a(this.a.a.a.b.cast(view));
                            }
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            a((View) obj);
                            return ajxw.a;
                        }
                    }

                    public final void subscribe(ajdq<RV> ajdq) {
                        akcr.b(ajdq, Event.EMITTER);
                        if (!ajdq.isDisposed()) {
                            zgo.a();
                            final 1 1 = new 1(this, "ViewObservables#inflateToViewStub", -1, ajdq);
                            Object obj = viewStub;
                            String str = "viewStub";
                            akcr.a(obj, str);
                            final int inflatedId = obj.getInflatedId();
                            Object obj2 = viewStub;
                            akcr.a(obj2, str);
                            ViewParent parent = obj2.getParent();
                            if (parent != null) {
                                ViewGroup viewGroup = (ViewGroup) parent;
                                View findViewById = viewGroup.findViewById(inflatedId);
                                if (findViewById == null) {
                                    Object obj3 = viewStub;
                                    akcr.a(obj3, str);
                                    obj3.setLayoutResource(this.a.a.a);
                                    if (this.a.a.c) {
                                        akbl akbl = this.a.a.d;
                                        obj3 = viewGroup.getContext();
                                        akcr.a(obj3, "viewParent.context");
                                        ((jn) akbl.invoke(obj3)).a(this.a.a.a, viewGroup, new d(this) {
                                            private /* synthetic */ 1 a;

                                            public final void a(View view, ViewGroup viewGroup) {
                                                akcr.b(view, "inflatedView");
                                                if (viewGroup != null) {
                                                    akcr.a((Object) viewGroup, "p?: return@inflate");
                                                    int i = inflatedId;
                                                    if (i != -1) {
                                                        view.setId(i);
                                                    }
                                                    i = viewGroup.indexOfChild(viewStub);
                                                    Object obj = viewStub;
                                                    akcr.a(obj, "viewStub");
                                                    LayoutParams layoutParams = obj.getLayoutParams();
                                                    if (layoutParams != null) {
                                                        viewGroup.addView(view, i, layoutParams);
                                                    } else {
                                                        viewGroup.addView(view, i);
                                                    }
                                                    1.a(view);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    obj3 = viewStub.inflate();
                                    akcr.a(obj3, "inflatedView");
                                    ViewStub viewStub = new ViewStub(obj3.getContext());
                                    Object obj4 = viewStub;
                                    akcr.a(obj4, str);
                                    viewStub.setId(obj4.getId());
                                    viewStub.setInflatedId(inflatedId);
                                    viewStub.setLayoutResource(this.a.a.a);
                                    obj = viewStub;
                                    akcr.a(obj, str);
                                    viewStub.setLayoutParams(obj.getLayoutParams());
                                    viewGroup.addView(viewStub);
                                    1.a(obj3);
                                    return;
                                }
                                1.a(findViewById);
                                return;
                            }
                            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    }
                });
            }
        }

        public b(int i, Class<RV> cls, boolean z, akbl<Context, jn> akbl, boolean z2, boolean z3) {
            akcr.b(cls, "viewClass");
            akcr.b(akbl, "asyncLayoutInflaterFactory");
            this.a = i;
            this.b = cls;
            this.c = z;
            this.d = akbl;
            this.e = z2;
            this.f = z3;
        }

        public final ajdt<RV> apply(ajdp<ViewStub> ajdp) {
            akcr.b(ajdp, "upstream");
            Object u = ajdp.u(new a(this));
            akcr.a(u, "upstream.switchMap { vie…          }\n            }");
            return (ajdt) u;
        }
    }

    static {
        mit mit = new mit();
    }

    private mit() {
    }

    public static final <RV extends View> ajdp<RV> a(int i, ajdp<?> ajdp) {
        akcr.b(ajdp, "parentView");
        Object u = ajdp.a(View.class).u(new c(i));
        akcr.a(u, "parentView\n             …y<RV>()\n                }");
        return u;
    }

    public static final <RV> ajdu<ViewStub, RV> a(int i, Class<RV> cls, boolean z, akbl<Context, jn> akbl, boolean z2, boolean z3) {
        akcr.b(cls, "viewClass");
        akcr.b(akbl, "asyncLayoutInflaterFactory");
        return new b(i, cls, true, akbl, z2, z3);
    }
}
