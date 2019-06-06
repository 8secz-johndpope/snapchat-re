package com.snap.identity;

import defpackage.aecw;
import defpackage.aecy;
import defpackage.aedh;
import defpackage.aekb;
import defpackage.aemt;
import defpackage.aemv;
import defpackage.aemz;
import defpackage.aert;
import defpackage.aexl;
import defpackage.aext;
import defpackage.aezg;
import defpackage.afei;
import defpackage.afek;
import defpackage.agkz;
import defpackage.aglb;
import defpackage.agxm;
import defpackage.agxu;
import defpackage.agxw;
import defpackage.agyi;
import defpackage.agyk;
import defpackage.agys;
import defpackage.agyu;
import defpackage.agzc;
import defpackage.agze;
import defpackage.agzm;
import defpackage.agzo;
import defpackage.agzq;
import defpackage.agzs;
import defpackage.ahao;
import defpackage.ahaq;
import defpackage.ahas;
import defpackage.ahcb;
import defpackage.ahcd;
import defpackage.ahcr;
import defpackage.ahdj;
import defpackage.ahdn;
import defpackage.ahdp;
import defpackage.ahdr;
import defpackage.ahdv;
import defpackage.ahdx;
import defpackage.ahdz;
import defpackage.aheb;
import defpackage.ahed;
import defpackage.ahef;
import defpackage.ahfa;
import defpackage.ahft;
import defpackage.ahfv;
import defpackage.ahfx;
import defpackage.ahrm;
import defpackage.ahro;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.aleu;
import defpackage.alev;
import defpackage.alew;
import defpackage.gjh;
import defpackage.gji;

public interface IdentityHttpInterface {
    public static final String BQ_USER_SCORES = "/bq/user_scores";
    public static final String PATH_REGISTER = "/loq/register_v2";
    public static final String PROTO_ACCEPT_HEADER = "Accept: application/x-protobuf";
    public static final String PROTO_CONTENT_TYPE_HEADER = "Content-Type: application/x-protobuf";

    @akxy(a = "/loq/fetch_birthdate_token")
    ajdx<akhw> fetchBirthdateToken(@akxk aedh aedh);

    @akxy(a = "/loq/snapchatter_public_info")
    ajdx<akxa<ahdp>> fetchPublicInfo(@akxk ahdn ahdn);

    @akxy(a = "/loq/find_users")
    ajdx<akxa<agzo>> findUsersForSearch(@akxk agzm agzm);

    @akxy(a = "/loq/all_updates")
    ajdx<aecy> getAllUpdates(@akxk aecw aecw);

    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/bq/user_scores")
    ajdx<aleu> getFriendScores(@akxk gji gji);

    @akxy(a = "/ami/friends")
    ajdx<aemz> getFriends(@akxk aemv aemv);

    @akxy(a = "/bq/snaptag_download")
    ajdx<ahdr> getSnapcodeResponse(@akxk aezg aezg);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy(a = "/loq/permission_settings")
    ajdx<akxa<alew>> postPermissionSettingsReport(@akxk alev alev);

    @akxy(a = "/bq/get_captcha")
    ajdx<akxa<akhw>> requestCaptchaInSignup(@akxk aedh aedh);

    @akxy(a = "/loq/get_captcha_pre_login")
    ajdx<akxa<akhw>> requestCaptchaPreLogin(@akxk aedh aedh);

    @akxy(a = "/loq/two_fa_recovery_code")
    ajdx<akxa<ahao>> requestTfaRecoveryCode(@akxk aedh aedh);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/phone_verify_pre_login")
    ajdx<akxa<ahcd>> requestVerificationCodePreLogin(@akxk ahfx ahfx);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/bq/solve_captcha")
    ajdx<akxa<ahdx>> solveCaptchaInSignup(@akxk ahdv ahdv);

    @akxy(a = "/loq/solve_captcha_pre_login")
    ajdx<akxa<ahdx>> solveCaptchaPreLogin(@akxk ahdv ahdv);

    @akxy(a = "/loq/and/change_email")
    ajdx<akxa<ahdj>> submitChangeEmailRequest(@akxk agxm agxm);

    @akxy(a = "loq/config")
    ajdx<akxa<aglb>> submitConfigRequest(@akxk agkz agkz, @akxs(a = "If-None-Match") String str);

    @akxy(a = "/loq/contact")
    ajdx<agxw> submitContactRequest(@akxk agxu agxu);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/loq/device_install_metadata")
    ajdx<akxa<agyu>> submitDeviceInstallMetadata(@akxk agys agys);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/device_install_metadata_pre_login")
    ajdx<akxa<agyu>> submitDeviceInstallMetadataPreLogin(@akxk agys agys);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/ph/find_friends")
    ajdx<agze> submitFindFriendRequest(@akxk agzc agzc);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/bq/friend")
    ajdx<agzs> submitFriendAction(@akxk agzq agzq);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/bq/user_friendmoji")
    ajdx<akxa<aekb>> submitFriendmojiRequest(@akxk aemt aemt);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/invite")
    ajdx<ahas> submitInviteContactAction(@akxk ahaq ahaq);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/account/odlv/request_otp")
    ajdx<ahro> submitOdlvOtpRequest(@akxk ahrm ahrm);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/bq/phone_verify")
    ajdx<akxa<ahcd>> submitPhoneRequest(@akxk ahcb ahcb);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/bq/phone_verify")
    ajdx<akxa<ahfv>> submitPhoneVerifyRequest(@akxk ahft ahft);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/register_v2")
    ajdx<akxa<aert>> submitRegisterV2Request(@akxk aext aext);

    @akxy(a = "/loq/contact_logging")
    ajdx<akxa<Void>> submitRegistrationSeenContactsRequest(@akxk ahcr ahcr);

    @akxy(a = "/ph/settings")
    ajdx<akxa<Void>> submitSettingRequestWithVoidResp(@akxk aexl aexl);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/suggest_username_v3")
    ajdx<akxa<aheb>> submitSuggestUsernameRequest(@akxk ahdz ahdz);

    @akxy(a = "/bq/suggest_friend")
    ajdx<ahef> submitSuggestedFriendsAction(@akxk ahed ahed);

    @akxy(a = "/bq/update_snaps")
    ajdx<afek> updateLastSeenAddedMe(@akxk afei afei);

    @akxy(a = "/loq/verify_deeplink_request")
    ajdx<akxa<agyk>> verifyDeepLinkRequest(@akxk agyi agyi);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/loq/two_fa_phone_verify")
    ajdx<ahao> verifyPhone(@akxk ahfa ahfa);
}
