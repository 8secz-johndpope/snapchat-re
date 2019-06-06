package com.looksery.sdk.listener;

import com.looksery.sdk.BitmojiType;

public interface LensBitmojiListener {
    void requestBitmoji(BitmojiType bitmojiType, String str, int i);

    void requestBitmoji(BitmojiType bitmojiType, String str, String str2, int i);

    void requestBitmoji(BitmojiType bitmojiType, String str, String str2, String str3, int i);

    void requestBitmojiInfo();

    void requestStickerMegapack(String str);
}
