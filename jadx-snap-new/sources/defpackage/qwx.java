package defpackage;

import com.google.common.reflect.TypeToken;
import java.util.Map;

/* renamed from: qwx */
public final class qwx {
    private final tnj a;
    private final ftl b;
    private final ajdx<iha> c;

    /* renamed from: qwx$1 */
    class 1 extends TypeToken<Map<String, Long>> {
        1() {
        }
    }

    public qwx(tnj tnj, ftl ftl, ajdx<iha> ajdx) {
        this.a = tnj;
        this.b = ftl;
        this.c = ajdx;
    }

    public final int a(qzf qzf) {
        if (qzf.saveCountKey == null) {
            return 0;
        }
        Integer num = null;
        if (!(qzf.legacySeenKey == null || qzf.saveCountKey == null || !this.b.a(qzf.legacySeenKey))) {
            int f = this.b.f(qzf.saveCountKey) + 1;
            this.a.b().a(qzf.saveCountKey, Integer.valueOf(f)).a(qzf.legacySeenKey, Boolean.FALSE).b();
            num = Integer.valueOf(f);
        }
        return num == null ? this.b.f(qzf.saveCountKey) : num.intValue();
    }

    public final Map<String, Long> a() {
        abmr.a("getPromptToFirstTimeShownMap must not be called on the main thread.");
        return (Map) ((iha) this.c.b()).a(this.b.j(qyi.PROMPT_TO_FIRST_TIME_SHOWN_KEY), new 1().getType());
    }

    public final long b() {
        return this.b.h(qyi.PROMPT_LAST_CLICKED_TIMESTAMP);
    }
}
