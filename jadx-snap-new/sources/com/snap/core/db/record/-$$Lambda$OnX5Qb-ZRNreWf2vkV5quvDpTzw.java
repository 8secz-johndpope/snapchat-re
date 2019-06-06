package com.snap.core.db.record;

import com.snap.core.db.column.StoryNoteType;
import com.snap.core.db.record.StoryNoteModel.SelectStoryNotesCreator;
import com.snap.core.db.record.StoryNoteModel.SelectStoryNotesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$OnX5Qb-ZRNreWf2vkV5quvDpTzw implements SelectStoryNotesCreator {
    public static final /* synthetic */ -$$Lambda$OnX5Qb-ZRNreWf2vkV5quvDpTzw INSTANCE = new -$$Lambda$OnX5Qb-ZRNreWf2vkV5quvDpTzw();

    private /* synthetic */ -$$Lambda$OnX5Qb-ZRNreWf2vkV5quvDpTzw() {
    }

    public final SelectStoryNotesModel create(Long l, String str, Boolean bool, boolean z, StoryNoteType storyNoteType, boolean z2) {
        return new AutoValue_StoryNoteRecord_SelectStoryNotesRecord(l, str, bool, z, storyNoteType, z2);
    }
}
