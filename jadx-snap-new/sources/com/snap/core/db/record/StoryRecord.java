package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryModel.Factory;
import com.snap.core.db.record.StoryModel.SelectAllFriendStoriesModel;
import com.snap.core.db.record.StoryModel.SelectPlayableStoryModel;
import com.snap.core.db.record.StoryModel.SelectUserManagedStoriesModel;
import defpackage.ainu;

@AutoValue
public abstract class StoryRecord implements StoryModel {
    public static final Factory<StoryRecord> FACTORY = new Factory(-$$Lambda$eTxA-QCBW6pbNya6AdDT_IM3d4s.INSTANCE, STORY_KIND_COLUMN_ADAPTER, GROUP_STORY_TYPE_ADAPTER);
    private static final ainu<GroupStoryType, Long> GROUP_STORY_TYPE_ADAPTER = new IntegerEnumColumnAdapter(GroupStoryType.class);
    private static final ainu<StoryKind, Long> STORY_KIND_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(StoryKind.class);

    @AutoValue
    public static abstract class AllInfoRecord implements SelectAllFriendStoriesModel {
    }

    @AutoValue
    public static abstract class PlayableStoryRecord implements SelectPlayableStoryModel {
    }

    @AutoValue
    public static abstract class UserManagedStoryRecord implements SelectUserManagedStoriesModel {
    }
}
