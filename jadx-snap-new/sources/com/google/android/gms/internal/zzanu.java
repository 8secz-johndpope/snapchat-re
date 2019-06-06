package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbt;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.samsung.android.sdk.camera.SCamera;
import java.util.Map;

@zzabh
public final class zzanu implements zzt<zzann> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        Throwable e;
        zzann zzann = (zzann) obj;
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbqx)).booleanValue()) {
            zzaou zzth = zzann.zzth();
            String str = SCamera.CAMERA_ID_FRONT;
            if (zzth == null) {
                try {
                    zzaou zzaou = new zzaou(zzann, Float.parseFloat((String) map.get("duration")), str.equals(map.get("customControlsAllowed")), str.equals(map.get("clickToExpandAllowed")));
                    zzann.zza(zzaou);
                    zzth = zzaou;
                } catch (NullPointerException e2) {
                    e = e2;
                    zzaky.zzb("Unable to parse videoMeta message.", e);
                    zzbt.zzep().zza(e, "VideoMetaGmsgHandler.onGmsg");
                } catch (NumberFormatException e3) {
                    e = e3;
                    zzaky.zzb("Unable to parse videoMeta message.", e);
                    zzbt.zzep().zza(e, "VideoMetaGmsgHandler.onGmsg");
                }
            }
            boolean equals = str.equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str2 = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str2) ? MapboxConstants.MINIMUM_ZOOM : Float.parseFloat(str2);
            if (zzaky.zzae(3)) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 79);
                stringBuilder.append("Video Meta GMSG: isMuted : ");
                stringBuilder.append(equals);
                stringBuilder.append(" , playbackState : ");
                stringBuilder.append(parseInt);
                stringBuilder.append(" , aspectRatio : ");
                stringBuilder.append(str2);
                zzaky.zzby(stringBuilder.toString());
            }
            zzth.zza(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
