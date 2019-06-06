package com.snap.ui.avatar;

import android.content.Context;
import com.brightcove.player.event.Event;
import defpackage.ajdy;
import defpackage.ajea;
import defpackage.akcr;
import defpackage.idl;
import java.util.List;

final class AvatarDrawable$Companion$create$1<T> implements ajea<T> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List $infos;
    final /* synthetic */ int $size;
    final /* synthetic */ idl $uiPage;

    AvatarDrawable$Companion$create$1(Context context, idl idl, int i, List list) {
        this.$context = context;
        this.$uiPage = idl;
        this.$size = i;
        this.$infos = list;
    }

    public final void subscribe(ajdy<AvatarDrawable> ajdy) {
        akcr.b(ajdy, Event.EMITTER);
        AvatarDrawable avatarDrawable = new AvatarDrawable(this.$context, this.$uiPage);
        int i = this.$size;
        avatarDrawable.setBounds(0, 0, i, i);
        avatarDrawable.setUserInfo(this.$infos, new AvatarDrawable$Companion$create$1$$special$$inlined$apply$lambda$1(avatarDrawable, this, ajdy));
    }
}
