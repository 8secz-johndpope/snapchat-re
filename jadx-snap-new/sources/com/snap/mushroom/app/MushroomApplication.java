package com.snap.mushroom.app;

import android.app.Activity;
import android.app.Application;
import android.os.Process;
import com.snap.composer.api.ComposerModules.AppModule;
import com.snap.core.durablejob.schedulers.work.WorkManagerWorker;
import com.snap.mushroom.base.HasEarlyInitComponent;
import defpackage.abll;
import defpackage.ablx;
import defpackage.abmc;
import defpackage.abme;
import defpackage.abmf;
import defpackage.abmg;
import defpackage.addn;
import defpackage.adeq;
import defpackage.aipn;
import defpackage.aipq;
import defpackage.aiqf;
import defpackage.ajwy;
import defpackage.dej;
import defpackage.dru.b;
import defpackage.ers;
import defpackage.evk;
import defpackage.ftq;
import defpackage.fty;
import defpackage.fvm;
import defpackage.fwx;
import defpackage.fxc;
import defpackage.gby;
import defpackage.gpd;
import defpackage.hky;
import defpackage.hxx;
import defpackage.ikd;
import defpackage.jdm;
import defpackage.klc;
import defpackage.mye;
import defpackage.ngs;
import defpackage.ojt;
import defpackage.ppl;
import defpackage.pwl;
import defpackage.qyq;
import defpackage.rqx;
import defpackage.rtn;
import defpackage.rtv;
import defpackage.rtv.a;
import defpackage.rvi;
import defpackage.rwe;
import defpackage.sgc;
import defpackage.tuq;
import defpackage.ubo;
import defpackage.ueq;
import defpackage.uie;
import defpackage.uzy;
import defpackage.vag;
import defpackage.vav;
import defpackage.wiv;
import defpackage.wor;
import defpackage.wsa.e;
import defpackage.xhs.c;
import defpackage.xtm;
import defpackage.ykj;
import defpackage.ytv;
import defpackage.ytx;
import defpackage.yux;
import defpackage.zfu;
import defpackage.zro;
import defpackage.zvx;
import java.util.Set;

public class MushroomApplication extends fxc<rvi> implements abmg, HasEarlyInitComponent, ytv {
    private static final String TRACEUR_MODE_FULL = "full";
    private static final String TRACEUR_MODE_LITE = "lite";
    private aipq<Activity> activityInjector;
    private rtn applicationComponent;
    private abll ctorTimer;
    wiv defaultSnapTokenInitializer;
    private ytx dynamicAppModule;
    private abll injectTimer;
    aipn<fwx> intentFactory;
    ablx launchTracker;
    Set<aipn<?>> lazyInitSingletons;
    aipn<ppl> leakTracker;
    ftq snapContentProviderDependencies;
    aipn<Object> stetho;
    aipn<abme> testDependencyProvider;
    ajwy<rwe> undeliverableExceptionConsumer;
    gpd userAuthStoreReader;
    ajwy<gby> workerWakeUpSchedulerProvider;

    public MushroomApplication(Application application) {
        this(application, abll.a(abmc.MAIN_APPLICATION_CONSTRUCTOR));
    }

    private MushroomApplication(Application application, abll abll) {
        super(application);
        Process.setThreadPriority(-4);
        this.ctorTimer = abll.a();
    }

    static /* synthetic */ void lambda$null$0(Runnable runnable) {
        if (runnable instanceof zfu) {
            String str = ((zfu) runnable).a;
        }
        runnable.run();
    }

    private /* synthetic */ Object lambda$onPostInjection$2() {
        this.stetho.get();
        return null;
    }

    public aipq<Activity> activityInjector() {
        return this.activityInjector;
    }

    public void attachDynamicAppModule(ytx ytx) {
        this.dynamicAppModule = ytx;
    }

    public rtn earlyInitComponent() {
        return this.applicationComponent;
    }

    public <T extends abmf> T getTestBridge(Class<T> cls) {
        return ((abme) this.testDependencyProvider.get()).getTestBridge(cls);
    }

    public /* synthetic */ void lambda$null$5$MushroomApplication(WorkManagerWorker workManagerWorker) {
        ((rvi) this.applicationCore.b.a()).inject(workManagerWorker);
    }

    public /* synthetic */ ablx lambda$onPostInjection$3$MushroomApplication() {
        return this.launchTracker;
    }

    public /* synthetic */ Object lambda$onPostInjection$6$MushroomApplication() {
        ((gby) this.workerWakeUpSchedulerProvider.get()).a(new -$$Lambda$MushroomApplication$b2fhc_6SEb7YTwgy-fc8AXE3ddE(this), this.dynamicAppModule.a().LOGGING);
        return null;
    }

