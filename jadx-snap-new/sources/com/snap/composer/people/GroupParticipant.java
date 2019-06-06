package com.snap.composer.people;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class GroupParticipant implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final String b;
    private final String c;
    private final BitmojiInfo d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final GroupParticipant fromJavaScript(Object obj) {
            if (obj instanceof GroupParticipant) {
                return (GroupParticipant) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new GroupParticipant(JSConversions.INSTANCE.asString(map.get("userId")), JSConversions.INSTANCE.asString(map.get("username")), JSConversions.INSTANCE.asString(map.get("displayName")), BitmojiInfo.Companion.fromJavaScript(map.get("bitmojiInfo")));
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(GroupParticipant groupParticipant) {
            akcr.b(groupParticipant, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", groupParticipant.getUserId());
            linkedHashMap.put("username", groupParticipant.getUsername());
            linkedHashMap.put("displayName", groupParticipant.getDisplayName());
            linkedHashMap.put("bitmojiInfo", groupParticipant.getBitmojiInfo());
            return linkedHashMap;
        }
    }

    public GroupParticipant(String str, String str2, String str3, BitmojiInfo bitmojiInfo) {
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        akcr.b(str3, "displayName");
        akcr.b(bitmojiInfo, "bitmojiInfo");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bitmojiInfo;
    }

    public static /* synthetic */ GroupParticipant copy$default(GroupParticipant groupParticipant, String str, String str2, String str3, BitmojiInfo bitmojiInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupParticipant.a;
        }
        if ((i & 2) != 0) {
            str2 = groupParticipant.b;
        }
        if ((i & 4) != 0) {
            str3 = groupParticipant.c;
        }
        if ((i & 8) != 0) {
            bitmojiInfo = groupParticipant.d;
        }
        return groupParticipant.copy(str, str2, str3, bitmojiInfo);
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

    public final BitmojiInfo component4() {
        return this.d;
    }

    public final GroupParticipant copy(String str, String str2, String str3, BitmojiInfo bitmojiInfo) {
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        akcr.b(str3, "displayName");
        akcr.b(bitmojiInfo, "bitmojiInfo");
        return new GroupParticipant(str, str2, str3, bitmojiInfo);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.people.GroupParticipant;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.snap.composer.people.GroupParticipant) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.d;
        r3 = r3.d;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.GroupParticipant.equals(java.lang.Object):boolean");
    }

    public final BitmojiInfo getBitmojiInfo() {
        return this.d;
    }

    public final String getDisplayName() {
        return this.c;
    }

    public final String getUserId() {
        return this.a;
    }

    public final String getUsername() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        BitmojiInfo bitmojiInfo = this.d;
        if (bitmojiInfo != null) {
            i = bitmojiInfo.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupParticipant(userId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", username=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", bitmojiInfo=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
