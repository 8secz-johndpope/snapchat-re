package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import defpackage.gcg;
import defpackage.gcp;
import java.util.Arrays;

final class AutoValue_FeedRecord extends FeedRecord {
    private final long _id;
    private final byte[] authToken;
    private final Long clearedTimestamp;
    private final boolean cognacNotificationMuted;
    private final String displayInteractionType;
    private final long displayTimestamp;
    private final String fitScreenParticipantString;
    private final Long friendLastReadTimestamp;
    private final Long friendRowId;
    private final String groupCreationRequestId;
    private final Long groupCreationTimestamp;
    private final String groupMobId;
    private final Boolean groupStoryMuted;
    private final gcg groupSyncContentType;
    private final long groupVersion;
    private final Boolean hidden;
    private final boolean isArroyo;
    private final boolean isTemporaryGroup;
    private final String iterToken;
    private final String key;
    private final FeedKind kind;
    private final Long lastInteractionTimestamp;
    private final Long lastInteractionUserId;
    private final Long lastInteractionWriterId;
    private final Long lastReadTimestamp;
    private final String lastReader;
    private final gcp lastSnapType;
    private final Long lastWriteTimestamp;
    private final String lastWriteType;
    private final String lastWriter;
    private final boolean laterContentExists;
    private final long messageRetentionInMinutes;
    private final Long myLastReadTimestamp;
    private final long myReceivedSnapReleaseTimestamp;
    private final long mySentSnapReleaseTimestamp;
    private final Boolean notificationMuted;
    private final String participantString;
    private final long participantsSize;
    private final long sortingTimestamp;
    private final long sourcePage;
    private final String specifiedName;
    private final Long storyRowId;
    private final long storySkipCount;

