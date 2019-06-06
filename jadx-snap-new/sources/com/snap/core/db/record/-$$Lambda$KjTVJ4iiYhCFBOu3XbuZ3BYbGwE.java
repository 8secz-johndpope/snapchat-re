package com.snap.core.db.record;

import com.snap.core.db.column.StoryNoteType;
import com.snap.core.db.record.StoryNoteModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$KjTVJ4iiYhCFBOu3XbuZ3BYbGwE implements Creator {
    public static final /* synthetic */ -$$Lambda$KjTVJ4iiYhCFBOu3XbuZ3BYbGwE INSTANCE = new -$$Lambda$KjTVJ4iiYhCFBOu3XbuZ3BYbGwE();

    private /* synthetic */ -$$Lambda$KjTVJ4iiYhCFBOu3XbuZ3BYbGwE() {
    }

    public final StoryNoteModel create(long j, String str, long j2, Long l, String str2, Boolean bool, boolean z, StoryNoteType storyNoteType, boolean z2) {
        return new AutoValue_StoryNoteRecord(j, str, j2, l, str2, bool, z, storyNoteType, z2);
    }
}
