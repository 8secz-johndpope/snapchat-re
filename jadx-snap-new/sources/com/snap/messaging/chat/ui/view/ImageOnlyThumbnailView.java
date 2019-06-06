package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abur;
import defpackage.akcr;
import defpackage.qhn;

public final class ImageOnlyThumbnailView extends qhn {
    public final SnapImageView a;
    public final abur<ImageView> b;
    public final SnapFontTextView c;
    private final SnapFontTextView d;

    public ImageOnlyThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ImageOnlyThumbnailView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        RelativeLayout.inflate(context, R.layout.chat_media_image_only_thumbnail, this);
        Object findViewById = findViewById(R.id.image_view);
        akcr.a(findViewById, "findViewById(R.id.image_view)");
        this.a = (SnapImageView) findViewById;
        this.b = new abur((View) this, (int) R.id.chat_spectacles_mask_stub, (int) R.id.chat_spectacles_mask);
        findViewById = findViewById(R.id.timer);
        akcr.a(findViewById, "findViewById(R.id.timer)");
        this.c = (SnapFontTextView) findViewById;
        findViewById = findViewById(R.id.tap_to_load);
        akcr.a(findViewById, "findViewById(R.id.tap_to_load)");
        this.d = (SnapFontTextView) findViewById;
    }
}
