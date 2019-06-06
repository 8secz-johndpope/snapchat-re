package com.snap.stories.job;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.ymh;
import defpackage.ymj;

@hwk(a = "MY_STORY_PRIVACY_SETTINGS_JOB", b = ymj.class)
public final class MyStoryPrivacySettingsDurableJob extends hwg<ymj> {
    public MyStoryPrivacySettingsDurableJob(hwh hwh, ymj ymj) {
        akcr.b(hwh, "jobConfig");
        akcr.b(ymj, StorySyncStateModel.METADATA);
        super(hwh, ymj);
    }

    public /* synthetic */ MyStoryPrivacySettingsDurableJob(ymj ymj) {
        this(ymh.a, ymj);
    }
}
