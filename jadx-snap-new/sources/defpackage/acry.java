package defpackage;

import android.view.View;
import com.snap.core.db.column.FeatureType;
import defpackage.acth.a;
import defpackage.gyz.b;
import java.util.Collection;
import java.util.List;

/* renamed from: acry */
public final class acry implements acrx {
    public ajej a;
    boolean b;
    public final adbg c;
    final acsl d;
    public final gwb e;
    final acth f;

    /* renamed from: acry$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acry$b */
    public static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ acry a;

        public b(acry acry) {
            this.a = acry;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "result");
            akws a = akxa.a();
            if (a != null) {
                obj = (alix) a.f();
                if (obj != null) {
                    akcr.a(obj, "result.response()?.body(…t(listOf<StoryIdModel>())");
                    Object obj2 = obj.a;
                    String str = "response.manifest";
                    akcr.a(obj2, str);
                    String a2 = obj2.a();
                    acsl acsl = this.a.d;
                    alee alee = obj.a;
                    akcr.a((Object) alee, str);
                    return this.a.e.a(ajzl.a(ajxs.a(a2, acsl.a(alee, "default"))), FeatureType.MAP);
                }
            }
            return ajdx.b((Object) ajyw.a);
        }
    }

    /* renamed from: acry$c */
    public static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (((Collection) list).isEmpty() ^ 1) != 0 ? ajyl.a(new b(((gwu) list.get(0)).b, FeatureType.MAP, ((gwu) list.get(0)).a, false, null, 56)) : ajyw.a;
        }
    }

    /* renamed from: acry$d */
    public static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ acry a;
        private /* synthetic */ View b;

        public d(acry acry, View view) {
            this.a = acry;
            this.b = view;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return this.a.f.a(new a(6, ajyx.a, new srk(this.b, sqx.CIRCLE)), list);
        }
    }

    /* renamed from: acry$g */
    public static final class g<T> implements ajfb<actc> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acry$h */
    public static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acry$e */
    public static final class e extends akcq implements akbl<actc, ajxw> {
        public e(acry acry) {
            super(1, acry);
        }

        public final String getName() {
            return "onOperaEvent";
        }

        public final akej getOwner() {
            return akde.a(acry.class);
        }

        public final String getSignature() {
            return "onOperaEvent(Lcom/snapchat/map/feature/playback/opera/MapOperaEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            actc actc = (actc) obj;
            akcr.b(actc, "p1");
            acry acry = (acry) this.receiver;
            int i = acrz.a[actc.ordinal()];
            if (i == 1) {
                acry.b = true;
            } else if (i == 2) {
                acry.b = false;
            }
            return ajxw.a;
        }
    }

    /* renamed from: acry$f */
    public static final class f extends akcq implements akbk<ajxw> {
        public f(acry acry) {
            super(0, acry);
        }

        public final String getName() {
            return "cleanupDisposable";
        }

        public final akej getOwner() {
            return akde.a(acry.class);
        }

        public final String getSignature() {
            return "cleanupDisposable()V";
        }

        public final /* synthetic */ Object invoke() {
            acry acry = (acry) this.receiver;
            ajej ajej = acry.a;
            if (ajej != null) {
                ajej.dispose();
            }
            acry.a = null;
            acry.b = false;
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public acry(adbg adbg, acsl acsl, gwb gwb, acth acth) {
        akcr.b(adbg, "mapClientReactive");
        akcr.b(acsl, "mapPlaybackManifestConverter");
        akcr.b(gwb, "repository");
        akcr.b(acth, "mapPlaybackOperaLauncher");
        this.c = adbg;
        this.d = acsl;
        this.e = gwb;
        this.f = acth;
    }

    public final boolean a() {
        return this.b;
    }
}
