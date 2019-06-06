package com.snap.composer.people;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class HideSuggestedFriendRequest implements ComposerJsConvertible {
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

        public final HideSuggestedFriendRequest fromJavaScript(Object obj) {
            if (obj instanceof HideSuggestedFriendRequest) {
                return (HideSuggestedFriendRequest) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new HideSuggestedFriendRequest(JSConversions.INSTANCE.asString(map.get("userId")), JSConversions.INSTANCE.asString(map.get("username")), JSConversions.INSTANCE.asString(map.get(SuggestedFriendModel.SUGGESTIONTOKEN)));
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(HideSuggestedFriendRequest hideSuggestedFriendRequest) {
            akcr.b(hideSuggestedFriendRequest, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", hideSuggestedFriendRequest.getUserId());
            linkedHashMap.put("username", hideSuggestedFriendRequest.getUsername());
            linkedHashMap.put(SuggestedFriendModel.SUGGESTIONTOKEN, hideSuggestedFriendRequest.getSuggestionToken());
            return linkedHashMap;
        }
    }

    public HideSuggestedFriendRequest(String str, String str2, String str3) {
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        akcr.b(str3, SuggestedFriendModel.SUGGESTIONTOKEN);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static /* synthetic */ HideSuggestedFriendRequest copy$default(HideSuggestedFriendRequest hideSuggestedFriendRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hideSuggestedFriendRequest.a;
        }
        if ((i & 2) != 0) {
            str2 = hideSuggestedFriendRequest.b;
        }
        if ((i & 4) != 0) {
            str3 = hideSuggestedFriendRequest.c;
        }
        return hideSuggestedFriendRequest.copy(str, str2, str3);
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

    public final HideSuggestedFriendRequest copy(String str, String str2, String str3) {
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        akcr.b(str3, SuggestedFriendModel.SUGGESTIONTOKEN);
        return new HideSuggestedFriendRequest(str, str2, str3);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.people.HideSuggestedFriendRequest;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.composer.people.HideSuggestedFriendRequest) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.HideSuggestedFriendRequest.equals(java.lang.Object):boolean");
    }

    public final String getSuggestionToken() {
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HideSuggestedFriendRequest(userId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", username=");
        stringBuilder.append(this.b);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
