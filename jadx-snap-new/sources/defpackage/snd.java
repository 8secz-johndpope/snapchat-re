package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.openlayout.OpenLayout;
import defpackage.siw.a;
import defpackage.siw.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: snd */
public class snd extends slm {
    public static final Predicate<sqh> a = new 1();
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private final OnClickListener E;
    private final a L;
    final ViewGroup b;
    final OpenLayout c;
    final ImageView d;
    final ProgressBar e;
    final ImageView f;
    final sjc g;
    final sjc h;
    final ObjectAnimator i;
    final AtomicBoolean j;
    private final float k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private ImageView p;
    private final TextView q;
    private final LinearLayout r;
    private final LinearLayout s;
    private final int t;
    private final int u;
    private final ViewGroup v;
    private boolean w;
    private boolean x;
    private float y;
    private final Runnable z;

    /* renamed from: snd$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((Boolean) ((sqh) obj).a(sqh.bE)).booleanValue();
        }
    }

    /* renamed from: snd$3 */
    class 3 implements OnClickListener {
        3() {
        }

        public final void onClick(View view) {
            szw szw = snd.this.H;
            if (!((Boolean) szw.c(sqh.cz, Boolean.FALSE)).booleanValue()) {
                snd.this.C().a("chrome_clicked", szw);
            }
        }
    }

    /* renamed from: snd$4 */
    class 4 implements a {
        4() {
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            sjc sjc;
            if (snd.this.d.equals(imageView)) {
                sjc = snd.this.g;
            } else {
                if (snd.this.f.equals(imageView)) {
                    sjc = snd.this.h;
                }
                snd.this.e.setVisibility(4);
                snd.this.d.setVisibility(0);
            }
            sjc.b(cVar);
            snd.this.e.setVisibility(4);
            snd.this.d.setVisibility(0);
        }

        public final void a(String str, ImageView imageView, Exception exception) {
            snd.this.c.setVisibility(8);
        }
    }

    /* renamed from: snd$2 */
    class 2 implements Runnable {

        /* renamed from: snd$2$1 */
        class 1 extends tau {
            1() {
            }

            public final void onAnimationEnd(Animator animator) {
                snd.this.j.set(false);
            }
        }

        2() {
        }

        public final void run() {
            snd.this.i.removeAllListeners();
            snd.this.i.setFloatValues(new float[]{snd.this.b.getAlpha(), 1.0f});
            snd.this.i.start();
            snd.this.i.addListener(new 1());
        }
    }

    snd(Context context) {
        this((ViewGroup) View.inflate(context, R.layout.chrome_view_layout, null), (float) abtp.a(context));
    }

