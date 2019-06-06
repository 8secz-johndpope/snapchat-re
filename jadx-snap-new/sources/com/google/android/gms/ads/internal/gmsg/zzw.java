package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaky;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.samsung.android.sdk.camera.SCamera;
import java.util.Map;

@zzabh
public final class zzw implements zzt<Object> {
    private final zzx zzcck;

    public zzw(zzx zzx) {
        this.zzcck = zzx;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = "blurRadius";
        Object obj2 = map.get("transparentBackground");
        String str2 = SCamera.CAMERA_ID_FRONT;
        boolean equals = str2.equals(obj2);
        boolean equals2 = str2.equals(map.get("blur"));
        float f = MapboxConstants.MINIMUM_ZOOM;
        try {
            if (map.get(str) != null) {
                f = Float.parseFloat((String) map.get(str));
            }
        } catch (NumberFormatException e) {
            zzaky.zzb("Fail to parse float", e);
        }
        this.zzcck.zze(equals);
        this.zzcck.zza(equals2, f);
    }
}
