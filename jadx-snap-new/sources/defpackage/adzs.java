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
import org.opencv.imgproc.Imgproc;

/* renamed from: adzs */
public final class adzs extends ExtendableMessageNano<adzs> {
    public boolean A;
    public long B;
    public String C;
    public adzu[] D;
    public String E;
    public boolean F;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f = null;
    public String g;
    public long h;
    public String i;
    public adzq[] j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    public String r;
    public String s;
    public String t;
    public String[] u;
    public String v;
    public String w;
    public String x;
    public String y;
    public adzv z;

    public adzs() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.g = str;
        this.h = 0;
        this.i = str;
        this.j = adzq.a();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = str;
        this.o = str;
        this.p = str;
        this.q = false;
        this.r = str;
        this.s = str;
        this.t = str;
        this.u = WireFormatNano.EMPTY_STRING_ARRAY;
        this.v = str;
        this.w = str;
        this.x = str;
        this.y = str;
        this.z = null;
        this.A = false;
        this.B = 0;
        this.C = str;
        this.D = adzu.a();
        this.E = str;
        this.F = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        String str = "";
        if (!this.a.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if (!this.b.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        if (!this.c.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        if (!this.d.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if (!this.e.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        Map map = this.f;
        if (map != null) {
            computeSerializedSize += InternalNano.computeMapFieldSize(map, 6, 9, 9);
        }
        if (!this.g.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.g);
        }
        long j = this.h;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j);
        }
        if (!this.i.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        adzq[] adzqArr = this.j;
        int i2 = 0;
        if (adzqArr != null && adzqArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzq[] adzqArr2 = this.j;
                if (computeSerializedSize >= adzqArr2.length) {
                    break;
                }
                MessageNano messageNano = adzqArr2[computeSerializedSize];
                if (messageNano != null) {
                    i += CodedOutputByteBufferNano.computeMessageSize(10, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        boolean z = this.k;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, z);
        }
        z = this.l;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(12, z);
        }
        z = this.m;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(13, z);
        }
        if (!this.n.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(14, this.n);
        }
        if (!this.o.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.o);
        }
        if (!this.p.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(16, this.p);
        }
        z = this.q;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.r.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(18, this.r);
        }
        if (!this.s.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.s);
        }
        if (!this.t.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(20, this.t);
        }
        String[] strArr = this.u;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.u;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i4 * 2);
        }
        if (!this.v.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(22, this.v);
        }
        if (!this.w.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(23, this.w);
        }
        if (!this.x.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(24, this.x);
        }
        if (!this.y.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.y);
        }
        adzv adzv = this.z;
        if (adzv != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(26, adzv);
        }
        z = this.A;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(27, z);
        }
        j = this.B;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(28, j);
        }
        if (!this.C.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(29, this.C);
        }
        adzu[] adzuArr = this.D;
        if (adzuArr != null && adzuArr.length > 0) {
            while (true) {
                adzuArr = this.D;
                if (i2 >= adzuArr.length) {
                    break;
                }
                MessageNano messageNano2 = adzuArr[i2];
                if (messageNano2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(30, messageNano2);
                }
                i2++;
            }
        }
        if (!this.E.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(31, this.E);
        }
        z = this.F;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(32, z) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        MapFactory mapFactory = MapFactories.getMapFactory();
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            int length;
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f = InternalNano.mergeMapEntry(codedInputByteBufferNano, this.f, mapFactory, 9, 9, null, 10, 18);
                    break;
                case 58:
                    this.g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    adzq[] adzqArr = this.j;
                    length = adzqArr == null ? 0 : adzqArr.length;
                    adzq[] adzqArr2 = new adzq[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.j, 0, adzqArr2, 0, length);
                    }
                    while (length < adzqArr2.length - 1) {
                        adzqArr2[length] = new adzq();
                        codedInputByteBufferNano.readMessage(adzqArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzqArr2[length] = new adzq();
                    codedInputByteBufferNano.readMessage(adzqArr2[length]);
                    this.j = adzqArr2;
                    break;
                case 88:
                    this.k = codedInputByteBufferNano.readBool();
                    break;
                case 96:
                    this.l = codedInputByteBufferNano.readBool();
                    break;
                case 104:
                    this.m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.n = codedInputByteBufferNano.readString();
                    break;
                case Imgproc.COLOR_YUV2BGRA_YVYU /*122*/:
                    this.o = codedInputByteBufferNano.readString();
                    break;
                case 130:
                    this.p = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.q = codedInputByteBufferNano.readBool();
                    break;
                case 146:
                    this.r = codedInputByteBufferNano.readString();
                    break;
                case 154:
                    this.s = codedInputByteBufferNano.readString();
                    break;
                case 162:
                    this.t = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 170);
                    String[] strArr = this.u;
                    length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.u, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.u = strArr2;
                    break;
                case 178:
                    this.v = codedInputByteBufferNano.readString();
                    break;
                case 186:
                    this.w = codedInputByteBufferNano.readString();
                    break;
                case 194:
                    this.x = codedInputByteBufferNano.readString();
                    break;
                case 202:
                    this.y = codedInputByteBufferNano.readString();
                    break;
                case 210:
                    if (this.z == null) {
                        this.z = new adzv();
                    }
                    codedInputByteBufferNano.readMessage(this.z);
                    break;
                case 216:
                    this.A = codedInputByteBufferNano.readBool();
                    break;
                case 224:
                    this.B = codedInputByteBufferNano.readInt64();
                    break;
                case 234:
                    this.C = codedInputByteBufferNano.readString();
                    break;
                case 242:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 242);
                    adzu[] adzuArr = this.D;
                    length = adzuArr == null ? 0 : adzuArr.length;
                    adzu[] adzuArr2 = new adzu[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.D, 0, adzuArr2, 0, length);
                    }
                    while (length < adzuArr2.length - 1) {
                        adzuArr2[length] = new adzu();
                        codedInputByteBufferNano.readMessage(adzuArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzuArr2[length] = new adzu();
                    codedInputByteBufferNano.readMessage(adzuArr2[length]);
                    this.D = adzuArr2;
                    break;
                case 250:
                    this.E = codedInputByteBufferNano.readString();
                    break;
                case 256:
                    this.F = codedInputByteBufferNano.readBool();
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
        String str = "";
        if (!this.a.equals(str)) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals(str)) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals(str)) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if (!this.d.equals(str)) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals(str)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        Map map = this.f;
        if (map != null) {
            InternalNano.serializeMapField(codedOutputByteBufferNano, map, 6, 9, 9);
        }
        if (!this.g.equals(str)) {
            codedOutputByteBufferNano.writeString(7, this.g);
        }
        long j = this.h;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(8, j);
        }
        if (!this.i.equals(str)) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        adzq[] adzqArr = this.j;
        int i2 = 0;
        if (adzqArr != null && adzqArr.length > 0) {
            i = 0;
            while (true) {
                adzq[] adzqArr2 = this.j;
                if (i >= adzqArr2.length) {
                    break;
                }
                MessageNano messageNano = adzqArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(10, messageNano);
                }
                i++;
            }
        }
        boolean z = this.k;
        if (z) {
            codedOutputByteBufferNano.writeBool(11, z);
        }
        z = this.l;
        if (z) {
            codedOutputByteBufferNano.writeBool(12, z);
        }
        z = this.m;
        if (z) {
            codedOutputByteBufferNano.writeBool(13, z);
        }
        if (!this.n.equals(str)) {
            codedOutputByteBufferNano.writeString(14, this.n);
        }
        if (!this.o.equals(str)) {
            codedOutputByteBufferNano.writeString(15, this.o);
        }
        if (!this.p.equals(str)) {
            codedOutputByteBufferNano.writeString(16, this.p);
        }
        z = this.q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.r.equals(str)) {
            codedOutputByteBufferNano.writeString(18, this.r);
        }
        if (!this.s.equals(str)) {
            codedOutputByteBufferNano.writeString(19, this.s);
        }
        if (!this.t.equals(str)) {
            codedOutputByteBufferNano.writeString(20, this.t);
        }
        String[] strArr = this.u;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.u;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(21, str2);
                }
                i++;
            }
        }
        if (!this.v.equals(str)) {
            codedOutputByteBufferNano.writeString(22, this.v);
        }
        if (!this.w.equals(str)) {
            codedOutputByteBufferNano.writeString(23, this.w);
        }
        if (!this.x.equals(str)) {
            codedOutputByteBufferNano.writeString(24, this.x);
        }
        if (!this.y.equals(str)) {
            codedOutputByteBufferNano.writeString(25, this.y);
        }
        adzv adzv = this.z;
        if (adzv != null) {
            codedOutputByteBufferNano.writeMessage(26, adzv);
        }
        z = this.A;
        if (z) {
            codedOutputByteBufferNano.writeBool(27, z);
        }
        j = this.B;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(28, j);
        }
        if (!this.C.equals(str)) {
            codedOutputByteBufferNano.writeString(29, this.C);
        }
        adzu[] adzuArr = this.D;
        if (adzuArr != null && adzuArr.length > 0) {
            while (true) {
                adzuArr = this.D;
                if (i2 >= adzuArr.length) {
                    break;
                }
                MessageNano messageNano2 = adzuArr[i2];
                if (messageNano2 != null) {
                    codedOutputByteBufferNano.writeMessage(30, messageNano2);
                }
                i2++;
            }
        }
        if (!this.E.equals(str)) {
            codedOutputByteBufferNano.writeString(31, this.E);
        }
        z = this.F;
        if (z) {
            codedOutputByteBufferNano.writeBool(32, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
