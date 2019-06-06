package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.akcr;
import java.util.List;

@Keep
public final class RichMediaItem {
    private final List<Channel> channels;
    private final String id;
    private final String name;
    private final RichMediaItemProperties properties;
    @SerializedName("swipe_up_arrow_text_key")
    private final String swipeUpArrowTextKey;
    private final String type;

    public RichMediaItem(String str, String str2, String str3, List<Channel> list, RichMediaItemProperties richMediaItemProperties, String str4) {
        akcr.b(str, "name");
        akcr.b(str2, "id");
        akcr.b(str3, "type");
        akcr.b(list, "channels");
        akcr.b(richMediaItemProperties, "properties");
        this.name = str;
        this.id = str2;
        this.type = str3;
        this.channels = list;
        this.properties = richMediaItemProperties;
        this.swipeUpArrowTextKey = str4;
    }

    public static /* synthetic */ RichMediaItem copy$default(RichMediaItem richMediaItem, String str, String str2, String str3, List list, RichMediaItemProperties richMediaItemProperties, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richMediaItem.name;
        }
        if ((i & 2) != 0) {
            str2 = richMediaItem.id;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = richMediaItem.type;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = richMediaItem.channels;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            richMediaItemProperties = richMediaItem.properties;
        }
        RichMediaItemProperties richMediaItemProperties2 = richMediaItemProperties;
        if ((i & 32) != 0) {
            str4 = richMediaItem.swipeUpArrowTextKey;
        }
        return richMediaItem.copy(str, str5, str6, list2, richMediaItemProperties2, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.type;
    }

    public final List<Channel> component4() {
        return this.channels;
    }

    public final RichMediaItemProperties component5() {
        return this.properties;
    }

    public final String component6() {
        return this.swipeUpArrowTextKey;
    }

    public final RichMediaItem copy(String str, String str2, String str3, List<Channel> list, RichMediaItemProperties richMediaItemProperties, String str4) {
        akcr.b(str, "name");
        akcr.b(str2, "id");
        akcr.b(str3, "type");
        akcr.b(list, "channels");
        akcr.b(richMediaItemProperties, "properties");
        return new RichMediaItem(str, str2, str3, list, richMediaItemProperties, str4);
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (defpackage.akcr.a(r2.swipeUpArrowTextKey, r3.swipeUpArrowTextKey) != false) goto L_0x0047;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0047;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.RichMediaItem;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.RichMediaItem) r3;
        r0 = r2.name;
        r1 = r3.name;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r2.id;
        r1 = r3.id;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r2.type;
        r1 = r3.type;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r2.channels;
        r1 = r3.channels;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0030:
        r0 = r2.properties;
        r1 = r3.properties;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r2.swipeUpArrowTextKey;
        r3 = r3.swipeUpArrowTextKey;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.RichMediaItem.equals(java.lang.Object):boolean");
    }

    public final List<Channel> getChannels() {
        return this.channels;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final RichMediaItemProperties getProperties() {
        return this.properties;
    }

    public final String getSwipeUpArrowTextKey() {
        return this.swipeUpArrowTextKey;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.id;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.channels;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        RichMediaItemProperties richMediaItemProperties = this.properties;
        hashCode = (hashCode + (richMediaItemProperties != null ? richMediaItemProperties.hashCode() : 0)) * 31;
        str2 = this.swipeUpArrowTextKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RichMediaItem(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", channels=");
        stringBuilder.append(this.channels);
        stringBuilder.append(", properties=");
        stringBuilder.append(this.properties);
        stringBuilder.append(", swipeUpArrowTextKey=");
        stringBuilder.append(this.swipeUpArrowTextKey);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
