package com.snap.core.db.record;

import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.record.FeedMemberModel.SelectParticipantDetailsForFeedCreator;
import com.snap.core.db.record.FeedMemberModel.SelectParticipantDetailsForFeedModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$7O2OEoZTkMqS_AL6fZMQmccWYXw implements SelectParticipantDetailsForFeedCreator {
    public static final /* synthetic */ -$$Lambda$7O2OEoZTkMqS_AL6fZMQmccWYXw INSTANCE = new -$$Lambda$7O2OEoZTkMqS_AL6fZMQmccWYXw();

    private /* synthetic */ -$$Lambda$7O2OEoZTkMqS_AL6fZMQmccWYXw() {
    }

    public final SelectParticipantDetailsForFeedModel create(long j, Integer num, String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis) {
        return new AutoValue_FeedMemberRecord_Participant(j, num, str, str2, str3, str4, str5, friendmojis);
    }
}
