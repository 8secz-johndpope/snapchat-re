package com.snap.unlockables.lib.network.api;

import defpackage.aenr;
import defpackage.aera;
import defpackage.affs;
import defpackage.aiad;
import defpackage.aikd;
import defpackage.ajcx;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.zrw;

public interface UnlockablesFsnHttpInterface {
    @akxy(a = "/unlockable/location_independent_unlockables?purpose=user_unlocked_filter")
    ajdx<akxa<affs>> fetchUnlockedFilterOrLens(@akxk aera aera);

    @akxy(a = "/unlockable/location_independent_unlockables?purpose=user_unlocked_sticker_pack")
    ajdx<akxa<affs>> fetchUnlockedStickerPack(@akxk aiad aiad);

    @akxy(a = "/unlockable/user_unlock_filter")
    ajcx unlockFilterOrLens(@akxk zrw zrw);

    @akxy(a = "/unlocakales/unlockable_sticker_v2")
    ajdx<akxa<aenr>> unlockSticker(@akxk aikd aikd);
}
