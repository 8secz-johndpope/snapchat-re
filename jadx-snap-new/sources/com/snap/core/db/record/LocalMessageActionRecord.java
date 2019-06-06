package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.google.common.base.Joiner;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.MessageRecipientsColumnAdapter;
import com.snap.core.db.record.LocalMessageActionModel.Factory;
import defpackage.ainu;
import defpackage.gci;
import defpackage.gcj;
import defpackage.ppy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class LocalMessageActionRecord implements LocalMessageActionModel {
    private static final ainu<gci, Long> ACTION_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(gci.class);
    public static final Factory<LocalMessageActionRecord> FACTORY;
    private static final ainu<List<Long>, String> ID_STRING_COLUMN_ADAPTER = new ainu<List<Long>, String>() {
        public final List<Long> decode(String str) {
            return new ArrayList(Arrays.asList(str.split(ppy.b)));
        }

        public final String encode(List<Long> list) {
            return Joiner.on(',').join((Iterable) list);
        }
    };
    private static final ainu<MessageClientStatus, Long> MESSAGE_CLIENT_STATUS_STRING_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(MessageClientStatus.class);
    private static final ainu<gcj, Long> MESSAGE_PRESERVATION_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(gcj.class);
    private static final ainu MESSAGE_RECIPIENTS_COLUMN_ADAPTER = new MessageRecipientsColumnAdapter();

    static {
        -$$Lambda$VXa-5T4IslsWZKsM8BvMG45g9eA -__lambda_vxa-5t4islswzksm8bvmg45g9ea = -$$Lambda$VXa-5T4IslsWZKsM8BvMG45g9eA.INSTANCE;
        ainu ainu = ACTION_TYPE_COLUMN_ADAPTER;
        ainu ainu2 = ID_STRING_COLUMN_ADAPTER;
        FACTORY = new Factory(-__lambda_vxa-5t4islswzksm8bvmg45g9ea, ainu, ainu2, ainu2, MESSAGE_PRESERVATION_COLUMN_ADAPTER, MESSAGE_CLIENT_STATUS_STRING_COLUMN_ADAPTER, MESSAGE_RECIPIENTS_COLUMN_ADAPTER, MessageRecord.SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER, MessageRecord.SNAP_SERVER_STATUS_ADAPTER);
    }
}
