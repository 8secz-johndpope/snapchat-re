package defpackage;

import android.text.TextUtils;
import defpackage.abjw.a;
import java.util.List;
import java.util.Map;

/* renamed from: rbd */
public final class rbd {
    public final String a;
    final List<String> b;
    public final String c;
    public final String d;
    public final List<String> e;
    final Map<String, a> f;
    final List<String> g;
    public final String h;
    private final boolean i;

    public rbd(boolean z, String str, List<String> list, String str2, String str3, List<String> list2, Map<String, ? extends a> map, List<String> list3, String str4) {
        akcr.b(list, "callParticipantDisplayNames");
        akcr.b(list2, "typingParticipantDisplayNames");
        akcr.b(map, "typingStates");
        akcr.b(list3, "cognacParticipantDisplayNames");
        this.i = z;
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = list2;
        this.f = map;
        this.g = list3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            rbd rbd = (rbd) obj;
            return this.i == rbd.i && TextUtils.equals(this.a, rbd.a) && TextUtils.equals(this.c, rbd.c) && TextUtils.equals(this.d, rbd.d) && akcr.a(this.b, rbd.b) && akcr.a(this.e, rbd.e) && akcr.a(this.f, rbd.f) && akcr.a(this.g, rbd.g) && akcr.a(this.h, rbd.h);
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.messaging.friendsfeed.ui.data.ActiveConversation");
        }
    }

    public final int hashCode() {
        return new akmd().a(this.i).a(this.a).a(this.c).a(this.d).a(this.b).a(this.e).a(this.f).a(this.g).a(this.h).a;
    }
}
