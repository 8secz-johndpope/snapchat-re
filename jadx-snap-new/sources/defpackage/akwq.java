package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.akwi.a;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: akwq */
class akwq {
    static final akwq a = akwq.b();

    /* renamed from: akwq$a */
    static class a extends akwq {

        /* renamed from: akwq$a$a */
        static class a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            a() {
            }

            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        /* Access modifiers changed, original: final */
        public final defpackage.akwi.a a(Executor executor) {
            if (executor != null) {
                return new akwm(executor);
            }
            throw new AssertionError();
        }

        public final Executor a() {
            return new a();
        }
    }

    /* renamed from: akwq$b */
    static class b extends akwq {
        b() {
        }

        /* Access modifiers changed, original: final|varargs */
        public final Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(Method method) {
            return method.isDefault();
        }
    }

    akwq() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(2:3|4)|5|6|7) */
    /* JADX WARNING: Missing block: B:10:0x001f, code skipped:
            return new defpackage.akwq();
     */
    private static defpackage.akwq b() {
        /*
        r0 = "android.os.Build";
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000f }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ClassNotFoundException -> 0x000f }
        if (r0 == 0) goto L_0x000f;
    L_0x0009:
        r0 = new akwq$a;	 Catch:{ ClassNotFoundException -> 0x000f }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x000f }
        return r0;
    L_0x000f:
        r0 = "java.util.Optional";
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001a }
        r0 = new akwq$b;	 Catch:{ ClassNotFoundException -> 0x001a }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x001a }
        return r0;
    L_0x001a:
        r0 = new akwq;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwq.b():akwq");
    }

    /* Access modifiers changed, original: 0000 */
    public a a(Executor executor) {
        return executor != null ? new akwm(executor) : akwl.a;
    }

    /* Access modifiers changed, original: varargs */
    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public Executor a() {
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(Method method) {
        return false;
    }
}
