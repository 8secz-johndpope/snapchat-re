package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rqw */
public final class rqw implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(rqu.SEND_TYPING_PRESENCE, "talk.send-typing-presence");
            this.a = builder.build();
        }
        return this.a;
    }
}
