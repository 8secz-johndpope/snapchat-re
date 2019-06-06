package defpackage;

import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ira.a;
import java.util.List;

/* renamed from: jtf */
public final class jtf extends ajed implements jtg {
    private final ajei a = new ajei();
    private final ajwy<ira> b;

    public jtf(ajwy<ira> ajwy) {
        akcr.b(ajwy, "identityApi");
        this.b = ajwy;
    }

    public final void a(FriendSuggestionPlacement friendSuggestionPlacement, long j, List<a> list, List<a> list2) {
        akcr.b(friendSuggestionPlacement, "friendSuggestionPlacement");
        akcr.b(list, "addedMeRequests");
        akcr.b(list2, "quickAddFriends");
        ajej c = ((ira) this.b.get()).a(friendSuggestionPlacement, j, (List) list, (List) list2).c();
        akcr.a((Object) c, "identityApi.get().seenSu…             .subscribe()");
        ajvv.a(c, this.a);
    }

    public final void onDispose() {
        this.a.dispose();
    }
}
