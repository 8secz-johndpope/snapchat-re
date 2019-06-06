package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.MessageRecipientsColumnAdapter;
import com.snap.core.db.record.MultiRecipientSnapModel.Factory;
import com.snap.core.db.record.MultiRecipientSnapModel.SelectMultiRecipientSnapsModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class MultiRecipientSnapRecord implements MultiRecipientSnapModel {
    public static final Factory<MultiRecipientSnapRecord> FACTORY;
    public static final ainw<MultiRecipientSnap> MAPPER;
    private static final ainu MESSAGE_RECIPIENTS_COLUMN_ADAPTER = new MessageRecipientsColumnAdapter();

    @AutoValue
    public static abstract class MultiRecipientSnap implements SelectMultiRecipientSnapsModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$-c9aFPFkYHxsVlWSEW0Sp9GQGNA.INSTANCE, MESSAGE_RECIPIENTS_COLUMN_ADAPTER);
        FACTORY = factory;
        MAPPER = factory.selectMultiRecipientSnapsMapper(-$$Lambda$Lgw4a4KC1nmxIhtC88yBNys6ldY.INSTANCE);
    }
}
