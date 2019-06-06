package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aipi */
public class aipi {
    static final aipi a = new a().a(Arrays.asList(new String[]{".Traceur", "OnAssembly", ".RxJavaPlugins"})).b(Arrays.asList(new Class[]{aior.class, ajvo.class})).a();
    List<String> b;
    List<Class> c;

    /* renamed from: aipi$a */
    public static final class a {
        List<String> a = new ArrayList();
        List<Class> b = new ArrayList();

        public final a a(aipi aipi) {
            return a(aipi.b).b(aipi.c);
        }

        public final a a(List<String> list) {
            this.a.addAll(list);
            return this;
        }

        public final aipi a() {
            return new aipi(this);
        }

        public final a b(List<Class> list) {
            this.b.addAll(list);
            return this;
        }
    }

    protected aipi(a aVar) {
        this(aVar.a, aVar.b);
    }

    protected aipi(List<String> list, List<Class> list2) {
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
    }
}
