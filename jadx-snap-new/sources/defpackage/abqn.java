package defpackage;

import com.google.common.base.CharMatcher;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: abqn */
public final class abqn {
    private static final Pattern a = Pattern.compile("\\s+");
    private static final Pattern b = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    static {
        Pattern.compile("[\\p{Punct}\\s]+");
        Pattern.compile("[\\p{Punct}]");
        Pattern.compile("🏻|🏼|🏽|🏾|🏿");
        Pattern.compile("\\s+$");
        Pattern.compile("^\\s+");
        Pattern.compile("[-!\"#$%&'()*+/,;<=>?@\\[\\]^_`{|}~:\\.]");
        jb jbVar = new jb(50);
    }

    public static int a(String str, String str2) {
        int c = abqn.c(str);
        return c == abqn.c(str2) ? str.compareTo(str2) : c == 0 ? -1 : 1;
    }

    public static String a(String str) {
        return CharMatcher.ascii().matchesAllOf(str) ? str : b.matcher(Normalizer.normalize(str, Form.NFD)).replaceAll("");
    }

    public static String[] b(String str) {
        return a.split(str);
    }

    private static int c(String str) {
        if (!str.isEmpty()) {
            str = str.substring(0, 1).toUpperCase(Locale.US);
        }
        return (str.compareTo("A") < 0 || str.compareTo("Z") > 0) ? 1 : 0;
    }
}
