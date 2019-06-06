package com.snap.core.db.record;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.record.MessagingSnapModel.GetAllMessagingSnapsModel;
import com.snap.core.db.record.MessagingSnapRecord.DirectSnapInfo;
import com.snap.core.db.record.MessagingSnapRecord.DirectSnapsOlderThanTimestamp;
import com.snap.core.db.record.MessagingSnapRecord.GroupSnapsOlderThanTimestamp;
import com.snap.core.db.record.MessagingSnapRecord.LastReceivedSnap;
import com.snap.core.db.record.MessagingSnapRecord.LastSentSnap;
import com.snap.core.db.record.MessagingSnapRecord.PlayableRecord;
import com.snap.core.db.record.MessagingSnapRecord.PlayableSnap;
import com.snap.core.db.record.MessagingSnapRecord.ReplyMediaInfo;
import com.snap.core.db.record.MessagingSnapRecord.SnapDump;
import com.snap.core.db.record.MessagingSnapRecord.SnapIdInfo;
import com.snap.core.db.record.MessagingSnapRecord.SnapInfo;
import com.snap.core.db.record.MessagingSnapRecord.SnapInfoBySnapRowID;
import com.snap.core.db.record.MessagingSnapRecord.SnapMetaData;
import com.snap.core.db.record.MessagingSnapRecord.SnapOperaChromeInfo;
import com.snap.core.db.record.MessagingSnapRecord.SnapStateInfo;
import com.snap.core.db.record.MessagingSnapRecord.SnapsForFeed;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ajdp;

