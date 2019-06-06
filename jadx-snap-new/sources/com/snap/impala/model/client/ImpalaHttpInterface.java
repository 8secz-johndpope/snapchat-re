package com.snap.impala.model.client;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.alco;
import defpackage.alcp;
import defpackage.alcq;
import defpackage.alcr;
import defpackage.alcs;
import defpackage.alct;
import defpackage.aldc;
import defpackage.aldd;
import defpackage.alde;
import defpackage.aldf;
import defpackage.alfe;
import defpackage.alff;
import defpackage.alfg;
import defpackage.alfh;

public interface ImpalaHttpInterface {
    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<alcp> getBusinessProfile(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alco alco);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<alfh> getStoryManifest(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alfg alfg);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<alff> getStoryManifestForSnapIds(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alfe alfe);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<alcr> hasPendingRoleInvites(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alcq alcq);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<alct> listManagedBusinessProfiles(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alcs alcs);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy(a = "/rpc/updateBusinessProfile")
    ajdx<Object> updateBusinessProfile(@akxs(a = "__xsc_local__snap_token") String str, @akxk aldc aldc);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<alde> updateBusinessSubscribeStatus(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk aldd aldd);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<Object> updateBusinessUserSettings(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk aldf aldf);
}
