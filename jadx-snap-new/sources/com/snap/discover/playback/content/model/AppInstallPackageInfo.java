package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.akcr;
import java.util.Map;

@Keep
public final class AppInstallPackageInfo {
    @SerializedName("package_id")
    private final String packageId;
    @SerializedName("store_params")
    private final Map<String, String> storeParams;

    public AppInstallPackageInfo(Map<String, String> map, String str) {
        akcr.b(map, "storeParams");
        akcr.b(str, "packageId");
        this.storeParams = map;
        this.packageId = str;
    }

    public static /* synthetic */ AppInstallPackageInfo copy$default(AppInstallPackageInfo appInstallPackageInfo, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = appInstallPackageInfo.storeParams;
        }
        if ((i & 2) != 0) {
            str = appInstallPackageInfo.packageId;
        }
        return appInstallPackageInfo.copy(map, str);
    }

    public final Map<String, String> component1() {
        return this.storeParams;
    }

    public final String component2() {
        return this.packageId;
    }

    public final AppInstallPackageInfo copy(Map<String, String> map, String str) {
        akcr.b(map, "storeParams");
        akcr.b(str, "packageId");
        return new AppInstallPackageInfo(map, str);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.packageId, r3.packageId) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.AppInstallPackageInfo;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.AppInstallPackageInfo) r3;
        r0 = r2.storeParams;
        r1 = r3.storeParams;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.packageId;
        r3 = r3.packageId;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.AppInstallPackageInfo.equals(java.lang.Object):boolean");
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final Map<String, String> getStoreParams() {
        return this.storeParams;
    }

    public final int hashCode() {
        Map map = this.storeParams;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.packageId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppInstallPackageInfo(storeParams=");
        stringBuilder.append(this.storeParams);
        stringBuilder.append(", packageId=");
        stringBuilder.append(this.packageId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
