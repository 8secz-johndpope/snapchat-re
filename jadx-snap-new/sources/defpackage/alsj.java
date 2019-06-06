package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: alsj */
public final class alsj {
    static volatile a[] a = c;
    public static final a b = new 1();
    private static final a[] c = new a[0];

    /* renamed from: alsj$a */
    public static abstract class a {
        private ThreadLocal<String> a = new ThreadLocal();

        private static String a(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private String b() {
            String str = (String) this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        private void b(Throwable th, String str, Object... objArr) {
            b();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("\n");
                    stringBuilder.append(a.a(th));
                }
            } else if (th != null) {
                a.a(th);
            } else {
                return;
            }
            a();
        }

        public abstract void a();

        public void a(String str, Object... objArr) {
            b(null, str, objArr);
        }

        public void a(Throwable th, String str, Object... objArr) {
            b(th, str, objArr);
        }

        public void b(String str, Object... objArr) {
            b(null, str, objArr);
        }

        public void c(String str, Object... objArr) {
            b(null, str, objArr);
        }

        public void d(String str, Object... objArr) {
            b(null, str, objArr);
        }

        public void e(String str, Object... objArr) {
            b(null, str, objArr);
        }
    }

    /* renamed from: alsj$1 */
    static class 1 extends a {
        1() {
        }

        /* Access modifiers changed, original: protected|final */
        public final void a() {
            throw new AssertionError("Missing override for log method.");
        }

        public final void a(String str, Object... objArr) {
            for (a a : alsj.a) {
                a.a(str, objArr);
            }
        }

        public final void a(Throwable th, String str, Object... objArr) {
            for (a a : alsj.a) {
                a.a(th, str, objArr);
            }
        }

        public final void b(String str, Object... objArr) {
            for (a b : alsj.a) {
                b.b(str, objArr);
            }
        }

        public final void c(String str, Object... objArr) {
            for (a c : alsj.a) {
                c.c(str, objArr);
            }
        }

        public final void d(String str, Object... objArr) {
            for (a d : alsj.a) {
                d.d(str, objArr);
            }
        }

        public final void e(String str, Object... objArr) {
            for (a e : alsj.a) {
                e.e(str, objArr);
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
    }

    public static void a(String str, Object... objArr) {
        b.a(str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        b.a(th, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        b.b(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        b.d(str, objArr);
    }

    public static void d(String str, Object... objArr) {
        b.e(str, objArr);
    }
}
