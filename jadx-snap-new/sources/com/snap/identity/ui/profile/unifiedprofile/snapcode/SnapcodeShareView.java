package com.snap.identity.ui.profile.unifiedprofile.snapcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.jwa;
import defpackage.jwj;
import java.util.concurrent.Callable;

public final class SnapcodeShareView extends LinearLayout {
    public View a;
    public TextView b;

    public static final class a<V> implements Callable<T> {
        private /* synthetic */ SnapcodeShareView a;
        private /* synthetic */ jwa b;
        private /* synthetic */ Drawable c;
        private /* synthetic */ View d;

        public a(SnapcodeShareView snapcodeShareView, jwa jwa, Drawable drawable, View view) {
            this.a = snapcodeShareView;
            this.b = jwa;
            this.c = drawable;
            this.d = view;
        }

        public final /* synthetic */ Object call() {
            Object a = this.b.a(this.a.getWidth(), this.a.getHeight(), "SnapcodeShareView");
            akcr.a(a, "bitmapFactory.createBitmap(width, height, TAG)");
            Object a2 = a.a();
            akcr.a(a2, "bitmap.get()");
            Canvas canvas = new Canvas(((jwj) a2).a());
            Drawable drawable = this.c;
            if (drawable == null) {
                canvas.drawColor(-1);
            } else {
                drawable.draw(canvas);
            }
            this.a.draw(canvas);
            View view = this.d;
            int i = 0;
            int width = view == null ? 0 : view.getWidth();
            View view2 = this.d;
            if (view2 != null) {
                i = view2.getHeight();
            }
            canvas.translate(((float) (canvas.getWidth() - width)) / 2.0f, ((float) (canvas.getHeight() - i)) / 2.0f);
            view = this.d;
            if (view != null) {
                view.draw(canvas);
            }
            return a;
        }
    }

    public SnapcodeShareView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private SnapcodeShareView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.snapcode_background);
        this.b = (TextView) findViewById(R.id.snapcode_username);
    }
}