    AutoValue_FeedRecord(long j, String str, String str2, String str3, String str4, long j2, Long l, String str5, long j3, String str6, long j4, Long l2, Long l3, Long l4, Long l5, long j5, long j6, Long l6, long j7, Long l7, String str7, Long l8, String str8, String str9, Long l9, Long l10, gcp gcp, Long l11, String str10, Boolean bool, byte[] bArr, boolean z, gcg gcg, long j8, long j9, FeedKind feedKind, Boolean bool2, boolean z2, String str11, boolean z3, boolean z4, Boolean bool3, long j10) {
        String str12 = str;
        gcg gcg2 = gcg;
        FeedKind feedKind2 = feedKind;
        this._id = j;
        if (str12 != null) {
            this.key = str12;
            this.specifiedName = str2;
            this.participantString = str3;
            this.fitScreenParticipantString = str4;
            this.participantsSize = j2;
            this.friendRowId = l;
            this.iterToken = str5;
            this.displayTimestamp = j3;
            this.displayInteractionType = str6;
            this.sortingTimestamp = j4;
            this.groupCreationTimestamp = l2;
            this.lastInteractionTimestamp = l3;
            this.lastInteractionUserId = l4;
            this.lastInteractionWriterId = l5;
            this.myReceivedSnapReleaseTimestamp = j5;
            this.mySentSnapReleaseTimestamp = j6;
            this.clearedTimestamp = l6;
            this.storySkipCount = j7;
            this.lastReadTimestamp = l7;
            this.lastReader = str7;
            this.lastWriteTimestamp = l8;
            this.lastWriteType = str8;
            this.lastWriter = str9;
            this.myLastReadTimestamp = l9;
            this.friendLastReadTimestamp = l10;
            this.lastSnapType = gcp;
            this.storyRowId = l11;
            this.groupMobId = str10;
            this.groupStoryMuted = bool;
            this.authToken = bArr;
            this.laterContentExists = z;
            if (gcg2 != null) {
                this.groupSyncContentType = gcg2;
                this.groupVersion = j8;
                this.messageRetentionInMinutes = j9;
                if (feedKind2 != null) {
                    this.kind = feedKind2;
                    this.notificationMuted = bool2;
                    this.cognacNotificationMuted = z2;
                    this.groupCreationRequestId = str11;
                    this.isTemporaryGroup = z3;
                    this.isArroyo = z4;
                    this.hidden = bool3;
                    this.sourcePage = j10;
                    return;
                }
                throw new NullPointerException("Null kind");
            }
            throw new NullPointerException("Null groupSyncContentType");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final byte[] authToken() {
        return this.authToken;
    }

    public final Long clearedTimestamp() {
        return this.clearedTimestamp;
    }

    public final boolean cognacNotificationMuted() {
        return this.cognacNotificationMuted;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final long displayTimestamp() {
        return this.displayTimestamp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeedRecord) {
            FeedRecord feedRecord = (FeedRecord) obj;
            if (this._id == feedRecord._id() && this.key.equals(feedRecord.key())) {
                String str = this.specifiedName;
                if (str != null ? !str.equals(feedRecord.specifiedName()) : feedRecord.specifiedName() != null) {
                    str = this.participantString;
                    if (str != null ? !str.equals(feedRecord.participantString()) : feedRecord.participantString() != null) {
                        str = this.fitScreenParticipantString;
                        if (str != null ? !str.equals(feedRecord.fitScreenParticipantString()) : feedRecord.fitScreenParticipantString() != null) {
                            if (this.participantsSize == feedRecord.participantsSize()) {
                                Long l = this.friendRowId;
                                if (l != null ? !l.equals(feedRecord.friendRowId()) : feedRecord.friendRowId() != null) {
                                    str = this.iterToken;
                                    if (str != null ? !str.equals(feedRecord.iterToken()) : feedRecord.iterToken() != null) {
                                        if (this.displayTimestamp == feedRecord.displayTimestamp()) {
                                            str = this.displayInteractionType;
                                            if (str != null ? !str.equals(feedRecord.displayInteractionType()) : feedRecord.displayInteractionType() != null) {
                                                if (this.sortingTimestamp == feedRecord.sortingTimestamp()) {
                                                    l = this.groupCreationTimestamp;
                                                    if (l != null ? !l.equals(feedRecord.groupCreationTimestamp()) : feedRecord.groupCreationTimestamp() != null) {
                                                        l = this.lastInteractionTimestamp;
                                                        if (l != null ? !l.equals(feedRecord.lastInteractionTimestamp()) : feedRecord.lastInteractionTimestamp() != null) {
                                                            l = this.lastInteractionUserId;
                                                            if (l != null ? !l.equals(feedRecord.lastInteractionUserId()) : feedRecord.lastInteractionUserId() != null) {
                                                                l = this.lastInteractionWriterId;
                                                                if (l != null ? !l.equals(feedRecord.lastInteractionWriterId()) : feedRecord.lastInteractionWriterId() != null) {
                                                                    if (this.myReceivedSnapReleaseTimestamp == feedRecord.myReceivedSnapReleaseTimestamp() && this.mySentSnapReleaseTimestamp == feedRecord.mySentSnapReleaseTimestamp()) {
                                                                        l = this.clearedTimestamp;
                                                                        if (l != null ? !l.equals(feedRecord.clearedTimestamp()) : feedRecord.clearedTimestamp() != null) {
                                                                            if (this.storySkipCount == feedRecord.storySkipCount()) {
                                                                                l = this.lastReadTimestamp;
                                                                                if (l != null ? !l.equals(feedRecord.lastReadTimestamp()) : feedRecord.lastReadTimestamp() != null) {
                                                                                    str = this.lastReader;
                                                                                    if (str != null ? !str.equals(feedRecord.lastReader()) : feedRecord.lastReader() != null) {
                                                                                        l = this.lastWriteTimestamp;
                                                                                        if (l != null ? !l.equals(feedRecord.lastWriteTimestamp()) : feedRecord.lastWriteTimestamp() != null) {
                                                                                            str = this.lastWriteType;
                                                                                            if (str != null ? !str.equals(feedRecord.lastWriteType()) : feedRecord.lastWriteType() != null) {
                                                                                                str = this.lastWriter;
                                                                                                if (str != null ? !str.equals(feedRecord.lastWriter()) : feedRecord.lastWriter() != null) {
                                                                                                    l = this.myLastReadTimestamp;
                                                                                                    if (l != null ? !l.equals(feedRecord.myLastReadTimestamp()) : feedRecord.myLastReadTimestamp() != null) {
                                                                                                        l = this.friendLastReadTimestamp;
                                                                                                        if (l != null ? !l.equals(feedRecord.friendLastReadTimestamp()) : feedRecord.friendLastReadTimestamp() != null) {
                                                                                                            gcp gcp = this.lastSnapType;
                                                                                                            if (gcp != null ? !gcp.equals(feedRecord.lastSnapType()) : feedRecord.lastSnapType() != null) {
                                                                                                                l = this.storyRowId;
                                                                                                                if (l != null ? !l.equals(feedRecord.storyRowId()) : feedRecord.storyRowId() != null) {
                                                                                                                    str = this.groupMobId;
                                                                                                                    if (str != null ? !str.equals(feedRecord.groupMobId()) : feedRecord.groupMobId() != null) {
                                                                                                                        Boolean bool = this.groupStoryMuted;
                                                                                                                        if (bool != null ? !bool.equals(feedRecord.groupStoryMuted()) : feedRecord.groupStoryMuted() != null) {
                                                                                                                            if (Arrays.equals(this.authToken, feedRecord instanceof AutoValue_FeedRecord ? ((AutoValue_FeedRecord) feedRecord).authToken : feedRecord.authToken()) && this.laterContentExists == feedRecord.laterContentExists() && this.groupSyncContentType.equals(feedRecord.groupSyncContentType()) && this.groupVersion == feedRecord.groupVersion() && this.messageRetentionInMinutes == feedRecord.messageRetentionInMinutes() && this.kind.equals(feedRecord.kind())) {
                                                                                                                                bool = this.notificationMuted;
                                                                                                                                if (bool != null ? !bool.equals(feedRecord.notificationMuted()) : feedRecord.notificationMuted() != null) {
                                                                                                                                    if (this.cognacNotificationMuted == feedRecord.cognacNotificationMuted()) {
                                                                                                                                        str = this.groupCreationRequestId;
                                                                                                                                        if (str != null ? !str.equals(feedRecord.groupCreationRequestId()) : feedRecord.groupCreationRequestId() != null) {
                                                                                                                                            if (this.isTemporaryGroup == feedRecord.isTemporaryGroup() && this.isArroyo == feedRecord.isArroyo()) {
                                                                                                                                                bool = this.hidden;
                                                                                                                                                if (bool != null ? !bool.equals(feedRecord.hidden()) : feedRecord.hidden() != null) {
                                                                                                                                                    if (this.sourcePage == feedRecord.sourcePage()) {
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
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String fitScreenParticipantString() {
        return this.fitScreenParticipantString;
    }

    public final Long friendLastReadTimestamp() {
        return this.friendLastReadTimestamp;
    }

    public final Long friendRowId() {
        return this.friendRowId;
    }

    public final String groupCreationRequestId() {
        return this.groupCreationRequestId;
    }

    public final Long groupCreationTimestamp() {
        return this.groupCreationTimestamp;
    }

    public final String groupMobId() {
        return this.groupMobId;
    }

    public final Boolean groupStoryMuted() {
        return this.groupStoryMuted;
    }

    public final gcg groupSyncContentType() {
        return this.groupSyncContentType;
    }

    public final long groupVersion() {
        return this.groupVersion;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.specifiedName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.participantString;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.fitScreenParticipantString;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.participantsSize;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.friendRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.iterToken;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        j2 = this.displayTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        str = this.displayInteractionType;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        j2 = this.sortingTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        l = this.groupCreationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionUserId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionWriterId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.myReceivedSnapReleaseTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.mySentSnapReleaseTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        l = this.clearedTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.storySkipCount;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        l = this.lastReadTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.lastReader;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.lastWriteTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.lastWriteType;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.lastWriter;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.myLastReadTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.friendLastReadTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        gcp gcp = this.lastSnapType;
        hashCode = (hashCode ^ (gcp == null ? 0 : gcp.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.groupMobId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.groupStoryMuted;
        int i2 = 1231;
        hashCode = (((((((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ Arrays.hashCode(this.authToken)) * 1000003) ^ (this.laterContentExists ? 1231 : 1237)) * 1000003) ^ this.groupSyncContentType.hashCode()) * 1000003;
        long j3 = this.groupVersion;
        hashCode = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j3 = this.messageRetentionInMinutes;
        hashCode = (((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.kind.hashCode()) * 1000003;
        bool = this.notificationMuted;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.cognacNotificationMuted ? 1231 : 1237)) * 1000003;
        str = this.groupCreationRequestId;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.isTemporaryGroup ? 1231 : 1237)) * 1000003;
        if (!this.isArroyo) {
            i2 = 1237;
        }
        hashCode = (hashCode ^ i2) * 1000003;
        bool = this.hidden;
        if (bool != null) {
            i = bool.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        long j4 = this.sourcePage;
        return ((int) (j4 ^ (j4 >>> 32))) ^ hashCode;
    }

    public final Boolean hidden() {
        return this.hidden;
    }

    public final boolean isArroyo() {
        return this.isArroyo;
    }

    public final boolean isTemporaryGroup() {
        return this.isTemporaryGroup;
    }

    public final String iterToken() {
        return this.iterToken;
    }

    public final String key() {
        return this.key;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final Long lastInteractionUserId() {
        return this.lastInteractionUserId;
    }

    public final Long lastInteractionWriterId() {
        return this.lastInteractionWriterId;
    }

    public final Long lastReadTimestamp() {
        return this.lastReadTimestamp;
    }

    public final String lastReader() {
        return this.lastReader;
    }

    public final gcp lastSnapType() {
        return this.lastSnapType;
    }

    public final Long lastWriteTimestamp() {
        return this.lastWriteTimestamp;
    }

    public final String lastWriteType() {
        return this.lastWriteType;
    }

    public final String lastWriter() {
        return this.lastWriter;
    }

    public final boolean laterContentExists() {
        return this.laterContentExists;
    }

    public final long messageRetentionInMinutes() {
        return this.messageRetentionInMinutes;
    }

    public final Long myLastReadTimestamp() {
        return this.myLastReadTimestamp;
    }

    public final long myReceivedSnapReleaseTimestamp() {
        return this.myReceivedSnapReleaseTimestamp;
    }

    public final long mySentSnapReleaseTimestamp() {
        return this.mySentSnapReleaseTimestamp;
    }

    public final Boolean notificationMuted() {
        return this.notificationMuted;
    }

    public final String participantString() {
        return this.participantString;
    }

    public final long participantsSize() {
        return this.participantsSize;
    }

    public final long sortingTimestamp() {
        return this.sortingTimestamp;
    }

    public final long sourcePage() {
        return this.sourcePage;
    }

    public final String specifiedName() {
        return this.specifiedName;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final long storySkipCount() {
        return this.storySkipCount;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", specifiedName=");
        stringBuilder.append(this.specifiedName);
        stringBuilder.append(", participantString=");
        stringBuilder.append(this.participantString);
        stringBuilder.append(", fitScreenParticipantString=");
        stringBuilder.append(this.fitScreenParticipantString);
        stringBuilder.append(", participantsSize=");
        stringBuilder.append(this.participantsSize);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", iterToken=");
        stringBuilder.append(this.iterToken);
        stringBuilder.append(", displayTimestamp=");
        stringBuilder.append(this.displayTimestamp);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", sortingTimestamp=");
        stringBuilder.append(this.sortingTimestamp);
        stringBuilder.append(", groupCreationTimestamp=");
        stringBuilder.append(this.groupCreationTimestamp);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", lastInteractionUserId=");
        stringBuilder.append(this.lastInteractionUserId);
        stringBuilder.append(", lastInteractionWriterId=");
        stringBuilder.append(this.lastInteractionWriterId);
        stringBuilder.append(", myReceivedSnapReleaseTimestamp=");
        stringBuilder.append(this.myReceivedSnapReleaseTimestamp);
        stringBuilder.append(", mySentSnapReleaseTimestamp=");
        stringBuilder.append(this.mySentSnapReleaseTimestamp);
        stringBuilder.append(", clearedTimestamp=");
        stringBuilder.append(this.clearedTimestamp);
        stringBuilder.append(", storySkipCount=");
        stringBuilder.append(this.storySkipCount);
        stringBuilder.append(", lastReadTimestamp=");
        stringBuilder.append(this.lastReadTimestamp);
        stringBuilder.append(", lastReader=");
        stringBuilder.append(this.lastReader);
        stringBuilder.append(", lastWriteTimestamp=");
        stringBuilder.append(this.lastWriteTimestamp);
        stringBuilder.append(", lastWriteType=");
        stringBuilder.append(this.lastWriteType);
        stringBuilder.append(", lastWriter=");
        stringBuilder.append(this.lastWriter);
        stringBuilder.append(", myLastReadTimestamp=");
        stringBuilder.append(this.myLastReadTimestamp);
        stringBuilder.append(", friendLastReadTimestamp=");
        stringBuilder.append(this.friendLastReadTimestamp);
        stringBuilder.append(", lastSnapType=");
        stringBuilder.append(this.lastSnapType);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", groupMobId=");
        stringBuilder.append(this.groupMobId);
        stringBuilder.append(", groupStoryMuted=");
        stringBuilder.append(this.groupStoryMuted);
        stringBuilder.append(", authToken=");
        stringBuilder.append(Arrays.toString(this.authToken));
        stringBuilder.append(", laterContentExists=");
        stringBuilder.append(this.laterContentExists);
        stringBuilder.append(", groupSyncContentType=");
        stringBuilder.append(this.groupSyncContentType);
        stringBuilder.append(", groupVersion=");
        stringBuilder.append(this.groupVersion);
        stringBuilder.append(", messageRetentionInMinutes=");
        stringBuilder.append(this.messageRetentionInMinutes);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", notificationMuted=");
        stringBuilder.append(this.notificationMuted);
        stringBuilder.append(", cognacNotificationMuted=");
        stringBuilder.append(this.cognacNotificationMuted);
        stringBuilder.append(", groupCreationRequestId=");
        stringBuilder.append(this.groupCreationRequestId);
        stringBuilder.append(", isTemporaryGroup=");
        stringBuilder.append(this.isTemporaryGroup);
        stringBuilder.append(", isArroyo=");
        stringBuilder.append(this.isArroyo);
        stringBuilder.append(", hidden=");
        stringBuilder.append(this.hidden);
        stringBuilder.append(", sourcePage=");
        stringBuilder.append(this.sourcePage);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
