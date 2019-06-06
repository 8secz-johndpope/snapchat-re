package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alkf */
public final class alkf extends ExtendableMessageNano<alkf> {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public alju[] e;
    public alju[] f;
    public boolean g;
    private aljt h;
    private boolean i;
    private int j;

    public alkf() {
        this.a = 0;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = alju.a();
        this.f = alju.a();
        this.h = null;
        this.g = false;
        this.i = false;
        this.j = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.d);
        }
        alju[] aljuArr = this.e;
        int i = 0;
        if (aljuArr != null && aljuArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                alju[] aljuArr2 = this.e;
                if (computeSerializedSize >= aljuArr2.length) {
                    break;
                }
                MessageNano messageNano = aljuArr2[computeSerializedSize];
                if (messageNano != null) {
                    i2 += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, this.g);
        }
        if ((this.a & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(6, this.i);
        }
        if ((this.a & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, this.j);
        }
        aljuArr = this.f;
        if (aljuArr != null && aljuArr.length > 0) {
            while (true) {
                aljuArr = this.f;
                if (i >= aljuArr.length) {
                    break;
                }
                MessageNano messageNano2 = aljuArr[i];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, messageNano2);
                }
                i++;
            }
        }
        aljt aljt = this.h;
        return aljt != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(9, aljt) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int i = 8;
            if (readTag == 8) {
                this.b = codedInputByteBufferNano.readBool();
                readTag = this.a | 1;
            } else if (readTag != 16) {
                alju[] aljuArr;
                alju[] aljuArr2;
                if (readTag == 24) {
                    readTag = codedInputByteBufferNano.readInt32();
                    i = 4;
                    if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 4 || readTag == 5) {
                        this.d = readTag;
                    }
                } else if (readTag == 34) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    aljuArr = this.e;
                    i = aljuArr == null ? 0 : aljuArr.length;
                    aljuArr2 = new alju[(readTag + i)];
                    if (i != 0) {
                        System.arraycopy(this.e, 0, aljuArr2, 0, i);
                    }
                    while (i < aljuArr2.length - 1) {
                        aljuArr2[i] = new alju();
                        codedInputByteBufferNano.readMessage(aljuArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    aljuArr2[i] = new alju();
                    codedInputByteBufferNano.readMessage(aljuArr2[i]);
                    this.e = aljuArr2;
                } else if (readTag == 40) {
                    this.g = codedInputByteBufferNano.readBool();
                } else if (readTag == 48) {
                    this.i = codedInputByteBufferNano.readBool();
                    readTag = this.a | 16;
                } else if (readTag == 56) {
                    this.j = codedInputByteBufferNano.readInt32();
                    readTag = this.a | 32;
                } else if (readTag == 66) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    aljuArr = this.f;
                    i = aljuArr == null ? 0 : aljuArr.length;
                    aljuArr2 = new alju[(readTag + i)];
                    if (i != 0) {
                        System.arraycopy(this.f, 0, aljuArr2, 0, i);
                    }
                    while (i < aljuArr2.length - 1) {
                        aljuArr2[i] = new alju();
                        codedInputByteBufferNano.readMessage(aljuArr2[i]);
                        codedInputByteBufferNano.readTag();
                        i++;
                    }
                    aljuArr2[i] = new alju();
                    codedInputByteBufferNano.readMessage(aljuArr2[i]);
                    this.f = aljuArr2;
                } else if (readTag == 74) {
                    if (this.h == null) {
                        this.h = new aljt();
                    }
                    codedInputByteBufferNano.readMessage(this.h);
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                readTag = this.a | i;
            } else {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.c = readTag;
                    readTag = this.a | 2;
                }
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.d);
        }
        alju[] aljuArr = this.e;
        int i = 0;
        if (aljuArr != null && aljuArr.length > 0) {
            int i2 = 0;
            while (true) {
                alju[] aljuArr2 = this.e;
                if (i2 >= aljuArr2.length) {
                    break;
                }
                MessageNano messageNano = aljuArr2[i2];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i2++;
            }
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeBool(5, this.g);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeBool(6, this.i);
        }
        if ((this.a & 32) != 0) {
            codedOutputByteBufferNano.writeInt32(7, this.j);
        }
        aljuArr = this.f;
        if (aljuArr != null && aljuArr.length > 0) {
            while (true) {
                aljuArr = this.f;
                if (i >= aljuArr.length) {
                    break;
                }
                MessageNano messageNano2 = aljuArr[i];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(8, messageNano2);
                }
                i++;
            }
        }
        aljt aljt = this.h;
        if (aljt != null) {
            codedOutputByteBufferNano.writeMessage(9, aljt);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
