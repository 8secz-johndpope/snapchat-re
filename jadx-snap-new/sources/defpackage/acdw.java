package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.MapFactories.MapFactory;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;

/* renamed from: acdw */
public final class acdw extends ExtendableMessageNano<acdw> {
    public acdu a;
    private Map<String, acdu> b;

    public acdw() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        acdu acdu = this.a;
        if (acdu != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, acdu);
        }
        Map map = this.b;
        return map != null ? computeSerializedSize + InternalNano.computeMapFieldSize(map, 2, 9, 11) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        MapFactory mapFactory = MapFactories.getMapFactory();
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new acdu();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                this.b = InternalNano.mergeMapEntry(codedInputByteBufferNano, this.b, mapFactory, 9, 11, new acdu(), 10, 18);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        acdu acdu = this.a;
        if (acdu != null) {
            codedOutputByteBufferNano.writeMessage(1, acdu);
        }
        Map map = this.b;
        if (map != null) {
            InternalNano.serializeMapField(codedOutputByteBufferNano, map, 2, 9, 11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
