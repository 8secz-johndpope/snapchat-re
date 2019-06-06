package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.MapFactories.MapFactory;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;

/* renamed from: acez */
public final class acez extends ExtendableMessageNano<acez> {
    private Map<String, Long> a;

    public acez() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Map map = this.a;
        return map != null ? computeSerializedSize + InternalNano.computeMapFieldSize(map, 1, 9, 4) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        MapFactory mapFactory = MapFactories.getMapFactory();
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = InternalNano.mergeMapEntry(codedInputByteBufferNano, this.a, mapFactory, 9, 4, null, 10, 16);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Map map = this.a;
        if (map != null) {
            InternalNano.serializeMapField(codedOutputByteBufferNano, map, 1, 9, 4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
