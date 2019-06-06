package defpackage;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiDict;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiForType;
import java.util.List;
import java.util.Map;

/* renamed from: iqz */
public interface iqz {
    ajcx a(Map<String, ? extends aejy> map);

    ajdp<List<FriendmojiDict>> a();

    ajdp<List<FriendmojiForType>> a(FriendmojiType friendmojiType);

    void a(aevu aevu);

    void a(DbTransaction dbTransaction, aeze aeze, String str);

    void b(Map<String, ? extends aezc> map);
}
