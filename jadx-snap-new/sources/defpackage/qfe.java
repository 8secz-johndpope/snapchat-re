// Related to screenshot stuff

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.ChatAttachmentsModel;
import com.snap.core.db.record.MessageRecord.WithFriend;
import com.snap.core.model.FriendMessageRecipient;
import com.snap.framework.developer.BuildConfigInfo;
import com.snap.messaging.chat.ui.view.VideoCapableThumbnailView;
import com.snapchat.android.R;
import com.snapchat.maps.api.locationsharing.LocationRequestHttpInterface;
import defpackage.acly.f;
import defpackage.gyz.b;
import defpackage.rfu.c;
import defpackage.rfu.g;
import defpackage.rfu.h;
import defpackage.rgm.o;
import defpackage.rgm.p;
import defpackage.wzx.a;
import defpackage.yoj.d;
import defpackage.zpq.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: qfe */
public final class qfe implements ajej {
    private static /* synthetic */ aken[] m = new aken[]{new akdc(akde.a(qfe.class), "contextWeak", "getContextWeak()Landroid/content/Context;"), new akdc(akde.a(qfe.class), "screenshotWatchman", "getScreenshotWatchman()Lcom/snap/core/screenshot/ScreenshotWatchman;"), new akdc(akde.a(qfe.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(qfe.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(qfe.class), "shazamOperaLauncher", "getShazamOperaLauncher()Lcom/snap/shazam/ui/opera/ShazamOperaLauncher;"), new akdc(akde.a(qfe.class), "contextCardsAnalyticsPlugin", "getContextCardsAnalyticsPlugin()Lcom/snap/contextcards/api/opera/analytics/DefaultContextCardsAnalyticsPlugin;"), new akdc(akde.a(qfe.class), "friendActionDispatcher", "getFriendActionDispatcher()Lcom/snap/identity/api/FriendActionDispatchInterface;")};
    private final ajdx<qvd> A;
    private final sku B;
    private final rgm C;
    private final BuildConfigInfo D;
    private final pqg E;
    private final ajwy<goz> F;
    private final gwb G;
    private final ajwy<fvh> H;
    private final ajwy<qwk> I;
    private final qpb J;
    private final kky K;
    private final kky L;
    private final ajdx<e> M;
    private final ajwy<ihm> N;
    private final ajwy<sml> O;
    private final aipn<hbc> P;
    private final ajwy<gvl> Q;
    private final LocationRequestHttpInterface R;
    private final ajwy<yid> S;
    private final ajwy<ylh> T;
    private final achb<zjm, zjk> U;
    private final acly V;
    private final ajwy<ilv> W;
    private final ajwy<eya> X;
    private final ajwy<ftl> Y;
    private final ajwy<kgv> Z;
    public final ajwl<qks> a;
    private final ajwy<wne> aa;
    public final ajwl<qli> b;
    public pqh c;
    final gqr d;
    final ziw e;
    final sso f;
    final qwi g;
    final psm h;
    final qft i;
    final ajwy<exz> j;
    final ajwy<wzx> k;
    final ajwy<iqs> l;
    private final zjm n = pql.a;
    private final ajei o = new ajei();
    private final slh p = new slh();
    private final iim q;
    private final ajxe r;
    private final zfw s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final abkq y;
    private final ajdx<prx> z;

    /* renamed from: qfe$aa */
    static final class aa<T> implements ajfb<Throwable> {
        public static final aa a = new aa();

        aa() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qfe$ac */
    static final class ac<T> implements ajfb<a> {
        public static final ac a = new ac();

        ac() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qfe$ae */
    static final class ae implements ajev {
        public static final ae a = new ae();

        ae() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$ag */
    static final class ag implements ajev {
        public static final ag a = new ag();

        ag() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$ai */
    static final class ai<T> implements ajfb<qgh> {
        private /* synthetic */ qfe a;

        ai(qfe qfe) {
            this.a = qfe;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (qgh) obj;
            qfe qfe = this.a;
            akcr.a(obj, "it");
            qfe.onChatDiscoverMediaEvent(obj);
        }
    }

    /* renamed from: qfe$aj */
    static final class aj<T> implements ajwy<gqr> {
        private /* synthetic */ qfe a;
        private /* synthetic */ long b;
        private /* synthetic */ List c;
        private /* synthetic */ boolean d;
        private /* synthetic */ View e;

        aj(qfe qfe, long j, List list, boolean z, View view) {
            this.a = qfe;
            this.b = j;
            this.c = list;
            this.d = z;
            this.e = view;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return this.a.d;
        }
    }

    /* renamed from: qfe$ak */
    static final class ak implements ajev {
        public static final ak a = new ak();

        ak() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$am */
    static final class am<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final am a = new am();

        am() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
            akcr.b(linkedHashSet, "it");
            return linkedHashSet;
        }
    }

    /* renamed from: qfe$an */
    static final class an<T, R> implements ajfc<String, ajdb> {
        private /* synthetic */ qfe a;
        private /* synthetic */ qks b;

        an(qfe qfe, qks qks) {
            this.a = qfe;
            this.b = qks;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "retryableMessageId");
            return this.a.h.b(str, this.b.e.feedKey());
        }
    }

    /* renamed from: qfe$ao */
    static final class ao implements ajev {
        private /* synthetic */ qfe a;
        private /* synthetic */ qks b;

        ao(qfe qfe, qks qks) {
            this.a = qfe;
            this.b = qks;
        }

        public final void run() {
            qft qft = this.a.i;
            Long l = this.b.b;
            if (l != null) {
                qft.a.remove(Long.valueOf(l.longValue()));
            }
        }
    }

    /* renamed from: qfe$ap */
    static final class ap<T> implements ajfb<Throwable> {
        private /* synthetic */ qfe a;
        private /* synthetic */ qks b;

        ap(qfe qfe, qks qks) {
            this.a = qfe;
            this.b = qks;
        }

        public final /* synthetic */ void accept(Object obj) {
            Context a = this.a.a();
            if (a != null) {
                Toast.makeText(a, "Error retrying message. Please Shake :(", 1).show();
            }
        }
    }

    /* renamed from: qfe$e */
    static final class e implements ajev {
        public static final e a = new e();

        e() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return new b(l.longValue(), FeatureType.CHAT, null, false, null, 60);
        }
    }

    /* renamed from: qfe$h */
    static final class h<T, R> implements ajfc<b, ajdb> {
        private /* synthetic */ qfe a;
        private /* synthetic */ sti b;
        private /* synthetic */ sks c;

        h(qfe qfe, sti sti, sks sks) {
            this.a = qfe;
            this.b = sti;
            this.c = sks;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return this.a.f.a((smi) bVar, this.b, (ssi) this.c, new stl());
        }
    }

    /* renamed from: qfe$i */
    static final class i implements ajev {
        public static final i a = new i();

        i() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$k */
    static final class k implements ajev {
        public static final k a = new k();

        k() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$m */
    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ long a;

        m(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "api");
            return prx.f(this.a);
        }
    }

    /* renamed from: qfe$n */
    static final class n<T> implements ajfb<List<? extends psf>> {
        private /* synthetic */ qfe a;
        private /* synthetic */ long b;
        private /* synthetic */ qgi c;
        private /* synthetic */ long d;

        n(qfe qfe, long j, qgi qgi, long j2) {
            this.a = qfe;
            this.b = j;
            this.c = qgi;
            this.d = j2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0090 in {5, 7, 10, 11, 14, 16} preds:[]
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
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (java.util.List) r11;
            r0 = "it";
            defpackage.akcr.a(r11, r0);
            r0 = r11;
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
            r2 = r0.hasNext();
            r3 = 0;
            r4 = 1;
            if (r2 == 0) goto L_0x0033;
            r2 = r0.next();
            r5 = r2;
            r5 = (defpackage.psf) r5;
            r5 = r5.m;
            r7 = r10.b;
            r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r9 != 0) goto L_0x002d;
            r3 = 1;
            if (r3 == 0) goto L_0x0015;
            r1.add(r2);
            goto L_0x0015;
            r5 = r1;
            r5 = (java.util.List) r5;
            r0 = r5.size();
            if (r0 != r4) goto L_0x003d;
            goto L_0x003e;
            r4 = 0;
            if (r4 == 0) goto L_0x005c;
            r11 = r5.get(r3);
            r11 = (defpackage.psf) r11;
            r0 = r10.a;
            r0 = r0.g;
            r1 = r11.p;
            r0.a(r1, r11);
            r4 = r10.a;
            r11 = r10.c;
            r6 = r11.b;
            r7 = r10.d;
            r9 = 0;
            r4.a(r5, r6, r7, r9);
            return;
            r0 = new java.lang.StringBuilder;
            r1 = "playableSnapList expected to be size 1 but is ";
            r0.<init>(r1);
            r1 = r5.size();
            r0.append(r1);
            r1 = ". pendingSnapsForFeed: ";
            r0.append(r1);
            r11 = r11.size();
            r0.append(r11);
            r11 = " messageId: ";
            r0.append(r11);
            r1 = r10.b;
            r0.append(r1);
            r11 = r0.toString();
            r0 = new java.lang.IllegalStateException;
            r11 = r11.toString();
            r0.<init>(r11);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qfe$n.accept(java.lang.Object):void");
        }
    }

    /* renamed from: qfe$p */
    static final class p implements ajev {
        public static final p a = new p();

        p() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$r */
    static final class r implements ajev {
        public static final r a = new r();

        r() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$v */
    static final class v implements ajev {
        public static final v a = new v();

        v() {
        }

        public final void run() {
        }
    }

    /* renamed from: qfe$w */
    static final class w<T> implements ajfb<Throwable> {
        private /* synthetic */ qfe a;
        private /* synthetic */ qgp b;

        w(qfe qfe, qgp qgp) {
            this.a = qfe;
            this.b = qgp;
        }

        public final /* synthetic */ void accept(Object obj) {
            qfe qfe = this.a;
            String str = this.b.c;
            Context a = qfe.a();
            if (a != null) {
                ((exz) qfe.j.get()).a(a, a.getResources().getString(R.string.cognac_fail_to_launch_app, new Object[]{str}), a.getResources().getString(R.string.no_internet_connection), eym.a);
            }
        }
    }

    /* renamed from: qfe$x */
    static final class x<T> implements ajfb<sat<Object>> {
        public static final x a = new x();

        x() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qfe$y */
    static final class y<T> implements ajfb<Throwable> {
        public static final y a = new y();

        y() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qfe$z */
    static final class z<T> implements ajfb<String> {
        public static final z a = new z();

        z() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: qfe$a */
    static final class a extends akcs implements akbk<jwa> {
        private /* synthetic */ jwb a;

        a(jwb jwb) {
            this.a = jwb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(pql.j);
        }
    }

    /* renamed from: qfe$ab */
    static final class ab extends akcs implements akbl<sti.a, ajxw> {
        private /* synthetic */ View a;
        private /* synthetic */ qks b;

        ab(View view, qks qks) {
            this.a = view;
            this.b = qks;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sti.a aVar = (sti.a) obj;
            akcr.b(aVar, "it");
            aVar.c = new srk(this.a, sqx.ROUNDED_RECTANGLE);
            aVar.d = String.valueOf(this.b.getId());
            aVar.p = aahb.CHAT;
            return ajxw.a;
        }
    }

    /* renamed from: qfe$ar */
    static final class ar extends akcs implements akbk<wzx> {
        private /* synthetic */ qfe a;

        ar(qfe qfe) {
            this.a = qfe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (wzx) this.a.k.get();
        }
    }

    /* renamed from: qfe$b */
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

    /* renamed from: qfe$c */
    static final class c extends akcs implements akbk<fvk> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new fvk();
        }
    }

    /* renamed from: qfe$d */
    static final class d extends akcs implements akbk<iqs> {
        private /* synthetic */ qfe a;

        d(qfe qfe) {
            this.a = qfe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iqs) this.a.l.get();
        }
    }

    /* renamed from: qfe$t */
    static final class t extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ qgm a;
        private /* synthetic */ Context b;

        t(qgm qgm, Context context) {
            this.a = qgm;
            this.b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.a.b)));
            return ajxw.a;
        }
    }

