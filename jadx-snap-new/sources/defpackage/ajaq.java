package defpackage;

import com.google.common.base.Preconditions;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import defpackage.aivm.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ajaq */
public final class ajaq {
    static long a(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static <T extends MessageNano> b<T> a(final ajao<T> ajao) {
        return new b<T>() {
            private T b(InputStream inputStream) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ajaq.a(inputStream, byteArrayOutputStream);
                    CodedInputByteBufferNano newInstance = CodedInputByteBufferNano.newInstance(byteArrayOutputStream.toByteArray());
                    newInstance.setSizeLimit(Integer.MAX_VALUE);
                    MessageNano a = ajao.a();
                    a.mergeFrom(newInstance);
                    return a;
                } catch (IOException e) {
                    throw aivw.i.a("Failed parsing nano proto message").b(e).c();
                }
            }
        };
    }
}
