package com.snap.spectacles.lib.fragments.presenters;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.spectacles.config.SpectaclesHttpInterface;
import defpackage.aajt;
import defpackage.abbe;
import defpackage.abbf;
import defpackage.abbh;
import defpackage.abcq;
import defpackage.abda;
import defpackage.abdb;
import defpackage.abdc;
import defpackage.abdd;
import defpackage.abde;
import defpackage.abdf;
import defpackage.abdg;
import defpackage.abdh;
import defpackage.abdi;
import defpackage.abdj;
import defpackage.abdk;
import defpackage.abdl;
import defpackage.abdm;
import defpackage.abdn;
import defpackage.abdo;
import defpackage.abdp;
import defpackage.abdq;
import defpackage.abdr;
import defpackage.abpu;
import defpackage.abqq;
import defpackage.adwk;
import defpackage.ahgl;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajez;
import defpackage.ajfb;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxr;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.dib;
import defpackage.fth;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.idd;
import defpackage.ifs;
import defpackage.tnj;
import defpackage.xai;
import defpackage.xbd;
import defpackage.xcl;
import defpackage.xdb;
import defpackage.xeb;
import defpackage.xeg;
import defpackage.xfa;
import defpackage.xgi;
import defpackage.xgj;
import defpackage.xhg;
import defpackage.xjd;
import defpackage.xji;
import defpackage.xmk;
import defpackage.xnb;
import defpackage.xnc;
import defpackage.xnd;
import defpackage.xos;
import defpackage.xpw;
import defpackage.xqa;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class SpectaclesPairPresenter extends zll<xmk> implements defpackage.k {
    private static final ImmutableSet<c> L = ImmutableSet.of(c.BLE_CONNECTION_FAILURE, c.GENUINE_AUTHENTICATION_FAILURE, c.BTC_CONNECTION_FAILURE);
    private final ajxe A = ajxh.a(z.a);
    private BluetoothAdapter B = BluetoothAdapter.getDefaultAdapter();
    private int C;
    private ajej D;
    private boolean E;
    private final IntentFilter F = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    private final ajxe G;
    private final ajxe H;
    private final h I;
    private final xji J;
    private final xhg K;
    public com.snap.spectacles.lib.fragments.SpectaclesPairFragment.b a;
    public String b;
    public boolean c;
    boolean d;
    public zfw e = zgb.a(this.z);
    boolean f;
    c g = c.BLE_CONNECTION_FAILURE;
    public d h = d.WAITING_FOR_PAIRING_CODE_BLE;
    a i = a.SNAPCODE_DIALOG;
    public xdb j;
    boolean k;
    xcl l = xcl.UNINITIALIZED;
    String m;
    public ajei n = new ajei();
    public final f o = new f();
    public final ajei p = new ajei();
    final xpw q;
    final aipn<gpb> r;
    final Context s;
    public final ifs t;
    final aipn<tnj> u;
    final ftl v;
    final xqa w;
    final dib x;
    final xos y;
    private final idd z = xai.f.callsite("SpectaclesPairPresenter");

    public enum a {
        SNAPCODE_DIALOG,
        BACK_BUTTON,
        NAMING_DIALOG,
        MULTIPLE_DEVICES_DIALOG,
        GENERIC_RETRY_DIALOG,
        BACKGROUNDED,
        TROUBLESHOOT_DIALOG
    }

    static final class aa<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesPairPresenter a;

        aa(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final /* synthetic */ Object call() {
            this.a.b().h().a();
            xdb xdb = this.a.j;
            if (xdb == null) {
                return null;
            }
            if (!(this.a.f || TextUtils.isEmpty(xdb.d) || this.a.a(xdb))) {
                if (this.a.k) {
                    this.a.b().j().e(xdb.d);
                } else {
                    this.a.b().j().d(xdb.d);
                }
            }
            return ajxw.a;
        }
    }

    static final class ab<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesPairPresenter a;

        ab(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final /* synthetic */ Object call() {
            if (this.a.b != null) {
                SpectaclesPairPresenter spectaclesPairPresenter = this.a;
                c cVar = c.BLE_CONNECTION_FAILURE;
                akcr.b(cVar, "<set-?>");
                spectaclesPairPresenter.g = cVar;
                this.a.a(d.SETTING_UP_BLE_CONNECTION);
                spectaclesPairPresenter = this.a;
                spectaclesPairPresenter.j = spectaclesPairPresenter.b().j().a(this.a.b);
                this.a.n.a();
                this.a.f();
                xdb xdb = this.a.j;
                if (xdb != null && xdb.n.d(xcl.BLE_CONNECTED)) {
                    this.a.o.c();
                }
                this.a.b = null;
            } else {
                this.a.a(d.WAITING_FOR_PAIRING_CODE_BLE);
            }
            return ajxw.a;
        }
    }

    static final class ac<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesPairPresenter a;
        private /* synthetic */ Object b;
        private /* synthetic */ akbl c;

        ac(SpectaclesPairPresenter spectaclesPairPresenter, Object obj, akbl akbl) {
            this.a = spectaclesPairPresenter;
            this.b = obj;
            this.c = akbl;
        }

        public final /* synthetic */ Object call() {
            if (((xmk) this.a.getTarget()) == null) {
                return null;
            }
            this.c.invoke(this.b);
            return ajxw.a;
        }
    }

    public static final class ad<V> implements Callable<Object> {
        final /* synthetic */ String a;
        private /* synthetic */ SpectaclesPairPresenter b;

        static final class a extends akcs implements akbl<xmk, ajxw> {
            private /* synthetic */ String a;
            private /* synthetic */ ad b;

            a(String str, ad adVar) {
                this.a = str;
                this.b = adVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmk xmk = (xmk) obj;
                akcr.b(xmk, "receiver$0");
                xmk.b(this.b.a, this.a);
                return ajxw.a;
            }
        }

        static final class b extends akcs implements akbl<xmk, ajxw> {
            private /* synthetic */ String a;
            private /* synthetic */ String b;

            b(String str, String str2) {
                this.a = str;
                this.b = str2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                xmk xmk = (xmk) obj;
                akcr.b(xmk, "receiver$0");
                xmk.c(this.a, this.b);
                return ajxw.a;
            }
        }

        public ad(SpectaclesPairPresenter spectaclesPairPresenter, String str) {
            this.b = spectaclesPairPresenter;
            this.a = str;
        }

        /* JADX WARNING: Missing block: B:5:0x0011, code skipped:
            if (r2 == null) goto L_0x0013;
     */
        public final java.lang.Object call() {
            /*
            r6 = this;
            r0 = r6.b;
            r0 = r0.j;
            r1 = 0;
            if (r0 == 0) goto L_0x00c7;
        L_0x0007:
            r2 = r0.k();
            if (r2 == 0) goto L_0x0013;
        L_0x000d:
            r2 = r2.c();
            if (r2 != 0) goto L_0x0018;
        L_0x0013:
            r2 = 0;
            r2 = defpackage.xpw.a(r2);
        L_0x0018:
            r3 = r6.a;
            r3 = (java.lang.CharSequence) r3;
            r4 = new akfr;
            r4.<init>(r2);
            r5 = "";
            r3 = r4.b(r3, r5);
            if (r3 == 0) goto L_0x00bf;
        L_0x0029:
            r3 = (java.lang.CharSequence) r3;
            r3 = defpackage.akgc.b(r3);
            r3 = r3.toString();
            r4 = r3.length();
            r5 = 4;
            if (r4 >= r5) goto L_0x0057;
        L_0x003a:
            r0 = r6.b;
            r0 = r0.getTarget();
            r0 = (defpackage.xmk) r0;
            if (r0 == 0) goto L_0x0056;
        L_0x0044:
            r1 = r6.b;
            r3 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$ad$a;
            r3.<init>(r2, r6);
            r3 = (defpackage.akbl) r3;
            r0 = r1.a(r0, r3);
            r0 = java.lang.Boolean.valueOf(r0);
            return r0;
        L_0x0056:
            return r1;
        L_0x0057:
            r4 = r6.b;
            r4 = r4.q;
            r5 = r0.d;
            r4 = r4.a(r3, r5);
            if (r4 == 0) goto L_0x0080;
        L_0x0063:
            r0 = r6.b;
            r0 = r0.getTarget();
            r0 = (defpackage.xmk) r0;
            if (r0 == 0) goto L_0x007f;
        L_0x006d:
            r1 = r6.b;
            r4 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$ad$b;
            r4.<init>(r3, r2);
            r4 = (defpackage.akbl) r4;
            r0 = r1.a(r0, r4);
            r0 = java.lang.Boolean.valueOf(r0);
            return r0;
        L_0x007f:
            return r1;
        L_0x0080:
            r1 = r0.k();
            if (r1 == 0) goto L_0x00b7;
        L_0x0086:
            r2 = r1.a();
            r2 = (java.lang.CharSequence) r2;
            r4 = r3;
            r4 = (java.lang.CharSequence) r4;
            r2 = android.text.TextUtils.equals(r2, r4);
            if (r2 != 0) goto L_0x00b7;
        L_0x0095:
            r1.a(r3);
            r2 = r6.b;
            r2 = r2.b();
            r2 = r2.j();
            r3 = r0.d;
            r2.a(r3, r1);
            r1 = r6.b;
            r1 = r1.o;
            r2 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.this;
            r3 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$f$f;
            r3.<init>(r1);
            r3 = (defpackage.akbl) r3;
            r2.b(r1, r3);
        L_0x00b7:
            r1 = r6.b;
            r1.c(r0);
            r0 = defpackage.ajxw.a;
            return r0;
        L_0x00bf:
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.CharSequence";
            r0.<init>(r1);
            throw r0;
        L_0x00c7:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$ad.call():java.lang.Object");
        }
    }

    static final class af<T> implements Comparator<xdb> {
        public static final af a = new af();

        af() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return Ints.compare(((xdb) obj).j(), ((xdb) obj2).j());
        }
    }

    static final class ar<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesPairPresenter a;

        ar(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.G.b());
        }
    }

    static final class as<V> implements Callable<ajej> {
        private /* synthetic */ SpectaclesPairPresenter a;
        private /* synthetic */ ahgl b;

        as(SpectaclesPairPresenter spectaclesPairPresenter, ahgl ahgl) {
            this.a = spectaclesPairPresenter;
            this.b = ahgl;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.G.b()).updateSpectaclesDevice(this.b).a((ajdw) this.a.e.f()).c((ajfb) AnonymousClass1.a).h(AnonymousClass2.a).c();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    public enum c {
        BLE_CONNECTION_FAILURE,
        GENUINE_AUTHENTICATION_FAILURE,
        BTC_CONNECTION_FAILURE
    }

    public enum d {
        WAITING_FOR_PAIRING_CODE_BLE,
        SETTING_UP_BLE_CONNECTION,
        SETTING_UP_BT_CLASSIC_CONNECTION,
        PAIRING_SUCCEEDED,
        SETTING_UP_CONNECTION_FAILED
    }

    public enum e {
        PAIRING_BLE_CONNECTION_TIMEOUT(35),
        PAIRING_BT_CLASSIC_TIMEOUT(60),
        PAIRING_INACTIVITY_TIMEOUT(20),
        PAIRING_FIRMWARE_PSM_EXTENSION_INTERVAL(20);
        
        public final long timeout;

        private e(long j) {
            this.timeout = j;
        }
    }

    public final class f {
        abdr a;
        abdl b;
        long c;
        long d;
        boolean e;

        static final class a extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abda abda = new abda();
                f.a(fVar, abda);
                SpectaclesPairPresenter.this.x.a((aajt) abda);
                return ajxw.a;
            }
        }

        static final class b extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            b(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdb abdb = new abdb();
                f.a(fVar, abdb);
                SpectaclesPairPresenter.this.x.a((aajt) abdb);
                return ajxw.a;
            }
        }

        static final class c extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            c(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdc abdc = new abdc();
                f.a(fVar, abdc);
                SpectaclesPairPresenter.this.x.a((aajt) abdc);
                return ajxw.a;
            }
        }

        static final class d extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            d(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                if (!fVar.e) {
                    abbh abbh;
                    fVar.e = true;
                    abdd abdd = new abdd();
                    f.a(fVar, abdd);
                    switch (xnb.c[SpectaclesPairPresenter.this.i.ordinal()]) {
                        case 1:
                            abbh = abbh.BACK_BUTTON;
                            break;
                        case 2:
                            abbh = abbh.CANCEL_BUTTON;
                            break;
                        case 3:
                            abbh = abbh.NAMING_DIALOG;
                            break;
                        case 4:
                            abbh = abbh.GENERIC_RETRY_DIALOG;
                            break;
                        case 5:
                            abbh = abbh.MULTIPLE_DEVICE_DIALOG;
                            break;
                        case 6:
                            abbh = abbh.BACKGROUNDED;
                            break;
                        case 7:
                            abbh = abbh.TROUBLE_SHOOTING_DIALOG;
                            break;
                        default:
                            throw new IllegalStateException("Unknown cancellation reason");
                    }
                    abdd.a(abbh);
                    SpectaclesPairPresenter.this.x.a((aajt) abdd);
                }
                return ajxw.a;
            }
        }

        static final class e extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            e(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                abdg abdg;
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                fVar.e = true;
                abdf abdf = new abdf();
                f.a(fVar, abdf);
                int i = xnb.d[SpectaclesPairPresenter.this.g.ordinal()];
                if (i == 1) {
                    abdg = abdg.BLE_CONNECTION_TIMEOUT;
                } else if (i == 2) {
                    abdg = abdg.GENUINE_AUTHENTICATION_FAILURE;
                } else if (i == 3) {
                    abdg = abdg.BTC_CONNECTION_TIMEOUT;
                } else {
                    throw new IllegalStateException("Unknown failure reason");
                }
                abdf.a(abdg);
                SpectaclesPairPresenter.this.x.a((aajt) abdf);
                return ajxw.a;
            }
        }

        static final class f extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            f(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdh abdh = new abdh();
                f.a(fVar, abdh);
                SpectaclesPairPresenter.this.x.a((aajt) abdh);
                return ajxw.a;
            }
        }

        static final class g extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            g(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdi abdi = new abdi();
                f.a(fVar, abdi);
                SpectaclesPairPresenter.this.x.a((aajt) abdi);
                return ajxw.a;
            }
        }

        public static final class h extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            public h(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdj abdj = new abdj();
                f.a(fVar, abdj);
                SpectaclesPairPresenter.this.x.a((aajt) abdj);
                return ajxw.a;
            }
        }

        public static final class i extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            public i(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                fVar.c++;
                abdk abdk = new abdk();
                f.a(fVar, abdk);
                SpectaclesPairPresenter.this.x.a((aajt) abdk);
                return ajxw.a;
            }
        }

        static final class j extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            j(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdm abdm = new abdm();
                abdm.a(abbe.UNINITIALIZED);
                abdm.a(abbf.INACTIVE);
                fVar.a(abdm);
                abdm.b(Long.valueOf(0));
                SpectaclesPairPresenter.this.x.a((aajt) abdm);
                return ajxw.a;
            }
        }

        static final class k extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            k(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                fVar.e = true;
                abdn abdn = new abdn();
                f.a(fVar, abdn);
                SpectaclesPairPresenter.this.x.a((aajt) abdn);
                return ajxw.a;
            }
        }

        public static final class l extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            public l(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdo abdo = new abdo();
                f.a(fVar, abdo);
                SpectaclesPairPresenter.this.x.a((aajt) abdo);
                return ajxw.a;
            }
        }

        public static final class m extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            public m(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdp abdp = new abdp();
                f.a(fVar, abdp);
                SpectaclesPairPresenter.this.x.a((aajt) abdp);
                return ajxw.a;
            }
        }

        static final class n extends akcs implements akbl<f, ajxw> {
            private /* synthetic */ f a;

            n(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                f fVar = (f) obj;
                akcr.b(fVar, "receiver$0");
                abdq abdq = new abdq();
                f.a(fVar, abdq);
                SpectaclesPairPresenter.this.x.a((aajt) abdq);
                return ajxw.a;
            }
        }

        public static final /* synthetic */ void a(f fVar, abde abde) {
            xdb xdb = SpectaclesPairPresenter.this.j;
            if (xdb != null) {
                abde.b(xdb.d);
                String p = xdb.p();
                if (TextUtils.isEmpty(p)) {
                    p = xhg.d(xdb.e()) ? "5.1" : xhg.c(xdb.e()) ? "4.1" : xhg.a(xdb.e()) ? "4.2" : "3";
                }
                abde.d(p);
                abcq M = xdb.M();
                if (M != null) {
                    abde.a(M);
                }
                abde.c(xdb.h());
            }
            abde.a(abbe.UNINITIALIZED);
            abde.a(abbf.INACTIVE);
            xdb = SpectaclesPairPresenter.this.j;
            if (xdb != null) {
                abbe abbe;
                StringBuilder stringBuilder;
                abbf abbf;
                switch (xnb.e[xdb.n.ordinal()]) {
                    case 1:
                        abbe = abbe.UNINITIALIZED;
                        break;
                    case 2:
                        abbe = abbe.BLE_ATTEMPT_TO_CONNECT;
                        break;
                    case 3:
                        abbe = abbe.BLE_AUTHENTICATED;
                        break;
                    case 4:
                        abbe = abbe.BLE_CONNECTED;
                        break;
                    case 5:
                    case 6:
                        abbe = abbe.BLE_DISCONNECTED;
                        break;
                    case 7:
                        abbe = abbe.BLE_FOUND_FROM_SCAN;
                        break;
                    case 8:
                        abbe = abbe.BLE_NAME_ACTION_REQUIRED;
                        break;
                    case 9:
                        abbe = abbe.BLE_SNAPCODE_FOUND;
                        break;
                    case 10:
                        abbe = abbe.BLE_SYNCED;
                        break;
                    case 11:
                        abbe = abbe.BLE_UNPAIR_ACTION_REQUIRED;
                        break;
                    default:
                        stringBuilder = new StringBuilder("Unknown ble state ");
                        stringBuilder.append(xdb.n);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                abde.a(abbe);
                switch (xnb.f[xdb.A().ordinal()]) {
                    case 1:
                        abbf = abbf.INACTIVE;
                        break;
                    case 2:
                        abbf = abbf.SEND_STOP_BT;
                        break;
                    case 3:
                        abbf = abbf.DISCOVERING;
                        break;
                    case 4:
                        abbf = abbf.BONDING;
                        break;
                    case 5:
                        abbf = abbf.CONNECTING;
                        break;
                    case 6:
                        abbf = abbf.CONNECTED;
                        break;
                    default:
                        stringBuilder = new StringBuilder("Unknown BTC state ");
                        stringBuilder.append(xdb.A());
                        throw new IllegalStateException(stringBuilder.toString());
                }
                abde.a(abbf);
            }
            fVar.a(abde);
        }

        public final void a() {
            SpectaclesPairPresenter.this.b(this, new j(this));
        }

        /* Access modifiers changed, original: final */
        public final void a(abde abde) {
            abde.a(SpectaclesPairPresenter.this.a());
            abde.a(this.b);
            abde.a(this.a);
            abde.a(Long.valueOf(this.c));
            abde.a(Double.valueOf(abqq.a(System.currentTimeMillis() - this.d, 1)));
        }

        public final void b() {
            SpectaclesPairPresenter.this.b(this, new a(this));
        }

        public final void c() {
            SpectaclesPairPresenter.this.b(this, new b(this));
        }

        public final void d() {
            SpectaclesPairPresenter.this.b(this, new e(this));
        }

        public final void e() {
            SpectaclesPairPresenter.this.b(this, new d(this));
        }

        public final void f() {
            SpectaclesPairPresenter.this.b(this, new n(this));
        }
    }

    public static final class h extends BroadcastReceiver {
        private /* synthetic */ SpectaclesPairPresenter a;

        h(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final void onReceive(Context context, Intent intent) {
            akcr.b(context, "context");
            akcr.b(intent, "intent");
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            SpectaclesPairPresenter spectaclesPairPresenter = this.a;
            if (intExtra == 12) {
                if (spectaclesPairPresenter.t.l()) {
                    spectaclesPairPresenter.b().h().a(defpackage.xed.a.LOW_LATENCY, 0);
                }
            } else if (intExtra == 10 && !spectaclesPairPresenter.f) {
                spectaclesPairPresenter.n.a();
                xmk xmk = (xmk) spectaclesPairPresenter.getTarget();
                if (xmk != null) {
                    spectaclesPairPresenter.a(xmk, t.a);
                }
            }
        }
    }

    static final class p<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesPairPresenter a;
        private /* synthetic */ xdb b;

        p(SpectaclesPairPresenter spectaclesPairPresenter, xdb xdb) {
            this.a = spectaclesPairPresenter;
            this.b = xdb;
        }

        public final /* synthetic */ Object call() {
            String a = xqa.a(this.b);
            if (this.a.a(a)) {
                this.a.w.a(a);
            }
            return ajxw.a;
        }
    }

    static final class q<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesPairPresenter a;
        private /* synthetic */ xdb b;

        q(SpectaclesPairPresenter spectaclesPairPresenter, xdb xdb) {
            this.a = spectaclesPairPresenter;
            this.b = xdb;
        }

        public final /* synthetic */ Object call() {
            this.a.w.a(this.b.L());
            return ajxw.a;
        }
    }

    static final class r<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        r(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
        }
    }

    static final class x<V> implements Callable<T> {
        private /* synthetic */ SpectaclesPairPresenter a;

        x(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final /* synthetic */ Object call() {
            return Optional.fromNullable(!this.a.b().j().g().isEmpty() ? ((xdb) this.a.b().j().g().get(0)).d : null);
        }
    }

    static final class ag implements xeb {
        private /* synthetic */ xdb a;
        private /* synthetic */ SpectaclesPairPresenter b;
        private /* synthetic */ boolean c;

        ag(xdb xdb, SpectaclesPairPresenter spectaclesPairPresenter, boolean z) {
            this.a = xdb;
            this.b = spectaclesPairPresenter;
            this.c = z;
        }

        public final void onComplete(MessageNano messageNano, int i) {
            if (messageNano instanceof adwk) {
                this.a.d(this.c);
                this.b.j();
                return;
            }
            xmk xmk = (xmk) this.b.getTarget();
            if (xmk != null) {
                this.b.a(xmk, xnd.a);
            }
        }
    }

    static final class ak implements ajev {
        private /* synthetic */ SpectaclesPairPresenter a;

        ak(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final void run() {
            if (this.a.h == d.SETTING_UP_BLE_CONNECTION) {
                SpectaclesPairPresenter.b(this.a);
            }
        }
    }

    public static final class al implements ajev {
        private /* synthetic */ SpectaclesPairPresenter a;

        public al(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final void run() {
            if (this.a.h == d.SETTING_UP_BT_CLASSIC_CONNECTION && !this.a.f) {
                SpectaclesPairPresenter.b(this.a);
            }
        }
    }

    static final class am implements ajev {
        private /* synthetic */ SpectaclesPairPresenter a;

        am(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final void run() {
            this.a.i();
        }
    }

    static final class an implements ajez {
        private /* synthetic */ SpectaclesPairPresenter a;

        an(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final boolean a() {
            return this.a.l != xcl.BLE_NAME_ACTION_REQUIRED;
        }
    }

    static final class ao implements ajev {
        private /* synthetic */ SpectaclesPairPresenter a;

        ao(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final void run() {
            if (!this.a.c) {
                SpectaclesPairPresenter spectaclesPairPresenter = this.a;
                a aVar = a.TROUBLESHOOT_DIALOG;
                akcr.b(aVar, "<set-?>");
                spectaclesPairPresenter.i = aVar;
                xmk xmk = (xmk) this.a.getTarget();
                if (xmk != null) {
                    xmk.s();
                }
            }
        }
    }

    static final class ap<T> implements ajfb<ajxr<? extends xdb, ? extends xgj, ? extends xgi>> {
        private /* synthetic */ SpectaclesPairPresenter a;

        ap(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        /* JADX WARNING: Missing block: B:55:0x01b0, code skipped:
            if (r1.c(defpackage.xcl.BLE_SNAPCODE_FOUND) == false) goto L_0x01b2;
     */
        /* JADX WARNING: Missing block: B:105:0x0334, code skipped:
            if (r12 == null) goto L_0x0336;
     */
        /* JADX WARNING: Missing block: B:167:0x051f, code skipped:
            if (r1 == null) goto L_0x0521;
     */
        /* JADX WARNING: Missing block: B:192:0x05af, code skipped:
            return;
     */
        public final /* synthetic */ void accept(java.lang.Object r17) {
            /*
            r16 = this;
            r0 = r16;
            r1 = r17;
            r1 = (defpackage.ajxr) r1;
            r2 = r1.a;
            r2 = (defpackage.xdb) r2;
            r3 = r1.b;
            r3 = (defpackage.xgj) r3;
            r4 = defpackage.xnc.a;
            r3 = r3.ordinal();
            r3 = r4[r3];
            r4 = "spectaclesDevice";
            r5 = 2;
            r6 = 1;
            if (r3 == r6) goto L_0x014f;
        L_0x001c:
            if (r3 == r5) goto L_0x0066;
        L_0x001e:
            r1 = 3;
            if (r3 == r1) goto L_0x0045;
        L_0x0021:
            r1 = 4;
            if (r3 == r1) goto L_0x0025;
        L_0x0024:
            goto L_0x0044;
        L_0x0025:
            r1 = r0.a;
            defpackage.akcr.b(r2, r4);
            r3 = r1.j;
            if (r3 == 0) goto L_0x0044;
        L_0x002e:
            r3 = r3.d;
            r3 = (java.lang.CharSequence) r3;
            r2 = r2.d;
            r2 = (java.lang.CharSequence) r2;
            r2 = android.text.TextUtils.equals(r3, r2);
            if (r2 == 0) goto L_0x0044;
        L_0x003c:
            r2 = r1.n;
            r2.a();
            r1.e();
        L_0x0044:
            return;
        L_0x0045:
            r1 = r0.a;
            r3 = "device";
            defpackage.akcr.b(r2, r3);
            r1.d = r6;
            r3 = r1.n;
            r3.a();
            r2.v();
            r2 = r1.getTarget();
            r2 = (defpackage.xmk) r2;
            if (r2 == 0) goto L_0x0065;
        L_0x005e:
            r3 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.aq.a;
            r3 = (defpackage.akbl) r3;
            r1.a(r2, r3);
        L_0x0065:
            return;
        L_0x0066:
            r1 = r0.a;
            defpackage.akcr.b(r2, r4);
            r3 = r1.j;
            if (r3 == 0) goto L_0x014e;
        L_0x006f:
            r4 = r1.l;
            r5 = defpackage.xcl.BLE_SYNCED;
            if (r4 != r5) goto L_0x014e;
        L_0x0075:
            r4 = r3.d;
            r4 = (java.lang.CharSequence) r4;
            r5 = r2.d;
            r5 = (java.lang.CharSequence) r5;
            r4 = android.text.TextUtils.equals(r4, r5);
            if (r4 == 0) goto L_0x014e;
        L_0x0083:
            r4 = r1.f;
            if (r4 == 0) goto L_0x0089;
        L_0x0087:
            goto L_0x014e;
        L_0x0089:
            r4 = r2.q();
            if (r4 == 0) goto L_0x014e;
        L_0x008f:
            r1.f = r6;
            r4 = r1.n;
            r4.a();
            r4 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d.PAIRING_SUCCEEDED;
            r1.a(r4);
            r4 = new ahgl;
            r4.<init>();
            r5 = defpackage.ahgk.UPDATE_DEVICE_INFO;
            r5 = r5.a();
            r4.a = r5;
            r3 = defpackage.xpw.a(r3);
            r4.b = r3;
            r3 = "request";
            defpackage.akcr.b(r4, r3);
            r3 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$ar;
            r3.<init>(r1);
            r3 = (java.util.concurrent.Callable) r3;
            r3 = defpackage.ajcx.b(r3);
            r5 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$as;
            r5.<init>(r1, r4);
            r5 = (java.util.concurrent.Callable) r5;
            r3 = r3.c(r5);
            r4 = r1.e;
            r4 = r4.g();
            r4 = (defpackage.ajdw) r4;
            r3 = r3.b(r4);
            r3.c();
            r3 = r1.o;
            r4 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.this;
            r5 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$f$k;
            r5.<init>(r3);
            r5 = (defpackage.akbl) r5;
            r4.b(r3, r5);
            r3 = r1.a(r2);
            if (r3 == 0) goto L_0x00fc;
        L_0x00ec:
            r2 = r1.getTarget();
            r2 = (defpackage.xmk) r2;
            if (r2 == 0) goto L_0x0135;
        L_0x00f4:
            r3 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.j.a;
            r3 = (defpackage.akbl) r3;
            r1.a(r2, r3);
            goto L_0x0135;
        L_0x00fc:
            r3 = r1.p;
            r4 = defpackage.ajhn.a;
            r4 = defpackage.ajvo.a(r4);
            r5 = r1.e;
            r5 = r5.b();
            r5 = (defpackage.ajdw) r5;
            r4 = r4.b(r5);
            r5 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
            r7 = java.util.concurrent.TimeUnit.MILLISECONDS;
            r4 = r4.b(r5, r7);
            r5 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$i;
            r5.<init>(r1, r2);
            r5 = (defpackage.ajev) r5;
            r2 = r4.b(r5);
            r2 = r2.e();
            r3.a(r2);
            r2 = r1.b();
            r2 = r2.h();
            r2.a();
        L_0x0135:
            r1 = r1.u;
            r1 = r1.get();
            r1 = (defpackage.tnj) r1;
            r1 = r1.b();
            r2 = defpackage.xjd.HAS_USED_SPECTACLES;
            r2 = (defpackage.fth) r2;
            r3 = java.lang.Boolean.TRUE;
            r1 = r1.a(r2, r3);
            r1.b();
        L_0x014e:
            return;
        L_0x014f:
            r1 = r1.c;
            r1 = (defpackage.xgi) r1;
            if (r1 == 0) goto L_0x05cd;
        L_0x0155:
            r3 = r0.a;
            r1 = r1.a();
            r7 = "it.bleState";
            defpackage.akcr.a(r1, r7);
            defpackage.akcr.b(r2, r4);
            r7 = "bleState";
            defpackage.akcr.b(r1, r7);
            r7 = r3.j;
            r8 = 0;
            if (r7 == 0) goto L_0x01aa;
        L_0x016d:
            r7 = r3.j;
            if (r7 == 0) goto L_0x0176;
        L_0x0171:
            r7 = r7.i();
            goto L_0x0177;
        L_0x0176:
            r7 = r8;
        L_0x0177:
            r7 = (java.lang.CharSequence) r7;
            r9 = r2.i();
            r9 = (java.lang.CharSequence) r9;
            r7 = android.text.TextUtils.equals(r7, r9);
            if (r7 != 0) goto L_0x019d;
        L_0x0185:
            r4 = defpackage.xcl.BLE_SNAPCODE_FOUND;
            if (r1 != r4) goto L_0x019c;
        L_0x0189:
            r4 = r3.l;
            r5 = defpackage.xcl.BLE_SNAPCODE_FOUND;
            r4 = r4.b(r5);
            if (r4 == 0) goto L_0x019c;
        L_0x0193:
            r3.j = r2;
            r3.l = r1;
            r1 = r3.o;
            r1.b();
        L_0x019c:
            return;
        L_0x019d:
            r7 = r1.ordinal();
            r9 = r3.l;
            r9 = r9.ordinal();
            if (r7 > r9) goto L_0x01b2;
        L_0x01a9:
            return;
        L_0x01aa:
            r7 = defpackage.xcl.BLE_SNAPCODE_FOUND;
            r7 = r1.c(r7);
            if (r7 != 0) goto L_0x05cd;
        L_0x01b2:
            r3.l = r1;
            r1 = r3.l;
            r7 = defpackage.xnc.b;
            r1 = r1.ordinal();
            r1 = r7[r1];
            switch(r1) {
                case 1: goto L_0x05b0;
                case 2: goto L_0x05af;
                case 3: goto L_0x0579;
                case 4: goto L_0x056c;
                case 5: goto L_0x0540;
                case 6: goto L_0x01e7;
                case 7: goto L_0x01c3;
                default: goto L_0x01c1;
            };
        L_0x01c1:
            goto L_0x05cd;
        L_0x01c3:
            r1 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.c.BTC_CONNECTION_FAILURE;
            r3.g = r1;
            r1 = r3.j;
            r1 = r1 instanceof defpackage.xju;
            if (r1 == 0) goto L_0x01d2;
        L_0x01cd:
            r1 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d.SETTING_UP_BT_CLASSIC_CONNECTION;
            r3.a(r1);
        L_0x01d2:
            r1 = r3.n;
            r1.a();
            r1 = r3.o;
            r2 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.this;
            r3 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$f$c;
            r3.<init>(r1);
            r3 = (defpackage.akbl) r3;
            r2.b(r1, r3);
            goto L_0x05cd;
        L_0x01e7:
            r1 = r3.j;
            r2 = 0;
            if (r1 == 0) goto L_0x022b;
        L_0x01ec:
            r7 = r3.v;
            r9 = defpackage.xjd.MALIBU_CAMERA_ENABLED;
            r9 = (defpackage.fth) r9;
            r7 = r7.a(r9);
            if (r7 != 0) goto L_0x022b;
        L_0x01f8:
            r7 = r1.e();
            r7 = defpackage.xhg.c(r7);
            if (r7 != 0) goto L_0x020c;
        L_0x0202:
            r7 = r1.e();
            r7 = defpackage.xhg.a(r7);
            if (r7 == 0) goto L_0x022b;
        L_0x020c:
            r3.d = r6;
            r7 = r3.n;
            r7.a();
            r1.v();
            r1 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.a.TROUBLESHOOT_DIALOG;
            r3.i = r1;
            r1 = r3.getTarget();
            r1 = (defpackage.xmk) r1;
            if (r1 == 0) goto L_0x0229;
        L_0x0222:
            r7 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.n.a;
            r7 = (defpackage.akbl) r7;
            r3.a(r1, r7);
        L_0x0229:
            r1 = 1;
            goto L_0x022c;
        L_0x022b:
            r1 = 0;
        L_0x022c:
            if (r1 != 0) goto L_0x05cd;
        L_0x022e:
            r1 = r3.j;
            if (r1 == 0) goto L_0x023f;
        L_0x0232:
            r7 = r1.e();
            r7 = defpackage.xhg.a(r7);
            if (r7 == 0) goto L_0x023f;
        L_0x023c:
            r3.b(r1);
        L_0x023f:
            r1 = r3.n;
            r1.a();
            r3.i();
            r1 = r3.n;
            r7 = defpackage.ajhn.a;
            r7 = defpackage.ajvo.a(r7);
            r9 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.e.PAIRING_FIRMWARE_PSM_EXTENSION_INTERVAL;
            r9 = r9.timeout;
            r11 = java.util.concurrent.TimeUnit.SECONDS;
            r7 = r7.b(r9, r11);
            r9 = r3.e;
            r9 = r9.f();
            r9 = (defpackage.ajdw) r9;
            r7 = r7.a(r9);
            r9 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$am;
            r9.<init>(r3);
            r9 = (defpackage.ajev) r9;
            r7 = r7.b(r9);
            r9 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$an;
            r9.<init>(r3);
            r9 = (defpackage.ajez) r9;
            r7 = r7.f();
            r10 = "stop is null";
            defpackage.ajfv.a(r9, r10);
            r10 = new ajkp;
            r10.<init>(r7, r9);
            r7 = defpackage.ajvo.a(r10);
            r7 = defpackage.ajcx.a(r7);
            r7 = r7.e();
            r1.a(r7);
            r1 = r3.j;
            r7 = r3.getTarget();
            if (r7 == 0) goto L_0x053f;
        L_0x029c:
            if (r1 == 0) goto L_0x053f;
        L_0x029e:
            r7 = r3.b();
            r7 = r7.j();
            r7 = r7.a();
            r9 = "specsCoreComponent.devic…ConnectedDeviceCollection";
            defpackage.akcr.a(r7, r9);
            r7 = defpackage.ajyu.h(r7);
            r9 = r7.contains(r1);
            if (r9 == 0) goto L_0x02bd;
        L_0x02b9:
            r7.remove(r1);
            goto L_0x02c8;
        L_0x02bd:
            r9 = r3.b();
            r9 = r9.j();
            r9.b(r1);
        L_0x02c8:
            r7 = (java.lang.Iterable) r7;
            r9 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.af.a;
            r9 = (java.util.Comparator) r9;
            r7 = defpackage.ajyu.a(r7, r9);
            r7 = r7.iterator();
            r9 = 0;
        L_0x02d7:
            r10 = r7.hasNext();
            if (r10 == 0) goto L_0x02ec;
        L_0x02dd:
            r10 = r7.next();
            r10 = (defpackage.xdb) r10;
            r10 = r10.j();
            if (r9 != r10) goto L_0x02ec;
        L_0x02e9:
            r9 = r9 + 1;
            goto L_0x02d7;
        L_0x02ec:
            r7 = r3.b();
            r7 = r7.j();
            r10 = r1.d;
            r7.a(r10, r9);
            r7 = r1.k();
            r10 = 0;
            if (r7 == 0) goto L_0x030c;
        L_0x0301:
            r12 = r7.b();
            r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
            if (r7 == 0) goto L_0x030a;
        L_0x0309:
            goto L_0x030c;
        L_0x030a:
            r7 = 0;
            goto L_0x030d;
        L_0x030c:
            r7 = 1;
        L_0x030d:
            r3.k = r7;
            r7 = r3.r;
            r7 = r7.get();
            r12 = "userAuthStore.get()";
            defpackage.akcr.a(r7, r12);
            r7 = (defpackage.gpb) r7;
            r7 = r7.b();
            r12 = r3.r;
            r12 = r12.get();
            r12 = (defpackage.gpb) r12;
            r13 = "";
            if (r12 == 0) goto L_0x0336;
        L_0x032c:
            r12 = r12.a();
            if (r12 == 0) goto L_0x0336;
        L_0x0332:
            r12 = r12.c;
            if (r12 != 0) goto L_0x0337;
        L_0x0336:
            r12 = r13;
        L_0x0337:
            r14 = "currentUser";
            defpackage.akcr.a(r7, r14);
            r14 = r3.s;
            r14 = r14.getResources();
            r15 = "context.resources";
            defpackage.akcr.a(r14, r15);
            defpackage.akcr.b(r1, r4);
            r4 = "displayName";
            defpackage.akcr.b(r12, r4);
            r4 = "userName";
            defpackage.akcr.b(r7, r4);
            r4 = "resources";
            defpackage.akcr.b(r14, r4);
            r4 = new xfa;
            r4.<init>();
            r15 = defpackage.xpw.a(r9);
            r4.b(r15);
            r15 = r1.k();
            if (r15 == 0) goto L_0x0370;
        L_0x036b:
            r15 = r15.a();
            goto L_0x0371;
        L_0x0370:
            r15 = r8;
        L_0x0371:
            r15 = (java.lang.CharSequence) r15;
            r15 = android.text.TextUtils.isEmpty(r15);
            if (r15 != 0) goto L_0x0395;
        L_0x0379:
            r7 = r1.k();
            if (r7 == 0) goto L_0x0383;
        L_0x037f:
            r8 = r7.a();
        L_0x0383:
            r4.a(r8);
            r7 = r1.k();
            if (r7 == 0) goto L_0x0390;
        L_0x038c:
            r10 = r7.b();
        L_0x0390:
            r4.a(r10);
            goto L_0x04ac;
        L_0x0395:
            r8 = "userDisplayName";
            defpackage.akcr.b(r12, r8);
            r8 = "username";
            defpackage.akcr.b(r7, r8);
            r12 = (java.lang.CharSequence) r12;
            r8 = r12.length();
            if (r8 != 0) goto L_0x03a9;
        L_0x03a7:
            r8 = 1;
            goto L_0x03aa;
        L_0x03a9:
            r8 = 0;
        L_0x03aa:
            r10 = "null cannot be cast to non-null type java.lang.String";
            if (r8 == 0) goto L_0x03af;
        L_0x03ae:
            goto L_0x0415;
        L_0x03af:
            r8 = defpackage.akgc.b(r12);
            r8 = r8.toString();
            r8 = (java.lang.CharSequence) r8;
            r11 = new akfr;
            r12 = " ";
            r11.<init>(r12);
            r8 = r11.a(r8, r2);
            r11 = r8.isEmpty();
            if (r11 == 0) goto L_0x03cb;
        L_0x03ca:
            goto L_0x0415;
        L_0x03cb:
            r7 = r8.size();
            if (r7 < r5) goto L_0x040f;
        L_0x03d1:
            r7 = new java.lang.StringBuilder;
            r7.<init>();
            r11 = r8.get(r2);
            r11 = (java.lang.String) r11;
            r7.append(r11);
            r7.append(r12);
            r11 = r8.size();
            r11 = r11 - r6;
            r8 = r8.get(r11);
            r8 = (java.lang.String) r8;
            if (r8 == 0) goto L_0x0409;
        L_0x03ef:
            r8 = r8.codePointAt(r2);
            r8 = java.lang.Character.toChars(r8);
            r11 = "Character.toChars(splitS…size - 1].codePointAt(0))";
            defpackage.akcr.a(r8, r11);
            r11 = new java.lang.String;
            r11.<init>(r8);
            r7.append(r11);
            r7 = r7.toString();
            goto L_0x0415;
        L_0x0409:
            r1 = new ajxt;
            r1.<init>(r10);
            throw r1;
        L_0x040f:
            r7 = r8.get(r2);
            r7 = (java.lang.String) r7;
        L_0x0415:
            r8 = 2131888014; // 0x7f12078e float:1.9410651E38 double:1.0532926285E-314;
            r11 = "resources.getString(com.…eger.toString(index + 1))";
            r12 = 2131888013; // 0x7f12078d float:1.941065E38 double:1.053292628E-314;
            if (r9 != 0) goto L_0x042d;
        L_0x041f:
            r15 = new java.lang.Object[r6];
            r15[r2] = r7;
            r15 = r14.getString(r8, r15);
            r8 = "resources.getString(com.…ber, firstAndLastInitial)";
            defpackage.akcr.a(r15, r8);
            goto L_0x0440;
        L_0x042d:
            r8 = new java.lang.Object[r5];
            r8[r2] = r7;
            r15 = r9 + 1;
            r15 = java.lang.Integer.toString(r15);
            r8[r6] = r15;
            r15 = r14.getString(r12, r8);
            defpackage.akcr.a(r15, r11);
        L_0x0440:
            r8 = defpackage.xpx.a;
            r12 = "UTF8_CHARSET";
            defpackage.akcr.a(r8, r12);
            if (r15 == 0) goto L_0x0539;
        L_0x0449:
            r8 = r15.getBytes(r8);
            r5 = "(this as java.lang.String).getBytes(charset)";
            defpackage.akcr.a(r8, r5);
            r2 = r8.length;
            r6 = 25;
            if (r2 <= r6) goto L_0x04a2;
        L_0x0457:
            r2 = defpackage.xpx.a;
            defpackage.akcr.a(r2, r12);
            if (r7 == 0) goto L_0x049c;
        L_0x045e:
            r2 = r7.getBytes(r2);
            defpackage.akcr.a(r2, r5);
            r2 = r2.length;
            r5 = r8.length;
            r5 = r5 - r6;
            r2 = r2 - r5;
            r2 = defpackage.xpw.a(r7, r2);
            if (r9 != 0) goto L_0x0482;
        L_0x046f:
            r5 = 1;
            r6 = new java.lang.Object[r5];
            r7 = 0;
            r6[r7] = r2;
            r2 = 2131888014; // 0x7f12078e float:1.9410651E38 double:1.0532926285E-314;
            r15 = r14.getString(r2, r6);
            r2 = "resources.getString(com.…ortenFirstAndLastInitial)";
            defpackage.akcr.a(r15, r2);
            goto L_0x04a2;
        L_0x0482:
            r5 = 1;
            r6 = 2;
            r7 = 0;
            r8 = new java.lang.Object[r6];
            r8[r7] = r2;
            r2 = r9 + 1;
            r2 = java.lang.Integer.toString(r2);
            r8[r5] = r2;
            r2 = 2131888013; // 0x7f12078d float:1.941065E38 double:1.053292628E-314;
            r15 = r14.getString(r2, r8);
            defpackage.akcr.a(r15, r11);
            goto L_0x04a2;
        L_0x049c:
            r1 = new ajxt;
            r1.<init>(r10);
            throw r1;
        L_0x04a2:
            r4.a(r15);
            r5 = r1.f();
            r4.a(r5);
        L_0x04ac:
            r2 = r3.b();
            r2 = r2.j();
            r5 = r1.d;
            r2.a(r5, r4);
            if (r9 != 0) goto L_0x04cf;
        L_0x04bb:
            r2 = r3.s;
            r2 = r2.getResources();
            r5 = 2131888017; // 0x7f120791 float:1.9410657E38 double:1.05329263E-314;
            r6 = 1;
            r7 = new java.lang.Object[r6];
            r4 = r4.c();
            r6 = 0;
            r7[r6] = r4;
            goto L_0x04ea;
        L_0x04cf:
            r6 = 0;
            r2 = r3.s;
            r2 = r2.getResources();
            r5 = 2131888000; // 0x7f120780 float:1.9410623E38 double:1.0532926216E-314;
            r7 = 2;
            r7 = new java.lang.Object[r7];
            r4 = r4.c();
            r7[r6] = r4;
            r4 = 1;
            r9 = r9 + r4;
            r6 = java.lang.Integer.valueOf(r9);
            r7[r4] = r6;
        L_0x04ea:
            r2 = r2.getString(r5, r7);
            r1.c(r2);
            r2 = r3.k;
            if (r2 == 0) goto L_0x04f9;
        L_0x04f5:
            r3.c(r1);
            return;
        L_0x04f9:
            r2 = r3.o;
            r4 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.this;
            r5 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$f$g;
            r5.<init>(r2);
            r5 = (defpackage.akbl) r5;
            r4.b(r2, r5);
            r2 = r3.q;
            r4 = r1.k();
            r5 = 1;
            r2 = r2.a(r4, r5);
            if (r2 != 0) goto L_0x0515;
        L_0x0514:
            r2 = r13;
        L_0x0515:
            r1 = r1.k();
            if (r1 == 0) goto L_0x0521;
        L_0x051b:
            r1 = r1.c();
            if (r1 != 0) goto L_0x0526;
        L_0x0521:
            r1 = 0;
            r1 = defpackage.xpw.a(r1);
        L_0x0526:
            r4 = r3.getTarget();
            r4 = (defpackage.xmk) r4;
            if (r4 == 0) goto L_0x0538;
        L_0x052e:
            r5 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$ae;
            r5.<init>(r2, r1);
            r5 = (defpackage.akbl) r5;
            r3.a(r4, r5);
        L_0x0538:
            return;
        L_0x0539:
            r1 = new ajxt;
            r1.<init>(r10);
            throw r1;
        L_0x053f:
            return;
        L_0x0540:
            r1 = r3.b();
            r1 = r1.j();
            r2 = r3.m;
            r1 = r1.b(r2);
            if (r1 == 0) goto L_0x0554;
        L_0x0550:
            r8 = r1.k();
        L_0x0554:
            r1 = r3.getTarget();
            r1 = (defpackage.xmk) r1;
            if (r1 == 0) goto L_0x0566;
        L_0x055c:
            r2 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$g;
            r2.<init>(r8);
            r2 = (defpackage.akbl) r2;
            r3.a(r1, r2);
        L_0x0566:
            r1 = r3.n;
            r1.a();
            return;
        L_0x056c:
            r1 = r3.n;
            r1.a();
            r3.f();
            r1 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.c.BLE_CONNECTION_FAILURE;
            r3.g = r1;
            return;
        L_0x0579:
            r1 = r3.j;
            if (r1 == 0) goto L_0x05aa;
        L_0x057d:
            r2 = r3.p;
            r4 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$q;
            r4.<init>(r3, r1);
            r4 = (java.util.concurrent.Callable) r4;
            r4 = defpackage.ajcx.b(r4);
            r5 = r3.e;
            r5 = r5.f();
            r5 = (defpackage.ajdw) r5;
            r4 = r4.b(r5);
            r4 = r4.e();
            r2.a(r4);
            r2 = r1.e();
            r2 = defpackage.xhg.a(r2);
            if (r2 != 0) goto L_0x05aa;
        L_0x05a7:
            r3.b(r1);
        L_0x05aa:
            r1 = r3.o;
            r1.c();
        L_0x05af:
            return;
        L_0x05b0:
            r1 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.c.BLE_CONNECTION_FAILURE;
            r3.g = r1;
            r1 = com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d.SETTING_UP_BLE_CONNECTION;
            r3.a(r1);
            r3.j = r2;
            r1 = r3.n;
            r1.a();
            r3.f();
            r1 = r3.o;
            r1.b();
            r1 = r3.y;
            r1.a();
        L_0x05cd:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$ap.accept(java.lang.Object):void");
        }
    }

    static final class i implements ajev {
        private /* synthetic */ SpectaclesPairPresenter a;
        private /* synthetic */ xdb b;

        i(SpectaclesPairPresenter spectaclesPairPresenter, xdb xdb) {
            this.a = spectaclesPairPresenter;
            this.b = xdb;
        }

        public final void run() {
            SpectaclesPairPresenter spectaclesPairPresenter = this.a;
            xdb xdb = this.b;
            akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
            String a = xqa.a(xdb);
            if (spectaclesPairPresenter.a(a)) {
                xmk xmk = (xmk) spectaclesPairPresenter.getTarget();
                if (xmk != null) {
                    spectaclesPairPresenter.a(xmk, new l(xdb, a));
                }
                return;
            }
            xmk xmk2 = (xmk) spectaclesPairPresenter.getTarget();
            if (xmk2 != null) {
                spectaclesPairPresenter.a(xmk2, m.a);
            }
        }
    }

    static final class o implements xeb {
        public static final o a = new o();

        o() {
        }

        public final void onComplete(MessageNano messageNano, int i) {
        }
    }

    static final class y<T> implements ajfb<Optional<? extends String>> {
        private /* synthetic */ SpectaclesPairPresenter a;

        y(SpectaclesPairPresenter spectaclesPairPresenter) {
            this.a = spectaclesPairPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            SpectaclesPairPresenter spectaclesPairPresenter = this.a;
            akcr.a(obj, "it");
            spectaclesPairPresenter.m = obj.isPresent() ? (String) obj.get() : null;
        }
    }

    static final class ae extends akcs implements akbl<xmk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;

        ae(String str, String str2) {
            this.a = str;
            this.b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.a(this.a, this.b);
            return ajxw.a;
        }
    }

    static final class ah extends akcs implements akbl<xmk, ajxw> {
        private /* synthetic */ d a;

        ah(d dVar) {
            this.a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.a(this.a);
            return ajxw.a;
        }
    }

    static final class ai extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        ai(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static final class aq extends akcs implements akbl<xmk, ajxw> {
        public static final aq a = new aq();

        aq() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.k();
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<xmk, ajxw> {
        private /* synthetic */ xfa a;

        g(xfa xfa) {
            this.a = xfa;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xfa xfa = this.a;
            xmk.a(xfa != null ? xfa.a() : null);
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<xmk, ajxw> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.q();
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<xmk, ajxw> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.r();
            return ajxw.a;
        }
    }

    static final class l extends akcs implements akbl<xmk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ String b;

        l(xdb xdb, String str) {
            this.a = xdb;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.d(this.a.d, this.b);
            return ajxw.a;
        }
    }

    static final class m extends akcs implements akbl<xmk, ajxw> {
        public static final m a = new m();

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.a(false);
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<xmk, ajxw> {
        public static final n a = new n();

        n() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.u();
            return ajxw.a;
        }
    }

    static final class s extends akcs implements akbl<xmk, ajxw> {
        public static final s a = new s();

        s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.j();
            return ajxw.a;
        }
    }

    static final class t extends akcs implements akbl<xmk, ajxw> {
        public static final t a = new t();

        t() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.n();
            return ajxw.a;
        }
    }

    static final class u extends akcs implements akbl<xmk, ajxw> {
        public static final u a = new u();

        u() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.n();
            return ajxw.a;
        }
    }

    static final class v extends akcs implements akbl<xmk, ajxw> {
        public static final v a = new v();

        v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.p();
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<xmk, ajxw> {
        public static final w a = new w();

        w() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xmk xmk = (xmk) obj;
            akcr.b(xmk, "receiver$0");
            xmk.o();
            return ajxw.a;
        }
    }

    static final class z extends akcs implements akbk<String> {
        public static final z a = new z();

        z() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return abpu.a().toString();
        }
    }

    static final class aj extends akcq implements akbk<SpectaclesHttpInterface> {
        aj(aipn aipn) {
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
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesPairPresenter.class), "pairingSessionId", "getPairingSessionId()Ljava/lang/String;"), new akdc(akde.a(SpectaclesPairPresenter.class), "spectaclesHttpInterface", "getSpectaclesHttpInterface()Lcom/snap/spectacles/config/SpectaclesHttpInterface;"), new akdc(akde.a(SpectaclesPairPresenter.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;")};
        b bVar = new b();
    }

    public SpectaclesPairPresenter(ajwy<xbd> ajwy, xpw xpw, aipn<gpb> aipn, Context context, zgb zgb, ifs ifs, aipn<tnj> aipn2, xji xji, ftl ftl, aipn<SpectaclesHttpInterface> aipn3, xhg xhg, xqa xqa, dib dib, xos xos) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(xpw, "deviceUtils");
        akcr.b(aipn, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ifs, "permissionHelper");
        akcr.b(aipn2, "preference");
        akcr.b(xji, "tooltipProcessor");
        akcr.b(ftl, "configProvider");
        akcr.b(aipn3, "httpInterface");
        akcr.b(xhg, "generationIdentifierUtil");
        akcr.b(xqa, "assetPreloader");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(xos, "soundAndHapticFeedbackManager");
        this.q = xpw;
        this.r = aipn;
        this.s = context;
        this.t = ifs;
        this.u = aipn2;
        this.J = xji;
        this.v = ftl;
        this.K = xhg;
        this.w = xqa;
        this.x = dib;
        this.y = xos;
        this.G = ajxh.a(new aj(aipn3));
        this.H = ajxh.a(new ai(ajwy));
        this.I = new h(this);
    }

    private com.snap.spectacles.lib.fragments.SpectaclesPairFragment.b k() {
        com.snap.spectacles.lib.fragments.SpectaclesPairFragment.b bVar = this.a;
        if (bVar == null) {
            akcr.a("pairFragmentCaller");
        }
        return bVar;
    }

    private final boolean l() {
        try {
            if (this.B == null) {
                return false;
            }
            Object obj = this.B;
            akcr.a(obj, "bluetoothAdapter");
            return obj.getState() == 12;
        } catch (SecurityException unused) {
            return false;
        }
    }

    private void m() {
        u uVar;
        Object obj;
        if (l()) {
            xmk obj2;
            if (L.contains(this.g)) {
                this.C++;
                if (this.C >= 2) {
                    d();
                    this.i = a.TROUBLESHOOT_DIALOG;
                    this.o.f();
                    obj2 = (xmk) getTarget();
                    if (obj2 != null) {
                        uVar = v.a;
                    } else {
                        return;
                    }
                }
            }
            obj2 = (xmk) getTarget();
            if (obj2 != null) {
                uVar = w.a;
            } else {
                return;
            }
        }
        obj2 = (xmk) getTarget();
        if (obj2 != null) {
            uVar = u.a;
        }
        a(obj2, uVar);
    }

    private final void n() {
        ajcx.b((Callable) new aa(this)).b((ajdw) this.e.b()).e();
    }

    private void o() {
        ajej ajej = this.D;
        if (ajej != null) {
            this.n.b(ajej);
            this.D = null;
        }
    }

    public final String a() {
        return (String) this.A.b();
    }

    public final void a(d dVar) {
        akcr.b(dVar, "state");
        if (!this.d) {
            this.h = dVar;
            int i = xnc.d[dVar.ordinal()];
            if (i == 1) {
                g();
            } else if (i == 2) {
                o();
            } else if (i == 3) {
                o();
                this.n.a();
                this.i = a.GENERIC_RETRY_DIALOG;
                xdb xdb = this.j;
                if ((xdb != null ? xdb.A() : null) == xeg.CONNECTED) {
                    this.g = c.GENUINE_AUTHENTICATION_FAILURE;
                }
                this.o.d();
                m();
            }
            xmk xmk = (xmk) getTarget();
            if (xmk != null) {
                a(xmk, new ah(dVar));
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(xmk xmk) {
        akcr.b(xmk, "target");
        super.takeTarget(xmk);
        xmk.getLifecycle().a(this);
    }

    public final void a(boolean z) {
        xdb xdb = this.j;
        if (xdb != null) {
            xdb.a(z, (xeb) new ag(xdb, this, z));
        }
    }

    /* Access modifiers changed, original: final */
    public final <T> boolean a(T t, akbl<? super T, ajxw> akbl) {
        return this.p.a(ajcx.b((Callable) new ac(this, t, akbl)).b((ajdw) this.e.l()).e());
    }

    /* Access modifiers changed, original: final */
    public final boolean a(String str) {
        return this.v.a((fth) xjd.ALWAYS_SHOW_ONBOARDING) ? true : str.equals("laguna") ? !this.J.a.a((fth) xjd.HAS_SEEN_LAGUNA_ONBOARDING_FLOW) : str.equals("malibu-2") ? !this.J.a() : !this.J.b();
    }

    public final boolean a(xdb xdb) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        return (TextUtils.isEmpty((CharSequence) xdb.d) || !TextUtils.equals(xdb.d, this.m) || xdb.N()) ? false : true;
    }

    public final <T> ajej b(T t, akbl<? super T, ajxw> akbl) {
        akcr.b(akbl, "block");
        Object e = ajcx.b((Callable) new r(t, akbl)).b((ajdw) this.e.f()).e();
        akcr.a(e, "Completable.fromCallable…edulers.io()).subscribe()");
        return e;
    }

    public final xbd b() {
        return (xbd) this.H.b();
    }

    /* Access modifiers changed, original: final */
    public final void b(xdb xdb) {
        this.p.a(ajcx.b((Callable) new p(this, xdb)).b((ajdw) this.e.f()).e());
    }

    public final void c() {
        this.o.e();
        b().h().a();
        xmk xmk = (xmk) getTarget();
        if (xmk != null) {
            xmk.a(true);
        }
    }

    public final void c(xdb xdb) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        if (xdb.N()) {
            xmk xmk = (xmk) getTarget();
            if (xmk != null) {
                a(xmk, k.a);
            }
            return;
        }
        j();
    }

    public final void d() {
        this.p.a(ajcx.b((Callable) new ab(this)).b((ajdw) this.e.b()).e());
    }

    public final void dropTarget() {
        xmk xmk = (xmk) getTarget();
        if (xmk != null) {
            defpackage.j lifecycle = xmk.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        this.k = false;
        b().b().a(defpackage.xfn.a.PAIRING_FAILURE_TIMESTAMP, SystemClock.elapsedRealtime());
        b().b().b(defpackage.xfn.a.PAIRING_FAILURE_STAGE, this.h.name());
        a(d.SETTING_UP_CONNECTION_FAILED);
        this.j = null;
        this.l = xcl.UNINITIALIZED;
    }

    public final void f() {
        this.n.a(ajvo.a(ajhn.a).b(e.PAIRING_BLE_CONNECTION_TIMEOUT.timeout, TimeUnit.SECONDS).a((ajdw) this.e.f()).b((ajev) new ak(this)).e());
    }

    public final void g() {
        o();
        ajej e = ajvo.a(ajhn.a).b(e.PAIRING_INACTIVITY_TIMEOUT.timeout, TimeUnit.SECONDS).a((ajdw) this.e.l()).b((ajev) new ao(this)).e();
        this.n.a(e);
        this.D = e;
    }

    public final void h() {
        o();
        this.n.a();
        if (this.h != d.PAIRING_SUCCEEDED) {
            this.i = a.SNAPCODE_DIALOG;
            xmk xmk = (xmk) getTarget();
            if (xmk != null) {
                a(xmk, s.a);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        xdb xdb = this.j;
        if (xdb != null) {
            xdb.b((xeb) o.a);
        }
    }

    public final void j() {
        xdb xdb = this.j;
        if (xdb != null) {
            xdb.a(xcl.BLE_SYNCED);
        }
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        f fVar = this.o;
        int i = xnb.b[SpectaclesPairPresenter.this.k().ordinal()];
        String str = "Unknown pairing source!";
        if (i == 1 || i == 2 || i == 3) {
            abdl abdl;
            fVar.a = abdr.DISCOVERY_ONLY;
            fVar.d = System.currentTimeMillis();
            i = xnb.a[SpectaclesPairPresenter.this.k().ordinal()];
            if (i == 1) {
                abdl = abdl.SETTINGS_ADD_SPEC;
            } else if (i == 2) {
                abdl = abdl.SETTINGS_REPAIR_DIALOG;
            } else if (i == 3) {
                abdl = abdl.SETTINGS_REPAIR_FROM_INFO_ICON;
            } else {
                throw new IllegalStateException(str);
            }
            fVar.b = abdl;
            this.o.a();
            return;
        }
        throw new IllegalStateException(str);
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        if (!this.E) {
            this.s.registerReceiver(this.I, this.F);
            this.E = true;
        }
        this.p.a(b().e().b().f((ajfb) new ap(this)));
        this.p.a(ajdx.c((Callable) new x(this)).b((ajdw) this.e.b()).c((ajfb) new y(this)).c());
        d();
    }

    @defpackage.s(a = defpackage.j.a.ON_STOP)
    public final void onStop() {
        if (this.E) {
            this.s.unregisterReceiver(this.I);
            this.E = false;
        }
        this.n.a();
        n();
        this.p.dispose();
    }
}
