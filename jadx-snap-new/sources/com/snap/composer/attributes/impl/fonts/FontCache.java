package com.snap.composer.attributes.impl.fonts;

import android.graphics.Typeface;

public interface FontCache {
    Typeface getTypeface(String str, String str2, FontWeight fontWeight, FontStyle fontStyle);
}
