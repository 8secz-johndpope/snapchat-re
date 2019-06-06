package com.looksery.sdk.domain;

import java.util.Map;
import java.util.Set;

public final class Bitmoji3dData {
    private final Availability mAvailability;
    private final Map<String, String> mFriendmojiMetadataMap;
    private final String mMetadata;

    public enum Availability {
        AVAILABLE,
        IN_PROGRESS,
        UNAVAILABLE
    }

    public Bitmoji3dData(String str, Availability availability, Map<String, String> map) {
        this.mMetadata = str;
        this.mAvailability = availability;
        this.mFriendmojiMetadataMap = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Bitmoji3dData bitmoji3dData = (Bitmoji3dData) obj;
            String str = this.mMetadata;
            if (!str == null ? str.equals(bitmoji3dData.mMetadata) : bitmoji3dData.mMetadata == null) {
                return false;
            }
            if (this.mAvailability == bitmoji3dData.mAvailability) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final Availability getAvailability() {
        return this.mAvailability;
    }

    public final String[] getFriendIds() {
        Set keySet = this.mFriendmojiMetadataMap.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    public final Map<String, String> getFriendmojiMetadataIds() {
        return this.mFriendmojiMetadataMap;
    }

    /* Access modifiers changed, original: final */
    public final String getMetadata() {
        return this.mMetadata;
    }

    public final String getMetadataForId(String str) {
        return (String) this.mFriendmojiMetadataMap.get(str);
    }

    public final int hashCode() {
        String str = this.mMetadata;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Availability availability = this.mAvailability;
        if (availability != null) {
            i = availability.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Bitmoji3dData{mMetadata='");
        stringBuilder.append(this.mMetadata);
        stringBuilder.append('\'');
        stringBuilder.append(", mAvailability=");
        stringBuilder.append(this.mAvailability);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
