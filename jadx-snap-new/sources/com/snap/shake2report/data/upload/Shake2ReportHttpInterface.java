package com.snap.shake2report.data.upload;

import com.snap.core.net.converter.JsonAuth;
import defpackage.ailc;
import defpackage.ailf;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;

public interface Shake2ReportHttpInterface {
    @JsonAuth
    @akxy(a = "/s2r/create_nologin")
    ajdx<akxa<ailf>> uploadAnonymousTicket(@akxk ailc ailc);

    @JsonAuth
    @akxy(a = "/c2r/create")
    ajdx<akxa<ailf>> uploadCrashTicket(@akxk ailc ailc);

    @JsonAuth
    @akxy(a = "/s2r/create")
    ajdx<akxa<ailf>> uploadShakeTicket(@akxk ailc ailc);
}
