package com.snap.fidelius.deps;

import com.snap.core.net.converter.JsonAuth;
import defpackage.ahpt;
import defpackage.ahpv;
import defpackage.ahpz;
import defpackage.ahqb;
import defpackage.ahqn;
import defpackage.ahqp;
import defpackage.ahqr;
import defpackage.ahqy;
import defpackage.ahra;
import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxy;

public interface FideliusHttpInterface {
    @JsonAuth
    @akxy(a = "/fid/ack_retry")
    ajdx<akws<Void>> ackRetry(@akxk ahpt ahpt);

    @JsonAuth
    @akxy(a = "/fid/clear_retry")
    ajdx<akws<Void>> clearRetry(@akxk ahpv ahpv);

    @akxy(a = "/fid/client_init")
    ajdx<ahqb> clientFideliusInit(@akxk ahpz ahpz);

    @JsonAuth
    @akxy(a = "/fid/friend_keys")
    ajdx<ahqp> fetchFriendsKeys(@akxk ahqn ahqn);

    @JsonAuth
    @akxy(a = "/fid/init_retry")
    ajdx<akws<Void>> initRetry(@akxk ahqr ahqr);

    @JsonAuth
    @akxy(a = "/fid/updates")
    ajdx<ahra> updates(@akxk ahqy ahqy);
}
