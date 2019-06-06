package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendmojiCategory;
import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.FeedStoryInfo;
import com.snap.ui.view.emoji.SnapEmojiSpanFactory;
import defpackage.rbb.a;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: rdt */
public final class rdt extends zmy {
    final int A;
    public final rbw B;
    public final boolean C;
    public final CharSequence D;
    public final Spanned E;
    public rba F;
    public final CharSequence G;
    public final Context H;
    public final ajdw I;
    public final rdw J;
    public final rdx K;
    public final WithFriendAndStory L;
    public final reb M;
    public final ihi N;
    public final ihh O;
    public final SnapEmojiSpanFactory P;
    public final a Q;
    public final ajwy<gqr> R;
    public final eyn S;
    public final boolean T;
    public final ras U;
    private final ajxe V;
    private final ajxe W;
    private final boolean X;
    private final yic.a Y;
    private final Map<String, String> Z;
    public final boolean a;
    private final boolean aA;
    private final jjj aa;
    private final String ab;
    private final String ac;
    private final rbf ad;
    private final boolean ae;
    private final boolean af;
    private final String ag;
    private final List<String> ah;
    private final boolean ai;
    private final String aj;
    private final boolean ak;
    private final boolean al;
    private final boolean am;
    private final int an;
    private final boolean ao;
    private final boolean ap;
    private final boolean aq;
    private final String ar;
    private final ajxe as;
    private final boolean at;
    private final boolean au;
    private final ajxe av;
    private final Typeface aw;
    private final int ax;
    private final Uri ay;
    private final Uri az;
    public final boolean b;
    public final qwj c;
    public final rbg d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final fgk j;
    public final boolean k;
    public final iin l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final int u;
    public final int v;
    public final zio w;
    public final List<Avatar> x;
    public final String y;
    public final int z;

    /* renamed from: rdt$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return qxo.b.callsite("FriendFeedItemViewModel");
        }
    }

    /* renamed from: rdt$b */
    static final class b extends akcs implements akbk<Context> {
        private /* synthetic */ rdt a;

        b(rdt rdt) {
            this.a = rdt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.a.H;
            if (context != null) {
                return context;
            }
            throw new IllegalStateException("Invalid context");
        }
    }

    /* renamed from: rdt$d */
    static final class d extends akcs implements akbk<Typeface> {
        private /* synthetic */ rdt a;

        d(rdt rdt) {
            this.a = rdt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zki.a(this.a.a(), this.a.A);
        }
    }

