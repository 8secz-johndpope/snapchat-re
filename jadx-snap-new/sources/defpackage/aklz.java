package defpackage;

import java.io.PrintStream;

/* renamed from: aklz */
public final class aklz {
    public static final String a = aklz.c("line.separator");
    private static String b;
    private static String c = aklz.c("os.name");
    private static String d = aklz.c("os.version");

    static {
        aklz.c("awt.toolkit");
        aklz.c("file.encoding");
        aklz.c("file.separator");
        aklz.c("java.awt.fonts");
        aklz.c("java.awt.graphicsenv");
        aklz.c("java.awt.headless");
        aklz.c("java.awt.printerjob");
        aklz.c("java.class.path");
        aklz.c("java.class.version");
        aklz.c("java.compiler");
        aklz.c("java.endorsed.dirs");
        aklz.c("java.ext.dirs");
        aklz.c("java.home");
        aklz.c("java.io.tmpdir");
        aklz.c("java.library.path");
        aklz.c("java.runtime.name");
        aklz.c("java.runtime.version");
        aklz.c("java.specification.name");
        aklz.c("java.specification.vendor");
        String c = aklz.c("java.specification.version");
        b = c;
        String str = "1.8";
        String str2 = "1.7";
        String str3 = "1.6";
        String str4 = "1.5";
        String str5 = "1.4";
        String str6 = "1.3";
        String str7 = "1.2";
        String str8 = "1.1";
        if (!("0.9".equals(c) || str8.equals(c) || str7.equals(c) || str6.equals(c) || str5.equals(c) || str4.equals(c) || str3.equals(c) || str2.equals(c))) {
            str.equals(c);
        }
        aklz.c("java.util.prefs.PreferencesFactory");
        aklz.c("java.vendor");
        aklz.c("java.vendor.url");
        aklz.c("java.version");
        aklz.c("java.vm.info");
        aklz.c("java.vm.name");
        aklz.c("java.vm.specification.name");
        aklz.c("java.vm.specification.vendor");
        aklz.c("java.vm.specification.version");
        aklz.c("java.vm.vendor");
        aklz.c("java.vm.version");
        aklz.c("os.arch");
        aklz.c("path.separator");
        c = "user.country";
        if (aklz.c(c) == null) {
            c = "user.region";
        }
        aklz.c(c);
        aklz.c("user.dir");
        aklz.c("user.home");
        aklz.c("user.language");
        aklz.c("user.name");
        aklz.c("user.timezone");
        aklz.a(str8);
        aklz.a(str7);
        aklz.a(str6);
        aklz.a(str5);
        aklz.a(str4);
        aklz.a(str3);
        aklz.a(str2);
        aklz.a(str);
        aklz.b("AIX");
        aklz.b("HP-UX");
        aklz.b("OS/400");
        aklz.b("Irix");
        if (!aklz.b("Linux")) {
            aklz.b("LINUX");
        }
        aklz.b("Mac");
        aklz.b("Mac OS X");
        aklz.b("FreeBSD");
        aklz.b("OpenBSD");
        aklz.b("NetBSD");
        aklz.b("OS/2");
        aklz.b("Solaris");
        aklz.b("SunOS");
        c = "Windows";
        aklz.b(c);
        aklz.a(c, "5.0");
        aklz.a(c, "5.2");
        String str9 = "6.1";
        aklz.a("Windows Server 2008", str9);
        str = "Windows 9";
        aklz.a(str, "4.0");
        aklz.a(str, "4.1");
        aklz.a(c, "4.9");
        aklz.b("Windows NT");
        aklz.a(c, "5.1");
        aklz.a(c, "6.0");
        aklz.a(c, str9);
        aklz.a(c, "6.2");
    }

    private static boolean a(String str) {
        String str2 = b;
        return str2 == null ? false : str2.startsWith(str);
    }

    private static boolean a(String str, String str2) {
        String str3 = c;
        String str4 = d;
        return str3 != null && str4 != null && str3.startsWith(str) && str4.startsWith(str2);
    }

    private static boolean b(String str) {
        String str2 = c;
        return str2 == null ? false : str2.startsWith(str);
    }

    private static String c(String str) {
        try {
            str = System.getProperty(str);
            return str;
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder("Caught a SecurityException reading the system property '");
            stringBuilder.append(str);
            stringBuilder.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuilder.toString());
            return null;
        }
    }
}
