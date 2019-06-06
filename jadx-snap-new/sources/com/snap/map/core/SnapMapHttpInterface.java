package com.snap.map.core;

import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akxt;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.algm;
import defpackage.algn;
import defpackage.algq;
import defpackage.algr;
import defpackage.alhb;
import defpackage.alhc;
import defpackage.alhn;
import defpackage.alho;
import defpackage.alig;
import defpackage.alih;
import defpackage.alii;
import defpackage.alij;
import defpackage.alik;
import defpackage.alil;
import defpackage.alim;
import defpackage.alin;
import defpackage.alio;
import defpackage.alip;
import defpackage.aliq;
import defpackage.alir;
import defpackage.alis;
import defpackage.alit;
import defpackage.aliu;
import defpackage.aliv;
import defpackage.aliw;
import defpackage.alix;
import defpackage.aliy;
import defpackage.aliz;
import defpackage.aljm;
import defpackage.aljn;
import java.util.Map;

public interface SnapMapHttpInterface {
    public static final a Companion = a.a;

    public static final class DefaultImpls {
        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy(a = "/map/location_request/can_request")
        public static /* synthetic */ ajdx getCanRequestLocation$default(SnapMapHttpInterface snapMapHttpInterface, algq algq, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                return snapMapHttpInterface.getCanRequestLocation(algq, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCanRequestLocation");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx getExplorerStatuses$default(SnapMapHttpInterface snapMapHttpInterface, String str, String str2, alig alig, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str3 = "";
                }
                return snapMapHttpInterface.getExplorerStatuses(str, str2, alig, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExplorerStatuses");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy(a = "/map/friend_clusters")
        public static /* synthetic */ ajdx getFriendClusters$default(SnapMapHttpInterface snapMapHttpInterface, alhn alhn, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                return snapMapHttpInterface.getFriendClusters(alhn, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFriendClusters");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx getMyExplorerStatuses$default(SnapMapHttpInterface snapMapHttpInterface, String str, String str2, alio alio, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str3 = "";
                }
                return snapMapHttpInterface.getMyExplorerStatuses(str, str2, alio, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMyExplorerStatuses");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx rpcGetOnboardingViewState$default(SnapMapHttpInterface snapMapHttpInterface, String str, aliq aliq, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = "";
                }
                return snapMapHttpInterface.rpcGetOnboardingViewState(str, aliq, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpcGetOnboardingViewState");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx rpcGetPlaylist$default(SnapMapHttpInterface snapMapHttpInterface, String str, alis alis, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = "";
                }
                return snapMapHttpInterface.rpcGetPlaylist(str, alis, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpcGetPlaylist");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx rpcGetPoiPlaylist$default(SnapMapHttpInterface snapMapHttpInterface, String str, aliu aliu, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = "";
                }
                return snapMapHttpInterface.rpcGetPoiPlaylist(str, aliu, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpcGetPoiPlaylist");
        }

        @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx rpcGetSharedPoiPlaylist$default(SnapMapHttpInterface snapMapHttpInterface, String str, aliw aliw, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = "";
                }
                return snapMapHttpInterface.rpcGetSharedPoiPlaylist(str, aliw, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpcGetSharedPoiPlaylist");
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alhc> deleteExplorerStatus(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alhb alhb);

    @akxp
    ajdx<akxa<akhw>> downloadThumbnailDirect(@akyh String str);

    @akxp
    ajdx<akxa<akhw>> fetchGeneric(@akyh String str, @akxt Map<String, String> map);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<algn> getBatchExplorerViews(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk algm algm);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/location_request/can_request")
    ajdx<akxa<algr>> getCanRequestLocation(@akxk algq algq, @akxs(a = "X-Snapchat-Personal-Version") String str);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alih>> getExplorerStatuses(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alig alig, @akxs(a = "X-Snapchat-Personal-Version") String str3);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/friend_clusters")
    ajdx<alho> getFriendClusters(@akxk alhn alhn, @akxs(a = "X-Snapchat-Personal-Version") String str);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/map_style")
    ajdx<aljn> getMapConfiguration(@akxk aljm aljm);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alip>> getMyExplorerStatuses(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alio alio, @akxs(a = "X-Snapchat-Personal-Version") String str3);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alij> rpcGetLatestTileSet(@akyh String str, @akxk alii alii);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alin> rpcGetMapTiles(@akyh String str, @akxk alim alim);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alir> rpcGetOnboardingViewState(@akyh String str, @akxk aliq aliq, @akxs(a = "X-Snapchat-Personal-Version") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alit>> rpcGetPlaylist(@akyh String str, @akxk alis alis, @akxs(a = "X-Snapchat-Personal-Version") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<aliv>> rpcGetPoiPlaylist(@akyh String str, @akxk aliu aliu, @akxs(a = "X-Snapchat-Personal-Version") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<aliz> rpcGetSearchCards(@akyh String str, @akxk aliy aliy);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alix>> rpcGetSharedPoiPlaylist(@akyh String str, @akxk aliw aliw, @akxs(a = "X-Snapchat-Personal-Version") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alil> tileMetadata(@akyh String str, @akxk alik alik);
}
