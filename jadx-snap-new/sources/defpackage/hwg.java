package defpackage;

import java.lang.annotation.Annotation;

/* renamed from: hwg */
public abstract class hwg<T> {
    private final ajxe a = ajxh.a(new c(this));
    public final ajxe b = ajxh.a(new b(this));
    public final hwh c;
    public final T d;
    private final ajxe e = ajxh.a(new d(this));

    /* renamed from: hwg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static String a(String str, String str2) {
            akcr.b(str, "jobTypeIdentifier");
            akcr.b(str2, "uniqueSubTag");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(':');
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
    }

    /* renamed from: hwg$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ hwg a;

        c(hwg hwg) {
            this.a = hwg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.getClass().isAnnotationPresent(hwk.class)) {
                Annotation annotation = this.a.getClass().getAnnotation(hwk.class);
                if (annotation != null) {
                    return ((hwk) annotation).a();
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.durablejob.DurableJobIdentifier");
            }
            throw new IllegalStateException("Invalid DurableJobIdentifier annotation");
        }
    }

    /* renamed from: hwg$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ hwg a;

        b(hwg hwg) {
            this.a = hwg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return a.a(this.a.a(), this.a.c.i);
        }
    }

    /* renamed from: hwg$d */
    static final class d extends akcs implements akbk<String> {
        private /* synthetic */ hwg a;

        d(hwg hwg) {
            this.a = hwg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return a.a(this.a.a(), this.a.c.d);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hwg.class), "jobTypeIdentifier", "getJobTypeIdentifier()Ljava/lang/String;"), new akdc(akde.a(hwg.class), "groupTag", "getGroupTag()Ljava/lang/String;"), new akdc(akde.a(hwg.class), "uniqueTag", "getUniqueTag()Ljava/lang/String;")};
        a aVar = new a();
    }

    public hwg(hwh hwh, T t) {
        akcr.b(hwh, "config");
        this.c = hwh;
        this.d = t;
    }

    public final String a() {
        return (String) this.a.b();
    }

    public final String b() {
        return (String) this.e.b();
    }
}
