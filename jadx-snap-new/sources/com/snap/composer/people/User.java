package com.snap.composer.people;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snap.core.db.record.FriendModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class User implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final BitmojiInfo f;
    private final String g;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final User fromJavaScript(Object obj) {
            if (obj instanceof User) {
                return (User) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String asString = JSConversions.INSTANCE.asString(map.get("userId"));
                String asString2 = JSConversions.INSTANCE.asString(map.get("username"));
                Object obj2 = map.get("displayName");
                String asString3 = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                boolean asBoolean = JSConversions.INSTANCE.asBoolean(map.get(FriendModel.ISPOPULAR));
                boolean asBoolean2 = JSConversions.INSTANCE.asBoolean(map.get(FriendModel.ISOFFICIAL));
                BitmojiInfo fromJavaScript = BitmojiInfo.Companion.fromJavaScript(map.get("bitmojiInfo"));
                obj = map.get("businessProfileId");
                return new User(asString, asString2, asString3, asBoolean, asBoolean2, fromJavaScript, obj != null ? JSConversions.INSTANCE.asString(obj) : null);
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(User user) {
            akcr.b(user, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", user.getUserId());
            linkedHashMap.put("username", user.getUsername());
            Object displayName = user.getDisplayName();
            if (displayName == null) {
                displayName = null;
            }
            linkedHashMap.put("displayName", displayName);
            linkedHashMap.put(FriendModel.ISPOPULAR, Boolean.valueOf(user.isPopular()));
            linkedHashMap.put(FriendModel.ISOFFICIAL, Boolean.valueOf(user.isOfficial()));
            linkedHashMap.put("bitmojiInfo", user.getBitmojiInfo());
            Object businessProfileId = user.getBusinessProfileId();
            if (businessProfileId == null) {
                businessProfileId = null;
            }
            linkedHashMap.put("businessProfileId", businessProfileId);
            return linkedHashMap;
        }
    }

    public User(String str, String str2, String str3, boolean z, boolean z2, BitmojiInfo bitmojiInfo, String str4) {
        akcr.b(str, "userId");
        akcr.b(str2, "username");
        akcr.b(bitmojiInfo, "bitmojiInfo");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = bitmojiInfo;
        this.g = str4;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, boolean z, boolean z2, BitmojiInfo bitmojiInfo, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.a;
        }
        if ((i & 2) != 0) {
            str2 = user.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = user.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = user.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = user.e;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            bitmojiInfo = user.f;
        }
        BitmojiInfo bitmojiInfo2 = bitmojiInfo;
        if ((i & 64) != 0) {
            str4 = user.g;
        }
        return user.copy(str, str5, str6, z3, z4, bitmojiInfo2, str4);
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

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final BitmojiInfo component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final User copy(String str, String str2, String str3, boolean z, boolean z2, BitmojiInfo bitmojiInfo, String str4) {
        String str5 = str;
        akcr.b(str, "userId");
        String str6 = str2;
        akcr.b(str2, "username");
        BitmojiInfo bitmojiInfo2 = bitmojiInfo;
        akcr.b(bitmojiInfo, "bitmojiInfo");
        return new User(str5, str6, str3, z, z2, bitmojiInfo2, str4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof User) {
                User user = (User) obj;
                if (akcr.a(this.a, user.a) && akcr.a(this.b, user.b) && akcr.a(this.c, user.c)) {
                    if ((this.d == user.d ? 1 : null) != null) {
                        if (!((this.e == user.e ? 1 : null) != null && akcr.a(this.f, user.f) && akcr.a(this.g, user.g))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final BitmojiInfo getBitmojiInfo() {
        return this.f;
    }

    public final String getBusinessProfileId() {
        return this.g;
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
        int i2 = this.d;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.e;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        BitmojiInfo bitmojiInfo = this.f;
        hashCode = (hashCode + (bitmojiInfo != null ? bitmojiInfo.hashCode() : 0)) * 31;
        str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final boolean isOfficial() {
        return this.e;
    }

    public final boolean isPopular() {
        return this.d;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("User(userId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", username=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isPopular=");
        stringBuilder.append(this.d);
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.e);
        stringBuilder.append(", bitmojiInfo=");
        stringBuilder.append(this.f);
        stringBuilder.append(", businessProfileId=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
