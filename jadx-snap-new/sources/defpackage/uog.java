package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.brightcove.player.captioning.TTMLParser.Attributes;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snapchat.android.R;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: uog */
public final class uog extends zll<uny> {
    public ObjectAnimator a;
    public unz b;
    public ViewGroup c;
    public EditText d;
    TextView e;
    public final ajxe f = ajxh.a(new c(this));
    public final ajxe g = ajxh.a(new p(this));
    public boolean h;
    final Context i;
    public final uoe j;
    private FrameLayout k;
    private ajei l;
    private final ajxe m;
    private final ajxe n = ajxh.a(new h(this));
    private final ajxe o = ajxh.a(b.a);
    private final ajxe p = ajxh.a(new g(this));
    private unv q;
    private final zgb r;

    /* renamed from: uog$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: uog$d */
    public static final class d implements TextWatcher {
        private /* synthetic */ uog a;

        d(uog uog) {
            this.a = uog;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                String obj = editable.toString();
                if (obj != null) {
                    if ((((CharSequence) obj).length() > 0 ? 1 : 0) == 1) {
                        uog.a(this.a).a(this.a.j.a(editable.toString()));
                        TextView textView = this.a.e;
                        if (textView == null) {
                            akcr.a("userTagAtSignTextView");
                        }
                        textView.setTextColor(-1);
                        EditText editText = this.a.d;
                        if (editText == null) {
                            akcr.a("userTagEditTextView");
                        }
                        editText.setHint("");
                        return;
                    }
                }
            }
            uog.a(this.a).a(this.a.j.a());
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.j.b();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: uog$e */
    static final class e implements OnEditorActionListener {
        private /* synthetic */ uog a;

        e(uog uog) {
            this.a = uog;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.a.b();
            return true;
        }
    }

    /* renamed from: uog$i */
    static final class i<T> implements ajfl<Integer> {
        private /* synthetic */ uog a;

