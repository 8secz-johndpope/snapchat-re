package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: acca */
public final class acca extends ExtendableMessageNano<acca> {
    public accc a;
    public acbu[] b;
    private int c = 0;
    private String d;
    private int[] e;
    private String f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private String m;

    public acca() {
        String str = "";
        this.d = str;
        this.e = WireFormatNano.EMPTY_INT_ARRAY;
        this.f = str;
        this.g = str;
        this.h = 0;
        this.i = 0;
        this.a = null;
        this.j = 0;
        this.k = 0;
        this.b = acbu.a();
        this.l = false;
        this.m = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final acca a(int i) {
        this.h = i;
        this.c |= 8;
        return this;
    }

    public final acca a(String str) {
        if (str != null) {
            this.d = str;
            this.c |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final String a() {
        return this.d;
    }

    public final acca b() {
        this.l = true;
        this.c |= 128;
        return this;
    }

    public final acca b(int i) {
        this.i = i;
        this.c |= 16;
        return this;
    }

    public final acca c(int i) {
        this.j = i;
        this.c |= 32;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.c & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.d);
        }
        int[] iArr = this.e;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int[] iArr2;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr2 = this.e;
                if (i2 >= iArr2.length) {
                    break;
                }
                i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i2]);
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (iArr2.length * 1);
        }
        if ((this.c & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f);
        }
        if ((this.c & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.g);
        }
        if ((this.c & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, this.h);
        }
        if ((this.c & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, this.i);
        }
        accc accc = this.a;
        if (accc != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, accc);
        }
        if ((this.c & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, this.j);
        }
        if ((this.c & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, this.k);
        }
        acbu[] acbuArr = this.b;
        if (acbuArr != null && acbuArr.length > 0) {
            while (true) {
                acbuArr = this.b;
                if (i >= acbuArr.length) {
                    break;
                }
                MessageNano messageNano = acbuArr[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, messageNano);
                }
                i++;
            }
        }
        if ((this.c & 128) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, this.l);
        }
        return (this.c & 256) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(12, this.m) : computeSerializedSize;
    }

    public final acca d(int i) {
        this.k = i;
        this.c |= 64;
        return this;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            int[] iArr;
            int i;
            int i2;
            int position;
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.d = codedInputByteBufferNano.readString();
                    readTag = this.c | 1;
                    break;
                case 16:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                    iArr = new int[readTag];
                    i = 0;
                    for (i2 = 0; i2 < readTag; i2++) {
                        if (i2 != 0) {
                            codedInputByteBufferNano.readTag();
                        }
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                            int i3 = i + 1;
                            iArr[i] = readInt32;
                            i = i3;
                        }
                    }
                    if (i != 0) {
                        int[] iArr2 = this.e;
                        int length = iArr2 == null ? 0 : iArr2.length;
                        if (length != 0 || i != readTag) {
                            int[] iArr3 = new int[(length + i)];
                            if (length != 0) {
                                System.arraycopy(this.e, 0, iArr3, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr3, length, i);
                            this.e = iArr3;
                            break;
                        }
                        this.e = iArr;
                        break;
                    }
                    continue;
                case 18:
                    readTag = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    position = codedInputByteBufferNano.getPosition();
                    i2 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        i = codedInputByteBufferNano.readInt32();
                        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        codedInputByteBufferNano.rewindToPosition(position);
                        iArr = this.e;
                        position = iArr == null ? 0 : iArr.length;
                        int[] iArr4 = new int[(i2 + position)];
                        if (position != 0) {
                            System.arraycopy(this.e, 0, iArr4, 0, position);
                        }
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt322 = codedInputByteBufferNano.readInt32();
                            if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3 || readInt322 == 4) {
                                i = position + 1;
                                iArr4[position] = readInt322;
                                position = i;
                            }
                        }
                        this.e = iArr4;
                    }
                    codedInputByteBufferNano.popLimit(readTag);
                    continue;
                case 26:
                    this.f = codedInputByteBufferNano.readString();
                    readTag = this.c | 2;
                    break;
                case 34:
                    this.g = codedInputByteBufferNano.readString();
                    readTag = this.c | 4;
                    break;
                case 40:
                    this.h = codedInputByteBufferNano.readInt32();
                    readTag = this.c | 8;
                    break;
                case 48:
                    this.i = codedInputByteBufferNano.readInt32();
                    readTag = this.c | 16;
                    break;
                case 58:
                    if (this.a == null) {
                        this.a = new accc();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                    continue;
                case 64:
                    this.j = codedInputByteBufferNano.readInt32();
                    readTag = this.c | 32;
                    break;
                case 72:
                    this.k = codedInputByteBufferNano.readInt32();
                    readTag = this.c | 64;
                    break;
                case 82:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    acbu[] acbuArr = this.b;
                    position = acbuArr == null ? 0 : acbuArr.length;
                    acbu[] acbuArr2 = new acbu[(readTag + position)];
                    if (position != 0) {
                        System.arraycopy(this.b, 0, acbuArr2, 0, position);
                    }
                    while (position < acbuArr2.length - 1) {
                        acbuArr2[position] = new acbu();
                        codedInputByteBufferNano.readMessage(acbuArr2[position]);
                        codedInputByteBufferNano.readTag();
                        position++;
                    }
                    acbuArr2[position] = new acbu();
                    codedInputByteBufferNano.readMessage(acbuArr2[position]);
                    this.b = acbuArr2;
                    continue;
                case 88:
                    this.l = codedInputByteBufferNano.readBool();
                    readTag = this.c | 128;
                    break;
                case 98:
                    this.m = codedInputByteBufferNano.readString();
                    readTag = this.c | 256;
                    break;
                default:
                    if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    continue;
            }
            this.c = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.c & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.d);
        }
        int[] iArr = this.e;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.e;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(2, iArr2[i2]);
                i2++;
            }
        }
        if ((this.c & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.f);
        }
        if ((this.c & 4) != 0) {
            codedOutputByteBufferNano.writeString(4, this.g);
        }
        if ((this.c & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(5, this.h);
        }
        if ((this.c & 16) != 0) {
            codedOutputByteBufferNano.writeInt32(6, this.i);
        }
        accc accc = this.a;
        if (accc != null) {
            codedOutputByteBufferNano.writeMessage(7, accc);
        }
        if ((this.c & 32) != 0) {
            codedOutputByteBufferNano.writeInt32(8, this.j);
        }
        if ((this.c & 64) != 0) {
            codedOutputByteBufferNano.writeInt32(9, this.k);
        }
        acbu[] acbuArr = this.b;
        if (acbuArr != null && acbuArr.length > 0) {
            while (true) {
                acbuArr = this.b;
                if (i >= acbuArr.length) {
                    break;
                }
                MessageNano messageNano = acbuArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(10, messageNano);
                }
                i++;
            }
        }
        if ((this.c & 128) != 0) {
            codedOutputByteBufferNano.writeBool(11, this.l);
        }
        if ((this.c & 256) != 0) {
            codedOutputByteBufferNano.writeString(12, this.m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
