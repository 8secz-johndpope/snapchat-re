package com.snap.search.net;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.alod;
import defpackage.gjh;
import defpackage.gji;
import defpackage.vei;

public interface SearchHttpInterface {
    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/ranking/search_history")
    ajdx<akxa<vei>> deleteSearchHistory(@akxk gji gji);

    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/ranking/context")
    ajdx<akxa<alod>> fetchSearchResults(@akxk gji gji);
}
