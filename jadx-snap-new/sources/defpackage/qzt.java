package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.StorySnapRecord.PlayableStorySnapRecord;
import defpackage.yic.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: qzt */
public final class qzt implements qzm {
    final idl a = qxo.a.d.b;
    final qzq b;
    final yoo c;
    private final ajxe d = ajxh.a(new d(this));
    private final yhx e;
    private final zgb f;

    /* renamed from: qzt$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ qzt a;

        d(qzt qzt) {
            this.a = qzt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(qxo.b.callsite("FriendsFeedStoryFetcher"));
        }
    }

    /* renamed from: qzt$c */
    static final class c<T, R> implements ajfc<List<? extends PlayableStorySnapRecord>, ajdb> {
        final /* synthetic */ qzt a;
        final /* synthetic */ String b;

        /* renamed from: qzt$c$1 */
        static final class 1<T> implements ajfb<ajej> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.b.a(this.a.b, a.LOADING);
            }
        }

        /* renamed from: qzt$c$2 */
        static final class 2 implements ajev {
            private /* synthetic */ c a;

            2(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                this.a.a.b.a(this.a.b, a.SUCCESS);
            }
        }

        /* renamed from: qzt$c$3 */
        static final class 3<T> implements ajfb<Throwable> {
            private /* synthetic */ c a;

            3(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.b.a(this.a.b, a.FAIL);
            }
        }

        c(qzt qzt, String str) {
            this.a = qzt;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "snaps");
            PlayableStorySnapRecord playableStorySnapRecord = (PlayableStorySnapRecord) ajyu.g(qzt.a(list));
            return playableStorySnapRecord == null ? ajvo.a(ajhn.a) : this.a.c.b(playableStorySnapRecord, this.a.a).b((ajdw) this.a.a().g()).c((ajfb) new 1(this)).b((ajev) new 2(this)).a((ajfb) new 3(this)).b((ajdw) this.a.a().g());
        }
    }

    /* renamed from: qzt$b */
    static final class b implements ajev {
        private /* synthetic */ qzt a;
        private /* synthetic */ rdt b;

        b(qzt qzt, rdt rdt) {
            this.a = qzt;
            this.b = rdt;
        }

        public final void run() {
            qzt qzt = this.a;
            rdt rdt = this.b;
            if (rdt.e() != null) {
                qzq qzq = qzt.b;
                String e = rdt.e();
                if (e == null) {
                    akcr.a();
                }
                if (qzq.b(e) != a.SUCCESS) {
                    qzq qzq2 = qzt.b;
                    String e2 = rdt.e();
                    if (e2 == null) {
                        akcr.a();
                    }
                    qzq2.a(e2, a.NOT_STARTED);
                }
            }
        }
    }

    /* renamed from: qzt$a */
    static final class a<T, R> implements ajfc<List<? extends PlayableStorySnapRecord>, ajdb> {
        final /* synthetic */ qzt a;
        final /* synthetic */ String b;

        a(qzt qzt, String str) {
            this.a = qzt;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "records");
            final PlayableStorySnapRecord playableStorySnapRecord = (PlayableStorySnapRecord) ajyu.g(qzt.a(list));
            return playableStorySnapRecord == null ? ajvo.a(ajhn.a) : this.a.c.a(playableStorySnapRecord, this.a.a).b((ajdw) this.a.a().g()).d((ajfb) new ajfb<defpackage.yoo.a>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ void accept(Object obj) {
                    defpackage.yic.a aVar;
                    int i = qzu.a[((defpackage.yoo.a) obj).a.ordinal()];
                    if (i == 1) {
                        aVar = defpackage.yic.a.LOADING;
                    } else if (i == 2) {
                        aVar = defpackage.yic.a.SUCCESS;
                    } else if (i == 3) {
                        aVar = defpackage.yic.a.FAIL;
                    } else {
                        throw new ajxk();
                    }
                    this.a.a.b.a(this.a.b, aVar);
                }
            }).g();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qzt.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public qzt(yhx yhx, qzq qzq, yoo yoo, zgb zgb) {
        akcr.b(yhx, "storiesDataProvider");
        akcr.b(qzq, "storyLoadStateStore");
        akcr.b(yoo, "storySnapDownloader");
        akcr.b(zgb, "schedulersProvider");
        this.e = yhx;
        this.b = qzq;
        this.c = yoo;
        this.f = zgb;
    }

    public static List<PlayableStorySnapRecord> a(List<? extends PlayableStorySnapRecord> list) {
        akcr.b(list, "snaps");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (akcr.a(((PlayableStorySnapRecord) next).viewed(), Boolean.FALSE)) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        return (((Collection) list2).isEmpty() ^ 1) != 0 ? list2 : list;
    }

    private final ajdx<List<PlayableStorySnapRecord>> e(rdt rdt) {
        yhx yhx;
        if (rdt.f()) {
            yhx = this.e;
            String g = rdt.g();
            if (g == null) {
                akcr.a();
            }
            return yhx.a(g);
        } else if (!rdt.d()) {
            return null;
        } else {
            yhx = this.e;
            Long storyRowId = rdt.L.storyRowId();
            if (storyRowId == null) {
                akcr.a();
            }
            return yhx.b(storyRowId.longValue());
        }
    }

    public final ajcx a(rdt rdt) {
        Object c;
        String str;
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        ajdx e = e(rdt);
        if (e != null) {
            String e2 = rdt.e();
            if (e2 == null) {
                akcr.a();
            }
            rdt.L.isGroup();
            Object e3 = e.b((ajdw) a().i()).e((ajfc) new c(this, e2));
            akcr.a(e3, "playableStorySnaps\n     …      }\n                }");
            c = e3.c((ajev) new b(this, rdt));
            str = "prefetchMedia(playableSt…PrefetchCanceled(model) }";
        } else {
            c = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        }
        akcr.a(c, str);
        return c;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.d.b();
    }

    public final ajcx b(rdt rdt) {
        Object e;
        String str;
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        ajdx e2 = e(rdt);
        if (e2 != null) {
            String e3 = rdt.e();
            if (e3 == null) {
                akcr.a();
            }
            rdt.L.isGroup();
            e = e2.b((ajdw) a().i()).e((ajfc) new a(this, e3));
            str = "playableStorySnaps\n     …      }\n                }";
        } else {
            e = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        }
        akcr.a(e, str);
        return e;
    }

    public final boolean c(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        Boolean h;
        qzq qzq;
        String e;
        if (rdt.f()) {
            if (rdt.h() != null) {
                h = rdt.h();
                if (h == null) {
                    akcr.a();
                }
                if (!(h.booleanValue() || rdt.e() == null)) {
                    qzq = this.b;
                    e = rdt.e();
                    if (e == null) {
                        akcr.a();
                    }
                    return qzq.b(e) == a.SUCCESS;
                }
            }
        }
        if (rdt.d() && rdt.L.storyViewed() != null) {
            h = rdt.L.storyViewed();
            if (h == null) {
                akcr.a();
            }
            if (!(h.booleanValue() || rdt.e() == null)) {
                qzq = this.b;
                e = rdt.e();
                if (e == null) {
                    akcr.a();
                }
                return qzq.b(e) == a.SUCCESS;
            }
        }
    }

    public final void d(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        String e = rdt.e();
        if (e != null) {
            this.b.a(e, a.NOT_STARTED);
        }
    }
}
