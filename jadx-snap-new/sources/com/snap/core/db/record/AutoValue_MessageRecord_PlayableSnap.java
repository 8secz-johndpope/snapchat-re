package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.PlayableSnap;
import defpackage.gcj;
import java.util.Arrays;

final class AutoValue_MessageRecord_PlayableSnap extends PlayableSnap {
    private final long _id;
    private final MessageClientStatus clientStatus;
    private final byte[] content;
    private final String feedKey;
    private final FeedKind feedKind;
    private final Long feedRowId;
    private final String key;
    private final gcj preserved;
    private final boolean released;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final String senderDisplayName;
    private final String senderUsername;
    private final SnapServerStatus snapServerStatus;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_PlayableSnap(long j, String str, String str2, long j2, Long l, byte[] bArr, MessageClientStatus messageClientStatus, String str3, boolean z, String str4, String str5, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, FeedKind feedKind, gcj gcj) {
        String str6 = str;
        gcj gcj2 = gcj;
        this._id = j;
        if (str6 != null) {
            this.key = str6;
            this.type = str2;
            this.timestamp = j2;
            this.feedRowId = l;
            this.content = bArr;
            this.clientStatus = messageClientStatus;
            this.feedKey = str3;
            this.released = z;
            this.senderDisplayName = str4;
            this.senderUsername = str5;
            this.snapServerStatus = snapServerStatus;
            this.screenshottedOrReplayed = screenshottedOrReplayedState;
            this.feedKind = feedKind;
            if (gcj2 != null) {
                this.preserved = gcj2;
                return;
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final byte[] content() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayableSnap) {
            PlayableSnap playableSnap = (PlayableSnap) obj;
            if (this._id == playableSnap._id() && this.key.equals(playableSnap.key())) {
                String str = this.type;
                if (str != null ? !str.equals(playableSnap.type()) : playableSnap.type() != null) {
                    if (this.timestamp == playableSnap.timestamp()) {
                        Long l = this.feedRowId;
                        if (l != null ? !l.equals(playableSnap.feedRowId()) : playableSnap.feedRowId() != null) {
                            if (Arrays.equals(this.content, playableSnap instanceof AutoValue_MessageRecord_PlayableSnap ? ((AutoValue_MessageRecord_PlayableSnap) playableSnap).content : playableSnap.content())) {
                                MessageClientStatus messageClientStatus = this.clientStatus;
                                if (messageClientStatus != null ? !messageClientStatus.equals(playableSnap.clientStatus()) : playableSnap.clientStatus() != null) {
                                    str = this.feedKey;
                                    if (str != null ? !str.equals(playableSnap.feedKey()) : playableSnap.feedKey() != null) {
                                        if (this.released == playableSnap.released()) {
                                            str = this.senderDisplayName;
                                            if (str != null ? !str.equals(playableSnap.senderDisplayName()) : playableSnap.senderDisplayName() != null) {
                                                str = this.senderUsername;
                                                if (str != null ? !str.equals(playableSnap.senderUsername()) : playableSnap.senderUsername() != null) {
                                                    SnapServerStatus snapServerStatus = this.snapServerStatus;
                                                    if (snapServerStatus != null ? !snapServerStatus.equals(playableSnap.snapServerStatus()) : playableSnap.snapServerStatus() != null) {
                                                        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                                        if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(playableSnap.screenshottedOrReplayed()) : playableSnap.screenshottedOrReplayed() != null) {
                                                            FeedKind feedKind = this.feedKind;
                                                            if (feedKind != null ? !feedKind.equals(playableSnap.feedKind()) : playableSnap.feedKind() != null) {
                                                                if (this.preserved.equals(playableSnap.preserved())) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String feedKey() {
        return this.feedKey;
    }

    public final FeedKind feedKind() {
        return this.feedKind;
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.type;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.timestamp;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l = this.feedRowId;
        hashCode = (((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        String str2 = this.feedKey;
        hashCode = (((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        str2 = this.senderDisplayName;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.senderUsername;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        FeedKind feedKind = this.feedKind;
        if (feedKind != null) {
            i = feedKind.hashCode();
        }
        return this.preserved.hashCode() ^ ((hashCode ^ i) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final boolean released() {
        return this.released;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final String senderDisplayName() {
        return this.senderDisplayName;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableSnap{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", feedKey=");
        stringBuilder.append(this.feedKey);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append(", senderDisplayName=");
        stringBuilder.append(this.senderDisplayName);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", feedKind=");
        stringBuilder.append(this.feedKind);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}
