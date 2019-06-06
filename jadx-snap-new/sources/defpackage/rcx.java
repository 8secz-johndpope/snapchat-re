package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: rcx */
public final class rcx extends ajed implements zma {
    final rcz a;
    final jur b;
    final ajcx c;
    private final ajxe d = ajxh.a(new a(this));

    /* renamed from: rcx$a */
    static final class a extends akcs implements akbk<ajdp<znh<zmy>>> {
        private /* synthetic */ rcx a;

        /* renamed from: rcx$a$a */
        public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
            private /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public final R apply(T1 t1, T2 t2) {
                Object obj = (znh) t2;
                Object obj2 = (znh) t1;
                akcr.a(obj2, "friends");
                akcr.a(obj, "quickAddList");
                int a = obj2.a() - 1;
                Object system = Resources.getSystem();
                akcr.a(system, "Resources.getSystem()");
                int i = system.getDisplayMetrics().heightPixels;
                Object a2 = absj.a();
                akcr.a(a2, "StatusBarUtils.getInstance()");
                int c = a2.c();
                int a3 = abso.a(80.0f, (Context) AppContext.get());
                i = (((i - c) - abso.a(188.0f, (Context) AppContext.get())) - a3) / abso.a(66.0f, (Context) AppContext.get());
                while (a >= 0) {
                    if (obj2.a(a) instanceof rdt) {
                        a2 = obj2.a(a);
                        if (a2 != null) {
                            rdt rdt = (rdt) a2;
                            if (rdt.L.lastInteractionTimestamp() != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                Long lastInteractionTimestamp = rdt.L.lastInteractionTimestamp();
                                if (lastInteractionTimestamp == null) {
                                    akcr.a();
                                }
                                if (currentTimeMillis - lastInteractionTimestamp.longValue() <= 86400000) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            throw new ajxt("null cannot be cast to non-null type com.snap.messaging.friendsfeed.ui.viewmodel.FriendFeedItemViewModel");
                        }
                    }
                    a--;
                }
                a = Math.max(a + 1, i);
                akcr.b(obj2, "content");
                akcr.b(obj, "splice");
                return new znm(obj2, obj, a);
            }
        }

        a(rcx rcx) {
            this.a = rcx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object c = ajdp.b((Object) znk.a).c((ajdt) this.a.c.a((ajdt) this.a.b.c()));
            ajdp c2 = this.a.a.c();
            akcr.a(c, "quickAddViews");
            ajdp a = ajdp.a((ajdt) c2, (ajdt) c, (ajex) new a(this));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rcx.class), "myViewModels", "getMyViewModels()Lio/reactivex/Observable;");
    }

    public rcx(rcz rcz, jur jur, ajcx ajcx) {
        akcr.b(rcz, "friendsFeedItemsSection");
        akcr.b(jur, "quickAddCarouselSection");
        akcr.b(ajcx, "initialFeedItemsComplete");
        this.a = rcz;
        this.b = jur;
        this.c = ajcx;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
        if (zmy instanceof rdt) {
            this.a.a((rdt) zmy);
        }
    }

    public final ajdp<znh<zmy>> c() {
        return (ajdp) this.d.b();
    }

    public final void onDispose() {
    }
}
