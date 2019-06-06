package com.snap.composer.people;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snap.core.db.record.StorySnapModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Friendmoji implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final double b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Friendmoji fromJavaScript(Object obj) {
            if (obj instanceof Friendmoji) {
                return (Friendmoji) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new Friendmoji(JSConversions.INSTANCE.asString(map.get("categoryName")), JSConversions.INSTANCE.asDouble(map.get(StorySnapModel.EXPIRATIONTIMESTAMP)));
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(Friendmoji friendmoji) {
            akcr.b(friendmoji, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("categoryName", friendmoji.getCategoryName());
            linkedHashMap.put(StorySnapModel.EXPIRATIONTIMESTAMP, Double.valueOf(friendmoji.getExpirationTimestamp()));
            return linkedHashMap;
        }
    }

    public Friendmoji(String str, double d) {
        akcr.b(str, "categoryName");
        this.a = str;
        this.b = d;
    }

    public static /* synthetic */ Friendmoji copy$default(Friendmoji friendmoji, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = friendmoji.a;
        }
        if ((i & 2) != 0) {
            d = friendmoji.b;
        }
        return friendmoji.copy(str, d);
    }

    public final String component1() {
        return this.a;
    }

    public final double component2() {
        return this.b;
    }

    public final Friendmoji copy(String str, double d) {
        akcr.b(str, "categoryName");
        return new Friendmoji(str, d);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Double.compare(r4.b, r5.b) == 0) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x001f;
    L_0x0002:
        r0 = r5 instanceof com.snap.composer.people.Friendmoji;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r5 = (com.snap.composer.people.Friendmoji) r5;
        r0 = r4.a;
        r1 = r5.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r4.b;
        r2 = r5.b;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r5 = 0;
        return r5;
    L_0x001f:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.Friendmoji.equals(java.lang.Object):boolean");
    }

    public final String getCategoryName() {
        return this.a;
    }

    public final double getExpirationTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Friendmoji(categoryName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", expirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
