package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;

/* renamed from: aebg */
public final class aebg extends ExtendableMessageNano<aebg> {
    public adzo[] a;
    public String[] b;
    public adzo[] c;
    public adzo[] d;
    public adzo[] e;
    public adzo[] f;
    public adzy[] g;
    public adsi h;
    public adzo[] i;
    public adzo[] j;
    public aebs[] k;

    public aebg() {
        this.a = adzo.a();
        this.b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.c = adzo.a();
        this.d = adzo.a();
        this.e = adzo.a();
        this.f = adzo.a();
        this.g = adzy.a();
        this.h = null;
        this.i = adzo.a();
        this.j = adzo.a();
        this.k = aebs.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i;
        adzo[] adzoArr;
        MessageNano messageNano;
        int computeSerializedSize = super.computeSerializedSize();
        adzo[] adzoArr2 = this.a;
        int i2 = 0;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzo[] adzoArr3 = this.a;
                if (computeSerializedSize >= adzoArr3.length) {
                    break;
                }
                MessageNano messageNano2 = adzoArr3[computeSerializedSize];
                if (messageNano2 != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(1, messageNano2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String[] strArr = this.b;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i4 * 1);
        }
        adzoArr2 = this.c;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.c;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adzoArr2 = this.d;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.d;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adzoArr2 = this.e;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.e;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(5, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adzoArr2 = this.f;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.f;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(6, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adzy[] adzyArr = this.g;
        if (adzyArr != null && adzyArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzy[] adzyArr2 = this.g;
                if (computeSerializedSize >= adzyArr2.length) {
                    break;
                }
                messageNano = adzyArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(7, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adsi adsi = this.h;
        if (adsi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, adsi);
        }
        adzoArr2 = this.i;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.i;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(9, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        adzoArr2 = this.j;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzoArr = this.j;
                if (computeSerializedSize >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(10, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aebs[] aebsArr = this.k;
        if (aebsArr != null && aebsArr.length > 0) {
            while (true) {
                aebsArr = this.k;
                if (i2 >= aebsArr.length) {
                    break;
                }
                MessageNano messageNano3 = aebsArr[i2];
                if (messageNano3 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, messageNano3);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            adzo[] adzoArr;
            int length;
            adzo[] adzoArr2;
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    adzoArr = this.a;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.a = adzoArr2;
                    break;
                case 18:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.b;
                    length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.b = strArr2;
                    break;
                case 26:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    adzoArr = this.c;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.c = adzoArr2;
                    break;
                case 34:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    adzoArr = this.d;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.d = adzoArr2;
                    break;
                case 42:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    adzoArr = this.e;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.e = adzoArr2;
                    break;
                case 50:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    adzoArr = this.f;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.f = adzoArr2;
                    break;
                case 58:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    adzy[] adzyArr = this.g;
                    length = adzyArr == null ? 0 : adzyArr.length;
                    adzy[] adzyArr2 = new adzy[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, adzyArr2, 0, length);
                    }
                    while (length < adzyArr2.length - 1) {
                        adzyArr2[length] = new adzy();
                        codedInputByteBufferNano.readMessage(adzyArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzyArr2[length] = new adzy();
                    codedInputByteBufferNano.readMessage(adzyArr2[length]);
                    this.g = adzyArr2;
                    break;
                case 66:
                    if (this.h == null) {
                        this.h = new adsi();
                    }
                    codedInputByteBufferNano.readMessage(this.h);
                    break;
                case 74:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    adzoArr = this.i;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.i = adzoArr2;
                    break;
                case 82:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    adzoArr = this.j;
                    length = adzoArr == null ? 0 : adzoArr.length;
                    adzoArr2 = new adzo[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.j, 0, adzoArr2, 0, length);
                    }
                    while (length < adzoArr2.length - 1) {
                        adzoArr2[length] = new adzo();
                        codedInputByteBufferNano.readMessage(adzoArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzoArr2[length] = new adzo();
                    codedInputByteBufferNano.readMessage(adzoArr2[length]);
                    this.j = adzoArr2;
                    break;
                case 90:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    aebs[] aebsArr = this.k;
                    length = aebsArr == null ? 0 : aebsArr.length;
                    aebs[] aebsArr2 = new aebs[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, aebsArr2, 0, length);
                    }
                    while (length < aebsArr2.length - 1) {
                        aebsArr2[length] = new aebs();
                        codedInputByteBufferNano.readMessage(aebsArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aebsArr2[length] = new aebs();
                    codedInputByteBufferNano.readMessage(aebsArr2[length]);
                    this.k = aebsArr2;
                    break;
                default:
                    if (storeUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                    return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        adzo[] adzoArr;
        MessageNano messageNano;
        adzo[] adzoArr2 = this.a;
        int i2 = 0;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.a;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(1, messageNano);
                }
                i++;
            }
        }
        String[] strArr = this.b;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        adzoArr2 = this.c;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.c;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(3, messageNano);
                }
                i++;
            }
        }
        adzoArr2 = this.d;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.d;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(4, messageNano);
                }
                i++;
            }
        }
        adzoArr2 = this.e;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.e;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(5, messageNano);
                }
                i++;
            }
        }
        adzoArr2 = this.f;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.f;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(6, messageNano);
                }
                i++;
            }
        }
        adzy[] adzyArr = this.g;
        if (adzyArr != null && adzyArr.length > 0) {
            i = 0;
            while (true) {
                adzy[] adzyArr2 = this.g;
                if (i >= adzyArr2.length) {
                    break;
                }
                messageNano = adzyArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(7, messageNano);
                }
                i++;
            }
        }
        adsi adsi = this.h;
        if (adsi != null) {
            codedOutputByteBufferNano.writeMessage(8, adsi);
        }
        adzoArr2 = this.i;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.i;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(9, messageNano);
                }
                i++;
            }
        }
        adzoArr2 = this.j;
        if (adzoArr2 != null && adzoArr2.length > 0) {
            i = 0;
            while (true) {
                adzoArr = this.j;
                if (i >= adzoArr.length) {
                    break;
                }
                messageNano = adzoArr[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(10, messageNano);
                }
                i++;
            }
        }
        aebs[] aebsArr = this.k;
        if (aebsArr != null && aebsArr.length > 0) {
            while (true) {
                aebsArr = this.k;
                if (i2 >= aebsArr.length) {
                    break;
                }
                MessageNano messageNano2 = aebsArr[i2];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(11, messageNano2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
