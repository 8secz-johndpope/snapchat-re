package defpackage;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: akld */
final class akld {
    static final boolean a;
    private static Method b;
    private static Method c;
    private static Object d;
    private static Object e;

    static {
        boolean z = false;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class loadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class loadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class loadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class loadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            b = loadClass.getMethod("isSymbolicLink", new Class[]{loadClass2});
            loadClass.getMethod("delete", new Class[]{loadClass2});
            loadClass.getMethod("readSymbolicLink", new Class[]{loadClass2});
            e = Array.newInstance(loadClass3, 0);
            loadClass.getMethod("createSymbolicLink", new Class[]{loadClass2, loadClass2, e.getClass()});
            d = Array.newInstance(loadClass4, 0);
            loadClass.getMethod("exists", new Class[]{loadClass2, d.getClass()});
            c = File.class.getMethod("toPath", new Class[0]);
            loadClass2.getMethod("toFile", new Class[0]);
            z = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        a = z;
    }

    public static boolean a(File file) {
        try {
            Object invoke = c.invoke(file, new Object[0]);
            return ((Boolean) b.invoke(null, new Object[]{invoke})).booleanValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