    /* renamed from: rdt$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ rdt a;

        c(rdt rdt) {
            this.a = rdt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.l();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rdt.class), "context", "getContext()Landroid/content/Context;"), new akdc(akde.a(rdt.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(rdt.class), "secondaryTextTypeface", "getSecondaryTextTypeface()Landroid/graphics/Typeface;"), new akdc(akde.a(rdt.class), "prettyTimestamp", "getPrettyTimestamp()Ljava/lang/String;")};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:521:0x0a02 in {2, 3, 10, 11, 14, 15, 19, 20, 21, 26, 27, 34, 35, 42, 43, 44, 47, 50, 53, 54, 57, 58, 65, 66, 73, 74, 81, 82, 83, 84, 85, 92, 93, 94, 99, 100, 101, 104, 105, 108, 109, 112, 115, 116, 121, 122, 129, 130, 135, 136, 137, 142, 143, 147, 148, 151, 152, 157, 158, 163, 164, 165, 168, 173, 174, 176, 181, 182, 187, 188, 189, 194, 195, 196, 201, 202, 207, 208, 218, 219, 223, 224, 226, 227, 228, 236, 237, 242, 243, 244, 256, 257, 268, 269, 270, 275, 276, 278, 279, 288, 291, 297, 300, 301, 303, 306, 307, 313, 314, 317, 318, 319, 320, 326, 327, 333, 334, 337, 340, 345, 346, 352, 353, 355, 360, 363, 368, 371, 374, 379, 384, 387, 388, 393, 402, 403, 404, 405, 406, 407, 412, 413, 414, 418, 419, 425, 428, 429, 431, 432, 435, 436, 439, 440, 445, 450, 451, 453, 457, 458, 463, 466, 467, 472, 474, 475, 478, 479, 484, 485, 486, 487, 492, 493, 494, 496, 499, 502, 505, 508, 511, 514, 517, 520} preds:[]
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
    public rdt(android.content.Context r19, defpackage.ajdw r20, boolean r21, defpackage.rdw r22, defpackage.rdx r23, com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory r24, defpackage.reb r25, defpackage.ihi r26, defpackage.ihh r27, com.snap.ui.view.emoji.SnapEmojiSpanFactory r28, defpackage.rbb.a r29, defpackage.ajwy<defpackage.gqr> r30, defpackage.eyn r31, boolean r32, defpackage.ras r33) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r20;
        r2 = r22;
        r3 = r23;
        r4 = r24;
        r5 = r25;
        r6 = r26;
        r7 = r27;
        r8 = r28;
        r9 = r29;
        r10 = r30;
        r11 = r31;
        r12 = r33;
        r13 = "scheduler";
        defpackage.akcr.b(r0, r13);
        r13 = "assets";
        defpackage.akcr.b(r2, r13);
        r13 = "friendsFeedState";
        defpackage.akcr.b(r3, r13);
        r13 = "record";
        defpackage.akcr.b(r4, r13);
        r13 = "mediaLoadingState";
        defpackage.akcr.b(r5, r13);
        r13 = "dateTimeUtils";
        defpackage.akcr.b(r6, r13);
        r13 = "clock";
        defpackage.akcr.b(r7, r13);
        r13 = "snapEmojiSpanFactory";
        defpackage.akcr.b(r8, r13);
        r13 = "textToggleFactory";
        defpackage.akcr.b(r9, r13);
        r13 = "exceptionTracker";
        defpackage.akcr.b(r10, r13);
        r13 = "cognacFeedDataProvider";
        defpackage.akcr.b(r11, r13);
        r13 = "viewType";
        defpackage.akcr.b(r12, r13);
        r13 = r12;
        r13 = (defpackage.zlv) r13;
        r14 = r24._id();
        r1.<init>(r13, r14);
        r13 = r19;
        r1.H = r13;
        r1.I = r0;
        r0 = r21;
        r1.aA = r0;
        r1.J = r2;
        r1.K = r3;
        r1.L = r4;
        r1.M = r5;
        r1.N = r6;
        r1.O = r7;
        r1.P = r8;
        r1.Q = r9;
        r1.R = r10;
        r1.S = r11;
        r0 = r32;
        r1.T = r0;
        r1.U = r12;
        r0 = new rdt$b;
        r0.<init>(r1);
        r0 = (defpackage.akbk) r0;
        r0 = defpackage.ajxh.a(r0);
        r1.V = r0;
        r0 = defpackage.rdt.a.a;
        r0 = (defpackage.akbk) r0;
        r0 = defpackage.ajxh.a(r0);
        r1.W = r0;
        r0 = r1.M;
        r0 = r0.c;
        r2 = defpackage.prl.LOADING;
        r3 = 0;
        r4 = 1;
        if (r0 != r2) goto L_0x00a7;
        r0 = 1;
        goto L_0x00a8;
        r0 = 0;
        r1.X = r0;
        r0 = r1.M;
        r0 = r0.b;
        r1.Y = r0;
        r0 = r1.K;
        r0 = r0.c;
        if (r0 == 0) goto L_0x00e7;
        r0 = r18.e();
        if (r0 == 0) goto L_0x00db;
        r0 = r18.f();
        if (r0 == 0) goto L_0x00ce;
        r0 = r18.h();
        r2 = java.lang.Boolean.FALSE;
        r0 = defpackage.akcr.a(r0, r2);
        r0 = r0 ^ r4;
        goto L_0x00dc;
        r0 = r18.d();
        if (r0 == 0) goto L_0x00db;
        r0 = r1.L;
        r0 = r0.storyViewed();
        goto L_0x00c6;
        r0 = 1;
        if (r0 != 0) goto L_0x00e7;
        r0 = r1.Y;
        r2 = defpackage.yic.a.SUCCESS;
        if (r0 != r2) goto L_0x00e5;
        goto L_0x00e7;
        r0 = 0;
        goto L_0x00e8;
        r0 = 1;
        r1.a = r0;
        r0 = r1.M;
        r0 = r0.a;
        if (r0 == 0) goto L_0x00f8;
        r0 = r1.Y;
        r2 = defpackage.yic.a.LOADING;
        if (r0 != r2) goto L_0x00f8;
        r0 = 1;
        goto L_0x00f9;
        r0 = 0;
        r1.b = r0;
        r0 = r1.K;
        r0 = r0.e;
        r0 = r0.a;
        r1.Z = r0;
        r0 = new jjj;
        r0.<init>();
        r1.aa = r0;
        r0 = r1.K;
        r0 = r0.f;
        r0 = r0.b;
        r1.ab = r0;
        r0 = r1.K;
        r0 = r0.f;
        r0 = r0.c;
        r1.ac = r0;
        r0 = r1.M;
        r0 = r0.d;
        r1.c = r0;
        r0 = r1.K;
        r0 = r0.d;
        r1.ad = r0;
        r0 = r1.ad;
        r2 = r18.b();
        r0 = r0.a(r2);
        r1.d = r0;
        r0 = r1.d;
        r0 = r0.a();
        r1.ae = r0;
        r0 = r1.d;
        r0 = r0.b();
        r1.e = r0;
        r0 = r1.d;
        r2 = defpackage.rbh.d;
        r0 = r0.ordinal();
        r0 = r2[r0];
        r2 = 5;
        r5 = 4;
        r6 = 3;
        r7 = 2;
        if (r0 == r4) goto L_0x015c;
        if (r0 == r7) goto L_0x015c;
        if (r0 == r6) goto L_0x015c;
        if (r0 == r5) goto L_0x015c;
        if (r0 == r2) goto L_0x015c;
        r0 = 0;
        goto L_0x015d;
        r0 = 1;
        r1.f = r0;
        r0 = r1.d;
        r8 = r0.a();
        if (r8 != 0) goto L_0x0176;
        r8 = r0.b();
        if (r8 != 0) goto L_0x0176;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0174;
        goto L_0x0176;
        r0 = 0;
        goto L_0x0177;
        r0 = 1;
        r1.af = r0;
        r0 = r1.ad;
        r8 = r18.b();
        r9 = "conversationId";
        defpackage.akcr.b(r8, r9);
        r10 = r0.a(r8);
        r10 = r10.b();
        r11 = 0;
        r12 = "";
        if (r10 != 0) goto L_0x0193;
        r0 = r11;
        goto L_0x01a5;
        r0 = r0.a;
        r0 = r0.get(r8);
        r0 = (defpackage.rbd) r0;
        if (r0 == 0) goto L_0x0191;
        r0 = r0.c;
        r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r12);
        r0 = (java.lang.String) r0;
        r1.g = r0;
        r0 = r1.L;
        r0 = r0.lastWriterUsername();
        r1.h = r0;
        r0 = r1.L;
        r0 = r0.bitmojiAvatarId();
        r1.i = r0;
        r0 = r1.ad;
        r8 = r18.b();
        defpackage.akcr.b(r8, r9);
        r0 = r0.a;
        r0 = r0.get(r8);
        r0 = (defpackage.rbd) r0;
        if (r0 == 0) goto L_0x01cd;
        r0 = r0.h;
        goto L_0x01ce;
        r0 = r11;
        r1.ag = r0;
        r0 = r1.ad;
        r8 = r18.b();
        r0 = r0.c(r8);
        r1.ah = r0;
        r0 = r1.ag;
        if (r0 != 0) goto L_0x01e2;
        r0 = r11;
        goto L_0x01ee;
        r0 = r1.S;
        r8 = r18.b();
        r10 = r1.ag;
        r0 = r0.a(r8, r10);
        r1.j = r0;
        r0 = r1.d;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0202;
        r0 = r1.ag;
        if (r0 == 0) goto L_0x0202;
        r0 = r1.j;
        if (r0 == 0) goto L_0x0202;
        r0 = 1;
        goto L_0x0203;
        r0 = 0;
        r1.k = r0;
        defpackage.in.a(r12);
        r0 = r1.L;	 Catch:{ all -> 0x09fd }
        r0 = r0.displayInteractionType();	 Catch:{ all -> 0x09fd }
        if (r0 == 0) goto L_0x0251;	 Catch:{ all -> 0x09fd }
        r8 = r1.L;	 Catch:{ all -> 0x09fd }
        r8 = r8.notViewedSnapId();	 Catch:{ all -> 0x09fd }
        if (r8 == 0) goto L_0x022b;	 Catch:{ all -> 0x09fd }
        r10 = r1.c;	 Catch:{ all -> 0x09fd }
        r13 = "it";	 Catch:{ all -> 0x09fd }
        defpackage.akcr.a(r8, r13);	 Catch:{ all -> 0x09fd }
        r13 = "snapId";	 Catch:{ all -> 0x09fd }
        defpackage.akcr.b(r8, r13);	 Catch:{ all -> 0x09fd }
        r10 = r10.b;	 Catch:{ all -> 0x09fd }
        r8 = r10.contains(r8);	 Catch:{ all -> 0x09fd }
        goto L_0x022c;	 Catch:{ all -> 0x09fd }
        r8 = 0;	 Catch:{ all -> 0x09fd }
        r10 = "displayInteractionType";	 Catch:{ all -> 0x09fd }
        defpackage.akcr.a(r0, r10);	 Catch:{ all -> 0x09fd }
        r0 = defpackage.iin.valueOf(r0);	 Catch:{ all -> 0x09fd }
        r10 = r0.a();	 Catch:{ all -> 0x09fd }
        if (r10 == 0) goto L_0x024f;	 Catch:{ all -> 0x09fd }
        if (r8 == 0) goto L_0x024f;	 Catch:{ all -> 0x09fd }
        r8 = defpackage.rdu.a;	 Catch:{ all -> 0x09fd }
        r10 = r0.ordinal();	 Catch:{ all -> 0x09fd }
        r8 = r8[r10];	 Catch:{ all -> 0x09fd }
        if (r8 == r4) goto L_0x024d;	 Catch:{ all -> 0x09fd }
        if (r8 == r7) goto L_0x024a;	 Catch:{ all -> 0x09fd }
        goto L_0x024f;	 Catch:{ all -> 0x09fd }
        r0 = defpackage.iin.SNAP_RECEIVED_AND_VIEWED_NO_SOUND;	 Catch:{ all -> 0x09fd }
        goto L_0x024f;	 Catch:{ all -> 0x09fd }
        r0 = defpackage.iin.SNAP_RECEIVED_AND_VIEWED_SOUND;	 Catch:{ all -> 0x09fd }
        if (r0 != 0) goto L_0x0253;	 Catch:{ all -> 0x09fd }
        r0 = defpackage.iin.UNKNOWN;	 Catch:{ all -> 0x09fd }
        defpackage.in.a();
        r1.l = r0;
        r0 = r1.l;
        r0 = r0.j();
        if (r0 != 0) goto L_0x0273;
        r0 = r1.d;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0273;
        r0 = r1.d;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0271;
        goto L_0x0273;
        r0 = 0;
        goto L_0x0274;
        r0 = 1;
        r1.ai = r0;
        r0 = r1.l;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0289;
        r0 = r1.M;
        r0 = r0.c;
        r8 = defpackage.prl.SUCCESS;
        if (r0 != r8) goto L_0x0287;
        goto L_0x0289;
        r0 = 0;
        goto L_0x028a;
        r0 = 1;
        r1.m = r0;
        r0 = r1.M;
        r0 = r0.c;
        r8 = defpackage.prl.FAIL;
        if (r0 != r8) goto L_0x0296;
        r0 = 1;
        goto L_0x0297;
        r0 = 0;
        r1.n = r0;
        r0 = r1.L;
        r0 = r0.isGroup();
        if (r0 == 0) goto L_0x02a3;
        r0 = r12;
        goto L_0x02a9;
        r0 = r1.L;
        r0 = r0.friendmojiCategories();
        r1.aj = r0;
        r0 = r1.c;
        r0 = r0.d;
        r8 = r1.L;
        r13 = r8._id();
        if (r0 != 0) goto L_0x02b8;
        goto L_0x02c2;
        r15 = r0.longValue();
        r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1));
        if (r0 != 0) goto L_0x02c2;
        r0 = 1;
        goto L_0x02c3;
        r0 = 0;
        r1.ak = r0;
        r0 = r1.L;
        r0 = r0.friendUserId();
        r1.o = r0;
        r0 = r1.c;
        r8 = r1.L;
        r13 = r8._id();
        r0 = r0.a;
        r8 = java.lang.Long.valueOf(r13);
        r0 = r0.get(r8);
        r0 = (defpackage.qwl) r0;
        if (r0 == 0) goto L_0x02e9;
        r0 = r0.d;
        if (r0 != r4) goto L_0x02e9;
        r0 = 1;
        goto L_0x02ea;
        r0 = 0;
        r1.p = r0;
        r0 = r1.ak;
        if (r0 == 0) goto L_0x02fe;
        r0 = r1.p;
        if (r0 != 0) goto L_0x02fe;
        r0 = r1.l;
        r0 = r0.j();
        if (r0 != 0) goto L_0x02fe;
        r0 = 1;
        goto L_0x02ff;
        r0 = 0;
        r1.q = r0;
        r0 = r1.aj;
        r0 = (java.lang.CharSequence) r0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0314;
        r0 = r18.t();
        if (r0 == 0) goto L_0x0312;
        goto L_0x0314;
        r0 = 0;
        goto L_0x0315;
        r0 = 1;
        r1.r = r0;
        r0 = r1.k;
        if (r0 == 0) goto L_0x0339;
        r0 = r1.j;
        if (r0 == 0) goto L_0x0322;
        r0 = r0.h;
        goto L_0x0323;
        r0 = r11;
        if (r0 == 0) goto L_0x0339;
        r0 = r1.j;
        if (r0 == 0) goto L_0x0330;
        r0 = r0.k;
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x0331;
        r0 = r11;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0339;
        r0 = 1;
        goto L_0x033a;
        r0 = 0;
        r1.s = r0;
        r0 = r1.L;
        r0 = r0.friendUsername();
        r1.t = r0;
        r0 = r1.c;
        r8 = r1.L;
        r13 = r8._id();
        r0 = r0.a;
        r8 = java.lang.Long.valueOf(r13);
        r0 = r0.get(r8);
        r0 = (defpackage.qwl) r0;
        if (r0 == 0) goto L_0x0360;
        r0 = r0.a;
        if (r0 != r4) goto L_0x0360;
        r0 = 1;
        goto L_0x0361;
        r0 = 0;
        r1.al = r0;
        r0 = r1.al;
        if (r0 != 0) goto L_0x036e;
        r0 = r1.p;
        if (r0 == 0) goto L_0x036c;
        goto L_0x036e;
        r0 = 0;
        goto L_0x036f;
        r0 = 1;
        r1.am = r0;
        r0 = r1.k;
        r8 = 8;
        if (r0 == 0) goto L_0x037a;
        r0 = 8;
        goto L_0x039d;
        r0 = r1.af;
        if (r0 == 0) goto L_0x0391;
        r0 = r1.l;
        r10 = defpackage.iio.f;
        r0 = r0.ordinal();
        r0 = r10[r0];
        switch(r0) {
            case 1: goto L_0x038d;
            case 2: goto L_0x038d;
            case 3: goto L_0x038d;
            case 4: goto L_0x038d;
            case 5: goto L_0x038d;
            case 6: goto L_0x038d;
            case 7: goto L_0x038d;
            case 8: goto L_0x038d;
            case 9: goto L_0x038d;
            case 10: goto L_0x038d;
            case 11: goto L_0x038d;
            default: goto L_0x038b;
        };
        r0 = 0;
        goto L_0x038e;
        r0 = 1;
        if (r0 != 0) goto L_0x0391;
        goto L_0x0377;
        r0 = r1.am;
        if (r0 != 0) goto L_0x039c;
        r0 = r1.l;
        r10 = defpackage.iin.WAITING_TO_SEND;
        if (r0 != r10) goto L_0x039c;
        goto L_0x0377;
        r0 = 0;
        r1.u = r0;
        r0 = r1.l;
        r0 = r0.g();
        if (r0 != 0) goto L_0x03af;
        r0 = r1.X;
        if (r0 == 0) goto L_0x03ac;
        goto L_0x03af;
        r0 = 8;
        goto L_0x03b0;
        r0 = 0;
        r1.v = r0;
        r0 = r1.v;
        if (r0 != 0) goto L_0x03be;
        r0 = r1.al;
        if (r0 == 0) goto L_0x03bb;
        goto L_0x03be;
        r0 = 8;
        goto L_0x03bf;
        r0 = 0;
        r1.an = r0;
        r0 = r1.c;
        r10 = r1.L;
        r13 = r10._id();
        r0 = r0.a;
        r10 = java.lang.Long.valueOf(r13);
        r0 = r0.get(r10);
        r0 = (defpackage.qwl) r0;
        if (r0 == 0) goto L_0x03dd;
        r0 = r0.e;
        if (r0 != r4) goto L_0x03dd;
        r0 = 1;
        goto L_0x03de;
        r0 = 0;
        r1.ao = r0;
        r0 = r18.v();
        r1.w = r0;
        r0 = r1.l;
        r0 = r0.a();
        if (r0 != 0) goto L_0x03f6;
        r0 = r18.w();
        if (r0 == 0) goto L_0x03f6;
        r0 = 1;
        goto L_0x03f7;
        r0 = 0;
        if (r0 == 0) goto L_0x0443;
        r0 = r1.al;
        if (r0 != 0) goto L_0x0443;
        r0 = r1.p;
        if (r0 != 0) goto L_0x0443;
        r0 = r1.l;
        r0 = r0.j();
        if (r0 != 0) goto L_0x0443;
        r0 = r1.l;
        r10 = defpackage.iio.h;
        r13 = r0.ordinal();
        r10 = r10[r13];
        switch(r10) {
            case 1: goto L_0x0418;
            case 2: goto L_0x0418;
            case 3: goto L_0x0418;
            case 4: goto L_0x0418;
            case 5: goto L_0x0418;
            case 6: goto L_0x0418;
            case 7: goto L_0x0418;
            case 8: goto L_0x0418;
            case 9: goto L_0x0418;
            case 10: goto L_0x0418;
            case 11: goto L_0x0418;
            case 12: goto L_0x0418;
            case 13: goto L_0x0418;
            case 14: goto L_0x0418;
            case 15: goto L_0x0418;
            case 16: goto L_0x0418;
            case 17: goto L_0x0418;
            case 18: goto L_0x0418;
            default: goto L_0x0416;
        };
        r10 = 0;
        goto L_0x0419;
        r10 = 1;
        if (r10 != 0) goto L_0x042e;
        r10 = defpackage.iio.i;
        r0 = r0.ordinal();
        r0 = r10[r0];
        switch(r0) {
            case 1: goto L_0x0428;
            case 2: goto L_0x0428;
            case 3: goto L_0x0428;
            case 4: goto L_0x0428;
            case 5: goto L_0x0428;
            case 6: goto L_0x0428;
            case 7: goto L_0x0428;
            case 8: goto L_0x0428;
            case 9: goto L_0x0428;
            case 10: goto L_0x0428;
            default: goto L_0x0426;
        };
        r0 = 0;
        goto L_0x0429;
        r0 = 1;
        if (r0 == 0) goto L_0x042c;
        goto L_0x042e;
        r0 = 0;
        goto L_0x042f;
        r0 = 1;
        if (r0 != 0) goto L_0x0443;
        r0 = r1.l;
        r0 = r0.g();
        if (r0 != 0) goto L_0x0443;
        r0 = r1.ae;
        if (r0 != 0) goto L_0x0443;
        r0 = r1.e;
        if (r0 != 0) goto L_0x0443;
        r0 = 1;
        goto L_0x0444;
        r0 = 0;
        r1.ap = r0;
        r0 = r1.l;
        r10 = r0.d();
        if (r10 != 0) goto L_0x0457;
        r0 = r0.e();
        if (r0 == 0) goto L_0x0455;
        goto L_0x0457;
        r0 = 0;
        goto L_0x0458;
        r0 = 1;
        if (r0 == 0) goto L_0x0470;
        r0 = r1.ap;
        if (r0 != 0) goto L_0x0470;
        r0 = r1.al;
        if (r0 != 0) goto L_0x0470;
        r0 = r1.p;
        if (r0 != 0) goto L_0x0470;
        r0 = r1.ae;
        if (r0 != 0) goto L_0x0470;
        r0 = r1.e;
        if (r0 != 0) goto L_0x0470;
        r0 = 1;
        goto L_0x0471;
        r0 = 0;
        r1.aq = r0;
        r0 = r1.L;
        r0 = defpackage.rdt.a(r0);
        r1.ar = r0;
        defpackage.in.a(r12);
        r0 = r1.t;	 Catch:{ all -> 0x09f8 }
        if (r0 == 0) goto L_0x04f9;	 Catch:{ all -> 0x09f8 }
        r0 = r1.L;	 Catch:{ all -> 0x09f8 }
        r0 = r0.bitmojiAvatarId();	 Catch:{ all -> 0x09f8 }
        r10 = "avatarId";
        if (r0 == 0) goto L_0x04af;
        defpackage.akcr.a(r0, r10);	 Catch:{ all -> 0x09f8 }
        r13 = r18.j();	 Catch:{ all -> 0x09f8 }
        if (r13 != 0) goto L_0x0497;	 Catch:{ all -> 0x09f8 }
        r13 = "10225903";	 Catch:{ all -> 0x09f8 }
        r14 = defpackage.afnd.CHAT;	 Catch:{ all -> 0x09f8 }
        r15 = 0;	 Catch:{ all -> 0x09f8 }
        r16 = 0;	 Catch:{ all -> 0x09f8 }
        r17 = 24;	 Catch:{ all -> 0x09f8 }
        r19 = r0;	 Catch:{ all -> 0x09f8 }
        r20 = r13;	 Catch:{ all -> 0x09f8 }
        r21 = r14;	 Catch:{ all -> 0x09f8 }
        r22 = r15;	 Catch:{ all -> 0x09f8 }
        r23 = r16;	 Catch:{ all -> 0x09f8 }
        r24 = r17;	 Catch:{ all -> 0x09f8 }
        r0 = defpackage.dds.a(r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x09f8 }
        goto L_0x04b0;	 Catch:{ all -> 0x09f8 }
        r0 = r11;	 Catch:{ all -> 0x09f8 }
        r13 = r1.e;	 Catch:{ all -> 0x09f8 }
        if (r13 == 0) goto L_0x04d9;	 Catch:{ all -> 0x09f8 }
        r13 = r1.L;	 Catch:{ all -> 0x09f8 }
        r13 = r13.bitmojiAvatarId();	 Catch:{ all -> 0x09f8 }
        if (r13 == 0) goto L_0x04d9;	 Catch:{ all -> 0x09f8 }
        defpackage.akcr.a(r13, r10);	 Catch:{ all -> 0x09f8 }
        r10 = "10233061";	 Catch:{ all -> 0x09f8 }
        r14 = defpackage.afnd.CHAT;	 Catch:{ all -> 0x09f8 }
        r15 = 0;	 Catch:{ all -> 0x09f8 }
        r16 = 0;	 Catch:{ all -> 0x09f8 }
        r17 = 24;	 Catch:{ all -> 0x09f8 }
        r19 = r13;	 Catch:{ all -> 0x09f8 }
        r20 = r10;	 Catch:{ all -> 0x09f8 }
        r21 = r14;	 Catch:{ all -> 0x09f8 }
        r22 = r15;	 Catch:{ all -> 0x09f8 }
        r23 = r16;	 Catch:{ all -> 0x09f8 }
        r24 = r17;	 Catch:{ all -> 0x09f8 }
        r10 = defpackage.dds.a(r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x09f8 }
        goto L_0x04da;	 Catch:{ all -> 0x09f8 }
        r10 = r11;	 Catch:{ all -> 0x09f8 }
        r13 = new com.snap.ui.avatar.Avatar;	 Catch:{ all -> 0x09f8 }
        r14 = r1.t;	 Catch:{ all -> 0x09f8 }
        r15 = 0;	 Catch:{ all -> 0x09f8 }
        r16 = 8;	 Catch:{ all -> 0x09f8 }
        r17 = 0;	 Catch:{ all -> 0x09f8 }
        r19 = r13;	 Catch:{ all -> 0x09f8 }
        r20 = r14;	 Catch:{ all -> 0x09f8 }
        r21 = r0;	 Catch:{ all -> 0x09f8 }
        r22 = r10;	 Catch:{ all -> 0x09f8 }
        r23 = r15;	 Catch:{ all -> 0x09f8 }
        r24 = r16;	 Catch:{ all -> 0x09f8 }
        r25 = r17;	 Catch:{ all -> 0x09f8 }
        r19.<init>(r20, r21, r22, r23, r24, r25);	 Catch:{ all -> 0x09f8 }
        r0 = defpackage.ajyl.a(r13);	 Catch:{ all -> 0x09f8 }
        goto L_0x04fa;
        r0 = r11;
        defpackage.in.a();
        r1.x = r0;
        defpackage.in.a(r12);
        r0 = r1.ae;	 Catch:{ all -> 0x09f3 }
        if (r0 != 0) goto L_0x0571;	 Catch:{ all -> 0x09f3 }
        r0 = r1.e;	 Catch:{ all -> 0x09f3 }
        if (r0 != 0) goto L_0x0571;	 Catch:{ all -> 0x09f3 }
        r0 = r1.k;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x050f;	 Catch:{ all -> 0x09f3 }
        goto L_0x0571;	 Catch:{ all -> 0x09f3 }
        r0 = r1.am;	 Catch:{ all -> 0x09f3 }
        r9 = 2131887273; // 0x7f1204a9 float:1.9409148E38 double:1.0532922624E-314;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x051c;	 Catch:{ all -> 0x09f3 }
        r0 = r1.b(r9);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = r1.l;	 Catch:{ all -> 0x09f3 }
        r0 = r0.a();	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x055a;	 Catch:{ all -> 0x09f3 }
        r0 = r1.X;	 Catch:{ all -> 0x09f3 }
        r10 = "model";	 Catch:{ all -> 0x09f3 }
        defpackage.akcr.b(r1, r10);	 Catch:{ all -> 0x09f3 }
        r10 = r1.l;	 Catch:{ all -> 0x09f3 }
        r10 = r10.a();	 Catch:{ all -> 0x09f3 }
        if (r10 == 0) goto L_0x054c;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x053e;	 Catch:{ all -> 0x09f3 }
        r0 = 2131887242; // 0x7f12048a float:1.9409086E38 double:1.053292247E-314;	 Catch:{ all -> 0x09f3 }
        r0 = r1.b(r0);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = r1.m;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x0543;	 Catch:{ all -> 0x09f3 }
        goto L_0x0516;	 Catch:{ all -> 0x09f3 }
        r0 = 2131887318; // 0x7f1204d6 float:1.940924E38 double:1.0532922846E-314;	 Catch:{ all -> 0x09f3 }
        r0 = r1.b(r0);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = "Failed requirement.";	 Catch:{ all -> 0x09f3 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x09f3 }
        r0 = r0.toString();	 Catch:{ all -> 0x09f3 }
        r2.<init>(r0);	 Catch:{ all -> 0x09f3 }
        r2 = (java.lang.Throwable) r2;	 Catch:{ all -> 0x09f3 }
        throw r2;	 Catch:{ all -> 0x09f3 }
        r0 = r18.o();	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x0569;	 Catch:{ all -> 0x09f3 }
        r0 = 2131887303; // 0x7f1204c7 float:1.940921E38 double:1.053292277E-314;	 Catch:{ all -> 0x09f3 }
        r0 = r1.b(r0);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = r1.l;	 Catch:{ all -> 0x09f3 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = r1.d;	 Catch:{ all -> 0x09f3 }
        r10 = defpackage.rbg.CALL_INCOMING;	 Catch:{ all -> 0x09f3 }
        if (r0 != r10) goto L_0x05ce;	 Catch:{ all -> 0x09f3 }
        r0 = r1.ad;	 Catch:{ all -> 0x09f3 }
        r10 = r18.b();	 Catch:{ all -> 0x09f3 }
        defpackage.akcr.b(r10, r9);	 Catch:{ all -> 0x09f3 }
        r0 = r0.a;	 Catch:{ all -> 0x09f3 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x09f3 }
        r0 = (defpackage.rbd) r0;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x0594;	 Catch:{ all -> 0x09f3 }
        r0 = r0.a;	 Catch:{ all -> 0x09f3 }
        r0 = com.google.common.base.MoreObjects.firstNonNull(r0, r12);	 Catch:{ all -> 0x09f3 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x09f3 }
        if (r0 != 0) goto L_0x0595;	 Catch:{ all -> 0x09f3 }
        r0 = r12;	 Catch:{ all -> 0x09f3 }
        r10 = 2131887264; // 0x7f1204a0 float:1.940913E38 double:1.053292258E-314;	 Catch:{ all -> 0x09f3 }
        r13 = 2131887248; // 0x7f120490 float:1.9409098E38 double:1.05329225E-314;	 Catch:{ all -> 0x09f3 }
        r14 = r1.ad;	 Catch:{ all -> 0x09f3 }
        r15 = r18.b();	 Catch:{ all -> 0x09f3 }
        defpackage.akcr.b(r15, r9);	 Catch:{ all -> 0x09f3 }
        r9 = r14.b(r15);	 Catch:{ all -> 0x09f3 }
        r14 = r9.isEmpty();	 Catch:{ all -> 0x09f3 }
        if (r14 == 0) goto L_0x05b0;	 Catch:{ all -> 0x09f3 }
        r9 = r12;	 Catch:{ all -> 0x09f3 }
        goto L_0x05b6;	 Catch:{ all -> 0x09f3 }
        r9 = r9.get(r3);	 Catch:{ all -> 0x09f3 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x09f3 }
        r9 = defpackage.rdt.a(r9, r0);	 Catch:{ all -> 0x09f3 }
        r14 = r1.ab;	 Catch:{ all -> 0x09f3 }
        r19 = r18;	 Catch:{ all -> 0x09f3 }
        r20 = r10;	 Catch:{ all -> 0x09f3 }
        r21 = r13;	 Catch:{ all -> 0x09f3 }
        r22 = r0;	 Catch:{ all -> 0x09f3 }
        r23 = r9;	 Catch:{ all -> 0x09f3 }
        r24 = r14;	 Catch:{ all -> 0x09f3 }
        r0 = r19.a(r20, r21, r22, r23, r24);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = r1.d;	 Catch:{ all -> 0x09f3 }
        r10 = defpackage.rbg.CALL_UPDATE;	 Catch:{ all -> 0x09f3 }
        r13 = ", ";
        if (r0 != r10) goto L_0x0602;
        r0 = 2131887260; // 0x7f12049c float:1.9409122E38 double:1.053292256E-314;
        r0 = r1.b(r0);	 Catch:{ all -> 0x09f3 }
        r9 = new java.lang.Object[r4];	 Catch:{ all -> 0x09f3 }
        r13 = (java.lang.CharSequence) r13;	 Catch:{ all -> 0x09f3 }
        r10 = r1.ad;	 Catch:{ all -> 0x09f3 }
        r14 = r18.b();	 Catch:{ all -> 0x09f3 }
        r10 = r10.b(r14);	 Catch:{ all -> 0x09f3 }
        r10 = (java.lang.Iterable) r10;	 Catch:{ all -> 0x09f3 }
        r10 = android.text.TextUtils.join(r13, r10);	 Catch:{ all -> 0x09f3 }
        r9[r3] = r10;	 Catch:{ all -> 0x09f3 }
        r9 = java.util.Arrays.copyOf(r9, r4);	 Catch:{ all -> 0x09f3 }
        r0 = java.lang.String.format(r0, r9);	 Catch:{ all -> 0x09f3 }
        r9 = "java.lang.String.format(format, *args)";	 Catch:{ all -> 0x09f3 }
        defpackage.akcr.a(r0, r9);	 Catch:{ all -> 0x09f3 }
        goto L_0x06a4;	 Catch:{ all -> 0x09f3 }
        r0 = r1.e;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x067f;	 Catch:{ all -> 0x09f3 }
        r0 = r1.ad;	 Catch:{ all -> 0x09f3 }
        r10 = r18.b();	 Catch:{ all -> 0x09f3 }
        defpackage.akcr.b(r10, r9);	 Catch:{ all -> 0x09f3 }
        r0 = r0.a;	 Catch:{ all -> 0x09f3 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x09f3 }
        r0 = (defpackage.rbd) r0;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x061d;	 Catch:{ all -> 0x09f3 }
        r0 = r0.e;	 Catch:{ all -> 0x09f3 }
        if (r0 != 0) goto L_0x0621;	 Catch:{ all -> 0x09f3 }
        r0 = defpackage.ajyw.a;	 Catch:{ all -> 0x09f3 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x09f3 }
        r10 = r0.size();	 Catch:{ all -> 0x09f3 }
        if (r10 <= r4) goto L_0x0645;	 Catch:{ all -> 0x09f3 }
        r9 = 2131887269; // 0x7f1204a5 float:1.940914E38 double:1.0532922604E-314;	 Catch:{ all -> 0x09f3 }
        r9 = r1.b(r9);	 Catch:{ all -> 0x09f3 }
        r10 = new java.lang.Object[r4];	 Catch:{ all -> 0x09f3 }
        r13 = (java.lang.CharSequence) r13;	 Catch:{ all -> 0x09f3 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x09f3 }
        r0 = android.text.TextUtils.join(r13, r0);	 Catch:{ all -> 0x09f3 }
        r10[r3] = r0;	 Catch:{ all -> 0x09f3 }
        r0 = java.util.Arrays.copyOf(r10, r4);	 Catch:{ all -> 0x09f3 }
        r0 = java.lang.String.format(r9, r0);	 Catch:{ all -> 0x09f3 }
        r9 = "java.lang.String.format(format, *args)";	 Catch:{ all -> 0x09f3 }
        goto L_0x05fd;	 Catch:{ all -> 0x09f3 }
        r0 = r1.g;	 Catch:{ all -> 0x09f3 }
        r10 = 2131887268; // 0x7f1204a4 float:1.9409138E38 double:1.05329226E-314;	 Catch:{ all -> 0x09f3 }
        r13 = 2131887249; // 0x7f120491 float:1.94091E38 double:1.0532922505E-314;	 Catch:{ all -> 0x09f3 }
        r14 = r1.ad;	 Catch:{ all -> 0x09f3 }
        r15 = r18.b();	 Catch:{ all -> 0x09f3 }
        defpackage.akcr.b(r15, r9);	 Catch:{ all -> 0x09f3 }
        r9 = r14.a(r15);	 Catch:{ all -> 0x09f3 }
        r9 = r9.b();	 Catch:{ all -> 0x09f3 }
        if (r9 != 0) goto L_0x0662;	 Catch:{ all -> 0x09f3 }
        r9 = r12;	 Catch:{ all -> 0x09f3 }
        goto L_0x0677;	 Catch:{ all -> 0x09f3 }
        r9 = r14.a;	 Catch:{ all -> 0x09f3 }
        r9 = r9.get(r15);	 Catch:{ all -> 0x09f3 }
        r9 = (defpackage.rbd) r9;	 Catch:{ all -> 0x09f3 }
        if (r9 == 0) goto L_0x0660;	 Catch:{ all -> 0x09f3 }
        r9 = r9.d;	 Catch:{ all -> 0x09f3 }
        r9 = com.google.common.base.MoreObjects.firstNonNull(r9, r12);	 Catch:{ all -> 0x09f3 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x09f3 }
        if (r9 != 0) goto L_0x0677;	 Catch:{ all -> 0x09f3 }
        goto L_0x0660;	 Catch:{ all -> 0x09f3 }
        r9 = defpackage.rdt.a(r9, r0);	 Catch:{ all -> 0x09f3 }
        r14 = r1.ab;	 Catch:{ all -> 0x09f3 }
        goto L_0x05bc;	 Catch:{ all -> 0x09f3 }
        r0 = r1.k;	 Catch:{ all -> 0x09f3 }
        if (r0 == 0) goto L_0x09d6;	 Catch:{ all -> 0x09f3 }
        r0 = r1.S;	 Catch:{ all -> 0x09f3 }
        r9 = r18.a();	 Catch:{ all -> 0x09f3 }
        r9 = r9.getResources();	 Catch:{ all -> 0x09f3 }
        r10 = r1.L;	 Catch:{ all -> 0x09f3 }
        r10 = r10.isGroup();	 Catch:{ all -> 0x09f3 }
        r13 = r1.j;	 Catch:{ all -> 0x09f3 }
        if (r13 == 0) goto L_0x069b;	 Catch:{ all -> 0x09f3 }
        r13 = r13.g;	 Catch:{ all -> 0x09f3 }
        if (r13 != 0) goto L_0x069c;	 Catch:{ all -> 0x09f3 }
        r13 = r12;	 Catch:{ all -> 0x09f3 }
        r0 = r0.a(r9, r10, r13);	 Catch:{ all -> 0x09f3 }
        r9 = "cognacFeedDataProvider.g…pInstanceInfo?.name?: \"\")";	 Catch:{ all -> 0x09f3 }
        goto L_0x05fd;
        defpackage.in.a();
        r1.y = r0;
        defpackage.in.a(r12);
        r0 = r1.e;	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06b8;	 Catch:{ all -> 0x09d1 }
        r0 = 2131099899; // 0x7f0600fb float:1.7812164E38 double:1.052903248E-314;	 Catch:{ all -> 0x09d1 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x09d1 }
        goto L_0x0729;	 Catch:{ all -> 0x09d1 }
        r0 = r1.k;	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06c4;	 Catch:{ all -> 0x09d1 }
        r0 = 2131099889; // 0x7f0600f1 float:1.7812144E38 double:1.052903243E-314;	 Catch:{ all -> 0x09d1 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x09d1 }
        goto L_0x0729;	 Catch:{ all -> 0x09d1 }
        r0 = r1.p;	 Catch:{ all -> 0x09d1 }
        r9 = 2131099903; // 0x7f0600ff float:1.7812172E38 double:1.05290325E-314;	 Catch:{ all -> 0x09d1 }
        r10 = 2131099902; // 0x7f0600fe float:1.781217E38 double:1.0529032494E-314;	 Catch:{ all -> 0x09d1 }
        if (r0 != 0) goto L_0x0714;	 Catch:{ all -> 0x09d1 }
        r0 = r1.al;	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06d3;	 Catch:{ all -> 0x09d1 }
        goto L_0x0714;	 Catch:{ all -> 0x09d1 }
        r0 = r1.l;	 Catch:{ all -> 0x09d1 }
        r0 = r0.b();	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06e0;	 Catch:{ all -> 0x09d1 }
        r0 = r1.a(r10);	 Catch:{ all -> 0x09d1 }
        goto L_0x0729;	 Catch:{ all -> 0x09d1 }
        r0 = r1.l;	 Catch:{ all -> 0x09d1 }
        r0 = r0.c();	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06ed;	 Catch:{ all -> 0x09d1 }
        r0 = r1.a(r9);	 Catch:{ all -> 0x09d1 }
        goto L_0x0729;	 Catch:{ all -> 0x09d1 }
        r0 = r1.l;	 Catch:{ all -> 0x09d1 }
        r0 = r0.d();	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06fa;	 Catch:{ all -> 0x09d1 }
        r0 = r1.al;	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06fa;	 Catch:{ all -> 0x09d1 }
        goto L_0x06db;	 Catch:{ all -> 0x09d1 }
        r0 = r1.l;	 Catch:{ all -> 0x09d1 }
        r0 = r0.e();	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x0707;	 Catch:{ all -> 0x09d1 }
        r0 = r1.al;	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x0707;	 Catch:{ all -> 0x09d1 }
        goto L_0x06e8;	 Catch:{ all -> 0x09d1 }
        r0 = r1.ai;	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x070c;	 Catch:{ all -> 0x09d1 }
        goto L_0x06b0;	 Catch:{ all -> 0x09d1 }
        r0 = 2131099892; // 0x7f0600f4 float:1.781215E38 double:1.0529032445E-314;	 Catch:{ all -> 0x09d1 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x09d1 }
        goto L_0x0729;	 Catch:{ all -> 0x09d1 }
        r0 = r1.c;	 Catch:{ all -> 0x09d1 }
        r13 = r1.L;	 Catch:{ all -> 0x09d1 }
        r13 = r13._id();	 Catch:{ all -> 0x09d1 }
        r0 = r0.a(r13);	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x070c;	 Catch:{ all -> 0x09d1 }
        r0 = r0.b();	 Catch:{ all -> 0x09d1 }
        if (r0 == 0) goto L_0x06e8;
        goto L_0x06db;
        defpackage.in.a();
        r1.z = r0;
        r0 = r1.ai;
        r1.A = r0;
        r0 = defpackage.ajxj.PUBLICATION;
        r9 = new rdt$d;
        r9.<init>(r1);
        r9 = (defpackage.akbk) r9;
        r0 = defpackage.ajxh.a(r0, r9);
        r1.as = r0;
        defpackage.in.a(r12);
        r0 = r1.d;	 Catch:{ all -> 0x09cc }
        r9 = "state";	 Catch:{ all -> 0x09cc }
        defpackage.akcr.b(r0, r9);	 Catch:{ all -> 0x09cc }
        r9 = defpackage.rbx.a;	 Catch:{ all -> 0x09cc }
        r0 = r0.ordinal();	 Catch:{ all -> 0x09cc }
        r0 = r9[r0];	 Catch:{ all -> 0x09cc }
        if (r0 == r4) goto L_0x076c;	 Catch:{ all -> 0x09cc }
        if (r0 == r7) goto L_0x0769;	 Catch:{ all -> 0x09cc }
        if (r0 == r6) goto L_0x0766;	 Catch:{ all -> 0x09cc }
        if (r0 == r5) goto L_0x0763;	 Catch:{ all -> 0x09cc }
        if (r0 == r2) goto L_0x0760;	 Catch:{ all -> 0x09cc }
        r0 = defpackage.rbw.NONE;	 Catch:{ all -> 0x09cc }
        goto L_0x076e;	 Catch:{ all -> 0x09cc }
        r0 = defpackage.rbw.CANCEL;	 Catch:{ all -> 0x09cc }
        goto L_0x076e;	 Catch:{ all -> 0x09cc }
        r0 = defpackage.rbw.RECEIVE;	 Catch:{ all -> 0x09cc }
        goto L_0x076e;	 Catch:{ all -> 0x09cc }
        r0 = defpackage.rbw.PAUSE;	 Catch:{ all -> 0x09cc }
        goto L_0x076e;	 Catch:{ all -> 0x09cc }
        r0 = defpackage.rbw.TYPING;	 Catch:{ all -> 0x09cc }
        goto L_0x076e;	 Catch:{ all -> 0x09cc }
        r0 = defpackage.rbw.ENTER;	 Catch:{ all -> 0x09cc }
        defpackage.in.a();
        r1.B = r0;
        r0 = r1.d;
        r2 = defpackage.rbg.CALL_INCOMING;
        if (r0 == r2) goto L_0x0784;
        r0 = r1.d;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0782;
        goto L_0x0784;
        r0 = 0;
        goto L_0x0785;
        r0 = 1;
        r1.at = r0;
        r0 = r1.ad;
        r2 = r18.b();
        r0 = r0.a(r2);
        r2 = defpackage.rbh.e;
        r0 = r0.ordinal();
        r0 = r2[r0];
        if (r0 == r4) goto L_0x079f;
        if (r0 == r7) goto L_0x079f;
        r0 = 0;
        goto L_0x07a0;
        r0 = 1;
        r1.C = r0;
        r0 = r1.af;
        if (r0 != 0) goto L_0x07c8;
        r0 = r18.w();
        if (r0 == 0) goto L_0x07b4;
        r0 = r1.l;
        r0 = r0.j();
        if (r0 == 0) goto L_0x07c8;
        r0 = r1.l;
        r2 = defpackage.iio.k;
        r0 = r0.ordinal();
        r0 = r2[r0];
        switch(r0) {
            case 1: goto L_0x07c3;
            case 2: goto L_0x07c3;
            case 3: goto L_0x07c3;
            case 4: goto L_0x07c3;
            case 5: goto L_0x07c3;
            case 6: goto L_0x07c3;
            default: goto L_0x07c1;
        };
        r0 = 0;
        goto L_0x07c4;
        r0 = 1;
        if (r0 != 0) goto L_0x07c8;
        r0 = 1;
        goto L_0x07c9;
        r0 = 0;
        r1.au = r0;
        r0 = defpackage.ajxj.PUBLICATION;
        r2 = new rdt$c;
        r2.<init>(r1);
        r2 = (defpackage.akbk) r2;
        r0 = defpackage.ajxh.a(r0, r2);
        r1.av = r0;
        r0 = r1.ai;
        if (r0 == 0) goto L_0x07e7;
        r0 = r18.a();
        r0 = defpackage.zki.a(r0, r4);
        goto L_0x07ef;
        r0 = r18.a();
        r0 = defpackage.zki.a(r0, r3);
        r1.aw = r0;
        r0 = r1.ai;
        if (r0 == 0) goto L_0x07f9;
        r0 = 2131099887; // 0x7f0600ef float:1.781214E38 double:1.052903242E-314;
        goto L_0x07fc;
        r0 = 2131099891; // 0x7f0600f3 float:1.7812148E38 double:1.052903244E-314;
        r0 = r1.a(r0);
        r1.ax = r0;
        defpackage.in.a(r12);
        r0 = r1.P;	 Catch:{ all -> 0x09c7 }
        r2 = r18.B();	 Catch:{ all -> 0x09c7 }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ all -> 0x09c7 }
        r5 = r1.J;	 Catch:{ all -> 0x09c7 }
        r5 = r5.g;	 Catch:{ all -> 0x09c7 }
        r9 = 0;	 Catch:{ all -> 0x09c7 }
        r10 = 4;	 Catch:{ all -> 0x09c7 }
        r13 = 0;	 Catch:{ all -> 0x09c7 }
        r19 = r0;	 Catch:{ all -> 0x09c7 }
        r20 = r2;	 Catch:{ all -> 0x09c7 }
        r21 = r5;	 Catch:{ all -> 0x09c7 }
        r22 = r9;	 Catch:{ all -> 0x09c7 }
        r23 = r10;	 Catch:{ all -> 0x09c7 }
        r24 = r13;	 Catch:{ all -> 0x09c7 }
        r0 = com.snap.ui.view.emoji.SnapEmojiSpanFactory.convert$default(r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x09c7 }
        r2 = "null";	 Catch:{ all -> 0x09c7 }
        r2 = defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x09c7 }
        if (r2 == 0) goto L_0x0864;	 Catch:{ all -> 0x09c7 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x09c7 }
        r2 = "Invalid string returned. friendmojiCategories=(";	 Catch:{ all -> 0x09c7 }
        r0.<init>(r2);	 Catch:{ all -> 0x09c7 }
        r2 = r1.L;	 Catch:{ all -> 0x09c7 }
        r2 = r2.friendmojiCategories();	 Catch:{ all -> 0x09c7 }
        r0.append(r2);	 Catch:{ all -> 0x09c7 }
        r2 = 41;	 Catch:{ all -> 0x09c7 }
        r0.append(r2);	 Catch:{ all -> 0x09c7 }
        r0 = r0.toString();	 Catch:{ all -> 0x09c7 }
        r2 = r1.R;	 Catch:{ all -> 0x09c7 }
        r2 = r2.get();	 Catch:{ all -> 0x09c7 }
        r2 = (defpackage.gqr) r2;	 Catch:{ all -> 0x09c7 }
        r5 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x09c7 }
        r9 = new com.snap.ui.view.emoji.InvalidEmojiException;	 Catch:{ all -> 0x09c7 }
        r9.<init>(r0, r11, r7, r11);	 Catch:{ all -> 0x09c7 }
        r9 = (java.lang.Throwable) r9;	 Catch:{ all -> 0x09c7 }
        r0 = r1.W;	 Catch:{ all -> 0x09c7 }
        r0 = r0.b();	 Catch:{ all -> 0x09c7 }
        r0 = (defpackage.idd) r0;	 Catch:{ all -> 0x09c7 }
        r2.a(r5, r9, r0);	 Catch:{ all -> 0x09c7 }
        r0 = r12;	 Catch:{ all -> 0x09c7 }
        r0 = (java.lang.CharSequence) r0;	 Catch:{ all -> 0x09c7 }
        defpackage.in.a();
        r1.D = r0;
        defpackage.in.a(r12);
        r0 = new zns;	 Catch:{ all -> 0x09c2 }
        r0.<init>();	 Catch:{ all -> 0x09c2 }
        r2 = r18.m();	 Catch:{ all -> 0x09c2 }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ all -> 0x09c2 }
        r5 = new java.lang.Object[r6];	 Catch:{ all -> 0x09c2 }
        r6 = new znt;	 Catch:{ all -> 0x09c2 }
        r9 = r1.aw;	 Catch:{ all -> 0x09c2 }
        r10 = "primaryTextTypeface";	 Catch:{ all -> 0x09c2 }
        defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x09c2 }
        r6.<init>(r9);	 Catch:{ all -> 0x09c2 }
        r5[r3] = r6;	 Catch:{ all -> 0x09c2 }
        r6 = r1.ax;	 Catch:{ all -> 0x09c2 }
        r6 = defpackage.zns.a(r6);	 Catch:{ all -> 0x09c2 }
        r5[r4] = r6;	 Catch:{ all -> 0x09c2 }
        r6 = new android.text.style.AbsoluteSizeSpan;	 Catch:{ all -> 0x09c2 }
        r9 = r1.J;	 Catch:{ all -> 0x09c2 }
        r9 = r9.d;	 Catch:{ all -> 0x09c2 }
        r6.<init>(r9);	 Catch:{ all -> 0x09c2 }
        r5[r7] = r6;	 Catch:{ all -> 0x09c2 }
        r0.a(r2, r5);	 Catch:{ all -> 0x09c2 }
        r2 = r1.L;	 Catch:{ all -> 0x09c2 }
        r2 = r2.isOfficial();	 Catch:{ all -> 0x09c2 }
        if (r2 == 0) goto L_0x08aa;	 Catch:{ all -> 0x09c2 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x09c2 }
        goto L_0x08ab;	 Catch:{ all -> 0x09c2 }
        r2 = 0;	 Catch:{ all -> 0x09c2 }
        if (r2 == 0) goto L_0x08c4;	 Catch:{ all -> 0x09c2 }
        r2 = "  ";	 Catch:{ all -> 0x09c2 }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ all -> 0x09c2 }
        r5 = new java.lang.Object[r3];	 Catch:{ all -> 0x09c2 }
        r0.a(r2, r5);	 Catch:{ all -> 0x09c2 }
        r2 = new znq;	 Catch:{ all -> 0x09c2 }
        r5 = r1.J;	 Catch:{ all -> 0x09c2 }
        r5 = r5.c;	 Catch:{ all -> 0x09c2 }
        r2.<init>(r5, r7);	 Catch:{ all -> 0x09c2 }
        r2 = (android.text.style.MetricAffectingSpan) r2;	 Catch:{ all -> 0x09c2 }
        r0.a(r2);	 Catch:{ all -> 0x09c2 }
        r0 = r0.a();	 Catch:{ all -> 0x09c2 }
        r0 = (android.text.Spanned) r0;	 Catch:{ all -> 0x09c2 }
        defpackage.in.a();
        r1.E = r0;
        r0 = r1.ap;
        if (r0 == 0) goto L_0x08f2;
        r0 = r1.Q;
        r2 = 2131887317; // 0x7f1204d5 float:1.9409238E38 double:1.053292284E-314;
        r2 = r1.b(r2);
        r2 = r1.a(r2, r3);
        r4 = 2131887289; // 0x7f1204b9 float:1.940918E38 double:1.0532922703E-314;
        r4 = r1.b(r4);
        r3 = r1.a(r4, r3);
        r0 = r0.a(r2, r3);
        r0 = (defpackage.rba) r0;
        goto L_0x096f;
        r0 = r1.aq;
        if (r0 == 0) goto L_0x0930;
        r0 = r1.Q;
        r2 = 2131887236; // 0x7f120484 float:1.9409073E38 double:1.053292244E-314;
        r2 = r1.b(r2);
        r2 = r1.a(r2, r3);
        r4 = r1.y;
        r4 = r1.a(r4, r1.au);
        r5 = "firstText";
        defpackage.akcr.b(r2, r5);
        r5 = "secondText";
        defpackage.akcr.b(r4, r5);
        r5 = r0.a;
        if (r5 != 0) goto L_0x091e;
        r5 = new rau;
        r6 = r0.b;
        r5.<init>(r3, r6, r11, r8);
        r0.a = r5;
        r3 = new rbb;
        r0 = r0.a;
        if (r0 != 0) goto L_0x0929;
        defpackage.akcr.a();
        r3.<init>(r2, r4, r0);
        r0 = r3;
        r0 = (defpackage.rba) r0;
        goto L_0x096f;
        r0 = r1.L;
        r0 = r0.isGroup();
        if (r0 == 0) goto L_0x093d;
        r0 = r1.k;
        if (r0 == 0) goto L_0x093d;
        r3 = 1;
        if (r3 == 0) goto L_0x096e;
        r0 = r1.Q;
        r2 = r1.y;
        r2 = r1.a(r2, r1.au);
        r3 = r1.ad;
        r4 = r18.b();
        r3 = r3.c(r4);
        r4 = r1.S;
        r5 = r18.a();
        r5 = r5.getResources();
        r6 = r3.size();
        r3 = r4.a(r5, r6, r3);
        r4 = "cognacFeedDataProvider.g…size, cognacParticipants)";
        defpackage.akcr.a(r3, r4);
        r3 = r1.a(r3, r1.au);
        goto L_0x08eb;
        r0 = r11;
        r1.F = r0;
        r0 = r1.F;
        if (r0 == 0) goto L_0x0977;
        r0 = r11;
        goto L_0x097d;
        r0 = r1.y;
        r0 = r1.a(r0, r1.au);
        r1.G = r0;
        r0 = r1.L;
        r0 = r0.storyRowId();
        if (r0 == 0) goto L_0x09a3;
        r0 = (java.lang.Number) r0;
        r2 = r0.longValue();
        r0 = r1.L;
        r0 = r0.storyLatestTimestamp();
        if (r0 == 0) goto L_0x099a;
        r4 = r0.longValue();
        goto L_0x099c;
        r4 = 0;
        r0 = defpackage.yjv.CAROUSEL_MEDIUM_SQUARE;
        r0 = defpackage.yjl.a(r2, r4, r0);
        goto L_0x09a4;
        r0 = r11;
        r1.ay = r0;
        r0 = r18.g();
        if (r0 == 0) goto L_0x09bf;
        r2 = defpackage.yjv.CAROUSEL_MEDIUM_SQUARE;
        r3 = r18.s();
        if (r3 == 0) goto L_0x09b9;
        r3 = r3.longValue();
        goto L_0x09bb;
        r3 = 0;
        r11 = defpackage.yjl.a(r0, r2, r3);
        r1.az = r11;
        return;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x09f3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x09f3 }
        r3 = "ConversationState: ";	 Catch:{ all -> 0x09f3 }
        r2.<init>(r3);	 Catch:{ all -> 0x09f3 }
        r3 = r1.d;	 Catch:{ all -> 0x09f3 }
        r2.append(r3);	 Catch:{ all -> 0x09f3 }
        r3 = " is illegal.";	 Catch:{ all -> 0x09f3 }
        r2.append(r3);	 Catch:{ all -> 0x09f3 }
        r2 = r2.toString();	 Catch:{ all -> 0x09f3 }
        r0.<init>(r2);	 Catch:{ all -> 0x09f3 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x09f3 }
        throw r0;	 Catch:{ all -> 0x09f3 }
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdt.<init>(android.content.Context, ajdw, boolean, rdw, rdx, com.snap.core.db.query.LegacyFriendsFeedQueries$WithFriendAndStory, reb, ihi, ihh, com.snap.ui.view.emoji.SnapEmojiSpanFactory, rbb$a, ajwy, eyn, boolean, ras):void");
    }

    private final String A() {
        Object friendDisplayName;
        String str;
        if (!TextUtils.isEmpty(this.L.friendDisplayName())) {
            friendDisplayName = this.L.friendDisplayName();
            if (friendDisplayName == null) {
                akcr.a();
            }
            str = "record.friendDisplayName()!!";
        } else if (TextUtils.isEmpty(this.L.friendUsername())) {
            return "";
        } else {
            friendDisplayName = this.L.friendUsername();
            if (friendDisplayName == null) {
                akcr.a();
            }
            str = "record.friendUsername()!!";
        }
        akcr.a(friendDisplayName, str);
        return friendDisplayName;
    }

    /* JADX WARNING: Missing block: B:16:0x00a0, code skipped:
            if (r0 == null) goto L_0x00a2;
     */
    private final java.lang.String B() {
        /*
        r10 = this;
        r0 = r10.L;
        r0 = r0.isGroup();
        r1 = "";
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = r10.L;
        r0 = r0.friendmojiCategories();
        if (r0 == 0) goto L_0x00a2;
    L_0x0013:
        r2 = "it";
        defpackage.akcr.a(r0, r2);
        r0 = (java.lang.CharSequence) r0;
        r2 = ",";
        r2 = new java.lang.String[]{r2};
        r3 = 0;
        r4 = 6;
        r0 = defpackage.akgc.a(r0, r2, r3, r4);
        r0 = (java.lang.Iterable) r0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r2 = (java.util.Collection) r2;
        r0 = r0.iterator();
    L_0x0033:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0052;
    L_0x0039:
        r3 = r0.next();
        r4 = r3;
        r4 = (java.lang.String) r4;
        r5 = com.snap.core.db.column.FriendmojiCategory.STREAK;
        r5 = r5.getCategory();
        r4 = defpackage.akcr.a(r4, r5);
        r4 = r4 ^ 1;
        if (r4 == 0) goto L_0x0033;
    L_0x004e:
        r2.add(r3);
        goto L_0x0033;
    L_0x0052:
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r0 = new java.util.ArrayList;
        r3 = 10;
        r3 = defpackage.ajyn.a(r2, r3);
        r0.<init>(r3);
        r0 = (java.util.Collection) r0;
        r2 = r2.iterator();
    L_0x0067:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x007f;
    L_0x006d:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = r10.Z;
        r3 = r4.get(r3);
        r3 = (java.lang.String) r3;
        r0.add(r3);
        goto L_0x0067;
    L_0x007f:
        r0 = (java.util.List) r0;
        r2 = r0;
        r2 = (java.lang.Iterable) r2;
        r3 = r1;
        r3 = (java.lang.CharSequence) r3;
        r0 = r10.L;
        r0 = r0.birthday();
        r4 = r10.O;
        r0 = defpackage.jjj.a(r0, r4);
        r4 = r0;
        r4 = (java.lang.CharSequence) r4;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 60;
        r0 = defpackage.ajyu.a(r2, r3, r4, r5, r6, r7, r8, r9);
        if (r0 != 0) goto L_0x00a3;
    L_0x00a2:
        r0 = r1;
    L_0x00a3:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdt.B():java.lang.String");
    }

    private final int a(int i) {
        return this.J.b(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0105 A:{Catch:{ all -> 0x0146 }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0102 A:{Catch:{ all -> 0x0146 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010c A:{Catch:{ all -> 0x0146 }} */
    private final java.lang.CharSequence a(java.lang.String r20, boolean r21) {
        /*
        r19 = this;
        r1 = r19;
        r0 = "";
        defpackage.in.a(r0);
        r0 = new zns;	 Catch:{ all -> 0x0146 }
        r0.<init>();	 Catch:{ all -> 0x0146 }
        r2 = r1.u;	 Catch:{ all -> 0x0146 }
        r3 = 8;
        r4 = 0;
        if (r2 == r3) goto L_0x001d;
    L_0x0013:
        r2 = new android.text.style.LeadingMarginSpan$Standard;	 Catch:{ all -> 0x0146 }
        r3 = r1.J;	 Catch:{ all -> 0x0146 }
        r3 = r3.f;	 Catch:{ all -> 0x0146 }
        r2.<init>(r3);	 Catch:{ all -> 0x0146 }
        goto L_0x001e;
    L_0x001d:
        r2 = r4;
    L_0x001e:
        r3 = r1.at;	 Catch:{ all -> 0x0146 }
        r5 = 3;
        r6 = "secondaryTextTypeface";
        r7 = 4;
        r8 = 2;
        r9 = 1;
        r10 = 0;
        if (r3 == 0) goto L_0x005e;
    L_0x0029:
        r3 = r20;
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x0146 }
        r11 = 5;
        r11 = new java.lang.Object[r11];	 Catch:{ all -> 0x0146 }
        r12 = r1.z;	 Catch:{ all -> 0x0146 }
        r12 = defpackage.zns.a(r12);	 Catch:{ all -> 0x0146 }
        r11[r10] = r12;	 Catch:{ all -> 0x0146 }
        r12 = new znt;	 Catch:{ all -> 0x0146 }
        r13 = r19.k();	 Catch:{ all -> 0x0146 }
        defpackage.akcr.a(r13, r6);	 Catch:{ all -> 0x0146 }
        r12.<init>(r13);	 Catch:{ all -> 0x0146 }
        r11[r9] = r12;	 Catch:{ all -> 0x0146 }
        r6 = new android.text.style.AbsoluteSizeSpan;	 Catch:{ all -> 0x0146 }
        r12 = r1.J;	 Catch:{ all -> 0x0146 }
        r12 = r12.e;	 Catch:{ all -> 0x0146 }
        r6.<init>(r12, r10);	 Catch:{ all -> 0x0146 }
        r11[r8] = r6;	 Catch:{ all -> 0x0146 }
        r6 = new ray;	 Catch:{ all -> 0x0146 }
        r6.<init>();	 Catch:{ all -> 0x0146 }
        r11[r5] = r6;	 Catch:{ all -> 0x0146 }
        r11[r7] = r2;	 Catch:{ all -> 0x0146 }
        r0.a(r3, r11);	 Catch:{ all -> 0x0146 }
        goto L_0x008a;
    L_0x005e:
        r3 = r20;
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x0146 }
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x0146 }
        r11 = r1.z;	 Catch:{ all -> 0x0146 }
        r11 = defpackage.zns.a(r11);	 Catch:{ all -> 0x0146 }
        r7[r10] = r11;	 Catch:{ all -> 0x0146 }
        r11 = new znt;	 Catch:{ all -> 0x0146 }
        r12 = r19.k();	 Catch:{ all -> 0x0146 }
        defpackage.akcr.a(r12, r6);	 Catch:{ all -> 0x0146 }
        r11.<init>(r12);	 Catch:{ all -> 0x0146 }
        r7[r9] = r11;	 Catch:{ all -> 0x0146 }
        r6 = new android.text.style.AbsoluteSizeSpan;	 Catch:{ all -> 0x0146 }
        r11 = r1.J;	 Catch:{ all -> 0x0146 }
        r11 = r11.e;	 Catch:{ all -> 0x0146 }
        r6.<init>(r11, r10);	 Catch:{ all -> 0x0146 }
        r7[r8] = r6;	 Catch:{ all -> 0x0146 }
        r7[r5] = r2;	 Catch:{ all -> 0x0146 }
        r0.a(r3, r7);	 Catch:{ all -> 0x0146 }
    L_0x008a:
        if (r21 == 0) goto L_0x00b2;
    L_0x008c:
        r1.a(r0);	 Catch:{ all -> 0x0146 }
        r2 = r19.y();	 Catch:{ all -> 0x0146 }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ all -> 0x0146 }
        r3 = new java.lang.Object[r8];	 Catch:{ all -> 0x0146 }
        r5 = 2131099892; // 0x7f0600f4 float:1.781215E38 double:1.0529032445E-314;
        r5 = r1.a(r5);	 Catch:{ all -> 0x0146 }
        r5 = defpackage.zns.a(r5);	 Catch:{ all -> 0x0146 }
        r3[r10] = r5;	 Catch:{ all -> 0x0146 }
        r5 = new android.text.style.AbsoluteSizeSpan;	 Catch:{ all -> 0x0146 }
        r6 = r1.J;	 Catch:{ all -> 0x0146 }
        r6 = r6.e;	 Catch:{ all -> 0x0146 }
        r5.<init>(r6, r10);	 Catch:{ all -> 0x0146 }
        r3[r9] = r5;	 Catch:{ all -> 0x0146 }
        r0.a(r2, r3);	 Catch:{ all -> 0x0146 }
    L_0x00b2:
        r2 = r19.u();	 Catch:{ all -> 0x0146 }
        if (r2 == 0) goto L_0x013a;
    L_0x00b8:
        r1.a(r0);	 Catch:{ all -> 0x0146 }
        r2 = r1.Z;	 Catch:{ all -> 0x0146 }
        r3 = com.snap.core.db.column.FriendmojiCategory.STREAK;	 Catch:{ all -> 0x0146 }
        r5 = r1.O;	 Catch:{ all -> 0x0146 }
        r6 = r1.L;	 Catch:{ all -> 0x0146 }
        r6 = r6.streakLength();	 Catch:{ all -> 0x0146 }
        r7 = r1.L;	 Catch:{ all -> 0x0146 }
        r7 = r7.streakExpiration();	 Catch:{ all -> 0x0146 }
        r11 = r1.O;	 Catch:{ all -> 0x0146 }
        r11 = r11.a();	 Catch:{ all -> 0x0146 }
        r13 = java.util.concurrent.TimeUnit.HOURS;	 Catch:{ all -> 0x0146 }
        r14 = 6;
        r13 = r13.toMillis(r14);	 Catch:{ all -> 0x0146 }
        if (r7 == 0) goto L_0x00e2;
    L_0x00dd:
        r15 = r7.longValue();	 Catch:{ all -> 0x0146 }
        goto L_0x00e4;
    L_0x00e2:
        r15 = -9223372036854775808;
    L_0x00e4:
        if (r7 == 0) goto L_0x00ed;
    L_0x00e6:
        r17 = r7.longValue();	 Catch:{ all -> 0x0146 }
        r17 = r17 - r13;
        goto L_0x00f2;
    L_0x00ed:
        r17 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x00f2:
        r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1));
        if (r7 <= 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00fd;
    L_0x00f7:
        r7 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1));
        if (r7 < 0) goto L_0x00fd;
    L_0x00fb:
        r7 = 1;
        goto L_0x00fe;
    L_0x00fd:
        r7 = 0;
    L_0x00fe:
        r13 = 0;
        if (r7 != r9) goto L_0x0105;
    L_0x0102:
        r11 = r15 - r11;
        goto L_0x0108;
    L_0x0105:
        if (r7 != 0) goto L_0x0134;
    L_0x0107:
        r11 = r13;
    L_0x0108:
        r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r7 <= 0) goto L_0x0110;
    L_0x010c:
        r4 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0146 }
    L_0x0110:
        r2 = defpackage.jjj.a(r2, r3, r5, r6, r4);	 Catch:{ all -> 0x0146 }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ all -> 0x0146 }
        r3 = new java.lang.Object[r8];	 Catch:{ all -> 0x0146 }
        r4 = 2131099897; // 0x7f0600f9 float:1.781216E38 double:1.052903247E-314;
        r4 = r1.a(r4);	 Catch:{ all -> 0x0146 }
        r4 = defpackage.zns.a(r4);	 Catch:{ all -> 0x0146 }
        r3[r10] = r4;	 Catch:{ all -> 0x0146 }
        r4 = new android.text.style.AbsoluteSizeSpan;	 Catch:{ all -> 0x0146 }
        r5 = r1.J;	 Catch:{ all -> 0x0146 }
        r5 = r5.e;	 Catch:{ all -> 0x0146 }
        r4.<init>(r5, r10);	 Catch:{ all -> 0x0146 }
        r3[r9] = r4;	 Catch:{ all -> 0x0146 }
        r0.a(r2, r3);	 Catch:{ all -> 0x0146 }
        goto L_0x013a;
    L_0x0134:
        r0 = new ajxk;	 Catch:{ all -> 0x0146 }
        r0.<init>();	 Catch:{ all -> 0x0146 }
        throw r0;	 Catch:{ all -> 0x0146 }
    L_0x013a:
        r0 = r0.a();	 Catch:{ all -> 0x0146 }
        r0 = (android.text.Spanned) r0;	 Catch:{ all -> 0x0146 }
        defpackage.in.a();
        r0 = (java.lang.CharSequence) r0;
        return r0;
    L_0x0146:
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdt.a(java.lang.String, boolean):java.lang.CharSequence");
    }

    private final String a(int i, int i2, String str, String str2, String str3) {
        String string;
        in.a("");
        if (str != null) {
            try {
                if (!(TextUtils.equals(str, str3) || TextUtils.equals(str, "system_user_id") || !this.L.isGroup())) {
                    if ((this.L.participantsSize() == 2 ? 1 : null) == null) {
                        Resources resources = a().getResources();
                        Object[] objArr = new Object[1];
                        if (str2 != null) {
                            str = str2;
                        }
                        objArr[0] = str;
                        string = resources.getString(i, objArr);
                        akcr.a((Object) string, "context.resources.getStr…stName ?: senderUsername)");
                        in.a();
                        return string;
                    }
                }
            } catch (Throwable th) {
                in.a();
            }
        }
        string = b(i2);
        in.a();
        return string;
    }

    private static String a(WithFriendAndStory withFriendAndStory) {
        in.a("clifn");
        try {
            String displayInteractionUserDisplayName = withFriendAndStory.displayInteractionUserDisplayName();
            String displayInteractionUserUsername = withFriendAndStory.displayInteractionUserUsername();
            if (displayInteractionUserDisplayName != null) {
                displayInteractionUserDisplayName = rdt.a(displayInteractionUserDisplayName, displayInteractionUserUsername);
                if (displayInteractionUserDisplayName != null) {
                    displayInteractionUserUsername = displayInteractionUserDisplayName;
                }
            }
            in.a();
            return displayInteractionUserUsername;
        } catch (Throwable th) {
            in.a();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x0117 in {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 29, 32} preds:[]
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
    private final java.lang.String a(defpackage.iin r7) {
        /*
        r6 = this;
        r0 = "";
        defpackage.in.a(r0);
        r0 = defpackage.rdu.b;	 Catch:{ all -> 0x0112 }
        r7 = r7.ordinal();	 Catch:{ all -> 0x0112 }
        r7 = r0[r7];	 Catch:{ all -> 0x0112 }
        switch(r7) {
            case 1: goto L_0x0107;
            case 2: goto L_0x0107;
            case 3: goto L_0x00ff;
            case 4: goto L_0x00f7;
            case 5: goto L_0x00ef;
            case 6: goto L_0x00e7;
            case 7: goto L_0x00df;
            case 8: goto L_0x00df;
            case 9: goto L_0x00df;
            case 10: goto L_0x00df;
            case 11: goto L_0x00df;
            case 12: goto L_0x00df;
            case 13: goto L_0x00cd;
            case 14: goto L_0x00cd;
            case 15: goto L_0x00cd;
            case 16: goto L_0x00cd;
            case 17: goto L_0x00cd;
            case 18: goto L_0x00cd;
            case 19: goto L_0x00cd;
            case 20: goto L_0x00cd;
            case 21: goto L_0x00bb;
            case 22: goto L_0x00bb;
            case 23: goto L_0x00bb;
            case 24: goto L_0x00bb;
            case 25: goto L_0x00bb;
            case 26: goto L_0x00bb;
            case 27: goto L_0x00bb;
            case 28: goto L_0x00bb;
            case 29: goto L_0x00aa;
            case 30: goto L_0x00aa;
            case 31: goto L_0x00aa;
            case 32: goto L_0x00aa;
            case 33: goto L_0x00a2;
            case 34: goto L_0x00a2;
            case 35: goto L_0x00a2;
            case 36: goto L_0x00a2;
            case 37: goto L_0x00a2;
            case 38: goto L_0x00a2;
            case 39: goto L_0x0091;
            case 40: goto L_0x0091;
            case 41: goto L_0x0091;
            case 42: goto L_0x0091;
            case 43: goto L_0x0091;
            case 44: goto L_0x0091;
            case 45: goto L_0x0091;
            case 46: goto L_0x0091;
            case 47: goto L_0x0089;
            case 48: goto L_0x0080;
            case 49: goto L_0x0080;
            case 50: goto L_0x0080;
            case 51: goto L_0x0080;
            case 52: goto L_0x0080;
            case 53: goto L_0x0077;
            case 54: goto L_0x0077;
            case 55: goto L_0x006e;
            case 56: goto L_0x006e;
            case 57: goto L_0x006e;
            case 58: goto L_0x006e;
            case 59: goto L_0x0065;
            case 60: goto L_0x005c;
            case 61: goto L_0x005c;
            case 62: goto L_0x005c;
            case 63: goto L_0x0053;
            case 64: goto L_0x0053;
            case 65: goto L_0x0053;
            case 66: goto L_0x0042;
            case 67: goto L_0x0042;
            case 68: goto L_0x002b;
            case 69: goto L_0x002b;
            case 70: goto L_0x002b;
            case 71: goto L_0x0022;
            case 72: goto L_0x0022;
            case 73: goto L_0x0022;
            case 74: goto L_0x0022;
            case 75: goto L_0x0019;
            case 76: goto L_0x0019;
            case 77: goto L_0x0019;
            case 78: goto L_0x0019;
            default: goto L_0x0010;
        };	 Catch:{ all -> 0x0112 }
        r7 = 2131887317; // 0x7f1204d5 float:1.9409238E38 double:1.053292284E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887224; // 0x7f120478 float:1.940905E38 double:1.053292238E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887270; // 0x7f1204a6 float:1.9409142E38 double:1.053292261E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r1 = 2131887231; // 0x7f12047f float:1.9409063E38 double:1.0532922416E-314;	 Catch:{ all -> 0x0112 }
        r2 = 2131887225; // 0x7f120479 float:1.9409051E38 double:1.0532922387E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.L;	 Catch:{ all -> 0x0112 }
        r3 = r7.displayInteractionUserUsername();	 Catch:{ all -> 0x0112 }
        r4 = r6.ar;	 Catch:{ all -> 0x0112 }
        r5 = r6.ab;	 Catch:{ all -> 0x0112 }
        r0 = r6;	 Catch:{ all -> 0x0112 }
        r7 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r1 = 2131887233; // 0x7f120481 float:1.9409067E38 double:1.0532922426E-314;	 Catch:{ all -> 0x0112 }
        r2 = 2131887305; // 0x7f1204c9 float:1.9409213E38 double:1.053292278E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.L;	 Catch:{ all -> 0x0112 }
        r3 = r7.displayInteractionUserUsername();	 Catch:{ all -> 0x0112 }
        r4 = r6.ar;	 Catch:{ all -> 0x0112 }
        r5 = r6.ab;	 Catch:{ all -> 0x0112 }
        goto L_0x003b;	 Catch:{ all -> 0x0112 }
        r7 = 2131887267; // 0x7f1204a3 float:1.9409136E38 double:1.0532922594E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887266; // 0x7f1204a2 float:1.9409134E38 double:1.053292259E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887263; // 0x7f12049f float:1.9409128E38 double:1.0532922575E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887262; // 0x7f12049e float:1.9409126E38 double:1.053292257E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887261; // 0x7f12049d float:1.9409124E38 double:1.0532922565E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887271; // 0x7f1204a7 float:1.9409144E38 double:1.0532922614E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887296; // 0x7f1204c0 float:1.9409195E38 double:1.053292274E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r1 = 2131887229; // 0x7f12047d float:1.940906E38 double:1.0532922407E-314;	 Catch:{ all -> 0x0112 }
        r2 = 2131887297; // 0x7f1204c1 float:1.9409197E38 double:1.0532922743E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.L;	 Catch:{ all -> 0x0112 }
        r3 = r7.displayInteractionUserUsername();	 Catch:{ all -> 0x0112 }
        r4 = r6.ar;	 Catch:{ all -> 0x0112 }
        r5 = r6.ab;	 Catch:{ all -> 0x0112 }
        goto L_0x003b;	 Catch:{ all -> 0x0112 }
        r7 = 2131887284; // 0x7f1204b4 float:1.940917E38 double:1.053292268E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r1 = 2131887301; // 0x7f1204c5 float:1.9409205E38 double:1.053292276E-314;	 Catch:{ all -> 0x0112 }
        r2 = 2131887302; // 0x7f1204c6 float:1.9409207E38 double:1.0532922767E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.L;	 Catch:{ all -> 0x0112 }
        r3 = r7.displayInteractionUserUsername();	 Catch:{ all -> 0x0112 }
        r4 = r6.ar;	 Catch:{ all -> 0x0112 }
        r5 = r6.ab;	 Catch:{ all -> 0x0112 }
        goto L_0x003b;	 Catch:{ all -> 0x0112 }
        r1 = 2131887232; // 0x7f120480 float:1.9409065E38 double:1.053292242E-314;	 Catch:{ all -> 0x0112 }
        r2 = 2131887304; // 0x7f1204c8 float:1.9409211E38 double:1.0532922777E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.L;	 Catch:{ all -> 0x0112 }
        r3 = r7.displayInteractionUserUsername();	 Catch:{ all -> 0x0112 }
        r4 = r6.ar;	 Catch:{ all -> 0x0112 }
        r5 = r6.ab;	 Catch:{ all -> 0x0112 }
        goto L_0x003b;	 Catch:{ all -> 0x0112 }
        r1 = 2131887233; // 0x7f120481 float:1.9409067E38 double:1.0532922426E-314;	 Catch:{ all -> 0x0112 }
        r2 = 2131887305; // 0x7f1204c9 float:1.9409213E38 double:1.053292278E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.L;	 Catch:{ all -> 0x0112 }
        r3 = r7.displayInteractionUserUsername();	 Catch:{ all -> 0x0112 }
        r4 = r6.ar;	 Catch:{ all -> 0x0112 }
        r5 = r6.ab;	 Catch:{ all -> 0x0112 }
        goto L_0x003b;	 Catch:{ all -> 0x0112 }
        r7 = 2131887235; // 0x7f120483 float:1.9409071E38 double:1.0532922436E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887241; // 0x7f120489 float:1.9409084E38 double:1.0532922466E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887240; // 0x7f120488 float:1.9409081E38 double:1.053292246E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887322; // 0x7f1204da float:1.9409248E38 double:1.0532922866E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887286; // 0x7f1204b6 float:1.9409175E38 double:1.053292269E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        goto L_0x010e;	 Catch:{ all -> 0x0112 }
        r7 = 2131887307; // 0x7f1204cb float:1.9409217E38 double:1.053292279E-314;	 Catch:{ all -> 0x0112 }
        r7 = r6.b(r7);	 Catch:{ all -> 0x0112 }
        defpackage.in.a();
        return r7;
        r7 = move-exception;
        defpackage.in.a();
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdt.a(iin):java.lang.String");
    }

    private static String a(String str, String str2) {
        CharSequence charSequence = str;
        if ((charSequence.length() == 0 ? 1 : null) != null) {
            return str2;
        }
        str = (String) ajyu.g(akgc.a(charSequence, new String[]{" "}, 0, 6));
        if (str == null) {
            str = str2;
        }
        return str;
    }

    private final void a(zns zns) {
        String str = "  ";
        in.a("");
        try {
            zns.a(str, new Object[0]);
            zns.a((MetricAffectingSpan) new znq(this.J.b, 2));
            zns.a(str, new Object[0]);
        } finally {
            in.a();
        }
    }

    private final String b(int i) {
        Object a = this.J.a(i);
        akcr.a(a, "assets.getString(resId)");
        return a;
    }

    private final boolean p() {
        Long l = this.c.e;
        return l != null && l.longValue() == this.L._id();
    }

    private final boolean q() {
        Object storyLatestExpirationTimestamp = this.L.storyLatestExpirationTimestamp();
        if (storyLatestExpirationTimestamp == null) {
            return true;
        }
        long a = this.O.a();
        akcr.a(storyLatestExpirationTimestamp, "it");
        return a > storyLatestExpirationTimestamp.longValue();
    }

    private final boolean r() {
        Object friendStoryLatestExpirationTimestamp = this.L.friendStoryLatestExpirationTimestamp();
        if (friendStoryLatestExpirationTimestamp == null) {
            return true;
        }
        long a = this.O.a();
        akcr.a(friendStoryLatestExpirationTimestamp, "it");
        return a > friendStoryLatestExpirationTimestamp.longValue();
    }

    private final Long s() {
        return Long.valueOf(this.L.friendStoryLatestTimestamp());
    }

    private final boolean t() {
        CalendarDate birthday = this.L.birthday();
        if (birthday == null) {
            return false;
        }
        Object obj = this.J.a;
        akcr.a(obj, "assets.today");
        return birthday.isSameDay(obj);
    }

    private boolean u() {
        Boolean bool;
        String friendmojiCategories = this.L.friendmojiCategories();
        Long streakExpiration = this.L.streakExpiration();
        if (friendmojiCategories == null || streakExpiration == null) {
            bool = null;
        } else {
            Object obj;
            Iterable<Object> a = akgc.a((CharSequence) friendmojiCategories, new String[]{ppy.b}, 0, 6);
            if (!((a instanceof Collection) && ((Collection) a).isEmpty())) {
                for (Object a2 : a) {
                    if (akcr.a(a2, FriendmojiCategory.STREAK.getCategory())) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            boolean z = obj != null && streakExpiration.longValue() > this.O.a();
            bool = Boolean.valueOf(z);
        }
        return (bool != null ? bool.booleanValue() : false) && !this.af;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x0085 in {5, 11, 13, 15, 18, 26, 27, 28, 29, 30, 31, 33, 37, 40} preds:[]
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
    private final defpackage.zio v() {
        /*
        r5 = this;
        r0 = "";
        defpackage.in.a(r0);
        r0 = r5.c;	 Catch:{ all -> 0x0080 }
        r1 = r5.L;	 Catch:{ all -> 0x0080 }
        r1 = r1._id();	 Catch:{ all -> 0x0080 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0080 }
        r1 = r5.an;	 Catch:{ all -> 0x0080 }
        if (r1 == 0) goto L_0x001a;
        defpackage.in.a();
        r0 = 0;
        return r0;
        r1 = r5.ap;	 Catch:{ all -> 0x0080 }
        r2 = 1;	 Catch:{ all -> 0x0080 }
        if (r1 == 0) goto L_0x0040;	 Catch:{ all -> 0x0080 }
        r0 = r5.ao;	 Catch:{ all -> 0x0080 }
        if (r0 != r2) goto L_0x002c;	 Catch:{ all -> 0x0080 }
        r0 = new zio;	 Catch:{ all -> 0x0080 }
        r1 = 2131231861; // 0x7f080475 float:1.8079815E38 double:1.052968446E-314;	 Catch:{ all -> 0x0080 }
        r0.<init>(r1);	 Catch:{ all -> 0x0080 }
        goto L_0x0036;	 Catch:{ all -> 0x0080 }
        if (r0 != 0) goto L_0x003a;	 Catch:{ all -> 0x0080 }
        r0 = new zio;	 Catch:{ all -> 0x0080 }
        r1 = 2131231862; // 0x7f080476 float:1.8079817E38 double:1.0529684463E-314;	 Catch:{ all -> 0x0080 }
        r0.<init>(r1);	 Catch:{ all -> 0x0080 }
        defpackage.in.a();
        return r0;
        r0 = new ajxk;	 Catch:{ all -> 0x0080 }
        r0.<init>();	 Catch:{ all -> 0x0080 }
        throw r0;	 Catch:{ all -> 0x0080 }
        r1 = r5.am;	 Catch:{ all -> 0x0080 }
        if (r1 == 0) goto L_0x0073;	 Catch:{ all -> 0x0080 }
        if (r0 == 0) goto L_0x0066;	 Catch:{ all -> 0x0080 }
        r1 = new zio;	 Catch:{ all -> 0x0080 }
        r3 = defpackage.iio.j;	 Catch:{ all -> 0x0080 }
        r4 = r0.ordinal();	 Catch:{ all -> 0x0080 }
        r3 = r3[r4];	 Catch:{ all -> 0x0080 }
        if (r3 == r2) goto L_0x005d;	 Catch:{ all -> 0x0080 }
        r2 = 2;	 Catch:{ all -> 0x0080 }
        if (r3 == r2) goto L_0x0058;	 Catch:{ all -> 0x0080 }
        r2 = r0.iconRes;	 Catch:{ all -> 0x0080 }
        goto L_0x0060;	 Catch:{ all -> 0x0080 }
        r2 = defpackage.iin.SNAP_RECEIVED_AND_VIEWED_SOUND;	 Catch:{ all -> 0x0080 }
        r2 = r2.iconRes;	 Catch:{ all -> 0x0080 }
        goto L_0x0060;	 Catch:{ all -> 0x0080 }
        r2 = defpackage.iin.SNAP_RECEIVED_AND_VIEWED_NO_SOUND;	 Catch:{ all -> 0x0080 }
        goto L_0x005a;	 Catch:{ all -> 0x0080 }
        r0 = r0.iconRes;	 Catch:{ all -> 0x0080 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0080 }
        goto L_0x006f;	 Catch:{ all -> 0x0080 }
        r1 = new zio;	 Catch:{ all -> 0x0080 }
        r0 = r5.l;	 Catch:{ all -> 0x0080 }
        r0 = r0.iconRes;	 Catch:{ all -> 0x0080 }
        r1.<init>(r0);	 Catch:{ all -> 0x0080 }
        defpackage.in.a();
        return r1;
        r0 = new zio;	 Catch:{ all -> 0x0080 }
        r1 = r5.l;	 Catch:{ all -> 0x0080 }
        r1 = r1.iconRes;	 Catch:{ all -> 0x0080 }
        r0.<init>(r1);	 Catch:{ all -> 0x0080 }
        defpackage.in.a();
        return r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdt.v():zio");
    }

    private boolean w() {
        qwl qwl = (qwl) this.c.a.get(Long.valueOf(this.L._id()));
        return qwl != null && qwl.c;
    }

    private boolean x() {
        qwj qwj = this.M.d;
        return ajyu.a((Iterable) qwj.c.keySet(), (Object) Long.valueOf(this.L._id()));
    }

    private final String y() {
        return (String) this.av.b();
    }

    private final String z() {
        if (TextUtils.isEmpty(this.L.feedDisplayName())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.ac);
            stringBuilder.append(" (me)");
            return stringBuilder.toString();
        }
        Object feedDisplayName = this.L.feedDisplayName();
        if (feedDisplayName == null) {
            akcr.a();
        }
        akcr.a(feedDisplayName, "record.feedDisplayName()!!");
        return feedDisplayName;
    }

    public final Context a() {
        return (Context) this.V.b();
    }

    public final boolean areContentsTheSame(zmy zmy) {
        akcr.b(zmy, MapboxEvent.KEY_MODEL);
        boolean z = false;
        if (!super.areContentsTheSame(zmy)) {
            return false;
        }
        rdt rdt = (rdt) zmy;
        if (akcr.a(rdt.L.displayInteractionType(), this.L.displayInteractionType()) && akcr.a(rdt.y(), y()) && akcr.a(rdt.aj, this.aj) && rdt.K.e.a.hashCode() == this.K.e.a.hashCode() && akcr.a(rdt.L.feedDisplayName(), this.L.feedDisplayName()) && akcr.a(rdt.L.friendDisplayName(), this.L.friendDisplayName()) && akcr.a(rdt.L.streakExpiration(), this.L.streakExpiration()) && akcr.a(rdt.L.streakLength(), this.L.streakLength()) && rdt.q == this.q && akcr.a(rdt.M, this.M) && rdt.al == this.al && rdt.ap == this.ap && rdt.ao == this.ao && rdt.b == this.b && rdt.B == this.B && rdt.ae == this.ae && rdt.k == this.k && akcr.a(rdt.ag, this.ag) && akcr.a(rdt.ah, this.ah) && rdt.p == this.p && rdt.i() == i() && akcr.a(rdt.L.storyLatestTimestamp(), this.L.storyLatestTimestamp()) && akcr.a(rdt.L.storyViewed(), this.L.storyViewed()) && akcr.a(rdt.g(), g()) && akcr.a(rdt.h(), h()) && akcr.a(rdt.s(), s())) {
            z = true;
        }
        rdt.L._id();
        this.L._id();
        return z;
    }

    public final String b() {
        Object key = this.L.key();
        akcr.a(key, "record.key()");
        return key;
    }

    public final FeedKind c() {
        Object kind = this.L.kind();
        akcr.a(kind, "record.kind()");
        return kind;
    }

    public final boolean d() {
        return (this.L.storyRowId() == null || this.L.storyId() == null || q()) ? false : true;
    }

    public final String e() {
        if (this.T) {
            Object friendStoryUsername = this.L.friendStoryUsername();
            akcr.a(friendStoryUsername, "record.friendStoryUsername()");
            if ((((CharSequence) friendStoryUsername).length() > 0 ? 1 : null) != null) {
                return this.L.friendStoryUsername();
            }
        }
        return this.L.storyRowId() != null ? this.L.storyId() : null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rdt) {
                rdt rdt = (rdt) obj;
                if (akcr.a(this.H, rdt.H) && akcr.a(this.I, rdt.I)) {
                    if ((this.aA == rdt.aA ? 1 : null) != null && akcr.a(this.J, rdt.J) && akcr.a(this.K, rdt.K) && akcr.a(this.L, rdt.L) && akcr.a(this.M, rdt.M) && akcr.a(this.N, rdt.N) && akcr.a(this.O, rdt.O) && akcr.a(this.P, rdt.P) && akcr.a(this.Q, rdt.Q) && akcr.a(this.R, rdt.R) && akcr.a(this.S, rdt.S)) {
                        if ((this.T == rdt.T ? 1 : null) == null || !akcr.a(this.U, rdt.U)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.T) {
            Object friendStoryUsername = this.L.friendStoryUsername();
            akcr.a(friendStoryUsername, "record.friendStoryUsername()");
            return ((((CharSequence) friendStoryUsername).length() > 0 ? 1 : null) == null || r()) ? false : true;
        }
    }

    public final String g() {
        return iek.a(this.L.friendStoryUsername());
    }

    public final Boolean h() {
        Long friendStoryIsViewed = this.L.friendStoryIsViewed();
        boolean z = friendStoryIsViewed == null || friendStoryIsViewed.longValue() != 0;
        return Boolean.valueOf(z);
    }

    public final int hashCode() {
        Context context = this.H;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        ajdw ajdw = this.I;
        hashCode = (hashCode + (ajdw != null ? ajdw.hashCode() : 0)) * 31;
        int i2 = this.aA;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        rdw rdw = this.J;
        hashCode = (hashCode + (rdw != null ? rdw.hashCode() : 0)) * 31;
        rdx rdx = this.K;
        hashCode = (hashCode + (rdx != null ? rdx.hashCode() : 0)) * 31;
        WithFriendAndStory withFriendAndStory = this.L;
        hashCode = (hashCode + (withFriendAndStory != null ? withFriendAndStory.hashCode() : 0)) * 31;
        reb reb = this.M;
        hashCode = (hashCode + (reb != null ? reb.hashCode() : 0)) * 31;
        ihi ihi = this.N;
        hashCode = (hashCode + (ihi != null ? ihi.hashCode() : 0)) * 31;
        ihh ihh = this.O;
        hashCode = (hashCode + (ihh != null ? ihh.hashCode() : 0)) * 31;
        SnapEmojiSpanFactory snapEmojiSpanFactory = this.P;
        hashCode = (hashCode + (snapEmojiSpanFactory != null ? snapEmojiSpanFactory.hashCode() : 0)) * 31;
        a aVar = this.Q;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ajwy ajwy = this.R;
        hashCode = (hashCode + (ajwy != null ? ajwy.hashCode() : 0)) * 31;
        eyn eyn = this.S;
        hashCode = (hashCode + (eyn != null ? eyn.hashCode() : 0)) * 31;
        i2 = this.T;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        ras ras = this.U;
        if (ras != null) {
            i = ras.hashCode();
        }
        return hashCode + i;
    }

    public final boolean i() {
        return this.L.storyMuted() == 1;
    }

    public final String j() {
        in.a("");
        try {
            Long friendRowId = this.L.friendRowId();
            String a = friendRowId != null ? this.e ? "10232871" : t() ? "10226437" : o() ? "10226259" : ddq.a(String.valueOf(friendRowId.longValue())).a(this.L.bitmojiSelfieId()) : null;
            in.a();
            return a;
        } catch (Throwable th) {
            in.a();
        }
    }

    public final Typeface k() {
        return (Typeface) this.as.b();
    }

    /* Access modifiers changed, original: final */
    public final String l() {
        long displayTimestamp = this.L.displayTimestamp();
        in.a("");
        try {
            String a = this.N.a(displayTimestamp, false, true);
            if (a == null) {
                akcr.a("timestampString");
            }
            return a;
        } finally {
            in.a();
        }
    }

    public final String m() {
        return this.L.isGroup() ? z() : A();
    }

    public final FeedStoryInfo n() {
        boolean z = this.b && this.Y == yic.a.LOADING;
        Uri uri;
        if (f()) {
            uri = this.az;
            if (uri != null) {
                return new FeedStoryInfo(uri, false, z, i(), false, x(), akcr.a(h(), Boolean.TRUE), p(), false, false, 768, null);
            }
        } else if (d()) {
            uri = this.ay;
            if (uri != null) {
                return new FeedStoryInfo(uri, false, z, i(), false, x(), akcr.a(this.L.storyViewed(), Boolean.TRUE), p(), false, false, 768, null);
            }
        }
        return null;
    }

    public final boolean o() {
        Object addedTimestamp = this.L.addedTimestamp();
        Long valueOf = Long.valueOf(0);
        if (addedTimestamp == null) {
            addedTimestamp = valueOf;
        }
        akcr.a(addedTimestamp, "record.addedTimestamp() ?: 0L");
        long longValue = addedTimestamp.longValue();
        addedTimestamp = this.L.reverseAddedTimestamp();
        if (addedTimestamp == null) {
            addedTimestamp = valueOf;
        }
        akcr.a(addedTimestamp, "record.reverseAddedTimestamp() ?: 0L");
        long longValue2 = addedTimestamp.longValue();
        return this.l == iin.UNKNOWN && longValue != 0 && longValue2 != 0 && this.O.a() - Math.max(longValue, longValue2) < 259200000;
    }

    public final String toString() {
        Object stringBuilder = new StringBuilder();
        stringBuilder.append("FriendFeedItemViewModel");
        String str = "append(value)";
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        StringBuilder stringBuilder2 = new StringBuilder("feedId: ");
        stringBuilder2.append(this.L._id());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("feedKind: ");
        stringBuilder2.append(c());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("feedDisplayName: ");
        stringBuilder2.append(this.L.feedDisplayName());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("friendDisplayName: ");
        stringBuilder2.append(this.L.friendDisplayName());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("latestInteractionType: ");
        stringBuilder2.append(this.l);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("lastInteractionTimestamp: ");
        stringBuilder2.append(this.L.lastInteractionTimestamp());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("displayInteractionType: ");
        stringBuilder2.append(this.L.displayInteractionType());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("displayTimestamp: ");
        stringBuilder2.append(this.L.displayTimestamp());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("notViewedSnapId: ");
        stringBuilder2.append(this.L.notViewedSnapId());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("shouldShowReplyButton: ");
        stringBuilder2.append(this.q);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("mediaState: ");
        stringBuilder2.append(this.M);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("hasCountdownSnap: ");
        stringBuilder2.append(this.al);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("showReplaySnapAnimation: ");
        stringBuilder2.append(this.ap);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("isFirstChatSnapPrefetched: ");
        stringBuilder2.append(this.m);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("userInitiatedStoryLoad: ");
        stringBuilder2.append(this.b);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("isFirstStorySnapFetched: ");
        stringBuilder2.append(this.a);
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("storyRowId: ");
        stringBuilder2.append(this.L.storyRowId());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("storyId: ");
        stringBuilder2.append(e());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("storyFirstUnviewedSnapId: ");
        stringBuilder2.append(this.L.storyFirstUnviewedSnapId());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("storyViewed: ");
        stringBuilder2.append(this.L.storyViewed());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("storyMuted: ");
        stringBuilder2.append(i());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder2 = new StringBuilder("storyLatestTimestamp: ");
        stringBuilder2.append(this.L.storyLatestTimestamp());
        stringBuilder.append(stringBuilder2.toString());
        akcr.a(stringBuilder, str);
        akfx.a(stringBuilder);
        stringBuilder = stringBuilder.toString();
        akcr.a(stringBuilder, "sb.toString()");
        return stringBuilder;
    }
}
