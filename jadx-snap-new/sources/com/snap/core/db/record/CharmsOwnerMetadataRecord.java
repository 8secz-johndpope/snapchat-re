package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.CharmsOwnerMetadataModel.Creator;
import com.snap.core.db.record.CharmsOwnerMetadataModel.Factory;
import defpackage.akcb;
import defpackage.akco;

@AutoValue
public abstract class CharmsOwnerMetadataRecord implements CharmsOwnerMetadataModel {
    public static final Companion Companion = new Companion();
    private static final Factory<CharmsOwnerMetadataRecord> FACTORY;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<CharmsOwnerMetadataRecord> getFACTORY() {
            return CharmsOwnerMetadataRecord.FACTORY;
        }
    }

    static {
        akcb akcb = CharmsOwnerMetadataRecord$Companion$FACTORY$1.INSTANCE;
        if (akcb != null) {
            akcb = new CharmsOwnerMetadataRecord$sam$com_snap_core_db_record_CharmsOwnerMetadataModel_Creator$0(akcb);
        }
        FACTORY = new Factory((Creator) akcb);
    }
}
