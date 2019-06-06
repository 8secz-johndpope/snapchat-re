package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: gii */
public final class gii {
    public static final ghm a = new ghm(null, null, 7);

    /* renamed from: gii$b */
    public static final class b implements akbl<InputStream, InputStream> {
        private /* synthetic */ abnb a;

        b(abnb abnb) {
            this.a = abnb;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "input");
            abnb abnb = this.a;
            if (abnb == null) {
                return inputStream;
            }
            InputStream a = abnb.a(inputStream);
            return a == null ? inputStream : a;
        }
    }

    /* renamed from: gii$a */
    public static final class a implements akbl<InputStream, InputStream> {
        private /* synthetic */ abnb a;

        public a(abnb abnb) {
            this.a = abnb;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "input");
            obj = this.a.a(inputStream);
            akcr.a(obj, "encryptionAlgorithm.decryptInputStream(input)");
            return obj;
        }
    }

    static {
        gii gii = new gii();
    }

    private gii() {
    }

    public static gfl a(String str) {
        akcr.b(str, "fileName");
        return gii.a(str, null);
    }

    public static final gfl a(String str, abnb abnb) {
        akcr.b(str, "fileName");
        return new gig(str, new b(abnb), gij.a);
    }

    public static final gie a(akbl<? super InputStream, ? extends InputStream> akbl, akbl<? super OutputStream, ? extends OutputStream> akbl2) {
        akcr.b(akbl, "inputOperator");
        akcr.b(akbl2, "outputOperator");
        return new gie(akbl, gii.b(gij.b, akbl2), gii.c(gij.b, akbl2));
    }

    public static /* synthetic */ gie a(akbl akbl, akbl akbl2, int i) {
        if ((i & 1) != 0) {
            akbl = gij.b;
        }
        if ((i & 2) != 0) {
            akbl2 = gij.a;
        }
        return gii.a(akbl, akbl2);
    }

    private static giy b(akbl<? super InputStream, ? extends InputStream> akbl, akbl<? super OutputStream, ? extends OutputStream> akbl2) {
        akcr.b(akbl, "inputOperator");
        akcr.b(akbl2, "outputOperator");
        return new giy(akbl, akbl2, ghw.a(-1));
    }

    public static /* synthetic */ giy b(akbl akbl, akbl akbl2, int i) {
        if ((i & 1) != 0) {
            akbl = gij.b;
        }
        if ((i & 2) != 0) {
            akbl2 = gij.a;
        }
        return gii.b(akbl, akbl2);
    }

    private static ghm c(akbl<? super InputStream, ? extends InputStream> akbl, akbl<? super OutputStream, ? extends OutputStream> akbl2) {
        akcr.b(akbl, "inputOperator");
        akcr.b(akbl2, "outputOperator");
        return new ghm(akbl, akbl2, 4);
    }

    public static /* synthetic */ ghm c(akbl akbl, akbl akbl2, int i) {
        if ((i & 1) != 0) {
            akbl = gij.b;
        }
        if ((i & 2) != 0) {
            akbl2 = gij.a;
        }
        return gii.c(akbl, akbl2);
    }
}
