package com.snap.payments.lib.fragments;

import android.os.Bundle;
import com.snap.ui.deck.MainPageFragment;
import defpackage.tgq;
import defpackage.zjq;
import java.util.concurrent.TimeUnit;

public abstract class PaymentsBaseFragment extends MainPageFragment implements zjq {
    public tgq d;

    public final long S_() {
        return TimeUnit.MINUTES.toMillis(5);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            return arguments != null && arguments.getBoolean("payments_checkout_navigation_idfr", false);
        }
    }
}
