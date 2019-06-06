package defpackage;

import com.google.common.base.Optional;
import com.snap.core.db.record.MobStoryMetadataRecord.SelectMobStoryMetadataRecord;
import com.snap.core.db.record.StoryNoteRecord.SelectStoryNotesViewerSearchRecord;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StoryRecord.PlayableStoryRecord;
import com.snap.core.db.record.StoryRecord.UserManagedStoryRecord;
import com.snap.core.db.record.StorySnapRecord.BrandFriendliness;
import com.snap.core.db.record.StorySnapRecord.PlayableStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStoryManagementChromeDataRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByStoryRowIdRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByUsernameRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementPlayableStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStoryMetadataRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import java.util.List;
import java.util.Map;

/* renamed from: yhx */
public interface yhx {
    ajdp<List<UserManagedStoryRecord>> a();

    ajdp<StoryRecord> a(long j);

    ajdp<znh<SelectStoryNotesViewerSearchRecord>> a(String str, String str2, long j);

    ajdp<List<StoryManagementStorySnapRecord>> a(List<Long> list, boolean z);

    ajdp<SelectStoryManagementChromeDataRecord> a(ylg ylg);

    ajdx<List<PlayableStorySnapRecord>> a(String str);

    ajdx<Map<String, List<BrandFriendliness>>> a(List<String> list);

    ajdx<Optional<Long>> a(yle yle);

    ajdp<Long> b();

    ajdp<Optional<SelectStorySnapForThumbnailByUsernameRecord>> b(String str);

    ajdp<List<StoryManagementStoryMetadataRecord>> b(List<Long> list);

    ajdp<Optional<StoryRecord>> b(yle yle);

    ajdx<List<PlayableStorySnapRecord>> b(long j);

    ajdp<znh<StoryManagementStorySnapRecord>> c();

    ajdp<Optional<SelectMobStoryMetadataRecord>> c(String str);

    ajdx<PlayableStorySnapRecord> c(long j);

    ajdx<PlayableStoryRecord> d(long j);

    ajdp<Optional<SelectStorySnapForThumbnailByStoryRowIdRecord>> e(long j);

    ajdx<List<StoryManagementPlayableStorySnapRecord>> f(long j);

    ajdx<List<String>> g(long j);
}
