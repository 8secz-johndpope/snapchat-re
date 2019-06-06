package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.akcr;

@Keep
public final class AppInstallContent {
    @SerializedName("android")
    private final AppInstallPackageInfo appInstallPackageInfo;
    @SerializedName("icon")
    private final String iconUri;
    @SerializedName("title")
    private final String title;

    public AppInstallContent(String str, String str2, AppInstallPackageInfo appInstallPackageInfo) {
        akcr.b(str, "iconUri");
        akcr.b(str2, "title");
        akcr.b(appInstallPackageInfo, "appInstallPackageInfo");
        this.iconUri = str;
        this.title = str2;
        this.appInstallPackageInfo = appInstallPackageInfo;
    }

    public static /* synthetic */ AppInstallContent copy$default(AppInstallContent appInstallContent, String str, String str2, AppInstallPackageInfo appInstallPackageInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInstallContent.iconUri;
        }
        if ((i & 2) != 0) {
            str2 = appInstallContent.title;
        }
        if ((i & 4) != 0) {
            appInstallPackageInfo = appInstallContent.appInstallPackageInfo;
        }
        return appInstallContent.copy(str, str2, appInstallPackageInfo);
    }

    public final String component1() {
        return this.iconUri;
    }

    public final String component2() {
        return this.title;
    }

    public final AppInstallPackageInfo component3() {
        return this.appInstallPackageInfo;
    }

    public final AppInstallContent copy(String str, String str2, AppInstallPackageInfo appInstallPackageInfo) {
        akcr.b(str, "iconUri");
        akcr.b(str2, "title");
        akcr.b(appInstallPackageInfo, "appInstallPackageInfo");
        return new AppInstallContent(str, str2, appInstallPackageInfo);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.appInstallPackageInfo, r3.appInstallPackageInfo) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.AppInstallContent;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.AppInstallContent) r3;
        r0 = r2.iconUri;
        r1 = r3.iconUri;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.title;
        r1 = r3.title;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.appInstallPackageInfo;
        r3 = r3.appInstallPackageInfo;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.AppInstallContent.equals(java.lang.Object):boolean");
    }

    public final AppInstallPackageInfo getAppInstallPackageInfo() {
        return this.appInstallPackageInfo;
    }

    public final String getIconUri() {
        return this.iconUri;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.iconUri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AppInstallPackageInfo appInstallPackageInfo = this.appInstallPackageInfo;
        if (appInstallPackageInfo != null) {
            i = appInstallPackageInfo.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppInstallContent(iconUri=");
        stringBuilder.append(this.iconUri);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", appInstallPackageInfo=");
        stringBuilder.append(this.appInstallPackageInfo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
