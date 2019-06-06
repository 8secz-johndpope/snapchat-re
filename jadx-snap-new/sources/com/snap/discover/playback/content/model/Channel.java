package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.akcr;
import java.util.List;

@Keep
public final class Channel {
    private final String id;
    private final String name;
    @SerializedName("items_v2")
    private final List<PageContent> pageContent;
    private final String type;

    public Channel(String str, String str2, String str3, List<PageContent> list) {
        akcr.b(str, "name");
        akcr.b(str2, "id");
        akcr.b(str3, "type");
        akcr.b(list, "pageContent");
        this.name = str;
        this.id = str2;
        this.type = str3;
        this.pageContent = list;
    }

    public static /* synthetic */ Channel copy$default(Channel channel, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channel.name;
        }
        if ((i & 2) != 0) {
            str2 = channel.id;
        }
        if ((i & 4) != 0) {
            str3 = channel.type;
        }
        if ((i & 8) != 0) {
            list = channel.pageContent;
        }
        return channel.copy(str, str2, str3, list);
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

    public final List<PageContent> component4() {
        return this.pageContent;
    }

    public final Channel copy(String str, String str2, String str3, List<PageContent> list) {
        akcr.b(str, "name");
        akcr.b(str2, "id");
        akcr.b(str3, "type");
        akcr.b(list, "pageContent");
        return new Channel(str, str2, str3, list);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.pageContent, r3.pageContent) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.Channel;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.Channel) r3;
        r0 = r2.name;
        r1 = r3.name;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.id;
        r1 = r3.id;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.type;
        r1 = r3.type;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.pageContent;
        r3 = r3.pageContent;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.Channel.equals(java.lang.Object):boolean");
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PageContent> getPageContent() {
        return this.pageContent;
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
        List list = this.pageContent;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Channel(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", pageContent=");
        stringBuilder.append(this.pageContent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
