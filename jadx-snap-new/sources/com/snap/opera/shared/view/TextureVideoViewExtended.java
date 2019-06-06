package com.snap.opera.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.szu.a;

public class TextureVideoViewExtended extends TextureVideoView {
    public TextureVideoViewExtended(Context context) {
        super(context);
    }

    public TextureVideoViewExtended(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextureVideoViewExtended(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected */
    public a a() {
        return f() ? (e() && h()) ? a.EXOPLAYER_AND_STREAM_DECRYPTION : a.EXOPLAYER : a.EXOPLAYER;
    }
}
