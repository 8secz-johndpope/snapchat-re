package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ajaa */
public final class ajaa<T> {
    private final Class<?> a;
    private final String b;
    private final Class[] c;

    public ajaa(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    private Method a(Class<?> cls) {
        String str = this.b;
        if (str == null) {
            return null;
        }
        Method a = ajaa.a(cls, str, this.c);
        if (a != null) {
            Class cls2 = this.a;
            if (!(cls2 == null || cls2.isAssignableFrom(a.getReturnType()))) {
                return null;
            }
        }
        return a;
    }

    /* JADX WARNING: Missing block: B:12:0x001f, code skipped:
            if ((r2.getModifiers() & 1) == 0) goto L_0x0021;
     */
    private static java.lang.reflect.Method a(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class[] r4) {
        /*
        r0 = 0;
        if (r2 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r2.getModifiers();	 Catch:{ NoSuchMethodException -> 0x0021 }
        r1 = r1 & 1;
        if (r1 != 0) goto L_0x0015;
    L_0x000c:
        r2 = r2.getSuperclass();	 Catch:{ NoSuchMethodException -> 0x0021 }
        r2 = defpackage.ajaa.a(r2, r3, r4);	 Catch:{ NoSuchMethodException -> 0x0021 }
        return r2;
    L_0x0015:
        r2 = r2.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0021 }
        r3 = r2.getModifiers();	 Catch:{ NoSuchMethodException -> 0x0022 }
        r3 = r3 & 1;
        if (r3 != 0) goto L_0x0022;
    L_0x0021:
        r2 = r0;
    L_0x0022:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajaa.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private Object c(T t, Object... objArr) {
        Method a = a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    private Object d(T t, Object... objArr) {
        Method a = a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(a)));
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Method ");
        stringBuilder.append(this.b);
        stringBuilder.append(" not supported for object ");
        stringBuilder.append(t);
        throw new AssertionError(stringBuilder.toString());
    }

    public final Object a(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean a(T t) {
        return a(t.getClass()) != null;
    }

    public final Object b(T t, Object... objArr) {
        try {
            return d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
