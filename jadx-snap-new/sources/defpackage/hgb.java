package defpackage;

import com.snap.core.db.query.LegacyDiscoverFeedQueries;
import defpackage.hgi.n;
import defpackage.hgi.o;
import defpackage.hgi.p;

/* renamed from: hgb */
public final class hgb {
    final ajwl<a> a;
    final hgi b;
    final tnj c;
    private final gpu d;
    private final zfw e;

    /* renamed from: hgb$a */
    static final class a {
        final boolean a;
        final long b;

        public a(boolean z, long j) {
            this.a = z;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            long j = this.b;
            return i + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DiscoverFeedVisibilityData(isVisible=");
            stringBuilder.append(this.a);
            stringBuilder.append(", timestamp=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: hgb$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ hgb a;

        /* renamed from: hgb$e$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Long l = (Long) obj;
                akcr.b(l, "it");
                return Boolean.valueOf(l.longValue() > 0);
            }
        }

        e(hgb hgb) {
            this.a = hgb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            if (aVar.a) {
                return ajdp.b(Boolean.FALSE);
            }
            hgi hgi = this.a.b;
            obj = LegacyDiscoverFeedQueries.FACTORY.getNewFriendStoriesCount(Long.valueOf(aVar.b), Long.valueOf(System.currentTimeMillis()));
            akcr.a(obj, "LegacyDiscoverFeedQuerie…stem.currentTimeMillis())");
            Object obj2 = LegacyDiscoverFeedQueries.FACTORY;
            akcr.a(obj2, "LegacyDiscoverFeedQueries.FACTORY");
            p pVar = new p(obj2.getNewFriendStoriesCountMapper());
            obj = hgi.a().queryAndMapToList("df:getNewStoriesCount", obj, pVar).p(o.a);
            akcr.a(obj, "snapDb.queryAndMapToList…else 0L\n                }");
            return obj.p(1.a);
        }
    }

    /* renamed from: hgb$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ boolean a;

        b(boolean z) {
            this.a = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "latestUnviewedFriendStoryTimestamp");
            return new a(this.a, l.longValue());
        }
    }

    /* renamed from: hgb$c */
    static final class c extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ hgb a;

        c(hgb hgb) {
            this.a = hgb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (a) obj;
            this.a.a.a(obj);
            this.a.c.b().a((fth) gvt.DF_FRIENDS_STORIES_LAST_CHECKED_TIMESTAMP_MS, Long.valueOf(obj.b)).b();
            return ajxw.a;
        }
    }

    /* renamed from: hgb$d */
    static final class d extends akcs implements akbl<Throwable, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "e");
            return ajxw.a;
        }
    }

    public hgb(hgi hgi, tnj tnj, gpu gpu, zfw zfw, ftl ftl) {
        akcr.b(hgi, "discoverFeedFriendsStoriesDataProvider");
        akcr.b(tnj, "prefs");
        akcr.b(gpu, "userSession");
        akcr.b(zfw, "schedulers");
        akcr.b(ftl, "compositeConfigurationProvider");
        this.b = hgi;
        this.c = tnj;
        this.d = gpu;
        this.e = zfw;
        Object i = ajwl.i(new a(false, ftl.h(gvt.DF_FRIENDS_STORIES_LAST_CHECKED_TIMESTAMP_MS)));
        akcr.a(i, "BehaviorSubject.createDe…T_CHECKED_TIMESTAMP_MS)))");
        this.a = i;
    }

    public final ajdp<Boolean> a() {
        Object j = this.a.a((ajdw) this.e.i()).u(new e(this)).j(ajfu.a);
        akcr.a(j, "discoverFeedVisibilityDa…  .distinctUntilChanged()");
        return j;
    }

    public final void a(boolean z) {
        a aVar = (a) this.a.p();
        if (aVar == null || z != aVar.a) {
            hgi hgi = this.b;
            Object latestUnviewedFriendStoriesTimestamp = LegacyDiscoverFeedQueries.FACTORY.getLatestUnviewedFriendStoriesTimestamp(Long.valueOf(System.currentTimeMillis()));
            akcr.a(latestUnviewedFriendStoriesTimestamp, "LegacyDiscoverFeedQuerie…stem.currentTimeMillis())");
            Object obj = LegacyDiscoverFeedQueries.FACTORY;
            akcr.a(obj, "LegacyDiscoverFeedQueries.FACTORY");
            String str = "df:getLatestUnviewedFriendStoriesTimestamp";
            ajdx f = hgi.a().queryAndMapToOneOrDefault(str, latestUnviewedFriendStoriesTimestamp, new n(obj.getLatestUnviewedFriendStoriesTimestampMapper()), Long.valueOf(0)).b((ajdw) this.e.i()).a((ajdw) this.e.b()).f(new b(z));
            akcr.a((Object) f, "discoverFeedFriendsStori…estamp)\n                }");
            gpv.a(f, (akbl) new c(this), (akbl) d.a, this.d);
        }
    }
}
