package com.looksery.sdk.diagnostics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class ImageDiagnostics {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private ImageDiagnostics() {
    }

    public static void viewImageDataAsBitmap(int[] iArr, int i, int i2, boolean z) {
        Bitmap.createBitmap(iArr, i, i2, z ? Config.ARGB_8888 : Config.ALPHA_8);
    }
}
