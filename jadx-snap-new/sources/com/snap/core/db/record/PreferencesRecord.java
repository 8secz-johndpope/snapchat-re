package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.PreferencesModel.Factory;
import com.snap.core.db.record.PreferencesModel.SelectByFeatureWithTweakModel;
import com.snap.core.db.record.PreferencesModel.SelectByKeyWithTweakModel;
import defpackage.ainw;

@AutoValue
public abstract class PreferencesRecord implements PreferencesModel {
    public static final Factory<PreferencesRecord> FACTORY;
    public static final ainw<KeysWithTweak> SELECT_FEATUERS_WITH_TWEAK = FACTORY.selectByFeatureWithTweakMapper(-$$Lambda$vcuQA7S1e1miIG2cZmUgDGqJ-s4.INSTANCE);
    public static final ainw<KeysWithTweak> SELECT_KEY_WITH_TWEAK;

    @AutoValue
    public static abstract class KeysWithTweak implements SelectByFeatureWithTweakModel<PreferencesRecord>, SelectByKeyWithTweakModel<PreferencesRecord> {
    }

    static {
        Factory factory = new Factory(-$$Lambda$TwncETa5NJfl3F9Q63FIGXAglrs.INSTANCE);
        FACTORY = factory;
        SELECT_KEY_WITH_TWEAK = factory.selectByKeyWithTweakMapper(-$$Lambda$LKHOkmga3w1vcv1OE8J6EuGhn7A.INSTANCE);
    }
}
