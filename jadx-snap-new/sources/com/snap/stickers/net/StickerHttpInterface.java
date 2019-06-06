package com.snap.stickers.net;

import defpackage.aedh;
import defpackage.afao;
import defpackage.afaq;
import defpackage.ajdx;
import defpackage.ajyx;
import defpackage.akhw;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akye;
import defpackage.akyh;
import defpackage.alse;
import defpackage.alsf;
import defpackage.gjh;
import defpackage.gji;
import defpackage.xxg;
import defpackage.xxm.b;
import defpackage.xxt;
import java.util.List;
import java.util.Map;

public interface StickerHttpInterface {

    public static final class DefaultImpls {
        @akxu(a = {"__authorization: user"})
        @akxy(a = "/stickers/delete_custom_sticker")
        public static /* synthetic */ ajdx deleteCustomSticker$default(StickerHttpInterface stickerHttpInterface, Map map, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    aedh = new aedh();
                }
                return stickerHttpInterface.deleteCustomSticker(map, aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteCustomSticker");
        }

        @akxy(a = "/stickers/list_custom_sticker")
        public static /* synthetic */ ajdx getCustomStickers$default(StickerHttpInterface stickerHttpInterface, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    aedh = new aedh();
                }
                return stickerHttpInterface.getCustomStickers(aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCustomStickers");
        }

        @akxy(a = "/loq/sticker_packs_v3")
        public static /* synthetic */ ajdx getStickersPacks$default(StickerHttpInterface stickerHttpInterface, afao afao, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = ajyx.a;
                }
                return stickerHttpInterface.getStickersPacks(afao, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStickersPacks");
        }

        @akxy(a = "/stickers/giphy/trending")
        public static /* synthetic */ ajdx getTrendingGiphys$default(StickerHttpInterface stickerHttpInterface, Map map, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    aedh = new aedh();
                }
                return stickerHttpInterface.getTrendingGiphys(map, aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrendingGiphys");
        }

        @akxy(a = "stickers/giphy/search")
        public static /* synthetic */ ajdx searchGiphys$default(StickerHttpInterface stickerHttpInterface, Map map, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    aedh = new aedh();
                }
                return stickerHttpInterface.searchGiphys(map, aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchGiphys");
        }
    }

    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/stickers/create_custom_sticker")
    ajdx<akws<akhw>> createCustomSticker(@akxk gji gji);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/stickers/delete_custom_sticker")
    ajdx<akws<akhw>> deleteCustomSticker(@akye Map<String, String> map, @akxk aedh aedh);

    @akxp(a = "https://images.bitmoji.com/ml-models/learned-search/v1/en.gz")
    ajdx<akhw> downloadLearnedSearchWeights();

    @akxy(a = "/stickers/stickerpack")
    ajdx<akhw> downloadPackOnDemandData(@akxk b bVar);

    @akxp
    ajdx<akhw> downloadWithUrl(@akyh String str);

    @akxy(a = "/stickers/list_custom_sticker")
    ajdx<List<xxt>> getCustomStickers(@akxk aedh aedh);

    @akxy(a = "/loq/sticker_packs_v3")
    ajdx<afaq> getStickersPacks(@akxk afao afao, @akye Map<String, String> map);

    @akxy(a = "/stickers/giphy/trending")
    ajdx<xxg> getTrendingGiphys(@akye Map<String, String> map, @akxk aedh aedh);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alsf> getWeatherData(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alse alse);

    @akxy(a = "stickers/giphy/search")
    ajdx<xxg> searchGiphys(@akye Map<String, String> map, @akxk aedh aedh);
}