public class LegacyMessagingSnapQueries {
    public static final ainw<DirectSnapsOlderThanTimestamp> DIRECT_SNAPS_OLDER_THAN_TIMESTAMP_ROW_MAPPER = MessagingSnapRecord.FACTORY.getDirectSnapsOlderThanTimestampMapper(-$$Lambda$BFu6QAhBeEfUUlSMoU9k9lUhNQ0.INSTANCE);
    public static final ainw<DirectSnapInfo> DOWNLOAD_INFO_FOR_DIRECT_SNAP_MAPPER = MessagingSnapRecord.FACTORY.getDownloadInfoForDirectSnapsMapper(-$$Lambda$UmkHE3CbmM-YMAMyNVQ-TyLTdWs.INSTANCE);
    public static final ainw<GetAllMessagingSnapsModel> GET_ALL_MESSAGING_SNAPS_LIMT_100_ROW_MAPPER = MessagingSnapRecord.FACTORY.getAllMessagingSnapsMapper(-$$Lambda$WD3cI3S1OnOjNv9MNLhCyFQ761A.INSTANCE, FeedRecord.FACTORY, SnapRecord.FACTORY, MessageRecord.FACTORY);
    public static final ainw<SnapsForFeed> GET_SNAPS = MessagingSnapRecord.FACTORY.getSnapsForFeedMapper(-$$Lambda$sDj-C8Y6omJ7z3oF44xf-svvp8A.INSTANCE);
    public static final ainw<GroupSnapsOlderThanTimestamp> GROUP_SNAPS_OLDER_THAN_TIMESTAMP_ROW_MAPPER = MessagingSnapRecord.FACTORY.getGroupSnapsOlderThanTimestampMapper(-$$Lambda$k2ID6nhQodUuH35RA-A-_zRtoeI.INSTANCE);
    public static final ainw<LastReceivedSnap> LAST_RECEIVED_SNAP_ROW_MAPPER = MessagingSnapRecord.FACTORY.getLastReceivedSnapMapper(-$$Lambda$R-KsfOmJ1DNzcez9ucrtFjwakmk.INSTANCE, SnapRecord.FACTORY);
    public static final ainw<LastSentSnap> LAST_SENT_SNAP_ROW_MAPPER = MessagingSnapRecord.FACTORY.getLastSentSnapMapper(-$$Lambda$cTc1QdnsJgCSs4SUto8m_nQ4k2o.INSTANCE, SnapRecord.FACTORY, FriendRecord.FACTORY);
    public static final ainw<ReplyMediaInfo> REPLY_MEDIA_INFO_FOR_ID_MAPPER = MessagingSnapRecord.FACTORY.getReplyMediaInfoForSnapRowIdMapper(-$$Lambda$ErYPYrW6NXH5wxvGt1hAX1SNOpI.INSTANCE);
    public static final ainw<SnapIdInfo> SELECT_MSG_INFO_FOR_MESSAGE_MAPPER = MessagingSnapRecord.FACTORY.getSnapIdInfoForMessageIdMapper(-$$Lambda$6wT-CGctWv1ZMbTJu2xQPE89R64.INSTANCE);
    public static final ainw<PlayableSnap> SELECT_PLAYABLE_SNAP_BY_ID = MessagingSnapRecord.FACTORY.getPlayableSnapsByMessageRowIdMapper(-$$Lambda$UA-mARlsghCRQmxjYSs_Y_noD6U.INSTANCE, SnapRecord.FACTORY, FeedRecord.FACTORY);
    public static final ainw<PlayableRecord> SELECT_SNAP_FOR_FEED_MAPPER = MessagingSnapRecord.FACTORY.getPlayablePendingSnapsForFeedMapper(-$$Lambda$ONN1pNAoxfnqJ8AZ0akhnqTS_K4.INSTANCE, FeedRecord.FACTORY, SnapRecord.FACTORY);
    public static final ainw<SnapInfoBySnapRowID> SELECT_SNAP_INFO_BY_SNAP_ROW_ID_MAPPER = MessagingSnapRecord.FACTORY.getSnapInfoBySnapRowIDMapper(-$$Lambda$LY15aewJPsujrNSFMVoKKj69VAA.INSTANCE);
    public static final ainw<SnapInfo> SELECT_SNAP_INFO_FOR_MESSAGE_MAPPER = MessagingSnapRecord.FACTORY.getSnapInfoForIdMapper(-$$Lambda$AjPA_gZ_D9c5RmulYMQD2O9Z3lI.INSTANCE, SnapRecord.FACTORY);
    public static final ainw<SnapMetaData> SELECT_SNAP_METADATA_FOR_SNAPID_MAPPER = MessagingSnapRecord.FACTORY.getSnapMetadataForSnapIdMapper(-$$Lambda$H3kmekC-vWQF73QwNGN4h2Dfgkw.INSTANCE, SnapRecord.FACTORY, FeedRecord.FACTORY);
    public static final ainw<Long> SEQUENCE_NUMBE_BY_MESSAGE_ID_MAPPER = MessageRecord.FACTORY.getSequenceNumberByMessageIdMapper();
    public static final ainw<SnapDump> SNAP_DUMP_ROW_MAPPER = MessagingSnapRecord.FACTORY.snapDumpMapper(-$$Lambda$bhQuSJz4GRPn_AHZjxdIG2rW5do.INSTANCE, SnapRecord.FACTORY);
    public static final ainw<SnapOperaChromeInfo> SNAP_OPERA_CHROME_INFO_MAPPER = MessagingSnapRecord.FACTORY.getDirectSnapInfoBySnapRowIDMapper(-$$Lambda$G0zPCyj2OVciZ9A1t6jtEUb9F2s.INSTANCE, SnapRecord.FACTORY, FeedRecord.FACTORY);
    public static final ainw<SnapStateInfo> SNAP_STATE_INFO_MAPPER = MessagingSnapRecord.FACTORY.getGroupSnapInfoMapper(-$$Lambda$-Qlgc1WAbhR-KOvNgw57IYuZacw.INSTANCE);

    public static ajdp<ReplyMediaInfo> getReplyMediaInfoById(DbClient dbClient, long j) {
        ainx replyMediaInfoForSnapRowId = MessagingSnapRecord.FACTORY.getReplyMediaInfoForSnapRowId(j);
        ainw ainw = REPLY_MEDIA_INFO_FOR_ID_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOne(replyMediaInfoForSnapRowId, new -$$Lambda$zZjWJZzVDi3g8a3tdqKnFyWi5bI(ainw));
    }
}
