package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: bba */
public final class bba implements bav {
    private final bav a;

    /* renamed from: bba$a */
    public static final class a extends RuntimeException {
        private final List<String> a;

        public a(String str, List<String> list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(TextUtils.join("\n  - ", list));
            super(stringBuilder.toString());
            this.a = list;
        }
    }

    public bba(bav bav) {
        this.a = bav;
    }

    private static void a(List<String> list) {
        if (list != null) {
            throw new a("JobParameters is invalid", list);
        }
    }

    public final List<String> a(bas bas) {
        return this.a.a(bas);
    }

    public final void b(bas bas) {
        bba.a(a(bas));
    }
}
