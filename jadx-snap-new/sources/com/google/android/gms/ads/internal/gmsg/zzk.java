package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import java.util.HashMap;
import java.util.Map;

final class zzk implements zzt<zzaof> {
    zzk() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        WindowManager windowManager = (WindowManager) zzaof.getContext().getSystemService("window");
        zzbt.zzel();
        View view = (View) zzaof;
        DisplayMetrics zza = zzaij.zza(windowManager);
        int i = zza.widthPixels;
        int i2 = zza.heightPixels;
        int[] iArr = new int[2];
        Map hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzaof.zza("locationReady", hashMap);
        zzaky.zzcz("GET LOCATION COMPILED");
    }
}
