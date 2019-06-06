package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.SelectMemberNames;

final class AutoValue_FeedMemberRecord_SelectMemberNames extends SelectMemberNames {
    private final String display;
    private final String username;

    AutoValue_FeedMemberRecord_SelectMemberNames(String str, String str2) {
        this.display = str;
        if (str2 != null) {
            this.username = str2;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String display() {
        return this.display;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectMemberNames) {
            SelectMemberNames selectMemberNames = (SelectMemberNames) obj;
            String str = this.display;
            if (str != null ? !str.equals(selectMemberNames.display()) : selectMemberNames.display() != null) {
                if (this.username.equals(selectMemberNames.username())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.display;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.username.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectMemberNames{display=");
        stringBuilder.append(this.display);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
