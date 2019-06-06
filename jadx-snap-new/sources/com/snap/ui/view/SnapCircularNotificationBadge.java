package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.abmr;

public class SnapCircularNotificationBadge extends FrameLayout {
    private static final float LARGE_FONT_SIZE = 14.0f;
    private static final int MAX_DISPLAY_NUMBER = 99;
    private static final float SMALL_FONT_SIZE = 10.5f;
    private boolean mIsLargeFont;
    private TextView mNotificationCount;
    private int mNumUnseenNotifications;
    private boolean mShouldShowBadge;

    public SnapCircularNotificationBadge(Context context) {
        this(context, null);
    }

    public SnapCircularNotificationBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SnapCircularNotificationBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShouldShowBadge = false;
        this.mNumUnseenNotifications = 0;
        this.mIsLargeFont = true;
        inflate(context, R.layout.neon_header_circular_notification_count, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    private void setNotificationCount(int r4) {
        /*
        r3 = this;
        r0 = r3.mNotificationCount;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        if (r4 > 0) goto L_0x000d;
    L_0x0007:
        r4 = 8;
        r0.setVisibility(r4);
        return;
    L_0x000d:
        r1 = 0;
        r0.setVisibility(r1);
        r0 = 10;
        r2 = 2;
        if (r4 >= r0) goto L_0x0022;
    L_0x0016:
        r0 = r3.mIsLargeFont;
        if (r0 != 0) goto L_0x002f;
    L_0x001a:
        r0 = 1;
        r3.mIsLargeFont = r0;
        r0 = r3.mNotificationCount;
        r1 = 1096810496; // 0x41600000 float:14.0 double:5.41896386E-315;
        goto L_0x002c;
    L_0x0022:
        r0 = r3.mIsLargeFont;
        if (r0 == 0) goto L_0x002f;
    L_0x0026:
        r3.mIsLargeFont = r1;
        r0 = r3.mNotificationCount;
        r1 = 1093140480; // 0x41280000 float:10.5 double:5.40083157E-315;
    L_0x002c:
        r0.setTextSize(r2, r1);
    L_0x002f:
        r0 = 99;
        if (r4 >= r0) goto L_0x003d;
    L_0x0033:
        r0 = r3.mNotificationCount;
        r4 = java.lang.String.valueOf(r4);
        r0.setText(r4);
        return;
    L_0x003d:
        r4 = r3.mNotificationCount;
        r0 = "99";
        r4.setText(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.SnapCircularNotificationBadge.setNotificationCount(int):void");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mNotificationCount = (TextView) findViewById(R.id.circular_notification_count);
        this.mNotificationCount.setTextSize(2, LARGE_FONT_SIZE);
        if (getVisibility() == 0) {
            setNotificationCount(this.mNumUnseenNotifications);
        }
    }

    public void setNotificationCountState(boolean z, int i) {
        abmr.a();
        if (this.mNumUnseenNotifications != i || this.mShouldShowBadge != z) {
            this.mShouldShowBadge = z;
            this.mNumUnseenNotifications = i;
            if (this.mShouldShowBadge) {
                setVisibility(0);
                setNotificationCount(i);
                return;
            }
            setVisibility(8);
        }
    }
}
