package com.snap.hova;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.snap.ui.view.ViewStubWrapper;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.ipp;
import defpackage.ipr.a;

public final class HovaAddFriendsButtonContainerView extends FrameLayout implements ipp {
    private final ViewStubWrapper<View> a;

    public HovaAddFriendsButtonContainerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private HovaAddFriendsButtonContainerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.hova_add_friend_button_container, this);
        Object findViewById = findViewById(R.id.hova_nav_add_friend_button_notification_badge_stub);
        akcr.a(findViewById, "findViewById(R.id.hova_n…_notification_badge_stub)");
        this.a = new ViewStubWrapper((ViewStub) findViewById);
        ImageView imageView = (ImageView) findViewById(R.id.hova_header_add_friend_icon);
        Object obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.a, 0, 0);
        akcr.a(obtainStyledAttributes, "context.theme.obtainStyl…uttonContainerView, 0, 0)");
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            imageView.setBackgroundResource(resourceId);
        }
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
