package defpackage;

import com.google.protobuf.nano.Any;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: accf */
public final class accf extends ExtendableMessageNano<accf> {
    private int a;
    private Object b;

    public accf() {
        this.a = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean a() {
        return this.a == 1;
    }

    public final int b() {
        return this.a == 1 ? ((Integer) this.b).intValue() : 0;
    }

    public final long c() {
        return this.a == 2 ? ((Long) this.b).longValue() : 0;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, ((Integer) this.b).intValue());
        }
        if (this.a == 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, ((Long) this.b).longValue());
        }
        if (this.a == 3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(3, ((Float) this.b).floatValue());
        }
        if (this.a == 4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, (String) this.b);
        }
        return this.a == 6 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano) this.b) : computeSerializedSize;
    }

    public final float d() {
        return this.a == 3 ? ((Float) this.b).floatValue() : MapboxConstants.MINIMUM_ZOOM;
    }

    public final boolean e() {
        return this.a == 4;
    }

    public final boolean f() {
        return this.a == 4 ? ((Boolean) this.b).booleanValue() : false;
    }

    public final String g() {
        return this.a == 5 ? (String) this.b : "";
    }

    public final boolean h() {
        return this.a == 6;
    }

    public final Any i() {
        return this.a == 6 ? (Any) this.b : null;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.b = Integer.valueOf(codedInputByteBufferNano.readInt32());
                readTag = 1;
            } else if (readTag == 16) {
                this.b = Long.valueOf(codedInputByteBufferNano.readInt64());
                readTag = 2;
            } else if (readTag == 29) {
                this.b = Float.valueOf(codedInputByteBufferNano.readFloat());
                readTag = 3;
            } else if (readTag == 32) {
                this.b = Boolean.valueOf(codedInputByteBufferNano.readBool());
                readTag = 4;
            } else if (readTag == 42) {
                this.b = codedInputByteBufferNano.readString();
                readTag = 5;
            } else if (readTag == 50) {
                if (this.a != 6) {
                    this.b = new Any();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = 6;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.a == 1) {
            codedOutputByteBufferNano.writeInt32(1, ((Integer) this.b).intValue());
        }
        if (this.a == 2) {
            codedOutputByteBufferNano.writeInt64(2, ((Long) this.b).longValue());
        }
        if (this.a == 3) {
            codedOutputByteBufferNano.writeFloat(3, ((Float) this.b).floatValue());
        }
        if (this.a == 4) {
            codedOutputByteBufferNano.writeBool(4, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 5) {
            codedOutputByteBufferNano.writeString(5, (String) this.b);
        }
        if (this.a == 6) {
            codedOutputByteBufferNano.writeMessage(6, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
