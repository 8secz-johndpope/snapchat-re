package defpackage;

import java.util.Map;

/* renamed from: yic */
public interface yic {

    /* renamed from: yic$b */
    public static final class b {
        public final String a;
        private final Map<String, a> b;

        public b(String str, Map<String, ? extends a> map) {
            akcr.b(str, "latestUserInitiatedStoryId");
            akcr.b(map, "storyLoadingStates");
            this.a = str;
            this.b = map;
        }

        public final a a(String str) {
            if (str != null) {
                a aVar = (a) this.b.get(str);
                if (aVar != null) {
                    return aVar;
                }
            }
            return a.NOT_STARTED;
        }
    }

    /* renamed from: yic$a */
    public enum a {
        NOT_STARTED,
        LOADING,
        SUCCESS,
        FAIL
    }

    ajdp<b> a();

    b b();
}
