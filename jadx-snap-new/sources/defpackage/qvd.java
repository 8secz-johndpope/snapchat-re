package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Lists;
import com.snap.core.db.BaseRepository;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FeedSeenSequenceNumbers;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.column.UpdateStatus;
import com.snap.core.db.record.FeedItemSyncStateModel.InsertOrReplaceValue;
import com.snap.core.db.record.FeedMemberModel.InsertFormerMember;
import com.snap.core.db.record.FeedMemberModel.InsertMember;
import com.snap.core.db.record.FeedMemberModel.UpdateJoinedTimestamp;
import com.snap.core.db.record.FeedMemberModel.UpdateMember;
import com.snap.core.db.record.FeedMemberRecord;
import com.snap.core.db.record.FeedMemberRecord.AllParticipants;
import com.snap.core.db.record.FeedMemberRecord.ForFeed;
import com.snap.core.db.record.FeedMemberRecord.GroupInfo;
import com.snap.core.db.record.FeedModel.DeleteConversation;
import com.snap.core.db.record.FeedModel.IncrementStorySkipCount;
import com.snap.core.db.record.FeedModel.InsertConversation;
import com.snap.core.db.record.FeedModel.InsertGroup;
import com.snap.core.db.record.FeedModel.ResetStorySkipCount;
import com.snap.core.db.record.FeedModel.SetCognacNotificationMuted;
import com.snap.core.db.record.FeedModel.SetGroupStoryMuted;
import com.snap.core.db.record.FeedModel.SetMessageRetentionInMinutes;
import com.snap.core.db.record.FeedModel.SetNotificationMuted;
import com.snap.core.db.record.FeedModel.UpdateClearedTimestampIfMoreRecent;
import com.snap.core.db.record.FeedModel.UpdateConversation;
import com.snap.core.db.record.FeedModel.UpdateConversationReader;
import com.snap.core.db.record.FeedModel.UpdateConversationWriter;
import com.snap.core.db.record.FeedModel.UpdateGroup;
import com.snap.core.db.record.FeedModel.UpdateGroupDisplayName;
import com.snap.core.db.record.FeedModel.UpdateGroupSyncContentType;
import com.snap.core.db.record.FeedModel.UpdateLatestInteractionTimestampIfMoreRecent;
import com.snap.core.db.record.FeedModel.UpdateParticipantString;
import com.snap.core.db.record.FeedModel.UpdateReceivedReleaseTimestampIfMoreRecent;
import com.snap.core.db.record.FeedRecord;
import com.snap.core.db.record.FeedRecord.AvatarInfo;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import com.snap.core.db.record.FeedRecord.ConversationState;
import com.snap.core.db.record.FeedSyncStateModel.DeleteValue;
import com.snap.core.db.record.FeedSyncStateModel.InsertValue;
import com.snap.core.db.record.FeedSyncStateModel.UpdateValue;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.FriendRecord.DisplayName;
import com.snap.core.db.record.LegacyFeedMemberQueries;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.LegacyMessagingSnapQueries;
import com.snap.core.db.record.MessageModel.ClearAllMessages;
import com.snap.core.db.record.MessageModel.ClearMessagesForFeed;
import com.snap.core.db.record.MessageModel.DeleteFailedMessagesNotInConveration;
import com.snap.core.db.record.MessageModel.DeleteMessageForKey;
import com.snap.core.db.record.MessageModel.DeleteMessageFromConversationWithStatus;
import com.snap.core.db.record.MessageModel.GetBasicInfoForMessageModel;
import com.snap.core.db.record.MessageModel.GetSnapInfoWithContentFromMessageByMessageIdModel;
import com.snap.core.db.record.MessageModel.GetSnapsOlderThanTimestampModel;
import com.snap.core.db.record.MessageModel.InsertBasic;
import com.snap.core.db.record.MessageModel.InsertContent;
import com.snap.core.db.record.MessageModel.InsertMedia;
import com.snap.core.db.record.MessageModel.SetClientStatusForMessages;
import com.snap.core.db.record.MessageModel.UpdateMessageClientStatus;
import com.snap.core.db.record.MessageModel.UpdateMessageFromServer;
import com.snap.core.db.record.MessageModel.UpdatePreservationState;
import com.snap.core.db.record.MessageModel.UpdateSaveState;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.BasicInfoForMessageModel;
import com.snap.core.db.record.MessageRecord.GetContentForMessageModel;
import com.snap.core.db.record.MessageRecord.LastMessage;
import com.snap.core.db.record.MessageRecord.LastMessageWithClientStatus;
import com.snap.core.db.record.MessageRecord.LastReceivedNotViewedChat;
import com.snap.core.db.record.MessageRecord.LastReceivedNotViewedUpdateMessage;
import com.snap.core.db.record.MessageRecord.LastReceivedViewedChat;
import com.snap.core.db.record.MessageRecord.LastSentNotViewedChat;
import com.snap.core.db.record.MessageRecord.LastSentSnapModel;
import com.snap.core.db.record.MessageRecord.LastSentViewedChat;
import com.snap.core.db.record.MessageRecord.MessageDifferentialInfo;
import com.snap.core.db.record.MessageRecord.MessageInfo;
import com.snap.core.db.record.MessageRecord.ReceivedSnapsModel;
import com.snap.core.db.record.MessageRecord.SnapMetadata;
import com.snap.core.db.record.MessageRecord.SnapUpdateInfo;
import com.snap.core.db.record.MessageRecord.SnapUpdateInfoNew;
import com.snap.core.db.record.MessagingSnapModel.ClearBaseSnapsForFeed;
import com.snap.core.db.record.MessagingSnapModel.ClearSnapsForFeed;
import com.snap.core.db.record.MessagingSnapModel.DeleteAllMessagingSnaps;
import com.snap.core.db.record.MessagingSnapModel.DeleteFailedMessagingSnapsNotInConversation;
import com.snap.core.db.record.MessagingSnapModel.DeleteMessagingSnapsFromConversationWithStatus;
import com.snap.core.db.record.MessagingSnapModel.DeleteSnap;
import com.snap.core.db.record.MessagingSnapModel.InsertMessageSnap;
import com.snap.core.db.record.MessagingSnapModel.UpdateSnapScreenshottedReplayByKeyWithoutSuffix;
import com.snap.core.db.record.MessagingSnapModel.UpdateSnapServerStatusById;
import com.snap.core.db.record.MessagingSnapModel.UpdateSnapServerStatusByKey;
import com.snap.core.db.record.MessagingSnapRecord;
import com.snap.core.db.record.MessagingSnapRecord.LastReceivedSnap;
import com.snap.core.db.record.MessagingSnapRecord.LastSentSnap;
import com.snap.core.db.record.MessagingSnapRecord.PlayableRecord;
import com.snap.core.db.record.MessagingSnapRecord.PlayableSnap;
import com.snap.core.db.record.MessagingSnapRecord.SnapMetaData;
import com.snap.core.db.record.MultiRecipientSnapModel.SetDisplayInteractionTypeForMultiRecipientSnaps;
import com.snap.core.db.record.PendingSnapModel.DeletePendingSnap;
import com.snap.core.db.record.PendingSnapModel.InsertPendingSnap;
import com.snap.core.db.record.PendingSnapModel.UpdatePendingSnapUpdateStatus;
import com.snap.core.db.record.PendingSnapRecord;
import com.snap.core.db.record.SeenSequenceNumbersRecord;
import com.snap.core.db.record.SnapModel.DeleteAllMessagingSnapsInSnapTable;
import com.snap.core.db.record.SnapModel.DeleteFailedSnapsNotInConversation;
import com.snap.core.db.record.SnapModel.DeleteSnapMetadata;
import com.snap.core.db.record.SnapModel.DeleteSnapsFromConversationWithStatus;
import com.snap.core.db.record.SnapModel.InsertSnapMetadata;
import com.snap.core.db.record.SnapModel.UpdateFiKeyIvForKey;
import com.snap.core.db.record.SnapRecord;
import com.snap.core.db.record.TalkAuthContextModel.DeleteTalkAuthContext;
import com.snap.core.model.FriendMessageRecipient;
import com.snap.core.model.GroupMessageRecipient;
import defpackage.akgc.d;
import defpackage.gcp.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: qvd */
public class qvd extends BaseRepository {
    private static byte[] a = new byte[0];
    private final Supplier<UpdateSnapScreenshottedReplayByKeyWithoutSuffix> A = new ihx(new -$$Lambda$qvd$kz84NZm4ZKYGsNhSl4Mj9apaPas(this));
    private final Supplier<UpdateValue> B = new ihx(new -$$Lambda$qvd$SxJhkGbXQ3FPzW1sePryDrs5xk4(this));
    private final Supplier<InsertValue> C = new ihx(new -$$Lambda$qvd$SV_S3wyHaKAIGb9BIajpqaX6J_s(this));
    private final Supplier<DeleteValue> D = new ihx(new -$$Lambda$qvd$AN20RgRf2r_SMURt2-OO5kMX65Q(this));
    private final Supplier<InsertPendingSnap> E = new ihx(new -$$Lambda$qvd$BJQgSMBe7vCOUj2tybHa-6jxAqY(this));
    private final Supplier<DeletePendingSnap> F = new ihx(new -$$Lambda$qvd$UtEZH6geFAVHAEK4zjeKNMtKPxA(this));
    private final Supplier<InsertMember> G = new ihx(new -$$Lambda$qvd$Pjx-e-fPXLQmpRA1r4faedcm7ZY(this));
    private final Supplier<UpdateMember> H = new ihx(new -$$Lambda$qvd$cpSH3iqc_YM58y9tuT8sTSs8RnM(this));
    private final Supplier<UpdateJoinedTimestamp> I = new ihx(new -$$Lambda$qvd$U0Gju7MnAINRQXkkf2RcaVvw_9Y(this));
    private final Supplier<InsertFormerMember> J = new ihx(new -$$Lambda$qvd$8euqsehpD985Y33naXD3aJ1lZtw(this));
    private final Supplier<UpdateConversationWriter> K = new ihx(new -$$Lambda$qvd$LJ4lpu7MfmUeFtS1EBJZazBVx-8(this));
    private final Supplier<UpdateConversationReader> L = new ihx(new -$$Lambda$qvd$ETeMM6-0GMujwqgVpMl_kewiN5Y(this));
    private final Supplier<UpdateParticipantString> M = new ihx(new -$$Lambda$qvd$NAatof26PeqVlk4ogoR09JTPqCw(this));
    private final Supplier<UpdateLatestInteractionTimestampIfMoreRecent> N = new ihx(new -$$Lambda$qvd$RfQ37wsTGIa8k-my_zqaKWwHoYM(this));
    private final Supplier<UpdateSnapServerStatusById> O = new ihx(new -$$Lambda$qvd$Wja0X_YlPuRZdRxqqEdNCiaLnwM(this));
    private final Supplier<UpdateClearedTimestampIfMoreRecent> P = new ihx(new -$$Lambda$qvd$ctzQD4dYvPMzBCSoQUsrDuquQNw(this));
    private final Supplier<UpdateReceivedReleaseTimestampIfMoreRecent> Q = new ihx(new -$$Lambda$qvd$4yxs5jAbKiE-BWf5mms2-oGViSc(this));
    private final Supplier<UpdateMessageClientStatus> R = new ihx(new -$$Lambda$qvd$Q9S3i4GU_9msdD3NopfImNBn4Ek(this));
    private final Supplier<UpdateSnapServerStatusByKey> S = new ihx(new -$$Lambda$qvd$10Z3MduVtE4bqEuSNOjTcnGc5zM(this));
    private final Supplier<DeleteMessageForKey> T = new ihx(new -$$Lambda$qvd$Uiyd3XS6w0DsGLaEQAEO6bQTJV0(this));
    private final Supplier<DeleteSnap> U = new ihx(new -$$Lambda$qvd$kYgXPWSfC9-kYfd5ZbIP6XEYALQ(this));
    private final Supplier<DeleteSnapMetadata> V = new ihx(new -$$Lambda$qvd$969Qsxda6g6MRAK0hdSIUniVU1s(this));
    private final Supplier<UpdatePendingSnapUpdateStatus> W = new ihx(new -$$Lambda$qvd$7lRCmtX1-6ToYSTV_rARLVAgbuY(this));
    private final Supplier<UpdatePreservationState> X = new ihx(new -$$Lambda$qvd$3LkCpOfyOabTVuTDiQSskfTbEcM(this));
    private final Supplier<UpdateSaveState> Y = new ihx(new -$$Lambda$qvd$vjTrEct40-V2s1V71HGfVtfqZN4(this));
    private final Supplier<UpdateMessageFromServer> Z = new ihx(new -$$Lambda$qvd$nq0j5QJrcg0a1QC01SVZ7GuD9Aw(this));
    private final Supplier<UpdateFiKeyIvForKey> aa = new ihx(new -$$Lambda$qvd$JpWKu-P3FWeeg3C3mI4D5HE0EB4(this));
    private final Supplier<InsertOrReplaceValue> ab = new ihx(new -$$Lambda$qvd$7W_aYGBXJdGmJz4xcqT_TdEngYM(this));
    private final Supplier<SetClientStatusForMessages> ac = new ihx(new -$$Lambda$qvd$WLdyaY1xWFweHVbTevi8syB7iuY(this));
    private final Supplier<SetDisplayInteractionTypeForMultiRecipientSnaps> ad = new ihx(new -$$Lambda$qvd$g0TuVeGKFirF8rR-gGoblsNuZOU(this));
    private final Supplier<DeleteFailedMessagesNotInConveration> ae = new ihx(new -$$Lambda$qvd$-eubTtBWwTqNo4yJLe91KkRnTvw(this));
    private final Supplier<DeleteFailedMessagingSnapsNotInConversation> af = new ihx(new -$$Lambda$qvd$BIHs5kjTz8dAx06lxyd-qoTdnIg(this));
    private final Supplier<DeleteFailedSnapsNotInConversation> ag = new ihx(new -$$Lambda$qvd$d8eHE928F2WlzOv3bVvc3yP9CHA(this));
    private final Supplier<DeleteMessageFromConversationWithStatus> ah = new ihx(new -$$Lambda$qvd$b3pD5odNK7fTFr78lUzuGw2zmNs(this));
    private final Supplier<DeleteMessagingSnapsFromConversationWithStatus> ai = new ihx(new -$$Lambda$qvd$1y2HhyBbUqhOrS-zltQ-iUKlSVc(this));
    private final Supplier<DeleteSnapsFromConversationWithStatus> aj = new ihx(new -$$Lambda$qvd$rNr4sSx_9a60mKqNGBtT4cNXiB4(this));
    private final Supplier<UpdateGroupSyncContentType> ak = new ihx(new -$$Lambda$qvd$T9eLo0-5slGIIQVLYganZbiGRLI(this));
    private final Supplier<SetCognacNotificationMuted> al = new ihx(new -$$Lambda$qvd$SDW8--a82CaZyuKMWm98RvFtQro(this));
    private final Supplier<SetNotificationMuted> am = new ihx(new -$$Lambda$qvd$qM3HiyVNw8qHsv3B_up8d42pxV8(this));
    private final Supplier<SetMessageRetentionInMinutes> an = new ihx(new -$$Lambda$qvd$XlqMUB64v2xVOGGreFdpqDxeGC8(this));
    private final Supplier<DeleteTalkAuthContext> ao = new ihx(new -$$Lambda$qvd$u2LdaPUxlwbw4FOI8FaIzSaXU9c(this));
    private final Supplier<ClearAllMessages> ap = new ihx(new -$$Lambda$qvd$T5G92B9XD30MsHEG1GzRbGY5iu4(this));
    private final Supplier<DeleteAllMessagingSnaps> aq = new ihx(new -$$Lambda$qvd$Ry63N6jJCX_vAVhBGi5UvPjDhWI(this));
    private final Supplier<DeleteAllMessagingSnapsInSnapTable> ar = new ihx(new -$$Lambda$qvd$Q_Tjew4f_M0RPacqBxUKmkWy7QU(this));
    private final SnapDb b;
    private final DbClient c;
    private final gpb d;
    private final qvs e;
    private final ihh f;
    private final qum g;
    private final qve h = new qve();
    private final gqr i;
    private final Supplier<InsertConversation> j = new ihx(new -$$Lambda$qvd$YPBkwfy3kEoa7BxapQU7m19888k(this));
    private final Supplier<UpdateConversation> k = new ihx(new -$$Lambda$qvd$lEYBTfNw4Cwmmx17RBd4uRpxHCE(this));
    private final Supplier<DeleteConversation> l = new ihx(new -$$Lambda$qvd$MnztKe5XXoXGSPrna2wpjv_wjc8(this));
    private final Supplier<InsertGroup> m = new ihx(new -$$Lambda$qvd$rAo2xMNglGfhh7MF84PpKpFjzbc(this));
    private final Supplier<UpdateGroup> n = new ihx(new -$$Lambda$qvd$oImThRIBbLNZOTEDrXS3bJyV7Ow(this));
    private final Supplier<UpdateGroupDisplayName> o = new ihx(new -$$Lambda$qvd$zKkuU4optZM8JV78UaFZ0-bvxL0(this));
    private final Supplier<SetGroupStoryMuted> p = new ihx(new -$$Lambda$qvd$YUifJkgkK3-ZOczHHlTjGxjAVGU(this));
    private final Supplier<IncrementStorySkipCount> q = new ihx(new -$$Lambda$qvd$otki6OpgSCZ2dz4XckB7G_xKL-c(this));
    private final Supplier<ResetStorySkipCount> r = new ihx(new -$$Lambda$qvd$HXHznsHT67pUTd4TL5EeMIw6R6w(this));
    private final Supplier<InsertContent> s = new ihx(new -$$Lambda$qvd$3kFvmDfVarOt01yznL2a9rap5iA(this));
    private final Supplier<InsertMedia> t = new ihx(new -$$Lambda$qvd$BYQLOpA10jSG_II6vsmU1HWLTWI(this));
    private final Supplier<InsertBasic> u = new ihx(new -$$Lambda$qvd$IEQnC0JLYZrpr7PO_7dm20kYlSg(this));
    private final Supplier<InsertMessageSnap> v = new ihx(new -$$Lambda$qvd$r8kq1zDdXxYu_VjUhtyex8ymkr4(this));
    private final Supplier<InsertSnapMetadata> w = new ihx(new -$$Lambda$qvd$HKvjRq43S0O2yISE0Jf0spOZqhU(this));
    private final Supplier<ClearMessagesForFeed> x = new ihx(new -$$Lambda$qvd$ss76YSuobOSK_OWap_u8gKk7lO0(this));
    private final Supplier<ClearSnapsForFeed> y = new ihx(new -$$Lambda$qvd$Hz08_mgcZj9Pkkr_SKPVeDoJlMQ(this));
    private final Supplier<ClearBaseSnapsForFeed> z = new ihx(new -$$Lambda$qvd$P_8uflIoNjyAQyXAdWO6e7CbCEo(this));

