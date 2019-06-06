package com.snap.core.db.record;

import com.snap.core.db.record.PreferencesRecord.KeysWithTweak;

final class AutoValue_PreferencesRecord_KeysWithTweak extends KeysWithTweak {
    private final PreferencesRecord key;
    private final PreferencesRecord tweak;

    AutoValue_PreferencesRecord_KeysWithTweak(PreferencesRecord preferencesRecord, PreferencesRecord preferencesRecord2) {
        this.key = preferencesRecord;
        this.tweak = preferencesRecord2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KeysWithTweak) {
            KeysWithTweak keysWithTweak = (KeysWithTweak) obj;
            PreferencesRecord preferencesRecord = this.key;
            if (preferencesRecord != null ? !preferencesRecord.equals(keysWithTweak.key()) : keysWithTweak.key() != null) {
                preferencesRecord = this.tweak;
                return preferencesRecord != null ? !preferencesRecord.equals(keysWithTweak.tweak()) : keysWithTweak.tweak() != null;
            }
        }
    }

    public final int hashCode() {
        PreferencesRecord preferencesRecord = this.key;
        int i = 0;
        int hashCode = ((preferencesRecord == null ? 0 : preferencesRecord.hashCode()) ^ 1000003) * 1000003;
        PreferencesRecord preferencesRecord2 = this.tweak;
        if (preferencesRecord2 != null) {
            i = preferencesRecord2.hashCode();
        }
        return hashCode ^ i;
    }

    public final PreferencesRecord key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("KeysWithTweak{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", tweak=");
        stringBuilder.append(this.tweak);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final PreferencesRecord tweak() {
        return this.tweak;
    }
}
