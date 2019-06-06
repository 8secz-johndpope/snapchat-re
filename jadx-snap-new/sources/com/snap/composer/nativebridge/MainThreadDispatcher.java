package com.snap.composer.nativebridge;

import android.support.annotation.Keep;
import com.snap.composer.exceptions.ComposerException;
import com.snap.composer.logger.LogLevel;
import com.snap.composer.logger.Logger;
import com.snap.composer.utils.MainThreadUtils;
import com.snapchat.client.composer.NativeBridge;
import defpackage.ajxw;
import defpackage.akbk;

public class MainThreadDispatcher {
    Logger a;

    public MainThreadDispatcher(Logger logger) {
        this.a = logger;
    }

    /* Access modifiers changed, original: 0000 */
    @Keep
    public void runOnMainThread(final long j) {
        MainThreadUtils.dispatchOnMainThread(new akbk<ajxw>() {
            private ajxw a() {
                try {
                    NativeBridge.performCallback(j);
                } catch (ComposerException e) {
                    MainThreadDispatcher.this.a.log(LogLevel.Companion.getERROR(), e.getMessage());
                }
                return ajxw.a;
            }

            public final /* synthetic */ Object invoke() {
                return a();
            }
        });
    }
}
