package defpackage;

import defpackage.fth.a;
import java.lang.reflect.Type;

/* renamed from: ewh */
public enum ewh implements fth {
    TEST_CIRCUMSTANCE_ENGINE_CONFIG_KEY(a.a("testDefaultInKeyDef")),
    TEST_PROTO_CONFIG_KEY(a.a((Type) acbu.class, new acbu()));
    
    private final a<?> delegate;

    private ewh(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.CIRCUMSTANCE_ENGINE;
    }
}
