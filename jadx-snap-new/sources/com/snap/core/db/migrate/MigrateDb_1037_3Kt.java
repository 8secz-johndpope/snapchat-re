package com.snap.core.db.migrate;

public final class MigrateDb_1037_3Kt {
    public static final String populateStorySnapStoryRowIdsStatement() {
        return "UPDATE StorySnap \nSET storyRowId = (\n   SELECT Snap.storyRowId\n   FROM Snap\n   WHERE Snap._id = StorySnap.snapRowId\n)";
    }
}
