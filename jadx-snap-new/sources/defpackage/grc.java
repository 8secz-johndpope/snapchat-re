package defpackage;

import android.content.Context;
import com.google.common.collect.Sets;
import defpackage.gqi.a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: grc */
public final class grc implements aiqc<Set<gsb>> {
    private final ajwy<Set<gqj>> a;
    private final ajwy<gsi> b;
    private final ajwy<gpz> c;
    private final ajwy<Context> d;
    private final ajwy<ajei> e;
    private final ajwy<zgb> f;
    private final ajwy<hwl> g;
    private final ajwy<AtomicLong> h;
    private final ajwy<Map<a, gqh>> i;

    public static Set<gsb> a(Set<gqj> set, ajwy<gsi> ajwy, ajwy<gpz> ajwy2, Context context, ajei ajei, zgb zgb, hwl hwl, AtomicLong atomicLong, Map<a, gqh> map) {
        zfw a = zgb.a(gqe.a, "AnrWatchDog");
        gsb gsb = new gsb(a.MAIN_ANR, a.l(), a.b(), set, ajwy, ajwy2, context, zgb, hwl, ajei, atomicLong, map);
        gsb gsb2 = new gsb(a.DB_ANR, a.m(), a.b(), set, ajwy, ajwy2, context, zgb, hwl, ajei, atomicLong, map);
        gsb gsb3 = new gsb(a.DURABLE_JOB, a.m(), a.b(), set, ajwy, ajwy2, context, zgb, hwl, ajei, atomicLong, map);
        return (Set) aiqf.a(Sets.newHashSet(gsb, gsb2, gsb3), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        ajwy ajwy7 = this.g;
        ajwy ajwy8 = this.h;
        return grc.a((Set) ajwy.get(), ajwy2, ajwy3, (Context) ajwy4.get(), (ajei) ajwy5.get(), (zgb) ajwy6.get(), (hwl) ajwy7.get(), (AtomicLong) ajwy8.get(), (Map) this.i.get());
    }
}
