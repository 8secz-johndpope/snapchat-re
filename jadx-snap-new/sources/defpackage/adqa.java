package defpackage;

import com.google.common.base.Charsets;
import defpackage.aesm.a;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: adqa */
public final class adqa implements Closeable {
    private byte[] a = new byte[16384];
    private final DataInputStream b;
    private final iha c;

    adqa(InputStream inputStream, iha iha) {
        this.b = new DataInputStream(inputStream);
        this.c = iha;
    }

    public final synchronized aesm a() {
        String str;
        Class a;
        int readInt = this.b.readInt();
        if (readInt <= 0 || readInt > 900000) {
            throw new RuntimeException("Server sent a message with a bad length: ".concat(String.valueOf(readInt)));
        }
        if (this.a.length < readInt) {
            this.a = new byte[readInt];
        }
        this.b.readFully(this.a, 0, readInt);
        str = new String(this.a, 0, readInt, Charsets.UTF_8);
        aesm aesm = (aesm) this.c.a(str, aesm.class);
        if (aesm != null) {
            a = adqs.a(a.a(aesm.o));
            if (a != null) {
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unexpected message type ");
                stringBuilder.append(aesm.o);
                stringBuilder.append(" from contents: ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        throw new RuntimeException("Unexpected message contents which parsed as null: ".concat(str));
        return (aesm) this.c.a(str, a);
    }

    public final void close() {
        this.b.close();
    }
}
