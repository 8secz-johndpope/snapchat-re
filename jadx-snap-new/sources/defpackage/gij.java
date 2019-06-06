package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;

/* renamed from: gij */
public final class gij {
    public static final akbl<OutputStream, OutputStream> a = b.a;
    public static final akbl<InputStream, InputStream> b = a.a;

    /* renamed from: gij$b */
    static final class b extends akcs implements akbl<OutputStream, OutputStream> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            OutputStream outputStream = (OutputStream) obj;
            akcr.b(outputStream, "output");
            return outputStream;
        }
    }

    /* renamed from: gij$a */
    static final class a extends akcs implements akbl<InputStream, InputStream> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "input");
            return inputStream;
        }
    }

    public static final <C extends Closeable> C a(C c, LinkedList<Closeable> linkedList) {
        akcr.b(c, "receiver$0");
        akcr.b(linkedList, "closeables");
        linkedList.addFirst(c);
        return c;
    }
}
