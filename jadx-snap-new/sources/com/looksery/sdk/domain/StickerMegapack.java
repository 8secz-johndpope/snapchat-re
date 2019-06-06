package com.looksery.sdk.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class StickerMegapack {
    private final Map<String, List<String>> mStickerMap;

    private StickerMegapack(Map<String, List<String>> map) {
        this.mStickerMap = map;
    }

    public static StickerMegapack withStickerPack(String str, List<String> list) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, list);
        return new StickerMegapack(hashMap);
    }

    public final StickerMegapack addStickerPack(String str, List<String> list) {
        HashMap hashMap = new HashMap(this.mStickerMap);
        hashMap.put(str, list);
        return new StickerMegapack(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StickerMegapack stickerMegapack = (StickerMegapack) obj;
            Map map = this.mStickerMap;
            if (map != null) {
                return map.equals(stickerMegapack.mStickerMap);
            }
            if (stickerMegapack.mStickerMap == null) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final String[] getPackIds() {
        Set keySet = this.mStickerMap.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    /* Access modifiers changed, original: final */
    public final String[] getStickersForId(String str) {
        List list = (List) this.mStickerMap.get(str);
        return (String[]) list.toArray(new String[list.size()]);
    }

    public final int hashCode() {
        Map map = this.mStickerMap;
        return map != null ? map.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StickerMegapack{mStickerMap=");
        stringBuilder.append(this.mStickerMap);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
