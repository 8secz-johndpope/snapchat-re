package com.snap.composer.stories;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class StorySummaryInfo implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final EncryptedThumbnail a;
    private final boolean b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final StorySummaryInfo fromJavaScript(Object obj) {
            if (obj instanceof StorySummaryInfo) {
                return (StorySummaryInfo) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return new StorySummaryInfo(EncryptedThumbnail.Companion.fromJavaScript(map.get("thumbnail")), JSConversions.INSTANCE.asBoolean(map.get("hasUnviewedSnaps")));
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(StorySummaryInfo storySummaryInfo) {
            akcr.b(storySummaryInfo, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("thumbnail", storySummaryInfo.getThumbnail());
            linkedHashMap.put("hasUnviewedSnaps", Boolean.valueOf(storySummaryInfo.getHasUnviewedSnaps()));
            return linkedHashMap;
        }
    }

    public StorySummaryInfo(EncryptedThumbnail encryptedThumbnail, boolean z) {
        akcr.b(encryptedThumbnail, "thumbnail");
        this.a = encryptedThumbnail;
        this.b = z;
    }

    public static /* synthetic */ StorySummaryInfo copy$default(StorySummaryInfo storySummaryInfo, EncryptedThumbnail encryptedThumbnail, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            encryptedThumbnail = storySummaryInfo.a;
        }
        if ((i & 2) != 0) {
            z = storySummaryInfo.b;
        }
        return storySummaryInfo.copy(encryptedThumbnail, z);
    }

    public final EncryptedThumbnail component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final StorySummaryInfo copy(EncryptedThumbnail encryptedThumbnail, boolean z) {
        akcr.b(encryptedThumbnail, "thumbnail");
        return new StorySummaryInfo(encryptedThumbnail, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorySummaryInfo) {
                StorySummaryInfo storySummaryInfo = (StorySummaryInfo) obj;
                if (akcr.a(this.a, storySummaryInfo.a)) {
                    if ((this.b == storySummaryInfo.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getHasUnviewedSnaps() {
        return this.b;
    }

    public final EncryptedThumbnail getThumbnail() {
        return this.a;
    }

    public final int hashCode() {
        EncryptedThumbnail encryptedThumbnail = this.a;
        int hashCode = (encryptedThumbnail != null ? encryptedThumbnail.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySummaryInfo(thumbnail=");
        stringBuilder.append(this.a);
        stringBuilder.append(", hasUnviewedSnaps=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
