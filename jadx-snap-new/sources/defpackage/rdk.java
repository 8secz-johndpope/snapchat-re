package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.snap.messaging.friendsfeed.ui.view.TypingIndicatorView;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.AvatarView;
import com.snap.ui.avatar.FeedStoryInfo;
import com.snap.ui.view.LoadingSpinnerView;
import com.snap.ui.view.SnapFontTextView;
import com.snap.ui.view.TouchAuditingStackingLayout;
import com.snap.ui.view.TouchAuditingStackingLayout.OnInterceptTouchEventListener;
import com.snap.ui.view.ViewStubWrapper;
import com.snapchat.android.R;
import defpackage.rad.a;
import java.util.List;

/* renamed from: rdk */
public final class rdk extends zly<ral, rdt> {
    AvatarView a;
    View b;
    final ajxe c = ajxh.a(ajxj.NONE, new c(this));
    final ajei d = new ajei();
    d e = new d(this);
    private ViewStubWrapper<? extends TypingIndicatorView> f;
    private TextView g;
    private SnapFontTextView h;
    private SnapFontTextView i;
    private raz j;
    private rax k;
    private abua l;
    private rba m;
    private View n;
    private LoadingSpinnerView o;
    private rdi p;
    private ViewStubWrapper<? extends View> q;
    private ViewStubWrapper<? extends View> r;
    private ViewStubWrapper<? extends View> s;

    /* renamed from: rdk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: rdk$c */
    static final class c extends akcs implements akbk<jo> {
        private /* synthetic */ rdk a;

        c(rdk rdk) {
            this.a = rdk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jo(this.a.getItemView().getContext(), this.a.e);
        }
    }

    /* renamed from: rdk$k */
    static final class k<T> implements ajfb<ajxm<? extends a, ? extends rag>> {
        private /* synthetic */ rdk a;
        private /* synthetic */ ral b;

