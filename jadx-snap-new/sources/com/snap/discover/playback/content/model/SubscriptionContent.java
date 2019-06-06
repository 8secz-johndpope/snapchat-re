package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public final class SubscriptionContent {
    @SerializedName("display_name")
    private final String displayName;
    @SerializedName("notificationProperties")
    private final OptInNotificationContent notificationProperties;
    @SerializedName("primary_color")
    private final String primaryColo;
    @SerializedName("secondary_color")
    private final String secondaryColor;
    @SerializedName("subscription_id")
    private final String subscriptionId;
    @SerializedName("subscription_type")
    private final String subscriptionType;

    public SubscriptionContent(String str, String str2, String str3, String str4, String str5, OptInNotificationContent optInNotificationContent) {
        this.displayName = str;
        this.subscriptionId = str2;
        this.subscriptionType = str3;
        this.primaryColo = str4;
        this.secondaryColor = str5;
        this.notificationProperties = optInNotificationContent;
    }

    public static /* synthetic */ SubscriptionContent copy$default(SubscriptionContent subscriptionContent, String str, String str2, String str3, String str4, String str5, OptInNotificationContent optInNotificationContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionContent.displayName;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionContent.subscriptionId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = subscriptionContent.subscriptionType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = subscriptionContent.primaryColo;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = subscriptionContent.secondaryColor;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            optInNotificationContent = subscriptionContent.notificationProperties;
        }
        return subscriptionContent.copy(str, str6, str7, str8, str9, optInNotificationContent);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.subscriptionId;
    }

    public final String component3() {
        return this.subscriptionType;
    }

    public final String component4() {
        return this.primaryColo;
    }

    public final String component5() {
        return this.secondaryColor;
    }

    public final OptInNotificationContent component6() {
        return this.notificationProperties;
    }

    public final SubscriptionContent copy(String str, String str2, String str3, String str4, String str5, OptInNotificationContent optInNotificationContent) {
        return new SubscriptionContent(str, str2, str3, str4, str5, optInNotificationContent);
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (defpackage.akcr.a(r2.notificationProperties, r3.notificationProperties) != false) goto L_0x0047;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0047;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.SubscriptionContent;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.SubscriptionContent) r3;
        r0 = r2.displayName;
        r1 = r3.displayName;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r2.subscriptionId;
        r1 = r3.subscriptionId;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r2.subscriptionType;
        r1 = r3.subscriptionType;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r2.primaryColo;
        r1 = r3.primaryColo;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0030:
        r0 = r2.secondaryColor;
        r1 = r3.secondaryColor;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r2.notificationProperties;
        r3 = r3.notificationProperties;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r3 = 0;
        return r3;
    L_0x0047:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.SubscriptionContent.equals(java.lang.Object):boolean");
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final OptInNotificationContent getNotificationProperties() {
        return this.notificationProperties;
    }

    public final String getPrimaryColo() {
        return this.primaryColo;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public final int hashCode() {
        String str = this.displayName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subscriptionId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.subscriptionType;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.primaryColo;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.secondaryColor;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        OptInNotificationContent optInNotificationContent = this.notificationProperties;
        if (optInNotificationContent != null) {
            i = optInNotificationContent.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SubscriptionContent(displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", subscriptionId=");
        stringBuilder.append(this.subscriptionId);
        stringBuilder.append(", subscriptionType=");
        stringBuilder.append(this.subscriptionType);
        stringBuilder.append(", primaryColo=");
        stringBuilder.append(this.primaryColo);
        stringBuilder.append(", secondaryColor=");
        stringBuilder.append(this.secondaryColor);
        stringBuilder.append(", notificationProperties=");
        stringBuilder.append(this.notificationProperties);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
