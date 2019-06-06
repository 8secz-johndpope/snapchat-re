package defpackage;

import defpackage.miq.c.a;

/* renamed from: mnp */
public final class mnp {
    static {
        mnp mnp = new mnp();
    }

    private mnp() {
    }

    public static final String a(a aVar) {
        akcr.b(aVar, "localFile");
        String str = "file://";
        StringBuilder stringBuilder;
        if (akgb.b(aVar.a, str, false)) {
            String str2 = "file://android_asset";
            boolean b = akgb.b(aVar.a, str2, false);
            if (b) {
                str = str2;
            }
            String str3 = b ? "asset:" : "file:";
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(akgc.a(akgc.a(aVar.a, (CharSequence) str), (CharSequence) "/"));
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder("Unexpected local file URI: ");
        stringBuilder.append(aVar.a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
