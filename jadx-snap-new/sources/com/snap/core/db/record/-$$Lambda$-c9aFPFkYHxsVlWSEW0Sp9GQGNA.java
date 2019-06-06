package com.snap.core.db.record;

import com.snap.core.db.record.MultiRecipientSnapModel.Creator;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$-c9aFPFkYHxsVlWSEW0Sp9GQGNA implements Creator {
    public static final /* synthetic */ -$$Lambda$-c9aFPFkYHxsVlWSEW0Sp9GQGNA INSTANCE = new -$$Lambda$-c9aFPFkYHxsVlWSEW0Sp9GQGNA();

    private /* synthetic */ -$$Lambda$-c9aFPFkYHxsVlWSEW0Sp9GQGNA() {
    }

    public final MultiRecipientSnapModel create(long j, String str, String str2, String str3, Long l, List list) {
        return new AutoValue_MultiRecipientSnapRecord(j, str, str2, str3, l, list);
    }
}
