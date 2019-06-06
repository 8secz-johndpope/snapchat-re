package defpackage;

/* renamed from: mty */
final class mty implements akbl<String, String> {
    private final String a;

    public mty(String str) {
        this.a = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2 = (String) obj;
        akcr.b(str2, "assetName");
        CharSequence charSequence = this.a;
        Object obj2 = (charSequence == null || akgb.a(charSequence)) ? 1 : null;
        if (obj2 != null) {
            str = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append('/');
            str = stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder("file://android_asset/");
        stringBuilder2.append(str);
        stringBuilder2.append(str2);
        return stringBuilder2.toString();
    }
}
