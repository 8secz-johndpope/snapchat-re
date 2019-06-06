package com.snap.core.db.record;

import com.snap.core.db.record.UploadedMediaModel.Creator;
import defpackage.acgp;
import defpackage.akcf;
import defpackage.akcr;

final class UploadedMediaRecord$sam$com_snap_core_db_record_UploadedMediaModel_Creator$0 implements Creator {
    private final /* synthetic */ akcf function;

    UploadedMediaRecord$sam$com_snap_core_db_record_UploadedMediaModel_Creator$0(akcf akcf) {
        this.function = akcf;
    }

    public final /* synthetic */ UploadedMediaModel create(long j, String str, String str2, String str3, String str4, long j2, acgp acgp, long j3) {
        String str5 = str;
        akcr.b(str, UploadedMediaModel.SESSION_ID);
        String str6 = str2;
        akcr.b(str2, UploadedMediaModel.CONTENT_ID);
        String str7 = str3;
        akcr.b(str3, UploadedMediaModel.ENCRYPTION_KEY);
        String str8 = str4;
        akcr.b(str8, UploadedMediaModel.ENCRYPTION_IV);
        acgp acgp2 = acgp;
        akcr.b(acgp2, UploadedMediaModel.UPLOAD_LOCATION);
        return (UploadedMediaModel) this.function.invoke(Long.valueOf(j), str5, str6, str7, str8, Long.valueOf(j2), acgp2, Long.valueOf(j3));
    }
}
