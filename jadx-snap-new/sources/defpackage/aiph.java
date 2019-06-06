package defpackage;

import defpackage.aipc.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aiph */
public final class aiph extends RuntimeException {
    final AtomicReference<String> a = new AtomicReference(null);
    private final boolean b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final int d;
    private final aipi e;

    private aiph(boolean z, int i, aipi aipi) {
        super("Debug Exception generated at call site");
        this.b = z;
        this.d = i;
        this.e = aipi;
    }

    private int a(StackTraceElement[] stackTraceElementArr) {
        int i = -1;
        for (StackTraceElement a : stackTraceElementArr) {
            i++;
            if (!a(a)) {
                return i;
            }
        }
        return -1;
    }

    public static aiph a() {
        aipg aipg = aipd.a;
        return new aiph(aipg.a, aipg.b, aipg.c);
    }

    private boolean a(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        for (String contains : this.e.b) {
            if (className.contains(contains)) {
                return true;
            }
        }
        return aios.a(className) ? aios.a(className, this.e) : false;
    }

    private void b(Throwable th) {
        th.setStackTrace(b(th.getStackTrace()));
    }

    private StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        if (!this.b) {
            return stackTraceElementArr;
        }
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!a(stackTraceElement)) {
                arrayList.add(stackTraceElement);
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    public final Throwable a(Throwable th) {
        int i = 0;
        Object obj = (!(th instanceof NullPointerException) || th.getStackTrace() == null || th.getStackTrace().length <= 0 || !th.getStackTrace()[0].getClassName().contains(aipc.a)) ? null : 1;
        if (th instanceof ajeo) {
            th = (ajeo) th;
            List<Throwable> list = th.a;
            HashMap hashMap = new HashMap();
            for (Throwable th2 : list) {
                int a = aipc.a(th2);
                if (hashMap.containsKey(Integer.valueOf(a))) {
                    a aVar = (a) hashMap.get(Integer.valueOf(a));
                    aVar.a++;
                } else {
                    hashMap.put(Integer.valueOf(a), new a(th2, (byte) 0));
                }
            }
            if (hashMap.size() != th.a.size()) {
                Iterable arrayList = new ArrayList(hashMap.size());
                for (a aVar2 : hashMap.values()) {
                    aVar2.a();
                    arrayList.add(aVar2.b);
                }
                th = arrayList.size() == 1 ? (Throwable) arrayList.get(0) : new ajeo(arrayList);
            }
            if (th instanceof ajeo) {
                for (Throwable b : ((ajeo) th).a) {
                    b(b);
                }
            }
        }
        b(th);
        Throwable b2 = null;
        Throwable th3 = th;
        while (th3.getCause() != null) {
            th3 = th3.getCause();
            if (th3 == this) {
                return th;
            }
            if (th3 instanceof aiph) {
                if (this.d == 2) {
                    return th;
                }
                b2 = (aiph) th3;
            }
        }
        if (this.c.compareAndSet(false, true)) {
            b((Throwable) this);
        }
        if (b2 != null) {
            StackTraceElement stackTraceElement = getStackTrace()[0];
            StackTraceElement stackTraceElement2 = b2.getStackTrace()[0];
            if (stackTraceElement.getClassName().equals(stackTraceElement2.getClassName()) && stackTraceElement.getMethodName().equals(stackTraceElement2.getMethodName())) {
                i = 1;
            }
        }
        if (i != 0) {
            return th;
        }
        if (obj != null) {
            StackTraceElement[] stackTrace = getStackTrace();
            i = a(stackTrace);
            if (i >= 0) {
                StackTraceElement stackTraceElement3 = stackTrace[i];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(th3.getMessage());
                stringBuilder.append(" In method ");
                stringBuilder.append(stackTraceElement3.getClassName());
                stringBuilder.append("#");
                stringBuilder.append(stackTraceElement3.getMethodName());
                NullPointerException nullPointerException = new NullPointerException(stringBuilder.toString());
                nullPointerException.setStackTrace(stackTrace);
                stackTrace = th.getStackTrace();
                i = a(stackTrace);
                if (i >= 2) {
                    stackTrace = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, i - 1, stackTrace.length);
                }
                th.setStackTrace(stackTrace);
                nullPointerException.initCause(th);
                return nullPointerException;
            }
            th3.setStackTrace(stackTrace);
        }
        try {
            th3.initCause(this);
        } catch (Throwable unused) {
        }
        return th;
    }

    public final String getMessage() {
        String str = (String) this.a.get();
        return (str == null || str.isEmpty()) ? super.getMessage() : str;
    }
}
