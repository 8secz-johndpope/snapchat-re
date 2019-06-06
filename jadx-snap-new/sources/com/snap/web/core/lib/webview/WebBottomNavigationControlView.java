package com.snap.web.core.lib.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.akcr;

public final class WebBottomNavigationControlView extends FrameLayout {
    public final SnapImageView a;
    public final SnapImageView b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements OnClickListener {
        private /* synthetic */ defpackage.zxi.b.d.a a;

        public b(defpackage.zxi.b.d.a aVar) {
            this.a = aVar;
        }

        public final void onClick(View view) {
            this.a.m();
        }
    }

    public static final class c implements OnClickListener {
        private /* synthetic */ defpackage.zxi.b.d.a a;

        public c(defpackage.zxi.b.d.a aVar) {
            this.a = aVar;
        }

        public final void onClick(View view) {
            this.a.l();
        }
    }

    static {
        a aVar = new a();
    }

    public WebBottomNavigationControlView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private WebBottomNavigationControlView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        FrameLayout.inflate(getContext(), R.layout.bottom_nav_control_view, this);
        Object findViewById = findViewById(R.id.webpage_back_button);
        akcr.a(findViewById, "findViewById(R.id.webpage_back_button)");
        this.a = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.webpage_forward_button);
        akcr.a(findViewById, "findViewById(R.id.webpage_forward_button)");
        this.b = (SnapImageView) findViewById;
    }
}
