package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.UploadLocationColumnAdapter;
import com.snap.core.db.record.UploadedMediaModel.Creator;
import com.snap.core.db.record.UploadedMediaModel.Factory;
import defpackage.ainw;
import defpackage.akcf;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class UploadedMediaRecord implements UploadedMediaModel {
    public static final Companion Companion = new Companion();
    private static final Factory<UploadedMediaRecord> FACTORY;
    private static final ainw<UploadedMediaRecord> UPLOADED_MEDIA_MAPPER;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<UploadedMediaRecord> getFACTORY() {
            return UploadedMediaRecord.FACTORY;
        }

        public final ainw<UploadedMediaRecord> getUPLOADED_MEDIA_MAPPER() {
            return UploadedMediaRecord.UPLOADED_MEDIA_MAPPER;
        }
    }

    static {
        akcf akcf = UploadedMediaRecord$Companion$FACTORY$1.INSTANCE;
        if (akcf != null) {
            akcf = new UploadedMediaRecord$sam$com_snap_core_db_record_UploadedMediaModel_Creator$0(akcf);
        }
        Factory factory = new Factory((Creator) akcf, new UploadLocationColumnAdapter());
        FACTORY = factory;
        Object selectUploadedMediaMapper = factory.selectUploadedMediaMapper();
        akcr.a(selectUploadedMediaMapper, "FACTORY.selectUploadedMediaMapper()");
        UPLOADED_MEDIA_MAPPER = (ainw) selectUploadedMediaMapper;
    }
}
