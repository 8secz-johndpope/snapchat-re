package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.ExternalVideoService;
import com.addlive.djinni.Service;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.snapchat.talkcorev3.Logger;
import com.snapchat.talkcorev3.MetricsReporter;
import com.snapchat.talkcorev3.PresenceServiceDelegate;
import com.snapchat.talkcorev3.PresenceTransportType;
import com.snapchat.talkcorev3.TalkCore;
import com.snapchat.talkcorev3.TalkCoreDelegate;
import com.snapchat.talkcorev3.TalkCoreParameters;
import defpackage.zfw.a;
import java.io.File;
import java.util.concurrent.Callable;
import org.webrtc.ContextUtils;

/* renamed from: yxr */
public final class yxr {

    /* renamed from: yxr$a */
    public interface a {
        void onTalkCoreReady(TalkCore talkCore);
    }

    /* renamed from: yxr$g */
    static final class g extends akcs implements akbl<Throwable, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "e");
            return ajxw.a;
        }
    }

    /* renamed from: yxr$f */
    static final class f extends akcq implements akbl<TalkCore, ajxw> {
        f(a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "onTalkCoreReady";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "onTalkCoreReady(Lcom/snapchat/talkcorev3/TalkCore;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TalkCore talkCore = (TalkCore) obj;
            akcr.b(talkCore, "p1");
            ((a) this.receiver).onTalkCoreReady(talkCore);
            return ajxw.a;
        }
    }

    /* renamed from: yxr$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? PresenceTransportType.ARROYO : PresenceTransportType.CHAT;
        }
    }

    /* renamed from: yxr$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ Context a;
        private /* synthetic */ String b;

        c(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            PresenceTransportType presenceTransportType = (PresenceTransportType) obj;
            PresenceTransportType presenceTransportType2 = presenceTransportType;
            akcr.b(presenceTransportType, "presenceTransportType");
            String absolutePath = new File(this.a.getCacheDir(), "ADL_Performance.log").getAbsolutePath();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Build.MODEL);
            stringBuilder.append("|");
            stringBuilder.append(VERSION.RELEASE);
            String stringBuilder2 = stringBuilder.toString();
            String str = this.b;
            Object a = abss.a();
            akcr.a(a, "ReleaseManager.getInstance()");
            return new TalkCoreParameters(str, stringBuilder2, absolutePath, 22000, 7000, 30000, 17000, 20000, 1500, BrightcoveMediaController.DEFAULT_TIMEOUT, BrightcoveMediaController.DEFAULT_TIMEOUT, BrightcoveMediaController.DEFAULT_TIMEOUT, 2500, a.k(), presenceTransportType2, 5000);
        }
    }

    /* renamed from: yxr$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yxr a;
        private /* synthetic */ Context b;
        private /* synthetic */ String c;
        private /* synthetic */ TalkCoreDelegate d;
        private /* synthetic */ PresenceServiceDelegate e;
        private /* synthetic */ Logger f;
        private /* synthetic */ MetricsReporter g;
        private /* synthetic */ ExternalVideoService h;

        e(yxr yxr, Context context, String str, TalkCoreDelegate talkCoreDelegate, PresenceServiceDelegate presenceServiceDelegate, Logger logger, MetricsReporter metricsReporter, ExternalVideoService externalVideoService) {
            this.a = yxr;
            this.b = context;
            this.c = str;
            this.d = talkCoreDelegate;
            this.e = presenceServiceDelegate;
            this.f = logger;
            this.g = metricsReporter;
            this.h = externalVideoService;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TalkCoreParameters talkCoreParameters = (TalkCoreParameters) obj;
            akcr.b(talkCoreParameters, "parameters");
            Context context = this.b;
            String str = this.c;
            obj = ajdx.c((Callable) new b(context, talkCoreParameters, this.d, this.f, this.g, this.h, str, this.e));
            akcr.a(obj, "Single.fromCallable {\n  …        }\n        }\n    }");
            return obj;
        }
    }

    /* renamed from: yxr$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ Context a;
        private /* synthetic */ TalkCoreParameters b;
        private /* synthetic */ TalkCoreDelegate c;
        private /* synthetic */ Logger d;
        private /* synthetic */ MetricsReporter e;
        private /* synthetic */ ExternalVideoService f;
        private /* synthetic */ String g;
        private /* synthetic */ PresenceServiceDelegate h;

        b(Context context, TalkCoreParameters talkCoreParameters, TalkCoreDelegate talkCoreDelegate, Logger logger, MetricsReporter metricsReporter, ExternalVideoService externalVideoService, String str, PresenceServiceDelegate presenceServiceDelegate) {
            this.a = context;
            this.b = talkCoreParameters;
            this.c = talkCoreDelegate;
            this.d = logger;
            this.e = metricsReporter;
            this.f = externalVideoService;
            this.g = str;
            this.h = presenceServiceDelegate;
        }

        private TalkCore a() {
            if (ContextUtils.getApplicationContext() == null) {
                ContextUtils.initialize(this.a);
                Service.androidInit(this.a);
            }
            TalkCore create = TalkCore.create(this.b, this.c, this.d, this.e, this.f);
            create.setProperty("app.version", this.g);
            create.getPresenceService().setDelegate(this.h);
            return create;
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    public final ajej a(Context context, Handler handler, exs exs, String str, TalkCoreDelegate talkCoreDelegate, PresenceServiceDelegate presenceServiceDelegate, Logger logger, MetricsReporter metricsReporter, ExternalVideoService externalVideoService, abju abju, a aVar) {
        Context context2 = context;
        Handler handler2 = handler;
        String str2 = str;
        a aVar2 = aVar;
        akcr.b(context2, "context");
        akcr.b(handler2, "talkCoreHandler");
        akcr.b(exs, "clientLoader");
        akcr.b(str2, "ownUserName");
        akcr.b(talkCoreDelegate, "coreDelegate");
        akcr.b(presenceServiceDelegate, "presenceDelegate");
        akcr.b(logger, "logger");
        akcr.b(metricsReporter, "metricsReporter");
        akcr.b(externalVideoService, "videoService");
        akcr.b(abju, "talkExperiments");
        akcr.b(aVar2, "readyListener");
        String str3 = "Disposables.disposed()";
        Object obj;
        if (yxp.a()) {
            obj = ajfq.INSTANCE;
            akcr.a(obj, str3);
            return obj;
        }
        try {
            Object obj2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            akcr.a(obj2, "context.packageManager.g…ckageName, 0).versionName");
            ajcx a = exs.a();
            Object f = abju.b().f(d.a);
            akcr.a(f, "talkExperiments.isArroyo…senceTransportType.CHAT }");
            Object f2 = f.f(new c(context2, str2));
            akcr.a(f2, "getPresenceTransportType…NTERVAL_MS)\n            }");
            ajdx a2 = a.b((ajeb) f2).a((ajdw) a.a(handler2, new acbn().callsite("TalkCoreInitialiser"))).a((ajfc) new e(this, context, obj2, talkCoreDelegate, presenceServiceDelegate, logger, metricsReporter, externalVideoService));
            akcr.a((Object) a2, "clientLoader\n           …deoService)\n            }");
            return ajwe.a(a2, (akbl) g.a, (akbl) new f(aVar2));
        } catch (NameNotFoundException unused) {
            obj = ajfq.INSTANCE;
            akcr.a(obj, str3);
            return obj;
        }
    }
}
