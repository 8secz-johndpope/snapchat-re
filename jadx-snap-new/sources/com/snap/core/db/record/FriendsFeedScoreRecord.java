package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.FriendsFeedScoreModel.SelectAllFeedsForScoringModel;

@AutoValue
public abstract class FriendsFeedScoreRecord implements FriendsFeedScoreModel {

    @AutoValue
    public static abstract class ForScoring implements SelectAllFeedsForScoringModel {
        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }
    }
}
