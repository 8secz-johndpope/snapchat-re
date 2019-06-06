package com.snap.hova;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.snap.ui.view.ViewStubWrapper;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.ipp;

public final class HovaAvatarContainerView extends FrameLayout implements ipp {
    private final ViewStubWrapper<View> a;

    public HovaAvatarContainerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private HovaAvatarContainerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.hova_avatar_container, this);
        Object obj = (ViewStub) findViewById(R.id.hova_nav_avatar_notification_badge_stub);
        akcr.a(obj, "viewStub");
        this.a = new ViewStubWrapper(obj);
    }

    public final Float a() {
        View ifInflated = this.a.getIfInflated();
        return ifInflated != null ? Float.valueOf(ifInflated.getScaleX()) : null;
    }

    public final void a(float f) {
        View ifInflated = this.a.getIfInflated();
        if (ifInflated != null) {
            ifInflated.setScaleX(f);
            ifInflated.setScaleY(f);
        }
    }

    public final void a(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    public final View b() {
        return this.a.getIfInflated();
    }
}
