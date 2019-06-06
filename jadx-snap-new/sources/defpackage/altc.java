package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.alte.a;

/* renamed from: altc */
public abstract class altc extends FrameLayout {
    private static final int[] d = a.a;
    protected final View a;
    protected final View b;
    RecyclerView c;
    private OnScrollListener e;

    /* renamed from: altc$1 */
    class 1 extends OnScrollListener {
        1() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            alti c = altc.this.c();
            altc.this.a(c != null ? c.a(recyclerView) : MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public altc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public altc(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, d, 0, 0);
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(obtainStyledAttributes.getResourceId(2, R.layout.vertical_recycler_fast_scroller_layout), this, true);
            this.a = findViewById(R.id.scroll_bar);
            this.b = findViewById(R.id.scroll_handle);
            altc.a(this.a, obtainStyledAttributes.getDrawable(0), obtainStyledAttributes.getColor(1, -7829368));
            altc.a(this.b, obtainStyledAttributes.getDrawable(3), obtainStyledAttributes.getColor(4, -7829368));
            setOnTouchListener(new altd(this));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @TargetApi(16)
    private static void a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private static void a(View view, Drawable drawable, int i) {
        if (drawable != null) {
            altc.a(view, drawable);
        } else {
            view.setBackgroundColor(i);
        }
    }

    public final float a(MotionEvent motionEvent) {
        return c() != null ? c().a(motionEvent) : MapboxConstants.MINIMUM_ZOOM;
    }

    public final OnScrollListener a() {
        if (this.e == null) {
            this.e = new 1();
        }
        return this.e;
    }

    public abstract void a(float f);

    public final void a(RecyclerView recyclerView) {
        this.c = recyclerView;
    }

    public abstract void b();

    public abstract alti c();

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (c() == null) {
            b();
        }
        a(c().a(this.c));
    }
}
