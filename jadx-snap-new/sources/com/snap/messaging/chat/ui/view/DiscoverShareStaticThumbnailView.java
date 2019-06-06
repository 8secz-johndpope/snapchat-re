package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.qhn;

public final class DiscoverShareStaticThumbnailView extends qhn {
    public final SnapImageView a;
    private final SnapFontTextView b;

    public DiscoverShareStaticThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private DiscoverShareStaticThumbnailView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        RelativeLayout.inflate(context, R.layout.discover_share_static_thumbnail, this);
        Object findViewById = findViewById(R.id.image_view);
        akcr.a(findViewById, "findViewById(R.id.image_view)");
        this.a = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.tap_to_load);
        akcr.a(findViewById, "findViewById(R.id.tap_to_load)");
        this.b = (SnapFontTextView) findViewById;
    }
}
