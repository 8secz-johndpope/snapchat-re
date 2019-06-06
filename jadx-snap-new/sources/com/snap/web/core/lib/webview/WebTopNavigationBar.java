package com.snap.web.core.lib.webview;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.zxi.b.d.c;

public final class WebTopNavigationBar extends FrameLayout {
    public ViewGroup a;
    public TextView b;
    public ProgressBar c;
    public ShimmerFrameLayout d;
    public SnapImageView e;
    public c f;
    private SnapImageView g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ WebTopNavigationBar a;

        b(WebTopNavigationBar webTopNavigationBar) {
            this.a = webTopNavigationBar;
        }

        public final void onClick(View view) {
            c cVar = this.a.f;
            if (cVar == null) {
                akcr.a("topNavBarListener");
            }
            cVar.q();
        }
    }

    static {
        a aVar = new a();
    }

    public WebTopNavigationBar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private WebTopNavigationBar(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        FrameLayout.inflate(getContext(), R.layout.topnavbar, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.https_view);
        akcr.a(findViewById, "findViewById(R.id.https_view)");
        this.a = (ViewGroup) findViewById;
        findViewById = findViewById(R.id.nav_bar_url_text);
        akcr.a(findViewById, "findViewById(R.id.nav_bar_url_text)");
        this.b = (TextView) findViewById;
        findViewById = findViewById(R.id.nav_bar_shimmer);
        akcr.a(findViewById, "findViewById(R.id.nav_bar_shimmer)");
        this.d = (ShimmerFrameLayout) findViewById;
        findViewById = findViewById(R.id.nav_bar_favicon);
        akcr.a(findViewById, "findViewById(R.id.nav_bar_favicon)");
        this.e = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.nav_bar_x_close_button);
        akcr.a(findViewById, "findViewById(R.id.nav_bar_x_close_button)");
        this.g = (SnapImageView) findViewById;
        SnapImageView snapImageView = this.g;
        if (snapImageView == null) {
            akcr.a("xCloseButton");
        }
        snapImageView.setOnClickListener(new b(this));
        findViewById = findViewById(R.id.progress_bar);
        akcr.a(findViewById, "findViewById(R.id.progress_bar)");
        this.c = (ProgressBar) findViewById;
        ClipDrawable clipDrawable = new ClipDrawable(new GradientDrawable(Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.loading_gradient_color1), ContextCompat.getColor(getContext(), R.color.loading_gradient_color2), ContextCompat.getColor(getContext(), R.color.loading_gradient_color3)}), 3, 1);
        r0 = new Drawable[3];
        Drawable drawable = clipDrawable;
        r0[1] = drawable;
        r0[2] = drawable;
        LayerDrawable layerDrawable = new LayerDrawable(r0);
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        ProgressBar progressBar = this.c;
        if (progressBar == null) {
            akcr.a("loadingProgressBar");
        }
        progressBar.setProgressDrawable(layerDrawable);
    }
}
