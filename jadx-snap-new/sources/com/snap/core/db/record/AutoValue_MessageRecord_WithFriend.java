package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.WithFriend;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.gcp;
import defpackage.yfj;
import java.util.Arrays;

final class AutoValue_MessageRecord_WithFriend extends WithFriend {
    private final long _id;
    private final long _modifiedTimestamp;
    private final MessageClientStatus clientStatus;
    private final byte[] content;
    private final String feedKey;
    private final FeedKind feedKind;
    private final Long feedRowId;
    private final long isSelfConversation;
    private final String key;
    private final Long messageRetentionInMinutes;
    private final ScreenshottedOrReplayedState newScreenshotOrReplayed;
    private final SnapServerStatus newSnapServerStatus;
    private final yfj newViewerList;
    private final gcj preserved;
    private final boolean released;
    private final gcm savedStates;
    private final ScreenshottedOrReplayedState screenshotOrReplayed;
    private final Long seenTimestamp;
    private final Integer senderColor;
    private final String senderDisplayName;
    private final String senderUsername;
    private final Long sequenceNumber;
    private final ReplyMedia snapReplyMedia;
    private final Long snapRowId;
    private final SnapServerStatus snapServerStatus;
    private final gcp snapType;
    private final long timestamp;
    private final String type;
    private final String viewerList;

