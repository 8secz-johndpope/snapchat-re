package com.snap.core.db.record;

import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryModel.SelectUserManagedStoriesCreator;
import com.snap.core.db.record.StoryModel.SelectUserManagedStoriesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Euz1DZDNjCKlKWa3u693SiE1HcE implements SelectUserManagedStoriesCreator {
    public static final /* synthetic */ -$$Lambda$Euz1DZDNjCKlKWa3u693SiE1HcE INSTANCE = new -$$Lambda$Euz1DZDNjCKlKWa3u693SiE1HcE();

    private /* synthetic */ -$$Lambda$Euz1DZDNjCKlKWa3u693SiE1HcE() {
    }

    public final SelectUserManagedStoriesModel create(long j, StoryKind storyKind) {
        return new AutoValue_StoryRecord_UserManagedStoryRecord(j, storyKind);
    }
}
