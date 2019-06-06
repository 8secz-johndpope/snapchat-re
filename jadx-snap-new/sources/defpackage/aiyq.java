package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: aiyq */
public final class aiyq implements aixz {
    private static final Logger a = Logger.getLogger(aiyq.class.getName());
    private static final Constructor<?> b;
    private static final Method c;
    private static final RuntimeException d;
    private final Object e;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A:{SKIP} */
    static {
        /*
        r0 = defpackage.aiyq.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        a = r0;
        r0 = 0;
        r1 = "java.util.concurrent.atomic.LongAdder";
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0042 }
        r2 = "add";
        r3 = 1;
        r3 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x0042 }
        r4 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x0042 }
        r5 = 0;
        r3[r5] = r4;	 Catch:{ Throwable -> 0x0042 }
        r2 = r1.getMethod(r2, r3);	 Catch:{ Throwable -> 0x0042 }
        r3 = "sum";
        r4 = new java.lang.Class[r5];	 Catch:{ Throwable -> 0x0040 }
        r1.getMethod(r3, r4);	 Catch:{ Throwable -> 0x0040 }
        r1 = r1.getConstructors();	 Catch:{ Throwable -> 0x0040 }
        r3 = r1.length;	 Catch:{ Throwable -> 0x0040 }
    L_0x002d:
        if (r5 >= r3) goto L_0x003d;
    L_0x002f:
        r4 = r1[r5];	 Catch:{ Throwable -> 0x0040 }
        r6 = r4.getParameterTypes();	 Catch:{ Throwable -> 0x0040 }
        r6 = r6.length;	 Catch:{ Throwable -> 0x0040 }
        if (r6 != 0) goto L_0x003a;
    L_0x0038:
        r1 = r0;
        goto L_0x004e;
    L_0x003a:
        r5 = r5 + 1;
        goto L_0x002d;
    L_0x003d:
        r1 = r0;
        r4 = r1;
        goto L_0x004e;
    L_0x0040:
        r1 = move-exception;
        goto L_0x0044;
    L_0x0042:
        r1 = move-exception;
        r2 = r0;
    L_0x0044:
        r3 = a;
        r4 = java.util.logging.Level.FINE;
        r5 = "LongAdder can not be found via reflection, this is normal for JDK7 and below";
        r3.log(r4, r5, r1);
        r4 = r0;
    L_0x004e:
        if (r1 != 0) goto L_0x0059;
    L_0x0050:
        if (r4 == 0) goto L_0x0059;
    L_0x0052:
        b = r4;
        c = r2;
    L_0x0056:
        d = r0;
        return;
    L_0x0059:
        b = r0;
        c = r0;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyq.<clinit>():void");
    }

    aiyq() {
        RuntimeException runtimeException = d;
        if (runtimeException == null) {
            try {
                this.e = b.newInstance(new Object[0]);
                return;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        throw runtimeException;
    }

    static boolean b() {
        return d == null;
    }

    public final void a() {
        try {
            c.invoke(this.e, new Object[]{Long.valueOf(1)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
