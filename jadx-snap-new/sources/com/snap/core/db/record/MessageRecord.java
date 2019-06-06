package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.ScreenshottedOrReplayedStateAdapter;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.Factory;
import com.snap.core.db.record.MessageModel.GetBasicInfoForMessageModel;
import com.snap.core.db.record.MessageModel.GetContentForMessagesModel;
import com.snap.core.db.record.MessageModel.GetLastMessageForFeedExcludingStatusModel;
import com.snap.core.db.record.MessageModel.GetLastMessageForMessageClientStatusModel;
import com.snap.core.db.record.MessageModel.GetLastReceivedNotViewedChatModel;
import com.snap.core.db.record.MessageModel.GetLastReceivedNotViewedUpdateMessageModel;
import com.snap.core.db.record.MessageModel.GetLastReceivedViewedChatModel;
import com.snap.core.db.record.MessageModel.GetLastReleasedChatModel;
import com.snap.core.db.record.MessageModel.GetLastSentNotViewedChatModel;
import com.snap.core.db.record.MessageModel.GetLastSentSnapForMessageModel;
import com.snap.core.db.record.MessageModel.GetLastSentViewedChatModel;
import com.snap.core.db.record.MessageModel.GetLastViewedMessageModel;
import com.snap.core.db.record.MessageModel.GetMessageByKeyModel;
import com.snap.core.db.record.MessageModel.GetMessageInfoForDifferentialUpdateModel;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForIdModel;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForKeyModel;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForSnapIdModel;
import com.snap.core.db.record.MessageModel.GetMessagesForFeedModel;
import com.snap.core.db.record.MessageModel.GetPlayableSnapsForFeedModel;
import com.snap.core.db.record.MessageModel.GetReceivedSnapsModel;
import com.snap.core.db.record.MessageModel.GetSnapInfoForDifferentialUpdateModel;
import com.snap.core.db.record.MessageModel.GetSnapInfoFromMessageByMessageIdModel;
import com.snap.core.db.record.MessageModel.GetSnapInfoWithContentFromMessageByMessageIdModel;
import com.snap.core.db.record.MessageModel.GetSnapMessageInfoForKeyModel;
import com.snap.core.db.record.MessageModel.GetSnapMessageInfoForKeyNewModel;
import com.snap.core.db.record.MessageModel.GetSnapMetadataForMessageIdModel;
import com.snap.core.db.record.MessageModel.GetSnapOperaInfoByRowIdModel;
import com.snap.core.db.record.MessageModel.GetSnapStatesByIdsModel;
import com.snap.core.db.record.MessageModel.GetSnapsFromMessageForFeedModel;
import com.snap.core.db.record.MessageModel.GetSnapsOlderThanTimestampModel;
import com.snap.core.db.record.MessageModel.MessageDumpModel;
import defpackage.aewk;
import defpackage.ainu;
import defpackage.ainv;
import defpackage.ajxs;
import defpackage.ajym;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajzm;
import defpackage.akcr;
import defpackage.akgc;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.yfl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@AutoValue
public abstract class MessageRecord implements MessageModel {
    public static final Factory<MessageRecord> FACTORY = new Factory(-$$Lambda$g3ObW2xUE7i-j7sXCaQ_CPY876Y.INSTANCE, MESSAGE_CLIENT_STATUS_STRING_COLUMN_ADAPTER, MESSAGE_PRESERVATION_COLUMN_ADAPTER, SAVE_STATE_COLUMN_ADAPTER, SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER, SNAP_SERVER_STATUS_ADAPTER, VIEWER_LIST_COLUMN_ADAPTER);
    public static final ainu<MessageClientStatus, String> MESSAGE_CLIENT_STATUS_STRING_COLUMN_ADAPTER = ainv.a(MessageClientStatus.class);
    public static final ainu<gcj, Long> MESSAGE_PRESERVATION_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(gcj.class);
    public static final ainu<gcm, String> SAVE_STATE_COLUMN_ADAPTER = new ainu<gcm, String>() {
        public final gcm decode(String str) {
            String str2;
            Object obj;
            akcr.b(str, "savedStates");
            Collection arrayList = new ArrayList();
            Iterator it = akgc.a((CharSequence) str, new String[]{":"}, 0, 6).iterator();
            while (true) {
                str2 = "=";
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                obj = (String) next;
                if ((akcr.a(obj, (Object) "") ^ 1) == 0 || akgc.a((CharSequence) obj, new String[]{str2}, 0, 6).size() != 3) {
                    i = 0;
                }
                if (i != 0) {
                    arrayList.add(next);
                }
            }
            Iterable<String> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (String a : iterable) {
                List a2 = akgc.a((CharSequence) a, new String[]{str2}, 0, 6);
                obj = a2.get(0);
                aewk aewk = new aewk();
                aewk.b = Integer.valueOf(Integer.parseInt((String) a2.get(1)));
                aewk.a = Boolean.valueOf(Boolean.parseBoolean((String) a2.get(2)));
                arrayList2.add(ajxs.a(obj, aewk));
            }
            return new gcm(ajzm.a((Iterable) (List) arrayList2), (byte) 0);
        }

        public final String encode(gcm gcm) {
            Map map = gcm.a;
            Collection arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(ajyu.a((Iterable) ajym.b((Object[]) new String[]{(String) entry.getKey(), String.valueOf(((aewk) entry.getValue()).b.intValue()), String.valueOf(((aewk) entry.getValue()).a.booleanValue())}), (CharSequence) "=", null, null, 0, null, null, 62));
            }
            return ajyu.a((Iterable) (List) arrayList, (CharSequence) ":", null, null, 0, null, null, 62);
        }
    };
    public static final ainu<ScreenshottedOrReplayedState, String> SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER = new ScreenshottedOrReplayedStateAdapter();
    public static final ainu<SnapServerStatus, String> SNAP_SERVER_STATUS_ADAPTER = ainv.a(SnapServerStatus.class);
    public static final yfl VIEWER_LIST_COLUMN_ADAPTER = new yfl();

    @AutoValue
    public static abstract class MessageDifferentialInfo implements GetMessageInfoForDifferentialUpdateModel {
    }

    @AutoValue
    public static abstract class LastReceivedNotViewedChat implements GetLastReceivedNotViewedChatModel {
        public boolean isGroup() {
            return MessageRecord.isGroup(kind());
        }

        public boolean isPreserved() {
            return MessageRecord.isPreserved(preserved());
        }

        public boolean isSaved() {
            return MessageRecord.isSaved(savedStates());
        }
    }

    @AutoValue
    public static abstract class BasicInfoForMessageModel implements GetBasicInfoForMessageModel {
    }

    @AutoValue
    public static abstract class GetContentForMessageModel implements GetContentForMessagesModel {
    }

    @AutoValue
    public static abstract class GetSnapInfoFromMessageWithMessageIdModel implements GetSnapInfoFromMessageByMessageIdModel {
    }

    @AutoValue
    public static abstract class GetSnapInfoWithContentFromMessageByMessageId implements GetSnapInfoWithContentFromMessageByMessageIdModel {
    }

    @AutoValue
    public static abstract class GetSnapOperaInfo implements GetSnapOperaInfoByRowIdModel {
    }

    @AutoValue
    public static abstract class GetSnapStatesByMessageIds implements GetSnapStatesByIdsModel {
    }

    @AutoValue
    public static abstract class GetSnapsForFeed implements GetSnapsFromMessageForFeedModel {
    }

    @AutoValue
    public static abstract class GetUnviewedSnapIdsOlderThanTimestamp implements GetSnapsOlderThanTimestampModel {
    }

    @AutoValue
    public static abstract class LastMessage implements GetLastMessageForFeedExcludingStatusModel {
    }

    @AutoValue
    public static abstract class LastMessageWithClientStatus implements GetLastMessageForMessageClientStatusModel {
    }

    @AutoValue
    public static abstract class LastReceivedNotViewedUpdateMessage implements GetLastReceivedNotViewedUpdateMessageModel {
        public boolean isGroup() {
            return MessageRecord.isGroup(kind());
        }

        public boolean isPreserved() {
            return MessageRecord.isPreserved(preserved());
        }

        public boolean isSaved() {
            return MessageRecord.isSaved(savedStates());
        }
    }

    @AutoValue
    public static abstract class LastReceivedViewedChat implements GetLastReceivedViewedChatModel {
    }

    @AutoValue
    public static abstract class LastReleasedChat implements GetLastReleasedChatModel {
    }

    @AutoValue
    public static abstract class LastSentNotViewedChat implements GetLastSentNotViewedChatModel {
    }

    @AutoValue
    public static abstract class LastSentSnapModel implements GetLastSentSnapForMessageModel {
    }

    @AutoValue
    public static abstract class LastSentViewedChat implements GetLastSentViewedChatModel {
    }

    @AutoValue
    public static abstract class LastViewedMessageModel implements GetLastViewedMessageModel {
    }

    @AutoValue
    public static abstract class MessageDump implements MessageDumpModel {
    }

    @AutoValue
    public static abstract class MessageInfo implements GetMessageByKeyModel {
    }

    @AutoValue
    public static abstract class MessageMediaForIdInfo implements GetMessageMediaInfoForIdModel {
    }

    @AutoValue
    public static abstract class MessageMediaForKeyInfo implements GetMessageMediaInfoForKeyModel {
    }

    @AutoValue
    public static abstract class MischiefPlayableSnapInfo implements GetMessageMediaInfoForSnapIdModel {
    }

    @AutoValue
    public static abstract class PlayableSnap implements GetPlayableSnapsForFeedModel {
    }

    @AutoValue
    public static abstract class ReceivedSnapsModel implements GetReceivedSnapsModel {
    }

    @AutoValue
    public static abstract class SnapDifferentialInfo implements GetSnapInfoForDifferentialUpdateModel {
    }

    @AutoValue
    public static abstract class SnapMetadata implements GetSnapMetadataForMessageIdModel {
        public boolean isGroup() {
            return MessageRecord.isGroup(feedKind());
        }
    }

    @AutoValue
    public static abstract class SnapUpdateInfo implements GetSnapMessageInfoForKeyModel {
    }

    @AutoValue
    public static abstract class SnapUpdateInfoNew implements GetSnapMessageInfoForKeyNewModel {
    }

    @AutoValue
    public static abstract class WithFriend implements GetMessagesForFeedModel {
        public boolean isGroup() {
            return MessageRecord.isGroup(feedKind());
        }

        public boolean isNonImmediateDirectConversation() {
            return (isGroup() || messageRetentionInMinutes() == null || messageRetentionInMinutes().longValue() <= 0) ? false : true;
        }

        public boolean isPreserved() {
            return MessageRecord.isPreserved(preserved());
        }

        public boolean isSaved() {
            return MessageRecord.isSaved(savedStates());
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithFriend{_id=");
            stringBuilder.append(_id());
            stringBuilder.append(", key=");
            stringBuilder.append(key());
            stringBuilder.append(", type=");
            stringBuilder.append(type());
            stringBuilder.append(", timestamp=");
            stringBuilder.append(timestamp());
            stringBuilder.append(", seenTimestamp=");
            stringBuilder.append(seenTimestamp());
            stringBuilder.append(", feedRowId=");
            stringBuilder.append(feedRowId());
            stringBuilder.append(", content=<REDACTED>, savedStates=");
            stringBuilder.append(savedStates());
            stringBuilder.append(", clientStatus=");
            stringBuilder.append(clientStatus());
            stringBuilder.append(", sequenceNumber=");
            stringBuilder.append(sequenceNumber());
            stringBuilder.append(", feedKey=");
            stringBuilder.append(feedKey());
            stringBuilder.append(", released=");
            stringBuilder.append(released());
            stringBuilder.append(", senderDisplayName=");
            stringBuilder.append(senderDisplayName());
            stringBuilder.append(", senderUsername=");
            stringBuilder.append(senderUsername());
            stringBuilder.append(", snapServerStatus=");
            stringBuilder.append(snapServerStatus());
            stringBuilder.append(", newSnapServerStatus=");
            stringBuilder.append(newSnapServerStatus());
            stringBuilder.append(", viewerList=");
            stringBuilder.append(viewerList());
            stringBuilder.append(", newViewerList=");
            stringBuilder.append(newViewerList());
            stringBuilder.append(", screenshotOrReplayed=");
            stringBuilder.append(screenshotOrReplayed());
            stringBuilder.append(", newScreenshotOrReplayed=");
            stringBuilder.append(newScreenshotOrReplayed());
            stringBuilder.append(", snapReplyMedia=");
            stringBuilder.append(snapReplyMedia());
            stringBuilder.append(", snapType=");
            stringBuilder.append(snapType());
            stringBuilder.append(", snapRowId=");
            stringBuilder.append(snapRowId());
            stringBuilder.append(", feedKind=");
            stringBuilder.append(feedKind());
            stringBuilder.append(", preserved=");
            stringBuilder.append(preserved());
            stringBuilder.append(", senderColor=");
            stringBuilder.append(senderColor());
            stringBuilder.append(", messageRetentionInMinutes=");
            stringBuilder.append(messageRetentionInMinutes());
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private static boolean isGroup(FeedKind feedKind) {
        return feedKind == FeedKind.GROUP;
    }

    private static boolean isPreserved(gcj gcj) {
        return gcj == gcj.PRESERVED;
    }

    private static boolean isSaved(gcm gcm) {
        if (gcm == null) {
            return false;
        }
        for (aewk aewk : gcm.a.values()) {
            if (aewk.a.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
