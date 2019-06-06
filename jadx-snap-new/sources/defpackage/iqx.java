package defpackage;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord.DisplayInfo;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: iqx */
public interface iqx {
    long a(ahbl ahbl, DbTransaction dbTransaction);

    String a();

    List<String> a(long[] jArr);

    Map<String, Long> a(FriendLinkType friendLinkType, long j);

    Map<String, Long> a(Collection<String> collection);

    ajdp<List<DisplayInfo>> b();

    String d(String str);

    Map<String, String> e(List<String> list);

    long f(String str);

    long g(String str);
}
