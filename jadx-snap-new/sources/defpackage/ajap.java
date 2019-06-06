package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: ajap */
final class ajap extends InputStream implements aivg {
    private MessageNano a;
    private ByteArrayInputStream b;

    public ajap(MessageNano messageNano) {
        this.a = messageNano;
    }

    private void a() {
        MessageNano messageNano = this.a;
        if (messageNano != null) {
            this.b = new ByteArrayInputStream(MessageNano.toByteArray(messageNano));
            this.a = null;
        }
    }

    public final int available() {
        MessageNano messageNano = this.a;
        if (messageNano != null) {
            return messageNano.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.b;
        return byteArrayInputStream != null ? byteArrayInputStream.available() : 0;
    }

    public final int read() {
        a();
        ByteArrayInputStream byteArrayInputStream = this.b;
        return byteArrayInputStream != null ? byteArrayInputStream.read() : -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        MessageNano messageNano = this.a;
        if (messageNano != null) {
            int serializedSize = messageNano.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.b = null;
                return -1;
            } else if (i2 >= serializedSize) {
                CodedOutputByteBufferNano newInstance = CodedOutputByteBufferNano.newInstance(bArr, i, serializedSize);
                this.a.writeTo(newInstance);
                newInstance.checkNoSpaceLeft();
                this.a = null;
                this.b = null;
                return serializedSize;
            } else {
                a();
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.b;
        return byteArrayInputStream != null ? byteArrayInputStream.read(bArr, i, i2) : -1;
    }
}
