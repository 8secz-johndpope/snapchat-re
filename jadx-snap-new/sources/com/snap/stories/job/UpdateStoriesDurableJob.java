package com.snap.stories.job;

import com.snap.core.db.record.StorySyncStateModel;
import com.snap.stories.api.StoriesHttpInterface;
import defpackage.afcl;
import defpackage.afem;
import defpackage.ajcx;
import defpackage.ajeb;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akhw;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.hwm;
import defpackage.ide;
import defpackage.yhy;
import defpackage.ylh;
import defpackage.ymk;
import defpackage.yml;
import defpackage.yot;
import defpackage.you;
import defpackage.yov;
import defpackage.zfw;
import defpackage.zgb;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

@hwk(a = "UPDATE_STORIES_JOB", b = yml.class)
public final class UpdateStoriesDurableJob extends hwg<yml> {

    public static final class a implements hwm<UpdateStoriesDurableJob, akhw> {
        final Map<yot, yov> a = new LinkedHashMap();
        final ajxe b;
        private final zfw c = zgb.a(yhy.j.callsite("UpdateStoriesDurableJobProcessor"));
        private final ajxe d;

        static final class a<V> implements Callable<Object> {
            private /* synthetic */ a a;
            private /* synthetic */ UpdateStoriesDurableJob b;

            a(a aVar, UpdateStoriesDurableJob updateStoriesDurableJob) {
                this.a = aVar;
                this.b = updateStoriesDurableJob;
            }

            public final /* synthetic */ Object call() {
                this.a.a().a(this.a.a);
                return ajxw.a;
            }
        }

        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Entry entry = (Entry) obj;
                akcr.b(entry, "it");
                if ((((yot) entry.getKey()).b == you.SNAP_ID ? 1 : null) != null) {
                    afcl afcl = new afcl();
                    afcl.a = ((yot) entry.getKey()).a;
                    afcl.f = Boolean.valueOf(((yov) entry.getValue()).c);
                    afcl.e = Boolean.valueOf(((yov) entry.getValue()).d);
                    afcl.g = Boolean.valueOf(((yov) entry.getValue()).e);
                    afcl.c = ((yov) entry.getValue()).g ? Integer.valueOf(1) : Integer.valueOf(0);
                    afcl.b = ((yov) entry.getValue()).f;
                    return afcl;
                }
                throw new IllegalStateException("This job should only process SNAP_ID records".toString());
            }
        }

        static final class c<T, R> implements ajfc<T, R> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                afem afem = new afem();
                afem.a = list;
                return afem;
            }
        }

        static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ a a;

            d(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                afem afem = (afem) obj;
                akcr.b(afem, "it");
                return ((StoriesHttpInterface) this.a.b.b()).updateStories(afem);
            }
        }

        static final class e<T, R> implements ajfc<T, R> {
            public static final e a = new e();

            e() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akhw akhw = (akhw) obj;
                akcr.b(akhw, "it");
                return akhw;
            }
        }

        static final class f extends akcq implements akbk<StoriesHttpInterface> {
            f(ajwy ajwy) {
                super(0, ajwy);
            }

            public final String getName() {
                return "get";
            }

            public final akej getOwner() {
                return akde.a(ajwy.class);
            }

            public final String getSignature() {
                return "get()Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke() {
                return (StoriesHttpInterface) ((ajwy) this.receiver).get();
            }
        }

        static final class g extends akcq implements akbk<ylh> {
            g(ajwy ajwy) {
                super(0, ajwy);
            }

            public final String getName() {
                return "get";
            }

            public final akej getOwner() {
                return akde.a(ajwy.class);
            }

            public final String getSignature() {
                return "get()Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke() {
                return (ylh) ((ajwy) this.receiver).get();
            }
        }

        static {
            aken[] akenArr = new aken[]{new akdc(akde.a(a.class), "storiesHttpInterface", "getStoriesHttpInterface()Lcom/snap/stories/api/StoriesHttpInterface;"), new akdc(akde.a(a.class), "storySnapsSeenDataStore", "getStorySnapsSeenDataStore()Lcom/snap/stories/db/StorySnapsSeenDataStore;")};
        }

        public a(zgb zgb, ajwy<StoriesHttpInterface> ajwy, ajwy<ylh> ajwy2) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ajwy, "storiesHttpInterfaceProvider");
            akcr.b(ajwy2, "storySnapsSeenDataStoreProvider");
            this.b = ajxh.a(new f(ajwy));
            this.d = ajxh.a(new g(ajwy2));
        }

        /* Access modifiers changed, original: final */
        public final ylh a() {
            return (ylh) this.d.b();
        }

        public final void a(String str) {
            String str2 = "uuid";
            akcr.b(str, str2);
            akcr.b(str, str2);
        }

        public final void a(String str, Integer num) {
            String str2 = "uuid";
            akcr.b(str, str2);
            akcr.b(str, str2);
        }

        public final boolean a(Throwable th) {
            String str = "throwable";
            akcr.b(th, str);
            akcr.b(th, str);
            return false;
        }

        public final /* bridge */ /* synthetic */ void b(hwg hwg) {
            UpdateStoriesDurableJob updateStoriesDurableJob = (UpdateStoriesDurableJob) hwg;
            String str = "durableJob";
            akcr.b(updateStoriesDurableJob, str);
            akcr.b(updateStoriesDurableJob, str);
        }

        public final /* synthetic */ ajcx c(hwg hwg) {
            UpdateStoriesDurableJob updateStoriesDurableJob = (UpdateStoriesDurableJob) hwg;
            akcr.b(updateStoriesDurableJob, "durableJob");
            Object b = ajcx.b((Callable) new a(this, updateStoriesDurableJob));
            akcr.a(b, "Completable.fromCallable…SnapsToProcess)\n        }");
            return b;
        }

        public final /* bridge */ /* synthetic */ ide c() {
            return yhy.j;
        }

        public final void d() {
        }

        public final /* synthetic */ void d(hwg hwg) {
            UpdateStoriesDurableJob updateStoriesDurableJob = (UpdateStoriesDurableJob) hwg;
            akcr.b(updateStoriesDurableJob, "durableJob");
            this.a.putAll(((yml) updateStoriesDurableJob.d).a);
            a().a(this.a.keySet());
        }

        public final /* synthetic */ ajcx e(hwg hwg) {
            UpdateStoriesDurableJob updateStoriesDurableJob = (UpdateStoriesDurableJob) hwg;
            akcr.b(updateStoriesDurableJob, "durableJob");
            return defpackage.hwm.a.b(updateStoriesDurableJob);
        }
    }

    public UpdateStoriesDurableJob(hwh hwh, yml yml) {
        akcr.b(hwh, "jobConfig");
        akcr.b(yml, StorySyncStateModel.METADATA);
        super(hwh, yml);
    }

    public /* synthetic */ UpdateStoriesDurableJob(yml yml) {
        this(ymk.a, yml);
    }
}
