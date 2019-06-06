package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.MapFactories.MapFactory;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.util.Map;

/* renamed from: aebd */
public final class aebd extends ExtendableMessageNano<aebd> {
    public Map<String, String> a;
    public aebq[] b;

    public aebd() {
        this.a = null;
        this.b = aebq.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map map = this.a;
        if (map != null) {
            computeSerializedSize += InternalNano.computeMapFieldSize(map, 1, 9, 9);
        }
        aebq[] aebqArr = this.b;
        if (aebqArr != null && aebqArr.length > 0) {
            int i = 0;
            while (true) {
                aebq[] aebqArr2 = this.b;
                if (i >= aebqArr2.length) {
                    break;
                }
                MessageNano messageNano = aebqArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        MapFactory mapFactory = MapFactories.getMapFactory();
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = InternalNano.mergeMapEntry(codedInputByteBufferNano, this.a, mapFactory, 9, 9, null, 10, 18);
            } else if (readTag == 18) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                aebq[] aebqArr = this.b;
                int length = aebqArr == null ? 0 : aebqArr.length;
                aebq[] aebqArr2 = new aebq[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.b, 0, aebqArr2, 0, length);
                }
                while (length < aebqArr2.length - 1) {
                    aebqArr2[length] = new aebq();
                    codedInputByteBufferNano.readMessage(aebqArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                aebqArr2[length] = new aebq();
                codedInputByteBufferNano.readMessage(aebqArr2[length]);
                this.b = aebqArr2;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Map map = this.a;
        if (map != null) {
            InternalNano.serializeMapField(codedOutputByteBufferNano, map, 1, 9, 9);
        }
        aebq[] aebqArr = this.b;
        if (aebqArr != null && aebqArr.length > 0) {
            int i = 0;
            while (true) {
                aebq[] aebqArr2 = this.b;
                if (i >= aebqArr2.length) {
                    break;
                }
                MessageNano messageNano = aebqArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(2, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
