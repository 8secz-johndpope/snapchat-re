package defpackage;

/* renamed from: tg */
public final class tg {
    String a;
    private String b;

    public tg(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.a = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            this.a = "";
        }
        this.b = str;
    }

    public final boolean a() {
        String str = this.a;
        return str != null && str.length() > 0;
    }
}
