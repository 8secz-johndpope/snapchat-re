package defpackage;

/* renamed from: mhe */
public final class mhe {

    /* renamed from: mhe$a */
    static final class a<T> implements ajfb<T> {
        private /* synthetic */ ide a;

        a(ide ide) {
            this.a = ide;
        }

        public final void accept(T t) {
            if (t instanceof mhd) {
                ((mhd) t).a(this.a);
            }
        }
    }

    public static final <T> ajdp<T> a(ajdp<T> ajdp, ide ide) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(ide, "attributedFeature");
        Object d = ajdp.d((ajfb) new a(ide));
        akcr.a(d, "this.doOnNext {\n        …dFeature)\n        }\n    }");
        return d;
    }
}
