package com.snap.core.db.query;

import com.snap.core.db.api.column.JsonEnumColumnAdapter;
import com.snap.core.db.column.AutoStackType;
import defpackage.ahyg.a;
import defpackage.ajxk;
import defpackage.akcr;

final class AutoStackTypeColumnAdapter extends JsonEnumColumnAdapter<a, AutoStackType> {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[a.UNFILTERED.ordinal()] = 1;
            $EnumSwitchMapping$0[a.INSTASNAP.ordinal()] = 2;
            $EnumSwitchMapping$0[a.MISS_ETIKATE.ordinal()] = 3;
            $EnumSwitchMapping$0[a.GREYSCALE.ordinal()] = 4;
            $EnumSwitchMapping$0[a.SMOOTHING.ordinal()] = 5;
            $EnumSwitchMapping$0[a.SKY_DAYLIGHT.ordinal()] = 6;
            $EnumSwitchMapping$0[a.SKY_SUNSET.ordinal()] = 7;
            $EnumSwitchMapping$0[a.SKY_NIGHT.ordinal()] = 8;
            $EnumSwitchMapping$0[a.UNRECOGNIZED_VALUE.ordinal()] = 9;
            iArr = new int[AutoStackType.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[AutoStackType.UNFILTERED.ordinal()] = 1;
            $EnumSwitchMapping$1[AutoStackType.INSTASNAP.ordinal()] = 2;
            $EnumSwitchMapping$1[AutoStackType.MISS_ETIKATE.ordinal()] = 3;
            $EnumSwitchMapping$1[AutoStackType.GREYSCALE.ordinal()] = 4;
            $EnumSwitchMapping$1[AutoStackType.SMOOTHING.ordinal()] = 5;
            $EnumSwitchMapping$1[AutoStackType.SKY_DAYLIGHT.ordinal()] = 6;
            $EnumSwitchMapping$1[AutoStackType.SKY_SUNSET.ordinal()] = 7;
            $EnumSwitchMapping$1[AutoStackType.SKY_NIGHT.ordinal()] = 8;
            $EnumSwitchMapping$1[AutoStackType.UNRECOGNIZED_VALUE.ordinal()] = 9;
        }
    }

    public AutoStackTypeColumnAdapter() {
        super(AutoStackType.class);
    }

    public final AutoStackType fromJson(a aVar) {
        akcr.b(aVar, "jsonEnum");
        switch (WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return AutoStackType.UNFILTERED;
            case 2:
                return AutoStackType.INSTASNAP;
            case 3:
                return AutoStackType.MISS_ETIKATE;
            case 4:
                return AutoStackType.GREYSCALE;
            case 5:
                return AutoStackType.SMOOTHING;
            case 6:
                return AutoStackType.SKY_DAYLIGHT;
            case 7:
                return AutoStackType.SKY_SUNSET;
            case 8:
                return AutoStackType.SKY_NIGHT;
            case 9:
                return AutoStackType.UNRECOGNIZED_VALUE;
            default:
                throw new ajxk();
        }
    }

    public final a toJson(AutoStackType autoStackType) {
        akcr.b(autoStackType, "integerEnum");
        switch (WhenMappings.$EnumSwitchMapping$1[autoStackType.ordinal()]) {
            case 1:
                return a.UNFILTERED;
            case 2:
                return a.INSTASNAP;
            case 3:
                return a.MISS_ETIKATE;
            case 4:
                return a.GREYSCALE;
            case 5:
                return a.SMOOTHING;
            case 6:
                return a.SKY_DAYLIGHT;
            case 7:
                return a.SKY_SUNSET;
            case 8:
                return a.SKY_NIGHT;
            case 9:
                return a.UNRECOGNIZED_VALUE;
            default:
                throw new ajxk();
        }
    }
}
