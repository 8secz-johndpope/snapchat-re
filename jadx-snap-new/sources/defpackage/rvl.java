package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: rvl */
public final class rvl extends acgv<zjm> {
    private final ajxe b;

    /* renamed from: rvl$a */
    static final class a extends akcs implements akbk<Map<achr, ? extends acgu<zjm>>> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "provider.get()");
            Iterable<acgu> iterable = (Iterable) obj;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (acgu acgu : iterable) {
                arrayList.add(ajxs.a(acgu.a(), acgu));
            }
            return ajzm.a((Iterable) (List) arrayList);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rvl.class), "inputToAction", "getInputToAction()Ljava/util/Map;");
    }

    public rvl(ajwy<List<acgu<zjm>>> ajwy) {
        akcr.b(ajwy, "provider");
        super((Map) ajyx.a);
        this.b = ajxh.a(new a(ajwy));
    }

    public final acgu<zjm> a(achr achr) {
        akcr.b(achr, "inputGesture");
        return (acgu) ((Map) this.b.b()).get(achr);
    }
}
