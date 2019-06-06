package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* renamed from: akmj */
public abstract class akmj {
    public static String a(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    private void a(CharSequence charSequence, Writer writer) {
        if (charSequence != null) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int a = a(charSequence, i, writer);
                if (a == 0) {
                    char[] toChars = Character.toChars(Character.codePointAt(charSequence, i));
                    writer.write(toChars);
                    i += toChars.length;
                } else {
                    int i2 = i;
                    for (i = 0; i < a; i++) {
                        i2 += Character.charCount(Character.codePointAt(charSequence, i2));
                    }
                    i = i2;
                }
            }
        }
    }

    public abstract int a(CharSequence charSequence, int i, Writer writer);

    public final akmj a(akmj... akmjArr) {
        akmj[] akmjArr2 = new akmj[2];
        akmjArr2[0] = this;
        System.arraycopy(akmjArr, 0, akmjArr2, 1, 1);
        return new akmi(akmjArr2);
    }

    public final String a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() << 1);
            a(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
