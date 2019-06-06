package defpackage;

import com.snap.core.db.record.StorySnapRecord.PlayableStorySnapRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: qzr */
public final class qzr implements hmo<rdt> {
    final idl a = qxo.a.d.b;
    final yoo b;
    final zfw c;
    private final ajei d = new ajei();
    private final yhx e;
    private final qzq f;

    /* renamed from: qzr$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qzr a;
        private /* synthetic */ rdt b;

        a(qzr qzr, rdt rdt) {
            this.a = qzr;
            this.b = rdt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            String str = "snaps";
            akcr.b(list, str);
            qzr qzr = this.a;
            String e = this.b.e();
            if (e == null) {
                akcr.a();
            }
            akcr.b(list, str);
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((PlayableStorySnapRecord) next).viewed(), Boolean.FALSE)) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if ((list2.isEmpty() ^ 1) != 0) {
                list = list2;
            }
            PlayableStorySnapRecord playableStorySnapRecord = (PlayableStorySnapRecord) ajyu.g(list);
            if (playableStorySnapRecord == null) {
                obj = ajdx.b(Integer.valueOf(0));
                str = "Single.just(0)";
            } else {
                obj = qzr.b.b(playableStorySnapRecord, qzr.a).b((ajdw) qzr.c.g()).c((ajfb) new b(playableStorySnapRecord, e)).b((ajev) new c(playableStorySnapRecord, e)).a((ajfb) new d(playableStorySnapRecord, e)).c((ajev) new e(playableStorySnapRecord, e)).a(Integer.valueOf(1)).b((ajdw) qzr.c.g());
                str = "storySnapDownloader.asso…eOn(schedulers.network())";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: qzr$b */
    static final class b<T> implements ajfb<ajej> {
        private /* synthetic */ PlayableStorySnapRecord a;
        private /* synthetic */ String b;

        b(PlayableStorySnapRecord playableStorySnapRecord, String str) {
            this.a = playableStorySnapRecord;
            this.b = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qzr$c */
    static final class c implements ajev {
        private /* synthetic */ PlayableStorySnapRecord a;
        private /* synthetic */ String b;

        c(PlayableStorySnapRecord playableStorySnapRecord, String str) {
            this.a = playableStorySnapRecord;
            this.b = str;
        }

        public final void run() {
        }
    }

    /* renamed from: qzr$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ PlayableStorySnapRecord a;
        private /* synthetic */ String b;

        d(PlayableStorySnapRecord playableStorySnapRecord, String str) {
            this.a = playableStorySnapRecord;
            this.b = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qzr$e */
    static final class e implements ajev {
        private /* synthetic */ PlayableStorySnapRecord a;
        private /* synthetic */ String b;

        e(PlayableStorySnapRecord playableStorySnapRecord, String str) {
            this.a = playableStorySnapRecord;
            this.b = str;
        }

        public final void run() {
        }
    }

    public qzr(yhx yhx, qzq qzq, yoo yoo, zfw zfw) {
        akcr.b(yhx, "storiesDataProvider");
        akcr.b(qzq, "storyLoadStateStore");
        akcr.b(yoo, "storySnapDownloader");
        akcr.b(zfw, "schedulers");
        this.e = yhx;
        this.f = qzq;
        this.b = yoo;
        this.c = zfw;
    }

    public final /* synthetic */ ajdx a(Object obj) {
        ajdx a;
        rdt rdt = (rdt) obj;
        akcr.b(rdt, "dataModel");
        yhx yhx;
        if (rdt.f()) {
            yhx = this.e;
            String g = rdt.g();
            if (g == null) {
                akcr.a();
            }
            a = yhx.a(g);
        } else if (rdt.d()) {
            yhx = this.e;
            Long storyRowId = rdt.L.storyRowId();
            if (storyRowId == null) {
                akcr.a();
            }
            a = yhx.b(storyRowId.longValue());
        } else {
            a = null;
        }
        if (a != null) {
            a = a.b((ajdw) this.c.i());
            if (a != null) {
                ajdx a2 = a.a((ajfc) new a(this, rdt));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        obj = ajdx.b(Integer.valueOf(0));
        akcr.a(obj, "Single.just(0)");
        return obj;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        akcr.b((rdt) obj, "dataModel");
    }

    public final void dispose() {
        this.d.dispose();
    }

    public final boolean isDisposed() {
        return this.d.isDisposed();
    }
}
