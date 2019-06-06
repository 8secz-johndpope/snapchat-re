package com.snap.core.db.record;

import com.snap.core.db.record.PlaybackSnapViewRecord.SelectViewed;

final class AutoValue_PlaybackSnapViewRecord_SelectViewed extends SelectViewed {
    private final long lastView;
    private final String snapId;

    AutoValue_PlaybackSnapViewRecord_SelectViewed(String str, long j) {
        if (str != null) {
            this.snapId = str;
            this.lastView = j;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectViewed) {
            SelectViewed selectViewed = (SelectViewed) obj;
            return this.snapId.equals(selectViewed.snapId()) && this.lastView == selectViewed.lastView();
        }
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        long j = this.lastView;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final long lastView() {
        return this.lastView;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectViewed{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
