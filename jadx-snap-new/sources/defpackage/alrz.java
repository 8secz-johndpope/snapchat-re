package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.Timestamp;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alrz */
public final class alrz extends ExtendableMessageNano<alrz> {
    public Timestamp a;
    public int[] b;

    public alrz() {
        this.a = null;
        this.b = WireFormatNano.EMPTY_INT_ARRAY;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Timestamp timestamp = this.a;
        if (timestamp != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, timestamp);
        }
        int[] iArr = this.b;
        if (iArr == null || iArr.length <= 0) {
            return computeSerializedSize;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.b;
            if (i >= iArr2.length) {
                return (computeSerializedSize + i2) + (iArr2.length * 1);
            }
            i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
            i++;
        }
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int[] iArr;
            int i;
            int i2;
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new Timestamp();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 16) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                iArr = new int[readTag];
                i = 0;
                for (i2 = 0; i2 < readTag; i2++) {
                    if (i2 != 0) {
                        codedInputByteBufferNano.readTag();
                    }
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1) {
                        int i3 = i + 1;
                        iArr[i] = readInt32;
                        i = i3;
                    }
                }
                if (i != 0) {
                    int[] iArr2 = this.b;
                    int length = iArr2 == null ? 0 : iArr2.length;
                    if (length == 0 && i == readTag) {
                        this.b = iArr;
                    } else {
                        int[] iArr3 = new int[(length + i)];
                        if (length != 0) {
                            System.arraycopy(this.b, 0, iArr3, 0, length);
                        }
                        System.arraycopy(iArr, 0, iArr3, length, i);
                        this.b = iArr3;
                    }
                }
            } else if (readTag == 18) {
                readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                i2 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    i = codedInputByteBufferNano.readInt32();
                    if (i == 0 || i == 1) {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    codedInputByteBufferNano.rewindToPosition(position);
                    iArr = this.b;
                    position = iArr == null ? 0 : iArr.length;
                    int[] iArr4 = new int[(i2 + position)];
                    if (position != 0) {
                        System.arraycopy(this.b, 0, iArr4, 0, position);
                    }
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 == 0 || readInt322 == 1) {
                            i = position + 1;
                            iArr4[position] = readInt322;
                            position = i;
                        }
                    }
                    this.b = iArr4;
                }
                codedInputByteBufferNano.popLimit(readTag);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Timestamp timestamp = this.a;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(1, timestamp);
        }
        int[] iArr = this.b;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(2, iArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