    public /* synthetic */ aipq lambda$onPostInjection$7$MushroomApplication() {
        return this.applicationCore.activityInjector();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00e9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:17|18|19|20|21|22|23|(1:25)(1:27)|26) */
    public void onPostInjection() {
        /*
        r8 = this;
        r0 = defpackage.abmc.MAIN_APPLICATION_POST_INJECT;
        r0 = defpackage.abll.a(r0);
        r1 = r8.dynamicAppModule;
        r1 = r1.a();
        r1 = r1.TRACEUR_MODE;
        r2 = "full";
        r2 = r2.equals(r1);
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001c;
    L_0x0018:
        defpackage.aipd.a(r4);
        goto L_0x0027;
    L_0x001c:
        r2 = "lite";
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0027;
    L_0x0024:
        defpackage.aipd.a(r3);
    L_0x0027:
        r1 = r8.undeliverableExceptionConsumer;
        r1 = r1.get();
        r1 = (defpackage.ajfb) r1;
        defpackage.zgd.a(r1);
        r1 = new com.snap.mushroom.app.-$$Lambda$MushroomApplication$YJhgNeycLncb2tiNCdyVDAS8Rs8;
        r1.<init>(r8);
        defpackage.ablx.a = r1;
        r1 = com.snap.mushroom.app.-$$Lambda$MushroomApplication$NdLJgYu-iGjT9eMYIBhG8hhjqTw.INSTANCE;
        defpackage.abst.b = r1;
        r1 = r8.launchTracker;
        r2 = r8.ctorTimer;
        r1.a(r2);
        r1 = 0;
        r8.ctorTimer = r1;
        r2 = r8.launchTracker;
        r5 = r8.injectTimer;
        r2.a(r5);
        r8.injectTimer = r1;
        r2 = r8.defaultSnapTokenInitializer;
        r5 = r2.b;
        r2 = r2.a;
        r6 = "snapTokenHttpInterface";
        defpackage.akcr.b(r2, r6);
        r5.a = r2;
        r2 = r8.userAuthStoreReader;
        r2.a();
        r2 = new com.snap.mushroom.app.-$$Lambda$MushroomApplication$g3u1EFKK3jLiRgckIBmlh5QhNc4;
        r2.<init>(r8);
        defpackage.gvr.a.a(r2);
        r2 = new fxd;
        r5 = 2;
        r5 = new defpackage.aipq[r5];
        r6 = r8.applicationComponent;
        r6 = r6.b();
        r5[r3] = r6;
        r6 = new fxe;
        r7 = new com.snap.mushroom.app.-$$Lambda$MushroomApplication$FtjHoWqn8zFbfo1vCzjeW922MUk;
        r7.<init>(r8);
        r6.<init>(r7);
        r5[r4] = r6;
        r5 = com.google.common.collect.Lists.newArrayList(r5);
        r2.<init>(r5);
        r8.activityInjector = r2;
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 24;
        r6 = "accessFlags";
        if (r2 < r5) goto L_0x00bf;
    L_0x0094:
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 26;
        if (r2 >= r5) goto L_0x00bf;
    L_0x009a:
        r2 = android.view.LayoutInflater.class;
        r5 = "sConstructorMap";
        r2 = r2.getDeclaredField(r5);	 Catch:{ Exception -> 0x00bf }
        r2.setAccessible(r4);	 Catch:{ Exception -> 0x00bf }
        r5 = java.lang.reflect.Field.class;
        r5 = r5.getDeclaredField(r6);	 Catch:{ Exception -> 0x00bf }
        r5.setAccessible(r4);	 Catch:{ Exception -> 0x00bf }
        r7 = r2.getModifiers();	 Catch:{ Exception -> 0x00bf }
        r7 = r7 & -17;
        r5.setInt(r2, r7);	 Catch:{ Exception -> 0x00bf }
        r5 = new zmr;	 Catch:{ Exception -> 0x00bf }
        r5.<init>();	 Catch:{ Exception -> 0x00bf }
        r2.set(r1, r5);	 Catch:{ Exception -> 0x00bf }
    L_0x00bf:
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 28;
        if (r2 >= r5) goto L_0x0125;
    L_0x00c5:
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 21;
        if (r2 < r5) goto L_0x0125;
    L_0x00cb:
        r2 = android.graphics.Typeface.class;
        r5 = "sTypefaceCache";
        r2 = r2.getDeclaredField(r5);	 Catch:{ Exception -> 0x0125 }
        r2.setAccessible(r4);	 Catch:{ Exception -> 0x0125 }
        r5 = java.lang.reflect.Field.class;
        r5 = r5.getDeclaredField(r6);	 Catch:{ NoSuchFieldException -> 0x00e9 }
        r5.setAccessible(r4);	 Catch:{ NoSuchFieldException -> 0x00e9 }
        r7 = r2.getModifiers();	 Catch:{ NoSuchFieldException -> 0x00e9 }
        r7 = r7 & -17;
        r5.setInt(r2, r7);	 Catch:{ NoSuchFieldException -> 0x00e9 }
        goto L_0x010e;
    L_0x00e9:
        r5 = java.lang.reflect.Field.class;
        r7 = "artField";
        r5 = r5.getDeclaredField(r7);	 Catch:{ Exception -> 0x0125 }
        r5.setAccessible(r4);	 Catch:{ Exception -> 0x0125 }
        r7 = "java.lang.reflect.ArtField";
        r7 = java.lang.Class.forName(r7);	 Catch:{ Exception -> 0x0125 }
        r6 = r7.getDeclaredField(r6);	 Catch:{ Exception -> 0x0125 }
        r6.setAccessible(r4);	 Catch:{ Exception -> 0x0125 }
        r4 = r5.get(r2);	 Catch:{ Exception -> 0x0125 }
        r5 = r2.getModifiers();	 Catch:{ Exception -> 0x0125 }
        r5 = r5 & -17;
        r6.setInt(r4, r5);	 Catch:{ Exception -> 0x0125 }
    L_0x010e:
        r4 = r2.get(r1);	 Catch:{ Exception -> 0x0125 }
        r4 = r4 instanceof android.util.LongSparseArray;	 Catch:{ Exception -> 0x0125 }
        if (r4 == 0) goto L_0x011f;
    L_0x0116:
        r4 = new zpe;	 Catch:{ Exception -> 0x0125 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0125 }
    L_0x011b:
        r2.set(r1, r4);	 Catch:{ Exception -> 0x0125 }
        goto L_0x0125;
    L_0x011f:
        r4 = new zpg;	 Catch:{ Exception -> 0x0125 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0125 }
        goto L_0x011b;
    L_0x0125:
        r1 = r8.launchTracker;
        r0 = r0.a();
        r1.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.app.MushroomApplication.onPostInjection():void");
    }

    public void performInjection() {
        this.injectTimer = abll.a(abmc.MAIN_APPLICATION_INJECT);
        getApplicationContext();
        a aVar = new a();
        aVar.q = (ytx) aiqf.a(this.dynamicAppModule);
        if (aVar.a == null) {
            aVar.a = new b();
        }
        if (aVar.b == null) {
            aVar.b = new dej.a();
        }
        if (aVar.c == null) {
            aVar.c = new ykj.a();
        }
        if (aVar.d == null) {
            aVar.d = new tuq.a();
        }
        if (aVar.e == null) {
            aVar.e = new ikd.a();
        }
        if (aVar.f == null) {
            aVar.f = new ubo.a();
        }
        if (aVar.g == null) {
            aVar.g = new ueq.a();
        }
        if (aVar.h == null) {
            aVar.h = new uie.a();
        }
        if (aVar.i == null) {
            aVar.i = new fty.a();
        }
        if (aVar.j == null) {
            aVar.j = new ojt.a();
        }
        if (aVar.k == null) {
            aVar.k = new xtm.a();
        }
        if (aVar.l == null) {
            aVar.l = new addn.b();
        }
        if (aVar.m == null) {
            aVar.m = new ngs.b();
        }
        if (aVar.n == null) {
            aVar.n = new adeq.a();
        }
        if (aVar.o == null) {
            aVar.o = new evk.a();
        }
        if (aVar.p == null) {
            aVar.p = new evk.b();
        }
        if (aVar.q != null) {
            if (aVar.r == null) {
                aVar.r = new hxx.a();
            }
            if (aVar.s == null) {
                aVar.s = new c();
            }
            if (aVar.t == null) {
                aVar.t = new hky();
            }
            if (aVar.u == null) {
                aVar.u = new mye();
            }
            if (aVar.v == null) {
                aVar.v = new vag.a();
            }
            if (aVar.w == null) {
                aVar.w = new uzy.a();
            }
            if (aVar.x == null) {
                aVar.x = new qyq.a();
            }
            if (aVar.y == null) {
                aVar.y = new rqx.a();
            }
            if (aVar.z == null) {
                aVar.z = new wor.a();
            }
            if (aVar.A == null) {
                aVar.A = new sgc.a();
            }
            if (aVar.B == null) {
                aVar.B = new yux.b();
            }
            if (aVar.C == null) {
                aVar.C = new AppModule();
            }
            if (aVar.D == null) {
                aVar.D = new klc.a();
            }
            if (aVar.E == null) {
                aVar.E = new pwl.a();
            }
            if (aVar.F == null) {
                aVar.F = new fvm.a();
            }
            if (aVar.G == null) {
                aVar.G = new e();
            }
            if (aVar.H == null) {
                aVar.H = new zvx.a();
            }
            if (aVar.I == null) {
                aVar.I = new ngs.a();
            }
            if (aVar.J == null) {
                aVar.J = new vav.a();
            }
            if (aVar.K == null) {
                aVar.K = new ers.a();
            }
            if (aVar.L == null) {
                aVar.L = new jdm();
            }
            if (aVar.M == null) {
                aVar.M = new zro();
            }
            this.applicationComponent = new rtv(aVar, (byte) 0);
            this.applicationComponent.a(this);
            this.injectTimer.a();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ytx.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean shouldSkipInitialization() {
        return false;
    }
}
