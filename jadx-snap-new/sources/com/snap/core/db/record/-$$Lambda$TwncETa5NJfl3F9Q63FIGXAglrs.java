package com.snap.core.db.record;

import com.snap.core.db.record.PreferencesModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$TwncETa5NJfl3F9Q63FIGXAglrs implements Creator {
    public static final /* synthetic */ -$$Lambda$TwncETa5NJfl3F9Q63FIGXAglrs INSTANCE = new -$$Lambda$TwncETa5NJfl3F9Q63FIGXAglrs();

    private /* synthetic */ -$$Lambda$TwncETa5NJfl3F9Q63FIGXAglrs() {
    }

    public final PreferencesModel create(long j, String str, int i, Boolean bool, Integer num, Long l, Float f, Double d, String str2, Boolean bool2, Long l2) {
        return new AutoValue_PreferencesRecord(j, str, i, bool, num, l, f, d, str2, bool2, l2);
    }
}
