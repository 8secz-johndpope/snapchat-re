package com.snap.shazam.net.api;

import defpackage.ajcx;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.wya;
import defpackage.wye;
import defpackage.wyg;

public interface ShazamHistoryHttpInterface {
    @akxu(a = {"__authorization: user"})
    @akxy(a = "/scan/delete_song_history")
    ajcx deleteSongFromHistory(@akxk wyg wyg);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/scan/lookup_song_history")
    ajdx<wye> fetchSongHistory(@akxk wya wya);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/scan/post_song_history")
    ajcx updateSongHistory(@akxk wyg wyg);
}
