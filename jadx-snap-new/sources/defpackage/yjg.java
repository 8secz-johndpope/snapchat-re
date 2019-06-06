package defpackage;

import android.net.Uri;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.yip.l;
import defpackage.yju.a;
import defpackage.yju.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: yjg */
public abstract class yjg extends ggm {
    final Map<String, String> a = ajzl.a(new ajxm("__xsc_local__media_type", "thumbnails"));
    final yjt b;
    final gee c;
    final yju d;
    private volatile DbClient e = this.h.getDbClient((ide) yhy.j);
    private volatile int f = this.h.getSessionId();
    private final zfw g = zgb.a(yhy.j.callsite("BaseStoryThumbnailUriHandler"));
    private final SnapDb h;

    /* renamed from: yjg$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ yjg a;
        private /* synthetic */ String b;
        private /* synthetic */ Set c;
        private /* synthetic */ Set d;

        a(yjg yjg, String str, Set set, Set set2) {
            this.a = yjg;
            this.b = str;
            this.c = set;
            this.d = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            yjx yjx = (yjx) obj;
            akcr.b(yjx, "thumbnailInfo");
            ghm c = gii.c(new ggh(yjx.e, yjx.f).b(), null, 2);
            yjg yjg = this.a;
            String str = this.b;
            String a = yjx.a();
            return new ajxm(new gew(str, new defpackage.sbm.a(a, sac.GET).c(yjg.a).e(), null, c, yjg.b, this.c, this.d, 268), yjx);
        }
    }

    /* renamed from: yjg$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yjg a;
        private /* synthetic */ boolean b;

        b(yjg yjg, boolean z) {
            this.a = yjg;
            this.b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            gew gew = (gew) ajxm.a;
            obj = (yjx) ajxm.b;
            Object a = this.a.c.a(gew).a(this.b);
            akcr.a(a, "contentManager.submit(re…tResult(closeOnTerminate)");
            ajeb ajeb = (ajeb) a;
            obj = ajdx.b(obj);
            akcr.a(obj, "Single.just(thumbnailInfo)");
            return ajwc.a(ajeb, (ajeb) obj);
        }
    }

    /* renamed from: yjg$c */
    static final class c<T> implements ajfb<ajxm<? extends gej, ? extends yjx>> {
        private /* synthetic */ yjg a;

        c(yjg yjg) {
            this.a = yjg;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            Object obj2 = (gej) ajxm.a;
            obj = (yjx) ajxm.b;
            if (!obj2.a()) {
                yjg yjg = this.a;
                akcr.a(obj2, "contentResult");
                obj2 = obj2.e();
                akcr.a(obj2, "contentResult.failureReason");
                akcr.a(obj, "thumbnailInfo");
                if (obj2.a() == 410) {
                    obj = obj.a;
                    if (obj != null) {
                        yju yju = yjg.d;
                        if (yju != null) {
                            String str = "snapId";
                            akcr.b(obj, str);
                            WeakReference weakReference = yju.a;
                            if (weakReference == null) {
                                akcr.a("storyRepository");
                            }
                            yip yip = (yip) weakReference.get();
                            gpu e = yip != null ? yip.e() : null;
                            if (yip != null && e != null) {
                                akcr.b(obj, str);
                                ajcx e2 = ajdx.b(obj).a((ajdw) yip.e.i()).e((ajfc) new l(yip, obj));
                                akcr.a((Object) e2, "Single.just(snapId)\n    …  }\n                    }");
                                gpv.a(e2, (akbk) new a(obj), (akbl) new b(obj), e);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: yjg$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yjg$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return (gej) ajxm.a;
        }
    }

    public yjg(SnapDb snapDb, yjt yjt, gee gee, yju yju, zgb zgb) {
        akcr.b(snapDb, "snapDb");
        akcr.b(yjt, "storiesThumbnailContentType");
        akcr.b(gee, "contentManager");
        akcr.b(zgb, "schedulersProvider");
        this.h = snapDb;
        this.b = yjt;
        this.c = gee;
        this.d = yju;
    }

    public abstract ajdx<yjx> a(Uri uri);

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object uri2 = uri.toString();
        akcr.a(uri2, "uri.toString()");
        Object f = a(uri).a((ajdw) this.g.f()).f(new a(this, uri2, set, set2)).a((ajfc) new b(this, z)).c((ajfb) new c(this)).d((ajfb) d.a).f(e.a);
        akcr.a(f, "resolve(uri)\n           …lt, _) -> contentResult }");
        return f;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        Set<rzg> set3 = set;
        akcr.b(set, "schedulingContexts");
        Set<? extends gdy> set4 = set2;
        akcr.b(set4, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        gee gee = this.c;
        String uri3 = uri.toString();
        akcr.a((Object) uri3, "uri.toString()");
        String str = uri3;
        sak sak = null;
        Object a = gee.a(new gew(str, sak, gem.a((ajdx) ajdx), null, this.b, set3, set4, 278)).a(z);
        akcr.a(a, "contentManager.submit(De…tResult(closeOnTerminate)");
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final DbClient a() {
        Object obj;
        if (this.f != this.h.getSessionId()) {
            obj = this.e;
            akcr.a(obj, "_dbClient");
            synchronized (obj) {
                if (this.f != this.h.getSessionId()) {
                    this.f = this.h.getSessionId();
                    this.e = this.h.getDbClient((ide) yhy.j);
                }
            }
        }
        obj = this.e;
        akcr.a(obj, "_dbClient");
        return obj;
    }
}
