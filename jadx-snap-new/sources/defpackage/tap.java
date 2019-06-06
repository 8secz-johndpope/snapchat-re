package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.siw.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tap */
public final class tap extends FrameLayout {
    final Context a;
    public final View b;
    public final ImageView c;
    final Paint d;
    c e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    public int m;
    public String n;
    public spm o;
    public boolean p;
    public boolean q;
    boolean r;
    public int s;
    public siw t;
    private a u;

    /* renamed from: tap$a */
    static abstract class a {
        private final AtomicBoolean a;

        private a() {
            this.a = new AtomicBoolean();
        }

        /* synthetic */ a(byte b) {
            this();
        }

        private /* synthetic */ void c(Pair pair) {
            if (this.a.get()) {
                b(pair);
            } else {
                a(pair);
            }
        }

        public abstract Pair<Drawable, c> a();

        public abstract void a(Pair<Drawable, c> pair);

        public final void b() {
            this.a.set(true);
        }

        /* Access modifiers changed, original: protected */
        public void b(Pair<Drawable, c> pair) {
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            tal.d.execute(new -$$Lambda$tap$a$AzEBXhujhTnJiOOimg40pnHX_SE(this, tal.a));
        }
    }

    /* renamed from: tap$1 */
    class 1 extends a {
        1() {
            super();
        }

        /* Access modifiers changed, original: protected|final */
        public final Pair<Drawable, c> a() {
            Drawable drawable = tap.this.a.getResources().getDrawable(R.drawable.swipeup_caret_gradient);
            tap.this.i = drawable.getIntrinsicWidth();
            tap.this.j = drawable.getIntrinsicHeight();
            return new Pair(drawable, tap.this.t.a(tap.this.i, tap.this.j, Config.ARGB_8888));
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(Pair<Drawable, c> pair) {
            Preconditions.checkState(Looper.myLooper() == Looper.getMainLooper(), "Must be run on main thread");
            Drawable drawable = (Drawable) pair.first;
            tap tap = tap.this;
            Context context = tap.getContext();
            akcr.b(context, "context");
            tdb a = tdc.a(context);
            Pair pair2 = new Pair(Integer.valueOf(a.a + a.c), Integer.valueOf(a.b + a.c));
            tap.f = ((Integer) pair2.first).intValue();
            tap.g = ((Integer) pair2.second).intValue();
            c a2 = tdc.a(tap.getContext(), tap.t, tap.d, tap.o, tap.s, tap.m);
            if (tap.this.e != null) {
                tap.this.e.b();
            }
            tap tap2 = tap.this;
            c cVar = (c) pair.second;
            Bitmap c = a2.c();
            String str = tap.this.n;
            Rect rect = new Rect();
            if (str != null) {
                Paint paint = tap2.d;
                paint.reset();
                paint.setTextSize(tap2.a.getResources().getDimension(R.dimen.swipe_up_arrow_text_size));
                paint.setTextAlign(Align.CENTER);
                paint.setColor(tap2.s);
                paint.setAlpha(tap2.m);
                tap2.d.setTypeface(abrz.a(tap2.getContext(), abry.a.a));
                tap2.d.getTextBounds(str, 0, str.length(), rect);
                tap2.h = rect.width();
                if (tap2.h > tap2.i) {
                    cVar.b();
                    cVar = tap2.t.a(tap2.h, tap2.j, Config.ARGB_8888);
                    tap2.i = tap2.h;
                }
            }
            Canvas canvas = new Canvas(cVar.c());
            if (tap2.p) {
                drawable.setBounds(new Rect(0, 0, tap2.i, tap2.j));
                drawable.draw(canvas);
            }
            float f = (float) tap2.j;
            if (str != null) {
                f = (float) (tap2.j - tap2.a.getResources().getDimensionPixelSize(R.dimen.swipe_up_arrow_text_bottom_margin));
                canvas.drawText(str, ((float) tap2.i) / 2.0f, f, tap2.d);
                f -= (float) rect.height();
            }
            float f2 = ((float) (tap2.i - tap2.f)) / 2.0f;
            f = (f - ((float) tap2.a.getResources().getDimensionPixelSize(R.dimen.swipe_up_arrow_bottom_margin))) - ((float) tap2.g);
            tap2.l = tap2.j - ((int) f);
            canvas.drawBitmap(c, f2, f, null);
            tap2.e = cVar;
            a2.b();
            tap.this.c.setImageBitmap(tap.this.e.c());
            LayoutParams layoutParams = tap.this.b.getLayoutParams();
            layoutParams.height = (int) (((float) tap.this.a.getResources().getDisplayMetrics().heightPixels) * 0.08f);
            layoutParams.width = tap.this.h == 0 ? tap.this.a.getResources().getDimensionPixelSize(R.dimen.swipe_up_arrow_touch_area_width_no_text) : tap.this.h + tap.this.a.getResources().getDimensionPixelSize(R.dimen.swipe_up_arrow_touch_area_addition_width);
            tap tap3 = tap.this;
            tap3.k = tap3.j;
            if (tap.this.r) {
                tap.this.a();
            } else {
                tap.this.b();
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void b(Pair<Drawable, c> pair) {
            if (pair != null) {
                ((c) pair.second).b();
            }
        }
    }

    private tap(Context context, LayoutInflater layoutInflater, spm spm) {
        super(context, null);
        this.d = new Paint();
        this.a = context;
        setLayoutParams(new LayoutParams(-1, -2));
        layoutInflater.inflate(R.layout.swipe_up_arrow_view, this, true);
        this.b = findViewById(R.id.touch_activate_area);
        this.c = (ImageView) findViewById(R.id.swipe_up_arrow_view_set);
        this.n = null;
        this.o = spm;
        this.p = false;
        this.q = true;
        this.m = Math.min(Math.max(0, 0), 255);
        this.s = -1;
    }

    public tap(Context context, spm spm) {
        this(context, LayoutInflater.from(context), spm);
    }

    public final void a() {
        this.r = true;
        setVisibility(0);
        if (this.q && this.k != 0) {
            animate().translationY(MapboxConstants.MINIMUM_ZOOM).setDuration(200);
        }
    }

    public final void b() {
        this.r = false;
        setVisibility(4);
        if (this.q) {
            setTranslationY((float) this.k);
        }
    }

    public final void c() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.b();
            this.e = null;
        }
    }

    public final void d() {
        a aVar = this.u;
        if (aVar != null) {
            aVar.b();
            this.u = null;
        }
    }

    public final void e() {
        if (!this.q) {
            setTranslationY(MapboxConstants.MINIMUM_ZOOM);
        }
        if ((this.n != null || this.p) && this.t != null) {
            d();
            this.u = new 1();
            this.u.c();
            setContentDescription(this.n);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }
}
