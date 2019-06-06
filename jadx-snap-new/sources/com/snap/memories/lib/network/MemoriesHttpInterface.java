package com.snap.memories.lib.network;

import com.snap.core.net.converter.JsonAuth;
import defpackage.agro;
import defpackage.agrq;
import defpackage.agse;
import defpackage.agsg;
import defpackage.agte;
import defpackage.agtg;
import defpackage.agtr;
import defpackage.agtt;
import defpackage.agvz;
import defpackage.agwb;
import defpackage.ahrc;
import defpackage.ahre;
import defpackage.ahsl;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxm;
import defpackage.akxo;
import defpackage.akxy;

public interface MemoriesHttpInterface {
    @JsonAuth
    @akxy(a = "/gallery/add_snaps")
    ajdx<akxa<agrq>> addSnapMetadata(@akxk agro agro);

    @JsonAuth
    @akxy(a = "/gallery/delete_entries")
    ajdx<akxa<agsg>> deleteEntries(@akxk agse agse);

    @JsonAuth
    @akxy(a = "/sksAssertion")
    ajdx<akxa<ahre>> getMyEyesOnlyAssertion(@akxk ahrc ahrc);

    @akxo
    @akxy(a = "https://sks.snapchat.com/retrieveKey")
    ajdx<akxa<ahsl>> getMyEyesOnlyMasterKey(@akxm(a = "json") String str);

    @JsonAuth
    @akxy(a = "/gallery/get_snaps")
    ajdx<akxa<agtt>> getSnaps(@akxk agtr agtr);

    @akxo
    @akxy(a = "https://sks.snapchat.com/registerKey")
    ajdx<akxa<Void>> registerMyEyesOnlyMasterKey(@akxm(a = "json") String str);

    @JsonAuth
    @akxy(a = "/gallery/v2/sync")
    ajdx<akxa<agtg>> sync(@akxk agte agte);

    @JsonAuth
    @akxy(a = "/gallery/v2/update_entries")
    ajdx<akxa<agwb>> updateEntryMetadata(@akxk agvz agvz);
}
