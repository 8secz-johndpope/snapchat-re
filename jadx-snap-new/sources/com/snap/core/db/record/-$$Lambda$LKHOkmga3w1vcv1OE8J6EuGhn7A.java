package com.snap.core.db.record;

import com.snap.core.db.record.PreferencesModel.SelectByKeyWithTweakCreator;
import com.snap.core.db.record.PreferencesModel.SelectByKeyWithTweakModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$LKHOkmga3w1vcv1OE8J6EuGhn7A implements SelectByKeyWithTweakCreator {
    public static final /* synthetic */ -$$Lambda$LKHOkmga3w1vcv1OE8J6EuGhn7A INSTANCE = new -$$Lambda$LKHOkmga3w1vcv1OE8J6EuGhn7A();

    private /* synthetic */ -$$Lambda$LKHOkmga3w1vcv1OE8J6EuGhn7A() {
    }

    public final SelectByKeyWithTweakModel create(PreferencesModel preferencesModel, PreferencesModel preferencesModel2) {
        return new AutoValue_PreferencesRecord_KeysWithTweak((PreferencesRecord) preferencesModel, (PreferencesRecord) preferencesModel2);
    }
}
