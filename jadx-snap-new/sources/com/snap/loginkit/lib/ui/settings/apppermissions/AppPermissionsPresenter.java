package com.snap.loginkit.lib.ui.settings.apppermissions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.event.EventType;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import com.snapchat.android.R;
import defpackage.aban;
import defpackage.abar;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.afur;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akhw;
import defpackage.akws;
import defpackage.dib;
import defpackage.jwc;
import defpackage.jwe;
import defpackage.jwj;
import defpackage.jwz;
import defpackage.jxa;
import defpackage.kaz;
import defpackage.ngp;
import defpackage.ngq;
import defpackage.nhk;
import defpackage.nhl;
import defpackage.nhn;
import defpackage.nia;
import defpackage.nib;
import defpackage.nic;
import defpackage.nif;
import defpackage.s;
import defpackage.wjd;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class AppPermissionsPresenter extends zll<nif> implements defpackage.k {
    final zfw a = zgb.a(ngq.e, "AppPermissionsPresenter");
    nib[] b;
    Bitmap c;
    final Map<String, kaz<jwj>> d = new LinkedHashMap();
    final ajxe e;
    final ajxe f;
    boolean g;
    final ngp h;
    final Context i;
    final achb<zjm, zjk> j;
    final aipn<dib> k;
    final aipn<SnapKitHttpInterface> l;
    private List<nic> m;
    private final ajei n;
    private final ajei o;

    static final class c<T> implements ajfb<akws<akhw>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            akcr.a((akws) obj, EventType.RESPONSE);
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ AppPermissionsPresenter a;
        private /* synthetic */ List b;

        f(AppPermissionsPresenter appPermissionsPresenter, List list) {
            this.a = appPermissionsPresenter;
            this.b = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, MessageMediaRefModel.URI);
            return BitmapFactory.decodeStream(this.a.i.getContentResolver().openInputStream(uri));
        }
    }

    static final class g<T> implements ajfb<Bitmap> {
        private /* synthetic */ AppPermissionsPresenter a;
        private /* synthetic */ List b;

        g(AppPermissionsPresenter appPermissionsPresenter, List list) {
            this.a = appPermissionsPresenter;
            this.b = list;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.c = (Bitmap) obj;
        }
    }

    static final class h<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ nib a;
        private /* synthetic */ AppPermissionsPresenter b;
        private /* synthetic */ jxa c;

        h(nib nib, AppPermissionsPresenter appPermissionsPresenter, jxa jxa) {
            this.a = nib;
            this.b = appPermissionsPresenter;
            this.c = jxa;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (kaz) obj;
            Map map = this.b.d;
            Object obj2 = this.a.a().a;
            akcr.a(obj2, "scopeItem.scope.name");
            akcr.a(obj, "refCountedDisposable");
            map.put(obj2, obj);
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class j implements ajev {
        private /* synthetic */ AppPermissionsPresenter a;

        j(AppPermissionsPresenter appPermissionsPresenter) {
            this.a = appPermissionsPresenter;
        }

        public final void run() {
            AppPermissionsPresenter.c(this.a);
        }
    }

    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ AppPermissionsPresenter a;

        k(AppPermissionsPresenter appPermissionsPresenter) {
            this.a = appPermissionsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            AppPermissionsPresenter.c(this.a);
        }
    }

    static final class l<T> implements ajfb<Throwable> {
        private /* synthetic */ Uri a;

        l(Uri uri) {
            this.a = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class a extends akcs implements akbk<nhk> {
        private /* synthetic */ AppPermissionsPresenter a;

        a(AppPermissionsPresenter appPermissionsPresenter) {
            this.a = appPermissionsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new nhk(this.a.k, this.a.a(), null);
        }
    }

    static final class b extends akcs implements akbk<jwc> {
        private /* synthetic */ jwe a;

        b(jwe jwe) {
            this.a = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ AppPermissionsPresenter a;

        e(AppPermissionsPresenter appPermissionsPresenter) {
            this.a = appPermissionsPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.j.a((achg) ngq.a, true, true, null);
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        final /* synthetic */ AppPermissionsPresenter a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ nhl d;

        /* renamed from: com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$n$1 */
        static final class AnonymousClass1<T> implements ajfb<akws<akhw>> {
            private /* synthetic */ n a;

            AnonymousClass1(n nVar) {
                this.a = nVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (akws) obj;
                akcr.a(obj, EventType.RESPONSE);
                if (obj.e()) {
                    this.a.a.g = true;
                    this.a.a.j.a((achg) ngq.a, true, true, null);
                    return;
                }
                AppPermissionsPresenter.b(this.a.a);
            }
        }

        /* renamed from: com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$n$2 */
        static final class AnonymousClass2<T> implements ajfb<Throwable> {
            private /* synthetic */ n a;

            AnonymousClass2(n nVar) {
                this.a = nVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                AppPermissionsPresenter.b(this.a.a);
            }
        }

        n(AppPermissionsPresenter appPermissionsPresenter, String str, String str2, nhl nhl) {
            this.a = appPermissionsPresenter;
            this.b = str;
            this.c = str2;
            this.d = nhl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((nhk) this.a.f.b()).a((aban) new abar());
            AppPermissionsPresenter appPermissionsPresenter = this.a;
            SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) appPermissionsPresenter.l.get();
            nhl nhl = this.d;
            Object a = wjd.LOGIN_KIT.a();
            akcr.a(a, "SnapTokenAccessTokenScop…N_KIT.serverSideScopeName");
            zln.bindTo$default(appPermissionsPresenter, snapKitHttpInterface.revokeApp(nhl, a).b((ajdw) this.a.a.g()).a((ajdw) this.a.a.l()).a((ajfb) new AnonymousClass1(this), (ajfb) new AnonymousClass2(this)), this.a, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;

        o(String str, String str2) {
            this.a = str;
            this.b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class m extends akcq implements akbl<View, ajxw> {
        m(AppPermissionsPresenter appPermissionsPresenter) {
            super(1, appPermissionsPresenter);
        }

        public final String getName() {
            return "showRemoveAppDialog";
        }

        public final akej getOwner() {
            return akde.a(AppPermissionsPresenter.class);
        }

        public final String getSignature() {
            return "showRemoveAppDialog(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String string;
            String a;
            zgy a2;
            akcr.b((View) obj, "p1");
            AppPermissionsPresenter appPermissionsPresenter = (AppPermissionsPresenter) this.receiver;
            nif nif = (nif) appPermissionsPresenter.getTarget();
            if (nif != null) {
                Bundle b = nif.b();
                if (b != null) {
                    string = b.getString("name");
                    a = appPermissionsPresenter.a();
                    a2 = new defpackage.zgy.a(appPermissionsPresenter.i, appPermissionsPresenter.j, ngq.b, false, null, 16).a((int) R.string.login_kit_remove_app_dialog_title).b((int) R.string.login_kit_remove_app_dialog_description).a((int) R.string.login_kit_remove_app, (akbl) new n(appPermissionsPresenter, string, a, new nhl(a)), false).a((int) R.string.login_kit_remove_app_cancel, (akbl) new o(string, a), true).a();
                    appPermissionsPresenter.j.a((achd) a2, a2.a, null);
                    return ajxw.a;
                }
            }
            string = null;
            a = appPermissionsPresenter.a();
            a2 = new defpackage.zgy.a(appPermissionsPresenter.i, appPermissionsPresenter.j, ngq.b, false, null, 16).a((int) R.string.login_kit_remove_app_dialog_title).b((int) R.string.login_kit_remove_app_dialog_description).a((int) R.string.login_kit_remove_app, (akbl) new n(appPermissionsPresenter, string, a, new nhl(a)), false).a((int) R.string.login_kit_remove_app_cancel, (akbl) new o(string, a), true).a();
            appPermissionsPresenter.j.a((achd) a2, a2.a, null);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(AppPermissionsPresenter.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(AppPermissionsPresenter.class), "analyticsLogger", "getAnalyticsLogger()Lcom/snap/loginkit/lib/metrics/LoginKitAnalyticsLogger;")};
    }

    public AppPermissionsPresenter(jwe jwe, zgb zgb, ngp ngp, Context context, achb<zjm, zjk> achb, aipn<dib> aipn, aipn<SnapKitHttpInterface> aipn2, ajei ajei) {
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ngp, "loginkitUser");
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "blizzardEventLogger");
        akcr.b(aipn2, "snapkitHttpInterface");
        akcr.b(ajei, "compositeDisposable");
        this.h = ngp;
        this.i = context;
        this.j = achb;
        this.k = aipn;
        this.l = aipn2;
        this.o = ajei;
        this.e = ajxh.a(new b(jwe));
        this.n = new ajei();
        this.f = ajxh.a(new a(this));
    }

    public static final /* synthetic */ void b(AppPermissionsPresenter appPermissionsPresenter) {
        zgy a = new defpackage.zgy.a(appPermissionsPresenter.i, appPermissionsPresenter.j, ngq.b, true, null, 16).b((int) R.string.login_kit_something_went_wrong_permissions).a((int) R.string.okay, (akbl) new e(appPermissionsPresenter), true).a();
        appPermissionsPresenter.j.a((achd) a, a.a, null);
    }

    public static final /* synthetic */ void c(AppPermissionsPresenter appPermissionsPresenter) {
        ViewGroup viewGroup;
        nib[] nibArr = appPermissionsPresenter.b;
        if (nibArr == null) {
            akcr.a("scopeArray");
        }
        Collection arrayList = new ArrayList();
        int length = nibArr.length;
        int i = 0;
        while (true) {
            viewGroup = null;
            if (i >= length) {
                break;
            }
            Bitmap a;
            Object nia;
            nib nib = nibArr[i];
            AppPermissionsPresenter appPermissionsPresenter2 = appPermissionsPresenter;
            kaz kaz = (kaz) appPermissionsPresenter2.d.get(nib.a().a);
            if (kaz != null) {
                a = jwz.a(kaz);
            }
            if (akcr.a((Object) "https://auth.snapchat.com/oauth2/api/user.bitmoji.avatar", nib.a().a)) {
                afur a2 = nib.a();
                Object obj = nib.a().c;
                akcr.a(obj, "scopeItem.scope.toggleable");
                nia = new nia(a2, a, obj.booleanValue(), appPermissionsPresenter2.c);
            } else {
                nia = new nic(nib.a(), a, true);
            }
            arrayList.add(nia);
            i++;
        }
        List h = ajyu.h((Collection) (List) arrayList);
        appPermissionsPresenter.m = h;
        nif nif = (nif) appPermissionsPresenter.getTarget();
        if (nif != null) {
            View d = nif.d();
            if (d != null) {
                viewGroup = (ViewGroup) d.findViewById(R.id.manage_scopes);
            }
        }
        if (viewGroup != null) {
            defpackage.nid.a.a(viewGroup, h, true);
        }
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        nif nif = (nif) getTarget();
        if (nif != null) {
            Bundle b = nif.b();
            if (b != null) {
                return b.getString(StorySnapModel.CLIENTID);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void takeTarget(nif nif) {
        akcr.b(nif, "target");
        super.takeTarget(nif);
        nif.getLifecycle().a(this);
    }

    public final void dropTarget() {
        nif nif = (nif) getTarget();
        if (nif != null) {
            defpackage.j lifecycle = nif.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onFragmentDestroyed() {
        for (Entry value : this.d.entrySet()) {
            ((kaz) value.getValue()).dispose();
        }
        this.n.a();
        if (!this.g) {
            List list = this.m;
            if (list != null) {
                Object a;
                Collection arrayList = new ArrayList();
                for (Object a2 : list) {
                    if ((((nic) a2).a() ^ 1) != 0) {
                        arrayList.add(a2);
                    }
                }
                List list2 = (List) arrayList;
                int size = list2.size();
                List list3 = this.m;
                if (list3 == null || size != list3.size()) {
                    SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) this.l.get();
                    String a3 = a();
                    Iterable<nic> iterable = list2;
                    Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (nic nic : iterable) {
                        arrayList2.add(nic.b.a);
                    }
                    nhn nhn = new nhn(a3, (List) arrayList2);
                    a2 = wjd.LOGIN_KIT.a();
                    akcr.a(a2, "SnapTokenAccessTokenScop…N_KIT.serverSideScopeName");
                    ajej a4 = snapKitHttpInterface.updatePermissions(nhn, a2).b((ajdw) this.a.g()).a((ajdw) this.a.l()).a((ajfb) c.a, (ajfb) d.a);
                    akcr.a((Object) a4, "snapkitHttpInterface.get…error)\n                })");
                    ajvv.a(a4, this.o);
                }
            }
        }
    }
}
