package com.snap.loginkit.lib.net;

import defpackage.afuh;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxm;
import defpackage.akxo;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akxy;
import defpackage.gjg;
import defpackage.kof;
import defpackage.koh;
import defpackage.nhl;
import defpackage.nhn;

public interface SnapKitHttpInterface {

    public static final class DefaultImpls {
        @akxo
        @akxy(a = "/v1/oauth2/clients")
        public static /* synthetic */ ajdx fetchConnectedApps$default(SnapKitHttpInterface snapKitHttpInterface, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return snapKitHttpInterface.fetchConnectedApps(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchConnectedApps");
        }

        @akxo
        @akxy(a = "/v1/creativekit/web/metadata")
        public static /* synthetic */ ajdx getCreativeKitWebMetadata$default(SnapKitHttpInterface snapKitHttpInterface, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                return snapKitHttpInterface.getCreativeKitWebMetadata(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCreativeKitWebMetadata");
        }
    }

    @akxy(a = "/v1/connections/connect")
    ajdx<akws<akhw>> appConnect(@akxk kof kof, @akxs(a = "__xsc_local__snap_token") String str);

    @akxo
    @akxy(a = "/v1/oauth2/clients")
    ajdx<afuh> fetchConnectedApps(@akxm(a = "dummy") String str, @akxs(a = "__xsc_local__snap_token") String str2);

    @akxo
    @akxy(a = "/v1/creativekit/web/metadata")
    ajdx<akws<Object>> getCreativeKitWebMetadata(@akxm(a = "attachmentUrl") String str, @akxs(a = "__xsc_local__snap_token") String str2);

    @akxp(a = "/v1/connections?include=app_name&include=app_icon&include=scopes_approved&include=app_story_state")
    ajdx<akws<koh>> getUserAppConnections(@akxs(a = "__xsc_local__snap_token") String str);

    @gjg
    @akxy(a = "/v1/oauth2/revoke_client")
    ajdx<akws<akhw>> revokeApp(@akxk nhl nhl, @akxs(a = "__xsc_local__snap_token") String str);

    @gjg
    @akxy(a = "/v1/oauth2/update_client_permissions")
    ajdx<akws<akhw>> updatePermissions(@akxk nhn nhn, @akxs(a = "__xsc_local__snap_token") String str);

    @akxo
    @akxy(a = "/v1/client/validate")
    ajdx<akws<akhw>> validateThirdPartyClient(@akxm(a = "clientId") String str, @akxm(a = "appIdentifier") String str2, @akxm(a = "appSignature") String str3, @akxm(a = "kitVersion") String str4, @akxm(a = "kitType") String str5, @akxs(a = "__xsc_local__snap_token") String str6);
}
