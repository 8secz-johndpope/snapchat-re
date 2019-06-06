package defpackage;

import android.text.SpannableStringBuilder;
import java.lang.ref.WeakReference;

/* renamed from: abuc */
public final class abuc {
    private final abuj[] a;
    private final WeakReference<a> b;

    /* renamed from: abuc$a */
    public interface a {
        void a(CharSequence charSequence);

        boolean a();

        void b();
    }

    /* renamed from: abuc$b */
    public static class b {
        private final a a;
        private String b;
        private String[] c;

        b(a aVar) {
            this.a = aVar;
        }

        public final abuc a(String str, String[] strArr) {
            abuj[] abujArr;
            this.b = str;
            this.c = strArr;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int indexOf = this.b.indexOf("%s");
            if (indexOf != -1) {
                String[] strArr2 = this.c;
                if (strArr2.length != 0) {
                    if (strArr2.length == 1) {
                        spannableStringBuilder.clear();
                        spannableStringBuilder.append(String.format(this.b, new Object[]{this.c[0]}));
                    } else {
                        abuj[] abujArr2 = new abuj[]{new abuj(this.a, strArr2)};
                        spannableStringBuilder.setSpan(abujArr2[0], indexOf, indexOf + 2, 33);
                        abujArr = abujArr2;
                        this.a.a(spannableStringBuilder);
                        return new abuc(abujArr, this.a, (byte) 0);
                    }
                }
            }
            abujArr = new abuj[0];
            this.a.a(spannableStringBuilder);
            return new abuc(abujArr, this.a, (byte) 0);
        }
    }

    private abuc(abuj[] abujArr, a aVar) {
        this.a = abujArr;
        this.b = new WeakReference(aVar);
    }

    /* synthetic */ abuc(abuj[] abujArr, a aVar, byte b) {
        this(abujArr, aVar);
    }

    public static b a(a aVar) {
        return new b(aVar);
    }
}
