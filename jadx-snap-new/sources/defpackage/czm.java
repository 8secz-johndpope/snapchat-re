package defpackage;

import android.app.Activity;
import android.content.Context;
import com.brightcove.player.event.Event;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: czm */
public final class czm extends zgi {
    final ajei a = new ajei();
    final Activity b;
    final ajdx<dib> c;
    final ajdw d;
    final Context e;
    final czk f;
    final gvp g;

    /* renamed from: czm$b */
    public static final class b extends ajvg<dib> {
        private /* synthetic */ czm a;

        b(czm czm) {
            this.a = czm;
        }

        public final void a() {
            this.a.a.a((ajej) this);
        }

        public final void a(Throwable th) {
            akcr.b(th, "e");
            this.a.a.b(this);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:78:0x01c3 in {2, 7, 10, 17, 26, 28, 29, 30, 31, 33, 34, 37, 41, 42, 46, 49, 50, 56, 57, 58, 65, 68, 70, 75, 77} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ void b_(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.dib) r9;
            r0 = "logger";
            defpackage.akcr.b(r9, r0);
            r0 = r8.a;
            r0 = r0.e;
            r1 = r8.a;
            r2 = r1.b;
            r2 = r2.getIntent();
            r3 = 0;
            if (r2 != 0) goto L_0x0018;
            r1 = r3;
            goto L_0x0031;
            r2 = r2.getData();
            if (r2 == 0) goto L_0x0016;
            r1 = r1.g;
            r1 = r1.a(r2);
            r4 = r1 instanceof defpackage.czl;
            if (r4 != 0) goto L_0x0029;
            r1 = r3;
            r1 = (defpackage.czl) r1;
            if (r1 == 0) goto L_0x0016;
            r1 = r1.b(r2);
            r9.a(r0, r1);
            r9 = r8.a;
            r9 = r9.f;
            r0 = r9.k;
            r0 = r0.a();
            r2 = new aaaf;
            r2.<init>();
            r4 = (double) r0;
            r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
            java.lang.Double.isNaN(r4);
            r4 = r4 / r6;
            r4 = java.lang.Double.valueOf(r4);
            r2.a(r4);
            r4 = r9.n;
            r4 = r4.a();
            r2.e(r4);
            r4 = r9.f;
            r4 = r4.b();
            r4 = (android.content.SharedPreferences) r4;
            r4 = r4.edit();
            r5 = "com.snapchat.android.analytics.framework.openClientTs";
            r0 = r4.putLong(r5, r0);
            r0.apply();
            r0 = defpackage.aatl.NORMAL;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r9.i;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r1.a();	 Catch:{ IllegalArgumentException -> 0x0182 }
            r4 = 0;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x00d3;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r9.h;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r1.getIntent();	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 != 0) goto L_0x0086;	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x00cd;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = defpackage.gvl.a.a(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r5 == 0) goto L_0x00cd;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = "fromServerNotification";	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r1.getBooleanExtra(r5, r4);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r5 == 0) goto L_0x00cd;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = "type";	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r1.getStringExtra(r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r5 == 0) goto L_0x00b7;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r6 = java.util.Locale.ENGLISH;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r7 = "Locale.ENGLISH";	 Catch:{ IllegalArgumentException -> 0x0182 }
            defpackage.akcr.a(r6, r7);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r5 == 0) goto L_0x00af;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r5.toLowerCase(r6);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r6 = "(this as java.lang.String).toLowerCase(locale)";	 Catch:{ IllegalArgumentException -> 0x0182 }
            defpackage.akcr.a(r5, r6);	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x00b8;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = new ajxt;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = "null cannot be cast to non-null type java.lang.String";	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r3;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.a(r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = "notificationId";	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r1.getStringExtra(r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.b(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r9.o;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = defpackage.aaat.NOTIFICATION;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1.a(r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = 1;	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x00ce;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = 0;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x00d5;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = defpackage.aatl.NOTIFY;	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x00d5;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = defpackage.aatl.LOGGED_OUT;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.a(r0);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = "event";	 Catch:{ IllegalArgumentException -> 0x0182 }
            defpackage.akcr.b(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r9.p;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r0.get();	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = (com.snap.framework.channel.ChannelInfoStore) r0;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.d(r0);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r9.h;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r0.getIntent();	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r0 != 0) goto L_0x00f6;	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x0196;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = defpackage.gvl.a.a(r0);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x0196;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r0 == 0) goto L_0x0103;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r0.getData();	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x0104;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r3;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r0 == 0) goto L_0x011a;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r9.j;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r1.a(r0);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r1 instanceof defpackage.czl;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r5 != 0) goto L_0x0111;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r3;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = (defpackage.czl) r1;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x011a;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r1.a(r0);	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x011b;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r3;	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x0196;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = defpackage.abbd.EXTERNAL;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.a(r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.a(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r0 == 0) goto L_0x013f;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r9.a;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r0.getQueryParameter(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r9.b;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r0.getQueryParameter(r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r6 = r1;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r6 = (java.lang.CharSequence) r6;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r6 != 0) goto L_0x013d;	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x0140;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r5;	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x0140;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r3;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.setReferrer(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r0 == 0) goto L_0x0177;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r0.getScheme();	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x0163;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r0.getScheme();	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = "deepLinkUri.scheme";	 Catch:{ IllegalArgumentException -> 0x0182 }
            defpackage.akcr.a(r1, r5);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r5 = r9.c;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = defpackage.akgb.b(r1, r5, r4);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x0163;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r9.e;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r3 = r0.getQueryParameter(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x0177;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = r0.getScheme();	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = (java.lang.CharSequence) r1;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r4 = r9.d;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r4 = (java.lang.CharSequence) r4;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = android.text.TextUtils.equals(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0182 }
            if (r1 == 0) goto L_0x0177;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r3 = r0.getPath();	 Catch:{ IllegalArgumentException -> 0x0182 }
            r2.c(r3);	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0 = r9.o;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r1 = defpackage.aaat.DEEPLINK;	 Catch:{ IllegalArgumentException -> 0x0182 }
            r0.a(r1);	 Catch:{ IllegalArgumentException -> 0x0182 }
            goto L_0x0196;
            r0 = move-exception;
            r1 = r9.m;
            r3 = defpackage.ino.APP_OPEN_NOTIF_EXCEPTION;
            r3 = (defpackage.ily) r3;
            r4 = 1;
            r1.c(r3, r4);
            r1 = r9.l;
            r1 = r1.l();
            if (r1 != 0) goto L_0x01c0;
            r0 = r9.g;
            r1 = r2;
            r1 = (defpackage.aajt) r1;
            r0.a(r1);
            r0 = r9.o;
            r1 = r2.a();
            r2 = "appApplicationOpen.appOpenTs";
            defpackage.akcr.a(r1, r2);
            r1 = r1.doubleValue();
            r0.a(r1);
            r9 = r9.o;
            r9.a();
            r9 = r8.a;
            r9 = r9.a;
            r0 = r8;
            r0 = (defpackage.ajej) r0;
            r9.b(r0);
            return;
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.czm$b.b_(java.lang.Object):void");
        }
    }

    /* renamed from: czm$a */
    static final class a implements ajev {
        private /* synthetic */ czm a;

        a(czm czm) {
            this.a = czm;
        }

        public final void run() {
            czm czm = this.a;
            czm.c.b(czm.d).c((ajdz) new c(czm));
        }
    }

    /* renamed from: czm$c */
    public static final class c extends ajvg<dib> {
        private /* synthetic */ czm a;

        c(czm czm) {
            this.a = czm;
        }

        public final void a() {
            this.a.a.a((ajej) this);
        }

        public final void a(Throwable th) {
            akcr.b(th, "e");
            this.a.a.b(this);
        }

        public final /* synthetic */ void b_(Object obj) {
            dib dib = (dib) obj;
            akcr.b(dib, "logger");
            dib.a(false);
            dib.a();
            this.a.a.b(this);
        }
    }

    public czm(Activity activity, ajdx<dib> ajdx, ajdw ajdw, Context context, zgk<b> zgk, czk czk, gvp gvp) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajdx, "blizzardEventLogger");
        akcr.b(ajdw, "scheduler");
        akcr.b(context, "context");
        akcr.b(zgk, "taskScoper");
        akcr.b(czk, "appApplicationOpenReporter");
        akcr.b(gvp, "deepLinkUiMatcher");
        super(zgk);
        this.b = activity;
        this.c = ajdx;
        this.d = ajdw;
        this.e = context;
        this.f = czk;
        this.g = gvp;
    }

    public final ajej a() {
        this.c.b(this.d).c((ajdz) new b(this));
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction { onPause() }");
        return a;
    }
}
