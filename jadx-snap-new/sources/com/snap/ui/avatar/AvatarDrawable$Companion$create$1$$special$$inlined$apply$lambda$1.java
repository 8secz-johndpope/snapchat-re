package com.snap.ui.avatar;

import com.brightcove.player.event.Event;
import defpackage.ajdy;
import defpackage.akcr;
import defpackage.zkb.a;
import defpackage.zkb.b;

public final class AvatarDrawable$Companion$create$1$$special$$inlined$apply$lambda$1 implements b {
    final /* synthetic */ ajdy $emitter$inlined;
    final /* synthetic */ AvatarDrawable $this_apply;
    final /* synthetic */ AvatarDrawable$Companion$create$1 this$0;

    AvatarDrawable$Companion$create$1$$special$$inlined$apply$lambda$1(AvatarDrawable avatarDrawable, AvatarDrawable$Companion$create$1 avatarDrawable$Companion$create$1, ajdy ajdy) {
        this.$this_apply = avatarDrawable;
        this.this$0 = avatarDrawable$Companion$create$1;
        this.$emitter$inlined = ajdy;
    }

    public final void onLoadingStateChanged(a aVar) {
        akcr.b(aVar, "state");
        if (aVar == a.LOADED || aVar == a.FAILED) {
            Object obj = this.$emitter$inlined;
            akcr.a(obj, Event.EMITTER);
            if (!obj.isDisposed()) {
                this.$emitter$inlined.a(this.$this_apply);
            }
        }
    }
}
