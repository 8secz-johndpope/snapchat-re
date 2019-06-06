package defpackage;

import com.google.common.base.Charsets;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* renamed from: adqb */
public final class adqb implements Closeable {
    private final DataOutputStream a;
    private final iha b;

    adqb(OutputStream outputStream, iha iha) {
        this.a = new DataOutputStream(iga.a(outputStream));
        this.b = iha;
    }

    public final void a(aesm aesm) {
        byte[] bytes = this.b.b(aesm).getBytes(Charsets.UTF_8);
        this.a.writeInt(bytes.length);
        this.a.write(bytes);
        this.a.flush();
    }

    public final void close() {
        this.a.close();
    }
}
