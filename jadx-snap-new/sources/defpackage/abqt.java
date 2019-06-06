package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;

/* renamed from: abqt */
public final class abqt {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            } catch (IncompatibleClassChangeError e) {
                StringBuilder stringBuilder = new StringBuilder("Caused by attempting to close ");
                stringBuilder.append(closeable.getClass().getName());
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }
}