        i(uog uog) {
            this.a = uog;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Integer) obj, "it");
            return this.a.h;
        }
    }

    /* renamed from: uog$j */
    static final class j<T> implements ajfb<Integer> {
        private /* synthetic */ uog a;

        j(uog uog) {
            this.a = uog;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            unz a = uog.a(this.a);
            akcr.a(obj, "it");
            a.a().a(Integer.valueOf(obj.intValue()));
        }
    }

    /* renamed from: uog$k */
    static final class k<T> implements ajfl<Boolean> {
        private /* synthetic */ uog a;

        k(uog uog) {
            this.a = uog;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.h;
        }
    }

    /* renamed from: uog$l */
    static final class l<T> implements ajfl<Boolean> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return !bool.booleanValue();
        }
    }

    /* renamed from: uog$m */
    static final class m<T> implements ajfb<Boolean> {
        private /* synthetic */ uog a;

        m(uog uog) {
            this.a = uog;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            if (this.a.h) {
                akcr.a(obj, Property.VISIBLE);
                if (obj.booleanValue()) {
                    uog.a(this.a).b().setVisibility(0);
                    return;
                }
                this.a.b();
            }
        }
    }

    /* renamed from: uog$n */
    static final class n<T> implements ajfb<MotionEvent> {
        private /* synthetic */ uog a;

        n(uog uog) {
            this.a = uog;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b();
        }
    }

    /* renamed from: uog$o */
    static final class o<T> implements ajfb<Throwable> {
        public static final o a = new o();

        o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: uog$b */
    static final class b extends akcs implements akbk<zkf> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zkf();
        }
    }

    /* renamed from: uog$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ uog a;

        c(uog uog) {
            this.a = uog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.i.getResources().getString(R.string.mention_sticker_mention_hint);
        }
    }

    /* renamed from: uog$f */
    static final class f extends akcs implements akbk<ukp> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ukp) this.a.get();
        }
    }

    /* renamed from: uog$g */
    static final class g extends akcs implements akbk<InputMethodManager> {
        private /* synthetic */ uog a;

        g(uog uog) {
            this.a = uog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.i.getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: uog$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ uog a;

        h(uog uog) {
            this.a = uog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("UserTaggingEditorController"));
        }
    }

    /* renamed from: uog$p */
    static final class p extends akcs implements akbk<Integer> {
        private /* synthetic */ uog a;

        p(uog uog) {
            this.a = uog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.i.getResources().getColor(R.color.white_forty_opacity));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(uog.class), "keyboardDetector", "getKeyboardDetector()Lcom/snap/previewtools/shared/CaptionKeyboardDetector;"), new akdc(akde.a(uog.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(uog.class), "bus", "getBus()Lcom/snap/ui/event/RxBus;"), new akdc(akde.a(uog.class), "keyboardManager", "getKeyboardManager()Landroid/view/inputmethod/InputMethodManager;"), new akdc(akde.a(uog.class), "hintText", "getHintText()Ljava/lang/String;"), new akdc(akde.a(uog.class), "whiteFortyOpacity", "getWhiteFortyOpacity()I")};
        a aVar = new a();
    }

    public uog(Context context, zgb zgb, uoe uoe, ajwy<ukp> ajwy) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(uoe, "userTaggingDataSource");
        akcr.b(ajwy, "keyboardDetectorProvider");
        this.i = context;
        this.r = zgb;
        this.j = uoe;
        this.m = ajxh.a(new f(ajwy));
    }

    private final ukp c() {
        return (ukp) this.m.b();
    }

    private final zkf d() {
        return (zkf) this.o.b();
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.p.b();
    }

    /* renamed from: a */
    public final void takeTarget(uny uny) {
        akcr.b(uny, "target");
        super.takeTarget(uny);
        this.k = uny.a;
        this.l = uny.d;
        Object a = d().a(this);
        akcr.a(a, "bus.subscribe(this)");
        ajei ajei = this.l;
        String str = "toolDisposal";
        if (ajei == null) {
            akcr.a(str);
        }
        std.a(a, ajei);
        Context context = this.i;
        FrameLayout frameLayout = this.k;
        String str2 = "toolLayout";
        if (frameLayout == null) {
            akcr.a(str2);
        }
        zgb zgb = this.r;
        uoe uoe = this.j;
        zkf d = d();
        ajei ajei2 = this.l;
        if (ajei2 == null) {
            akcr.a(str);
        }
        this.b = new unz(context, frameLayout, zgb, uoe, d, ajei2);
        a = c().c.a((ajfl) new i(this)).f((ajfb) new j(this));
        akcr.a(a, "keyboardDetector.keyboar…ion(it)\n                }");
        ajei ajei3 = this.l;
        if (ajei3 == null) {
            akcr.a(str);
        }
        std.a(a, ajei3);
        a = c().b.a((ajfl) new k(this)).b((ajfl) l.a).f((ajfb) new m(this));
        akcr.a(a, "keyboardDetector.keyboar…      }\n                }");
        ajei3 = this.l;
        if (ajei3 == null) {
            akcr.a(str);
        }
        std.a(a, ajei3);
        LayoutInflater from = LayoutInflater.from(this.i);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            akcr.a(str2);
        }
        View inflate = from.inflate(R.layout.info_sticker_mention, frameLayout2, false);
        if (inflate != null) {
            this.c = (LinearLayout) inflate;
            ViewGroup viewGroup = this.c;
            String str3 = "userTagEditingContainer";
            if (viewGroup == null) {
                akcr.a(str3);
            }
            a = viewGroup.findViewById(R.id.mention_sticker_edit_text);
            akcr.a(a, "userTagEditingContainer.…ention_sticker_edit_text)");
            this.d = (EditText) a;
            viewGroup = this.c;
            if (viewGroup == null) {
                akcr.a(str3);
            }
            a = viewGroup.findViewById(R.id.mention_sticker_text_at);
            akcr.a(a, "userTagEditingContainer.….mention_sticker_text_at)");
            this.e = (TextView) a;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.i.getResources().getDimensionPixelOffset(R.dimen.default_gap_14x);
            frameLayout2 = this.k;
            if (frameLayout2 == null) {
                akcr.a(str2);
            }
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 == null) {
                akcr.a(str3);
            }
            frameLayout2.addView(viewGroup2, layoutParams);
            EditText editText = this.d;
            str2 = "userTagEditTextView";
            if (editText == null) {
                akcr.a(str2);
            }
            editText.addTextChangedListener(new d(this));
            editText = this.d;
            if (editText == null) {
                akcr.a(str2);
            }
            editText.setOnEditorActionListener(new e(this));
            int color = this.i.getResources().getColor(R.color.black_fifty_opacity);
            a = ObjectAnimator.ofObject(uny.a, Attributes.BG_COLOR, new ArgbEvaluator(), new Object[]{Integer.valueOf(0), Integer.valueOf(color)});
            akcr.a(a, "ObjectAnimator.ofObject(…         backgroundColor)");
            this.a = a;
            ObjectAnimator objectAnimator = this.a;
            if (objectAnimator == null) {
                akcr.a("backgroundColorAnimator");
            }
            objectAnimator.setDuration(150);
            Object a2 = uny.c.b((ajdw) ((zfw) this.n.b()).l()).a((ajfb) new n(this), (ajfb) o.a);
            akcr.a(a2, "target.previewTouchObser…age}\")\n                })");
            ajei ajei4 = this.l;
            if (ajei4 == null) {
                akcr.a(str);
            }
            std.a(a2, ajei4);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    public final void b() {
        /*
        r5 = this;
        r0 = r5.getTarget();
        r0 = (defpackage.uny) r0;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r1 = "target ?: return";
        defpackage.akcr.a(r0, r1);
        r1 = r5.h;
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r0 = r0.b;
        r1 = r5.d;
        r2 = "userTagEditTextView";
        if (r1 != 0) goto L_0x001e;
    L_0x001b:
        defpackage.akcr.a(r2);
    L_0x001e:
        r1 = r1.getText();
        if (r1 == 0) goto L_0x003f;
    L_0x0024:
        r1 = r1.toString();
        if (r1 == 0) goto L_0x003f;
    L_0x002a:
        if (r1 == 0) goto L_0x0037;
    L_0x002c:
        r1 = (java.lang.CharSequence) r1;
        r1 = defpackage.akgc.b(r1);
        r1 = r1.toString();
        goto L_0x0040;
    L_0x0037:
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.CharSequence";
        r0.<init>(r1);
        throw r0;
    L_0x003f:
        r1 = 0;
    L_0x0040:
        r3 = defpackage.unw.EXIT_EDITING;
        r4 = new unx;
        r4.<init>(r1, r3);
        r0.a(r4);
        r0 = r5.c;
        if (r0 != 0) goto L_0x0053;
    L_0x004e:
        r1 = "userTagEditingContainer";
        defpackage.akcr.a(r1);
    L_0x0053:
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r5.b;
        if (r0 != 0) goto L_0x0061;
    L_0x005c:
        r1 = "carouselViewController";
        defpackage.akcr.a(r1);
    L_0x0061:
        r0.c();
        r0 = r5.a;
        r1 = "backgroundColorAnimator";
        if (r0 != 0) goto L_0x006d;
    L_0x006a:
        defpackage.akcr.a(r1);
    L_0x006d:
        r0 = r0.isRunning();
        if (r0 == 0) goto L_0x007d;
    L_0x0073:
        r0 = r5.a;
        if (r0 != 0) goto L_0x007a;
    L_0x0077:
        defpackage.akcr.a(r1);
    L_0x007a:
        r0.cancel();
    L_0x007d:
        r0 = r5.a;
        if (r0 != 0) goto L_0x0084;
    L_0x0081:
        defpackage.akcr.a(r1);
    L_0x0084:
        r0.reverse();
        r0 = r5.a();
        r1 = r5.d;
        if (r1 != 0) goto L_0x0092;
    L_0x008f:
        defpackage.akcr.a(r2);
    L_0x0092:
        r1 = r1.getWindowToken();
        r2 = 0;
        r0.hideSoftInputFromWindow(r1, r2);
        r5.h = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uog.b():void");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUserTaggingCarouselItemClicked(uoa uoa) {
        akcr.b(uoa, "event");
        EditText editText = this.d;
        String str = "userTagEditTextView";
        if (editText == null) {
            akcr.a(str);
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        editText = this.d;
        if (editText == null) {
            akcr.a(str);
        }
        text = editText.getText();
        if (text != null) {
            str = uoa.a.a.b.getUsername();
            if (str != null) {
                Object toUpperCase = str.toUpperCase();
                akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase()");
                text.insert(0, (CharSequence) toUpperCase);
            } else {
                throw new ajxt("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.q = uoa.a.a;
        b();
    }
}
