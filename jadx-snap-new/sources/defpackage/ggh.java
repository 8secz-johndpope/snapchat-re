package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ggh */
public final class ggh {
    public final abmv a;

    /* renamed from: ggh$a */
    public static final class a implements akbl<InputStream, InputStream> {
        private /* synthetic */ abmv a;

        a(abmv abmv) {
            this.a = abmv;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "input");
            obj = this.a.a(inputStream);
            akcr.a(obj, "it.decryptInputStream(input)");
            return obj;
        }
    }

    /* renamed from: ggh$b */
    public static final class b implements akbl<OutputStream, OutputStream> {
        private /* synthetic */ abmv a;

        public b(abmv abmv) {
            this.a = abmv;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            OutputStream outputStream = (OutputStream) obj;
            akcr.b(outputStream, "input");
            obj = this.a.a(outputStream);
            akcr.a(obj, "it.decryptOutputStream(input)");
            return obj;
        }
    }

    /* renamed from: ggh$c */
    public static final class c implements akbl<InputStream, InputStream> {
        private /* synthetic */ abmv a;

        public c(abmv abmv) {
            this.a = abmv;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "input");
            obj = this.a.b(inputStream);
            akcr.a(obj, "it.encryptInputStream(input)");
            return obj;
        }
    }

    /* renamed from: ggh$d */
    public static final class d implements akbl<OutputStream, OutputStream> {
        private /* synthetic */ abmv a;

        d(abmv abmv) {
            this.a = abmv;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            OutputStream outputStream = (OutputStream) obj;
            akcr.b(outputStream, "input");
            obj = this.a.b(outputStream);
            akcr.a(obj, "it.encryptOutputStream(input)");
            return obj;
        }
    }

    private ggh(abmv abmv) {
        this.a = abmv;
    }

    public ggh(abnb abnb) {
        akcr.b(abnb, "algorithm");
        this(abnb instanceof abmv ? (abmv) abnb : null);
    }

    public ggh(String str, String str2) {
        CharSequence charSequence = str;
        Object obj = 1;
        Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        abmv abmv = null;
        if (obj2 == null) {
            charSequence = str2;
            if (!(charSequence == null || charSequence.length() == 0)) {
                obj = null;
            }
            if (!(obj != null || str == null || str2 == null)) {
                abmv = new abmv(str, str2, (byte) 0);
            }
        }
        this(abmv);
    }

    public final boolean a() {
        return this.a != null;
    }

    public final akbl<InputStream, InputStream> b() {
        abmv abmv = this.a;
        return abmv != null ? new a(abmv) : gij.b;
    }

    public final akbl<OutputStream, OutputStream> c() {
        abmv abmv = this.a;
        return abmv != null ? new d(abmv) : gij.a;
    }
}
