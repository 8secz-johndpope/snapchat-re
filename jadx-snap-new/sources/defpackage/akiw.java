package defpackage;

/* renamed from: akiw */
public final class akiw {
    public static String a(akhm akhm) {
        String f = akhm.f();
        String h = akhm.h();
        if (h == null) {
            return f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f);
        stringBuilder.append('?');
        stringBuilder.append(h);
        return stringBuilder.toString();
    }
}
