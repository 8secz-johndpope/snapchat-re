package defpackage;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord.FriendInfoAndLinkType;
import java.util.List;
import java.util.Map;

/* renamed from: iqw */
public interface iqw {
    ajcx a(String str, boolean z);

    String a(String str);

    List<Long> a(List<String> list);

    FriendLinkType b(String str);

    Map<String, FriendLinkType> b(List<String> list);

    Long c(String str);

    Map<String, FriendLinkType> c(List<String> list);

    ajdx<List<FriendInfoAndLinkType>> d(List<? extends FriendLinkType> list);

    String d(String str);

    Long e(String str);
}
