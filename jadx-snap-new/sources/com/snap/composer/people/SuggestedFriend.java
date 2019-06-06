package com.snap.composer.people;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class SuggestedFriend implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final User a;
    private final String b;
    private final String c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final SuggestedFriend fromJavaScript(Object obj) {
            if (obj instanceof SuggestedFriend) {
                return (SuggestedFriend) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                User fromJavaScript = User.Companion.fromJavaScript(map.get("user"));
                Object obj2 = map.get("localizedSuggestionReason");
                String str = null;
                String asString = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                obj = map.get(SuggestedFriendModel.SUGGESTIONTOKEN);
                if (obj != null) {
                    str = JSConversions.INSTANCE.asString(obj);
                }
                return new SuggestedFriend(fromJavaScript, asString, str);
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(SuggestedFriend suggestedFriend) {
            akcr.b(suggestedFriend, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("user", suggestedFriend.getUser());
            Object localizedSuggestionReason = suggestedFriend.getLocalizedSuggestionReason();
            if (localizedSuggestionReason == null) {
                localizedSuggestionReason = null;
            }
            linkedHashMap.put("localizedSuggestionReason", localizedSuggestionReason);
            Object suggestionToken = suggestedFriend.getSuggestionToken();
            if (suggestionToken == null) {
                suggestionToken = null;
            }
            linkedHashMap.put(SuggestedFriendModel.SUGGESTIONTOKEN, suggestionToken);
            return linkedHashMap;
        }
    }

    public SuggestedFriend(User user, String str, String str2) {
        akcr.b(user, "user");
        this.a = user;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ SuggestedFriend copy$default(SuggestedFriend suggestedFriend, User user, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            user = suggestedFriend.a;
        }
        if ((i & 2) != 0) {
            str = suggestedFriend.b;
        }
        if ((i & 4) != 0) {
            str2 = suggestedFriend.c;
        }
        return suggestedFriend.copy(user, str, str2);
    }

    public final User component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final SuggestedFriend copy(User user, String str, String str2) {
        akcr.b(user, "user");
        return new SuggestedFriend(user, str, str2);
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.people.SuggestedFriend;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (com.snap.composer.people.SuggestedFriend) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.SuggestedFriend.equals(java.lang.Object):boolean");
    }

    public final String getLocalizedSuggestionReason() {
        return this.b;
    }

    public final String getSuggestionToken() {
        return this.c;
    }

    public final User getUser() {
        return this.a;
    }

    public final int hashCode() {
        User user = this.a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SuggestedFriend(user=");
        stringBuilder.append(this.a);
        stringBuilder.append(", localizedSuggestionReason=");
        stringBuilder.append(this.b);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
