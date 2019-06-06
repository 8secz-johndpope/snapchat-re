package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import defpackage.airm.a;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: atk */
final class atk {
    static final asb a = asb.a("Unity");
    private static final asb b = asb.a("0");

    private static int a() {
        return ((ase.b(1, b) + 0) + ase.b(2, b)) + ase.b(3, 0);
    }

    static int a(a aVar, String str) {
        return ase.d(1, aVar.protobufIndex) + ase.b(2, asb.a(str));
    }

    private static int a(asb asb, asb asb2) {
        int b = ((ase.b(1, 0) + 0) + ase.b(2, 0)) + ase.b(3, asb);
        return asb2 != null ? b + ase.b(4, asb2) : b;
    }

    private static int a(atn atn, int i, int i2) {
        int i3 = 0;
        int b = ase.b(1, asb.a(atn.b)) + 0;
        String str = atn.a;
        if (str != null) {
            b += ase.b(3, asb.a(str));
        }
        int i4 = b;
        for (StackTraceElement a : atn.c) {
            int a2 = atk.a(a, true);
            i4 += (ase.d(32) + ase.d(a2)) + a2;
        }
        atn = atn.d;
        if (atn == null) {
            return i4;
        }
        if (i < i2) {
            int a3 = atk.a(atn, i + 1, i2);
            return i4 + ((ase.d(48) + ase.d(a3)) + a3);
        }
        while (atn != null) {
            atn = atn.d;
            i3++;
        }
        return i4 + ase.c(7, i3);
    }

    private static int a(atn atn, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, asb asb, asb asb2) {
        int a = atk.a(thread, stackTraceElementArr, 4, true);
        int d = ((ase.d(8) + ase.d(a)) + a) + 0;
        int length = threadArr.length;
        int i2 = d;
        for (d = 0; d < length; d++) {
            int a2 = atk.a(threadArr[d], (StackTraceElement[]) list.get(d), 0, false);
            i2 += (ase.d(8) + ase.d(a2)) + a2;
        }
        int a3 = atk.a(atn, 1, 8);
        i2 += (ase.d(16) + ase.d(a3)) + a3;
        a3 = atk.a();
        i2 += (ase.d(24) + ase.d(a3)) + a3;
        a3 = atk.a(asb, asb2);
        return i2 + ((ase.d(24) + ase.d(a3)) + a3);
    }

    static int a(atn atn, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, asb asb, asb asb2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i) {
        RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        int a = atk.a(atn, thread, stackTraceElementArr, threadArr, (List) list, 8, asb, asb2);
        int d = ((ase.d(8) + ase.d(a)) + a) + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a2 = atk.a((String) entry.getKey(), (String) entry.getValue());
                d += (ase.d(16) + ase.d(a2)) + a2;
            }
        }
        if (runningAppProcessInfo2 != null) {
            int i2 = runningAppProcessInfo2.importance;
            d += ase.d(24) + 1;
        }
        return d + ase.c(4, i);
    }

    static int a(Float f, int i, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            f.floatValue();
            i3 = 0 + (ase.d(8) + 4);
        }
        return ((((i3 + ase.b(i)) + (ase.d(24) + 1)) + ase.c(4, i2)) + ase.b(5, j)) + ase.b(6, j2);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        int b = ase.b(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0) + 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        b += ase.b(2, asb.a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            b += ase.b(3, asb.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b += ase.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b + ase.c(5, i);
    }

    private static int a(String str, String str2) {
        int b = ase.b(1, asb.a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b + ase.b(2, asb.a(str2));
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b = ase.b(1, asb.a(thread.getName())) + ase.c(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = atk.a(a, z);
            b += (ase.d(24) + ase.d(a2)) + a2;
        }
        return b;
    }

    static asb a(String str) {
        return str == null ? null : asb.a(str);
    }

    private static void a(ase ase, int i, StackTraceElement stackTraceElement, boolean z) {
        ase.e(i, 2);
        ase.c(atk.a(stackTraceElement, z));
        ase.a(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        ase.a(2, asb.a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            ase.a(3, asb.a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            ase.a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        ase.a(5, i2);
    }

    static void a(ase ase, atn atn, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, asb asb, asb asb2) {
        ase ase2 = ase;
        Thread[] threadArr2 = threadArr;
        asb asb3 = asb2;
        ase.e(1, 2);
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        ase.c(atk.a(atn, thread2, stackTraceElementArr2, threadArr, (List) list, 8, asb, asb2));
        atk.a(ase, thread2, stackTraceElementArr2, 4, true);
        int length = threadArr2.length;
        int i = false;
        for (int i2 = 0; i2 < length; i2++) {
            atk.a(ase, threadArr2[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        atn atn2 = atn;
        length = 2;
        int i3 = 1;
        while (true) {
            ase.e(length, 2);
            ase.c(atk.a(atn2, 1, 8));
            ase.a(1, asb.a(atn2.b));
            String str = atn2.a;
            if (str != null) {
                ase.a(3, asb.a(str));
            }
            for (StackTraceElement a : atn2.c) {
                atk.a(ase, 4, a, true);
            }
            atn2 = atn2.d;
            if (atn2 == null) {
                break;
            } else if (i3 < 8) {
                i3++;
                length = 6;
            } else {
                while (atn2 != null) {
                    atn2 = atn2.d;
                    i++;
                }
                ase.a(7, i);
            }
        }
        ase.e(3, 2);
        ase.c(atk.a());
        ase.a(1, b);
        ase.a(2, b);
        ase.a(3, 0);
        ase.e(4, 2);
        ase.c(atk.a(asb, asb2));
        ase.a(1, 0);
        ase.a(2, 0);
        ase.a(3, asb);
        if (asb3 != null) {
            ase.a(4, asb3);
        }
    }

    private static void a(ase ase, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        ase.e(1, 2);
        ase.c(atk.a(thread, stackTraceElementArr, i, z));
        ase.a(1, asb.a(thread.getName()));
        ase.a(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            atk.a(ase, 3, a, z);
        }
    }

    static void a(ase ase, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            ase.e(2, 2);
            ase.c(atk.a((String) entry.getKey(), (String) entry.getValue()));
            ase.a(1, asb.a((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            ase.a(2, asb.a(str));
        }
    }
}
