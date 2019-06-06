package com.looksery.sdk.listener;

import android.graphics.Bitmap;

public interface EmojiRasterizer {
    Bitmap rasterizeEmoji(String str);
}
