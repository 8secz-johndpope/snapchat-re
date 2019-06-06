package defpackage;

import com.snap.core.db.record.FeedMemberRecord.AllParticipants;
import com.snap.core.db.record.FeedRecord.AvatarInfo;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;
import com.snap.core.db.record.MessageRecord.GetContentForMessageModel;
import java.util.List;
import java.util.Set;

/* renamed from: prx */
public interface prx {
    ajcx a(long j, long j2);

    ajcx a(String str, long j, boolean z, boolean z2);

    ajdp<pqx> a(long j, long j2, Set<String> set);

    ajdx<Boolean> a();

    ajdx<BasicFeedInfo> a(long j);

    ajdx<String> a(List<Long> list, List<String> list2, ahbd ahbd);

    List<String> a(String str);

    ajcx b();

    ajdp<BasicFeedInfo> b(long j);

    ajdx<BasicFeedInfo> b(String str);

    ajcx c();

    ajdp<String> c(long j);

    ajdx<BasicFeedInfo> c(String str);

    ajcx d(String str);

    ajdp<List<AvatarInfo>> d(long j);

    ajdp<List<AllParticipants>> e(long j);

    ajdx<List<psf>> f(long j);

    ajdp<List<psf>> g(long j);

    ajdx<Boolean> h(long j);

    ajdj<GetContentForMessageModel> i(long j);
}
