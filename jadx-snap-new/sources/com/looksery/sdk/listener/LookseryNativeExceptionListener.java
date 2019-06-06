package com.looksery.sdk.listener;

import com.looksery.sdk.exception.LookserySdkException;

public interface LookseryNativeExceptionListener {
    void onExceptionInNativeCode(LookserySdkException lookserySdkException);
}
