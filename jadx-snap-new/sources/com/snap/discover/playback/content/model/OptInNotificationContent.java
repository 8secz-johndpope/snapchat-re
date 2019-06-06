package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public final class OptInNotificationContent {
    @SerializedName("overlay")
    private final String overlay;
    @SerializedName("overlay_item_replace")
    private final String overlay_item_replace;
    @SerializedName("remote_web_url_override")
    private final String remoteWebUrlOverride;

    public OptInNotificationContent(String str, String str2, String str3) {
        this.overlay = str;
        this.overlay_item_replace = str2;
        this.remoteWebUrlOverride = str3;
    }

    public static /* synthetic */ OptInNotificationContent copy$default(OptInNotificationContent optInNotificationContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optInNotificationContent.overlay;
        }
        if ((i & 2) != 0) {
            str2 = optInNotificationContent.overlay_item_replace;
        }
        if ((i & 4) != 0) {
            str3 = optInNotificationContent.remoteWebUrlOverride;
        }
        return optInNotificationContent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.overlay;
    }

    public final String component2() {
        return this.overlay_item_replace;
    }

    public final String component3() {
        return this.remoteWebUrlOverride;
    }

    public final OptInNotificationContent copy(String str, String str2, String str3) {
        return new OptInNotificationContent(str, str2, str3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.remoteWebUrlOverride, r3.remoteWebUrlOverride) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.OptInNotificationContent;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.OptInNotificationContent) r3;
        r0 = r2.overlay;
        r1 = r3.overlay;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.overlay_item_replace;
        r1 = r3.overlay_item_replace;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.remoteWebUrlOverride;
        r3 = r3.remoteWebUrlOverride;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.OptInNotificationContent.equals(java.lang.Object):boolean");
    }

    public final String getOverlay() {
        return this.overlay;
    }

    public final String getOverlay_item_replace() {
        return this.overlay_item_replace;
    }

    public final String getRemoteWebUrlOverride() {
        return this.remoteWebUrlOverride;
    }

    public final int hashCode() {
        String str = this.overlay;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.overlay_item_replace;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.remoteWebUrlOverride;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OptInNotificationContent(overlay=");
        stringBuilder.append(this.overlay);
        stringBuilder.append(", overlay_item_replace=");
        stringBuilder.append(this.overlay_item_replace);
        stringBuilder.append(", remoteWebUrlOverride=");
        stringBuilder.append(this.remoteWebUrlOverride);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
