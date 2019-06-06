package defpackage;

import defpackage.fth.a;
import java.lang.reflect.Type;

/* renamed from: dmj */
public enum dmj implements fth {
    CACHED_NETWORK_MAPPING_DEV(a.a(r1)),
    CACHED_NETWORK_MAPPING_PROD(a.a(r1)),
    NETWORK_RULES_PROTO(a.a((Type) byte[].class, new byte[0])),
    USER_COUNTRY(a.a(juk.c)),
    CONTENT_DESCRIPTOR_RESOLVE_TIMEOUT_MS(a.a(1000)),
    CONTENT_OBJECT_RESOLVE_TIMEOUT_MS(a.a(1000));
    
    private final a<?> delegate;

    private dmj(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.BOLT;
    }
}
