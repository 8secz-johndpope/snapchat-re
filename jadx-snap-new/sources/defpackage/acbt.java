package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.Timestamp;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acbt */
public final class acbt extends ExtendableMessageNano<acbt> {
    public int[] a;
    public Timestamp b;

    public acbt() {
        this.a = WireFormatNano.EMPTY_INT_ARRAY;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int[] iArr = this.a;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr2 = this.a;
                if (i >= iArr2.length) {
                    break;
                }
                i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (iArr2.length * 1);
        }
        Timestamp timestamp = this.b;
        return timestamp != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, timestamp) : computeSerializedSize;
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
            int[] iArr2;
            if (readTag == 8) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                iArr = new int[readTag];
                i = 0;
                for (i2 = 0; i2 < readTag; i2++) {
                    if (i2 != 0) {
                        codedInputByteBufferNano.readTag();
                    }
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            int i3 = i + 1;
                            iArr[i] = readInt32;
                            i = i3;
                            break;
                        default:
                            break;
                    }
                }
                if (i != 0) {
                    iArr2 = this.a;
                    i2 = iArr2 == null ? 0 : iArr2.length;
                    if (i2 == 0 && i == readTag) {
                        this.a = iArr;
                    } else {
                        int[] iArr3 = new int[(i2 + i)];
                        if (i2 != 0) {
                            System.arraycopy(this.a, 0, iArr3, 0, i2);
                        }
                        System.arraycopy(iArr, 0, iArr3, i2, i);
                        this.a = iArr3;
                    }
                }
            } else if (readTag == 10) {
                readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                i2 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    switch (codedInputByteBufferNano.readInt32()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            i2++;
                            break;
                        default:
                            break;
                    }
                }
                if (i2 != 0) {
                    codedInputByteBufferNano.rewindToPosition(position);
                    iArr = this.a;
                    position = iArr == null ? 0 : iArr.length;
                    iArr2 = new int[(i2 + position)];
                    if (position != 0) {
                        System.arraycopy(this.a, 0, iArr2, 0, position);
                    }
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        switch (readInt322) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                                i = position + 1;
                                iArr2[position] = readInt322;
                                position = i;
                                break;
                            default:
                                break;
                        }
                    }
                    this.a = iArr2;
                }
                codedInputByteBufferNano.popLimit(readTag);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new Timestamp();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int[] iArr = this.a;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.a;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(1, iArr2[i]);
                i++;
            }
        }
        Timestamp timestamp = this.b;
        if (timestamp != null) {
            codedOutputByteBufferNano.writeMessage(2, timestamp);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
