package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hoe */
public final class hoe implements gvn {
    final zjw a;
    final Context b;
    final hod c;
    final hoj d;
    private final ajxe e;
    private final ajxe f;
    private final List<hol> g;
    private final List<String> h;

    /* renamed from: hoe$h */
    static final class h extends akcq implements akbk<ihm> {
        h(ajwy ajwy) {
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
            return (ihm) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hoe$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        g(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hbn.f.callsite("DiscoverFeedDeepLinkHandler"));
        }
    }

    /* renamed from: hoe$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ hoe a;

        e(hoe hoe) {
            this.a = hoe;
        }

        public final /* synthetic */ Object call() {
            this.a.a.a(hbn.a, false, null, null);
            return ajxw.a;
        }
    }

    /* renamed from: hoe$a */
    static final class a<T1, T2> implements ajew<acig<zjm, zjk>, Throwable> {
        private /* synthetic */ hoe a;
        private /* synthetic */ Uri b;
        private /* synthetic */ long c;

        a(hoe hoe, Uri uri, long j) {
            this.a = hoe;
            this.b = uri;
            this.c = j;
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            hod hod;
            Uri uri;
            ilv a;
            inz inz;
            acig acig = (acig) obj;
            Throwable th = (Throwable) obj2;
            String str = "uri.path";
            String str2 = "PATH";
            String str3 = MessageMediaRefModel.URI;
            if (acig == null || th != null) {
                hod = this.a.c;
                uri = this.b;
                akcr.b(uri, str3);
                a = hod.a();
                inz = inz.DEEPLINK_ERROR;
            } else {
                hod = this.a.c;
                uri = this.b;
                akcr.b(uri, str3);
                a = hod.a();
                inz = inz.DEEPLINK_HANDLED;
            }
            String path = uri.getPath();
            akcr.a((Object) path, str);
            a.c(inz.a(str2, path), 1);
            hod = this.a.c;
            uri = this.b;
            long j = this.c;
            akcr.b(uri, str3);
            a = hod.a();
            inz inz2 = inz.DEEPLINK_DURATION;
            path = uri.getPath();
            akcr.a((Object) path, str);
            a.a(inz2.a(str2, path), j);
        }
    }

    /* renamed from: hoe$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ hoe a;

        b(hoe hoe) {
            this.a = hoe;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            obj = (Throwable) obj;
            if (obj instanceof ajxl) {
                str = "Feature coming soon!";
            } else {
                akcr.a(obj, "it");
                str = obj.getLocalizedMessage();
            }
            Toast.makeText(this.a.b, str, 1).show();
        }
    }

    /* renamed from: hoe$c */
    static final class c<T, R> implements ajfc<Throwable, ajeb<? extends acig<zjm, zjk>>> {
        private /* synthetic */ hoe a;
        private /* synthetic */ Uri b;

        c(hoe hoe, Uri uri) {
            this.a = hoe;
            this.b = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return this.a.d.b(this.b);
        }
    }

    /* renamed from: hoe$d */
    static final class d<T, R> implements ajfc<acig<zjm, zjk>, ajdb> {
        final /* synthetic */ hoe a;

        d(hoe hoe) {
            this.a = hoe;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final acig acig = (acig) obj;
            akcr.b(acig, "it");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ d a;

                public final void run() {
                    this.a.a.a.a(hbn.a, false, acig, null);
                }
            });
        }
    }

    /* renamed from: hoe$f */
    static final class f<T, R> implements ajfc<ajxw, ajdb> {
        final /* synthetic */ hoe a;
        private /* synthetic */ ajdx b;

        /* renamed from: hoe$f$1 */
        static final class 1<T, R> implements ajfc<acig<zjm, zjk>, ajdb> {
            final /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final acig acig = (acig) obj;
                akcr.b(acig, "it");
                return ajcx.a((ajev) new ajev(this) {
                    private /* synthetic */ 1 a;

                    public final void run() {
                        zjw zjw = this.a.a.a.a;
                        acig acig = acig;
                        akcr.a((Object) acig, "it");
                        zjw.a(acig);
                    }
                });
            }
        }

        f(hoe hoe, ajdx ajdx) {
            this.a = hoe;
            this.b = ajdx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxw) obj, "it");
            return this.b.e((ajfc) new 1(this));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hoe.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hoe.class), "stopwatch", "getStopwatch()Lcom/snap/framework/time/Stopwatch;")};
    }

    public hoe(zjw zjw, Context context, zgb zgb, hon hon, hop hop, hoo hoo, hok hok, hos hos, hod hod, ajwy<ihm> ajwy, hoj hoj) {
        akcr.b(zjw, "deepLinkNavigator");
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(hon, "operaNavigableProvider");
        akcr.b(hop, "showProfileNavigableProvider");
        akcr.b(hoo, "publisherProfileNavigableProvider");
        akcr.b(hok, "httpNavigableProvider");
        akcr.b(hos, "deeplinkCompositeStoriesNavigableProvider");
        akcr.b(hod, "deeplinkAnalytics");
        akcr.b(ajwy, "stopwatchProvider");
        akcr.b(hoj, "defaultNavigableProvider");
        this.a = zjw;
        this.b = context;
        this.c = hod;
        this.d = hoj;
        this.e = ajxh.a(new g(zgb));
        this.f = ajxh.a(new h(ajwy));
        this.g = ajym.b((Object[]) new hol[]{hop, hoo, hon, hok, hos, this.d});
        Object of = ImmutableList.of("https://www.snapchat.com/discover/.*", "http://www.snapchat.com/discover/.*", "snapchat://discover/.*", "snapchat://discover");
        akcr.a(of, "ImmutableList.of(\n      …COVER_FEED_BASE_URI\n    )");
        this.h = (List) of;
    }

    private final zfw b() {
        return (zfw) this.e.b();
    }

    private final ihm c() {
        return (ihm) this.f.b();
    }

    public final List<String> a() {
        return this.h;
    }

    public final ajcx c(Uri uri) {
        Object b;
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        for (Object next : this.g) {
            if (((hol) next).a(uri)) {
                break;
            }
        }
        Object next2 = null;
        hol hol = (hol) next2;
        if (hol == null) {
            StringBuilder stringBuilder = new StringBuilder("discover deep link ");
            stringBuilder.append(uri);
            stringBuilder.append(" not supported yet");
            b = ajcx.b((Throwable) new ajxl(stringBuilder.toString()));
            str = "Completable.error(NotImp…$uri not supported yet\"))";
        } else {
            c().a();
            hod hod = this.c;
            akcr.b(uri, str);
            ilv a = hod.a();
            inz inz = inz.DEEPLINK_RECEIVED;
            String path = uri.getPath();
            akcr.a((Object) path, "uri.path");
            a.c(inz.a("PATH", path), 1);
            Object a2 = hol.b(uri).a((ajdw) b().f()).a((ajew) new a(this, uri, c().c()));
            akcr.a(a2, "this.observeOn(scheduler…i, elapsedTime)\n        }");
            b = a2.a((ajdw) b().l()).d((ajfb) new b(this)).h(new c(this, uri));
            akcr.a(b, "this.observeOn(scheduler…tNavigable(uri)\n        }");
            int i = hof.a[hol.a() - 1];
            if (i == 1) {
                b = b.a((ajdw) b().l()).e((ajfc) new d(this));
                str = "navigableSingle.observeO…      }\n                }";
            } else if (i == 2) {
                b = ajdx.c((Callable) new e(this)).e((ajfc) new f(this, b));
                str = "Single.fromCallable {\n  …      }\n                }";
            } else {
                throw new ajxk();
            }
        }
        akcr.a(b, str);
        return b;
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return c(uri);
    }
}
