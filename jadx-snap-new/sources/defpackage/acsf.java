package defpackage;

import android.graphics.PointF;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.FeatureType;
import defpackage.acth.a;
import defpackage.gyz.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: acsf */
public final class acsf implements acrx {
    final zfw a = zgb.a(adcw.b.callsite("MapPlaybackHeatControllerKt"));
    ajej b;
    ajxm<? extends cgi, ? extends PointF> c;
    actb d;
    boolean e;
    final acth f;
    final acsl g;
    final acrw h;
    final gwb i;
    final aipn<aclg> j;
    final acrv k;
    final acsw l;
    final acma m;
    final actj n;

    /* renamed from: acsf$a */
    static final class a<T> implements ajfb<actc> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acsf$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ acsf a;
        private /* synthetic */ cgi b;

        b(acsf acsf, cgi cgi) {
            this.a = acsf;
            this.b = cgi;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.a.m.a(this.b, aarj.ERROR);
            acsw acsw = this.a.l;
            akcr.a((Object) th, "it");
            acsw.a(th);
        }
    }

    /* renamed from: acsf$c */
    static final class c extends akcq implements akbl<Optional<alee>, ajdj<alee>> {
        c(acsf acsf) {
            super(1, acsf);
        }

        public final String getName() {
            return "checkNoSnapsAndNotify";
        }

        public final akej getOwner() {
            return akde.a(acsf.class);
        }

        public final String getSignature() {
            return "checkNoSnapsAndNotify(Lcom/google/common/base/Optional;)Lio/reactivex/Maybe;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            Optional optional = (Optional) obj;
            akcr.b(optional, "p1");
            acsf acsf = (acsf) this.receiver;
            if (optional.isPresent()) {
                Object obj2 = ((alee) optional.get()).b;
                akcr.a(obj2, "manifestOpt.get().elements");
                if (((obj2.length == 0 ? 1 : 0) ^ 1) != 0) {
                    obj = ajdj.b(optional.get());
                    str = "Maybe.just(manifestOpt.get())";
                    akcr.a(obj, str);
                    return obj;
                }
            }
            ajxm ajxm = acsf.c;
            if (ajxm != null) {
                cgi cgi = (cgi) ajxm.a;
                if (cgi != null) {
                    acsf.m.a(cgi, aarj.NO_SNAPS);
                }
            }
            acsf.l.a();
            obj = ajvo.a(ajlu.a);
            str = "Maybe.empty<StoryManifest>()";
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: acsf$d */
    static final class d extends akcq implements akbw<Map<String, String>, alee, ajxw> {
        d(acsw acsw) {
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

    /* renamed from: acsf$e */
    static final class e extends akcq implements akbw<cgi, alee, ajdx<List<? extends gwu>>> {
        e(acsf acsf) {
            super(2, acsf);
        }

        public final String getName() {
            return "saveSnapsFromManifest";
        }

        public final akej getOwner() {
            return akde.a(acsf.class);
        }

        public final String getSignature() {
            return "saveSnapsFromManifest(Lcom/map/shared/LatLng;Lsnapchat/context/nano/StoryManifest;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            cgi cgi = (cgi) obj;
            alee alee = (alee) obj2;
            akcr.b(cgi, "p1");
            akcr.b(alee, "p2");
            acsf acsf = (acsf) this.receiver;
            Collection arrayList = new ArrayList();
            for (Object next : acsf.g.a(alee, "Map")) {
                if ((acsf.n.a.contains(((gwe) next).a) ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            return acsf.i.a(ajzl.a(ajxs.a(cgi.toString(), (List) arrayList)), FeatureType.MAP);
        }
    }

    /* renamed from: acsf$f */
    static final class f extends akcq implements akbl<List<? extends gwu>, List<? extends b>> {
        f(acsf acsf) {
            super(1, acsf);
        }

        public final String getName() {
            return "convertStoryModelToGroups";
        }

        public final akej getOwner() {
            return akde.a(acsf.class);
        }

        public final String getSignature() {
            return "convertStoryModelToGroups(Ljava/util/List;)Ljava/util/List;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            Iterable<gwu> iterable = list;
            acsw acsw = ((acsf) this.receiver).l;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (gwu gwu : iterable) {
                akcr.b(gwu, MapboxEvent.KEY_MODEL);
                arrayList.add(new b(gwu.b, FeatureType.MAP, gwu.a, false, (gxa) acsw.a.b(), 24));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: acsf$g */
    static final class g extends akcq implements akbl<List<? extends b>, ajdx<List<? extends b>>> {
        g(acrw acrw) {
            super(1, acrw);
        }

        public final String getName() {
            return "requestFirstSnapMedia";
        }

        public final akej getOwner() {
            return akde.a(acrw.class);
        }

        public final String getSignature() {
            return "requestFirstSnapMedia(Ljava/util/List;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            return ((acrw) this.receiver).a(list);
        }
    }

    /* renamed from: acsf$h */
    static final class h extends akcq implements akbw<a, List<? extends smi>, ajdp<actc>> {
        h(acth acth) {
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
            a aVar = (a) obj;
            List list = (List) obj2;
            akcr.b(aVar, "p1");
            akcr.b(list, "p2");
            return ((acth) this.receiver).a(aVar, list);
        }
    }

    /* renamed from: acsf$i */
    static final class i extends akcq implements akbl<actc, ajxw> {
        i(acsf acsf) {
            super(1, acsf);
        }

        public final String getName() {
            return "onOperaEvent";
        }

        public final akej getOwner() {
            return akde.a(acsf.class);
        }

        public final String getSignature() {
            return "onOperaEvent(Lcom/snapchat/map/feature/playback/opera/MapOperaEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            actc actc = (actc) obj;
            akcr.b(actc, "p1");
            acsf acsf = (acsf) this.receiver;
            int i = acsg.a[actc.ordinal()];
            if (i == 1) {
                actb actb = acsf.d;
                if (actb != null) {
                    acsf.k.a(actb, true);
                }
                acsf.d = null;
                acsf.e = true;
                ajxm ajxm = acsf.c;
                if (ajxm != null) {
                    cgi cgi = (cgi) ajxm.a;
                    if (cgi != null) {
                        acsf.m.a(cgi, aarj.PLAYED);
                    }
                }
            } else if (i == 2) {
                acsf.e = false;
            }
            return ajxw.a;
        }
    }

    /* renamed from: acsf$j */
    static final class j extends akcq implements akbk<ajxw> {
        j(acsf acsf) {
            super(0, acsf);
        }

        public final String getName() {
            return "resetState";
        }

        public final akej getOwner() {
            return akde.a(acsf.class);
        }

        public final String getSignature() {
            return "resetState()V";
        }

        public final /* synthetic */ Object invoke() {
            ((acsf) this.receiver).b();
            return ajxw.a;
        }
    }

    public acsf(zgb zgb, acth acth, acsl acsl, acrw acrw, gwb gwb, aipn<aclg> aipn, acrv acrv, acsw acsw, acma acma, actj actj) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(acth, "mapPlaybackOperaLauncher");
        akcr.b(acsl, "mapPlaybackManifestConverter");
        akcr.b(acrw, "mapPlaybackClient");
        akcr.b(gwb, "repository");
        akcr.b(aipn, "snapMap");
        akcr.b(acrv, "mapPlaybackAnimations");
        akcr.b(acsw, "mapPlaybackUtils");
        akcr.b(acma, "mapPlaybackAnalytics");
        akcr.b(actj, "reportedSnaps");
        this.f = acth;
        this.g = acsl;
        this.h = acrw;
        this.i = gwb;
        this.j = aipn;
        this.k = acrv;
        this.l = acsw;
        this.m = acma;
        this.n = actj;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean a(PointF pointF) {
        if (this.e) {
            return false;
        }
        if (pointF != null && b(pointF)) {
            return false;
        }
        ajxm ajxm = this.c;
        if (ajxm != null) {
            cgi cgi = (cgi) ajxm.a;
            if (cgi != null) {
                this.m.a(cgi, aarj.CANCELLED);
            }
        }
        b();
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        actb actb = this.d;
        if (actb != null) {
            this.k.a(actb, true);
        }
        this.d = null;
        this.c = null;
        ajej ajej = this.b;
        if (ajej != null) {
            ajej.dispose();
        }
        this.b = null;
        this.e = false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(PointF pointF) {
        ajxm ajxm = this.c;
        if (ajxm != null) {
            PointF pointF2 = (PointF) ajxm.b;
            if (pointF2 != null) {
                float abs = Math.abs(pointF.x - pointF2.x);
                Object obj = this.j.get();
                String str = "snapMap.get()";
                akcr.a(obj, str);
                obj = ((aclg) obj).j();
                String str2 = "snapMap.get().viewHost";
                akcr.a(obj, str2);
                double pow = Math.pow((double) (abs / obj.c()), 2.0d);
                float abs2 = Math.abs(pointF.y - pointF2.y);
                Object obj2 = this.j.get();
                akcr.a(obj2, str);
                obj2 = ((aclg) obj2).j();
                akcr.a(obj2, str2);
                if (Math.sqrt(pow + Math.pow((double) (abs2 / obj2.d()), 2.0d)) < 0.3d) {
                    return true;
                }
            }
        }
        return false;
    }
}
