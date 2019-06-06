package defpackage;

import java.util.ArrayList;

@Deprecated
/* renamed from: abkh */
public class abkh {
    private final String a;
    private final abkg[] b;
    private String[] c;

    protected abkh(String str, abkg... abkgArr) {
        this.a = str;
        this.b = abkgArr;
        String[] strArr = new String[abkgArr.length];
        for (int i = 0; i < abkgArr.length; i++) {
            strArr[i] = abkgArr[i].a;
        }
        this.c = strArr;
    }

    private String a() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            abkg abkg = this.b[i];
            if (i > 0) {
                stringBuilder.append(ppy.d);
            }
            stringBuilder.append(abkg.a);
            stringBuilder.append(' ');
            stringBuilder.append(abkg.b);
            if (abkg.c == 3) {
                stringBuilder.append(" PRIMARY KEY AUTOINCREMENT");
            }
        }
        return stringBuilder.toString();
    }

    public String b() {
        return this.a;
    }

    public final String c() {
        Iterable arrayList = new ArrayList();
        for (abkg abkg : this.b) {
            if (abkg.c == 2) {
                arrayList.add(abkg.a);
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("CREATE TABLE IF NOT EXISTS %s (%s);", new Object[]{b(), a()});
        }
        return String.format("CREATE TABLE IF NOT EXISTS %s (%s, PRIMARY KEY (%s))", new Object[]{b(), a(), akly.a(arrayList, ppy.d)});
    }

    public final String d() {
        StringBuilder stringBuilder = new StringBuilder("DROP TABLE IF EXISTS ");
        stringBuilder.append(b());
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
