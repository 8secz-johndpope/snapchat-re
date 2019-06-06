package com.google.android.gms.internal;

import android.os.IInterface;

public interface zzli extends IInterface {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdLoaded();

    void onAdOpened();
}
