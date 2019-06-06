package defpackage;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: idj */
public class idj implements idl {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;

    /* renamed from: idj$a */
    static final class a extends akcs implements akbk<ide> {
        private /* synthetic */ ide a;

        a(ide ide) {
            this.a = ide;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.a;
        }
    }

    /* renamed from: idj$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ idj a;

        c(idj idj) {
            this.a = idj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Joiner.on(',').join((Iterable) this.a.getHierarchy());
        }
    }

    /* renamed from: idj$b */
    static final class b extends akcs implements akbk<List<? extends String>> {
        private /* synthetic */ idl a;
        private /* synthetic */ List b;

        b(idl idl, List list) {
            this.a = idl;
            this.b = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            idl idl = this.a;
            if (idl == null) {
                return this.b;
            }
            ArrayList arrayList = new ArrayList(idl.getHierarchy());
            arrayList.addAll(this.b);
            return arrayList;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(idj.class), "feature", "getFeature()Lcom/snap/framework/attribution/AttributedFeature;"), new akdc(akde.a(idj.class), "stringRepersentation", "getStringRepersentation()Ljava/lang/String;"), new akdc(akde.a(idj.class), "hierarchy", "getHierarchy()Ljava/util/List;")};
    }

    private idj(ide ide, String str) {
        akcr.b(ide, "parentFeature");
        akcr.b(str, "name");
        this(ide, ajyl.a(str), null);
    }

    public idj(ide ide, String str, char c) {
        this(ide, str, (byte) 0);
    }

    public idj(ide ide, List<String> list, idl idl) {
        akcr.b(ide, "parentFeature");
        akcr.b(list, "names");
        this.a = ajxh.a(new a(ide));
        this.b = ajxh.a(new c(this));
        this.c = ajxh.a(new b(idl, list));
    }

    public idj(List<String> list, idl idl) {
        akcr.b(list, "names");
        akcr.b(idl, "parent");
        this(idl.getFeature(), (List) list, idl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        Object hierarchy = getHierarchy();
        if (obj != null) {
            return akcr.a(hierarchy, ((idj) obj).getHierarchy());
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.framework.attribution.StaticUiPage");
    }

    public ide getFeature() {
        return (ide) this.a.b();
    }

    public List<String> getHierarchy() {
        return (List) this.c.b();
    }

    public String toString() {
        return (String) this.b.b();
    }
}