        k(rdk rdk, ral ral) {
            this.a = rdk;
            this.b = ral;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ajxm) obj;
            rdk rdk = this.a;
            akcr.a(obj, "it");
            rad rad = this.b.d;
            rdt rdt = (rdt) rdk.getModel();
            if (rdt != null) {
                int i = rdl.b[((a) obj.a).ordinal()];
                Object obj2 = 1;
                if (i == 1) {
                    if (rdl.a[((rag) obj.b).ordinal()] == 1 && rdt.l.a() && rdk.getItemView().isShown()) {
                        View itemView = rdk.getItemView();
                        Rect rect = new Rect();
                        itemView.getGlobalVisibleRect(rect);
                        if (rect.top <= 0) {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            rad.g.a((Object) new ajxm(obj.b, rdk.getItemView()));
                        }
                    }
                } else if (i == 2) {
                    rad.a((rag) obj.b);
                } else if (i == 3) {
                    rad.b((rag) obj.b);
                }
            }
        }
    }

    /* renamed from: rdk$e */
    static final class e implements OnClickListener {
        private /* synthetic */ rdk a;
        private /* synthetic */ View b;

        e(rdk rdk, View view) {
            this.a = rdk;
            this.b = view;
        }

        public final void onClick(View view) {
            rdk rdk = this.a;
            akcr.a((Object) view, "it");
            zke eventDispatcher = rdk.getEventDispatcher();
            zmy model = rdk.getModel();
            if (model == null) {
                akcr.a();
            }
            eventDispatcher.a(new rcg((rdt) model));
        }
    }

    /* renamed from: rdk$f */
    static final class f implements OnClickListener {
        private /* synthetic */ rdk a;
        private /* synthetic */ View b;

        f(rdk rdk, View view) {
            this.a = rdk;
            this.b = view;
        }

        public final void onClick(View view) {
            zke eventDispatcher = this.a.getEventDispatcher();
            rdt rdt = (rdt) this.a.getModel();
            if (rdt == null) {
                akcr.a();
            }
            eventDispatcher.a(new rcf(rdt, this.a.a()));
        }
    }

    /* renamed from: rdk$g */
    static final class g extends akcs implements akbk<ajxw> {
        private /* synthetic */ rdk a;
        private /* synthetic */ View b;

        g(rdk rdk, View view) {
            this.a = rdk;
            this.b = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a().invalidate();
            return ajxw.a;
        }
    }

    /* renamed from: rdk$h */
    static final class h implements OnClickListener {
        private /* synthetic */ rdk a;
        private /* synthetic */ View b;

        h(rdk rdk, View view) {
            this.a = rdk;
            this.b = view;
        }

        public final void onClick(View view) {
            rdk rdk = this.a;
            akcr.a((Object) view, "it");
            zke eventDispatcher = rdk.getEventDispatcher();
            zmy model = rdk.getModel();
            if (model == null) {
                akcr.a();
            }
            eventDispatcher.a(new rce((rdt) model));
        }
    }

    /* renamed from: rdk$m */
    static final class m implements OnInterceptTouchEventListener {
        private /* synthetic */ rdk a;

        m(rdk rdk) {
            this.a = rdk;
        }

        public final void auditTouchEvent(MotionEvent motionEvent) {
            rdk rdk = this.a;
            akcr.a((Object) motionEvent, "ev");
            rdk.a(motionEvent);
        }
    }

    /* renamed from: rdk$i */
    static final class i extends akcq implements akbl<View, ajxw> {
        i(rdk rdk) {
            super(1, rdk);
        }

        public final String getName() {
            return "onClickAvatar";
        }

        public final akej getOwner() {
            return akde.a(rdk.class);
        }

        public final String getSignature() {
            return "onClickAvatar(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "p1");
            rdk rdk = (rdk) this.receiver;
            zmy model = rdk.getModel();
            if (model == null) {
                akcr.a();
            }
            rdt rdt = (rdt) model;
            FeedStoryInfo n = rdt.n();
            if (n != null ? n.shouldShowStory() : false) {
                AvatarView avatarView = rdk.a;
                if (avatarView == null) {
                    akcr.a("avatarIcon");
                }
                rck rck = new rck(rdt, rdk.d, avatarView.getStoryView());
                String e = rdt.e();
                if (e != null) {
                    ((ral) rdk.e()).g.a(e);
                }
                rdk.getEventDispatcher().a(rck);
            } else {
                rdk.getEventDispatcher().a(new rcc(rdt, qxo.b.getName()));
            }
            return ajxw.a;
        }
    }

    /* renamed from: rdk$j */
    static final class j extends akcq implements akbl<View, Boolean> {
        j(rdk rdk) {
            super(1, rdk);
        }

        public final String getName() {
            return "onLongClickAvatar";
        }

        public final akej getOwner() {
            return akde.a(rdk.class);
        }

        public final String getSignature() {
            return "onLongClickAvatar(Landroid/view/View;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "p1");
            ((rdk) this.receiver).b();
            return Boolean.TRUE;
        }
    }

    /* renamed from: rdk$l */
    static final class l extends akcq implements akbw<View, MotionEvent, Boolean> {
        l(rdk rdk) {
            super(2, rdk);
        }

        public final String getName() {
            return "onTouch";
        }

        public final akej getOwner() {
            return akde.a(rdk.class);
        }

        public final String getSignature() {
            return "onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            MotionEvent motionEvent = (MotionEvent) obj2;
            akcr.b(view, "p1");
            akcr.b(motionEvent, "p2");
            rdk rdk = (rdk) this.receiver;
            rdk.a(motionEvent);
            ((jo) rdk.c.b()).a(motionEvent);
            view.onTouchEvent(motionEvent);
            return Boolean.TRUE;
        }
    }

    /* renamed from: rdk$d */
    public static final class d extends SimpleOnGestureListener {
        private /* synthetic */ rdk a;

        d(rdk rdk) {
            this.a = rdk;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            rdk rdk = this.a;
            zke eventDispatcher = rdk.getEventDispatcher();
            zmy model = rdk.getModel();
            if (model == null) {
                akcr.a();
            }
            rdt rdt = (rdt) model;
            View view = rdk.b;
            if (view == null) {
                akcr.a("subtextFeedIconView");
            }
            eventDispatcher.a(new rcf(rdt, view));
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            this.a.b();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            rdk rdk = this.a;
            zmy model = rdk.getModel();
            if (model == null) {
                akcr.a();
            }
            rdt rdt = (rdt) model;
            View view = rdk.b;
            if (view == null) {
                akcr.a("subtextFeedIconView");
            }
            rdk.getEventDispatcher().a(new rcd(rdt, view));
            return true;
        }
    }

    /* renamed from: rdk$b */
    static final class b extends akcq implements akbw<Long, List<? extends Avatar>, ajxw> {
        b(rdk rdk) {
            super(2, rdk);
        }

        public final String getName() {
            return "onAvatarsLoaded";
        }

        public final akej getOwner() {
            return akde.a(rdk.class);
        }

        public final String getSignature() {
            return "onAvatarsLoaded(JLjava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            List list = (List) obj2;
            akcr.b(list, "p2");
            ((rdk) this.receiver).a(list);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rdk.class), "gestureDetector", "getGestureDetector()Landroid/support/v4/view/GestureDetectorCompat;");
        a aVar = new a();
    }

    public final View a() {
        View view = this.b;
        if (view == null) {
            akcr.a("subtextFeedIconView");
        }
        return view;
    }

    /* Access modifiers changed, original: final */
    public final void a(MotionEvent motionEvent) {
        zmy model = getModel();
        if (model == null) {
            akcr.a();
        }
        rdt rdt = (rdt) model;
        if (motionEvent.getActionMasked() == 0) {
            ((ral) e()).f.a = Long.valueOf(((ral) e()).e.a(rdt.L._id()));
            getEventDispatcher().a(new rci(rdt));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(List<Avatar> list) {
        in.a("");
        try {
            zmy model = getModel();
            if (model == null) {
                akcr.a();
            }
            rdt rdt = (rdt) model;
            AvatarView avatarView = this.a;
            if (avatarView == null) {
                akcr.a("avatarIcon");
            }
            avatarView.setVisibility(0);
            avatarView.setAvatarsInfo((List) list, rdt.n(), rdt.o(), rdt.e, (idl) qxo.b.getPage());
        } finally {
            in.a();
        }
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        ral ral = (ral) zlx;
        akcr.b(ral, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.avatar_icon);
        akcr.a(findViewById, "itemView.findViewById(R.id.avatar_icon)");
        this.a = (AvatarView) findViewById;
        findViewById = view.findViewById(R.id.name);
        akcr.a(findViewById, "itemView.findViewById(R.id.name)");
        this.g = (TextView) findViewById;
        findViewById = view.findViewById(R.id.info);
        akcr.a(findViewById, "itemView.findViewById(R.id.info)");
        this.h = (SnapFontTextView) findViewById;
        findViewById = view.findViewById(R.id.friendmoji);
        akcr.a(findViewById, "itemView.findViewById(R.id.friendmoji)");
        this.i = (SnapFontTextView) findViewById;
        AvatarView avatarView = this.a;
        String str = "avatarIcon";
        if (avatarView == null) {
            akcr.a(str);
        }
        this.k = new rax(avatarView);
        avatarView = this.a;
        if (avatarView == null) {
            akcr.a(str);
        }
        View storyView = avatarView.getStoryView();
        AvatarView avatarView2 = this.a;
        if (avatarView2 == null) {
            akcr.a(str);
        }
        this.l = new abua(storyView, avatarView2.getArcView());
        AvatarView avatarView3 = this.a;
        if (avatarView3 == null) {
            akcr.a(str);
        }
        rdk rdk = this;
        avatarView3.setOnClickListener(new rdm(new i(rdk)));
        avatarView3 = this.a;
        if (avatarView3 == null) {
            akcr.a(str);
        }
        avatarView3.setOnLongClickListener(new rdn(new j(rdk)));
        ajej f = ral.d.f.a((ajdw) ral.c.l()).f((ajfb) new k(this, ral));
        akcr.a((Object) f, "bindingContext.feedToolt…anager)\n                }");
        ajvv.a(f, ral.a);
        findViewById = view.findViewById(R.id.reply_stub);
        akcr.a(findViewById, "findViewById(R.id.reply_stub)");
        this.q = new ViewStubWrapper((ViewStub) findViewById);
        ViewStubWrapper viewStubWrapper = this.q;
        if (viewStubWrapper == null) {
            akcr.a("replyViewStubWrapper");
        }
        viewStubWrapper.setOnClickListener(new e(this, view));
        findViewById = view.findViewById(R.id.reply_pill_button_stub);
        akcr.a(findViewById, "findViewById(R.id.reply_pill_button_stub)");
        this.r = new ViewStubWrapper((ViewStub) findViewById);
        viewStubWrapper = this.r;
        if (viewStubWrapper == null) {
            akcr.a("replyPillButtonViewStubWrapper");
        }
        viewStubWrapper.setOnClickListener(new f(this, view));
        findViewById = view.findViewById(R.id.typing_indicator_stub);
        akcr.a(findViewById, "findViewById(R.id.typing_indicator_stub)");
        this.f = new ViewStubWrapper((ViewStub) findViewById);
        Object findViewById2 = view.findViewById(R.id.icon_container);
        akcr.a(findViewById2, "findViewById(R.id.icon_container)");
        this.n = findViewById2;
        findViewById = view.getContext();
        akcr.a(findViewById, "itemView.context");
        this.p = new rdi(findViewById, new g(this, view));
        findViewById2 = view.findViewById(R.id.subtext_feed_icon);
        ImageView imageView = (ImageView) findViewById2;
        rdi rdi = this.p;
        if (rdi == null) {
            akcr.a("subtextFeedIconDrawable");
        }
        imageView.setImageDrawable(rdi);
        imageView.setScaleType(ScaleType.CENTER_CROP);
        akcr.a(findViewById2, "findViewById<ImageView>(…CENTER_CROP\n            }");
        this.b = findViewById2;
        findViewById2 = view.findViewById(R.id.progress);
        akcr.a(findViewById2, "findViewById(R.id.progress)");
        this.o = (LoadingSpinnerView) findViewById2;
        findViewById = view.findViewById(R.id.cognac_button_stub);
        akcr.a(findViewById, "findViewById(R.id.cognac_button_stub)");
        this.s = new ViewStubWrapper((ViewStub) findViewById);
        viewStubWrapper = this.s;
        if (viewStubWrapper == null) {
            akcr.a("cognacButtonViewStubWrapper");
        }
        viewStubWrapper.setOnClickListener(new h(this, view));
        view.setOnTouchListener(new rdo(new l(rdk)));
        if (view instanceof TouchAuditingStackingLayout) {
            ((TouchAuditingStackingLayout) view).setOnInterceptTouchEventListener(new m(this));
        }
        raz raz = new raz();
        View[] viewArr = new View[1];
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("name");
        }
        viewArr[0] = textView;
        raz.a(viewArr);
        View[] viewArr2 = new View[1];
        View view2 = this.n;
        if (view2 == null) {
            akcr.a("subtextFeedIconContainer");
        }
        viewArr2[0] = view2;
        raz.a(viewArr2);
        this.j = raz;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("name");
        }
        textView.performHapticFeedback(0);
        zke eventDispatcher = getEventDispatcher();
        zmy model = getModel();
        if (model == null) {
            akcr.a();
        }
        eventDispatcher.a(new rcj((rdt) model, qxo.b.getName()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:249:0x0372 in {8, 11, 14, 17, 24, 25, 28, 29, 37, 42, 43, 48, 49, 50, 54, 55, 61, 64, 67, 68, 75, 78, 79, 82, 83, 88, 93, 94, 96, 97, 100, 105, 108, 111, 120, 121, 124, 125, 131, 136, 143, 144, 147, 150, 151, 152, 155, 157, 158, 161, 162, 165, 168, 169, 177, 180, 183, 188, 193, 194, 199, 204, 207, 208, 210, 213, 218, 221, 226, 229, 230, 233, 236, 238, 241, 243, 246, 248} preds:[]
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
    public final /* synthetic */ void onBind(defpackage.zmy r19, defpackage.zmy r20) {
        /*
        r18 = this;
        r1 = r18;
        r0 = "";
        r2 = r19;
        r2 = (defpackage.rdt) r2;
        r3 = r20;
        r3 = (defpackage.rdt) r3;
        r4 = "model";
        defpackage.akcr.b(r2, r4);
        defpackage.in.a(r0);	 Catch:{ all -> 0x0370 }
        r5 = r1.g;	 Catch:{ all -> 0x036b }
        r6 = "name";
        if (r5 != 0) goto L_0x001d;
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x036b }
        r7 = r2.E;	 Catch:{ all -> 0x036b }
        r7 = (java.lang.CharSequence) r7;	 Catch:{ all -> 0x036b }
        r5.setText(r7);	 Catch:{ all -> 0x036b }
        r5 = r1.g;	 Catch:{ all -> 0x036b }
        if (r5 != 0) goto L_0x002b;	 Catch:{ all -> 0x036b }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x036b }
        r6 = r2.y;	 Catch:{ all -> 0x036b }
        r6 = (java.lang.CharSequence) r6;	 Catch:{ all -> 0x036b }
        r5.setContentDescription(r6);	 Catch:{ all -> 0x036b }
        r5 = r2.F;	 Catch:{ all -> 0x036b }
        r6 = r1.m;	 Catch:{ all -> 0x036b }
        r6 = defpackage.akcr.a(r6, r5);	 Catch:{ all -> 0x036b }
        r7 = 0;	 Catch:{ all -> 0x036b }
        if (r6 == 0) goto L_0x003f;	 Catch:{ all -> 0x036b }
        if (r5 != 0) goto L_0x006a;	 Catch:{ all -> 0x036b }
        r6 = r1.m;	 Catch:{ all -> 0x036b }
        if (r6 == 0) goto L_0x0046;	 Catch:{ all -> 0x036b }
        r6.b();	 Catch:{ all -> 0x036b }
        r1.m = r7;	 Catch:{ all -> 0x036b }
        r6 = "subtext";
        if (r5 == 0) goto L_0x005e;
        r8 = r1.h;	 Catch:{ all -> 0x036b }
        if (r8 != 0) goto L_0x0053;	 Catch:{ all -> 0x036b }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x036b }
        r8 = (android.widget.TextView) r8;	 Catch:{ all -> 0x036b }
        r5.a(r8);	 Catch:{ all -> 0x036b }
        r5.a();	 Catch:{ all -> 0x036b }
        r1.m = r5;	 Catch:{ all -> 0x036b }
        goto L_0x006a;	 Catch:{ all -> 0x036b }
        r5 = r1.h;	 Catch:{ all -> 0x036b }
        if (r5 != 0) goto L_0x0065;	 Catch:{ all -> 0x036b }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x036b }
        r6 = r2.G;	 Catch:{ all -> 0x036b }
        r5.setText(r6);	 Catch:{ all -> 0x036b }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        defpackage.in.a(r0);	 Catch:{ all -> 0x0370 }
        r5 = "avatarIcon";
        if (r3 == 0) goto L_0x0084;
        r8 = r3.getId();	 Catch:{ all -> 0x0081 }
        r10 = r2.getId();	 Catch:{ all -> 0x0081 }
        r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));	 Catch:{ all -> 0x0081 }
        if (r6 == 0) goto L_0x008f;	 Catch:{ all -> 0x0081 }
        goto L_0x0084;	 Catch:{ all -> 0x0081 }
        r0 = move-exception;	 Catch:{ all -> 0x0081 }
        goto L_0x0367;	 Catch:{ all -> 0x0081 }
        r6 = r1.a;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x008b;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x0081 }
        r8 = 4;	 Catch:{ all -> 0x0081 }
        r6.setVisibility(r8);	 Catch:{ all -> 0x0081 }
        r6 = r2.t;	 Catch:{ all -> 0x0081 }
        if (r6 == 0) goto L_0x00a3;	 Catch:{ all -> 0x0081 }
        r6 = r2.L;	 Catch:{ all -> 0x0081 }
        r6._id();	 Catch:{ all -> 0x0081 }
        r6 = r2.x;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x009f;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0081 }
        r1.a(r6);	 Catch:{ all -> 0x0081 }
        goto L_0x00d5;	 Catch:{ all -> 0x0081 }
        r6 = r18.e();	 Catch:{ all -> 0x0081 }
        r6 = (defpackage.ral) r6;	 Catch:{ all -> 0x0081 }
        r8 = r6.b;	 Catch:{ all -> 0x0081 }
        r6 = r2.L;	 Catch:{ all -> 0x0081 }
        r9 = r6._id();	 Catch:{ all -> 0x0081 }
        r11 = r2.g;	 Catch:{ all -> 0x0081 }
        r12 = r2.h;	 Catch:{ all -> 0x0081 }
        r6 = r2.L;	 Catch:{ all -> 0x0081 }
        r13 = r6.lastInteractionTimestamp();	 Catch:{ all -> 0x0081 }
        r6 = r18.e();	 Catch:{ all -> 0x0081 }
        r6 = (defpackage.ral) r6;	 Catch:{ all -> 0x0081 }
        r14 = r6.c;	 Catch:{ all -> 0x0081 }
        r6 = new rdk$b;	 Catch:{ all -> 0x0081 }
        r15 = r1;	 Catch:{ all -> 0x0081 }
        r15 = (defpackage.rdk) r15;	 Catch:{ all -> 0x0081 }
        r6.<init>(r15);	 Catch:{ all -> 0x0081 }
        r15 = r6;	 Catch:{ all -> 0x0081 }
        r15 = (defpackage.akbw) r15;	 Catch:{ all -> 0x0081 }
        r6 = r8.loadAvatarsForFeed(r9, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x0081 }
        r1.bindUntilRecycle(r6);	 Catch:{ all -> 0x0081 }
        r6 = r2.d;	 Catch:{ all -> 0x0081 }
        r8 = defpackage.rbg.CALL_INCOMING;	 Catch:{ all -> 0x0081 }
        r9 = 1;
        r10 = 0;
        if (r6 != r8) goto L_0x00df;
        r6 = 1;
        goto L_0x00e0;
        r6 = 0;
        r8 = "avatarAnimator";
        if (r6 == 0) goto L_0x0119;
        r6 = r1.k;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x00eb;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r8);	 Catch:{ all -> 0x0081 }
        r8 = r6.a;	 Catch:{ all -> 0x0081 }
        r8 = r8.compareAndSet(r10, r9);	 Catch:{ all -> 0x0081 }
        if (r8 == 0) goto L_0x0125;	 Catch:{ all -> 0x0081 }
        r8 = new android.view.animation.TranslateAnimation;	 Catch:{ all -> 0x0081 }
        r11 = 1132068864; // 0x437a0000 float:250.0 double:5.593163344E-315;	 Catch:{ all -> 0x0081 }
        r12 = 0;	 Catch:{ all -> 0x0081 }
        r8.<init>(r12, r12, r11, r12);	 Catch:{ all -> 0x0081 }
        r11 = new android.view.animation.OvershootInterpolator;	 Catch:{ all -> 0x0081 }
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x0081 }
        r11.<init>(r12);	 Catch:{ all -> 0x0081 }
        r11 = (android.view.animation.Interpolator) r11;	 Catch:{ all -> 0x0081 }
        r8.setInterpolator(r11);	 Catch:{ all -> 0x0081 }
        r11 = 250; // 0xfa float:3.5E-43 double:1.235E-321;	 Catch:{ all -> 0x0081 }
        r8.setDuration(r11);	 Catch:{ all -> 0x0081 }
        r11 = 300; // 0x12c float:4.2E-43 double:1.48E-321;	 Catch:{ all -> 0x0081 }
        r8.setStartOffset(r11);	 Catch:{ all -> 0x0081 }
        r6 = r6.b;	 Catch:{ all -> 0x0081 }
        r8 = (android.view.animation.Animation) r8;	 Catch:{ all -> 0x0081 }
        r6.startAnimation(r8);	 Catch:{ all -> 0x0081 }
        goto L_0x0125;	 Catch:{ all -> 0x0081 }
        r6 = r1.k;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x0120;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r8);	 Catch:{ all -> 0x0081 }
        r6 = r6.a;	 Catch:{ all -> 0x0081 }
        r6.compareAndSet(r9, r10);	 Catch:{ all -> 0x0081 }
        r6 = r2.b;	 Catch:{ all -> 0x0081 }
        r8 = "loadingArcAnimator";
        if (r6 == 0) goto L_0x0140;
        r6 = r1.a;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x0132;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x0081 }
        r6.hideCircle();	 Catch:{ all -> 0x0081 }
        r6 = r1.l;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x013c;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r8);	 Catch:{ all -> 0x0081 }
        r6.b();	 Catch:{ all -> 0x0081 }
        goto L_0x014a;	 Catch:{ all -> 0x0081 }
        r6 = r1.l;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x0147;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r8);	 Catch:{ all -> 0x0081 }
        r6.c();	 Catch:{ all -> 0x0081 }
        r6 = r2.B;	 Catch:{ all -> 0x0081 }
        r8 = r1.f;	 Catch:{ all -> 0x0081 }
        r11 = "typingViewStubWrapper";
        if (r8 != 0) goto L_0x0155;
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0081 }
        r12 = r2.f;	 Catch:{ all -> 0x0081 }
        r13 = 8;	 Catch:{ all -> 0x0081 }
        if (r12 == 0) goto L_0x016b;	 Catch:{ all -> 0x0081 }
        r12 = r2.n();	 Catch:{ all -> 0x0081 }
        if (r12 == 0) goto L_0x0166;	 Catch:{ all -> 0x0081 }
        r12 = r12.shouldShowStory();	 Catch:{ all -> 0x0081 }
        goto L_0x0167;	 Catch:{ all -> 0x0081 }
        r12 = 0;	 Catch:{ all -> 0x0081 }
        if (r12 != 0) goto L_0x016b;	 Catch:{ all -> 0x0081 }
        r12 = 0;	 Catch:{ all -> 0x0081 }
        goto L_0x016d;	 Catch:{ all -> 0x0081 }
        r12 = 8;	 Catch:{ all -> 0x0081 }
        r8.setVisibility(r12);	 Catch:{ all -> 0x0081 }
        r8 = r1.f;	 Catch:{ all -> 0x0081 }
        if (r8 != 0) goto L_0x0177;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0081 }
        r8 = r8.getVisibility();	 Catch:{ all -> 0x0081 }
        if (r8 != 0) goto L_0x018f;	 Catch:{ all -> 0x0081 }
        r8 = r1.f;	 Catch:{ all -> 0x0081 }
        if (r8 != 0) goto L_0x0184;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0081 }
        r8 = r8.getIfInflated();	 Catch:{ all -> 0x0081 }
        r8 = (com.snap.messaging.friendsfeed.ui.view.TypingIndicatorView) r8;	 Catch:{ all -> 0x0081 }
        if (r8 == 0) goto L_0x018f;	 Catch:{ all -> 0x0081 }
        r8.a(r6);	 Catch:{ all -> 0x0081 }
        r6 = r1.a;	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x0196;	 Catch:{ all -> 0x0081 }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x0081 }
        r5 = r2.m();	 Catch:{ all -> 0x0081 }
        r5 = (java.lang.CharSequence) r5;	 Catch:{ all -> 0x0081 }
        r6.setContentDescription(r5);	 Catch:{ all -> 0x0081 }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        defpackage.in.a(r0);	 Catch:{ all -> 0x0370 }
        r5 = r2.C;	 Catch:{ all -> 0x0362 }
        if (r5 == 0) goto L_0x01b6;	 Catch:{ all -> 0x0362 }
        r5 = r1.j;	 Catch:{ all -> 0x0362 }
        if (r5 != 0) goto L_0x01b2;	 Catch:{ all -> 0x0362 }
        r6 = "springAnimator";	 Catch:{ all -> 0x0362 }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x0362 }
        r5.a();	 Catch:{ all -> 0x0362 }
        goto L_0x01c4;	 Catch:{ all -> 0x0362 }
        r5 = r1.j;	 Catch:{ all -> 0x0362 }
        if (r5 != 0) goto L_0x01bf;	 Catch:{ all -> 0x0362 }
        r6 = "springAnimator";	 Catch:{ all -> 0x0362 }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x0362 }
        r5 = r5.a;	 Catch:{ all -> 0x0362 }
        r5.compareAndSet(r9, r10);	 Catch:{ all -> 0x0362 }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        r5 = r2.z;	 Catch:{ all -> 0x0360 }
        r6 = r2.u;	 Catch:{ all -> 0x0360 }
        r8 = r1.n;	 Catch:{ all -> 0x0360 }
        if (r8 != 0) goto L_0x01d4;	 Catch:{ all -> 0x0360 }
        r11 = "subtextFeedIconContainer";	 Catch:{ all -> 0x0360 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0360 }
        r8.setVisibility(r6);	 Catch:{ all -> 0x0360 }
        if (r6 != 0) goto L_0x0267;	 Catch:{ all -> 0x0360 }
        r6 = r2.w;	 Catch:{ all -> 0x0360 }
        r8 = r1.p;	 Catch:{ all -> 0x0360 }
        if (r8 != 0) goto L_0x01e4;	 Catch:{ all -> 0x0360 }
        r11 = "subtextFeedIconDrawable";	 Catch:{ all -> 0x0360 }
        defpackage.akcr.a(r11);	 Catch:{ all -> 0x0360 }
        if (r6 == 0) goto L_0x0228;	 Catch:{ all -> 0x0360 }
        if (r3 == 0) goto L_0x01f2;	 Catch:{ all -> 0x0360 }
        r3 = r3.p;	 Catch:{ all -> 0x0360 }
        if (r3 != 0) goto L_0x01f2;	 Catch:{ all -> 0x0360 }
        r3 = r2.p;	 Catch:{ all -> 0x0360 }
        if (r3 == 0) goto L_0x01f2;	 Catch:{ all -> 0x0360 }
        r3 = 1;	 Catch:{ all -> 0x0360 }
        goto L_0x01f3;	 Catch:{ all -> 0x0360 }
        r3 = 0;	 Catch:{ all -> 0x0360 }
        r11 = r2.c;	 Catch:{ all -> 0x0360 }
        r12 = r2.L;	 Catch:{ all -> 0x0360 }
        r14 = r12._id();	 Catch:{ all -> 0x0360 }
        r11 = r11.a;	 Catch:{ all -> 0x0360 }
        r12 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x0360 }
        r11 = r11.get(r12);	 Catch:{ all -> 0x0360 }
        r11 = (defpackage.qwl) r11;	 Catch:{ all -> 0x0360 }
        r12 = r2.c;	 Catch:{ all -> 0x0360 }
        r14 = r2.L;	 Catch:{ all -> 0x0360 }
        r14 = r14._id();	 Catch:{ all -> 0x0360 }
        r7 = r12.d;	 Catch:{ all -> 0x0360 }
        if (r7 != 0) goto L_0x0214;	 Catch:{ all -> 0x0360 }
        goto L_0x021f;	 Catch:{ all -> 0x0360 }
        r16 = r7.longValue();	 Catch:{ all -> 0x0360 }
        r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));	 Catch:{ all -> 0x0360 }
        if (r7 != 0) goto L_0x021f;	 Catch:{ all -> 0x0360 }
        r7 = r12.f;	 Catch:{ all -> 0x0360 }
        goto L_0x0220;	 Catch:{ all -> 0x0360 }
        r7 = 0;	 Catch:{ all -> 0x0360 }
        r12 = r2.L;	 Catch:{ all -> 0x0360 }
        r12._id();	 Catch:{ all -> 0x0360 }
        r8.a(r6, r3, r11, r7);	 Catch:{ all -> 0x0360 }
        r3 = r1.b;	 Catch:{ all -> 0x0360 }
        if (r3 != 0) goto L_0x0231;	 Catch:{ all -> 0x0360 }
        r7 = "subtextFeedIconView";	 Catch:{ all -> 0x0360 }
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x0360 }
        if (r6 == 0) goto L_0x0235;	 Catch:{ all -> 0x0360 }
        r7 = 0;	 Catch:{ all -> 0x0360 }
        goto L_0x0237;	 Catch:{ all -> 0x0360 }
        r7 = 8;	 Catch:{ all -> 0x0360 }
        r3.setVisibility(r7);	 Catch:{ all -> 0x0360 }
        if (r6 == 0) goto L_0x0243;	 Catch:{ all -> 0x0360 }
        r6 = r6.a;	 Catch:{ all -> 0x0360 }
        r7 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0360 }
        goto L_0x0244;	 Catch:{ all -> 0x0360 }
        r7 = 0;	 Catch:{ all -> 0x0360 }
        r6 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0360 }
        r6 = (java.lang.CharSequence) r6;	 Catch:{ all -> 0x0360 }
        r3.setContentDescription(r6);	 Catch:{ all -> 0x0360 }
        r3 = r1.o;	 Catch:{ all -> 0x0360 }
        if (r3 != 0) goto L_0x0256;	 Catch:{ all -> 0x0360 }
        r6 = "loadingSpinner";	 Catch:{ all -> 0x0360 }
        defpackage.akcr.a(r6);	 Catch:{ all -> 0x0360 }
        r3.setColor(r5);	 Catch:{ all -> 0x0360 }
        r3 = r1.o;	 Catch:{ all -> 0x0360 }
        if (r3 != 0) goto L_0x0262;	 Catch:{ all -> 0x0360 }
        r5 = "loadingSpinner";	 Catch:{ all -> 0x0360 }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x0360 }
        r5 = r2.v;	 Catch:{ all -> 0x0360 }
        r3.setVisibility(r5);	 Catch:{ all -> 0x0360 }
        defpackage.in.a(r0);	 Catch:{ all -> 0x0370 }
        defpackage.akcr.b(r2, r4);	 Catch:{ all -> 0x035b }
        r0 = r1.i;	 Catch:{ all -> 0x035b }
        r3 = "friendmoji";
        if (r0 != 0) goto L_0x0276;
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x035b }
        r0.setVisibility(r13);	 Catch:{ all -> 0x035b }
        r0 = r1.q;	 Catch:{ all -> 0x035b }
        if (r0 != 0) goto L_0x0282;	 Catch:{ all -> 0x035b }
        r5 = "replyViewStubWrapper";	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x035b }
        r0.setVisibility(r13);	 Catch:{ all -> 0x035b }
        r0 = r1.r;	 Catch:{ all -> 0x035b }
        if (r0 != 0) goto L_0x028e;	 Catch:{ all -> 0x035b }
        r5 = "replyPillButtonViewStubWrapper";	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x035b }
        r0.setVisibility(r13);	 Catch:{ all -> 0x035b }
        r0 = r1.s;	 Catch:{ all -> 0x035b }
        r5 = "cognacButtonViewStubWrapper";
        if (r0 != 0) goto L_0x029a;
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x035b }
        r0.setVisibility(r13);	 Catch:{ all -> 0x035b }
        r0 = r2.q;	 Catch:{ all -> 0x035b }
        if (r0 == 0) goto L_0x02af;	 Catch:{ all -> 0x035b }
        r0 = r1.q;	 Catch:{ all -> 0x035b }
        if (r0 != 0) goto L_0x02aa;	 Catch:{ all -> 0x035b }
        r2 = "replyViewStubWrapper";	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x035b }
        r0.setVisibility(r10);	 Catch:{ all -> 0x035b }
        goto L_0x0357;	 Catch:{ all -> 0x035b }
        r0 = r2.o();	 Catch:{ all -> 0x035b }
        if (r0 == 0) goto L_0x02bf;	 Catch:{ all -> 0x035b }
        r0 = r1.r;	 Catch:{ all -> 0x035b }
        if (r0 != 0) goto L_0x02aa;	 Catch:{ all -> 0x035b }
        r2 = "replyPillButtonViewStubWrapper";	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x035b }
        goto L_0x02aa;	 Catch:{ all -> 0x035b }
        r0 = r2.s;	 Catch:{ all -> 0x035b }
        if (r0 == 0) goto L_0x031a;	 Catch:{ all -> 0x035b }
        r0 = r1.s;	 Catch:{ all -> 0x035b }
        if (r0 != 0) goto L_0x02ca;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x035b }
        r0 = r0.get();	 Catch:{ all -> 0x035b }
        r3 = 2131428024; // 0x7f0b02b8 float:1.847768E38 double:1.053065363E-314;	 Catch:{ all -> 0x035b }
        r0 = r0.findViewById(r3);	 Catch:{ all -> 0x035b }
        r0 = (com.snap.imageloading.view.SnapImageView) r0;	 Catch:{ all -> 0x035b }
        r3 = new jxj$b$a;	 Catch:{ all -> 0x035b }
        r3.<init>();	 Catch:{ all -> 0x035b }
        r3 = r3.d(r9);	 Catch:{ all -> 0x035b }
        r3 = r3.d();	 Catch:{ all -> 0x035b }
        r4 = 2131099895; // 0x7f0600f7 float:1.7812156E38 double:1.052903246E-314;	 Catch:{ all -> 0x035b }
        r3 = r3.a(r4);	 Catch:{ all -> 0x035b }
        r3 = r3.b();	 Catch:{ all -> 0x035b }
        r4 = "ViewBitmapLoader.Request…\n                .build()";	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x035b }
        r0.setRequestOptions(r3);	 Catch:{ all -> 0x035b }
        r2 = r2.j;	 Catch:{ all -> 0x035b }
        if (r2 == 0) goto L_0x02fe;	 Catch:{ all -> 0x035b }
        r7 = r2.h;	 Catch:{ all -> 0x035b }
        goto L_0x02ff;	 Catch:{ all -> 0x035b }
        r7 = 0;	 Catch:{ all -> 0x035b }
        if (r7 != 0) goto L_0x0304;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a();	 Catch:{ all -> 0x035b }
        r2 = android.net.Uri.parse(r7);	 Catch:{ all -> 0x035b }
        r3 = "Uri.parse(thumbnailUrl)";	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x035b }
        r3 = defpackage.eym.b;	 Catch:{ all -> 0x035b }
        r0.setImageUri(r2, r3);	 Catch:{ all -> 0x035b }
        r0 = r1.s;	 Catch:{ all -> 0x035b }
        if (r0 != 0) goto L_0x02aa;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x035b }
        goto L_0x02aa;	 Catch:{ all -> 0x035b }
        r0 = r2.r;	 Catch:{ all -> 0x035b }
        if (r0 == 0) goto L_0x0357;	 Catch:{ all -> 0x035b }
        defpackage.akcr.b(r2, r4);	 Catch:{ all -> 0x035b }
        r0 = r2.D;	 Catch:{ all -> 0x035b }
        r4 = r1.i;	 Catch:{ all -> 0x035b }
        if (r4 != 0) goto L_0x032a;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x035b }
        r4 = r4.getText();	 Catch:{ all -> 0x035b }
        r5 = r1.i;	 Catch:{ all -> 0x035b }
        if (r5 != 0) goto L_0x0335;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x035b }
        r5.setVisibility(r10);	 Catch:{ all -> 0x035b }
        r4 = defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x035b }
        r4 = r4 ^ r9;	 Catch:{ all -> 0x035b }
        if (r4 == 0) goto L_0x0357;	 Catch:{ all -> 0x035b }
        r4 = r1.i;	 Catch:{ all -> 0x035b }
        if (r4 != 0) goto L_0x0346;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x035b }
        r2 = r2.k();	 Catch:{ all -> 0x035b }
        r4.setTypeface(r2);	 Catch:{ all -> 0x035b }
        r2 = r1.i;	 Catch:{ all -> 0x035b }
        if (r2 != 0) goto L_0x0354;	 Catch:{ all -> 0x035b }
        defpackage.akcr.a(r3);	 Catch:{ all -> 0x035b }
        r2.setText(r0);	 Catch:{ all -> 0x035b }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        return;	 Catch:{ all -> 0x0370 }
        r0 = move-exception;	 Catch:{ all -> 0x0370 }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        throw r0;	 Catch:{ all -> 0x0370 }
        r0 = move-exception;	 Catch:{ all -> 0x0370 }
        throw r0;	 Catch:{ all -> 0x0370 }
        r0 = move-exception;	 Catch:{ all -> 0x0370 }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        throw r0;	 Catch:{ all -> 0x0370 }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        throw r0;	 Catch:{ all -> 0x0370 }
        r0 = move-exception;	 Catch:{ all -> 0x0370 }
        defpackage.in.a();	 Catch:{ all -> 0x0370 }
        throw r0;	 Catch:{ all -> 0x0370 }
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdk.onBind(zmy, zmy):void");
    }

    public final boolean onFailedToRecycleView() {
        return true;
    }

    public final void onRecycle() {
        super.onRecycle();
        this.d.a();
    }
}
