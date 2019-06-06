package com.snap.lenses.camera.cta;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfc;
import defpackage.ajot;
import defpackage.ajpy;
import defpackage.ajvo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.lxc;
import defpackage.mva;
import java.util.Map;

public final class DefaultCtaView extends FrameLayout implements lxc {
    TextView a;
    mva b;
    private final Map<String, Integer> c;
    private final ajxe d;

    static final class a extends akcs implements akbk<ajdp<defpackage.lxc.a>> {
        final /* synthetic */ DefaultCtaView a;

        /* renamed from: com.snap.lenses.camera.cta.DefaultCtaView$a$1 */
        static final class AnonymousClass1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            AnonymousClass1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                mva mva = this.a.a.b;
                return mva != null ? ajdp.b(new defpackage.lxc.a.a(mva)) : ajvo.a(ajot.a);
            }
        }

        a(DefaultCtaView defaultCtaView) {
            this.a = defaultCtaView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            TextView textView = this.a.a;
            if (textView == null) {
                akcr.a("ctaTextView");
            }
            return ajpy.k(cfl.c(textView).u(new AnonymousClass1(this))).a();
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultCtaView a;

        b(DefaultCtaView defaultCtaView) {
            this.a = defaultCtaView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.setVisibility(8);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultCtaView a;

        c(DefaultCtaView defaultCtaView) {
            this.a = defaultCtaView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.setVisibility(0);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultCtaView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultCtaView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultCtaView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        r2 = new ajxm[44];
        r2[0] = ajxs.a("CHAT", Integer.valueOf(R.string.lens_cta_chat));
        r2[1] = ajxs.a("LEARN MORE", Integer.valueOf(R.string.lens_cta_learn_more));
        r2[2] = ajxs.a("FIND OUT", Integer.valueOf(R.string.lens_cta_find_out));
        r2[3] = ajxs.a("SHOW", Integer.valueOf(R.string.lens_cta_show));
        r2[4] = ajxs.a("PLAY", Integer.valueOf(R.string.lens_cta_play));
        r2[5] = ajxs.a("SWIPE UP", Integer.valueOf(R.string.lens_cta_swipe_up));
        r2[6] = ajxs.a("MORE", Integer.valueOf(R.string.lens_cta_more));
        r2[7] = ajxs.a("WATCH", Integer.valueOf(R.string.lens_cta_watch));
        r2[8] = ajxs.a("VIEW", Integer.valueOf(R.string.lens_cta_view));
        r2[9] = ajxs.a("WATCH MORE", Integer.valueOf(R.string.lens_cta_watch_more));
        r2[10] = ajxs.a("VIEW MORE", Integer.valueOf(R.string.lens_cta_view_more));
        r2[11] = ajxs.a("WATCH VIDEO", Integer.valueOf(R.string.lens_cta_watch_video));
        r2[12] = ajxs.a("WATCH TRAILER", Integer.valueOf(R.string.lens_cta_watch_trailer));
        r2[13] = ajxs.a("USE APP", Integer.valueOf(R.string.lens_cta_use_app));
        r2[14] = ajxs.a("INSTALL NOW", Integer.valueOf(R.string.lens_cta_install_now));
        r2[15] = ajxs.a("DOWNLOAD", Integer.valueOf(R.string.lens_cta_download));
        r2[16] = ajxs.a("PLAY GAME", Integer.valueOf(R.string.lens_cta_play_game));
        r2[17] = ajxs.a("PLAY STORE", Integer.valueOf(R.string.lens_cta_play_store));
        r2[18] = ajxs.a("SHOP NOW", Integer.valueOf(R.string.lens_cta_shop_now));
        r2[19] = ajxs.a("SIGN UP", Integer.valueOf(R.string.lens_cta_sign_up));
        r2[20] = ajxs.a("READ", Integer.valueOf(R.string.lens_cta_read));
        r2[21] = ajxs.a("EXPLORE", Integer.valueOf(R.string.lens_cta_explore));
        r2[22] = ajxs.a("ORDER NOW", Integer.valueOf(R.string.lens_cta_order_now));
        r2[23] = ajxs.a("APPLY NOW", Integer.valueOf(R.string.lens_cta_apply_now));
        r2[24] = ajxs.a("WATCH EPISODE", Integer.valueOf(R.string.lens_cta_watch_episode));
        r2[25] = ajxs.a("SUBSCRIBE", Integer.valueOf(R.string.lens_cta_subscribe));
        r2[26] = ajxs.a("ORDER", Integer.valueOf(R.string.lens_cta_order));
        r2[27] = ajxs.a("APPLY", Integer.valueOf(R.string.lens_cta_apply));
        r2[28] = ajxs.a("RESPOND", Integer.valueOf(R.string.lens_cta_respond));
        r2[29] = ajxs.a("SHOP", Integer.valueOf(R.string.lens_cta_shop));
        r2[30] = ajxs.a("EDIT & SEND", Integer.valueOf(R.string.lens_cta_edit_send));
        r2[31] = ajxs.a("VOTE", Integer.valueOf(R.string.lens_cta_vote));
        r2[32] = ajxs.a("VOTE NOW", Integer.valueOf(R.string.lens_cta_vote_now));
        r2[33] = ajxs.a("TAKE POLL", Integer.valueOf(R.string.lens_cta_take_poll));
        r2[34] = ajxs.a("TAKE QUIZ", Integer.valueOf(R.string.lens_cta_take_quiz));
        r2[35] = ajxs.a("LISTEN", Integer.valueOf(R.string.lens_cta_listen));
        r2[36] = ajxs.a("OPEN LINK", Integer.valueOf(R.string.lens_cta_open_link));
        r2[37] = ajxs.a("BUY TICKETS", Integer.valueOf(R.string.lens_cta_buy_tickets));
        r2[38] = ajxs.a("SHOWTIMES", Integer.valueOf(R.string.lens_cta_showtimes));
        r2[39] = ajxs.a("BOOK NOW", Integer.valueOf(R.string.lens_cta_book_now));
        r2[40] = ajxs.a("GET NOW", Integer.valueOf(R.string.lens_cta_get_now));
        r2[41] = ajxs.a("TRY", Integer.valueOf(R.string.lens_cta_try));
        r2[42] = ajxs.a("TRY NOW", Integer.valueOf(R.string.lens_cta_try_now));
        r2[43] = ajxs.a("NOTIFY ME!", Integer.valueOf(R.string.lens_cta_notify_me));
        this.c = ajzm.a(r2);
        this.d = ajxh.a(new a(this));
    }

    /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            if (r3 == null) goto L_0x0041;
     */
    private final java.lang.String a(defpackage.mva r2, int r3) {
        /*
        r1 = this;
        r0 = r2.b();
        r0 = (java.lang.CharSequence) r0;
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r0.length();
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r0 = 0;
        goto L_0x0012;
    L_0x0011:
        r0 = 1;
    L_0x0012:
        if (r0 != 0) goto L_0x0019;
    L_0x0014:
        r2 = r2.b();
        return r2;
    L_0x0019:
        r2 = r2.a();
        if (r2 == 0) goto L_0x005e;
    L_0x001f:
        r3 = 95;
        r0 = 32;
        r2 = defpackage.akgb.a(r2, r3, r0);
        r3 = r1.c;
        r3 = r3.get(r2);
        r3 = (java.lang.Integer) r3;
        if (r3 == 0) goto L_0x0041;
    L_0x0031:
        r0 = r1.getResources();
        r3 = (java.lang.Number) r3;
        r3 = r3.intValue();
        r3 = r0.getString(r3);
        if (r3 != 0) goto L_0x0055;
    L_0x0041:
        r3 = java.util.Locale.getDefault();
        r0 = "Locale.getDefault()";
        defpackage.akcr.a(r3, r0);
        if (r2 == 0) goto L_0x0056;
    L_0x004c:
        r3 = r2.toUpperCase(r3);
        r2 = "(this as java.lang.String).toUpperCase(locale)";
        defpackage.akcr.a(r3, r2);
    L_0x0055:
        return r3;
    L_0x0056:
        r2 = new ajxt;
        r3 = "null cannot be cast to non-null type java.lang.String";
        r2.<init>(r3);
        throw r2;
    L_0x005e:
        r2 = r1.getResources();
        r2 = r2.getString(r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.cta.DefaultCtaView.a(mva, int):java.lang.String");
    }

    public final ajdp<defpackage.lxc.a> a() {
        return (ajdp) this.d.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00a8 in {4, 7, 11, 14, 17, 18, 20, 23, 25, 27} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final /* synthetic */ void accept(java.lang.Object r9) {
        /*
        r8 = this;
        r9 = (defpackage.lxc.b) r9;
        r0 = "model";
        defpackage.akcr.b(r9, r0);
        r0 = r9 instanceof defpackage.lxc.b.b;
        if (r0 == 0) goto L_0x0078;
        r9 = (defpackage.lxc.b.b) r9;
        r0 = r9.a;
        r1 = r8.a;
        if (r1 != 0) goto L_0x0018;
        r2 = "ctaTextView";
        defpackage.akcr.a(r2);
        r2 = r0 instanceof defpackage.mva.c;
        if (r2 == 0) goto L_0x0024;
        r2 = 2131888117; // 0x7f1207f5 float:1.941086E38 double:1.0532926794E-314;
        r0 = r8.a(r0, r2);
        goto L_0x003c;
        r2 = r0 instanceof defpackage.mva.d;
        if (r2 == 0) goto L_0x002c;
        r2 = 2131888091; // 0x7f1207db float:1.9410808E38 double:1.0532926665E-314;
        goto L_0x001f;
        r2 = r0 instanceof defpackage.mva.a;
        if (r2 == 0) goto L_0x0034;
        r2 = 2131888088; // 0x7f1207d8 float:1.9410801E38 double:1.053292665E-314;
        goto L_0x001f;
        r2 = r0 instanceof defpackage.mva.b;
        if (r2 == 0) goto L_0x0066;
        r2 = 2131888093; // 0x7f1207dd float:1.9410812E38 double:1.0532926675E-314;
        goto L_0x001f;
        r0 = (java.lang.CharSequence) r0;
        r1.setText(r0);
        r0 = r8.animate();
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r0.alpha(r1);
        r0 = "animate().alpha(1f)";
        defpackage.akcr.a(r2, r0);
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = new com.snap.lenses.camera.cta.DefaultCtaView$c;
        r0.<init>(r8);
        r6 = r0;
        r6 = (defpackage.akbk) r6;
        r7 = 7;
        r0 = defpackage.mgx.a(r2, r3, r4, r5, r6, r7);
        r0.start();
        r9 = r9.a;
        goto L_0x009f;
        r9 = new java.lang.IllegalArgumentException;
        r0 = java.lang.String.valueOf(r0);
        r1 = "Unexpected lens attachment type: ";
        r0 = r1.concat(r0);
        r9.<init>(r0);
        r9 = (java.lang.Throwable) r9;
        throw r9;
        r9 = r9 instanceof defpackage.lxc.b.a;
        if (r9 == 0) goto L_0x00a2;
        r9 = r8.animate();
        r0 = 0;
        r1 = r9.alpha(r0);
        r9 = "animate().alpha(0f)";
        defpackage.akcr.a(r1, r9);
        r2 = 0;
        r9 = new com.snap.lenses.camera.cta.DefaultCtaView$b;
        r9.<init>(r8);
        r3 = r9;
        r3 = (defpackage.akbk) r3;
        r4 = 0;
        r5 = 0;
        r6 = 13;
        r9 = defpackage.mgx.a(r1, r2, r3, r4, r5, r6);
        r9.start();
        r9 = 0;
        r8.b = r9;
        return;
        r9 = new ajxk;
        r9.<init>();
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.cta.DefaultCtaView.accept(java.lang.Object):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.lens_cta_text);
        akcr.a(findViewById, "findViewById(R.id.lens_cta_text)");
        this.a = (TextView) findViewById;
        setVisibility(8);
    }
}
