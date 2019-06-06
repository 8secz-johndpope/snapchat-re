package defpackage;

import com.google.common.collect.ImmutableSet;
import defpackage.ryz.a;
import defpackage.ryz.b;
import defpackage.ryz.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: wjh */
final class wjh extends ryz {
    private final wjj e;

    /* renamed from: wjh$a */
    public static final class a extends defpackage.ryz.a {
        private final wjh j;
        private final wjj k;

        public a(wjh wjh, wjj wjj) {
            akcr.b(wjh, "networkRequest");
            akcr.b(wjj, "snapTokenNetworkRequestChecker");
            super(wjh);
            this.j = wjh;
            this.k = wjj;
        }

        private wjh f() {
            Object obj = this.d;
            akcr.a(obj, "url");
            Object obj2 = this.e;
            akcr.a(obj2, "method");
            Object obj3 = this.f;
            akcr.a(obj3, "headers");
            sai sai = (sai) this.h;
            Map map = this.g;
            Object obj4 = this.a;
            akcr.a(obj4, "type");
            Object obj5 = this.b;
            akcr.a(obj5, "schedulingContexts");
            Object obj6 = this.c;
            akcr.a(obj6, "dependencyCheckers");
            return new wjh(obj, obj2, obj3, sai, map, obj4, obj5, obj6, this.k, this.i);
        }

        public final /* synthetic */ ryz c() {
            return f();
        }

        public final /* synthetic */ sbm d() {
            return f();
        }

        public final /* synthetic */ sak e() {
            return f();
        }
    }

    public wjh(String str, sac sac, Map<String, String> map, sai sai, Map<String, ?> map2, c cVar, Set<rzg> set, Set<? extends b> set2, wjj wjj, boolean z) {
        Set<? extends b> set3 = set2;
        Object obj = wjj;
        String str2 = str;
        akcr.b(str, "url");
        sac sac2 = sac;
        akcr.b(sac, "method");
        Map<String, String> map3 = map;
        akcr.b(map3, "headers");
        c cVar2 = cVar;
        akcr.b(cVar2, "type");
        Set<rzg> set4 = set;
        akcr.b(set4, "schedulingContexts");
        akcr.b(set3, "dependencyCheckers");
        akcr.b(obj, "snapTokenNetworkRequestChecker");
        super(str2, sac2, map3, sai, map2, cVar2, set4, ImmutableSet.builder().addAll((Iterable) set3).add(obj).build(), z);
        this.e = obj;
    }

    private a p() {
        return new a(this, this.e);
    }

    public final /* synthetic */ a a() {
        return p();
    }

    public final /* synthetic */ sbm.a g() {
        return p();
    }

    public final /* synthetic */ sak.a h() {
        return p();
    }

    public final Map<String, String> l() {
        String str = this.e.b;
        if (str == null) {
            Map l = super.l();
            if (l != null) {
                return l;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        }
        Map hashMap = new HashMap(super.l());
        hashMap.put("X-Snap-Access-Token", str);
        Object unmodifiableMap = Collections.unmodifiableMap(hashMap);
        akcr.a(unmodifiableMap, "Collections.unmodifiable…s as Map<String, String>)");
        return unmodifiableMap;
    }
}
