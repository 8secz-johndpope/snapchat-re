package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import defpackage.akcr;

@Keep
public final class PageContent {
    private final String id;
    private final String name;
    private final ItemContent properties;
    private final String type;

    public PageContent(String str, ItemContent itemContent, String str2, String str3) {
        akcr.b(itemContent, "properties");
        akcr.b(str3, "type");
        this.name = str;
        this.properties = itemContent;
        this.id = str2;
        this.type = str3;
    }

    public static /* synthetic */ PageContent copy$default(PageContent pageContent, String str, ItemContent itemContent, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageContent.name;
        }
        if ((i & 2) != 0) {
            itemContent = pageContent.properties;
        }
        if ((i & 4) != 0) {
            str2 = pageContent.id;
        }
        if ((i & 8) != 0) {
            str3 = pageContent.type;
        }
        return pageContent.copy(str, itemContent, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final ItemContent component2() {
        return this.properties;
    }

    public final String component3() {
        return this.id;
    }

    public final String component4() {
        return this.type;
    }

    public final PageContent copy(String str, ItemContent itemContent, String str2, String str3) {
        akcr.b(itemContent, "properties");
        akcr.b(str3, "type");
        return new PageContent(str, itemContent, str2, str3);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.type, r3.type) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.PageContent;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.PageContent) r3;
        r0 = r2.name;
        r1 = r3.name;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.properties;
        r1 = r3.properties;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.id;
        r1 = r3.id;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.type;
        r3 = r3.type;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.PageContent.equals(java.lang.Object):boolean");
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final ItemContent getProperties() {
        return this.properties;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ItemContent itemContent = this.properties;
        hashCode = (hashCode + (itemContent != null ? itemContent.hashCode() : 0)) * 31;
        String str2 = this.id;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PageContent(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", properties=");
        stringBuilder.append(this.properties);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
