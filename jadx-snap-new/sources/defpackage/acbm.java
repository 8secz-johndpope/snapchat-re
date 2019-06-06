package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: acbm */
public final class acbm {

    /* renamed from: acbm$a */
    public static class a {
        final List<String> a = new LinkedList();
        private Throwable b;

        public final a a() {
            this.a.add("err");
            return this;
        }

        public final a a(Throwable th) {
            this.b = th;
            return a();
        }

        public final void a(String str) {
            StringBuilder stringBuilder = new StringBuilder("[talk]");
            Collections.sort(this.a);
            for (String str2 : this.a) {
                stringBuilder.append('[');
                stringBuilder.append(str2);
                stringBuilder.append(']');
            }
            stringBuilder.append(str);
        }

        public final a b() {
            this.a.add("cll");
            return this;
        }

        public final a c() {
            this.a.add("prs");
            return this;
        }
    }

    public static a a() {
        a aVar = new a();
        aVar.a.add("lua");
        return aVar;
    }

    public static a a(Throwable th) {
        return new a().a(th);
    }

    public static a b() {
        return new a().a();
    }

    public static a c() {
        return new a().b();
    }

    public static a d() {
        a aVar = new a();
        aVar.a.add("av");
        return aVar;
    }
}
