package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import defpackage.sii.a;
import defpackage.sii.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sdb */
public class sdb extends sei {
    final List<sdr> a = new ArrayList();
    final ajxe b;
    final ajxe c;
    final Context d;
    final ajwy<sii> e;
    private final ajxe f;

    /* renamed from: sdb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sdb$e */
    static final class e extends akcs implements akbk<ajwo<sdr>> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scv) this.a.get()).b;
        }
    }

    /* renamed from: sdb$h */
    static final class h extends akcs implements akbk<ajwo<sdr>> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scv) this.a.get()).c;
        }
    }

    /* renamed from: sdb$g */
    static final class g extends akcs implements akbk<ajwo<sdr>> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scv) this.a.get()).d;
        }
    }

    /* renamed from: sdb$b */
    static final class b extends akcs implements akbl<sdr, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdr sdr = (sdr) obj;
            akcr.b(sdr, "it");
            return Boolean.valueOf(sdr.c() ^ 1);
        }
    }

    /* renamed from: sdb$d */
    static final class d extends akcs implements akbl<StatusBarNotification, Boolean> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
            akcr.b(statusBarNotification, "it");
            Bundle bundle = statusBarNotification.getNotification().extras;
            if (bundle != null) {
                bundle = bundle.getBundle("system_notification_extras");
                if (!(bundle == null || ser.a(bundle, "should_badge"))) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: sdb$f */
    static final class f<T> implements Predicate<T> {
        private /* synthetic */ sdb a;
        private /* synthetic */ String b;
        private /* synthetic */ boolean c;

        f(sdb sdb, String str, boolean z) {
            this.a = sdb;
            this.b = str;
            this.c = z;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            obj = (sdr) obj;
            if (!akcr.a(obj != null ? obj.c : null, this.b)) {
                return false;
            }
            if (this.c) {
                ((ajwo) this.a.c.b()).a(obj);
            }
            return true;
        }
    }

    /* renamed from: sdb$c */
    static final class c extends akcs implements akbl<sdr, Boolean> {
        private /* synthetic */ String a;

        c(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdr sdr = (sdr) obj;
            akcr.b(sdr, "notificationDisplayModel");
            sdh sdh = sdr.l;
            return Boolean.valueOf(akcr.a(sdh != null ? sdh.a : null, this.a));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(sdb.class), "displayedSystemNotificationSubject", "getDisplayedSystemNotificationSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(sdb.class), "swipeDismissedNotificationSubject", "getSwipeDismissedNotificationSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(sdb.class), "removedNotificationsSubject", "getRemovedNotificationsSubject()Lio/reactivex/subjects/PublishSubject;")};
        a aVar = new a();
    }

    public sdb(Context context, ajwy<sii> ajwy, ajwy<scv> ajwy2) {
        akcr.b(context, "context");
        akcr.b(ajwy, "presenter");
        akcr.b(ajwy2, "notificationObserverLazy");
        this.d = context;
        this.e = ajwy;
        this.b = ajxh.a(new e(ajwy2));
        this.c = ajxh.a(new h(ajwy2));
        this.f = ajxh.a(new g(ajwy2));
    }

    private final ajwo<sdr> b() {
        return (ajwo) this.f.b();
    }

    private final void c() {
        a((akbl) b.a);
    }

    public final ajdx<sdj> a(sdr sdr) {
        String str = "notification";
        akcr.b(sdr, str);
        sii sii = (sii) this.e.get();
        akcr.b(sdr, str);
        Object f = sii.g.b().b((ajdw) sii.c.b()).a((ajfc) new a(sii, sdr)).f(b.a);
        akcr.a(f, "notificationPreferences.….disposableNotification }");
        return f;
    }

    public final List<sdr> a() {
        try {
            Object a = sdc.a(this.a);
            akcr.a(a, "notifications.safeCopy()");
            List<sdr> list = (List) a;
            return list;
        } finally {
            c();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0069 in {8, 14, 15, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(defpackage.akbl<? super defpackage.sdr, java.lang.Boolean> r7) {
        /*
        r6 = this;
        r0 = "predicate";
        defpackage.akcr.b(r7, r0);
        r0 = r6.d;
        r0 = defpackage.seu.a(r0);
        r1 = r6.a;
        monitor-enter(r1);
        r2 = r6.a;	 Catch:{ all -> 0x0066 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0066 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0066 }
        r3.<init>();	 Catch:{ all -> 0x0066 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0066 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0066 }
        r4 = r2.hasNext();	 Catch:{ all -> 0x0066 }
        if (r4 == 0) goto L_0x0037;	 Catch:{ all -> 0x0066 }
        r4 = r2.next();	 Catch:{ all -> 0x0066 }
        r5 = r7.invoke(r4);	 Catch:{ all -> 0x0066 }
        r5 = (java.lang.Boolean) r5;	 Catch:{ all -> 0x0066 }
        r5 = r5.booleanValue();	 Catch:{ all -> 0x0066 }
        if (r5 == 0) goto L_0x001d;	 Catch:{ all -> 0x0066 }
        r3.add(r4);	 Catch:{ all -> 0x0066 }
        goto L_0x001d;	 Catch:{ all -> 0x0066 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0066 }
        r7 = r6.a;	 Catch:{ all -> 0x0066 }
        r2 = r3;	 Catch:{ all -> 0x0066 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0066 }
        r7.removeAll(r2);	 Catch:{ all -> 0x0066 }
        monitor-exit(r1);
        r3 = (java.lang.Iterable) r3;
        r7 = r3.iterator();
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x0065;
        r1 = r7.next();
        r1 = (defpackage.sdr) r1;
        r2 = r1.c;
        r2 = r2.hashCode();
        r0.a(r2);
        r2 = r6.b();
        r2.a(r1);
        goto L_0x0048;
        return;
        r7 = move-exception;
        monitor-exit(r1);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdb.a(akbl):void");
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            seu.a(this.d).a(str.hashCode());
            synchronized (this.a) {
                Iterables.removeIf(this.a, new f(this, str, z));
            }
        }
    }
}