    /* renamed from: qfe$u */
    static final class u extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ Context a;
        private /* synthetic */ qgm b;

        u(Context context, qgm qgm) {
            this.a = context;
            this.b = qgm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            iep.b(this.a, this.b.b);
            return ajxw.a;
        }
    }

    /* renamed from: qfe$ad */
    static final class ad extends akcq implements akbl<Throwable, ajxw> {
        ad(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$af */
    static final class af extends akcq implements akbl<Throwable, ajxw> {
        af(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$ah */
    static final class ah extends akcq implements akbl<Throwable, ajxw> {
        ah(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$al */
    static final class al extends akcq implements akbl<Throwable, ajxw> {
        al(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$aq */
    static final class aq extends akcq implements akbk<goz> {
        aq(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (goz) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: qfe$f */
    static final class f extends akcq implements akbl<Throwable, ajxw> {
        f(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$j */
    static final class j extends akcq implements akbl<Throwable, ajxw> {
        j(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$l */
    static final class l extends akcq implements akbl<Throwable, ajxw> {
        l(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$o */
    static final class o extends akcq implements akbl<Throwable, ajxw> {
        o(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onSnapDownloadError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onSnapDownloadError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            return ajxw.a;
        }
    }

    /* renamed from: qfe$q */
    static final class q extends akcq implements akbl<Throwable, ajxw> {
        q(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    /* renamed from: qfe$s */
    static final class s extends akcq implements akbl<Throwable, ajxw> {
        s(qfe qfe) {
            super(1, qfe);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(qfe.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((qfe) this.receiver).e.b();
            return ajxw.a;
        }
    }

    public qfe(gqr gqr, Context context, zgb zgb, jwb jwb, jwe jwe, abkq abkq, ziw ziw, ajdx<prx> ajdx, ajdx<qvd> ajdx2, sku sku, sso sso, qwi qwi, rgm rgm, BuildConfigInfo buildConfigInfo, pqg pqg, psm psm, qft qft, ajwy<goz> ajwy, gwb gwb, ajwy<fvh> ajwy2, ajwy<qwk> ajwy3, qpb qpb, kky kky, kky kky2, ajdx<e> ajdx3, ajwy<ihm> ajwy4, ajwy<sml> ajwy5, aipn<hbc> aipn, ajwy<gvl> ajwy6, LocationRequestHttpInterface locationRequestHttpInterface, ajwy<yid> ajwy7, ajwy<ylh> ajwy8, achb<zjm, zjk> achb, acly acly, ajwy<ilv> ajwy9, ajwy<eya> ajwy10, ajwy<exz> ajwy11, ajwy<wzx> ajwy12, ajwy<iqs> ajwy13, ajwy<ftl> ajwy14, ajwy<kgv> ajwy15, ajwy<wne> ajwy16) {
        gqr gqr2 = gqr;
        Context context2 = context;
        jwb jwb2 = jwb;
        jwe jwe2 = jwe;
        abkq abkq2 = abkq;
        ziw ziw2 = ziw;
        ajdx<prx> ajdx4 = ajdx;
        ajdx<qvd> ajdx5 = ajdx2;
        sku sku2 = sku;
        sso sso2 = sso;
        qwi qwi2 = qwi;
        rgm rgm2 = rgm;
        BuildConfigInfo buildConfigInfo2 = buildConfigInfo;
        pqg pqg2 = pqg;
        psm psm2 = psm;
        qft qft2 = qft;
        akcr.b(gqr2, "exceptionTracker");
        akcr.b(context2, "contextStrong");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(jwb2, "bitmapFactoryProvider");
        akcr.b(jwe2, "bitmapLoaderFactory");
        akcr.b(abkq2, "userSession");
        akcr.b(ziw2, "guardClick");
        akcr.b(ajdx4, "messagingApi");
        akcr.b(ajdx5, "messagingRepositorySingle");
        akcr.b(sku2, "playbackPerformanceAnalytics");
        akcr.b(sso2, "operaLauncher");
        akcr.b(qwi2, "feedViewingSessionManager");
        akcr.b(rgm2, "mediaPrefetcher");
        akcr.b(buildConfigInfo2, "buildConfigInfo");
        akcr.b(pqg2, "chatCommands");
        akcr.b(psm2, "sendMessageApi");
        akcr.b(qft, "failedMessageBlocks");
        ajwy<goz> ajwy17 = ajwy;
        akcr.b(ajwy17, "screenshotWatchmanProvider");
        gwb gwb2 = gwb;
        akcr.b(gwb2, "dynamicStorySnapMediaRepository");
        akcr.b(ajwy2, "contextCardsLayerControllerPlugin");
        akcr.b(ajwy3, "friendsFeedSharedDataStore");
        akcr.b(qpb, "receivedSnapMetricsController");
        akcr.b(kky, "chatMediaInAppReportClient");
        akcr.b(kky2, "snapInAppReportClient");
        akcr.b(ajdx3, "trackNetClient");
        akcr.b(ajwy4, "stopwatch");
        akcr.b(ajwy5, "snappableOperaPluginProvider");
        akcr.b(aipn, "remoteVideoPropertiesProvider");
        akcr.b(ajwy6, "deepLinkDispatcherProvider");
        akcr.b(locationRequestHttpInterface, "locationRequestHttpInterface");
        akcr.b(ajwy7, "storyRepositoryProvider");
        akcr.b(ajwy8, "storySnapsSeenDataStoreProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(acly, "mapLocationShareMessageAnalytics");
        akcr.b(ajwy9, "grapheneProvider");
        akcr.b(ajwy10, "cognacAppListService");
        akcr.b(ajwy11, "cognacAlertService");
        akcr.b(ajwy12, "shazamOperaLauncherProvider");
        akcr.b(ajwy13, "friendActionDispatcherProvider");
        akcr.b(ajwy14, "configProvider");
        akcr.b(ajwy15, "publicProfileLauncher");
        akcr.b(ajwy16, "serengetiStoryManifestPlayer");
        qft qft3 = qft;
        this.d = gqr2;
        this.y = abkq2;
        this.e = ziw2;
        this.z = ajdx4;
        this.A = ajdx5;
        this.B = sku2;
        this.f = sso2;
        this.g = qwi2;
        this.C = rgm2;
        this.D = buildConfigInfo2;
        this.E = pqg2;
        this.h = psm2;
        this.i = qft3;
        this.F = ajwy17;
        this.G = gwb2;
        ajwy<qwk> ajwy18 = ajwy3;
        this.H = ajwy2;
        this.I = ajwy18;
        kky kky3 = kky;
        this.J = qpb;
        this.K = kky3;
        ajdx<e> ajdx6 = ajdx3;
        this.L = kky2;
        this.M = ajdx6;
        ajwy<sml> ajwy19 = ajwy5;
        this.N = ajwy4;
        this.O = ajwy19;
        ajwy<gvl> ajwy20 = ajwy6;
        this.P = aipn;
        this.Q = ajwy20;
        ajwy<yid> ajwy21 = ajwy7;
        this.R = locationRequestHttpInterface;
        this.S = ajwy21;
        achb<zjm, zjk> achb2 = achb;
        this.T = ajwy8;
        this.U = achb2;
        ajwy<ilv> ajwy22 = ajwy9;
        this.V = acly;
        this.W = ajwy22;
        ajwy<exz> ajwy23 = ajwy11;
        this.X = ajwy10;
        this.j = ajwy23;
        ajwy<iqs> ajwy24 = ajwy13;
        this.k = ajwy12;
        this.l = ajwy24;
        ajwy<kgv> ajwy25 = ajwy15;
        this.Y = ajwy14;
        this.Z = ajwy25;
        this.aa = ajwy16;
        this.q = new iim(context);
        this.r = ajxh.a(new aq(this.F));
        this.s = zgb.a(pql.j.callsite("ChatEventDispatcher"));
        this.t = ajxh.a(new a(jwb));
        this.u = ajxh.a(new b(jwe));
        this.v = ajxh.a(new ar(this));
        this.w = ajxh.a(c.a);
        this.x = ajxh.a(new d(this));
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<ChatItemViewModel>()");
        this.a = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<BaseDateHeaderViewModel>()");
        this.b = ajwl;
    }

    private static gcp a(qks qks, int i) {
        return qks instanceof qls ? gcp.a.a(((prm) ((qls) qks).j.i.a.get(i)).b) : qks.h();
    }

    private static sqx a(gcp gcp) {
        return (gcp == null || !gcp.isSpectacles) ? sqx.CENTER_CROP_RECTANGLE : sqx.SPECS_CIRCLE;
    }

    private final void a(String str, qgc qgc, View view) {
        if (qgc != null && !akcr.a((Object) qgc, qfs.d) && !this.e.a()) {
            long b = this.B.b();
            long c = this.B.c();
            Context a = a();
            if (a != null) {
                sks sks = new sks(this.B, aaug.TAP, b, c, new psa(aahb.CHAT, aajy.CHAT, aajz.USER_STORY, null));
                Set a2 = ajzs.a(new sny());
                slg slg = new slg(a, this.p);
                slg.a(sqx.CIRCLE);
                sti.a aVar = new sti.a(a2, slg, this.s, c(), d(), this.n.d.b);
                aVar.c = new srk(view, sqx.CIRCLE);
                aVar.d = str;
                aVar.e = true;
                aVar.b = new skv(a, this.n.d.b, aVar.t, aVar.u);
                aVar.p = aahb.CHAT;
                ajej a3 = this.G.a(str, FeatureType.CHAT).f(g.a).e((ajfc) new h(this, aVar.a(), sks)).a((ajev) i.a, (ajfb) new qfh(new j(this)));
                akcr.a((Object) a3, "dynamicStorySnapMediaRep…({}, this::onLaunchError)");
                ajvv.a(a3, this.o);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0108  */
    private final void a(defpackage.qgi r13) {
        /*
        r12 = this;
        r0 = r13.a;
        r1 = r12.B;
        r5 = r1.b();
        r1 = r12.B;
        r7 = r1.c();
        r1 = r12.e;
        r1 = r1.a();
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        return;
    L_0x0017:
        r1 = r12.a();
        if (r1 != 0) goto L_0x001e;
    L_0x001d:
        return;
    L_0x001e:
        r2 = new psa;
        r3 = defpackage.aahb.CHAT;
        r4 = defpackage.aajy.CHAT;
        r9 = defpackage.aajz.DIRECT_CHAT_SNAP;
        r10 = 0;
        r2.<init>(r3, r4, r9, r10);
        r11 = new sks;
        r3 = r12.B;
        r4 = defpackage.aaug.TAP;
        r9 = r2;
        r9 = (defpackage.skr) r9;
        r2 = r11;
        r2.<init>(r3, r4, r5, r7, r9);
        r2 = defpackage.ajyy.a;
        r4 = r2;
        r4 = (java.util.Set) r4;
        r5 = new slg;
        r2 = r12.p;
        r2 = (defpackage.slp) r2;
        r5.<init>(r1, r2);
        r1 = defpackage.sqx.CENTER_CROP_RECTANGLE;
        r5.a(r1);
        r6 = r12.s;
        r7 = r12.c();
        r8 = r12.d();
        r1 = r12.n;
        r1 = r1.d;
        r9 = r1.b;
        r1 = new sti$a;
        r3 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9);
        r2 = new srk;
        r13 = r13.b;
        r3 = defpackage.sqx.CENTER_CROP_RECTANGLE;
        r2.<init>(r13, r3);
        r2 = (defpackage.sri) r2;
        r1.c = r2;
        r2 = r0.getId();
        r13 = java.lang.String.valueOf(r2);
        r1.d = r13;
        r13 = defpackage.aahb.CHAT;
        r1.p = r13;
        r13 = r1.a();
        r1 = r0 instanceof defpackage.qmb;
        if (r1 == 0) goto L_0x00ae;
    L_0x0083:
        r1 = r0;
        r1 = (defpackage.qmb) r1;
        r2 = r1.l;
        if (r2 == 0) goto L_0x00ae;
    L_0x008a:
        r2 = r1.l;
        r3 = defpackage.qfs.d;
        r2 = defpackage.akcr.a(r2, r3);
        r2 = r2 ^ 1;
        if (r2 == 0) goto L_0x00ae;
    L_0x0096:
        r2 = r1.l;
        r2 = r2.c;
        if (r2 == 0) goto L_0x00ae;
    L_0x009c:
        r0 = new rfu$d;
        r2 = r1.getId();
        r4 = r1.j;
        r1 = r1.l;
        r1 = r1.c;
        r1 = r1.b;
        r0.<init>(r2, r4, r1);
        goto L_0x00d6;
    L_0x00ae:
        r1 = r0 instanceof defpackage.qlx;
        if (r1 == 0) goto L_0x00db;
    L_0x00b2:
        r1 = r0;
        r1 = (defpackage.qlx) r1;
        r2 = r1.k;
        if (r2 == 0) goto L_0x00db;
    L_0x00b9:
        r2 = r1.k;
        r3 = defpackage.qfs.c;
        r2 = defpackage.akcr.a(r2, r3);
        r2 = r2 ^ 1;
        if (r2 == 0) goto L_0x00db;
    L_0x00c5:
        r0 = new rfu$d;
        r2 = r1.getId();
        r4 = r1.i;
        r1 = r1.k;
        r1 = r1.b;
        r1 = r1.b;
        r0.<init>(r2, r4, r1);
    L_0x00d6:
        r10 = defpackage.ajyl.a(r0);
        goto L_0x0106;
    L_0x00db:
        r1 = r0 instanceof defpackage.qlu;
        if (r1 == 0) goto L_0x0106;
    L_0x00df:
        r0 = (defpackage.qlu) r0;
        r1 = r0.o;
        if (r1 == 0) goto L_0x0106;
    L_0x00e5:
        r1 = r0.o;
        r2 = defpackage.qfs.e;
        r1 = defpackage.akcr.a(r1, r2);
        r1 = r1 ^ 1;
        if (r1 == 0) goto L_0x0106;
    L_0x00f1:
        r1 = new rfu$d;
        r2 = r0.getId();
        r4 = r0.j;
        r0 = r0.o;
        r0 = r0.c;
        r0 = r0.b;
        r1.<init>(r2, r4, r0);
        r10 = defpackage.ajyl.a(r1);
    L_0x0106:
        if (r10 == 0) goto L_0x0134;
    L_0x0108:
        r0 = r12.f;
        r1 = 0;
        r11 = (defpackage.ssi) r11;
        r13 = r0.a(r10, r13, r1, r11, new defpackage.stl());
        r0 = defpackage.qfe.k.a;
        r0 = (defpackage.ajev) r0;
        r1 = new qfe$l;
        r2 = r12;
        r2 = (defpackage.qfe) r2;
        r1.<init>(r2);
        r1 = (defpackage.akbl) r1;
        r2 = new qfg;
        r2.<init>(r1);
        r2 = (defpackage.ajfb) r2;
        r13 = r13.a(r0, r2);
        r0 = "operaLauncher.launch(gro…({}, this::onLaunchError)";
        defpackage.akcr.a(r13, r0);
        r0 = r12.o;
        defpackage.ajvv.a(r13, r0);
    L_0x0134:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfe.a(qgi):void");
    }

    private final void a(qks qks) {
        pqh pqh = this.c;
        if (pqh != null) {
            String key = qks.e.key();
            akcr.a((Object) key, "model.data.key()");
            MessageClientStatus clientStatus = qks.e.clientStatus();
            if (clientStatus != null) {
                int i = qff.g[clientStatus.ordinal()];
                if (i == 1 || i == 2) {
                    this.E.a(pqh, key, qfe.b(qks) ^ 1);
                }
            }
        }
    }

    private final void a(qks qks, View view, int i, int i2) {
        qks qks2 = qks;
        int i3 = i;
        int i4 = i2;
        long b = this.B.b();
        long c = this.B.c();
        Context a = a();
        if (a != null) {
            if (view.getId() == R.id.chat_message_content_container) {
                a(qks);
            } else if (!this.e.a()) {
                List a2;
                sks sks = new sks(this.B, aaug.TAP, b, c, new psa(aahb.CHAT, aajy.CHAT, aajz.DIRECT_CHAT_SNAP, null));
                WithFriend withFriend = qks2.e;
                Object a3 = szw.a(kku.a.a, withFriend.key(), kku.a.b, Long.valueOf(withFriend.timestamp()), kku.a.c, withFriend.senderUsername());
                akcr.a(a3, "Params.of(\n             …enderUsername()\n        )");
                smm[] smmArr = new smm[3];
                pqh pqh = this.c;
                if (pqh == null) {
                    akcr.a();
                }
                Object b2 = b();
                akcr.a(b2, "screenshotWatchman");
                int i5 = 0;
                smmArr[0] = new rfj(pqh, b2, this.E, this.s);
                smmArr[1] = new snr();
                smmArr[2] = new kkl(this.K, a3);
                Set a4 = ajzt.a((Object[]) smmArr);
                slg slg = new slg(a, this.p);
                slg.a(qfe.a(qfe.a(qks2, i3)));
                sti.a aVar = new sti.a(a4, slg, this.s, c(), d(), this.n.d.b);
                aVar.c = new srk(view, qfe.a(qfe.a(qks2, i3)));
                aVar.d = String.valueOf(qks.getId());
                aVar.g = (sjl) this.P.get();
                aVar.p = aahb.CHAT;
                if (qks2 instanceof qlz) {
                    aVar.e = true;
                    a2 = ajyl.a(new h(((qlz) qks2).getId()));
                } else {
                    aVar.e = false;
                    ArrayList arrayList = new ArrayList(i4);
                    while (i5 < i4) {
                        arrayList.add(new rfu.b(qks.getId(), i5, i4 > 1 ? aesq.BATCHED_MEDIA.a() : qks2.e.type()));
                        i5++;
                    }
                    a2 = arrayList;
                }
                ajej a5 = this.f.a(a2, aVar.a(), i3, (ssi) sks, new stl()).a((ajev) ae.a, (ajfb) new qfh(new af(this)));
                akcr.a((Object) a5, "operaLauncher.launch(ope…({}, this::onLaunchError)");
                ajvv.a(a5, this.o);
            }
        }
    }

    private final goz b() {
        return (goz) this.r.b();
    }

    private static boolean b(qks qks) {
        Object obj;
        gcm savedStates = qks.e.savedStates();
        if (savedStates != null) {
            Map map = savedStates.a;
            if (map != null) {
                aewk aewk = (aewk) map.get(qks.f);
                if (aewk != null) {
                    obj = aewk.a;
                    return akcr.a(obj, Boolean.TRUE);
                }
            }
        }
        obj = null;
        return akcr.a(obj, Boolean.TRUE);
    }

    private final jwa c() {
        return (jwa) this.t.b();
    }

    private final jwc d() {
        return (jwc) this.u.b();
    }

    private final fvk e() {
        return (fvk) this.w.b();
    }

    private final iqs f() {
        return (iqs) this.x.b();
    }

    /* Access modifiers changed, original: final */
    public final Context a() {
        return (Context) this.q.a(m[0]);
    }

    /* Access modifiers changed, original: final */
    public final void a(List<psf> list, View view, long j, boolean z) {
        Context a = a();
        if (a != null) {
            long b = this.B.b();
            long c = this.B.c();
            if (!this.e.a()) {
                sqx sqx = sqx.CIRCLE;
                slg slg = new slg(a, new slh());
                slg.a(sqx);
                g gVar = new g(j, ((psf) ajyu.f((List) list)).m, ((psf) ajyu.f((List) list)).p);
                smm[] smmArr = new smm[7];
                ajdx ajdx = this.z;
                zfw zfw = this.s;
                qwi qwi = this.g;
                ajdx ajdx2 = this.A;
                Object b2 = b();
                goz goz = b2;
                akcr.a(b2, "screenshotWatchman");
                smm[] smmArr2 = smmArr;
                smmArr2[0] = new rgd(j, ajdx, zfw, qwi, ajdx2, z, goz, this.I, this.J, this.D, this.M, this.Y, this.N, e(), this.W, new aj(this, j, list, z, view), abbd.CHAT);
                smmArr2[1] = new rgh();
                smmArr2[2] = new snr();
                smmArr2[3] = new kkl(this.L);
                smmArr2[4] = (smm) this.H.get();
                smmArr2[5] = e();
                smmArr2[6] = (smm) this.O.get();
                sti.a aVar = new sti.a(ajzt.a((Object[]) smmArr2), slg, this.s, c(), d(), this.n.d.b);
                aVar.c = new srk(view, sqx);
                aVar.d = String.valueOf(j);
                aVar.b = new skv(a, this.n.d.b, aVar.t, aVar.u);
                aVar.p = aahb.CHAT;
                psa psa = new psa(aahb.CHAT, aajy.CHAT, aajz.DIRECT_CHAT_SNAP, null);
                ajej a2 = this.f.a((smi) gVar, aVar.a(), (ssi) new sks(this.B, aaug.TAP, b, c, psa), new stl()).a((ajdw) this.s.l()).a((ajev) ak.a, (ajfb) new qfg(new al(this)));
                akcr.a((Object) a2, "operaLauncher.launch(ope…({}, this::onLaunchError)");
                ajvv.a(a2, this.o);
            }
        }
    }

    public final void dispose() {
        this.o.dispose();
    }

    public final boolean isDisposed() {
        return this.o.isDisposed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        f().a(isj);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatBusinessProfileEvent(qgg qgg) {
        akcr.b(qgg, "event");
        if (qgg instanceof qgg.a) {
            ajej e = ((kgv) this.Z.get()).a(((qgg.a) qgg).a, aaua.CHAT, aats.DEFAULT).e();
            akcr.a((Object) e, "publicProfileLauncher.ge…             .subscribe()");
            ajvv.a(e, this.o);
            return;
        }
        if (qgg instanceof qgg.b) {
            wne wne = (wne) this.aa.get();
            qgg.b bVar = (qgg.b) qgg;
            alee alee = bVar.b;
            Object a = bVar.a.a();
            akcr.a(a, "event.businessProfile.id");
            wne.a(wne, alee, a, aahb.CHAT_SHARE_STORY, bVar.a.b(), null, sqx.CENTER_CROP_RECTANGLE, null, bVar.c, false, bVar.a, null, 1360);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatDiscoverMediaEvent(qgh qgh) {
        akcr.b(qgh, "event");
        hbr hbr;
        if (qgh instanceof qgh.a) {
            gvl gvl = (gvl) this.Q.get();
            hbr = ((qgh.a) qgh).a;
            akcr.b(hbr, "sharedPublisherSnapInfo");
            String str = "edition_id";
            String str2 = "dsnap_id";
            Uri build = hbm.a.buildUpon().appendPath("edition").appendQueryParameter("publisher", hbr.c).appendQueryParameter(str, hbr.b).appendQueryParameter(str2, hbr.a).build();
            akcr.a((Object) build, "BASE_DISCOVER_URI.buildU…\n                .build()");
            ajvv.a((ajej) gvl.a(build, false), this.o);
            return;
        }
        if (qgh instanceof qgh.b) {
            qgh.b bVar = (qgh.b) qgh;
            qks qks = bVar.b;
            View view = bVar.c;
            if (qks.h == prl.FAIL || qks.h == prl.NOT_STARTED) {
                rgm rgm = this.C;
                Object feedRowId = qks.e.feedRowId();
                if (feedRowId == null) {
                    akcr.a();
                }
                akcr.a(feedRowId, "model.data.feedRowId()!!");
                long longValue = feedRowId.longValue();
                long _id = qks.e._id();
                Uri g = qks.g();
                if (g == null) {
                    akcr.a();
                }
                rgm.a(longValue, _id, g);
            } else if (qks.h == prl.SUCCESS) {
                hbr = bVar.a;
                long b = this.B.b();
                long c = this.B.c();
                if (!this.e.a()) {
                    Context a = a();
                    if (a != null) {
                        sks sks = new sks(this.B, aaug.TAP, b, c, new psa(aahb.CHAT, aajy.CHAT, aajz.DIRECT_CHAT_SNAP, null));
                        WithFriend withFriend = qks.e;
                        akcr.a(szw.a(kku.a.a, withFriend.key(), kku.a.b, Long.valueOf(withFriend.timestamp()), kku.a.c, withFriend.senderUsername()), "Params.of(\n             …enderUsername()\n        )");
                        Set m = ajyu.m(ajzt.b(new snr(), new kkl(this.K, r4), new qgz(new ai(this))));
                        slg slg = new slg(a, this.p);
                        slg.a(sqx.CENTER_CROP_RECTANGLE);
                        sti.a aVar = new sti.a(m, slg, this.s, c(), d(), this.n.d.b);
                        aVar.c = new srk(view, sqx.CENTER_CROP_RECTANGLE);
                        aVar.d = String.valueOf(qks.getId());
                        aVar.p = aahb.CHAT;
                        ajej a2 = this.f.a(ajyl.a(new rfu.e(qks.getId(), hbr)), aVar.a(), 0, (ssi) sks, new stl()).a((ajev) ag.a, (ajfb) new qfh(new ah(this)));
                        akcr.a((Object) a2, "operaLauncher.launch(ope…({}, this::onLaunchError)");
                        ajvv.a(a2, this.o);
                    }
                }
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatItemClick(qgi qgi) {
        qgi qgi2 = qgi;
        akcr.b(qgi2, "event");
        int i = 0;
        qks qks;
        ajej a;
        if (qgi2.a.e.clientStatus() == MessageClientStatus.FAILED) {
            qks = qgi2.a;
            if ((qks.e.clientStatus() == MessageClientStatus.FAILED ? 1 : null) != null) {
                Object obj;
                Object[] objArr;
                qft qft = this.i;
                akcr.b(qks, "item");
                Long l = qks.b;
                if (l != null) {
                    obj = (LinkedHashSet) qft.a.get(l);
                    if (obj == null) {
                        objArr = new String[]{qks.e.key()};
                    }
                    a = ajdp.b(obj).l(am.a).a((ajfc) new an(this, qks), false).b((ajdw) this.s.h()).a((ajdw) this.s.l()).a((ajev) new ao(this, qks), (ajfb) new ap(this, qks));
                    akcr.a((Object) a, "Observable.just(failedMe…     }\n                })");
                    ajvv.a(a, this.o);
                    return;
                }
                objArr = new String[1];
                Object key = qks.e.key();
                akcr.a(key, "item.data.key()");
                objArr[0] = key;
                obj = ajzt.d(objArr);
                a = ajdp.b(obj).l(am.a).a((ajfc) new an(this, qks), false).b((ajdw) this.s.h()).a((ajdw) this.s.l()).a((ajev) new ao(this, qks), (ajfb) new ap(this, qks));
                akcr.a((Object) a, "Observable.just(failedMe…     }\n                })");
                ajvv.a(a, this.o);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        String str = "model.data.feedRowId()!!";
        Object obj2 = null;
        prl prl;
        int i2;
        rgm rgm;
        Object feedRowId;
        long _id;
        sti a2;
        switch (qff.a[qgi2.a.d.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                qks = qgi2.a;
                View view = qgi2.b;
                prl = qks.h;
                if (prl != null) {
                    i2 = qff.d[prl.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        rgm = this.C;
                        feedRowId = qks.e.feedRowId();
                        if (feedRowId == null) {
                            akcr.a();
                        }
                        akcr.a(feedRowId, str);
                        long longValue = feedRowId.longValue();
                        long _id2 = qks.e._id();
                        Uri g = qks.g();
                        if (g == null) {
                            akcr.a();
                        }
                        rgm.a(longValue, _id2, g);
                        break;
                    }
                    if (i2 == 3) {
                        a(qks, view, 0, 1);
                    }
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
                a(qgi2.a, qgi2.b, 0, 1);
                return;
            case 8:
                Object snapRowId = qgi2.a.e.snapRowId();
                if (snapRowId == null) {
                    snapRowId = Long.valueOf(qgi2.a.e._id());
                }
                akcr.a(snapRowId, "event.model.data.snapRow…?: event.model.data._id()");
                long longValue2 = snapRowId.longValue();
                if (!(this.g.e(longValue2) || this.g.c(longValue2))) {
                    obj2 = qgi2.a.e.feedRowId();
                    if (obj2 == null) {
                        obj2 = Long.valueOf(-1);
                    }
                    akcr.a(obj2, "event.model.data.feedRowId() ?: -1");
                    long longValue3 = obj2.longValue();
                    prl = this.C.g.a(longValue3, rgk.SNAP, longValue2);
                    if (prl != null) {
                        i2 = qff.f[prl.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            rgm = this.C;
                            idl idl = this.n.d.b;
                            akcr.b(idl, "uiPage");
                            a = rgm.f.a((ajfc) new o(longValue3)).b((ajdw) rgm.b.f()).e((ajfb) new p(rgm, longValue2, longValue3, idl));
                            akcr.a((Object) a, "messagingApi\n           …      }\n                }");
                            ajvv.a(a, this.o);
                        } else if (i2 == 3) {
                            return;
                        }
                    }
                    String str2 = "event.model.data.feedRowId()!!";
                    if (this.g.d(longValue2)) {
                        psf psf = (psf) this.g.p.get(Long.valueOf(longValue2));
                        if (psf == null) {
                            akcr.a();
                        }
                        List a3 = ajyl.a(psf);
                        View view2 = qgi2.b;
                        snapRowId = qgi2.a.e.feedRowId();
                        if (snapRowId == null) {
                            akcr.a();
                        }
                        akcr.a(snapRowId, str2);
                        a(a3, view2, snapRowId.longValue(), true);
                        return;
                    }
                    SnapServerStatus snapServerStatus = qgi2.a.e.snapServerStatus();
                    if (snapServerStatus == null) {
                        snapServerStatus = qgi2.a.e.newSnapServerStatus();
                    }
                    if (akcr.a(this.y.b, qgi2.a.e.senderUsername()) && (qgi2.a.e.newSnapServerStatus() == null || qgi2.a.e.isSelfConversation() == 0)) {
                        i = 1;
                    }
                    if (snapServerStatus == SnapServerStatus.DELIVERED && i == 0) {
                        snapRowId = qgi2.a.e.feedRowId();
                        if (snapRowId == null) {
                            akcr.a();
                        }
                        akcr.a(snapRowId, str2);
                        long longValue4 = snapRowId.longValue();
                        a = this.z.a((ajfc) new m(longValue4)).b((ajdw) this.s.h()).a((ajdw) this.s.l()).a((ajfb) new n(this, qgi2.a.e._id(), qgi, longValue4), (ajfb) new qfh(new o(this)));
                        akcr.a((Object) a, "messagingApi\n           …adError\n                )");
                        ajvv.a(a, this.o);
                    }
                }
                return;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                a(qgi2.a);
                return;
            case 15:
                if (qgi2.a instanceof qkx) {
                    qks = qgi2.a;
                    prl = qks.h;
                    if (prl != null) {
                        i2 = qff.e[prl.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            rgm rgm2 = this.C;
                            feedRowId = qks.e.feedRowId();
                            if (feedRowId == null) {
                                akcr.a();
                            }
                            akcr.a(feedRowId, str);
                            long longValue5 = feedRowId.longValue();
                            _id = qks.e._id();
                            Uri uri = ((qkx) qks).n;
                            if (uri == null) {
                                akcr.a();
                            }
                            rgm2.a(longValue5, _id, uri);
                        } else if (i2 == 3) {
                            qkx qkx = (qkx) qks;
                            CharSequence charSequence = qkx.i;
                            obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                            if (obj2 != null) {
                                a(qks, qgi2.b, 0, 1);
                                return;
                            }
                            a = ((wzx) this.v.b()).a(qkx.i, new ab(qgi2.b, qks)).b((ajdw) this.s.g()).a((ajdw) this.s.l()).a((ajfb) ac.a, (ajfb) new qfh(new ad(this)));
                            akcr.a((Object) a, "shazamOperaLauncher.open…({}, this::onLaunchError)");
                            ajvv.a(a, this.o);
                            return;
                        } else if (i2 == 4) {
                            return;
                        }
                    }
                    if (this.D.DEBUG) {
                        StringBuilder stringBuilder = new StringBuilder("Loading state for chat model is not handled ");
                        stringBuilder.append(qks.h);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                return;
            case 16:
                View view3 = qgi2.b;
                if (view3 instanceof VideoCapableThumbnailView) {
                    qks = qgi2.a;
                    if (qks != null) {
                        qme qme = (qme) qks;
                        View view4 = qgi2.b;
                        Context a4 = a();
                        if (a4 != null) {
                            qgf qgf = qme.t;
                            if (qgf != null) {
                                obj2 = qgf.d;
                            }
                            if (!(akcr.a(obj2, Uri.EMPTY) || this.e.a())) {
                                sks sks = new sks(this.B, aaug.TAP, this.B.b(), this.B.c(), new psa(aahb.CHAT, aajy.CHAT, aajz.USER_STORY, qme.j));
                                Set a5 = ajzt.a((Object[]) new smm[]{new sny(), (smm) this.H.get(), new yow(this.S, this.T, this.F, this.s)});
                                slg slg = new slg(a4, this.p);
                                slg.a(sqx.CENTER_CROP_RECTANGLE);
                                sti.a aVar = new sti.a(a5, slg, this.s, c(), d(), this.n.d.b);
                                aVar.c = new srk(view4, sqx.CENTER_CROP_RECTANGLE);
                                aVar.d = qme.j;
                                aVar.e = true;
                                aVar.b = new skv(a4, this.n.d.b, aVar.t, aVar.u);
                                aVar.p = aahb.CHAT;
                                a2 = aVar.a();
                                if (qme.t == null || (1 ^ akcr.a(qme.t, qfs.a)) == 0) {
                                    this.e.b();
                                } else {
                                    a = this.f.a((smi) new d(qme.t.a, (byte) 0), a2, (ssi) sks, new stl()).a((ajev) r.a, (ajfb) new qfh(new s(this)));
                                    akcr.a((Object) a, "operaLauncher.launch(gro…({}, this::onLaunchError)");
                                    ajvv.a(a, this.o);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snap.messaging.chat.ui.viewmodel.media.UserStoryShareSnapViewModel");
                }
                if (view3 instanceof FrameLayout) {
                    Toast.makeText(a(), "Mini profile coming soon!", 0).show();
                }
                return;
            case 17:
                a(qgi);
                return;
            case 18:
                qks = qgi2.a;
                _id = this.B.b();
                long c = this.B.c();
                if (!this.e.a()) {
                    Context a6 = a();
                    if (a6 != null) {
                        sks sks2 = new sks(this.B, aaug.TAP, _id, c, new psa(aahb.CHAT, aajy.CHAT, aajz.DIRECT_CHAT_SNAP, null));
                        Set set = ajyy.a;
                        slg slg2 = new slg(a6, this.p);
                        slg2.a(sqx.CENTER_CROP_RECTANGLE);
                        sti.a aVar2 = new sti.a(set, slg2, this.s, c(), d(), this.n.d.b);
                        aVar2.c = new srk(qgi2.b, sqx.CENTER_CROP_RECTANGLE);
                        aVar2.d = String.valueOf(qks.getId());
                        aVar2.p = aahb.CHAT;
                        a2 = aVar2.a();
                        if (qks instanceof qly) {
                            qly qly = (qly) qks;
                            if (!(qly.k == null || (1 ^ akcr.a(qly.k, qfs.b)) == 0)) {
                                a = this.f.a(qly.k.d, a2, 0, (ssi) sks2, new stl()).a((ajev) e.a, (ajfb) new qfh(new f(this)));
                                akcr.a((Object) a, "operaLauncher.launch(sto…({}, this::onLaunchError)");
                                ajvv.a(a, this.o);
                            }
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 19:
                qks = qgi2.a;
                if (qks != null) {
                    qmc qmc = (qmc) qks;
                    a(qmc.i, qmc.k, qgi2.b);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.messaging.chat.ui.viewmodel.media.SearchStoryShareViewModel");
            case 20:
                qks = qgi2.a;
                if (qks != null) {
                    qmb qmb = (qmb) qks;
                    if (!(qgi2.b instanceof VideoCapableThumbnailView)) {
                        a(qmb.i, qmb.l, qgi2.b);
                        break;
                    } else {
                        a(qgi);
                        return;
                    }
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.messaging.chat.ui.viewmodel.media.SearchStoryShareSnapViewModel");
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatItemLongClicked(qgj qgj) {
        akcr.b(qgj, "event");
        if (qff.b[qgj.a.d.ordinal()] == 1) {
            Object snapRowId = qgj.a.e.snapRowId();
            if (snapRowId == null) {
                snapRowId = Long.valueOf(qgj.a.e._id());
            }
            akcr.a(snapRowId, "event.model.data.snapRow…?: event.model.data._id()");
            long longValue = snapRowId.longValue();
            qwi qwi = this.g;
            qwl qwl = (qwl) qwi.o.get(Long.valueOf(longValue));
            if (qwl != null && qwl.c) {
                qwl.d = true;
                qwl.c = false;
                qwi.q.add(Long.valueOf(longValue));
                qwi.b();
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatItemViewLayoutChangedEvent(qgl qgl) {
        akcr.b(qgl, "event");
        this.a.a(qgl.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatLinkClickEvent(qgm qgm) {
        qgm qgm2 = qgm;
        akcr.b(qgm2, "event");
        Context a = a();
        if (a != null && !this.e.a()) {
            zjm zjm = new zjm(pry.a, "ChatEventDispatcher", false, false, true, false, null, false, false, false, false, null, 4076);
            zgy.a aVar = new zgy.a(a, this.U, zjm, false, null, 24);
            for (ajxm ajxm : qgm2.a) {
                String str;
                akbl tVar;
                int i = qff.c[((qfi) ajxm.a).ordinal()];
                boolean z = true;
                if (i == 1) {
                    str = (String) ajxm.b;
                    tVar = new t(qgm2, a);
                    z = false;
                } else if (i == 2) {
                    str = (String) ajxm.b;
                    tVar = new u(a, qgm2);
                }
                aVar.a(str, tVar, z);
            }
            zgy a2 = zgy.a.a(aVar, null, false, null, null, null, 31).a();
            this.U.a((achd) a2, a2.a, null);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChatMediaItemClickEvent(qgn qgn) {
        akcr.b(qgn, "event");
        a(qgn.a, qgn.b, qgn.c, qgn.d);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCognacButtonClickEvent(qgp qgp) {
        akcr.b(qgp, "event");
        if (!this.e.a()) {
            ajej a = ((eya) this.X.get()).a(qgp.a, qgp.b).a((ajdw) this.s.l()).a((ajev) v.a, (ajfb) new w(this, qgp));
            akcr.a((Object) a, "cognacAppListService.get…, event.appName, error)})");
            ajvv.a(a, this.o);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onDateHeaderViewLayoutChangeEvent(qgq qgq) {
        akcr.b(qgq, "event");
        this.b.a(qgq.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLocationShareRequestResponseEvent(qgr qgr) {
        akcr.b(qgr, "event");
        acly acly = this.V;
        boolean z = qgr.a;
        acmd acmd = qgr.b;
        akcr.b(acmd, "shareMessageType");
        aaqy aaqy = new aaqy();
        aaqy.a(Boolean.valueOf(z));
        aaqy.a(acmd.toString());
        acly.b.a(aaqy);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLocationShareRequestSeenEvent(qgs qgs) {
        akcr.b(qgs, "event");
        acly acly = this.V;
        String str = qgs.a;
        boolean z = qgs.c;
        acmd acmd = qgs.b;
        String str2 = qgs.d;
        akcr.b(str, "id");
        akcr.b(acmd, "shareMessageType");
        akcr.b(str2, ChatAttachmentsModel.SENDERUSERNAME);
        if (!acly.a.contains(str)) {
            acly.a.add(str);
            Object a = ajdx.c((Callable) new acly.d(acly, str2)).b((ajdw) acly.a().b()).a((ajfb) new acly.e(acly, z, acmd), (ajfb) f.a);
            akcr.a(a, "Single.fromCallable {\n  …      }\n                )");
            std.a(a, acly.d);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPostLocationRequestFeedbackEvent(qgt qgt) {
        akcr.b(qgt, "event");
        aljj aljj = new aljj();
        aljj.a(qgt.a);
        aljj.a(qgt.b);
        ajej a = this.R.postRequestLocationFeedback(aljj).a((ajfb) x.a, (ajfb) y.a);
        akcr.a((Object) a, "locationRequestHttpInter…back\")\n                })");
        ajvv.a(a, this.o);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPreserveChatItem(qgk qgk) {
        akcr.b(qgk, "event");
        pqh a = pqi.a(this.c);
        if (a != null) {
            this.E.a(a, qgk.a, qgk.b);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onRemoveFriendEvent(itc itc) {
        akcr.b(itc, "event");
        f().a(itc);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onReplyStoryMediaClickEvent(qgv qgv) {
        qgv qgv2 = qgv;
        akcr.b(qgv2, "event");
        qks qks = qgv2.a;
        View view = qgv2.b;
        long b = this.B.b();
        long c = this.B.c();
        if (!this.e.a()) {
            Context a = a();
            if (a != null) {
                Object cVar;
                sks sks = new sks(this.B, aaug.TAP, b, c, new psa(aahb.CHAT, aajy.CHAT, aajz.USER_STORY, null));
                Set set = ajyy.a;
                slg slg = new slg(a, this.p);
                slg.a(sqx.CENTER_CROP_RECTANGLE);
                sti.a aVar = new sti.a(set, slg, this.s, c(), d(), this.n.d.b);
                aVar.c = new srk(view, sqx.CENTER_CROP_RECTANGLE);
                aVar.d = String.valueOf(qks.getId());
                aVar.p = aahb.CHAT;
                sti a2 = aVar.a();
                if (qks.getType() == qfk.SNAP) {
                    Object feedRowId = qks.e.feedRowId();
                    if (feedRowId == null) {
                        akcr.a();
                    }
                    akcr.a(feedRowId, "model.data.feedRowId()!!");
                    long longValue = feedRowId.longValue();
                    long _id = qks.e._id();
                    Long snapRowId = qks.e.snapRowId();
                    if (snapRowId == null) {
                        snapRowId = Long.valueOf(qks.e._id());
                    }
                    g gVar = new g(longValue, _id, snapRowId.longValue(), true);
                } else {
                    cVar = new c(qks.getId());
                }
                ajej a3 = this.f.a(ajyl.a(cVar), a2, 0, (ssi) sks, new stl()).a((ajev) p.a, (ajfb) new qfh(new q(this)));
                akcr.a((Object) a3, "operaLauncher.launch(ope…({}, this::onLaunchError)");
                ajvv.a(a3, this.o);
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSendLocationShareEvent(qgw qgw) {
        qgw qgw2 = qgw;
        akcr.b(qgw2, "event");
        String a = ajyu.a((Iterable) ajyu.a((Iterable) ajym.b((Object[]) new String[]{qgw2.a, qgw2.c}), (Comparator) akab.a), (CharSequence) "~", null, null, 0, null, null, 62);
        String str = qgw2.b;
        String str2 = qgw2.d;
        alhq alhq = qgw2.e;
        double d = 0.0d;
        double c = alhq != null ? (double) alhq.c() : 0.0d;
        alhq alhq2 = qgw2.e;
        if (alhq2 != null) {
            d = (double) alhq2.d();
        }
        ajej a2 = psm.a.a(this.h, ajyl.a(new FriendMessageRecipient(a)), new pua(str, str2, "", c, d), new pth(gcn.CHAT, null, null, 0, null, null, null, 16382), null, 16).a((ajfb) z.a, (ajfb) aa.a);
        akcr.a((Object) a2, "sendMessageApi\n         …tion\")\n                })");
        ajvv.a(a2, this.o);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onTrackedExceptionEvent(qgx qgx) {
        akcr.b(qgx, "event");
        this.d.a(qgx.a, new Throwable(qgx.b, qgx.c), qgx.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    @defpackage.akqq(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onUnsupportedItemViewedEvent(defpackage.qgo r3) {
        /*
        r2 = this;
        r0 = "event";
        defpackage.akcr.b(r3, r0);
        r0 = r3.a;
        r0 = r0.e;
        r0 = r0.savedStates();
        if (r0 == 0) goto L_0x0022;
    L_0x000f:
        r0 = r0.a;
        if (r0 == 0) goto L_0x0022;
    L_0x0013:
        r1 = r2.y;
        r1 = r1.b;
        r0 = r0.get(r1);
        r0 = (defpackage.aewk) r0;
        if (r0 == 0) goto L_0x0022;
    L_0x001f:
        r0 = r0.a;
        goto L_0x0023;
    L_0x0022:
        r0 = 0;
    L_0x0023:
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r3 = r3.a;
        r2.a(r3);
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfe.onUnsupportedItemViewedEvent(qgo):void");
    }
}
