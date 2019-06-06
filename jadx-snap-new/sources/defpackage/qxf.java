package defpackage;

import defpackage.abln.d;
import defpackage.qxa.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: qxf */
public final class qxf implements ablh {
    final ablp a;
    final dib b;
    private final zfw c = zgb.a(qxo.b.callsite("GhostToFeedReporter"));
    private final ilv d;
    private final ajdx<iha> e;
    private final ajei f;

    /* renamed from: qxf$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            d dVar = (d) t;
            String str = "null cannot be cast to non-null type com.snap.messaging.friendsfeed.analytics.FeedSyncAnalytics.Step";
            if (dVar != null) {
                Comparable valueOf = Integer.valueOf(((defpackage.qxa.a) dVar).ordinal());
                d dVar2 = (d) t2;
                if (dVar2 != null) {
                    return ajzy.a(valueOf, Integer.valueOf(((defpackage.qxa.a) dVar2).ordinal()));
                }
                throw new ajxt(str);
            }
            throw new ajxt(str);
        }
    }

    /* renamed from: qxf$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ablm a;
        private /* synthetic */ qxf b;

        c(ablm ablm, qxf qxf) {
            this.a = ablm;
            this.b = qxf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "it");
            qxf qxf = this.b;
            ablm ablm = this.a;
            long a = qxf.a.a();
            Object obj2 = ablm.d;
            akcr.a(obj2, "measurement.mNotableInstants");
            Map a2 = ajzl.a(obj2, new b());
            Collection arrayList = new ArrayList(a2.size());
            long j = a;
            for (Entry entry : a2.entrySet()) {
                d dVar = (d) entry.getKey();
                Object b = ablm.b((Long) entry.getValue());
                long longValue = b.longValue() - j;
                akcr.a(b, "launchInstantMillis");
                j = b.longValue();
                arrayList.add(ajxs.a(String.valueOf(dVar.a()), Long.valueOf(longValue)));
            }
            return ajdx.b(iha.b(ajzm.a((Iterable) ajyu.a((Collection) (List) arrayList, (Object) ajxs.a("interval_launch_to_action_ms", Long.valueOf(ablm.b(ablm.i).longValue() - a))))));
        }
    }

    /* renamed from: qxf$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ablm a;
        private /* synthetic */ boolean b;
        private /* synthetic */ Long c;
        private /* synthetic */ long d;
        private /* synthetic */ qxf e;

        d(ablm ablm, boolean z, Long l, long j, qxf qxf) {
            this.a = ablm;
            this.b = z;
            this.c = l;
            this.d = j;
            this.e = qxf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            Object aaaz = new aaaz();
            aaaz.a(this.a.b.name());
            boolean z = false;
            aaaz.a(Boolean.valueOf(this.a.h == qxj.USER_IN_FEED));
            long j = -1;
            if (this.b) {
                ablm ablm = this.a;
                Object obj2 = this.c;
                akcr.a(obj2, "nowNanos");
                long longValue = obj2.longValue();
                if (ablm != null) {
                    Object obj3 = ablm.g.get(qxg.USER_ENTER_FEED);
                    if (!(obj3 instanceof Long)) {
                        obj3 = null;
                    }
                    Long l = (Long) obj3;
                    long longValue2 = l != null ? l.longValue() : 0;
                    if (longValue2 != 0) {
                        l = ablm.b(Long.valueOf(longValue - longValue2));
                        if (l == null) {
                            akcr.a();
                        }
                        j = l.longValue();
                    }
                }
            } else {
                j = 0;
            }
            if (j != 0) {
                aaaz.a(Long.valueOf(j));
            }
            Boolean bool = (Boolean) this.a.g.get(qxg.RESULT_SUCCESS);
            aaaz.c(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
            bool = (Boolean) this.a.g.get(qxg.TRIGGERED_BY_NOTIFICATION);
            if (bool != null) {
                z = bool.booleanValue();
            }
            aaaz.b(Boolean.valueOf(z));
            aaaz.b(Long.valueOf(this.d));
            aaaz.c(Long.valueOf(this.d));
            aaaz.b(str);
            return ajdx.b(aaaz);
        }
    }

    /* renamed from: qxf$e */
    static final class e<T> implements ajfb<aaaz> {
        private /* synthetic */ qxf a;

        e(qxf qxf) {
            this.a = qxf;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.a((aajt) (aaaz) obj);
        }
    }

    /* renamed from: qxf$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qxf$b */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            d dVar = (d) t;
            String str = "null cannot be cast to non-null type com.snap.messaging.friendsfeed.analytics.FeedSyncAnalytics.Step";
            if (dVar != null) {
                Comparable valueOf = Integer.valueOf(((a) dVar).ordinal());
                d dVar2 = (d) t2;
                if (dVar2 != null) {
                    return ajzy.a(valueOf, Integer.valueOf(((a) dVar2).ordinal()));
                }
                throw new ajxt(str);
            }
            throw new ajxt(str);
        }
    }

    public qxf(ilv ilv, ablp ablp, dib dib, ajdx<iha> ajdx, ajei ajei, zgb zgb) {
        akcr.b(ilv, "graphene");
        akcr.b(ablp, "startupContext");
        akcr.b(dib, "eventLogger");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(zgb, "schedulersProvider");
        this.d = ilv;
        this.a = ablp;
        this.b = dib;
        this.e = ajdx;
        this.f = ajei;
    }

    public final void a() {
    }

    public final void a(ablm ablm) {
        if (ablm != null) {
            boolean z = ablm.h == qxj.USER_IN_FEED;
            Long l = ablm.i;
            long a = this.a.a();
            Object obj = ablm.d;
            akcr.a(obj, "measurement.mNotableInstants");
            Map a2 = ajzl.a(obj, new a());
            Collection arrayList = new ArrayList(a2.size());
            for (Entry entry : a2.entrySet()) {
                entry.getKey();
                Object b = ablm.b((Long) entry.getValue());
                long longValue = b.longValue() - a;
                akcr.a(b, "launchInstantMillis");
                a = b.longValue();
                arrayList.add(Long.valueOf(longValue));
            }
            long x = ajyu.x(ajyu.k((List) arrayList));
            Object obj2 = ablm.b;
            akcr.a(obj2, "measurement.mLaunchType");
            inq inq = inq.GHOST_TO_FEED_READY;
            String name = obj2.name();
            akcr.a((Object) name, "launchType.name()");
            this.d.a(inq.a("launch_type", name), x);
            this.f.a(this.e.a((ajfc) new c(ablm, this)).a((ajfc) new d(ablm, z, l, x, this)).a((ajdw) this.c.l()).a((ajfb) new e(this), (ajfb) f.a));
        }
    }
}
