package com.snap.composer.stories;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class EncryptedThumbnail implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final String b;
    private final String c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final EncryptedThumbnail fromJavaScript(Object obj) {
            if (obj instanceof EncryptedThumbnail) {
                return (EncryptedThumbnail) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new EncryptedThumbnail(JSConversions.INSTANCE.asString(map.get("key")), JSConversions.INSTANCE.asString(map.get("iv")), JSConversions.INSTANCE.asString(map.get("url")));
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(EncryptedThumbnail encryptedThumbnail) {
            akcr.b(encryptedThumbnail, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key", encryptedThumbnail.getKey());
            linkedHashMap.put("iv", encryptedThumbnail.getIv());
            linkedHashMap.put("url", encryptedThumbnail.getUrl());
            return linkedHashMap;
        }
    }

    public EncryptedThumbnail(String str, String str2, String str3) {
        akcr.b(str, "key");
        akcr.b(str2, "iv");
        akcr.b(str3, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static /* synthetic */ EncryptedThumbnail copy$default(EncryptedThumbnail encryptedThumbnail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptedThumbnail.a;
        }
        if ((i & 2) != 0) {
            str2 = encryptedThumbnail.b;
        }
        if ((i & 4) != 0) {
            str3 = encryptedThumbnail.c;
        }
        return encryptedThumbnail.copy(str, str2, str3);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final EncryptedThumbnail copy(String str, String str2, String str3) {
        akcr.b(str, "key");
        akcr.b(str2, "iv");
        akcr.b(str3, "url");
        return new EncryptedThumbnail(str, str2, str3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.stories.EncryptedThumbnail;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.composer.stories.EncryptedThumbnail) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.c;
        r3 = r3.c;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.stories.EncryptedThumbnail.equals(java.lang.Object):boolean");
    }

    public final String getIv() {
        return this.b;
    }

    public final String getKey() {
        return this.a;
    }

    public final String getUrl() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EncryptedThumbnail(key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", iv=");
        stringBuilder.append(this.b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
