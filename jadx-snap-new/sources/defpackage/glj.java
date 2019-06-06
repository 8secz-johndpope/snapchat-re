package defpackage;

import defpackage.rzo.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: glj */
public final class glj implements a<ryz, glv, glq> {
    private final ajxe a;
    private final ajxe b;

    /* renamed from: glj$a */
    static final class a extends akcs implements akbk<gli> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gli) this.a.get();
        }
    }

    /* renamed from: glj$b */
    static final class b extends akcs implements akbk<a<ryz, glv, glq>> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (a) this.a.get();
        }
    }

    /* renamed from: glj$c */
    static final class c extends akcs implements akbk<Map<String, ? extends List<? extends ryz>>> {
        private /* synthetic */ glj a;
        private /* synthetic */ glq b;

        c(glj glj, glq glq) {
            this.a = glj;
            this.b = glq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            glj glj = this.a;
            glq glq = this.b;
            HashMap hashMap = new HashMap();
            List<Object> list = (List) glq.a.get(glj.a().a);
            if (list != null) {
                for (Object obj : list) {
                    Object obj2;
                    akcr.a(obj2, "request");
                    Object a = obj2.a();
                    String str = "request.networkRequest";
                    akcr.a(a, str);
                    String b = sap.b(a);
                    if (b != null) {
                        Map map = hashMap;
                        Object obj3 = map.get(b);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            map.put(b, obj3);
                        }
                        List list2 = (List) obj3;
                        obj2 = obj2.a();
                        akcr.a(obj2, str);
                        list2.add(obj2);
                    }
                }
            }
            return hashMap;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(glj.class), "config", "getConfig()Lcom/snap/core/net/scheduling/ContentTypeConcurrencyConfiguration;"), new akdc(akde.a(glj.class), "defaultRule", "getDefaultRule()Lcom/snap/network/scheduling/impl/RuleBasedConcurrencyController$Rule;")};
    }

    public glj(ajwy<gli> ajwy, ajwy<a<ryz, glv, glq>> ajwy2) {
        akcr.b(ajwy, "configProvider");
        akcr.b(ajwy2, "defaultRuleProvider");
        this.a = ajxh.a(new a(ajwy));
        this.b = ajxh.a(new b(ajwy2));
    }

    /* Access modifiers changed, original: final */
    public final gli a() {
        return (gli) this.a.b();
    }

    public final /* synthetic */ ryv a(Object obj, Object obj2) {
        obj = (glv) obj;
        glq glq = (glq) obj2;
        akcr.b(obj, "pending");
        akcr.b(glq, "executing");
        a aVar = (a) this.b.b();
        List list = (List) obj.a.get(a().a);
        if (!(list == null || list.isEmpty() || a().b.isEmpty())) {
            ajxe a = ajxh.a(new c(this, glq));
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                Object obj3 = (rzf) next;
                akcr.a(obj3, "it");
                obj3 = obj3.a();
                akcr.a(obj3, "it.networkRequest");
                String b = sap.b(obj3);
                Object obj4 = 1;
                if (b != null) {
                    Integer num = (Integer) a().b.get(b);
                    if (num != null) {
                        int intValue = num.intValue();
                        List list2 = (List) ((Map) a.b()).get(b);
                        if (list2 != null && list2.size() >= intValue) {
                            obj4 = null;
                        }
                    }
                }
                if (obj4 != null) {
                    arrayList.add(next);
                }
            }
            Map hashMap = new HashMap(obj.a);
            hashMap.put(a().a, (List) arrayList);
            obj = new glv(hashMap);
        }
        return aVar.a(obj, glq);
    }
}
