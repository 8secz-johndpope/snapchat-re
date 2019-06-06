package com.snap.composer.api;

import com.snap.composer.ComposerFeature;
import com.snap.composer.DebugMessagePresenter;
import com.snap.composer.DebugMessagePresenter.Level;
import com.snapchat.android.R;
import defpackage.ajxk;
import defpackage.akcr;
import defpackage.sdt;
import defpackage.sdu;
import defpackage.seg;
import defpackage.zfw;
import defpackage.zgb;

public final class InAppNotifDebugMessagePresenter implements DebugMessagePresenter {
    private final zfw a = zgb.a(ComposerFeature.INSTANCE, "Composer");
    private final sdu b;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Level.INFO.ordinal()] = 1;
            $EnumSwitchMapping$0[Level.ERROR.ordinal()] = 2;
        }
    }

    public InAppNotifDebugMessagePresenter(zgb zgb, sdu sdu) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(sdu, "notificationEmitter");
        this.b = sdu;
    }

    public final void presentDebugMessage(Level level, String str) {
        akcr.b(level, "level");
        akcr.b(str, "str");
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1) {
            i = R.color.regular_purple;
        } else if (i == 2) {
            i = R.color.regular_red;
        } else {
            throw new ajxk();
        }
        this.b.b(sdt.a(new seg(str, Integer.valueOf(i), 12)).h("STATUS_BAR").a());
    }
}
