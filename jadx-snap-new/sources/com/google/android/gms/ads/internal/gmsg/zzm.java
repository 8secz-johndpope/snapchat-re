package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzaof;
import com.samsung.android.sdk.camera.SCamera;
import java.util.Map;

final class zzm implements zzt<zzaof> {
    zzm() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        ((zzaof) obj).zzai(SCamera.CAMERA_ID_FRONT.equals(map.get("custom_close")));
    }
}
