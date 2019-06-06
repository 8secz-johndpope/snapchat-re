package com.snap.cognac.network;

import defpackage.acco;
import defpackage.accp;
import defpackage.accs;
import defpackage.acct;
import defpackage.accu;
import defpackage.accv;
import defpackage.accw;
import defpackage.accx;
import defpackage.accz;
import defpackage.acda;
import defpackage.acdb;
import defpackage.acdd;
import defpackage.acdf;
import defpackage.acdg;
import defpackage.acdr;
import defpackage.acds;
import defpackage.acdt;
import defpackage.acdv;
import defpackage.acdw;
import defpackage.aceb;
import defpackage.acec;
import defpackage.aced;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;

public interface CognacHttpInterfaceV2 {
    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<Void> abandonInvites(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk acdt acdt);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<accp> batchGetChatDock(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk acco acco);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acec> createUserAppSession(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk aceb aceb);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acdb> getApp(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk acdd acdd);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acct> getAppInstanceAuthToken(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk accs accs);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acdg> getAppList(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk acdf acdf);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<accv> getChatDock(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk accu accu);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acdr> getExternalUserProfile(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk acds acds);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acdw> inviteFriends(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk acdv acdv);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<accx> launchAppInstance(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk accw accw);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<acda> terminateAppInstance(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk accz accz);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<Void> terminateUserAppSession(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxs(a = "X-Snap-User-Context") String str3, @akxk aced aced);
}