    private snd(ViewGroup viewGroup, float f) {
        this.j = new AtomicBoolean(false);
        this.A = false;
        this.B = 0;
        this.C = false;
        this.D = false;
        this.E = new 3();
        this.L = new 4();
        this.b = viewGroup;
        this.k = f;
        this.l = (TextView) viewGroup.findViewById(R.id.chrome_view_display_name);
        this.n = (TextView) viewGroup.findViewById(R.id.chrome_view_emoji);
        this.o = (TextView) viewGroup.findViewById(R.id.chrome_view_subtitle);
        this.m = (TextView) viewGroup.findViewById(R.id.chrome_view_timestamp);
        this.p = (ImageView) viewGroup.findViewById(R.id.chrome_search_icon_view);
        this.q = (TextView) viewGroup.findViewById(R.id.chrome_view_location);
        this.r = (LinearLayout) viewGroup.findViewById(R.id.context_menu_chrome);
        this.c = (OpenLayout) this.b.findViewById(R.id.chrome_icon_container);
        this.d = (ImageView) this.b.findViewById(R.id.chrome_icon);
        this.e = (ProgressBar) this.b.findViewById(R.id.chrome_icon_progress_bar);
        this.t = viewGroup.getResources().getDimensionPixelSize(R.dimen.chrome_icon_size);
        this.f = (ImageView) this.b.findViewById(R.id.chrome_subtitle_icon);
        this.u = viewGroup.getResources().getDimensionPixelSize(R.dimen.chrome_subtitle_icon_size);
        this.v = (ViewGroup) this.b.findViewById(R.id.chrome_subtitle_container);
        this.s = (LinearLayout) this.b.findViewById(R.id.chrome_close_button_container);
        String str = "ChromeLayerViewController";
        this.g = new sjc(str);
        this.h = new sjc(str);
        this.b.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.i = ObjectAnimator.ofFloat(this.b, "alpha", new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        this.z = new 2();
        abvf abvk = new abvk();
        abvk.setCornerRadius(this.t / 2);
        this.c.a(abvk);
    }

    private void a(sqh sqh) {
        CharSequence charSequence = (CharSequence) sqh.c(sqh.bH, "");
        sqf sqf = (sqf) sqh.a(sqh.bI);
        this.f.setVisibility(8);
        if (TextUtils.isEmpty(charSequence)) {
            this.v.setVisibility(8);
            return;
        }
        this.o.setText(charSequence);
        this.v.setVisibility(0);
        if (sqf != null) {
            this.f.setVisibility(0);
            siw D = D();
            String str = sqf.a;
            abnb abnb = sqf.b;
            ImageView imageView = this.f;
            int i = this.u;
            this.h.a(D.a(str, abnb, imageView, i, i, this.L));
        }
    }

    private void a(boolean z) {
        OnClickListener onClickListener = (!z || this.x) ? null : this.E;
        this.l.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.m.setOnClickListener(onClickListener);
        this.o.setOnClickListener(onClickListener);
        boolean z2 = true;
        int i = onClickListener == null ? -1 : 1;
        if (!this.C && this.B == i) {
            z2 = false;
        }
        this.C = z2;
        if (this.C && this.D) {
            this.C = false;
        }
        this.B = i;
    }

    private void b(sqh sqh) {
        if (!this.A) {
            sqf sqf = (sqf) sqh.a(sqh.bP);
            if (sqf == null) {
                this.c.setVisibility(8);
                return;
            }
            this.c.setVisibility(0);
            this.e.setVisibility(0);
            this.d.setVisibility(4);
            siw D = D();
            String str = sqf.a;
            abnb abnb = sqf.b;
            ImageView imageView = this.d;
            int i = this.t;
            this.g.a(D.a(str, abnb, imageView, i, i, this.L));
            this.A = true;
        }
    }

    private void m() {
        this.b.removeCallbacks(this.z);
        this.i.cancel();
        this.j.set(false);
    }

    private void n() {
        String str = "";
        String str2 = (String) this.H.c(sqh.bF, str);
        if (Strings.isNullOrEmpty(str2)) {
            this.l.setVisibility(8);
        } else {
            this.l.setText(str2);
            this.l.setVisibility(0);
        }
        str2 = this.H.a(sqh.bK, str);
        if (Strings.isNullOrEmpty(str2)) {
            this.m.setVisibility(8);
        } else {
            this.m.setText(str2);
            this.m.setVisibility(0);
        }
        str2 = this.H.a(sqh.bM, str);
        if (Strings.isNullOrEmpty(str2)) {
            this.q.setVisibility(8);
        } else {
            this.q.setText(str2);
            this.q.setVisibility(0);
        }
        str2 = this.H.a(sqh.bG, str);
        if (Strings.isNullOrEmpty(str2)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(str2);
            this.n.setVisibility(0);
        }
        a(this.H);
        this.w = this.H.a(sqh.bL, false);
        this.m.setCompoundDrawablesRelativeWithIntrinsicBounds(this.H.a(sqh.bJ, 0), 0, 0, 0);
        srg.a aVar = (srg.a) this.H.a(sqh.bN);
        if (aVar == srg.a.NO_ICON) {
            this.p.setVisibility(8);
        } else if (aVar == srg.a.SEARCH_ICON) {
            this.p.setVisibility(0);
        } else if (aVar == srg.a.ADD_TO_STORY_BITMOJI) {
            this.p.setVisibility(8);
            ViewGroup viewGroup = this.b;
            viewGroup.setPadding((int) viewGroup.getResources().getDimension(R.dimen.chrome_left_padding_with_icon), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
        }
        TextView textView;
        if (this.H.a(sqh.bZ, false)) {
            textView = this.l;
            textView.setTextAppearance(textView.getContext(), R.style.framed_chrome_text);
            this.q.setTextAppearance(this.l.getContext(), R.style.framed_chrome_text);
            this.m.setTextAppearance(this.l.getContext(), R.style.framed_chrome_text);
            this.n.setTextAppearance(this.l.getContext(), R.style.framed_chrome_text);
            this.o.setTextAppearance(this.l.getContext(), R.style.framed_chrome_text);
        } else {
            textView = this.l;
            textView.setTextAppearance(textView.getContext(), R.style.chrome_text);
            this.q.setTextAppearance(this.l.getContext(), R.style.chrome_subtext);
            this.m.setTextAppearance(this.l.getContext(), R.style.chrome_subtext);
            this.n.setTextAppearance(this.l.getContext(), R.style.chrome_text);
            this.o.setTextAppearance(this.l.getContext(), R.style.chrome_subtext);
        }
        b(this.H);
    }

    /* renamed from: A_ */
    public final tas.a j() {
        return new tas.a(-1, -2);
    }

    public final void C_() {
        a(false);
    }

    public final void a(float f) {
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            m();
        }
        sln.b(this.b, this.k, f);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        n();
        a(this.F == sjo.STARTED);
    }

    public final void a(szo szo) {
        a(false);
    }

    public final void a(szw szw) {
        if (((Boolean) this.H.a(sqh.bO)).booleanValue()) {
            this.j.set(true);
            this.b.postDelayed(this.z, 1500);
        } else {
            this.b.setAlpha(1.0f);
        }
        this.D = true;
        a(true);
    }

    public final void a_(szw szw) {
        boolean z = false;
        if (szw.c(skb.b) && !this.j.get()) {
            float a = szw.a(skb.b, 1.0f);
            this.b.setAlpha(a);
            if (a == MapboxConstants.MINIMUM_ZOOM) {
                this.b.setVisibility(8);
            } else {
                this.b.setVisibility(0);
            }
        }
        if (szw.c(skb.m)) {
            this.b.animate().translationY(((Float) szw.c(skb.m, Float.valueOf(MapboxConstants.MINIMUM_ZOOM))).floatValue()).setDuration(300);
        }
        this.x = szw.a(skb.a, false);
        if (this.F == sjo.STARTED) {
            z = true;
        }
        a(z);
    }

    public final void ae_() {
        ViewGroup viewGroup = this.b;
        viewGroup.setPadding((int) viewGroup.getResources().getDimension(R.dimen.chrome_left_padding), (int) this.b.getResources().getDimension(R.dimen.chrome_top_padding), 0, (int) this.b.getResources().getDimension(R.dimen.chrome_bottom_padding));
        n();
    }

    public final void b() {
        super.b();
        this.g.b();
        this.h.b();
        this.l.setAlpha(1.0f);
        this.n.setAlpha(1.0f);
        this.o.setAlpha(1.0f);
        this.b.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.b.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
        this.b.setVisibility(0);
        this.y = MapboxConstants.MINIMUM_ZOOM;
        a(false);
        this.x = false;
        this.B = 0;
        this.C = false;
        this.c.setVisibility(0);
        this.d.setVisibility(4);
        this.e.setVisibility(0);
        this.A = false;
    }

    public final void b(float f) {
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            m();
        }
        sln.b(this.b, -this.k, f);
    }

    public final void b(szw szw) {
        m();
        this.b.setAlpha(1.0f);
        a(false);
        this.D = false;
    }

    public final void c(float f) {
        if (this.y > -1.0E-6f) {
            this.y = (-this.r.getY()) + ((((float) this.b.getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f) * 8.0f);
        }
        float f2 = 1.0f - (4.0f * f);
        this.l.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, f2));
        this.n.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, f2));
        this.o.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, f2));
        if (this.w) {
            this.r.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, f2));
        }
        this.b.setTranslationY(f * this.y);
    }

    public final void c(szw szw) {
        a(true);
    }

    public final View e() {
        return this.b;
    }

    public final void e(szw szw) {
        a(true);
    }

    public final String f() {
        return "CHROME";
    }

    public final boolean h() {
        return true;
    }
}
