package com.snap.composer.people;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class BitmojiInfo implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final String b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final BitmojiInfo fromJavaScript(Object obj) {
            if (obj instanceof BitmojiInfo) {
                return (BitmojiInfo) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get("avatarId");
                String str = null;
                String asString = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                obj = map.get("selfieId");
                if (obj != null) {
                    str = JSConversions.INSTANCE.asString(obj);
                }
                return new BitmojiInfo(asString, str);
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(BitmojiInfo bitmojiInfo) {
            akcr.b(bitmojiInfo, "instance");
            Map linkedHashMap = new LinkedHashMap();
            Object avatarId = bitmojiInfo.getAvatarId();
            if (avatarId == null) {
                avatarId = null;
            }
            linkedHashMap.put("avatarId", avatarId);
            Object selfieId = bitmojiInfo.getSelfieId();
            if (selfieId == null) {
                selfieId = null;
            }
            linkedHashMap.put("selfieId", selfieId);
            return linkedHashMap;
        }
    }

    public BitmojiInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ BitmojiInfo copy$default(BitmojiInfo bitmojiInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bitmojiInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = bitmojiInfo.b;
        }
        return bitmojiInfo.copy(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final BitmojiInfo copy(String str, String str2) {
        return new BitmojiInfo(str, str2);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.people.BitmojiInfo;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.composer.people.BitmojiInfo) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.BitmojiInfo.equals(java.lang.Object):boolean");
    }

    public final String getAvatarId() {
        return this.a;
    }

    public final String getSelfieId() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitmojiInfo(avatarId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", selfieId=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
