package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: rbf */
public final class rbf {
    public final Map<String, rbd> a;
    final Map<String, rbg> b;

    public rbf(Map<String, ? extends rbd> map, Map<String, ? extends rbg> map2) {
        akcr.b(map, "activeConversations");
        akcr.b(map2, "conversationStates");
        this.a = map;
        this.b = map2;
    }

    public final rbg a(String str) {
        akcr.b(str, "conversationId");
        rbg rbg = (rbg) this.b.get(str);
        return rbg == null ? rbg.NONE : rbg;
    }

    public final List<String> b(String str) {
        akcr.b(str, "conversationId");
        rbd rbd = (rbd) this.a.get(str);
        if (rbd != null) {
            List list = rbd.b;
            if (list != null) {
                return list;
            }
        }
        return ajyw.a;
    }

    public final List<String> c(String str) {
        akcr.b(str, "conversationId");
        rbd rbd = (rbd) this.a.get(str);
        if (rbd != null) {
            List list = rbd.g;
            if (list != null) {
                return list;
            }
        }
        return ajyw.a;
    }
}
