package com.snap.spectacles.lib.fragments.presenters;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.common.base.Optional;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import com.snap.spectacles.config.SpectaclesHttpInterface;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.abbr;
import defpackage.abbs;
import defpackage.abdt;
import defpackage.abdu;
import defpackage.abdv;
import defpackage.abdw;
import defpackage.abss;
import defpackage.abtp;
import defpackage.achb;
import defpackage.aedh;
import defpackage.ahga;
import defpackage.ahgc;
import defpackage.ahgg;
import defpackage.ahgk;
import defpackage.ahgl;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajfq;
import defpackage.ajvv;
import defpackage.ajwl;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxr;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.ajyw;
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
import defpackage.akqq;
import defpackage.akxa;
import defpackage.dib;
import defpackage.ftl;
import defpackage.gdy;
import defpackage.gej;
import defpackage.gfu;
import defpackage.idd;
import defpackage.ifs;
import defpackage.ifu;
import defpackage.ifx;
import defpackage.igu;
import defpackage.iha;
import defpackage.ihh;
import defpackage.ncd;
import defpackage.xai;
import defpackage.xbb;
import defpackage.xbd;
import defpackage.xbp;
import defpackage.xcl;
import defpackage.xdb;
import defpackage.xdp;
import defpackage.xfa;
import defpackage.xgi;
import defpackage.xgj;
import defpackage.xhg;
import defpackage.xji;
import defpackage.xjo;
import defpackage.xli;
import defpackage.xlt;
import defpackage.xlu;
import defpackage.xlv;
import defpackage.xlw;
import defpackage.xlx;
import defpackage.xly;
import defpackage.xml;
import defpackage.xmm;
import defpackage.xnf;
import defpackage.xnh;
import defpackage.xni;
import defpackage.xno;
import defpackage.xnp;
import defpackage.xns;
import defpackage.xnw;
import defpackage.xnx;
import defpackage.xon;
import defpackage.xos;
import defpackage.xpi;
import defpackage.xpv;
import defpackage.xpw;
import defpackage.xqa;
import defpackage.xqd;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zlx;
import defpackage.zma;
import defpackage.zmh;
import defpackage.zms;
import defpackage.znk;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class SpectaclesSettingsPresenter extends zll<xml> implements defpackage.k {
    final xji A;
    public final abss B;
    public final ajei C;
    final aipn<Optional<BluetoothAdapter>> D;
    final xos E;
    private final ajxe F;
    private final ajxe G;
    private final ajxe H;
    private final ajxe I;
    private final ajxe J;
    private final ajwy<xmm> K;
    private List<? extends zma> L;
    private zkf M;
    private final xhg N;
    private final ajwy<xpi> O;
    private final xpw P;
    private final achb<zjm, zjk> Q;
    public final IntentFilter a = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public ajej c;
    final Type d;
    public final g e;
    public ajei f;
    public ajei g;
    final ajxe h;
    public boolean i;
    xdb j;
    List<? extends xdb> k;
    ajwl<List<xdb>> l;
    List<xli> m;
    ajwl<List<xli>> n;
    ajwl<Boolean> o;
    volatile long p;
    public boolean q;
    final ihh r;
    final xpw s;
    final xon t;
    public final Context u;
    public final ncd v;
    final ifs w;
    final xqa x;
    final dib y;
    final ajwy<iha> z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class aa<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ String b;

        aa(SpectaclesSettingsPresenter spectaclesSettingsPresenter, String str) {
            this.a = spectaclesSettingsPresenter;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            xqa xqa = this.a.x;
            String str = this.b;
            akcr.b(str, "thumbnailName");
            xqa.a.a(xqd.a(str), xai.a.d.b, true, new gdy[0]).c((ajfb) new defpackage.xqa.g(str)).h(new defpackage.xqa.h(str)).c();
            return ajxw.a;
        }
    }

    static final class ab<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        ab(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
        }
    }

    static final class ad<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        ad(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            int i;
            xqa xqa = this.a.x;
            for (String str : xqa.c) {
                gfu gfu = xqa.a;
                Object i2 = abtp.i(xqa.b);
                akcr.a(i2, "ViewUtils.getDpiSuffix(context)");
                gfu.a(xqd.a(i2, str), xai.a.d.b, true, new gdy[0]).c((ajfb) new defpackage.xqa.e(str)).h(new defpackage.xqa.f(str)).c();
            }
            xqa = this.a.x;
            int a = xqa.a(defpackage.xqd.a.SNAKE);
            if (a >= 0) {
                i = 0;
                while (true) {
                    xqa.a.a(xqd.a(defpackage.xqd.a.SNAKE, i, a == 46), xai.a.d.b, true, new gdy[0]).h(new defpackage.xqa.k(i)).c();
                    if (i == a) {
                        break;
                    }
                    i++;
                }
            }
            xqa = this.a.x;
            a = xqa.a(defpackage.xqd.a.CHECKMARK);
            if (a >= 0) {
                i = 0;
                while (true) {
                    xqa.a.a(xqd.a(defpackage.xqd.a.CHECKMARK, i, a == 36), xai.a.d.b, true, new gdy[0]).h(new defpackage.xqa.b(i)).c();
                    if (i == a) {
                        break;
                    }
                    i++;
                }
            }
            return ajxw.a;
        }
    }

    public static final class ae<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        public ae(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            for (xli xli : this.a.m) {
                if (!xli.e) {
                    xon xon = this.a.t;
                    String str = xli.a;
                    akcr.b(str, "version");
                    if (xon.a().b(str) == 0) {
                        xon.a().a(str, System.currentTimeMillis());
                    }
                }
            }
            return ajxw.a;
        }
    }

    public static final class af<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        public af(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            SpectaclesSettingsPresenter.a(this.a);
            for (xdb xdb : this.a.k) {
                if (xdb.q()) {
                    SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
                    spectaclesSettingsPresenter.f.a(ajdx.c((Callable) new y(spectaclesSettingsPresenter, xdb)).b((ajdw) spectaclesSettingsPresenter.b().b()).c((ajfb) new z(spectaclesSettingsPresenter, xdb)).c());
                    spectaclesSettingsPresenter = this.a;
                    ahgl ahgl = new ahgl();
                    ahgl.a = ahgk.UPDATE_DEVICE_INFO.a();
                    ahgl.b = xpw.a(xdb);
                    ajcx.b((Callable) new bi(spectaclesSettingsPresenter)).c((Callable) new bj(spectaclesSettingsPresenter, ahgl)).b((ajdw) spectaclesSettingsPresenter.b().g()).c();
                    SpectaclesSettingsPresenter spectaclesSettingsPresenter2 = this.a;
                    spectaclesSettingsPresenter2.f.a(ajcx.b((Callable) new r(spectaclesSettingsPresenter2)).b((ajdw) spectaclesSettingsPresenter2.b().g()).b((ajev) new s(spectaclesSettingsPresenter2)).e());
                }
            }
            Object obj = this.a;
            obj.a(obj, (akbl) au.a);
            this.a.f();
            SpectaclesSettingsPresenter spectaclesSettingsPresenter3 = this.a;
            spectaclesSettingsPresenter3.f.a(spectaclesSettingsPresenter3.a().e().b().f((ajfb) new bf(spectaclesSettingsPresenter3)));
            return ajxw.a;
        }
    }

    static final class ag<V> implements Callable<T> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        ag(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            for (String str : this.a.t.b()) {
                xon xon = this.a.t;
                akcr.b(str, "version");
                xon.a().d(str);
                SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
                List list = ajyw.a;
                akcr.b(list, "<set-?>");
                spectaclesSettingsPresenter.m = list;
                this.a.n.a(this.a.m);
            }
            return ajxw.a;
        }
    }

    static final class ai<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        ai(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            this.a.o.a(Boolean.valueOf(this.a.a().b().m()));
            return ajxw.a;
        }
    }

    static final class ay<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ Object b;
        private /* synthetic */ akbl c;

        ay(SpectaclesSettingsPresenter spectaclesSettingsPresenter, Object obj, akbl akbl) {
            this.a = spectaclesSettingsPresenter;
            this.b = obj;
            this.c = akbl;
        }

        public final /* synthetic */ Object call() {
            if (((xml) this.a.getTarget()) == null) {
                return null;
            }
            this.c.invoke(this.b);
            return ajxw.a;
        }
    }

    static final class ba<V> implements Callable<T> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        ba(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
            for (xdb L : spectaclesSettingsPresenter.k) {
                spectaclesSettingsPresenter.x.a(L.L());
            }
            spectaclesSettingsPresenter.k = ajyu.k(ajyu.a((Iterable) spectaclesSettingsPresenter.k, (Comparator) bc.a));
            spectaclesSettingsPresenter.l.a(spectaclesSettingsPresenter.k);
            return spectaclesSettingsPresenter.k;
        }
    }

    static final class bc<T> implements Comparator<xdb> {
        public static final bc a = new bc();

        bc() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            xdb xdb = (xdb) obj;
            xdb xdb2 = (xdb) obj2;
            return xdb.f() != xdb2.f() ? (xdb2.f() > xdb.f() ? 1 : (xdb2.f() == xdb.f() ? 0 : -1)) : xdb.q() != xdb2.q() ? akcr.a(xdb2.q(), xdb.q()) : xdb.j() - xdb2.j();
        }
    }

    static final class bg<V> implements Callable<T> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        bg(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(this.a.a().j().f());
        }
    }

    static final class bi<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        bi(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.F.b());
        }
    }

    static final class bj<V> implements Callable<ajej> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ ahgl b;

        bj(SpectaclesSettingsPresenter spectaclesSettingsPresenter, ahgl ahgl) {
            this.a = spectaclesSettingsPresenter;
            this.b = ahgl;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.F.b()).updateSpectaclesDevice(this.b).a((ajdw) this.a.b().f()).c((ajfb) AnonymousClass1.a).h(AnonymousClass2.a).c();
        }
    }

    static final class c<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ xdb b;

        c(SpectaclesSettingsPresenter spectaclesSettingsPresenter, xdb xdb) {
            this.a = spectaclesSettingsPresenter;
            this.b = xdb;
        }

        public final /* synthetic */ Object call() {
            xml xml = (xml) this.a.getTarget();
            if (xml == null) {
                return null;
            }
            xml.a(this.b, com.snap.spectacles.lib.fragments.SpectaclesPairFragment.b.SETTINGS_ADD_SPEC);
            return ajxw.a;
        }
    }

    public static final class g extends BroadcastReceiver {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        g(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final void onReceive(Context context, Intent intent) {
            akcr.b(context, "context");
            akcr.b(intent, "intent");
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
            if (intExtra == 12 || intExtra == 10) {
                spectaclesSettingsPresenter.f();
            }
            if (intExtra == 12) {
                spectaclesSettingsPresenter.g();
            }
            if (intExtra == 10) {
                spectaclesSettingsPresenter.h();
            }
        }
    }

    static final class i<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ boolean b;

        i(SpectaclesSettingsPresenter spectaclesSettingsPresenter, boolean z) {
            this.a = spectaclesSettingsPresenter;
            this.b = z;
        }

        public final /* synthetic */ Object call() {
            this.a.a().b().g(this.b);
            this.a.o.a(Boolean.valueOf(this.b));
            return ajxw.a;
        }
    }

    static final class j<V> implements Callable<T> {
        private /* synthetic */ xdb a;

        j(xdb xdb) {
            this.a = xdb;
        }

        public final /* synthetic */ Object call() {
            xdb xdb = this.a;
            if (xdb != null) {
                xfa k = xdb.k();
                if (k != null) {
                    return k.a();
                }
            }
            return null;
        }
    }

    static final class m<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ xdb b;

        m(SpectaclesSettingsPresenter spectaclesSettingsPresenter, xdb xdb) {
            this.a = spectaclesSettingsPresenter;
            this.b = xdb;
        }

        public final /* synthetic */ Object call() {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
            spectaclesSettingsPresenter.j = this.b;
            xbp n = spectaclesSettingsPresenter.a().n();
            if (n != null) {
                xdp i = n.i();
                if (i != null) {
                    i.a(this.b, defpackage.xdp.a.USER_CONNECT, (long) TelemetryConstants.FLUSH_DELAY_MS);
                    return ajxw.a;
                }
            }
            return null;
        }
    }

    static final class p implements OnClickListener {
        final /* synthetic */ SpectaclesSettingsPresenter a;
        final /* synthetic */ String b;
        private /* synthetic */ JsonObject c;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$p$1 */
        static final class AnonymousClass1<V> implements Callable<Object> {
            private /* synthetic */ p a;

            AnonymousClass1(p pVar) {
                this.a = pVar;
            }

            public final /* synthetic */ Object call() {
                xon xon = this.a.a.t;
                String str = this.a.b;
                akcr.b(str, "version");
                if (xon.a().c(str) == 0) {
                    xon.a().b(str, System.currentTimeMillis());
                }
                return ajxw.a;
            }
        }

        p(SpectaclesSettingsPresenter spectaclesSettingsPresenter, JsonObject jsonObject, String str) {
            this.a = spectaclesSettingsPresenter;
            this.c = jsonObject;
            this.b = str;
        }

        public final void onClick(View view) {
            JsonElement jsonElement = this.c.get("releaseNotesVideoUrl");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            if (asString != null) {
                xml xml = (xml) this.a.getTarget();
                if (xml != null) {
                    xml.a((int) R.string.spectacles_release_note_webview_title, asString);
                }
            }
            this.a.g.a(ajcx.b((Callable) new AnonymousClass1(this)).b((ajdw) this.a.b().f()).e());
        }
    }

    public static final class q<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        public q(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            Object d = this.a.d();
            akcr.a(d, "bluetoothAdapter");
            if (d.isPresent()) {
                ((BluetoothAdapter) this.a.d().get()).enable();
            }
            return ajxw.a;
        }
    }

    static final class r<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        r(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.F.b());
        }
    }

    public static final class t<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        public t(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.F.b());
        }
    }

    public static final class u<V> implements Callable<Boolean> {
        final /* synthetic */ SpectaclesSettingsPresenter a;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$u$1 */
        static final class AnonymousClass1<T> implements ajfb<ahga> {
            private /* synthetic */ u a;

            AnonymousClass1(u uVar) {
                this.a = uVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                List list;
                ahga ahga = (ahga) obj;
                xpw xpw = this.a.a.s;
                Object<ahgc> obj2 = ahga.a;
                akcr.a((Object) obj2, "serverDevicesResponse.deviceList");
                akcr.b(obj2, "serverDevices");
                if (obj2.isEmpty()) {
                    list = ajyw.a;
                } else {
                    List arrayList = new ArrayList();
                    for (ahgc ahgc : obj2) {
                        akcr.b(ahgc, "serverDevice");
                        Object obj3 = ahgc.a;
                        String str = "serverDevice.serialNumber";
                        akcr.a(obj3, str);
                        Object obj4 = null;
                        Object obj5 = null;
                        if ((((CharSequence) obj3).length() == 0 ? 1 : null) == null) {
                            xdb b = xpw.a().j().b(ahgc.a);
                            String str2 = "serverDevice.lastNameUpdatedTimestamp";
                            String str3 = "serverDevice.deviceNumber";
                            if (b == null) {
                                obj3 = ahgc.a;
                                akcr.a(obj3, str);
                                akcr.b(obj3, "serialNumber");
                                Long l = (Long) xpw.a.get(obj3);
                                long longValue = l == null ? 0 : l.longValue();
                                Object obj6 = ahgc.h;
                                String str4 = "serverDevice.lastPairStatusUpdatedTimestamp";
                                akcr.a(obj6, str4);
                                if (longValue <= obj6.longValue()) {
                                    obj3 = ahgc.d;
                                    akcr.a(obj3, "serverDevice.displayName");
                                    if ((((CharSequence) obj3).length() == 0 ? 1 : null) == null) {
                                        obj3 = ahgc.j;
                                        akcr.a(obj3, "serverDevice.hardwareVersion");
                                        if (((CharSequence) obj3).length() == 0) {
                                            obj4 = 1;
                                        }
                                        if (obj4 == null) {
                                            xfa xfa = new xfa();
                                            Object obj7 = ahgc.c;
                                            akcr.a(obj7, str3);
                                            xfa.a = xpw.a(obj7.intValue());
                                            xfa.b = ahgc.d;
                                            obj7 = ahgc.f;
                                            akcr.a(obj7, str2);
                                            xfa.c = obj7.longValue();
                                            xbb j = xpw.a().j();
                                            String str5 = ahgc.a;
                                            obj7 = ahgc.b;
                                            akcr.a(obj7, "serverDevice.color");
                                            int intValue = obj7.intValue();
                                            obj7 = ahgc.c;
                                            akcr.a(obj7, str3);
                                            int intValue2 = obj7.intValue();
                                            str = ahgc.e;
                                            obj4 = ahgc.h;
                                            akcr.a(obj4, str4);
                                            obj5 = j.a(str5, intValue, intValue2, str, xfa, obj4.longValue(), ahgc.j);
                                        }
                                    }
                                }
                            } else {
                                b.a.k().c().b(true, b.d);
                                xfa k = b.k();
                                if (k != null && ahgc.f.longValue() > k.b()) {
                                    k = new xfa();
                                    obj4 = ahgc.c;
                                    akcr.a(obj4, str3);
                                    k.a = xpw.a(obj4.intValue());
                                    k.b = ahgc.d;
                                    obj4 = ahgc.f;
                                    akcr.a(obj4, str2);
                                    k.c = obj4.longValue();
                                    xpw.a().j().a(ahgc.a, k);
                                }
                                if (ahgc.b() == ahgg.NOT_PAIRED && ahgc.h.longValue() > b.f()) {
                                    xpw.a().j().e(ahgc.a);
                                }
                                obj5 = b;
                            }
                        }
                        if (obj5 != null) {
                            arrayList.add(obj5);
                        }
                    }
                    list = arrayList;
                }
                if (!list.isEmpty()) {
                    SpectaclesSettingsPresenter.a(this.a.a);
                    this.a.a.f();
                }
            }
        }

        public u(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.f.a(((SpectaclesHttpInterface) this.a.F.b()).getSpectaclesDevices(new aedh()).a((ajdw) this.a.b().b()).c((ajfb) new AnonymousClass1(this)).h(AnonymousClass2.a).c()));
        }
    }

    static final class v<V> implements Callable<T> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        v(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ Object call() {
            xdb xdb;
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = this.a;
            xdb xdb2 = (xdb) spectaclesSettingsPresenter.k.get(0);
            long f = xdb2.f();
            for (xdb xdb3 : spectaclesSettingsPresenter.k) {
                if (xdb3.q()) {
                    xdb = xdb3;
                    break;
                } else if (xdb3.f() > f) {
                    f = xdb3.f();
                    xdb2 = xdb3;
                }
            }
            xdb = null;
            if (xdb == null) {
                xdb = xdb2;
            }
            return new ajxm(xdb.d, xqa.a(xdb));
        }
    }

    static final class y<V> implements Callable<T> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ xdb b;

        y(SpectaclesSettingsPresenter spectaclesSettingsPresenter, xdb xdb) {
            this.a = spectaclesSettingsPresenter;
            this.b = xdb;
        }

        /* JADX WARNING: Missing block: B:11:0x003a, code skipped:
            if (r0.A.b() == false) goto L_0x003e;
     */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r4 = this;
            r0 = r4.a;
            r1 = r4.b;
            r2 = "device";
            defpackage.akcr.b(r1, r2);
            r2 = r1.e();
            r2 = defpackage.xhg.b(r2);
            r3 = 1;
            if (r2 == 0) goto L_0x003d;
        L_0x0014:
            r1 = r1.c;
            if (r1 == 0) goto L_0x003d;
        L_0x0018:
            r1 = r1.j();
            if (r1 != r3) goto L_0x003d;
        L_0x001e:
            r1 = r0.A;
            r1 = r1.a;
            r2 = defpackage.xjd.HAS_SEEN_PSYCHOMANTIS_ONBOARDING_FLOW;
            r2 = (defpackage.fth) r2;
            r1 = r1.a(r2);
            if (r1 != 0) goto L_0x003d;
        L_0x002c:
            r1 = r0.A;
            r1 = r1.a();
            if (r1 != 0) goto L_0x003d;
        L_0x0034:
            r0 = r0.A;
            r0 = r0.b();
            if (r0 != 0) goto L_0x003d;
        L_0x003c:
            goto L_0x003e;
        L_0x003d:
            r3 = 0;
        L_0x003e:
            r0 = java.lang.Boolean.valueOf(r3);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$y.call():java.lang.Object");
        }
    }

    static final class ac<T> implements ajfb<ifx> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        ac(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ifx ifx = (ifx) obj;
            if (ifx.a(ifu.SPECTACLES_PAIR_START)) {
                if (ifx.b(PermissionsManager.FINE_LOCATION_PERMISSION)) {
                    this.a.g();
                } else if (ifx.d()) {
                    this.a.w.r();
                }
                this.a.f();
            }
        }
    }

    static final class ah<T> implements ajfb<ajxw> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        ah(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f();
        }
    }

    public static final class av<T> implements ajfl<Optional<Boolean>> {
        public static final av a = new av();

        av() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "granted");
            if (optional.isPresent()) {
                obj = optional.get();
                akcr.a(obj, "granted.get()");
                if (((Boolean) obj).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class aw<T> implements ajfb<Throwable> {
        public static final aw a = new aw();

        aw() {
        }

        public final /* synthetic */ void accept(Object obj) {
            igu.a("SpectaclesSettingsPresenter");
        }
    }

    public static final class ax<T> implements ajfb<Optional<Boolean>> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        public ax(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f();
            this.a.g();
        }
    }

    static final class b<T> implements ajwy<xmm> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ ajwy c;

        b(SpectaclesSettingsPresenter spectaclesSettingsPresenter, ajwy ajwy, ajwy ajwy2) {
            this.a = spectaclesSettingsPresenter;
            this.b = ajwy;
            this.c = ajwy2;
        }

        public final /* synthetic */ Object get() {
            return new xmm(this.b, this.a.u, this.c);
        }
    }

    static final class bb<T> implements ajfb<List<? extends xdb>> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        bb(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(this.a);
        }
    }

    static final class bf<T> implements ajfb<ajxr<? extends xdb, ? extends xgj, ? extends xgi>> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        bf(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxr ajxr = (ajxr) obj;
            xdb xdb = (xdb) ajxr.a;
            int i = xnf.a[((xgj) ajxr.b).ordinal()];
            int i2 = 1;
            Object obj2;
            xml xml;
            if (i == 1) {
                Collection arrayList = new ArrayList();
                for (Object obj22 : this.a.k) {
                    if ((TextUtils.equals(((xdb) obj22).d, xdb.d) ^ 1) != 0) {
                        arrayList.add(obj22);
                    }
                }
                this.a.f();
            } else if (i != 2) {
                if (i == 3) {
                    xml = (xml) this.a.getTarget();
                    if (xml != null) {
                        this.a.b(xml, AnonymousClass1.a);
                    }
                }
            } else {
                xgi xgi = (xgi) ajxr.c;
                if (xgi != null) {
                    Object obj3 = this.a;
                    xcl a = xgi.a();
                    akcr.a((Object) a, "it.bleState");
                    if (!(a == xcl.BLE_ATTEMPT_TO_CONNECT || a == xcl.BLE_SYNCED)) {
                        i2 = 0;
                    }
                    if (a == xcl.BLE_SNAPCODE_FOUND) {
                        if (obj3.r.c() - obj3.p >= 5000) {
                            obj3.E.a();
                            ajcx.b((Callable) new c(obj3, xdb)).b((ajdw) obj3.b().l()).e();
                        }
                    }
                    obj22 = xdb.d;
                    xdb xdb2 = obj3.j;
                    if (akcr.a(obj22, xdb2 != null ? xdb2.d : null)) {
                        if (a.a(xcl.BLE_ATTEMPT_TO_CONNECT)) {
                            obj3.j = null;
                            obj3.a(xdb);
                            xml = (xml) obj3.getTarget();
                            if (xml != null) {
                                obj3.b(xml, d.a);
                            }
                        } else if (a.d(xcl.BLE_SYNCED)) {
                            obj3.a(obj3, (akbl) new ao(xdb));
                            obj3.j = null;
                        }
                    }
                    if (i2 != 0) {
                        obj3.c(obj3, e.a);
                    }
                }
            }
        }
    }

    static final class bh<T> implements ajfb<Optional<xdb>> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ xdb b;

        bh(SpectaclesSettingsPresenter spectaclesSettingsPresenter, xdb xdb) {
            this.a = spectaclesSettingsPresenter;
            this.b = xdb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            akcr.a(obj, "previouslyConnectedDevice");
            if (obj.isPresent()) {
                obj = (xdb) obj.get();
                Object a = this.a.a().c().a(obj.d);
                akcr.a(a, "specsCoreComponent.devic…ceStatus(it.serialNumber)");
                defpackage.xjm.a b = a.b();
                String str = "it";
                if (b != null) {
                    int i = xnf.b[b.ordinal()];
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        xml xml;
                        Object obj2 = this.a;
                        xdb xdb = this.b;
                        akcr.a(obj, str);
                        if (b != null) {
                            int i2 = xnf.c[b.ordinal()];
                            if (i2 == 1 || i2 == 2) {
                                obj2.a(obj2, (akbl) new am(xdb));
                                ajej c = ajdx.c((Callable) new j(obj)).a((ajdw) obj2.b().l()).b((ajdw) obj2.b().b()).c((ajfb) new k(obj2)).c();
                                akcr.a((Object) c, "Single.fromCallable { pr…             .subscribe()");
                                ajvv.a(c, obj2.g);
                                return;
                            } else if (i2 == 3 || i2 == 4) {
                                obj2.a(obj2, (akbl) new an(xdb));
                                xml = (xml) obj2.getTarget();
                                if (xml != null) {
                                    xml.i();
                                }
                                return;
                            }
                        }
                        obj2.a(xdb);
                        xml = (xml) obj2.getTarget();
                        if (xml != null) {
                            xml.j();
                        }
                        return;
                    }
                }
                a = this.a;
                akcr.a(obj, str);
                a.a(a, (akbl) new ap(obj));
                SpectaclesSettingsPresenter.a(this.a, this.b);
                return;
            }
            SpectaclesSettingsPresenter.a(this.a, this.b);
        }
    }

    static final class k<T> implements ajfb<String> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        k(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            xml xml = (xml) this.a.getTarget();
            if (xml != null) {
                xml.a(str);
            }
        }
    }

    static final class n<T, R> implements ajfc<T, R> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    static final class s implements ajev {
        final /* synthetic */ SpectaclesSettingsPresenter a;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$s$1 */
        static final class AnonymousClass1<T> implements ajfb<akxa<akhw>> {
            private /* synthetic */ s a;

            AnonymousClass1(s sVar) {
                this.a = sVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:70:0x00e8 A:{SYNTHETIC} */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x0158  */
            public final /* synthetic */ void accept(java.lang.Object r22) {
                /*
                r21 = this;
                r0 = r21;
                r1 = r22;
                r1 = (defpackage.akxa) r1;
                r1 = r1.a();
                if (r1 == 0) goto L_0x0226;
            L_0x000c:
                r2 = r1.e();
                if (r2 == 0) goto L_0x0226;
            L_0x0012:
                r2 = r1.f();
                if (r2 == 0) goto L_0x0226;
            L_0x0018:
                r2 = r0.a;
                r2 = r2.a;
                r2 = r2.z;
                r2 = r2.get();
                r2 = (defpackage.iha) r2;
                r1 = r1.f();
                r1 = (defpackage.akhw) r1;
                r3 = 0;
                if (r1 == 0) goto L_0x0032;
            L_0x002d:
                r1 = r1.c();
                goto L_0x0033;
            L_0x0032:
                r1 = r3;
            L_0x0033:
                r4 = r0.a;
                r4 = r4.a;
                r4 = r4.d;
                r1 = r2.a(r1, r4);
                r2 = "serializationHelper.get(…Stream(), jsonObjectType)";
                defpackage.akcr.a(r1, r2);
                r1 = (com.google.gson.JsonObject) r1;
                r2 = r0.a;
                r2 = r2.a;
                r4 = "allNotes";
                defpackage.akcr.b(r1, r4);
                r4 = r2.a();
                r4 = r4.j();
                r4 = r4.g();
                r5 = r4.isEmpty();
                if (r5 != 0) goto L_0x0226;
            L_0x005f:
                r5 = 0;
                r6 = r4.get(r5);
                r6 = (defpackage.xdb) r6;
                r6 = r6.h();
                r7 = "metadata";
                defpackage.akcr.b(r1, r7);
                r7 = r2.B;
                r7 = r7.q();
                r8 = 2;
                r9 = 1;
                if (r7 == 0) goto L_0x00c8;
            L_0x0079:
                r7 = (java.lang.CharSequence) r7;
                r10 = new akfr;
                r11 = "\\.";
                r10.<init>(r11);
                r7 = r10.a(r7, r5);
                r10 = r7.size();
                if (r10 < r8) goto L_0x00c8;
            L_0x008c:
                r10 = new java.lang.StringBuilder;
                r10.<init>();
                r11 = r7.get(r5);
                r11 = (java.lang.String) r11;
                r10.append(r11);
                r11 = ".";
                r10.append(r11);
                r7 = r7.get(r9);
                r7 = (java.lang.String) r7;
                r10.append(r7);
                r7 = r10.toString();
                r7 = defpackage.xon.b(r7, r1);
                r7 = r7.iterator();
            L_0x00b4:
                r10 = r7.hasNext();
                if (r10 == 0) goto L_0x00c8;
            L_0x00ba:
                r10 = r7.next();
                r10 = (java.lang.String) r10;
                r11 = r2.t;
                r12 = defpackage.xfr.a.APP;
                r11.a(r10, r12);
                goto L_0x00b4;
            L_0x00c8:
                if (r6 == 0) goto L_0x00d7;
            L_0x00ca:
                r7 = r1.has(r6);
                if (r7 == 0) goto L_0x00d7;
            L_0x00d0:
                r7 = r2.t;
                r10 = defpackage.xfr.a.FIRMWARE;
                r7.a(r6, r10);
            L_0x00d7:
                r6 = r2.t;
                r6 = r6.b();
                r7 = new java.util.ArrayList;
                r7.<init>();
                r7 = (java.util.List) r7;
                r6 = r6.iterator();
            L_0x00e8:
                r10 = r6.hasNext();
                if (r10 == 0) goto L_0x01c5;
            L_0x00ee:
                r10 = r6.next();
                r10 = (java.lang.String) r10;
                r11 = r1.has(r10);
                if (r11 == 0) goto L_0x00e8;
            L_0x00fa:
                r11 = r2.t;
                r12 = "version";
                defpackage.akcr.b(r10, r12);
                r12 = java.lang.System.currentTimeMillis();
                r14 = r11.a();
                r14 = r14.e(r10);
                if (r14 != 0) goto L_0x0111;
            L_0x010f:
                r11 = 1;
                goto L_0x0156;
            L_0x0111:
                r14 = r11.a();
                r14 = r14.c(r10);
                r16 = 0;
                r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
                if (r18 <= 0) goto L_0x0138;
            L_0x011f:
                r14 = r11.a();
                r14 = r14.c(r10);
                r14 = r12 - r14;
                r18 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
                r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1));
                if (r20 <= 0) goto L_0x0138;
            L_0x0130:
                r11 = r11.a();
                r11.d(r10);
                goto L_0x010f;
            L_0x0138:
                r14 = r11.a();
                r14 = r14.b(r10);
                r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
                if (r18 <= 0) goto L_0x0155;
            L_0x0144:
                r14 = r11.a();
                r14 = r14.b(r10);
                r12 = r12 - r14;
                r14 = 1209600000; // 0x48190800 float:156704.0 double:5.97621805E-315;
                r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
                if (r16 <= 0) goto L_0x0155;
            L_0x0154:
                goto L_0x0130;
            L_0x0155:
                r11 = 0;
            L_0x0156:
                if (r11 != 0) goto L_0x00e8;
            L_0x0158:
                r11 = r1.getAsJsonObject(r10);
                r12 = r4.get(r5);
                r12 = (defpackage.xdb) r12;
                r12 = r12.p();
                r13 = "releaseNote";
                defpackage.akcr.a(r11, r13);
                r12 = defpackage.xon.a(r12, r11);
                if (r12 == 0) goto L_0x0178;
            L_0x0171:
                r12 = r2.a(r10, r11);
                r7.add(r12);
            L_0x0178:
                r12 = "additionalNotes";
                r11 = r11.get(r12);
                if (r11 == 0) goto L_0x0185;
            L_0x0180:
                r11 = r11.getAsJsonArray();
                goto L_0x0186;
            L_0x0185:
                r11 = r3;
            L_0x0186:
                if (r11 == 0) goto L_0x00e8;
            L_0x0188:
                r11 = r11.iterator();
            L_0x018c:
                r12 = r11.hasNext();
                if (r12 == 0) goto L_0x00e8;
            L_0x0192:
                r12 = r11.next();
                r12 = (com.google.gson.JsonElement) r12;
                r13 = r4.get(r5);
                r13 = (defpackage.xdb) r13;
                r13 = r13.p();
                r14 = "note";
                defpackage.akcr.a(r12, r14);
                r14 = r12.getAsJsonObject();
                r15 = "note.asJsonObject";
                defpackage.akcr.a(r14, r15);
                r13 = defpackage.xon.a(r13, r14);
                if (r13 == 0) goto L_0x018c;
            L_0x01b6:
                r12 = r12.getAsJsonObject();
                defpackage.akcr.a(r12, r15);
                r12 = r2.a(r10, r12);
                r7.add(r12);
                goto L_0x018c;
            L_0x01c5:
                r1 = new java.util.ArrayList;
                r1.<init>();
                r1 = (java.util.List) r1;
                r3 = r7.isEmpty();
                if (r3 != 0) goto L_0x0226;
            L_0x01d2:
                r3 = r7.size();
                r3 = java.lang.Math.min(r3, r8);
                r3 = r7.subList(r5, r3);
                r3 = (java.util.Collection) r3;
                r1.addAll(r3);
                r3 = r1.iterator();
            L_0x01e7:
                r4 = r3.hasNext();
                if (r4 == 0) goto L_0x021a;
            L_0x01ed:
                r4 = r3.next();
                r4 = (defpackage.xli) r4;
                r4 = r4.d;
                if (r4 == 0) goto L_0x01e7;
            L_0x01f7:
                r5 = r2.g;
                r6 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$aa;
                r6.<init>(r2, r4);
                r6 = (java.util.concurrent.Callable) r6;
                r4 = defpackage.ajcx.b(r6);
                r6 = r2.b();
                r6 = r6.f();
                r6 = (defpackage.ajdw) r6;
                r4 = r4.b(r6);
                r4 = r4.e();
                r5.a(r4);
                goto L_0x01e7;
            L_0x021a:
                r2.m = r1;
                r1 = r2.n;
                r3 = r2.m;
                r1.a(r3);
                r2.f();
            L_0x0226:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$s$AnonymousClass1.accept(java.lang.Object):void");
            }
        }

        s(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final void run() {
            this.a.f.a(((SpectaclesHttpInterface) this.a.F.b()).getReleaseNotes(new xpv()).c((ajfb) new AnonymousClass1(this)).h(AnonymousClass2.a).a((ajdw) this.a.b().b()).c());
        }
    }

    static final class w<T> implements ajfb<ajxm<? extends String, ? extends String>> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        w(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            xml xml = (xml) this.a.getTarget();
            if (xml != null) {
                xml.a((String) ajxm.a, (String) ajxm.b);
            }
        }
    }

    public static final class x extends TypeToken<JsonObject> {
        x() {
        }
    }

    static final class z<T> implements ajfb<Boolean> {
        final /* synthetic */ SpectaclesSettingsPresenter a;
        final /* synthetic */ xdb b;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$z$1 */
        static final class AnonymousClass1<T> implements ajfb<gej> {
            private /* synthetic */ z a;

            AnonymousClass1(z zVar) {
                this.a = zVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((gej) obj).a()) {
                    xml xml = (xml) this.a.a.getTarget();
                    if (xml != null) {
                        xml.a(this.a.b.d, "photo_mode");
                    }
                }
            }
        }

        z(SpectaclesSettingsPresenter spectaclesSettingsPresenter, xdb xdb) {
            this.a = spectaclesSettingsPresenter;
            this.b = xdb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldLaunchOnboarding");
            if (obj.booleanValue()) {
                String str = "photo_mode";
                this.a.f.a(this.a.x.a.a(xqd.b(str, (String) xqa.b(str).get(0)), xai.a.d.b, true, new gdy[0]).a((ajdw) this.a.b().l()).c((ajfb) new AnonymousClass1(this)).c());
            }
        }
    }

    static final class aj extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final aj a = new aj();

        aj() {
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
            /*
            r9 = this;
            r10 = (com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter) r10;
            r0 = "receiver$0";
            defpackage.akcr.b(r10, r0);
            r0 = r10.d();
            r1 = "bluetoothAdapter";
            defpackage.akcr.a(r0, r1);
            r0 = r0.isPresent();
            r2 = 1;
            if (r0 == 0) goto L_0x002e;
        L_0x0017:
            r0 = r10.d();
            r0 = r0.get();
            r3 = "bluetoothAdapter.get()";
            defpackage.akcr.a(r0, r3);
            r0 = (android.bluetooth.BluetoothAdapter) r0;
            r0 = r0.isEnabled();
            if (r0 == 0) goto L_0x002e;
        L_0x002c:
            r8 = 1;
            goto L_0x0030;
        L_0x002e:
            r0 = 0;
            r8 = 0;
        L_0x0030:
            r0 = r10.getTarget();
            r3 = r0;
            r3 = (defpackage.xml) r3;
            if (r3 == 0) goto L_0x0053;
        L_0x0039:
            r4 = r10.k;
            r5 = r10.m;
            r0 = r10.w;
            r6 = r0.l();
            r10 = r10.d();
            defpackage.akcr.a(r10, r1);
            r10 = r10.isPresent();
            r7 = r10 ^ 1;
            r3.a(r4, r5, r6, r7, r8);
        L_0x0053:
            r10 = defpackage.ajxw.a;
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesSettingsPresenter$aj.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class ak extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        private /* synthetic */ xdb a;

        ak(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.MANUAL_CONNECT_ATTEMPT);
            SpectaclesSettingsPresenter.a((abbr) abdw, this.a);
            spectaclesSettingsPresenter.y.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class al extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        private /* synthetic */ xdb a;

        al(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.MANUAL_CONNECT_FAILURE);
            abdw.a(abdu.MANUAL_CONNECTION_FAILED);
            SpectaclesSettingsPresenter.a((abbr) abdw, this.a);
            spectaclesSettingsPresenter.y.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class am extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        private /* synthetic */ xdb a;

        am(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.MANUAL_CONNECT_FAILURE);
            abdw.a(abdu.MANUAL_CONNECTION_WHILE_FIRMWARE_UPDATING);
            SpectaclesSettingsPresenter.a((abbr) abdw, this.a);
            spectaclesSettingsPresenter.y.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class an extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        private /* synthetic */ xdb a;

        an(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.MANUAL_CONNECT_FAILURE);
            abdw.a(abdu.MANUAL_CONNECTION_WHILE_IMPORTING);
            SpectaclesSettingsPresenter.a((abbr) abdw, this.a);
            spectaclesSettingsPresenter.y.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class ao extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        private /* synthetic */ xdb a;

        ao(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.MANUAL_CONNECT_SUCCESS);
            SpectaclesSettingsPresenter.a((abbr) abdw, this.a);
            spectaclesSettingsPresenter.y.a((aajt) abdw);
            return ajxw.a;
        }
    }

    static final class ap extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        private /* synthetic */ xdb a;

        ap(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdw abdw = new abdw();
            abdw.a(abdv.MANUAL_DISCONNECT);
            SpectaclesSettingsPresenter.a((abbr) abdw, this.a);
            spectaclesSettingsPresenter.y.a((aajt) abdw);
            return ajxw.a;
        }
    }

    public static final class aq extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final aq a = new aq();

        aq() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdt abdt = new abdt();
            abdt.a(abdv.ECOMMERCE_WEBSITE_VISIT);
            spectaclesSettingsPresenter.y.a((aajt) abdt);
            return ajxw.a;
        }
    }

    public static final class ar extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final ar a = new ar();

        ar() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdt abdt = new abdt();
            abdt.a(abdv.EXIT);
            abdt.a(Long.valueOf((long) spectaclesSettingsPresenter.k.size()));
            abdt.a(SpectaclesSettingsPresenter.c(spectaclesSettingsPresenter));
            spectaclesSettingsPresenter.y.a((aajt) abdt);
            return ajxw.a;
        }
    }

    static final class as extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final as a = new as();

        as() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdt abdt = new abdt();
            abdt.a(abdv.GETTING_STARTED);
            spectaclesSettingsPresenter.y.a((aajt) abdt);
            return ajxw.a;
        }
    }

    static final class at extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final at a = new at();

        at() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdt abdt = new abdt();
            abdt.a(abdv.NEED_HELP);
            spectaclesSettingsPresenter.y.a((aajt) abdt);
            return ajxw.a;
        }
    }

    static final class au extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final au a = new au();

        au() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SpectaclesSettingsPresenter spectaclesSettingsPresenter = (SpectaclesSettingsPresenter) obj;
            akcr.b(spectaclesSettingsPresenter, "receiver$0");
            abdt abdt = new abdt();
            abdt.a(abdv.OPEN);
            abdt.a(Long.valueOf((long) spectaclesSettingsPresenter.k.size()));
            abdt.a(SpectaclesSettingsPresenter.c(spectaclesSettingsPresenter));
            spectaclesSettingsPresenter.y.a((aajt) abdt);
            return ajxw.a;
        }
    }

    static final class az extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesSettingsPresenter a;
        private /* synthetic */ ajwy b;

        az(SpectaclesSettingsPresenter spectaclesSettingsPresenter, ajwy ajwy) {
            this.a = spectaclesSettingsPresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a((idd) this.a.h.b());
        }
    }

    static final class bd extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        bd(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static final class d extends akcs implements akbl<xml, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xml xml = (xml) obj;
            akcr.b(xml, "receiver$0");
            xml.j();
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<SpectaclesSettingsPresenter, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((SpectaclesSettingsPresenter) obj, "receiver$0");
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbk<Optional<BluetoothAdapter>> {
        private /* synthetic */ SpectaclesSettingsPresenter a;

        f(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
            this.a = spectaclesSettingsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Optional) this.a.D.get();
        }
    }

    static final class h extends akcs implements akbk<idd> {
        public static final h a = new h();

        h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesSettingsPresenter");
        }
    }

    static final class l extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        l(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    static final class be extends akcq implements akbk<SpectaclesHttpInterface> {
        be(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (SpectaclesHttpInterface) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesSettingsPresenter.class), "spectaclesHttpInterface", "getSpectaclesHttpInterface()Lcom/snap/spectacles/config/SpectaclesHttpInterface;"), new akdc(akde.a(SpectaclesSettingsPresenter.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(SpectaclesSettingsPresenter.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(SpectaclesSettingsPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesSettingsPresenter.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(SpectaclesSettingsPresenter.class), "bluetoothAdapter", "getBluetoothAdapter()Lcom/google/common/base/Optional;")};
        a aVar = new a();
    }

    public SpectaclesSettingsPresenter(ajwy<xbd> ajwy, ihh ihh, xpw xpw, xon xon, Context context, aipn<SpectaclesHttpInterface> aipn, ncd ncd, ifs ifs, xqa xqa, dib dib, ajwy<iha> ajwy2, xji xji, xhg xhg, ajwy<xpi> ajwy3, ajwy<zgb> ajwy4, ajwy<ftl> ajwy5, abss abss, ajei ajei, xpw xpw2, achb<zjm, zjk> achb, aipn<Optional<BluetoothAdapter>> aipn2, xos xos) {
        ihh ihh2 = ihh;
        xpw xpw3 = xpw;
        xon xon2 = xon;
        Context context2 = context;
        aipn<SpectaclesHttpInterface> aipn3 = aipn;
        ncd ncd2 = ncd;
        ifs ifs2 = ifs;
        xqa xqa2 = xqa;
        dib dib2 = dib;
        ajwy<iha> ajwy6 = ajwy2;
        xji xji2 = xji;
        xhg xhg2 = xhg;
        ajwy<xpi> ajwy7 = ajwy3;
        ajwy<zgb> ajwy8 = ajwy4;
        ajwy<ftl> ajwy9 = ajwy5;
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(ihh2, "clock");
        akcr.b(xpw3, "deviceUtils");
        akcr.b(xon2, "releaseNoteManager");
        akcr.b(context2, "context");
        akcr.b(aipn3, "httpInterface");
        akcr.b(ncd2, "locationPermissionsRequester");
        akcr.b(ifs2, "permissionHelper");
        akcr.b(xqa2, "assetsPreloader");
        akcr.b(dib2, "blizzardEventLogger");
        akcr.b(ajwy6, "serializationHelper");
        akcr.b(xji2, "tooltipProcessor");
        akcr.b(xhg2, "generationIdentifierUtil");
        akcr.b(ajwy7, "firmwareUpdatesInfo");
        akcr.b(ajwy8, "schedulersProvider");
        akcr.b(ajwy5, "configProviderLazy");
        abss abss2 = abss;
        akcr.b(abss2, "releaseManager");
        ajei ajei2 = ajei;
        akcr.b(ajei2, "activityDisposable");
        akcr.b(xpw2, "spectaclesDeviceUtils");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn2, "bluetoothAdapterLazy");
        akcr.b(xos, "soundAndHapticFeedbackManager");
        ajwy<ftl> ajwy10 = ajwy5;
        this.r = ihh2;
        this.s = xpw3;
        this.t = xon2;
        this.u = context2;
        this.v = ncd2;
        this.w = ifs2;
        this.x = xqa2;
        this.y = dib2;
        this.z = ajwy6;
        this.A = xji2;
        this.N = xhg2;
        this.O = ajwy7;
        this.B = abss2;
        this.C = ajei2;
        achb<zjm, zjk> achb2 = achb;
        this.P = xpw2;
        this.Q = achb2;
        xos xos2 = xos;
        this.D = aipn2;
        this.E = xos2;
        this.F = ajxh.a(new be(aipn));
        ajwy<xbd> ajwy11 = ajwy;
        this.G = ajxh.a(new bd(ajwy11));
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        this.c = obj;
        obj = new x().getType();
        akcr.a(obj, "object : TypeToken<JsonObject>() {}.type");
        this.d = obj;
        this.e = new g(this);
        this.f = new ajei();
        this.g = new ajei();
        this.h = ajxh.a(h.a);
        ajwy<zgb> ajwy12 = ajwy4;
        this.H = ajxh.a(new az(this, ajwy12));
        this.I = ajxh.a(new l(ajwy10));
        this.J = ajxh.a(new f(this));
        this.K = new b(this, ajwy11, ajwy12);
        this.L = ajyw.a;
        this.k = ajyw.a;
        obj = new ajwl();
        akcr.a(obj, "BehaviorSubject.create<List<SpectaclesDevice>>()");
        this.l = obj;
        this.m = ajyw.a;
        obj = new ajwl();
        akcr.a(obj, "BehaviorSubject.create<L…SpectaclesReleaseNote>>()");
        this.n = obj;
        obj = new ajwl();
        akcr.a(obj, "BehaviorSubject.create<Boolean>()");
        this.o = obj;
    }

    public static final /* synthetic */ abbs c(SpectaclesSettingsPresenter spectaclesSettingsPresenter) {
        if (spectaclesSettingsPresenter.k.isEmpty()) {
            return null;
        }
        for (xdb xdb : spectaclesSettingsPresenter.k) {
            if (xdb.B()) {
                return xjo.a(spectaclesSettingsPresenter.a().c().a(xdb.d));
            }
        }
        return abbs.NOT_PAIRED;
    }

    public final <T> ajej a(T t, akbl<? super T, ajxw> akbl) {
        Object e = ajcx.b((Callable) new ab(t, akbl)).b((ajdw) b().f()).e();
        akcr.a(e, "Completable.fromCallable…edulers.io()).subscribe()");
        return e;
    }

    public final xbd a() {
        return (xbd) this.G.b();
    }

    /* Access modifiers changed, original: final */
    public final xli a(String str, JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("releaseNotesTitle");
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        jsonElement = jsonObject.get("releaseNotesBody");
        String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
        jsonElement = jsonObject.get("releaseNotesThumbnailUrl");
        String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
        xon xon = this.t;
        akcr.b(str, "version");
        return new xli(str, asString, asString2, asString3, xon.a().b(str) > 0, new p(this, jsonObject, str));
    }

    /* Access modifiers changed, original: final */
    public final void a(xdb xdb) {
        a((Object) this, (akbl) new al(xdb));
    }

    /* renamed from: a */
    public final void takeTarget(xml xml) {
        akcr.b(xml, "target");
        super.takeTarget(xml);
        xml.getLifecycle().a(this);
        zkf zkf = new zkf();
        zln.bindTo$default(this, zkf, this, null, null, 6, null);
        this.M = zkf;
        zkf = this.M;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.a(this);
    }

    public final void a(boolean z, boolean z2) {
        if (z || !z2) {
            ajej e = ajcx.b((Callable) new i(this, z)).b((ajdw) b().f()).e();
            akcr.a((Object) e, "Completable.fromCallable…             .subscribe()");
            ajvv.a(e, this.g);
            return;
        }
        xml xml = (xml) getTarget();
        if (xml != null) {
            xml.m();
        }
    }

    public final zfw b() {
        return (zfw) this.H.b();
    }

    /* Access modifiers changed, original: final */
    public final <T> boolean b(T t, akbl<? super T, ajxw> akbl) {
        return this.f.a(ajcx.b((Callable) new ay(this, t, akbl)).b((ajdw) b().l()).e());
    }

    /* Access modifiers changed, original: final */
    public final <T> ajej c(T t, akbl<? super T, ajxw> akbl) {
        ajej c = ajdx.c((Callable) new ba(this)).b((ajdw) b().b()).a((ajdw) b().l()).c((ajfb) new bb(t, akbl)).c();
        akcr.a((Object) c, "Single.fromCallable { so…             .subscribe()");
        return ajvv.a(c, this.f);
    }

    public final ftl c() {
        return (ftl) this.I.b();
    }

    /* Access modifiers changed, original: final */
    public final Optional<BluetoothAdapter> d() {
        return (Optional) this.J.b();
    }

    public final void dropTarget() {
        xml xml = (xml) getTarget();
        if (xml != null) {
            defpackage.j lifecycle = xml.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        zkf zkf = this.M;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.dispose();
        super.dropTarget();
    }

    public final void e() {
        if (this.i) {
            this.u.unregisterReceiver(this.e);
            this.i = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        c(this, aj.a);
    }

    public final void g() {
        if (this.w.l()) {
            Object d = d();
            akcr.a(d, "bluetoothAdapter");
            if (d.isPresent()) {
                d = d().get();
                akcr.a(d, "bluetoothAdapter.get()");
                if (((BluetoothAdapter) d).getState() != 10) {
                    a().h().a(defpackage.xed.a.LOW_LATENCY, 0);
                }
            }
        }
    }

    public final void h() {
        if (!this.b.get()) {
            a().h().a();
        }
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        Object f = this.w.h().a((ajdw) b().l()).f((ajfb) new ac(this));
        akcr.a(f, "permissionHelper.observe…      }\n                }");
        this.c = f;
        this.g.a(ajcx.b((Callable) new ad(this)).b((ajdw) b().f()).e());
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        h();
        a().c().d();
        this.g.a();
        e();
        this.c.dispose();
        this.f.a();
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.q = false;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSpectaclesBackgroundImportChangeEvent(xlt xlt) {
        akcr.b(xlt, "event");
        a(xlt.a, true);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSpectaclesConnectEvent(xlv xlv) {
        akcr.b(xlv, "event");
        xdb xdb = xlv.a;
        h();
        ajej c = ajdx.c((Callable) new bg(this)).a((ajdw) b().l()).c((ajfb) new bh(this, xdb)).b((ajdw) b().b()).c();
        akcr.a((Object) c, "Single.fromCallable {\n  …             .subscribe()");
        ajvv.a(c, this.g);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSpectaclesGetStartedEvent(xlw xlw) {
        akcr.b(xlw, "event");
        a((Object) this, (akbl) as.a);
        this.g.a(ajdx.c((Callable) new v(this)).b((ajdw) b().b()).a((ajdw) b().l()).c((ajfb) new w(this)).c());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSpectaclesLaunchWebViewEvent(xlx xlx) {
        akcr.b(xlx, "event");
        xml xml;
        if (xlx.a == defpackage.xnl.a.SHOP) {
            xml = (xml) getTarget();
            if (xml != null) {
                xml.b(xlx.b, xlx.c);
            }
            return;
        }
        if (xlx.a == defpackage.xnl.a.NEED_HELP) {
            a((Object) this, (akbl) at.a);
        }
        xml = (xml) getTarget();
        if (xml != null) {
            xml.a(xlx.b, xlx.c);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSpectaclesPairNewDeviceEvent(xly xly) {
        akcr.b(xly, "event");
        xml xml = (xml) getTarget();
        if (xml != null) {
            xml.l();
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSpectaclesSettingSectionEvent(xlu xlu) {
        akcr.b(xlu, "event");
        if (xlu.a == xno.RELEASE_NOTE) {
            ajej c = ajdx.c((Callable) new ag(this)).b((ajdw) b().b()).a((ajdw) b().l()).c((ajfb) new ah(this)).c();
            akcr.a((Object) c, "Single.fromCallable {\n  …             .subscribe()");
            ajvv.a(c, this.g);
        }
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        Object p = this.l.p(n.a);
        Object p2 = this.n.p(o.a);
        zma[] zmaArr = new zma[4];
        Context context = this.u;
        akcr.a(p, "deviceListSeekableObservable");
        Object d = d();
        String str = "bluetoothAdapter";
        akcr.a(d, str);
        zmaArr[0] = new xnp(context, p, d, this.w);
        context = this.u;
        akcr.a(p2, "releaseNoteSeekableObservable");
        zmaArr[1] = new xns(context, p2);
        Context context2 = this.u;
        Object a = a();
        String str2 = "specsCoreComponent";
        akcr.a(a, str2);
        zmaArr[2] = new xnx(context2, p, a);
        Context context3 = this.u;
        ajdp ajdp = this.o;
        Object d2 = d();
        akcr.a(d2, str);
        zmaArr[3] = new xni(context3, p, ajdp, d2, this.w);
        this.L = ajym.b((Object[]) zmaArr);
        zfw b = b();
        xpw xpw = this.P;
        Object a2 = a();
        akcr.a(a2, str2);
        achb achb = this.Q;
        xqa xqa = this.x;
        ajwy ajwy = this.K;
        ajwy ajwy2 = this.O;
        Optional d3 = d();
        akcr.a((Object) d3, str);
        zms zms = new zms((zlx) new xnw(b, xpw, a2, achb, xqa, ajwy, ajwy2, d3), xnh.class);
        zkf zkf = this.M;
        if (zkf == null) {
            akcr.a("bus");
        }
        zke a3 = zkf.a();
        akcr.a((Object) a3, "bus.eventDispatcher");
        zmh zmh = new zmh(zms, a3, (ajdw) b().b(), (ajdw) b().l(), this.L, 32);
        xml xml = (xml) getTarget();
        if (xml != null) {
            xml.a(zmh);
        }
        zln.bindTo$default(this, zmh.e(), this, null, null, 6, null);
        ajej e = ajcx.b((Callable) new ai(this)).b((ajdw) b().f()).e();
        akcr.a((Object) e, "Completable.fromCallable…             .subscribe()");
        ajvv.a(e, this.g);
    }
}
