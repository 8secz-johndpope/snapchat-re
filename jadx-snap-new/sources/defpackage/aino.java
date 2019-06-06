package defpackage;

import defpackage.ainf.a;
import java.io.Closeable;

/* renamed from: aino */
public interface aino extends Closeable {

    /* renamed from: aino$a */
    public static final class a {
    }

    /* renamed from: aino$b */
    public interface b {
        int a();
    }

    a currentTransaction();

    void execute(Integer num, String str, int i, akbl<? super ainp, ajxw> akbl);

    ainn executeQuery(Integer num, String str, int i, akbl<? super ainp, ajxw> akbl);

    a newTransaction();
}