    public qvd(SnapDb snapDb, gpb gpb, qvs qvs, ihh ihh, qum qum, gqr gqr) {
        super(pry.a, snapDb);
        this.b = snapDb;
        this.d = gpb;
        this.e = qvs;
        this.c = snapDb.getDbClient(pry.a.callsite("MessagingRepository"));
        this.f = ihh;
        this.g = qum;
        this.i = gqr;
    }

    private /* synthetic */ DeleteSnap A() {
        return new DeleteSnap(c());
    }

    private /* synthetic */ DeleteMessageForKey B() {
        return new DeleteMessageForKey(c());
    }

    private /* synthetic */ UpdateSnapServerStatusByKey C() {
        return new UpdateSnapServerStatusByKey(c(), MessagingSnapRecord.FACTORY);
    }

    private /* synthetic */ UpdateMessageClientStatus D() {
        return new UpdateMessageClientStatus(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ UpdateReceivedReleaseTimestampIfMoreRecent E() {
        return new UpdateReceivedReleaseTimestampIfMoreRecent(c());
    }

    private /* synthetic */ UpdateClearedTimestampIfMoreRecent F() {
        return new UpdateClearedTimestampIfMoreRecent(c());
    }

    private /* synthetic */ UpdateSnapServerStatusById G() {
        return new UpdateSnapServerStatusById(c(), MessagingSnapRecord.FACTORY);
    }

    private /* synthetic */ UpdateLatestInteractionTimestampIfMoreRecent H() {
        return new UpdateLatestInteractionTimestampIfMoreRecent(c());
    }

    private /* synthetic */ UpdateParticipantString I() {
        return new UpdateParticipantString(c());
    }

    private /* synthetic */ UpdateConversationReader J() {
        return new UpdateConversationReader(c());
    }

    private /* synthetic */ UpdateConversationWriter K() {
        return new UpdateConversationWriter(c(), FeedRecord.FACTORY);
    }

    private /* synthetic */ InsertFormerMember L() {
        return new InsertFormerMember(c());
    }

    private /* synthetic */ UpdateJoinedTimestamp M() {
        return new UpdateJoinedTimestamp(c());
    }

    private /* synthetic */ UpdateMember N() {
        return new UpdateMember(c());
    }

    private /* synthetic */ InsertMember O() {
        return new InsertMember(c());
    }

    private /* synthetic */ DeletePendingSnap P() {
        return new DeletePendingSnap(c(), MessagingSnapRecord.FACTORY);
    }

    private /* synthetic */ InsertPendingSnap Q() {
        return new InsertPendingSnap(c(), PendingSnapRecord.FACTORY);
    }

    private /* synthetic */ DeleteValue R() {
        return new DeleteValue(c());
    }

    private /* synthetic */ InsertValue S() {
        return new InsertValue(c());
    }

    private /* synthetic */ UpdateValue T() {
        return new UpdateValue(c());
    }

    private /* synthetic */ UpdateSnapScreenshottedReplayByKeyWithoutSuffix U() {
        return new UpdateSnapScreenshottedReplayByKeyWithoutSuffix(c(), MessagingSnapRecord.FACTORY);
    }

    private /* synthetic */ ClearBaseSnapsForFeed V() {
        return new ClearBaseSnapsForFeed(c());
    }

    private /* synthetic */ ClearSnapsForFeed W() {
        return new ClearSnapsForFeed(c());
    }

    private /* synthetic */ ClearMessagesForFeed X() {
        return new ClearMessagesForFeed(c());
    }

    private /* synthetic */ InsertSnapMetadata Y() {
        return new InsertSnapMetadata(c(), SnapRecord.FACTORY);
    }

    private /* synthetic */ InsertMessageSnap Z() {
        return new InsertMessageSnap(c(), MessagingSnapRecord.FACTORY);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cb  */
    private long a(defpackage.ahaz r34, java.lang.String r35, com.snap.core.db.api.DbTransaction r36) {
        /*
        r33 = this;
        r1 = r33;
        r0 = r34;
        r2 = r36;
        r3 = r1.b;
        r3.throwIfNotDbScheduler();
        r3 = r0.a;	 Catch:{ all -> 0x0155 }
        r4 = r1.g;	 Catch:{ all -> 0x0155 }
        r4 = r4.b(r3);	 Catch:{ all -> 0x0155 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0155 }
        r5 = r0.g;	 Catch:{ all -> 0x0155 }
        if (r5 == 0) goto L_0x002e;
    L_0x001b:
        r5 = r0.g;	 Catch:{ all -> 0x0155 }
        r5 = r5.longValue();	 Catch:{ all -> 0x0155 }
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x002e;
    L_0x0027:
        r5 = r0.g;	 Catch:{ all -> 0x0155 }
        r5 = r5.longValue();	 Catch:{ all -> 0x0155 }
        goto L_0x0034;
    L_0x002e:
        r5 = r1.f;	 Catch:{ all -> 0x0155 }
        r5 = r5.a();	 Catch:{ all -> 0x0155 }
    L_0x0034:
        r8 = r5;
        r5 = r4.longValue();	 Catch:{ all -> 0x0155 }
        r10 = -1;
        r15 = 0;
        r14 = 1;
        r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r7 == 0) goto L_0x00f7;
    L_0x0041:
        r5 = r1.n;	 Catch:{ all -> 0x0155 }
        r5 = r5.get();	 Catch:{ all -> 0x0155 }
        r5 = (com.snap.core.db.record.FeedModel.UpdateGroup) r5;	 Catch:{ all -> 0x0155 }
        r6 = r0.b;	 Catch:{ all -> 0x0155 }
        r10 = r6.a;	 Catch:{ all -> 0x0155 }
        r11 = r0.l;	 Catch:{ all -> 0x0155 }
        r6 = r0.E;	 Catch:{ all -> 0x0155 }
        r6 = defpackage.abpp.a(r6);	 Catch:{ all -> 0x0155 }
        r12 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x0155 }
        r6 = r0.y;	 Catch:{ all -> 0x0155 }
        r13 = defpackage.abpp.a(r6);	 Catch:{ all -> 0x0155 }
        r6 = r0.a;	 Catch:{ all -> 0x0155 }
        r7 = r0.D;	 Catch:{ all -> 0x0155 }
        r16 = r4.longValue();	 Catch:{ all -> 0x0155 }
        r18 = r7;
        r7 = r5;
        r14 = r6;
        r6 = 0;
        r15 = r18;
        r7.bind(r8, r10, r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x0155 }
        r7 = r1.c;	 Catch:{ all -> 0x0155 }
        r7.executeUpdateDelete(r5, r2);	 Catch:{ all -> 0x0155 }
        r2 = r0.m;	 Catch:{ all -> 0x0155 }
        r2 = defpackage.ahbc.a(r2);	 Catch:{ all -> 0x0155 }
        r5 = defpackage.ahbc.DELTA;	 Catch:{ all -> 0x0155 }
        r2 = r2.equals(r5);	 Catch:{ all -> 0x0155 }
        if (r2 != 0) goto L_0x0092;
    L_0x0084:
        r2 = r0.m;	 Catch:{ all -> 0x0155 }
        r2 = defpackage.ahbc.a(r2);	 Catch:{ all -> 0x0155 }
        r5 = defpackage.ahbc.FULL;	 Catch:{ all -> 0x0155 }
        r2 = r2.equals(r5);	 Catch:{ all -> 0x0155 }
        if (r2 == 0) goto L_0x00e5;
    L_0x0092:
        r2 = r1.c;	 Catch:{ all -> 0x0155 }
        r5 = com.snap.core.db.record.FeedRecord.FACTORY;	 Catch:{ all -> 0x0155 }
        r7 = r4.longValue();	 Catch:{ all -> 0x0155 }
        r5 = r5.getGroupSyncContentType(r7);	 Catch:{ all -> 0x0155 }
        r7 = com.snap.core.db.record.FeedRecord.FACTORY;	 Catch:{ all -> 0x0155 }
        r7 = r7.getGroupSyncContentTypeMapper();	 Catch:{ all -> 0x0155 }
        r2 = r2.queryFirst(r5, r7);	 Catch:{ all -> 0x0155 }
        r2 = (defpackage.gcg) r2;	 Catch:{ all -> 0x0155 }
        r5 = r0.m;	 Catch:{ all -> 0x0155 }
        if (r2 == 0) goto L_0x00c7;
    L_0x00ae:
        if (r5 != 0) goto L_0x00b6;
    L_0x00b0:
        r5 = defpackage.ahbc.NONE;	 Catch:{ all -> 0x0155 }
        r5 = r5.a();	 Catch:{ all -> 0x0155 }
    L_0x00b6:
        r5 = defpackage.gch.a(r5);	 Catch:{ all -> 0x0155 }
        r5 = r5.getIntValue();	 Catch:{ all -> 0x0155 }
        r2 = r2.getIntValue();	 Catch:{ all -> 0x0155 }
        if (r5 > r2) goto L_0x00c7;
    L_0x00c4:
        r19 = 0;
        goto L_0x00c9;
    L_0x00c7:
        r19 = 1;
    L_0x00c9:
        if (r19 == 0) goto L_0x00e5;
    L_0x00cb:
        r2 = r1.ak;	 Catch:{ all -> 0x0155 }
        r2 = r2.get();	 Catch:{ all -> 0x0155 }
        r2 = (com.snap.core.db.record.FeedModel.UpdateGroupSyncContentType) r2;	 Catch:{ all -> 0x0155 }
        r5 = r0.m;	 Catch:{ all -> 0x0155 }
        r5 = defpackage.gch.a(r5);	 Catch:{ all -> 0x0155 }
        r6 = r4.longValue();	 Catch:{ all -> 0x0155 }
        r2.bind(r5, r6);	 Catch:{ all -> 0x0155 }
        r5 = r1.c;	 Catch:{ all -> 0x0155 }
        r5.executeUpdateDelete(r2);	 Catch:{ all -> 0x0155 }
    L_0x00e5:
        r0 = r0.a;	 Catch:{ all -> 0x0155 }
        r0 = r3.equals(r0);	 Catch:{ all -> 0x0155 }
        if (r0 != 0) goto L_0x00f2;
    L_0x00ed:
        r0 = r1.g;	 Catch:{ all -> 0x0155 }
        r0.c(r3);	 Catch:{ all -> 0x0155 }
    L_0x00f2:
        r2 = r4.longValue();	 Catch:{ all -> 0x0155 }
        return r2;
    L_0x00f7:
        r6 = 0;
        r3 = r1.m;	 Catch:{ all -> 0x0155 }
        r3 = r3.get();	 Catch:{ all -> 0x0155 }
        r3 = (com.snap.core.db.record.FeedModel.InsertGroup) r3;	 Catch:{ all -> 0x0155 }
        r4 = r0.a;	 Catch:{ all -> 0x0155 }
        r5 = r0.b;	 Catch:{ all -> 0x0155 }
        r5 = r5.a;	 Catch:{ all -> 0x0155 }
        r23 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0155 }
        r7 = r0.l;	 Catch:{ all -> 0x0155 }
        r8 = r0.E;	 Catch:{ all -> 0x0155 }
        r8 = defpackage.abpp.a(r8);	 Catch:{ all -> 0x0155 }
        r25 = java.lang.Boolean.valueOf(r8);	 Catch:{ all -> 0x0155 }
        r8 = r0.y;	 Catch:{ all -> 0x0155 }
        r26 = defpackage.abpp.a(r8);	 Catch:{ all -> 0x0155 }
        r8 = r0.m;	 Catch:{ all -> 0x0155 }
        r27 = defpackage.gch.a(r8);	 Catch:{ all -> 0x0155 }
        r8 = r0.s;	 Catch:{ all -> 0x0155 }
        r9 = 1;
        r8 = defpackage.abpp.a(r8, r9);	 Catch:{ all -> 0x0155 }
        if (r8 != 0) goto L_0x012c;
    L_0x012b:
        goto L_0x012d;
    L_0x012c:
        r9 = 0;
    L_0x012d:
        r28 = java.lang.Boolean.valueOf(r9);	 Catch:{ all -> 0x0155 }
        r8 = r0.K;	 Catch:{ all -> 0x0155 }
        r29 = defpackage.abpp.a(r8, r6);	 Catch:{ all -> 0x0155 }
        r6 = r0.a;	 Catch:{ all -> 0x0155 }
        r8 = r0.D;	 Catch:{ all -> 0x0155 }
        r0 = r0.f;	 Catch:{ all -> 0x0155 }
        r20 = r3;
        r21 = r4;
        r22 = r5;
        r24 = r7;
        r30 = r6;
        r31 = r8;
        r32 = r0;
        r20.bind(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);	 Catch:{ all -> 0x0155 }
        r0 = r1.c;	 Catch:{ all -> 0x0155 }
        r2 = r0.executeInsert(r3, r2);	 Catch:{ all -> 0x0155 }
        return r2;
    L_0x0155:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.a(ahaz, java.lang.String, com.snap.core.db.api.DbTransaction):long");
    }

    private void a(aenb aenb, long j, long j2, long j3, DbTransaction dbTransaction) {
        long longValue;
        aenb aenb2 = aenb;
        DbTransaction dbTransaction2 = dbTransaction;
        String str = null;
        Boolean bool = (aenb2.g == null || aenb2.g.intValue() == 0) ? null : Boolean.TRUE;
        String a = qwh.a(aenb2.O);
        SnapServerStatus parseFromSnap = SnapServerStatus.parseFromSnap(aenb);
        String a2 = (TextUtils.isEmpty(aenb2.a) || SnapServerStatus.hasBeenOpened(parseFromSnap)) ? aenb2.E : this.e.a(a, aenb2.w, aenb2.M, aenb2.I, aenb2.C, aenb2.E);
        String str2 = a2;
        InsertSnapMetadata insertSnapMetadata = (InsertSnapMetadata) this.w.get();
        String c = aenb2.W != null ? qvd.c(aenb2.W.k) : null;
        if (aenb2.W != null) {
            str = qvd.d(aenb2.W.k);
        }
        String str3 = str;
        InsertSnapMetadata insertSnapMetadata2 = insertSnapMetadata;
        String str4 = a;
        insertSnapMetadata2.bind(str4, aenb2.S.longValue(), a, aenb2.F, str2, a.a(aenb2.Q), aenb2.h, qwd.b(aenb), aenb2.T, "SNAP", qwd.a(aenb), c, str3);
        long executeInsert = this.c.executeInsert(insertSnapMetadata, dbTransaction2);
        if (executeInsert == -1) {
            ieg.a("There is corrupted Data in snap table. Please Shake to Report.", true, 0);
            longValue = ((Long) MoreObjects.firstNonNull(c(a), Long.valueOf(-1))).longValue();
        } else {
            longValue = executeInsert;
        }
        InsertMessageSnap insertMessageSnap = (InsertMessageSnap) this.v.get();
        aesg aesg = aenb2.N;
        if (aenb2.h != null) {
            aesg = new aesg();
            aesg.a = aenb2.h;
            aesg.b = Long.valueOf(Long.MAX_VALUE);
            a2 = "";
            aesg.d = a2;
            aesg.c = a2;
        }
        insertMessageSnap.bind(longValue, j3, Long.valueOf(j), parseFromSnap, aenb2.S, aenb2.U, aenb2.V, aenb2.X, Long.valueOf(j2), bool, aenb2.l, aenb2.k, aenb2.i, qvd.b(aenb2.Y), GeofilterMetadata.fromSnapMetadata(aenb2.W), SnappableLensMetadata.fromSnapMetadata(aenb2.W), aesg);
        Long.valueOf(this.c.executeInsert(insertMessageSnap, dbTransaction2));
        InsertOrReplaceValue insertOrReplaceValue = (InsertOrReplaceValue) this.ab.get();
        insertOrReplaceValue.bind(j);
        Long.valueOf(this.c.executeInsert(insertOrReplaceValue, dbTransaction2));
    }

    private void a(String str, Integer num, Boolean bool, String str2, Map<String, ahqf> map, String str3) {
        this.b.throwIfNotDbScheduler();
        ((UpdateFiKeyIvForKey) this.aa.get()).bind(this.e.a(str, num, bool, str2, map, str3), qwh.a(str));
        this.c.executeUpdateDelete((ainy) this.aa.get());
    }

    private /* synthetic */ InsertBasic aa() {
        return new InsertBasic(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ InsertMedia ab() {
        return new InsertMedia(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ InsertContent ac() {
        return new InsertContent(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ ResetStorySkipCount ad() {
        return new ResetStorySkipCount(c());
    }

    private /* synthetic */ IncrementStorySkipCount ae() {
        return new IncrementStorySkipCount(c());
    }

    private /* synthetic */ SetGroupStoryMuted af() {
        return new SetGroupStoryMuted(c());
    }

    private /* synthetic */ UpdateGroupDisplayName ag() {
        return new UpdateGroupDisplayName(c());
    }

    private /* synthetic */ UpdateGroup ah() {
        return new UpdateGroup(c());
    }

    private /* synthetic */ InsertGroup ai() {
        return new InsertGroup(c(), FeedRecord.FACTORY);
    }

    private /* synthetic */ DeleteConversation aj() {
        return new DeleteConversation(c());
    }

    private /* synthetic */ UpdateConversation ak() {
        return new UpdateConversation(c(), FeedRecord.FACTORY);
    }

    private /* synthetic */ InsertConversation al() {
        return new InsertConversation(c(), FeedRecord.FACTORY);
    }

    private static ReplyMedia b(List<aerv> list) {
        return (list == null || list.isEmpty()) ? null : ReplyMedia.fromSoju((aerv) list.get(0));
    }

    private static String c(List<aeye> list) {
        return (list == null || list.isEmpty() || ((aeye) list.get(0)).b == null) ? null : ((aeye) list.get(0)).b.a;
    }

    private pa c() {
        return this.c.getWritableDatabase();
    }

    private /* synthetic */ DeleteAllMessagingSnapsInSnapTable d() {
        return new DeleteAllMessagingSnapsInSnapTable(c());
    }

    private static String d(List<aeye> list) {
        if (list == null || list.isEmpty() || ((aeye) list.get(0)).c == null) {
            return null;
        }
        aehj aehj = ((aeye) list.get(0)).c;
        return new ffq(aehj.a, aehj.b, aehj.d, aehj.c, aehj.e, aehj.f).a().toString();
    }

    private qvc d(Long l) {
        return this.h.a(l.longValue());
    }

    private /* synthetic */ DeleteAllMessagingSnaps e() {
        return new DeleteAllMessagingSnaps(c());
    }

    private /* synthetic */ ClearAllMessages f() {
        return new ClearAllMessages(c());
    }

    private /* synthetic */ DeleteTalkAuthContext g() {
        return new DeleteTalkAuthContext(c());
    }

    private /* synthetic */ SetMessageRetentionInMinutes h() {
        return new SetMessageRetentionInMinutes(c());
    }

    private /* synthetic */ SetNotificationMuted i() {
        return new SetNotificationMuted(c());
    }

    private /* synthetic */ SetCognacNotificationMuted j() {
        return new SetCognacNotificationMuted(c());
    }

    private /* synthetic */ UpdateGroupSyncContentType k() {
        return new UpdateGroupSyncContentType(c(), FeedRecord.FACTORY);
    }

    private /* synthetic */ DeleteSnapsFromConversationWithStatus l() {
        return new DeleteSnapsFromConversationWithStatus(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ DeleteMessagingSnapsFromConversationWithStatus m() {
        return new DeleteMessagingSnapsFromConversationWithStatus(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ DeleteMessageFromConversationWithStatus n() {
        return new DeleteMessageFromConversationWithStatus(c(), MessageRecord.FACTORY);
    }

    private void n(String str) {
        this.b.throwIfNotDbScheduler();
        DeleteTalkAuthContext deleteTalkAuthContext = (DeleteTalkAuthContext) this.ao.get();
        deleteTalkAuthContext.bind(str);
        this.c.executeUpdateDelete(deleteTalkAuthContext);
    }

    private /* synthetic */ DeleteFailedSnapsNotInConversation o() {
        return new DeleteFailedSnapsNotInConversation(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ DeleteFailedMessagingSnapsNotInConversation p() {
        return new DeleteFailedMessagingSnapsNotInConversation(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ DeleteFailedMessagesNotInConveration q() {
        return new DeleteFailedMessagesNotInConveration(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ SetDisplayInteractionTypeForMultiRecipientSnaps r() {
        return new SetDisplayInteractionTypeForMultiRecipientSnaps(c());
    }

    private /* synthetic */ SetClientStatusForMessages s() {
        return new SetClientStatusForMessages(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ InsertOrReplaceValue t() {
        return new InsertOrReplaceValue(c());
    }

    private void t(long j) {
        this.b.throwIfNotDbScheduler();
        ClearBaseSnapsForFeed clearBaseSnapsForFeed = (ClearBaseSnapsForFeed) this.z.get();
        clearBaseSnapsForFeed.bind(Long.valueOf(j));
        this.c.executeUpdateDelete(clearBaseSnapsForFeed);
        ClearSnapsForFeed clearSnapsForFeed = (ClearSnapsForFeed) this.y.get();
        clearSnapsForFeed.bind(Long.valueOf(j));
        this.c.executeUpdateDelete(clearSnapsForFeed);
        ClearMessagesForFeed clearMessagesForFeed = (ClearMessagesForFeed) this.x.get();
        clearMessagesForFeed.bind(Long.valueOf(j));
        this.c.executeUpdateDelete(clearMessagesForFeed);
    }

    private /* synthetic */ UpdateFiKeyIvForKey u() {
        return new UpdateFiKeyIvForKey(c());
    }

    private /* synthetic */ UpdateMessageFromServer v() {
        return new UpdateMessageFromServer(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ UpdateSaveState w() {
        return new UpdateSaveState(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ UpdatePreservationState x() {
        return new UpdatePreservationState(c(), MessageRecord.FACTORY);
    }

    private /* synthetic */ UpdatePendingSnapUpdateStatus y() {
        return new UpdatePendingSnapUpdateStatus(c(), PendingSnapRecord.FACTORY);
    }

    private /* synthetic */ DeleteSnapMetadata z() {
        return new DeleteSnapMetadata(c());
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, long j2, DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        InsertFormerMember insertFormerMember = (InsertFormerMember) this.J.get();
        insertFormerMember.bind(j, j2);
        return this.c.executeInsert(insertFormerMember, dbTransaction);
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, long j2, Long l, DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        UpdateMember updateMember = (UpdateMember) this.H.get();
        updateMember.bind(l, j, j2);
        return (long) this.c.executeUpdateDelete(updateMember, dbTransaction);
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, long j2, Long l, Long l2, String str, Long l3, DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        InsertMember insertMember = (InsertMember) this.G.get();
        insertMember.bind(j, j2, Integer.valueOf(Color.parseColor(str)), l, l2, l3);
        return this.c.executeInsert(insertMember, dbTransaction);
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, Long l, DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        UpdateJoinedTimestamp updateJoinedTimestamp = (UpdateJoinedTimestamp) this.I.get();
        updateJoinedTimestamp.bind(l, j);
        return (long) this.c.executeUpdateDelete(updateJoinedTimestamp, dbTransaction);
    }

    public final long a(aenb aenb, long j, long j2, MessageClientStatus messageClientStatus, DbTransaction dbTransaction) {
        aenb aenb2 = aenb;
        this.b.throwIfNotDbScheduler();
        String a = qwh.a(aenb2.O);
        qvc d = d(Long.valueOf(j));
        Long a2 = d.a(a);
        if (a2 == null) {
            a2 = (Long) this.c.queryFirst(MessageRecord.FACTORY.getMessageIdForKey(a, Long.valueOf(j)), MessageRecord.FACTORY.getMessageIdForKeyMapper());
            if (a2 != null) {
                d.a(a, a2.longValue());
            }
        }
        Long l = a2;
        if (l != null) {
            if (!(TextUtils.isEmpty(aenb2.a) || SnapServerStatus.hasBeenOpened(SnapServerStatus.parseFromSnap(aenb)) || d.a(l.longValue(), aenb2))) {
                a(aenb2.O, aenb2.w, aenb2.M, aenb2.I, aenb2.C, aenb2.E);
            }
            SnapServerStatus a3 = d.a(l.longValue());
            if (a3 == null) {
                a3 = (SnapServerStatus) this.c.queryFirst(MessagingSnapRecord.FACTORY.getServerStatusForSnapId(a), MessagingSnapRecord.FACTORY.getServerStatusForSnapIdMapper());
            }
            if (a3 != SnapServerStatus.VIEWED) {
                SnapServerStatus parseFromSnap = SnapServerStatus.parseFromSnap(aenb);
                if (parseFromSnap != a3) {
                    ((UpdateSnapServerStatusByKey) this.S.get()).bind(parseFromSnap, aenb2.aa == null ? aenb2.S : aenb2.aa, Boolean.FALSE, a, a);
                    this.c.executeUpdateDelete((ainy) this.S.get());
                }
            }
            if (aenb2.q != null && aenb2.q.booleanValue()) {
                a(l.longValue(), messageClientStatus);
            }
            d.a(a, l.longValue(), aenb2);
            return l.longValue();
        }
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        InsertBasic insertBasic = (InsertBasic) this.u.get();
        insertBasic.bind(a, Long.valueOf(j), Long.valueOf(j2), aenb2.S.longValue(), aenb2.Z, messageClientStatus, aesq.SNAP.a(), a);
        Long valueOf = Long.valueOf(this.c.executeInsert(insertBasic, dbTransaction));
        qvc qvc = d;
        String str = a;
        a(aenb, j, j2, valueOf.longValue(), dbTransaction);
        qvc.a(str, valueOf.longValue(), aenb2);
        return valueOf.longValue();
    }

    public final long a(ahaz ahaz, DbTransaction dbTransaction) {
        return a(ahaz, null, dbTransaction);
    }

    public final long a(Boolean bool, aegj aegj, long j, long j2, MessageClientStatus messageClientStatus, DbTransaction dbTransaction) {
        Long valueOf;
        aegj aegj2 = aegj;
        long j3 = j;
        DbTransaction dbTransaction2 = dbTransaction;
        this.b.throwIfNotDbScheduler();
        Long l = (Long) this.c.queryFirst(MessageRecord.FACTORY.getMessageIdForKey(aegj2.b, Long.valueOf(j)), MessageRecord.FACTORY.getMessageIdForKeyMapper());
        if (l == null) {
            DbTransaction dbTransaction3;
            long j4;
            this.b.throwIfNotDbScheduler();
            LocalMessageBodyType b = adox.b(aegj);
            if ((b != LocalMessageBodyType.UNRECOGNIZED_VALUE ? 1 : null) == null) {
                dbTransaction3 = dbTransaction2;
                j4 = -1;
            } else {
                InsertOrReplaceValue insertOrReplaceValue = (InsertOrReplaceValue) this.ab.get();
                insertOrReplaceValue.bind(j3);
                this.c.executeInsert(insertOrReplaceValue, dbTransaction2);
                if ((aegj2.a.a != null ? 1 : null) != null) {
                    byte[] bArr;
                    InsertMedia insertMedia = (InsertMedia) this.t.get();
                    String str = aegj2.b;
                    Long valueOf2 = Long.valueOf(j);
                    Long valueOf3 = Long.valueOf(j2);
                    long longValue = aegj2.n.longValue();
                    Long valueOf4 = Long.valueOf(adox.c(aegj));
                    String str2 = aegj2.a.e;
                    String str3 = aegj2.a.a.a;
                    String a = ptf.a(aegj2.a.a.b);
                    String str4 = aegj2.a.a.c;
                    String str5 = aegj2.a.a.e;
                    String str6 = aegj2.a.a.f;
                    Integer num = aegj2.a.a.g;
                    String str7 = str3;
                    Integer num2 = aegj2.a.a.h;
                    Float f = aegj2.a.a.j;
                    Boolean valueOf5 = Boolean.valueOf(abpp.a(aegj2.a.a.n));
                    Boolean bool2 = aegj2.a.a.k;
                    String str8 = aegj2.a.a.l;
                    String str9 = aegj2.a.a.o;
                    str3 = aegj2.a.g;
                    if (str3 != null) {
                        CharSequence charSequence = str3;
                        if ((charSequence.length() == 0 ? 1 : null) == null) {
                            char[] cArr = new char[]{8238};
                            akcr.b(charSequence, "receiver$0");
                            akcr.b(cArr, "delimiters");
                            String a2 = akfh.a(akfh.c(new akfq(charSequence, 0, new akgc.a(cArr, false)), new d(charSequence)), null, null, null, 0, null, null, 63);
                            Charset charset = akfp.a;
                            if (a2 != null) {
                                Object bytes = a2.getBytes(charset);
                                akcr.a(bytes, "(this as java.lang.String).getBytes(charset)");
                                bArr = bytes;
                                insertMedia.bind(str, valueOf2, valueOf3, longValue, valueOf4, messageClientStatus, str2, str7, a, str4, str5, str6, num, num2, f, valueOf5, bool2, str8, str9, bArr, gck.a(aegj2.d), gcm.a.a(aegj2.c));
                                dbTransaction3 = dbTransaction;
                                j4 = this.c.executeInsert(insertMedia, dbTransaction3);
                            } else {
                                throw new ajxt("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    bArr = new byte[0];
                    insertMedia.bind(str, valueOf2, valueOf3, longValue, valueOf4, messageClientStatus, str2, str7, a, str4, str5, str6, num, num2, f, valueOf5, bool2, str8, str9, bArr, gck.a(aegj2.d), gcm.a.a(aegj2.c));
                    dbTransaction3 = dbTransaction;
                    j4 = this.c.executeInsert(insertMedia, dbTransaction3);
                } else {
                    dbTransaction3 = dbTransaction2;
                    InsertContent insertContent = (InsertContent) this.s.get();
                    insertContent.bind(aegj2.b, Long.valueOf(j), Long.valueOf(j2), aegj2.n.longValue(), null, Long.valueOf(adox.c(aegj)), messageClientStatus, b.getNetworkStringValue(), a, gck.a(aegj2.d), gcm.a.a(aegj2.c), false, null, null, null, null);
                    j4 = this.c.executeInsert(insertContent, dbTransaction3);
                }
            }
            valueOf = Long.valueOf(j4);
            boolean booleanValue = bool.booleanValue();
            long longValue2 = valueOf.longValue();
            Preconditions.checkState(abpp.a(aegj2.i.d));
            this.b.throwIfNotDbScheduler();
            InsertSnapMetadata insertSnapMetadata = (InsertSnapMetadata) this.w.get();
            List list = aegj2.a.a == null ? null : aegj2.a.a.m;
            insertSnapMetadata.bind(aegj2.b, aegj2.n.longValue(), String.valueOf(j2), aegj2.a.a.f, aegj2.a.a.e, a.a(aegj2.a.a.b), null, Math.round(aegj2.a.a.j.doubleValue() * 1000.0d), aegj2.a.a.k, "GROUP_CHAT", abpp.a(aegj2.a.a.n), qvd.c(list), qvd.d(list));
            long executeInsert = this.c.executeInsert(insertSnapMetadata, dbTransaction3);
            if (executeInsert == -1) {
                ieg.a("There is corrupted Data in snap table. Please Shake to Report.", true, 0);
                executeInsert = ((Long) MoreObjects.firstNonNull(c(aegj2.b), Long.valueOf(-1))).longValue();
            }
            SnapServerStatus snapServerStatus = booleanValue ? SnapServerStatus.SENT : SnapServerStatus.DELIVERED;
            InsertMessageSnap insertMessageSnap = (InsertMessageSnap) this.v.get();
            insertMessageSnap.bind(executeInsert, longValue2, Long.valueOf(j), snapServerStatus, Long.valueOf(0), Long.valueOf(0), Integer.valueOf(0), aegj2.a.u, Long.valueOf(j2), null, null, null, null, qvd.b(aegj2.a.s), GeofilterMetadata.fromSnapMetadata(aegj2.a.m), SnappableLensMetadata.fromSnapMetadata(aegj2.a.m), aegj2.a.a.r);
            this.c.executeInsert(insertMessageSnap, dbTransaction3);
            InsertPendingSnap insertPendingSnap = (InsertPendingSnap) this.E.get();
            long j5 = j;
            insertPendingSnap.bind(j5, aegj2.b, aegj2.n.longValue(), UpdateStatus.SERVER_VALUE);
            this.c.executeInsert(insertPendingSnap, dbTransaction3);
            InsertOrReplaceValue insertOrReplaceValue2 = (InsertOrReplaceValue) this.ab.get();
            insertOrReplaceValue2.bind(j5);
            this.c.executeInsert(insertOrReplaceValue2, dbTransaction3);
        } else {
            valueOf = l;
        }
        return valueOf.longValue();
    }

    public final ajdp<List<PlayableRecord>> a(Long l) {
        ainx playablePendingSnapsForFeed = MessagingSnapRecord.FACTORY.getPlayablePendingSnapsForFeed(l, SnapServerStatus.DELIVERED, this.d.b());
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessagingSnapQueries.SELECT_SNAP_FOR_FEED_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList("ch:getPendingSnaps", playablePendingSnapsForFeed, new -$$Lambda$8wmpiKRAOM3WD7HlRm4j2zbP5t8(ainw));
    }

    public final ajdp<List<PlayableSnap>> a(long[] jArr) {
        ainx playableSnapsByMessageRowId = MessagingSnapRecord.FACTORY.getPlayableSnapsByMessageRowId(jArr);
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessagingSnapQueries.SELECT_PLAYABLE_SNAP_BY_ID;
        ainw.getClass();
        return dbClient.queryAndMapToList("ch:getPlayableSnapsByMessageRowId", playableSnapsByMessageRowId, new -$$Lambda$sKEBUDORUONtDgKU21QUjvmaXpI(ainw));
    }

    public final ajdx<BasicFeedInfo> a(long j) {
        ainx basicFeedInfoById = FeedRecord.FACTORY.getBasicFeedInfoById(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.BASIC_FEED_INFO_BY_ID_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOneOrError("ch:info", basicFeedInfoById, new -$$Lambda$5Zy2DnXTw-aTLaQ1l0y5aN7Nfag(ainw));
    }

    public final ajdx<Pair<List<Long>, Boolean>> a(Long l, Long l2, Long l3) {
        ainx seenSequenceNumbers = SeenSequenceNumbersRecord.FACTORY.getSeenSequenceNumbers(l.longValue());
        DbClient dbClient = this.c;
        ainw seenSequenceNumbersMapper = SeenSequenceNumbersRecord.FACTORY.getSeenSequenceNumbersMapper();
        seenSequenceNumbersMapper.getClass();
        return dbClient.queryAndMapToOneOrDefault(seenSequenceNumbers, new -$$Lambda$YpvjHPdDaT1z5rFKa14XxGlygH8(seenSequenceNumbersMapper), new FeedSeenSequenceNumbers(ImmutableTable.of())).f(new -$$Lambda$qvd$FeR8jwyItpinJa-2B-XeS6hJr8Q(l2, l3));
    }

    public final ajdx<SnapMetaData> a(String str) {
        ainx snapMetadataForSnapId = MessagingSnapRecord.FACTORY.getSnapMetadataForSnapId(str);
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessagingSnapQueries.SELECT_SNAP_METADATA_FOR_SNAPID_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOne(snapMetadataForSnapId, new -$$Lambda$FWKHv4cpmZQHjiV9iZp3uJzWu4w(ainw)).e();
    }

    public final ajdx<List<GroupInfo>> a(List<Long> list) {
        return ajdx.c(new -$$Lambda$qvd$T389wm-EEGWIe4uoTiW2-w41Hiw(this, list)).a(new -$$Lambda$qvd$Onn4mpN_BBsP5-4EwcGlhnWe25M(this));
    }

    public final ajdx<List<String>> a(List<Long> list, String str) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        DbClient dbClient = this.c;
        ainx selectDisplayNamesForFriends = FriendRecord.FACTORY.selectDisplayNamesForFriends(str, jArr);
        ainw selectDisplayNamesForFriendsMapper = FriendRecord.FACTORY.selectDisplayNamesForFriendsMapper();
        selectDisplayNamesForFriendsMapper.getClass();
        return dbClient.queryAndMapToList(selectDisplayNamesForFriends, new -$$Lambda$UgNF7jcDcu7N_NG0A125XsdZ_Q8(selectDisplayNamesForFriendsMapper)).e();
    }

    /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            if (r2 != null) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:16:0x002d, code skipped:
            if (r3 != null) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r2.close();
     */
    /* JADX WARNING: Missing block: B:19:0x0033, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0034, code skipped:
            r3.addSuppressed(r2);
     */
    /* JADX WARNING: Missing block: B:21:0x0038, code skipped:
            r2.close();
     */
    public final com.snap.core.db.record.MessagingSnapRecord.SnapInfo a(java.lang.String r2, java.lang.Long r3) {
        /*
        r1 = this;
        r0 = com.snap.core.db.record.MessagingSnapRecord.FACTORY;
        r2 = r0.getSnapInfoForId(r2, r3);
        r3 = r1.c;
        r2 = r3.query(r2);
        r3 = 0;
        r0 = r2.moveToFirst();	 Catch:{ Throwable -> 0x0029 }
        if (r0 == 0) goto L_0x0021;
    L_0x0013:
        r0 = com.snap.core.db.record.LegacyMessagingSnapQueries.SELECT_SNAP_INFO_FOR_MESSAGE_MAPPER;	 Catch:{ Throwable -> 0x0029 }
        r0 = r0.map(r2);	 Catch:{ Throwable -> 0x0029 }
        r0 = (com.snap.core.db.record.MessagingSnapRecord.SnapInfo) r0;	 Catch:{ Throwable -> 0x0029 }
        if (r2 == 0) goto L_0x0020;
    L_0x001d:
        r2.close();
    L_0x0020:
        return r0;
    L_0x0021:
        if (r2 == 0) goto L_0x0026;
    L_0x0023:
        r2.close();
    L_0x0026:
        return r3;
    L_0x0027:
        r0 = move-exception;
        goto L_0x002b;
    L_0x0029:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0027 }
    L_0x002b:
        if (r2 == 0) goto L_0x003b;
    L_0x002d:
        if (r3 == 0) goto L_0x0038;
    L_0x002f:
        r2.close();	 Catch:{ Throwable -> 0x0033 }
        goto L_0x003b;
    L_0x0033:
        r2 = move-exception;
        r3.addSuppressed(r2);
        goto L_0x003b;
    L_0x0038:
        r2.close();
    L_0x003b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.a(java.lang.String, java.lang.Long):com.snap.core.db.record.MessagingSnapRecord$SnapInfo");
    }

    public final Long a() {
        return (Long) this.c.queryFirst(FriendRecord.FACTORY.selectIdForKey(this.d.b()), FriendRecord.FACTORY.selectIdForKeyMapper(), Long.valueOf(-1));
    }

    public final String a(List<FriendMessageRecipient> list, List<GroupMessageRecipient> list2) {
        Iterable arrayList = new ArrayList(list.size() + list2.size());
        for (FriendMessageRecipient friendMessageRecipient : list) {
            DisplayName displayName = (DisplayName) this.c.queryFirst(FriendRecord.FACTORY.selectDisplayNameForUsername(friendMessageRecipient.parseRecipientUsername(this.d.b())), FriendRecord.SELECT_NAME_MAPPER);
            Object id = (displayName == null || TextUtils.isEmpty(displayName.displayName())) ? friendMessageRecipient.getId() : displayName.displayName();
            arrayList.add(id);
        }
        for (GroupMessageRecipient id2 : list2) {
            String g = g(id2.getId());
            if (!TextUtils.isEmpty(g)) {
                arrayList.add(g);
            }
        }
        return Joiner.on(ppy.d).join(arrayList);
    }

    public final List<LastSentSnapModel> a(long[] jArr, SnapServerStatus[] snapServerStatusArr) {
        return this.c.query(MessageRecord.FACTORY.getLastSentSnapForMessage(this.d.b(), snapServerStatusArr, jArr), LegacyMessageQueries.LAST_SENT_SNAP_MODEL_ROW_MAPPER);
    }

    public final List<LastReceivedNotViewedChat> a(Long[] lArr) {
        return this.c.query(MessageRecord.FACTORY.getLastReceivedNotViewedChat(this.d.b(), lArr, LocalMessageBodyType.CHAT_QUERY_MESSAGE_TYPE_FILTER), LegacyMessageQueries.LAST_RECEIVED_NOT_VIEWED_CHAT_ROW_MAPPER);
    }

    public final List<LastMessageWithClientStatus> a(Long[] lArr, MessageClientStatus[] messageClientStatusArr) {
        return this.c.query(MessageRecord.FACTORY.getLastMessageForMessageClientStatus(lArr, messageClientStatusArr, LocalMessageBodyType.SILENT_LOCAL_MESSAGE_BODY_TYPE_STRINGS), LegacyMessageQueries.LAST_MESSAGE_WITH_CLIENT_STATUS_ROW_MAPPER);
    }

    public final List<ReceivedSnapsModel> a(Long[] lArr, SnapServerStatus[] snapServerStatusArr) {
        return this.c.query(MessageRecord.FACTORY.getReceivedSnaps(this.d.b(), snapServerStatusArr, lArr), LegacyMessageQueries.RECEIVED_SNAPS_MODEL_ROW_MAPPER);
    }

    public final List<LastReceivedSnap> a(Long[] lArr, SnapServerStatus[] snapServerStatusArr, gcp[] gcpArr) {
        return this.c.query(MessagingSnapRecord.FACTORY.getLastReceivedSnap(SnapRecord.FACTORY, this.d.b(), snapServerStatusArr, gcpArr, lArr), LegacyMessagingSnapQueries.LAST_RECEIVED_SNAP_ROW_MAPPER);
    }

    public final Map<String, Long> a(List<aefi> list, Map<String, Long> map, DbTransaction dbTransaction) {
        Long l;
        ainy ainy;
        Iterator it;
        long j;
        ainy ainy2;
        Long valueOf;
        long longValue;
        DbTransaction dbTransaction2 = dbTransaction;
        String b = this.d.b();
        ArrayList newArrayList = Lists.newArrayList();
        ImmutableList toList = FluentIterable.from(list).transform(-$$Lambda$qvd$CkqWlldgV9BbPEyE9t0bqLOG72g.INSTANCE).toList();
        Map a = this.g.a((String[]) toList.toArray(new String[toList.size()]));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aefi aefi = (aefi) it2.next();
            l = (Long) a.get(aefi.a);
            if (l == null) {
                newArrayList.add(aefi);
            } else {
                long longValue2 = l.longValue();
                adoz b2 = adow.b(aefi, b);
                ainy = (UpdateConversation) this.k.get();
                it = it2;
                j = longValue2;
                Map map2 = a;
                ainy2 = ainy;
                ainy.bind(aefi.g, aefi.o.booleanValue() ? null : aefi.j.c, b2.a, b2.b, b2.c, b2.d, b2.e, b2.f, aefi.u.longValue(), Boolean.valueOf(abpp.a(aefi.p, true) ^ 1), j);
                this.c.executeUpdateDelete(ainy2);
                long longValue3 = aefi.s != null ? aefi.s.longValue() : 0;
                UpdateClearedTimestampIfMoreRecent updateClearedTimestampIfMoreRecent = (UpdateClearedTimestampIfMoreRecent) this.P.get();
                Long valueOf2 = Long.valueOf(longValue3);
                valueOf = Long.valueOf(longValue3);
                longValue3 = j;
                updateClearedTimestampIfMoreRecent.bind(valueOf2, longValue3, valueOf);
                this.c.executeUpdateDelete((ainy) this.P.get());
                longValue = aefi.g != null ? aefi.g.longValue() : 0;
                ((UpdateLatestInteractionTimestampIfMoreRecent) this.N.get()).bind(Long.valueOf(longValue), longValue3, Long.valueOf(longValue));
                this.c.executeUpdateDelete((ainy) this.N.get());
                it2 = it;
                a = map2;
            }
        }
        Map<String, Long> map3 = a;
        Iterator it3 = newArrayList.iterator();
        while (it3.hasNext()) {
            aefi aefi2 = (aefi) it3.next();
            String a2 = adow.a(aefi2, b);
            long longValue4 = ((Long) map.get(a2)).longValue();
            if (longValue4 >= 0) {
                adoz b3 = adow.b(aefi2, b);
                ainy = (InsertConversation) this.j.get();
                String str = aefi2.a;
                valueOf = aefi2.g;
                String str2 = b3.a;
                String str3 = b3.b;
                l = b3.c;
                String str4 = b3.d;
                Long l2 = b3.e;
                String str5 = b;
                Long valueOf3 = Long.valueOf(aefi2.s != null ? aefi2.s.longValue() : 0);
                gcp gcp = b3.f;
                Long valueOf4 = Long.valueOf(longValue4);
                it = it3;
                String str6 = aefi2.j.c;
                gcp gcp2 = gcp;
                j = aefi2.u.longValue();
                Boolean valueOf5 = Boolean.valueOf(abpp.a(aefi2.p, true) ^ 1);
                boolean a3 = abpp.a(aefi2.w, false);
                aefi aefi3 = aefi2;
                ainy2 = ainy;
                ainy.bind(str, valueOf, str2, str3, l, str4, l2, valueOf3, gcp2, valueOf4, str6, j, valueOf5, a3, a2);
                DbTransaction dbTransaction3 = dbTransaction;
                longValue = this.c.executeInsert(ainy2, dbTransaction3);
                InsertMember insertMember = (InsertMember) this.G.get();
                insertMember.bind(longValue, longValue4, Integer.valueOf(Color.parseColor("#000000")), Long.valueOf(this.f.a()), null, null);
                this.c.executeInsert(insertMember, dbTransaction3);
                map3.put(aefi3.a, Long.valueOf(longValue));
                dbTransaction2 = dbTransaction3;
                b = str5;
                it3 = it;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("negative friendId will cause dangling reference problem");
                this.i.a(gqt.HIGH, illegalArgumentException, pry.a.callsite("MessagingRepository"));
                throw illegalArgumentException;
            }
        }
        return map3;
    }

    public final void a(long j, long j2) {
        this.c.throwIfNotDbScheduler();
        ((UpdateLatestInteractionTimestampIfMoreRecent) this.N.get()).bind(Long.valueOf(j2), j, Long.valueOf(j2));
        this.c.executeUpdateDelete((ainy) this.N.get());
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, aepm aepm, Map<String, Long> map) {
        aepm aepm2 = aepm;
        Map<String, Long> map2 = map;
        this.b.throwIfNotDbScheduler();
        String b = this.d.b();
        LastMessage lastMessage = (LastMessage) this.c.queryFirst(MessageRecord.FACTORY.getLastMessageForFeedExcludingStatus(Long.valueOf(j), MessageClientStatus.OK), LegacyMessageQueries.SELECT_LAST_MESSAGE_MAPPER);
        if (lastMessage != null) {
            if (map2.containsKey(lastMessage.senderUsername()) && lastMessage.sequenceNumber() != null && ((Long) map2.get(lastMessage.senderUsername())).longValue() >= lastMessage.sequenceNumber().longValue()) {
                ((UpdateConversationReader) this.L.get()).bind(Long.valueOf(lastMessage.timestamp()), b, j, b);
                this.c.executeUpdateDelete((ainy) this.L.get());
            }
            return;
        }
        ((UpdateConversationWriter) this.K.get()).bind(aepm2.b, aepm2.d, aepm2.a, aepm2.f == null ? null : a.a(aepm2.f), j);
        this.c.executeUpdateDelete((ainy) this.K.get());
        long longValue = (aepm2.e.longValue() > 0 ? aepm2.e : aepm2.b).longValue();
        if (longValue <= this.f.a()) {
            ((UpdateConversationReader) this.L.get()).bind(Long.valueOf(longValue), b, j, b);
            this.c.executeUpdateDelete((ainy) this.L.get());
        }
    }

    public final void a(long j, MessageClientStatus messageClientStatus) {
        ((UpdateMessageClientStatus) this.R.get()).bind(messageClientStatus, j);
        this.c.executeUpdateDelete((ainy) this.R.get());
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, gcj gcj) {
        this.b.throwIfNotDbScheduler();
        ((UpdatePreservationState) this.X.get()).bind(gcj, j);
        this.c.executeUpdateDelete((ainy) this.X.get());
    }

    public final void a(long j, gcm gcm) {
        this.b.throwIfNotDbScheduler();
        if (gcm != null) {
            this.b.throwIfNotDbScheduler();
            ((UpdateSaveState) this.Y.get()).bind(gcm, j);
            this.c.executeUpdateDelete((ainy) this.Y.get());
        }
    }

    public final void a(long j, String str) {
        this.b.throwIfNotDbScheduler();
        UpdateGroupDisplayName updateGroupDisplayName = (UpdateGroupDisplayName) this.o.get();
        updateGroupDisplayName.bind(str, j);
        this.c.executeUpdateDelete(updateGroupDisplayName);
    }

    public final void a(aenb aenb, long j, long j2, DbTransaction dbTransaction) {
        if (aenb != null && !a(qwh.a(aenb.O), j)) {
            a(aenb, j, j2, MessageClientStatus.OK, dbTransaction);
            InsertPendingSnap insertPendingSnap = (InsertPendingSnap) this.E.get();
            insertPendingSnap.bind(j, qwh.a(aenb.O), aenb.S.longValue(), UpdateStatus.SERVER_VALUE);
            this.c.executeInsert(insertPendingSnap, dbTransaction);
        }
    }

    public final void a(DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        this.h.a();
        this.c.executeUpdateDelete((ainy) this.ap.get(), dbTransaction);
        this.c.executeUpdateDelete((ainy) this.ar.get(), dbTransaction);
        this.c.executeUpdateDelete((ainy) this.aq.get(), dbTransaction);
    }

    public final void a(String str, DbTransaction dbTransaction) {
        this.b.throwIfNotDbScheduler();
        if (str == null) {
            this.c.executeUpdateDelete((DeleteValue) this.D.get());
            return;
        }
        UpdateValue updateValue = (UpdateValue) this.B.get();
        updateValue.bind(str);
        if (this.c.executeUpdateDelete(updateValue) == 0) {
            InsertValue insertValue = (InsertValue) this.C.get();
            insertValue.bind(str);
            this.c.executeInsert(insertValue, dbTransaction);
        }
    }

    public final void a(String str, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        this.b.throwIfNotDbScheduler();
        if (screenshottedOrReplayedState != null) {
            ((UpdateSnapScreenshottedReplayByKeyWithoutSuffix) this.A.get()).bind(screenshottedOrReplayedState, str);
            this.c.executeUpdateDelete((ainy) this.A.get());
        }
    }

    public final void a(String str, UpdateStatus updateStatus) {
        this.b.throwIfNotDbScheduler();
        ((UpdatePendingSnapUpdateStatus) this.W.get()).bind(updateStatus, qwh.a(str));
        this.c.executeUpdateDelete((ainy) this.W.get());
    }

    public final void a(String str, String str2, boolean z, int i) {
        this.b.throwIfNotDbScheduler();
        MessageInfo messageInfo = (MessageInfo) this.c.queryFirst(MessageRecord.FACTORY.getMessageByKey(str), LegacyMessageQueries.MESSAGE_INFO_ROW_MAPPER);
        if (messageInfo != null) {
            a(messageInfo._id(), gcm.a.a(str2, z, i).a(messageInfo.savedStates()));
        }
    }

    public final boolean a(String str, long j) {
        qvc d = d(Long.valueOf(j));
        str = qwh.a(str);
        return (d.a(str) == null && a(str, Long.valueOf(j)) == null) ? false : true;
    }

    public final boolean a(String str, boolean z) {
        SetNotificationMuted setNotificationMuted = (SetNotificationMuted) this.am.get();
        setNotificationMuted.bind(Boolean.valueOf(z), str);
        return this.c.executeUpdateDelete(setNotificationMuted) > 0;
    }

    public final ajdp<List<GetContentForMessageModel>> b(long[] jArr) {
        DbClient dbClient = this.c;
        ainx contentForMessages = MessageRecord.FACTORY.getContentForMessages(jArr);
        ainw ainw = LegacyMessageQueries.GET_CONTENT_FOR_MESSAGE_MODEL_ROW_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList(contentForMessages, new -$$Lambda$36xcT1buNh-BtYmtRZHLeJ0NWWY(ainw));
    }

    public final ajdx<List<String>> b() {
        DbClient dbClient = this.c;
        ainx idsWithLaterContent = FeedRecord.FACTORY.getIdsWithLaterContent(true);
        ainw idsWithLaterContentMapper = FeedRecord.FACTORY.getIdsWithLaterContentMapper();
        idsWithLaterContentMapper.getClass();
        return dbClient.queryAndMapToList(idsWithLaterContent, new -$$Lambda$UgNF7jcDcu7N_NG0A125XsdZ_Q8(idsWithLaterContentMapper)).e();
    }

    public final ajdx<SnapMetadata> b(String str) {
        ainx snapMetadataForMessageId = MessageRecord.FACTORY.getSnapMetadataForMessageId(str);
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessageQueries.SNAP_METADATA_ROW_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOne(snapMetadataForMessageId, new -$$Lambda$6uQpQvpPijBN0cmz-ZSJJTWg3v0(ainw)).e();
    }

    public final BasicFeedInfo b(long j) {
        ainx basicFeedInfoById = FeedRecord.FACTORY.getBasicFeedInfoById(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.BASIC_FEED_INFO_BY_ID_MAPPER;
        ainw.getClass();
        return (BasicFeedInfo) dbClient.queryFirst(basicFeedInfoById, new -$$Lambda$wVXWxlRcq0gQIRAlmdBFm_AheGM(ainw));
    }

    public final List<LastSentSnap> b(long[] jArr, SnapServerStatus[] snapServerStatusArr) {
        return this.c.query(MessagingSnapRecord.FACTORY.getLastSentSnap(this.d.b(), snapServerStatusArr, jArr), LegacyMessagingSnapQueries.LAST_SENT_SNAP_ROW_MAPPER);
    }

    public final List<LastSentNotViewedChat> b(Long[] lArr) {
        return this.c.query(MessageRecord.FACTORY.getLastSentNotViewedChat(this.d.b(), LocalMessageBodyType.CHAT_QUERY_MESSAGE_TYPE_FILTER, lArr), LegacyMessageQueries.LAST_SENT_NOT_VIEWED_CHAT_ROW_MAPPER);
    }

    public final void b(long j, long j2) {
        this.b.throwIfNotDbScheduler();
        if (j >= 0) {
            ((UpdateClearedTimestampIfMoreRecent) this.P.get()).bind(Long.valueOf(j2), j, Long.valueOf(j2));
            this.c.executeUpdateDelete((ainy) this.P.get());
        }
    }

    public final void b(long j, String str) {
        this.b.throwIfNotDbScheduler();
        if (j >= 0) {
            t(j);
            n(str);
            DeleteConversation deleteConversation = (DeleteConversation) this.l.get();
            deleteConversation.bind(j);
            if (this.c.executeUpdateDelete(deleteConversation) > 0) {
                this.g.c(str);
            }
        }
    }

    public final void b(Long l) {
        this.b.throwIfNotDbScheduler();
        ((UpdateSnapServerStatusById) this.O.get()).bind(l.longValue(), SnapServerStatus.VIEWED);
        this.c.executeUpdateDelete((ainy) this.O.get());
    }

    public final void b(String str, long j) {
        str = qwh.a(str);
        ((DeleteMessageForKey) this.T.get()).bind(str, Long.valueOf(j));
        this.c.executeUpdateDelete((ainy) this.T.get());
        ((DeleteSnap) this.U.get()).bind(str);
        this.c.executeUpdateDelete((ainy) this.U.get());
        ((DeleteSnapMetadata) this.V.get()).bind(str);
        this.c.executeUpdateDelete((ainy) this.V.get());
    }

    public final boolean b(String str, boolean z) {
        SetCognacNotificationMuted setCognacNotificationMuted = (SetCognacNotificationMuted) this.al.get();
        setCognacNotificationMuted.bind(z, str);
        return this.c.executeUpdateDelete(setCognacNotificationMuted) > 0;
    }

    public final long c(Long l) {
        return ((Long) this.c.queryFirst(MessageRecord.FACTORY.getSortingTimestampForFeed(l, LocalMessageBodyType.SILENT_LOCAL_MESSAGE_BODY_TYPE_STRINGS), MessageRecord.FACTORY.getSortingTimestampForFeedMapper(), Long.valueOf(0))).longValue();
    }

    public final long c(String str, long j) {
        return ((Long) this.c.queryFirst(MessageRecord.FACTORY.getMessageIdForKey(str, Long.valueOf(j)), MessageRecord.FACTORY.getMessageIdForKeyMapper(), Long.valueOf(-1))).longValue();
    }

    public final ajdp<BasicFeedInfo> c(long j) {
        ainx basicFeedInfoById = FeedRecord.FACTORY.getBasicFeedInfoById(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.BASIC_FEED_INFO_BY_ID_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOne("ch:info_up", basicFeedInfoById, new -$$Lambda$5Zy2DnXTw-aTLaQ1l0y5aN7Nfag(ainw));
    }

    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            if (r3 != null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            if (r0 != null) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:19:0x0037, code skipped:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0038, code skipped:
            r0.addSuppressed(r3);
     */
    /* JADX WARNING: Missing block: B:21:0x003c, code skipped:
            r3.close();
     */
    public final java.lang.Long c(java.lang.String r3) {
        /*
        r2 = this;
        r0 = com.snap.core.db.record.SnapRecord.FACTORY;
        r3 = r0.getSnapRowIdBySnapId(r3);
        r0 = r2.c;
        r3 = r0.query(r3);
        r0 = 0;
        r1 = r3.moveToFirst();	 Catch:{ Throwable -> 0x002d }
        if (r1 == 0) goto L_0x0025;
    L_0x0013:
        r1 = com.snap.core.db.record.SnapRecord.FACTORY;	 Catch:{ Throwable -> 0x002d }
        r1 = r1.getSnapRowIdBySnapIdMapper();	 Catch:{ Throwable -> 0x002d }
        r1 = r1.map(r3);	 Catch:{ Throwable -> 0x002d }
        r1 = (java.lang.Long) r1;	 Catch:{ Throwable -> 0x002d }
        if (r3 == 0) goto L_0x0024;
    L_0x0021:
        r3.close();
    L_0x0024:
        return r1;
    L_0x0025:
        if (r3 == 0) goto L_0x002a;
    L_0x0027:
        r3.close();
    L_0x002a:
        return r0;
    L_0x002b:
        r1 = move-exception;
        goto L_0x002f;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002b }
    L_0x002f:
        if (r3 == 0) goto L_0x003f;
    L_0x0031:
        if (r0 == 0) goto L_0x003c;
    L_0x0033:
        r3.close();	 Catch:{ Throwable -> 0x0037 }
        goto L_0x003f;
    L_0x0037:
        r3 = move-exception;
        r0.addSuppressed(r3);
        goto L_0x003f;
    L_0x003c:
        r3.close();
    L_0x003f:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.c(java.lang.String):java.lang.Long");
    }

    public final List<LastReceivedViewedChat> c(Long[] lArr) {
        return this.c.query(MessageRecord.FACTORY.getLastReceivedViewedChat(this.d.b(), LocalMessageBodyType.CHAT_QUERY_MESSAGE_TYPE_FILTER, lArr), LegacyMessageQueries.LAST_RECEIVED_VIEWED_CHAT_ROW_MAPPER);
    }

    public final Map<String, MessageDifferentialInfo> c(long j, long j2) {
        this.b.throwIfNotDbScheduler();
        HashMap hashMap = new HashMap();
        for (MessageDifferentialInfo messageDifferentialInfo : this.c.query(MessageRecord.FACTORY.getMessageInfoForDifferentialUpdate(Long.valueOf(j), j2), LegacyMessageQueries.SELECT_MESSAGE_INFO_FOR_DIFF)) {
            hashMap.put(messageDifferentialInfo.key(), messageDifferentialInfo);
        }
        return hashMap;
    }

    public final long d(String str) {
        return this.g.b(str);
    }

    public final ajdp<String> d(long j) {
        ainx lastWriterAvatarIdForFeed = FeedRecord.FACTORY.getLastWriterAvatarIdForFeed(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.LATEST_AVATAR_ID_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOne("ch:avatarId", lastWriterAvatarIdForFeed, new -$$Lambda$UgNF7jcDcu7N_NG0A125XsdZ_Q8(ainw));
    }

    public final List<LastSentViewedChat> d(Long[] lArr) {
        return this.c.query(MessageRecord.FACTORY.getLastSentViewedChat(this.d.b(), LocalMessageBodyType.CHAT_QUERY_MESSAGE_TYPE_FILTER, lArr), LegacyMessageQueries.LAST_SENT_VIEWED_CHAT_ROW_MAPPER);
    }

    public final boolean d(String str, long j) {
        SetMessageRetentionInMinutes setMessageRetentionInMinutes = (SetMessageRetentionInMinutes) this.an.get();
        setMessageRetentionInMinutes.bind(j, str);
        return this.c.executeUpdateDelete(setMessageRetentionInMinutes) > 0;
    }

    public final long e(String str) {
        return this.g.a(str);
    }

    public final ajdp<List<AvatarInfo>> e(long j) {
        ainx selectMembersForAvatarPicker = FeedRecord.FACTORY.selectMembersForAvatarPicker(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.GET_AVATAR_PICKER_FRIENDS_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList("ch:allAvatars", selectMembersForAvatarPicker, new -$$Lambda$lGgHchpIVj0aikiSANgOv1FeDgw(ainw));
    }

    public final List<LastReceivedNotViewedUpdateMessage> e(Long[] lArr) {
        return this.c.query(MessageRecord.FACTORY.getLastReceivedNotViewedUpdateMessage(this.d.b(), lArr), LegacyMessageQueries.LAST_UPDATE_MESSAGE_ROW_MAPPER);
    }

    public final long f(String str) {
        return this.g.b(str);
    }

    /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            if (r2 != null) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:16:0x002d, code skipped:
            if (r3 != null) goto L_0x002f;
     */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            r2.close();
     */
    /* JADX WARNING: Missing block: B:19:0x0033, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0034, code skipped:
            r3.addSuppressed(r2);
     */
    /* JADX WARNING: Missing block: B:21:0x0038, code skipped:
            r2.close();
     */
    public final com.snap.core.db.record.FeedRecord.BasicFeedInfo f(long r2) {
        /*
        r1 = this;
        r0 = com.snap.core.db.record.FeedRecord.FACTORY;
        r2 = r0.getBasicFeedInfoById(r2);
        r3 = r1.c;
        r2 = r3.query(r2);
        r3 = 0;
        r0 = r2.moveToFirst();	 Catch:{ Throwable -> 0x0029 }
        if (r0 == 0) goto L_0x0021;
    L_0x0013:
        r0 = com.snap.core.db.record.FeedRecord.BASIC_FEED_INFO_BY_ID_MAPPER;	 Catch:{ Throwable -> 0x0029 }
        r0 = r0.map(r2);	 Catch:{ Throwable -> 0x0029 }
        r0 = (com.snap.core.db.record.FeedRecord.BasicFeedInfo) r0;	 Catch:{ Throwable -> 0x0029 }
        if (r2 == 0) goto L_0x0020;
    L_0x001d:
        r2.close();
    L_0x0020:
        return r0;
    L_0x0021:
        if (r2 == 0) goto L_0x0026;
    L_0x0023:
        r2.close();
    L_0x0026:
        return r3;
    L_0x0027:
        r0 = move-exception;
        goto L_0x002b;
    L_0x0029:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0027 }
    L_0x002b:
        if (r2 == 0) goto L_0x003b;
    L_0x002d:
        if (r3 == 0) goto L_0x0038;
    L_0x002f:
        r2.close();	 Catch:{ Throwable -> 0x0033 }
        goto L_0x003b;
    L_0x0033:
        r2 = move-exception;
        r3.addSuppressed(r2);
        goto L_0x003b;
    L_0x0038:
        r2.close();
    L_0x003b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.f(long):com.snap.core.db.record.FeedRecord$BasicFeedInfo");
    }

    public final ajdp<List<ForFeed>> g(long j) {
        ainx selectMembersForFeed = FeedMemberRecord.FACTORY.selectMembersForFeed(j);
        DbClient dbClient = this.c;
        ainw ainw = LegacyFeedMemberQueries.SELECT_FEED_MEMBERS_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList("ch:friendDisplayName", selectMembersForFeed, new -$$Lambda$J4bfkxLvniLtfUpyFVICggHRbsQ(ainw));
    }

    public final String g(String str) {
        return (String) this.c.queryFirst(FeedRecord.FACTORY.getDisplayNameByKey(str, FeedKind.GROUP), FeedRecord.FACTORY.getDisplayNameByKeyMapper());
    }

    public final ajdp<List<AllParticipants>> h(long j) {
        ainx selectAllParticipantsForFeed = FeedMemberRecord.FACTORY.selectAllParticipantsForFeed(j);
        DbClient dbClient = this.c;
        ainw ainw = LegacyFeedMemberQueries.SELECT_ALL_FEED_PARTICIPANTS_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList("ch:allFeedMemberDetails", selectAllParticipantsForFeed, new -$$Lambda$8_U9m-yGoWpAEqmo3FR6eTMdbkU(ainw));
    }

    public final SnapUpdateInfo h(String str) {
        return (SnapUpdateInfo) this.c.queryFirst(MessageRecord.FACTORY.getSnapMessageInfoForKey(str), LegacyMessageQueries.SNAP_UPDATE_INFO_MAPPER);
    }

    public final ajdx<List<String>> i(long j) {
        Long a = a();
        DbClient dbClient = this.c;
        ainx friendUserIdsForGroup = FeedMemberRecord.FACTORY.getFriendUserIdsForGroup(j, a.longValue());
        ainw friendUserIdsForGroupMapper = FeedMemberRecord.FACTORY.getFriendUserIdsForGroupMapper();
        friendUserIdsForGroupMapper.getClass();
        return dbClient.queryAndMapToList(friendUserIdsForGroup, new -$$Lambda$UgNF7jcDcu7N_NG0A125XsdZ_Q8(friendUserIdsForGroupMapper)).e();
    }

    public final SnapUpdateInfoNew i(String str) {
        return (SnapUpdateInfoNew) this.c.queryFirst(MessageRecord.FACTORY.getSnapMessageInfoForKeyNew(str), LegacyMessageQueries.SNAP_UPDATE_INFO_MAPPER_NEW);
    }

    public final MessageInfo j(String str) {
        return (MessageInfo) this.c.queryFirst(MessageRecord.FACTORY.getMessageByKey(str), LegacyMessageQueries.MESSAGE_INFO_ROW_MAPPER);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x00a9 in {11, 12, 14, 15, 16, 20, 21, 27, 32, 35, 36, 37, 39} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void j(long r14) {
        /*
        r13 = this;
        r0 = r13.d;	 Catch:{ all -> 0x00a7 }
        r0 = r0.b();	 Catch:{ all -> 0x00a7 }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x00a7 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00a7 }
        r1 = com.snap.core.db.record.FeedMemberRecord.FACTORY;	 Catch:{ all -> 0x00a7 }
        r0 = r1.selectMemberNamesForFeed(r14, r0);	 Catch:{ all -> 0x00a7 }
        r1 = r13.c;	 Catch:{ all -> 0x00a7 }
        r0 = r1.query(r0);	 Catch:{ all -> 0x00a7 }
        r1 = 0;
        r2 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0093 }
        r3 = r0.getCount();	 Catch:{ Throwable -> 0x0093 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0093 }
        r3 = r0.moveToNext();	 Catch:{ Throwable -> 0x0093 }
        r4 = 1;	 Catch:{ Throwable -> 0x0093 }
        if (r3 == 0) goto L_0x0050;	 Catch:{ Throwable -> 0x0093 }
        r3 = com.snap.core.db.record.LegacyFeedMemberQueries.SELECT_MEMBER_NAMES_FOR_FEED_MODEL_ROW_MAPPER;	 Catch:{ Throwable -> 0x0093 }
        r3 = r3.map(r0);	 Catch:{ Throwable -> 0x0093 }
        r3 = (com.snap.core.db.record.FeedMemberModel.SelectMemberNamesForFeedModel) r3;	 Catch:{ Throwable -> 0x0093 }
        r5 = r3.display();	 Catch:{ Throwable -> 0x0093 }
        r5 = (java.lang.CharSequence) r5;	 Catch:{ Throwable -> 0x0093 }
        if (r5 == 0) goto L_0x0041;	 Catch:{ Throwable -> 0x0093 }
        r5 = defpackage.akgb.a(r5);	 Catch:{ Throwable -> 0x0093 }
        if (r5 == 0) goto L_0x0040;	 Catch:{ Throwable -> 0x0093 }
        goto L_0x0041;	 Catch:{ Throwable -> 0x0093 }
        r4 = 0;	 Catch:{ Throwable -> 0x0093 }
        if (r4 == 0) goto L_0x0048;	 Catch:{ Throwable -> 0x0093 }
        r3 = r3.username();	 Catch:{ Throwable -> 0x0093 }
        goto L_0x004c;	 Catch:{ Throwable -> 0x0093 }
        r3 = r3.display();	 Catch:{ Throwable -> 0x0093 }
        r2.add(r3);	 Catch:{ Throwable -> 0x0093 }
        goto L_0x0022;	 Catch:{ Throwable -> 0x0093 }
        r3 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0093 }
        r3.<init>();	 Catch:{ Throwable -> 0x0093 }
        r3 = defpackage.res.a(r2, r3);	 Catch:{ Throwable -> 0x0093 }
        r5 = java.lang.String.CASE_INSENSITIVE_ORDER;	 Catch:{ Throwable -> 0x0093 }
        java.util.Collections.sort(r3, r5);	 Catch:{ Throwable -> 0x0093 }
        r5 = ", ";	 Catch:{ Throwable -> 0x0093 }
        r5 = com.google.common.base.Joiner.on(r5);	 Catch:{ Throwable -> 0x0093 }
        r7 = r5.join(r3);	 Catch:{ Throwable -> 0x0093 }
        r5 = new android.text.TextPaint;	 Catch:{ Throwable -> 0x0093 }
        r5.<init>();	 Catch:{ Throwable -> 0x0093 }
        r6 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;	 Catch:{ Throwable -> 0x0093 }
        r8 = defpackage.ret.a(r2, r5, r6, r1);	 Catch:{ Throwable -> 0x0093 }
        r2 = r13.M;	 Catch:{ Throwable -> 0x0093 }
        r2 = r2.get();	 Catch:{ Throwable -> 0x0093 }
        r2 = (com.snap.core.db.record.FeedModel.UpdateParticipantString) r2;	 Catch:{ Throwable -> 0x0093 }
        r3 = r3.size();	 Catch:{ Throwable -> 0x0093 }
        r3 = r3 + r4;	 Catch:{ Throwable -> 0x0093 }
        r9 = (long) r3;	 Catch:{ Throwable -> 0x0093 }
        r6 = r2;	 Catch:{ Throwable -> 0x0093 }
        r11 = r14;	 Catch:{ Throwable -> 0x0093 }
        r6.bind(r7, r8, r9, r11);	 Catch:{ Throwable -> 0x0093 }
        r14 = r13.c;	 Catch:{ Throwable -> 0x0093 }
        r14.executeUpdateDelete(r2);	 Catch:{ Throwable -> 0x0093 }
        if (r0 == 0) goto L_0x0090;
        r0.close();	 Catch:{ all -> 0x00a7 }
        return;
        r14 = move-exception;
        goto L_0x0096;
        r14 = move-exception;
        r1 = r14;
        throw r1;	 Catch:{ all -> 0x0091 }
        if (r0 == 0) goto L_0x00a6;
        if (r1 == 0) goto L_0x00a3;
        r0.close();	 Catch:{ Throwable -> 0x009e }
        goto L_0x00a6;
        r15 = move-exception;
        r1.addSuppressed(r15);	 Catch:{ all -> 0x00a7 }
        goto L_0x00a6;	 Catch:{ all -> 0x00a7 }
        r0.close();	 Catch:{ all -> 0x00a7 }
        throw r14;	 Catch:{ all -> 0x00a7 }
        r14 = move-exception;
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.j(long):void");
    }

    public final ConversationState k(long j) {
        return (ConversationState) this.c.queryFirst(FeedRecord.FACTORY.getConversationState(j), FeedRecord.SELECT_CONVERSATION_STATE);
    }

    public final void k(String str) {
        b(f(str), str);
    }

    public final ajdx<ConversationState> l(long j) {
        ainx conversationState = FeedRecord.FACTORY.getConversationState(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.SELECT_CONVERSATION_STATE;
        ainw.getClass();
        return dbClient.queryAndMapToOneOrError("ch:convstate", conversationState, new -$$Lambda$VLlU0v13ARIC7VdnDCE1O1XpBBg(ainw));
    }

    public final ajdx<GetSnapInfoWithContentFromMessageByMessageIdModel> l(String str) {
        DbClient dbClient = this.c;
        ainx snapInfoWithContentFromMessageByMessageId = MessageRecord.FACTORY.getSnapInfoWithContentFromMessageByMessageId(str);
        ainw ainw = LegacyMessageQueries.GET_SNAP_INFO_WITH_CONTENT_FROM_MESSAGE_BY_MESSAGE_ID_MODEL_ROW_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOneOrError(snapInfoWithContentFromMessageByMessageId, new -$$Lambda$hbpQ_ktPXpySzNrpcfhirufBQHg(ainw));
    }

    public final long m(String str) {
        return ((Long) this.c.queryFirst(MessageRecord.FACTORY.getTimestampByMessageId(str), MessageRecord.FACTORY.getTimestampByMessageIdMapper(), Long.valueOf(0))).longValue();
    }

    public final ajdp<ConversationState> m(long j) {
        ainx conversationState = FeedRecord.FACTORY.getConversationState(j);
        DbClient dbClient = this.c;
        ainw ainw = FeedRecord.SELECT_CONVERSATION_STATE;
        ainw.getClass();
        return dbClient.queryAndMapToOne(conversationState, new -$$Lambda$VLlU0v13ARIC7VdnDCE1O1XpBBg(ainw));
    }

    public final ajdx<BasicInfoForMessageModel> n(long j) {
        ainx basicInfoForMessage = MessageRecord.FACTORY.getBasicInfoForMessage(j);
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessageQueries.BASIC_INFO_FOR_MESSAGE_MODEL_ROW_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToOneOrError(basicInfoForMessage, new -$$Lambda$mqXv4FWNc-QPrAe9Dfu0WqgJG_w(ainw));
    }

    public final String o(long j) {
        ainx basicInfoForMessage = MessageRecord.FACTORY.getBasicInfoForMessage(j);
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessageQueries.BASIC_INFO_FOR_MESSAGE_MODEL_ROW_MAPPER;
        ainw.getClass();
        GetBasicInfoForMessageModel getBasicInfoForMessageModel = (GetBasicInfoForMessageModel) dbClient.queryFirst(basicInfoForMessage, new -$$Lambda$WTfhA72eKOBiJG0MXUCu2op-jdQ(ainw));
        return getBasicInfoForMessageModel != null ? getBasicInfoForMessageModel.key() : null;
    }

    public final String p(long j) {
        return (String) this.c.queryFirst(MessageRecord.FACTORY.getViewerDisplayNameForDirectMessage(j), MessageRecord.FACTORY.getViewerDisplayNameForDirectMessageMapper());
    }

    public final ajdp<List<MessageRecord.PlayableSnap>> q(long j) {
        DbClient dbClient = this.c;
        ainx playableSnapsForFeed = MessageRecord.FACTORY.getPlayableSnapsForFeed(Long.valueOf(j), SnapServerStatus.DELIVERED, aesq.SNAP.a(), this.d.b());
        ainw ainw = LegacyMessageQueries.SELECT_PLAYABLE_SNAP_MESSAGES_MAPPER;
        ainw.getClass();
        return dbClient.queryAndMapToList(playableSnapsForFeed, new -$$Lambda$j12GDzDii5FI5iSOLvHVrOb28cM(ainw));
    }

    public final List<GetSnapsOlderThanTimestampModel> r(long j) {
        ainx snapsOlderThanTimestamp = MessageRecord.FACTORY.getSnapsOlderThanTimestamp(aesq.SNAP.a(), SnapServerStatus.DELIVERED, j);
        DbClient dbClient = this.c;
        ainw ainw = LegacyMessageQueries.GET_SNAPS_OLDER_THAN_TIMESTAMP_MODEL_ROW_MAPPER;
        ainw.getClass();
        return dbClient.query(snapsOlderThanTimestamp, new -$$Lambda$XmbOvhpJknAZ3CHcicG29r3hhDI(ainw));
    }

    public final ajdx<Boolean> s(long j) {
        return ajdx.a(a(j), this.d.c().e(), -$$Lambda$qvd$Wa1UgIXLJ636jf7SXCFLF8g9jRc.INSTANCE);
    }
}
