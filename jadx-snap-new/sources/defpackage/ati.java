package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: ati */
interface ati {

    /* renamed from: ati$a */
    public enum a {
        ;

        static {
            a = new int[]{1, 2};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    String a();

    String b();

    File c();

    File[] d();

    Map<String, String> e();

    void f();

    int g();
}
