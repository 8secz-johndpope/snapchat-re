package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aas */
public final class aas extends Exception {
    private static final StackTraceElement[] b = new StackTraceElement[0];
    public Exception a;
    private final List<Throwable> c;
    private zd d;
    private yx e;
    private Class<?> f;
    private String g;

    /* renamed from: aas$a */
    static final class a implements Appendable {
        private final Appendable a;
        private boolean b = true;

        a(Appendable appendable) {
            this.a = appendable;
        }

        private static CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public final Appendable append(char c) {
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.b = z;
            this.a.append(c);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            charSequence = a.a(charSequence);
            return append(charSequence, 0, charSequence.length());
        }

        public final Appendable append(CharSequence charSequence, int i, int i2) {
            charSequence = a.a(charSequence);
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.b = z;
            this.a.append(charSequence, i, i2);
            return this;
        }
    }

    public aas(String str) {
        this(str, Collections.emptyList());
    }

    public aas(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public aas(String str, List<Throwable> list) {
        this.g = str;
        setStackTrace(b);
        this.c = list;
    }

    private List<Throwable> a() {
        List arrayList = new ArrayList();
        a((Throwable) this, arrayList);
        return arrayList;
    }

    private void a(Appendable appendable) {
        aas.a((Throwable) this, appendable);
        aas.a(this.c, new a(appendable));
    }

    private static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof aas) {
            for (Throwable a : ((aas) th).c) {
                a(a, (List) list);
            }
            return;
        }
        list.add(th);
    }

    private static void a(List<Throwable> list, Appendable appendable) {
        try {
            aas.b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof aas) {
                ((aas) th).a(appendable);
            } else {
                aas.a(th, appendable);
            }
            i = i2;
        }
    }

    public final void a(String str) {
        List a = a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            StringBuilder stringBuilder = new StringBuilder("Root cause (");
            int i2 = i + 1;
            stringBuilder.append(i2);
            stringBuilder.append(" of ");
            stringBuilder.append(size);
            stringBuilder.append(")");
            Log.i(str, stringBuilder.toString(), (Throwable) a.get(i));
            i = i2;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(zd zdVar, yx yxVar, Class<?> cls) {
        this.d = zdVar;
        this.e = yxVar;
        this.f = cls;
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        StringBuilder stringBuilder;
        String stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder(71);
        stringBuilder3.append(this.g);
        Class cls = this.f;
        String str = ppy.d;
        String str2 = "";
        if (cls != null) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(this.f);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.e != null) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(this.e);
            stringBuilder2 = stringBuilder.toString();
        } else {
            stringBuilder2 = str2;
        }
        stringBuilder3.append(stringBuilder2);
        if (this.d != null) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(this.d);
            str2 = stringBuilder.toString();
        }
        stringBuilder3.append(str2);
        List<Throwable> a = a();
        if (a.isEmpty()) {
            return stringBuilder3.toString();
        }
        if (a.size() == 1) {
            str = "\nThere was 1 cause:";
        } else {
            stringBuilder3.append("\nThere were ");
            stringBuilder3.append(a.size());
            str = " causes:";
        }
        stringBuilder3.append(str);
        for (Throwable th : a) {
            stringBuilder3.append(10);
            stringBuilder3.append(th.getClass().getName());
            stringBuilder3.append('(');
            stringBuilder3.append(th.getMessage());
            stringBuilder3.append(')');
        }
        stringBuilder3.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder3.toString();
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a((Appendable) printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a((Appendable) printWriter);
    }
}
