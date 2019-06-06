package com.snap.hova.api;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.snapchat.android.R;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.iho;

public final class HovaNavView extends FrameLayout {
    public final ajei a = new ajei();

    public static final class a<T> implements ajfl<Rect> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Rect rect = (Rect) obj;
            akcr.b(rect, "it");
            return rect.top != 0;
        }
    }

    public static final class b<T> implements ajfb<Rect> {
        private /* synthetic */ HovaNavView a;

        public b(HovaNavView hovaNavView) {
            this.a = hovaNavView;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            HovaNavView hovaNavView = this.a;
            LayoutParams layoutParams = hovaNavView.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                iho.f(this.a, rect.top);
                hovaNavView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ HovaNavView a;
        private /* synthetic */ boolean b;

        public c(HovaNavView hovaNavView, boolean z) {
            this.a = hovaNavView;
            this.b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            LayoutParams layoutParams;
            Rect rect = (Rect) obj;
            View findViewById = this.a.findViewById(R.id.scene_holder);
            if (findViewById != null) {
                layoutParams = findViewById.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = rect.bottom;
                    findViewById.setLayoutParams(marginLayoutParams);
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            if (this.b) {
                findViewById = this.a.findViewById(R.id.hova_nav_inset_view);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    layoutParams = findViewById.getLayoutParams();
                    layoutParams.height = rect.bottom;
                    findViewById.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public HovaNavView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        View.inflate(context, R.layout.hova_nav_view, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a();
    }
}
