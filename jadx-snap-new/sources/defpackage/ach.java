package defpackage;

import defpackage.zm.a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ach */
public final class ach<Model, Data> implements acq<Model, Data> {
    private final a<Data> a;

    /* renamed from: ach$a */
    public interface a<Data> {
        Class<Data> a();

        Data a(String str);

        void a(Data data);
    }

    /* renamed from: ach$b */
    static final class b<Data> implements zm<Data> {
        private final String a;
        private final a<Data> b;
        private Data c;

        b(String str, a<Data> aVar) {
            this.a = str;
            this.b = aVar;
        }

        public final Class<Data> a() {
            return this.b.a();
        }

        public final void a(yk ykVar, a<? super Data> aVar) {
            try {
                this.c = this.b.a(this.a);
                aVar.a(this.c);
            } catch (IllegalArgumentException e) {
                aVar.a(e);
            }
        }

        public final void b() {
            try {
                this.b.a(this.c);
            } catch (IOException unused) {
            }
        }

        public final void c() {
        }

        public final yx d() {
            return yx.LOCAL;
        }
    }

    /* renamed from: ach$c */
    public static final class c<Model> implements acr<Model, InputStream> {
        private final a<InputStream> a = new 1();

        /* renamed from: ach$c$1 */
        class 1 implements a<InputStream> {
            1() {
            }

            public final Class<InputStream> a() {
                return InputStream.class;
            }
        }

        public final acq<Model, InputStream> a(acu acu) {
            return new ach(this.a);
        }
    }

    public ach(a<Data> aVar) {
        this.a = aVar;
    }

    public final acq.a<Data> a(Model model, int i, int i2, zf zfVar) {
        return new acq.a(new ahb(model), new b(model.toString(), this.a));
    }

    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
