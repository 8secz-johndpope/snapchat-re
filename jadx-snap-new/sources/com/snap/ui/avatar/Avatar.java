package com.snap.ui.avatar;

import android.net.Uri;
import defpackage.akco;
import defpackage.akcr;

public final class Avatar {
    private final Uri bitmojiArmUri;
    private final Uri bitmojiUri;
    private final Integer fallbackColor;
    private final String username;

    public Avatar(String str, Uri uri) {
        this(str, uri, null, null, 12, null);
    }

    public Avatar(String str, Uri uri, Uri uri2) {
        this(str, uri, uri2, null, 8, null);
    }

    public Avatar(String str, Uri uri, Uri uri2, Integer num) {
        akcr.b(str, "username");
        this.username = str;
        this.bitmojiUri = uri;
        this.bitmojiArmUri = uri2;
        this.fallbackColor = num;
    }

    public /* synthetic */ Avatar(String str, Uri uri, Uri uri2, Integer num, int i, akco akco) {
        if ((i & 4) != 0) {
            uri2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        this(str, uri, uri2, num);
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, Uri uri, Uri uri2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatar.username;
        }
        if ((i & 2) != 0) {
            uri = avatar.bitmojiUri;
        }
        if ((i & 4) != 0) {
            uri2 = avatar.bitmojiArmUri;
        }
        if ((i & 8) != 0) {
            num = avatar.fallbackColor;
        }
        return avatar.copy(str, uri, uri2, num);
    }

    public final String component1() {
        return this.username;
    }

    public final Uri component2() {
        return this.bitmojiUri;
    }

    public final Uri component3() {
        return this.bitmojiArmUri;
    }

    public final Integer component4() {
        return this.fallbackColor;
    }

    public final Avatar copy(String str, Uri uri, Uri uri2, Integer num) {
        akcr.b(str, "username");
        return new Avatar(str, uri, uri2, num);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.fallbackColor, r3.fallbackColor) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.snap.ui.avatar.Avatar;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.snap.ui.avatar.Avatar) r3;
        r0 = r2.username;
        r1 = r3.username;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.bitmojiUri;
        r1 = r3.bitmojiUri;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.bitmojiArmUri;
        r1 = r3.bitmojiArmUri;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.fallbackColor;
        r3 = r3.fallbackColor;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.avatar.Avatar.equals(java.lang.Object):boolean");
    }

    public final Uri getBitmojiArmUri() {
        return this.bitmojiArmUri;
    }

    public final Uri getBitmojiUri() {
        return this.bitmojiUri;
    }

    public final Integer getFallbackColor() {
        return this.fallbackColor;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.bitmojiUri;
        hashCode = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        uri = this.bitmojiArmUri;
        hashCode = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Integer num = this.fallbackColor;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Avatar(username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", bitmojiUri=");
        stringBuilder.append(this.bitmojiUri);
        stringBuilder.append(", bitmojiArmUri=");
        stringBuilder.append(this.bitmojiArmUri);
        stringBuilder.append(", fallbackColor=");
        stringBuilder.append(this.fallbackColor);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
