package defpackage;

import com.google.common.base.Function;
import java.util.Map;

/* compiled from: lambda */
/* renamed from: -$$Lambda$yxa$7xSc8ANKz2lfEXG1XQwbKeFxbDo */
public final /* synthetic */ class -$$Lambda$yxa$7xSc8ANKz2lfEXG1XQwbKeFxbDo implements Function {
    private final /* synthetic */ Map f$0;

    public /* synthetic */ -$$Lambda$yxa$7xSc8ANKz2lfEXG1XQwbKeFxbDo(Map map) {
        this.f$0 = map;
    }

    public final Object apply(Object obj) {
        return ((Enum) this.f$0.get(((Enum) obj).name()));
    }
}
