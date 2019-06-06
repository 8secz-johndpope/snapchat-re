package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.akcr;

@Keep
public final class LocalWebContent {
    @SerializedName("file")
    private final String pageFileName;
    @SerializedName("subscription_method")
    private final String subscriptionMethod;

    public LocalWebContent(String str, String str2) {
        akcr.b(str, "pageFileName");
        this.pageFileName = str;
        this.subscriptionMethod = str2;
    }

    public static /* synthetic */ LocalWebContent copy$default(LocalWebContent localWebContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localWebContent.pageFileName;
        }
        if ((i & 2) != 0) {
            str2 = localWebContent.subscriptionMethod;
        }
        return localWebContent.copy(str, str2);
    }

    public final String component1() {
        return this.pageFileName;
    }

    public final String component2() {
        return this.subscriptionMethod;
    }

    public final LocalWebContent copy(String str, String str2) {
        akcr.b(str, "pageFileName");
        return new LocalWebContent(str, str2);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.subscriptionMethod, r3.subscriptionMethod) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.LocalWebContent;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.LocalWebContent) r3;
        r0 = r2.pageFileName;
        r1 = r3.pageFileName;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.subscriptionMethod;
        r3 = r3.subscriptionMethod;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.LocalWebContent.equals(java.lang.Object):boolean");
    }

    public final String getPageFileName() {
        return this.pageFileName;
    }

    public final String getSubscriptionMethod() {
        return this.subscriptionMethod;
    }

    public final int hashCode() {
        String str = this.pageFileName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subscriptionMethod;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocalWebContent(pageFileName=");
        stringBuilder.append(this.pageFileName);
        stringBuilder.append(", subscriptionMethod=");
        stringBuilder.append(this.subscriptionMethod);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
