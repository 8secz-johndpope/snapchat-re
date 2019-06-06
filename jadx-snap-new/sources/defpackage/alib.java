package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: alib */
public final class alib extends ExtendableMessageNano<alib> {
    public algw[] a;
    public algw[] b;
    public algy[] c;
    public algt[] d;
    public algu[] e;
    public algs[] f;
    public algx g;
    public algu h;
    private int i;
    private String j;

    public alib() {
        this.i = 0;
        this.a = algw.a();
        this.b = algw.a();
        this.c = algy.a();
        this.d = algt.a();
        this.e = algu.a();
        this.f = algs.a();
        this.g = null;
        this.j = "";
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i;
        algw[] algwArr;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        algw[] algwArr2 = this.a;
        int i2 = 0;
        if (algwArr2 != null && algwArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                algwArr = this.a;
                if (computeSerializedSize >= algwArr.length) {
                    break;
                }
                messageNano = algwArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        algx algx = this.g;
        if (algx != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, algx);
        }
        algwArr2 = this.b;
        if (algwArr2 != null && algwArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                algwArr = this.b;
                if (computeSerializedSize >= algwArr.length) {
                    break;
                }
                messageNano = algwArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        algy[] algyArr = this.c;
        if (algyArr != null && algyArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                algy[] algyArr2 = this.c;
                if (computeSerializedSize >= algyArr2.length) {
                    break;
                }
                messageNano = algyArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        algt[] algtArr = this.d;
        if (algtArr != null && algtArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                algt[] algtArr2 = this.d;
                if (computeSerializedSize >= algtArr2.length) {
                    break;
                }
                messageNano = algtArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(5, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        algu algu = this.h;
        if (algu != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, algu);
        }
        algu[] alguArr = this.e;
        if (alguArr != null && alguArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                algu[] alguArr2 = this.e;
                if (computeSerializedSize >= alguArr2.length) {
                    break;
                }
                messageNano = alguArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(7, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if ((this.i & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.j);
        }
        algs[] algsArr = this.f;
        if (algsArr != null && algsArr.length > 0) {
            while (true) {
                algsArr = this.f;
                if (i2 >= algsArr.length) {
                    break;
                }
                MessageNano messageNano2 = algsArr[i2];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, messageNano2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            algw[] algwArr;
            int length;
            algw[] algwArr2;
            if (readTag != 10) {
                MessageNano messageNano;
                if (readTag == 18) {
                    if (this.g == null) {
                        this.g = new algx();
                    }
                    messageNano = this.g;
                } else if (readTag == 26) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    algwArr = this.b;
                    length = algwArr == null ? 0 : algwArr.length;
                    algwArr2 = new algw[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, algwArr2, 0, length);
                    }
                    while (length < algwArr2.length - 1) {
                        algwArr2[length] = new algw();
                        codedInputByteBufferNano.readMessage(algwArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    algwArr2[length] = new algw();
                    codedInputByteBufferNano.readMessage(algwArr2[length]);
                    this.b = algwArr2;
                } else if (readTag == 34) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    algy[] algyArr = this.c;
                    length = algyArr == null ? 0 : algyArr.length;
                    algy[] algyArr2 = new algy[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, algyArr2, 0, length);
                    }
                    while (length < algyArr2.length - 1) {
                        algyArr2[length] = new algy();
                        codedInputByteBufferNano.readMessage(algyArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    algyArr2[length] = new algy();
                    codedInputByteBufferNano.readMessage(algyArr2[length]);
                    this.c = algyArr2;
                } else if (readTag == 42) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    algt[] algtArr = this.d;
                    length = algtArr == null ? 0 : algtArr.length;
                    algt[] algtArr2 = new algt[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, algtArr2, 0, length);
                    }
                    while (length < algtArr2.length - 1) {
                        algtArr2[length] = new algt();
                        codedInputByteBufferNano.readMessage(algtArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    algtArr2[length] = new algt();
                    codedInputByteBufferNano.readMessage(algtArr2[length]);
                    this.d = algtArr2;
                } else if (readTag == 50) {
                    if (this.h == null) {
                        this.h = new algu();
                    }
                    messageNano = this.h;
                } else if (readTag == 58) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    algu[] alguArr = this.e;
                    length = alguArr == null ? 0 : alguArr.length;
                    algu[] alguArr2 = new algu[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, alguArr2, 0, length);
                    }
                    while (length < alguArr2.length - 1) {
                        alguArr2[length] = new algu();
                        codedInputByteBufferNano.readMessage(alguArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    alguArr2[length] = new algu();
                    codedInputByteBufferNano.readMessage(alguArr2[length]);
                    this.e = alguArr2;
                } else if (readTag == 66) {
                    this.j = codedInputByteBufferNano.readString();
                    this.i |= 1;
                } else if (readTag == 74) {
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    algs[] algsArr = this.f;
                    length = algsArr == null ? 0 : algsArr.length;
                    algs[] algsArr2 = new algs[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, algsArr2, 0, length);
                    }
                    while (length < algsArr2.length - 1) {
                        algsArr2[length] = new algs();
                        codedInputByteBufferNano.readMessage(algsArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    algsArr2[length] = new algs();
                    codedInputByteBufferNano.readMessage(algsArr2[length]);
                    this.f = algsArr2;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                codedInputByteBufferNano.readMessage(messageNano);
            } else {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                algwArr = this.a;
                length = algwArr == null ? 0 : algwArr.length;
                algwArr2 = new algw[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.a, 0, algwArr2, 0, length);
                }
                while (length < algwArr2.length - 1) {
                    algwArr2[length] = new algw();
                    codedInputByteBufferNano.readMessage(algwArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                algwArr2[length] = new algw();
                codedInputByteBufferNano.readMessage(algwArr2[length]);
                this.a = algwArr2;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        algw[] algwArr;
        MessageNano messageNano;
        algw[] algwArr2 = this.a;
        int i2 = 0;
        if (algwArr2 != null && algwArr2.length > 0) {
            i = 0;
            while (true) {
                algwArr = this.a;
                if (i >= algwArr.length) {
                    break;
                }
                messageNano = algwArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        algx algx = this.g;
        if (algx != null) {
            codedOutputByteBufferNano.writeMessage(2, algx);
        }
        algwArr2 = this.b;
        if (algwArr2 != null && algwArr2.length > 0) {
            i = 0;
            while (true) {
                algwArr = this.b;
                if (i >= algwArr.length) {
                    break;
                }
                messageNano = algwArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(3, messageNano);
                }
                i++;
            }
        }
        algy[] algyArr = this.c;
        if (algyArr != null && algyArr.length > 0) {
            i = 0;
            while (true) {
                algy[] algyArr2 = this.c;
                if (i >= algyArr2.length) {
                    break;
                }
                messageNano = algyArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i++;
            }
        }
        algt[] algtArr = this.d;
        if (algtArr != null && algtArr.length > 0) {
            i = 0;
            while (true) {
                algt[] algtArr2 = this.d;
                if (i >= algtArr2.length) {
                    break;
                }
                messageNano = algtArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(5, messageNano);
                }
                i++;
            }
        }
        algu algu = this.h;
        if (algu != null) {
            codedOutputByteBufferNano.writeMessage(6, algu);
        }
        algu[] alguArr = this.e;
        if (alguArr != null && alguArr.length > 0) {
            i = 0;
            while (true) {
                algu[] alguArr2 = this.e;
                if (i >= alguArr2.length) {
                    break;
                }
                messageNano = alguArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(7, messageNano);
                }
                i++;
            }
        }
        if ((this.i & 1) != 0) {
            codedOutputByteBufferNano.writeString(8, this.j);
        }
        algs[] algsArr = this.f;
        if (algsArr != null && algsArr.length > 0) {
            while (true) {
                algsArr = this.f;
                if (i2 >= algsArr.length) {
                    break;
                }
                MessageNano messageNano2 = algsArr[i2];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(9, messageNano2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
