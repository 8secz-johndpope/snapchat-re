package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.google.common.base.Joiner;
import com.snap.core.db.record.NetworkMessageModel.Factory;
import com.snap.core.db.record.NetworkMessageModel.GetIdAndTypeForMessageIdModel;
import com.snap.core.db.record.NetworkMessageModel.GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel;
import com.snap.core.db.record.NetworkMessageModel.GetUnreleasedMessagesForConversationModel;
import defpackage.aewk;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.ppy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class NetworkMessageRecord implements NetworkMessageModel {
    public static final Factory<NetworkMessageRecord> FACTORY;
    public static final ainw<GetIdAndTypeForMessageIdModel> ID_AND_TYPE_FOR_MESSAGE_ID_MODEL_ROW_MAPPER;
    public static final ainw<UnreleasedMessage> UNRELEASED_MESSAGES_ROW_MAPPER = FACTORY.getUnreleasedMessagesForConversationMapper(-$$Lambda$OnneXnuJrx9kxiC6PJagC6sptho.INSTANCE);
    public static final ainw<UnreleasedMessagesWithType> UNRELEASED_MESSAGES_WITH_TYPE_ROW_MAPPER = FACTORY.getMessagesYetToBeReleasedUpToAndIncludingSequenceNumberMapper(-$$Lambda$9n-ASvoTb_5k1VIH8b0GUPN9UAg.INSTANCE);
    private static final ainu<List<String>, String> USER_ID_STRING_COLUMN_ADAPTER = new ainu<List<String>, String>() {
        public final List<String> decode(String str) {
            return new ArrayList(Arrays.asList(str.split(ppy.b)));
        }

        public final String encode(List<String> list) {
            return Joiner.on(',').join((Iterable) list);
        }
    };

    @AutoValue
    public static abstract class IdAndTypeForMessageId implements GetIdAndTypeForMessageIdModel {
    }

    @AutoValue
    public static abstract class UnreleasedMessage implements GetUnreleasedMessagesForConversationModel {
    }

    @AutoValue
    public static abstract class UnreleasedMessagesWithType implements GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel {
    }

    static {
        -$$Lambda$WwdbzjF5dJEPcuZuVFgH8DXz1hE -__lambda_wwdbzjf5djepcuzuvfgh8dxz1he = -$$Lambda$WwdbzjF5dJEPcuZuVFgH8DXz1hE.INSTANCE;
        ainu ainu = USER_ID_STRING_COLUMN_ADAPTER;
        Factory factory = new Factory(-__lambda_wwdbzjf5djepcuzuvfgh8dxz1he, ainu, ainu, MessageRecord.MESSAGE_CLIENT_STATUS_STRING_COLUMN_ADAPTER, MessageRecord.MESSAGE_PRESERVATION_COLUMN_ADAPTER, MessageRecord.SAVE_STATE_COLUMN_ADAPTER, MessageRecord.SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER, MessageRecord.SNAP_SERVER_STATUS_ADAPTER, MessageRecord.VIEWER_LIST_COLUMN_ADAPTER);
        FACTORY = factory;
        ID_AND_TYPE_FOR_MESSAGE_ID_MODEL_ROW_MAPPER = factory.getIdAndTypeForMessageIdMapper(-$$Lambda$jAVcs6PklJOM22wiN_mExIB1GRI.INSTANCE);
    }

    public boolean isPreserved() {
        return preserved() == gcj.PRESERVED;
    }

    public boolean isSaved() {
        gcm savedStates = savedStates();
        if (savedStates == null) {
            return false;
        }
        for (aewk aewk : savedStates.a.values()) {
            if (aewk.a.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
