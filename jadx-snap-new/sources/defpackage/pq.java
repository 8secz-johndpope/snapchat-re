package defpackage;

import android.util.Log;

/* renamed from: pq */
public abstract class pq {
    private static pq a;

    /* renamed from: pq$a */
    public static class a extends pq {
        private int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str, String str2) {
            if (this.a <= 2) {
                Log.v(str, str2);
            }
        }

        public final void a(String str, String str2, Throwable... thArr) {
            if (this.a <= 3) {
                if (thArr.length > 0) {
                    Log.d(str, str2, thArr[0]);
                    return;
                }
                Log.d(str, str2);
            }
        }

        public final void b(String str, String str2) {
            if (this.a <= 5) {
                Log.w(str, str2);
            }
        }

        public final void b(String str, String str2, Throwable... thArr) {
            if (this.a <= 4) {
                if (thArr.length > 0) {
                    Log.i(str, str2, thArr[0]);
                    return;
                }
                Log.i(str, str2);
            }
        }

        public final void c(String str, String str2, Throwable... thArr) {
            if (this.a <= 6) {
                if (thArr.length > 0) {
                    Log.e(str, str2, thArr[0]);
                    return;
                }
                Log.e(str, str2);
            }
        }
    }

    public static String a(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static synchronized pq a() {
        pq pqVar;
        synchronized (pq.class) {
            if (a == null) {
                a = new a(3);
            }
            pqVar = a;
        }
        return pqVar;
    }

    public static synchronized void a(pq pqVar) {
        synchronized (pq.class) {
            a = pqVar;
        }
    }

    public abstract void a(String str, String str2);

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void c(String str, String str2, Throwable... thArr);
}
