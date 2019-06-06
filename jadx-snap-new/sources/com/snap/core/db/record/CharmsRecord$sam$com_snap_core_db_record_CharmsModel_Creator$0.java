package com.snap.core.db.record;

import com.snap.core.db.column.CharmDataSourceType;
import com.snap.core.db.column.CharmOwnerType;
import com.snap.core.db.record.CharmsModel.Creator;
import defpackage.akby;
import defpackage.akcr;

final class CharmsRecord$sam$com_snap_core_db_record_CharmsModel_Creator$0 implements Creator {
    private final /* synthetic */ akby function;

    CharmsRecord$sam$com_snap_core_db_record_CharmsModel_Creator$0(akby akby) {
        this.function = akby;
    }

    public final /* synthetic */ CharmsModel create(long j, String str, long j2, CharmOwnerType charmOwnerType, String str2, String str3, String str4, String str5, String str6, long j3, long j4, long j5, String str7, String str8, String str9, String str10, String str11, String str12, CharmDataSourceType charmDataSourceType, long j6, Long l) {
        String str13 = str;
        CharmOwnerType charmOwnerType2 = charmOwnerType;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        CharmDataSourceType charmDataSourceType2 = charmDataSourceType;
        Long l2 = l;
        akcr.b(str, "ownerId");
        akcr.b(charmOwnerType, CharmsModel.OWNERTYPE);
        akcr.b(str2, "displayName");
        akcr.b(str3, CharmsModel.DESCRIPTIONTEMPLATE);
        akcr.b(str7, CharmsModel.STATICIMAGESTICKERID);
        akcr.b(str12, CharmsModel.LOCALE);
        akcr.b(charmDataSourceType, "source");
        return (CharmsModel) this.function.invoke(Long.valueOf(j), str13, Long.valueOf(j2), charmOwnerType2, str14, str15, str16, str17, str18, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), str19, str20, str21, str22, str23, str24, charmDataSourceType2, Long.valueOf(j6), l2);
    }
}
