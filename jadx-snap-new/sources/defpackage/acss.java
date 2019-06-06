package defpackage;

import com.snap.core.db.column.FeatureType;
import defpackage.acrw.e;
import defpackage.gyz.b;
import defpackage.ssj.a;
import defpackage.ssj.a.m;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: acss */
public final class acss {
    public final zfw a = zgb.a(adcw.b.callsite("MapPlaybackSearchControllerKt"));
    public ajej b;
    public String c;
    public final acth d;
    public final acsl e;
    final acrw f;
    public final acsw g;
    public final gwb h;

    /* renamed from: acss$d */
    static final class d<T> implements ajfb<gwu> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acss$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acss$j */
    public static final class j<T> implements ajfb<actc> {
        public static final j a = new j();

        j() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acss$a */
    static final class a extends akcq implements akbw<Map<String, String>, alee, ajxw> {
        a(acsw acsw) {
            super(2, acsw);
        }

        public final String getName() {
            return "fillSnapToSSSIdMap";
        }

        public final akej getOwner() {
            return akde.a(acsw.class);
        }

        public final String getSignature() {
            return "fillSnapToSSSIdMap(Ljava/util/Map;Lsnapchat/context/nano/StoryManifest;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Map map = (Map) obj;
            alee alee = (alee) obj2;
            akcr.b(map, "p1");
            akcr.b(alee, "p2");
            acsw.a(map, alee);
            return ajxw.a;
        }
    }

    /* renamed from: acss$b */
    static final class b extends akcq implements akbw<String, alee, ajdx<gwu>> {
        b(acrw acrw) {
            super(2, acrw);
        }

        public final String getName() {
            return "saveSearchManifestSnaps";
        }

        public final akej getOwner() {
            return akde.a(acrw.class);
        }

        public final String getSignature() {
            return "saveSearchManifestSnaps(Ljava/lang/String;Lsnapchat/context/nano/StoryManifest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            alee alee = (alee) obj2;
            akcr.b(str, "p1");
            akcr.b(alee, "p2");
            acrw acrw = (acrw) this.receiver;
            akcr.b(str, "fallbackTitle");
            akcr.b(alee, "manifest");
            obj = acrw.b.a(ajzl.a(ajxs.a(alee.a(), acrw.a.a(alee, str))), FeatureType.MAP).f(e.a);
            akcr.a(obj, "repository.saveSnaps(map…p { models -> models[0] }");
            return obj;
        }
    }

    /* renamed from: acss$c */
    static final class c extends akcq implements akbw<stl, gwu, ajxw> {
        c(acss acss) {
            super(2, acss);
        }

        public final String getName() {
            return "updateGroupWithModel";
        }

        public final akej getOwner() {
            return akde.a(acss.class);
        }

        public final String getSignature() {
            return "updateGroupWithModel(Lcom/snap/opera/presenter/config/OperaPresenterContext;Lcom/snap/discover/playback/api/model/StoryIdModel;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            stl stl = (stl) obj;
            gwu gwu = (gwu) obj2;
            akcr.b(stl, "p1");
            akcr.b(gwu, "p2");
            stl.e().a((a) new m(new b(gwu.b, FeatureType.MAP, gwu.a, false, ((acss) this.receiver).f.b(), 24)));
            return ajxw.a;
        }
    }

    /* renamed from: acss$f */
    public static final class f extends akcq implements akbl<List<? extends gwu>, List<? extends b>> {
        public f(acss acss) {
            super(1, acss);
        }

        public final String getName() {
            return "createGroups";
        }

        public final akej getOwner() {
            return akde.a(acss.class);
        }

        public final String getSignature() {
            return "createGroups(Ljava/util/List;)Ljava/util/List;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            gwu gwu = (gwu) list.get(0);
            return ajyl.a(new b(gwu.b, FeatureType.MAP, gwu.a, false, ((acss) this.receiver).f.b(), 24));
        }
    }

    /* renamed from: acss$g */
    public static final class g extends akcq implements akbw<acth.a, List<? extends smi>, ajdp<actc>> {
        public g(acth acth) {
            super(2, acth);
        }

        public final String getName() {
            return "launch";
        }

        public final akej getOwner() {
            return akde.a(acth.class);
        }

        public final String getSignature() {
            return "launch(Lcom/snapchat/map/feature/playback/opera/MapPlaybackOperaLauncher$LaunchConfig;Ljava/util/List;)Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            acth.a aVar = (acth.a) obj;
            List list = (List) obj2;
            akcr.b(aVar, "p1");
            akcr.b(list, "p2");
            return ((acth) this.receiver).a(aVar, list);
        }
    }

    /* renamed from: acss$h */
    public static final class h extends akcq implements akcb<stl, aliu, Map<String, String>, actc, ajej> {
        public h(acss acss) {
            super(4, acss);
        }

        public final String getName() {
            return "fetchAndMergeFullManifestOnLaunch";
        }

        public final akej getOwner() {
            return akde.a(acss.class);
        }

        public final String getSignature() {
            return "fetchAndMergeFullManifestOnLaunch(Lcom/snap/opera/presenter/config/OperaPresenterContext;Lsnapchat/map/nano/GetPoiPlaylistRequest;Ljava/util/Map;Lcom/snapchat/map/feature/playback/opera/MapOperaEvent;)Lio/reactivex/disposables/Disposable;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str;
            stl stl = (stl) obj;
            aliu aliu = (aliu) obj2;
            Map map = (Map) obj3;
            actc actc = (actc) obj4;
            akcr.b(stl, "p1");
            akcr.b(aliu, "p2");
            akcr.b(map, "p3");
            akcr.b(actc, "p4");
            acss acss = (acss) this.receiver;
            if (actc == actc.LAUNCHED) {
                obj = acss.f.a(aliu).c((ajfb) new acsu(ihw.a(new a(acss.g), map))).c((ajfc) new acsv(ihw.a(new b(acss.f), "default"))).c((ajfb) new acsu(ihw.a(new c(acss), stl))).c(30000, TimeUnit.MILLISECONDS).a((ajfb) d.a, (ajfb) e.a);
                str = "mapPlaybackClient.execut… manifest: %s\", error) })";
            } else {
                obj = ajfq.INSTANCE;
                str = "Disposables.disposed()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: acss$i */
    public static final class i extends akcq implements akbk<ajxw> {
        public i(acss acss) {
            super(0, acss);
        }

        public final String getName() {
            return "resetState";
        }

        public final akej getOwner() {
            return akde.a(acss.class);
        }

        public final String getSignature() {
            return "resetState()V";
        }

        public final /* synthetic */ Object invoke() {
            ((acss) this.receiver).a();
            return ajxw.a;
        }
    }

    /* renamed from: acss$k */
    public static final class k extends akcq implements akbl<Throwable, ajxw> {
        public k(acsw acsw) {
            super(1, acsw);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(acsw.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            ((acsw) this.receiver).a(th);
            return ajxw.a;
        }
    }

    public acss(zgb zgb, acth acth, acsl acsl, acrw acrw, acsw acsw, gwb gwb) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(acth, "mapPlaybackOperaLauncher");
        akcr.b(acsl, "mapPlaybackManifestConverter");
        akcr.b(acrw, "mapPlaybackClient");
        akcr.b(acsw, "mapPlaybackUtils");
        akcr.b(gwb, "repository");
        this.d = acth;
        this.e = acsl;
        this.f = acrw;
        this.g = acsw;
        this.h = gwb;
    }

    public final void a() {
        ajej ajej = this.b;
        if (ajej != null) {
            ajej.dispose();
        }
        this.b = null;
        this.c = null;
    }
}
