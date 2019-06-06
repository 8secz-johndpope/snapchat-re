package com.looksery.sdk.listener;

import com.looksery.sdk.domain.LensInfo;

public interface LensLifeCycleListener {
    void onLensResourcesLoaded(LensInfo lensInfo);

    void onLensTurnOff(LensInfo lensInfo);

    void onLensTurnOn(LensInfo lensInfo);
}
