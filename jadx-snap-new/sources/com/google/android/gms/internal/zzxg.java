package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.samsung.android.sdk.camera.SCamera;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@zzabh
public final class zzxg implements NativeMediationAdRequest {
    private final zzqh zzapm;
    private final List<String> zzapn = new ArrayList();
    private final int zzbhm;
    private final boolean zzbhy;
    private final int zzcjy;
    private final Map<String, Boolean> zzckh = new HashMap();
    private final Date zzhh;
    private final Set<String> zzhj;
    private final boolean zzhk;
    private final Location zzhl;

    public zzxg(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzqh zzqh, List<String> list, boolean z2) {
        this.zzhh = date;
        this.zzbhm = i;
        this.zzhj = set;
        this.zzhl = location;
        this.zzhk = z;
        this.zzcjy = i2;
        this.zzapm = zzqh;
        this.zzbhy = z2;
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        Map map;
                        Object obj;
                        Object obj2;
                        if ("true".equals(split[2])) {
                            map = this.zzckh;
                            obj = split[1];
                            obj2 = Boolean.TRUE;
                        } else {
                            if ("false".equals(split[2])) {
                                map = this.zzckh;
                                obj = split[1];
                                obj2 = Boolean.FALSE;
                            }
                        }
                        map.put(obj, obj2);
                    }
                } else {
                    this.zzapn.add(str);
                }
            }
        }
    }

    public final Date getBirthday() {
        return this.zzhh;
    }

    public final int getGender() {
        return this.zzbhm;
    }

    public final Set<String> getKeywords() {
        return this.zzhj;
    }

    public final Location getLocation() {
        return this.zzhl;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.zzapm == null) {
            return null;
        }
        Builder requestMultipleImages = new Builder().setReturnUrlsForImageAssets(this.zzapm.zzbzj).setImageOrientation(this.zzapm.zzbzk).setRequestMultipleImages(this.zzapm.zzbzl);
        if (this.zzapm.versionCode >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.zzapm.zzbzm);
        }
        if (this.zzapm.versionCode >= 3 && this.zzapm.zzbzn != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.zzapm.zzbzn));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAppInstallAdRequested() {
        List list = this.zzapn;
        return list != null && list.contains("2");
    }

    public final boolean isContentAdRequested() {
        List list = this.zzapn;
        return list != null && list.contains(SCamera.CAMERA_ID_FRONT);
    }

    public final boolean isDesignedForFamilies() {
        return this.zzbhy;
    }

    public final boolean isTesting() {
        return this.zzhk;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzcjy;
    }

    public final boolean zznb() {
        List list = this.zzapn;
        return list != null && list.contains("6");
    }

    public final boolean zznc() {
        List list = this.zzapn;
        return list != null && list.contains("3");
    }

    public final Map<String, Boolean> zznd() {
        return this.zzckh;
    }
}
