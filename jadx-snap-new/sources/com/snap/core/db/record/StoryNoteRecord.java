package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.StoryNoteType;
import com.snap.core.db.record.StoryNoteModel.Factory;
import com.snap.core.db.record.StoryNoteModel.SelectStoryNotesModel;
import com.snap.core.db.record.StoryNoteModel.SelectStoryNotesViewerSearchModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class StoryNoteRecord implements StoryNoteModel {
    private static final ainu<StoryNoteType, Long> CLIENT_STORY_NOTE_TYPE_ADAPTER = new IntegerEnumColumnAdapter(StoryNoteType.class);
    public static final Factory<StoryNoteRecord> FACTORY;
    public static final ainw<SelectStoryNotesRecord> SELECT_STORY_NOTES_MAPPER = FACTORY.selectStoryNotesMapper(-$$Lambda$OnX5Qb-ZRNreWf2vkV5quvDpTzw.INSTANCE);
    public static final ainw<SelectStoryNotesViewerSearchRecord> SELECT_STORY_NOTES_VIEWER_SEARCH_MAPPER;

    @AutoValue
    public static abstract class SelectStoryNotesRecord implements SelectStoryNotesModel {
    }

    @AutoValue
    public static abstract class SelectStoryNotesViewerSearchRecord implements SelectStoryNotesViewerSearchModel {
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Viewer{displayName=");
            stringBuilder.append(friendDisplayName());
            stringBuilder.append(", viewer=");
            stringBuilder.append(viewer());
            stringBuilder.append(", isScreenshotted=");
            stringBuilder.append(isScreenShotted());
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        Factory factory = new Factory(-$$Lambda$KjTVJ4iiYhCFBOu3XbuZ3BYbGwE.INSTANCE, CLIENT_STORY_NOTE_TYPE_ADAPTER);
        FACTORY = factory;
        SELECT_STORY_NOTES_VIEWER_SEARCH_MAPPER = factory.selectStoryNotesViewerSearchMapper(-$$Lambda$ItkD3o21qTE5JsepQ6i8zsv1L9Q.INSTANCE);
    }
}
