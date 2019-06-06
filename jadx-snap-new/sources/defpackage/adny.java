package defpackage;

import defpackage.admp.a;
import java.io.File;

/* renamed from: adny */
public final class adny {
    public static final adny a = new adny();
    private final adnp b = adnp.a;

    private adny() {
    }

    public static String a(a[] aVarArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (a aVar : aVarArr) {
            double length = (double) new File(aVar.a).length();
            Double.isNaN(length);
            length /= 1048576.0d;
            stringBuilder.append("File: ");
            stringBuilder.append(aVar.a);
            stringBuilder.append(", size is ");
            stringBuilder.append(length);
            stringBuilder.append("MB;");
        }
        return stringBuilder.toString();
    }
}
