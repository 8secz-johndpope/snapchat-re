package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: abe */
final class abe implements abn {
    private final b a = new b();
    private final abj<a, Bitmap> b = new abj();

    /* renamed from: abe$a */
    static class a implements abo {
        private final b a;
        private int b;
        private int c;
        private Config d;

        public a(b bVar) {
            this.a = bVar;
        }

        public final void a() {
            this.a.a(this);
        }

        public final void a(int i, int i2, Config config) {
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            Config config = this.d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return abe.c(this.b, this.c, this.d);
        }
    }

    /* renamed from: abe$b */
    static class b extends abf<a> {
        b() {
        }

        /* Access modifiers changed, original: final */
        public final a a(int i, int i2, Config config) {
            a aVar = (a) b();
            aVar.a(i, i2, config);
            return aVar;
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ abo a() {
            return new a(this);
        }
    }

    abe() {
    }

    static String c(int i, int i2, Config config) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("], ");
        stringBuilder.append(config);
        return stringBuilder.toString();
    }

    public final Bitmap a() {
        return (Bitmap) this.b.a();
    }

    public final Bitmap a(int i, int i2, Config config) {
        return (Bitmap) this.b.a(this.a.a(i, i2, config));
    }

    public final void a(Bitmap bitmap) {
        this.b.a(this.a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public final String b(int i, int i2, Config config) {
        return abe.c(i, i2, config);
    }

    public final String b(Bitmap bitmap) {
        return abe.c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap) {
        return ahm.a(bitmap);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AttributeStrategy:\n  ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