    AutoValue_MessageRecord_WithFriend(long j, long j2, String str, String str2, long j3, Long l, Long l2, byte[] bArr, gcm gcm, MessageClientStatus messageClientStatus, Long l3, String str3, boolean z, String str4, String str5, SnapServerStatus snapServerStatus, SnapServerStatus snapServerStatus2, String str6, yfj yfj, ScreenshottedOrReplayedState screenshottedOrReplayedState, ScreenshottedOrReplayedState screenshottedOrReplayedState2, ReplyMedia replyMedia, gcp gcp, Long l4, FeedKind feedKind, gcj gcj, Integer num, Long l5, long j4) {
        String str7 = str;
        gcj gcj2 = gcj;
        this._id = j;
        this._modifiedTimestamp = j2;
        if (str7 != null) {
            this.key = str7;
            this.type = str2;
            this.timestamp = j3;
            this.seenTimestamp = l;
            this.feedRowId = l2;
            this.content = bArr;
            this.savedStates = gcm;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l3;
            this.feedKey = str3;
            this.released = z;
            this.senderDisplayName = str4;
            this.senderUsername = str5;
            this.snapServerStatus = snapServerStatus;
            this.newSnapServerStatus = snapServerStatus2;
            this.viewerList = str6;
            this.newViewerList = yfj;
            this.screenshotOrReplayed = screenshottedOrReplayedState;
            this.newScreenshotOrReplayed = screenshottedOrReplayedState2;
            this.snapReplyMedia = replyMedia;
            this.snapType = gcp;
            this.snapRowId = l4;
            this.feedKind = feedKind;
            if (gcj2 != null) {
                this.preserved = gcj2;
                this.senderColor = num;
                this.messageRetentionInMinutes = l5;
                this.isSelfConversation = j4;
                return;
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final long _modifiedTimestamp() {
        return this._modifiedTimestamp;
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
        if (obj instanceof WithFriend) {
            WithFriend withFriend = (WithFriend) obj;
            if (this._id == withFriend._id() && this._modifiedTimestamp == withFriend._modifiedTimestamp() && this.key.equals(withFriend.key())) {
                String str = this.type;
                if (str != null ? !str.equals(withFriend.type()) : withFriend.type() != null) {
                    if (this.timestamp == withFriend.timestamp()) {
                        Long l = this.seenTimestamp;
                        if (l != null ? !l.equals(withFriend.seenTimestamp()) : withFriend.seenTimestamp() != null) {
                            l = this.feedRowId;
                            if (l != null ? !l.equals(withFriend.feedRowId()) : withFriend.feedRowId() != null) {
                                if (Arrays.equals(this.content, withFriend instanceof AutoValue_MessageRecord_WithFriend ? ((AutoValue_MessageRecord_WithFriend) withFriend).content : withFriend.content())) {
                                    gcm gcm = this.savedStates;
                                    if (gcm != null ? !gcm.equals(withFriend.savedStates()) : withFriend.savedStates() != null) {
                                        MessageClientStatus messageClientStatus = this.clientStatus;
                                        if (messageClientStatus != null ? !messageClientStatus.equals(withFriend.clientStatus()) : withFriend.clientStatus() != null) {
                                            l = this.sequenceNumber;
                                            if (l != null ? !l.equals(withFriend.sequenceNumber()) : withFriend.sequenceNumber() != null) {
                                                str = this.feedKey;
                                                if (str != null ? !str.equals(withFriend.feedKey()) : withFriend.feedKey() != null) {
                                                    if (this.released == withFriend.released()) {
                                                        str = this.senderDisplayName;
                                                        if (str != null ? !str.equals(withFriend.senderDisplayName()) : withFriend.senderDisplayName() != null) {
                                                            str = this.senderUsername;
                                                            if (str != null ? !str.equals(withFriend.senderUsername()) : withFriend.senderUsername() != null) {
                                                                SnapServerStatus snapServerStatus = this.snapServerStatus;
                                                                if (snapServerStatus != null ? !snapServerStatus.equals(withFriend.snapServerStatus()) : withFriend.snapServerStatus() != null) {
                                                                    snapServerStatus = this.newSnapServerStatus;
                                                                    if (snapServerStatus != null ? !snapServerStatus.equals(withFriend.newSnapServerStatus()) : withFriend.newSnapServerStatus() != null) {
                                                                        str = this.viewerList;
                                                                        if (str != null ? !str.equals(withFriend.viewerList()) : withFriend.viewerList() != null) {
                                                                            yfj yfj = this.newViewerList;
                                                                            if (yfj != null ? !yfj.equals(withFriend.newViewerList()) : withFriend.newViewerList() != null) {
                                                                                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshotOrReplayed;
                                                                                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(withFriend.screenshotOrReplayed()) : withFriend.screenshotOrReplayed() != null) {
                                                                                    screenshottedOrReplayedState = this.newScreenshotOrReplayed;
                                                                                    if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(withFriend.newScreenshotOrReplayed()) : withFriend.newScreenshotOrReplayed() != null) {
                                                                                        ReplyMedia replyMedia = this.snapReplyMedia;
                                                                                        if (replyMedia != null ? !replyMedia.equals(withFriend.snapReplyMedia()) : withFriend.snapReplyMedia() != null) {
                                                                                            gcp gcp = this.snapType;
                                                                                            if (gcp != null ? !gcp.equals(withFriend.snapType()) : withFriend.snapType() != null) {
                                                                                                l = this.snapRowId;
                                                                                                if (l != null ? !l.equals(withFriend.snapRowId()) : withFriend.snapRowId() != null) {
                                                                                                    FeedKind feedKind = this.feedKind;
                                                                                                    if (feedKind != null ? !feedKind.equals(withFriend.feedKind()) : withFriend.feedKind() != null) {
                                                                                                        if (this.preserved.equals(withFriend.preserved())) {
                                                                                                            Integer num = this.senderColor;
                                                                                                            if (num != null ? !num.equals(withFriend.senderColor()) : withFriend.senderColor() != null) {
                                                                                                                l = this.messageRetentionInMinutes;
                                                                                                                if (l != null ? !l.equals(withFriend.messageRetentionInMinutes()) : withFriend.messageRetentionInMinutes() != null) {
                                                                                                                    if (this.isSelfConversation == withFriend.isSelfConversation()) {
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this._modifiedTimestamp;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.type;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.timestamp;
        i = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l = this.seenTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.feedRowId;
        i = (((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003;
        gcm gcm = this.savedStates;
        i = (i ^ (gcm == null ? 0 : gcm.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        l = this.sequenceNumber;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.feedKey;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        str = this.senderDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.senderUsername;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        i = (i ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        snapServerStatus = this.newSnapServerStatus;
        i = (i ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        str = this.viewerList;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        yfj yfj = this.newViewerList;
        i = (i ^ (yfj == null ? 0 : yfj.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshotOrReplayed;
        i = (i ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        screenshottedOrReplayedState = this.newScreenshotOrReplayed;
        i = (i ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        ReplyMedia replyMedia = this.snapReplyMedia;
        i = (i ^ (replyMedia == null ? 0 : replyMedia.hashCode())) * 1000003;
        gcp gcp = this.snapType;
        i = (i ^ (gcp == null ? 0 : gcp.hashCode())) * 1000003;
        l = this.snapRowId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        FeedKind feedKind = this.feedKind;
        i = (((i ^ (feedKind == null ? 0 : feedKind.hashCode())) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        Integer num = this.senderColor;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        l = this.messageRetentionInMinutes;
        if (l != null) {
            i2 = l.hashCode();
        }
        i = (i ^ i2) * 1000003;
        j2 = this.isSelfConversation;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final long isSelfConversation() {
        return this.isSelfConversation;
    }

    public final String key() {
        return this.key;
    }

    public final Long messageRetentionInMinutes() {
        return this.messageRetentionInMinutes;
    }

    public final ScreenshottedOrReplayedState newScreenshotOrReplayed() {
        return this.newScreenshotOrReplayed;
    }

    public final SnapServerStatus newSnapServerStatus() {
        return this.newSnapServerStatus;
    }

    public final yfj newViewerList() {
        return this.newViewerList;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final boolean released() {
        return this.released;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final ScreenshottedOrReplayedState screenshotOrReplayed() {
        return this.screenshotOrReplayed;
    }

    public final Long seenTimestamp() {
        return this.seenTimestamp;
    }

    public final Integer senderColor() {
        return this.senderColor;
    }

    public final String senderDisplayName() {
        return this.senderDisplayName;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final ReplyMedia snapReplyMedia() {
        return this.snapReplyMedia;
    }

    public final Long snapRowId() {
        return this.snapRowId;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String type() {
        return this.type;
    }

    public final String viewerList() {
        return this.viewerList;
    }
}
