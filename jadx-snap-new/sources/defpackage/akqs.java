package defpackage;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: akqs */
public final class akqs {
    final Method a;
    final ThreadMode b;
    final Class<?> c;
    final int d;
    final boolean e;
    String f;

    public akqs(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.a = method;
        this.b = threadMode;
        this.c = cls;
        this.d = i;
        this.e = z;
    }

    private synchronized void a() {
        if (this.f == null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(this.a.getDeclaringClass().getName());
            stringBuilder.append('#');
            stringBuilder.append(this.a.getName());
            stringBuilder.append('(');
            stringBuilder.append(this.c.getName());
            this.f = stringBuilder.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akqs)) {
            return false;
        }
        a();
        akqs akqs = (akqs) obj;
        akqs.a();
        return this.f.equals(akqs.f);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
