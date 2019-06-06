package com.snap.core.db.record;

import com.snap.core.db.record.PreferencesModel.SelectByFeatureWithTweakCreator;
import com.snap.core.db.record.PreferencesModel.SelectByFeatureWithTweakModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$vcuQA7S1e1miIG2cZmUgDGqJ-s4 implements SelectByFeatureWithTweakCreator {
    public static final /* synthetic */ -$$Lambda$vcuQA7S1e1miIG2cZmUgDGqJ-s4 INSTANCE = new -$$Lambda$vcuQA7S1e1miIG2cZmUgDGqJ-s4();

    private /* synthetic */ -$$Lambda$vcuQA7S1e1miIG2cZmUgDGqJ-s4() {
    }

    public final SelectByFeatureWithTweakModel create(PreferencesModel preferencesModel, PreferencesModel preferencesModel2) {
        return new AutoValue_PreferencesRecord_KeysWithTweak((PreferencesRecord) preferencesModel, (PreferencesRecord) preferencesModel2);
    }
}
