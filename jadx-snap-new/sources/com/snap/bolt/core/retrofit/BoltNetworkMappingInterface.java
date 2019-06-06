package com.snap.bolt.core.retrofit;

import defpackage.acgd;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxp;
import defpackage.akxs;

public interface BoltNetworkMappingInterface {
    @akxp(a = "https://bolt-gcdn-staging.sc-cdn.net/sc-bolt-nm-staging/network_mapping.bin")
    ajdx<akxa<acgd>> getNetworkMappingDev(@akxs(a = "If-Modified-Since") String str);

    @akxp(a = "/sc-bolt-nm-prod/network_mapping.bin")
    ajdx<akxa<acgd>> getNetworkMappingProd(@akxs(a = "If-Modified-Since") String str);
}
