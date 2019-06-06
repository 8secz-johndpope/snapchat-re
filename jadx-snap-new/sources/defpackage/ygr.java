package defpackage;

import java.io.File;

/* renamed from: ygr */
public final class ygr {
    public static void a(File file) {
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
    }

    public static boolean b(File file) {
        System.currentTimeMillis();
        return ygr.d(file);
    }

    public static boolean c(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            if (!file.getCanonicalFile().equals(file.getAbsoluteFile())) {
                return true;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return false;
    }

    private static boolean d(File file) {
        int i = 0;
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                int length = listFiles.length;
                while (i < length) {
                    ygr.d(listFiles[i]);
                    i++;
                }
            }
        }
        return file.delete();
    }
}
