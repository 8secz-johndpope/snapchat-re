package com.snap.ddml.lib;

import defpackage.adsr;
import defpackage.adss;
import defpackage.adst;
import defpackage.adsy;
import defpackage.adtb;
import defpackage.adtc;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxy;
import defpackage.akyh;

public interface DdmlHttpInterface {
    @akxy
    ajdx<adsy> fetchModel(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk adsr adsr);

    @akxy
    ajdx<adst> fetchModels(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk adss adss);

    @akxy
    ajdx<adtc> updateModels(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk adtb adtb);
}
