package com.snap.lenses.camera.upcoming;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.mgv;
import defpackage.mgv.a;
import defpackage.mgv.a.b;

public final class DefaultUpcomingMessageView extends FrameLayout implements mgv {
    private TextView a;

    public DefaultUpcomingMessageView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultUpcomingMessageView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final /* synthetic */ void accept(Object obj) {
        int i;
        a aVar = (a) obj;
        akcr.b(aVar, "viewModel");
        if (aVar instanceof b) {
            String str = ((b) aVar).a;
            TextView textView = this.a;
            if (textView == null) {
                akcr.a("releaseDateView");
            }
            textView.setText("Release date: ".concat(String.valueOf(str)));
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        Object findViewById = findViewById(R.id.lens_release_date_text_view);
        akcr.a(findViewById, "findViewById(R.id.lens_release_date_text_view)");
        this.a = (TextView) findViewById;
    }
}
