package defpackage;

/* renamed from: akfg */
public class akfg extends akff {

    /* renamed from: akfg$a */
    public static final class a extends akcs implements akbl<Object, Boolean> {
        private /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(this.a.isInstance(obj));
        }
    }
}
