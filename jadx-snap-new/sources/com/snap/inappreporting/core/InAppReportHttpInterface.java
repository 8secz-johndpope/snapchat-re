package com.snap.inappreporting.core;

import defpackage.ahrg;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;

public interface InAppReportHttpInterface {
    @akxu(a = {"__authorization: user"})
    @akxy(a = "/reporting/inapp/v1/lens")
    ajdx<akxa<String>> submitLensReportRequest(@akxk ahrg ahrg);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/shared/report")
    ajdx<akxa<String>> submitPublicOurStoryReportRequest(@akxk ahrg ahrg);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/reporting/inapp/v1/public_user_story")
    ajdx<akxa<String>> submitPublicUserStoryReportRequest(@akxk ahrg ahrg);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/reporting/inapp/v1/snap_or_story")
    ajdx<akxa<String>> submitSnapOrStoryReportRequest(@akxk ahrg ahrg);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/reporting/inapp/v1/tile")
    ajdx<akxa<String>> submitStoryTileReportRequest(@akxk ahrg ahrg);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/reporting/inapp/v1/user")
    ajdx<akxa<String>> submitUserReportRequest(@akxk ahrg ahrg);
}
