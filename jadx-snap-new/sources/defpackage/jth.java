package defpackage;

import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ira.a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: jth */
public final class jth {
    private long a = System.currentTimeMillis();
    private Set<a> b = new LinkedHashSet();
    private Set<a> c = new LinkedHashSet();
    private final FriendSuggestionPlacement d;
    private final jtg e;

    public jth(FriendSuggestionPlacement friendSuggestionPlacement, jtg jtg) {
        akcr.b(friendSuggestionPlacement, "friendSuggestionPlacement");
        akcr.b(jtg, "addedMeAndQuickAddSeenListener");
        this.d = friendSuggestionPlacement;
        this.e = jtg;
    }

    public final synchronized void a() {
        if (!this.b.isEmpty() || !this.c.isEmpty()) {
            this.e.a(this.d, this.a, ajyu.k(this.c), ajyu.k(this.b));
        }
    }

    public final synchronized void a(a aVar) {
        this.b.add(aVar);
    }

    public final synchronized void b() {
        this.a = System.currentTimeMillis();
        this.b.clear();
        this.c.clear();
    }

    public final synchronized void b(a aVar) {
        this.c.add(aVar);
    }
}
