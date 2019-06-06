package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.MapFactories.MapFactory;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.util.Arrays;
import java.util.Map;

/* renamed from: adzo */
public final class adzo extends ExtendableMessageNano<adzo> {
    private static volatile adzo[] as;
    public String A;
    public String B;
    public boolean C;
    public String D;
    public adzn E;
    public aeaj F;
    public String G;
    public double H;
    public boolean I;
    public adzr[] J;
    public long K;
    public boolean L;
    public String[] M;
    public String[] N;
    public int O;
    public adzt P;
    public boolean Q;
    public aeai R;
    public String S;
    public aebt T;
    public String[] U;
    public boolean V;
    public aebd W;
    public aead X;
    public aeax Y;
    public boolean Z;
    public String a;
    public String aa;
    public String[] ab;
    public aeac ac;
    public boolean ad;
    public String[] ae;
    public boolean af;
    public aeba ag;
    public aeau ah;
    public aeav ai;
    public aebc aj;
    public aebl ak;
    public aebr al;
    public String am;
    public aeaw an;
    public aebj ao;
    public aeaz ap;
    public long aq;
    public byte[] ar;
    public long b = 0;
    public String c;
    public Map<String, String> d;
    public String e;
    public adzk f;
    public adzi g;
    public String h;
    public String i;
    public int j;
    public String[] k;
    public adzm[] l;
    public boolean m;
    public long n;
    public long o;
    public boolean p;
    public aeab q;
    public String r;
    public String s;
    public adzh t;
    public boolean u;
    public adzs v;
    public String[] w;
    public String x;
    public boolean y;
    public String z;

    public adzo() {
        String str = "";
        this.a = str;
        this.c = str;
        this.d = null;
        this.e = str;
        this.f = null;
        this.g = null;
        this.h = str;
        this.i = str;
        this.j = 0;
        this.k = WireFormatNano.EMPTY_STRING_ARRAY;
        this.l = adzm.a();
        this.m = false;
        this.n = 0;
        this.o = 0;
        this.p = false;
        this.q = null;
        this.r = str;
        this.s = str;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = WireFormatNano.EMPTY_STRING_ARRAY;
        this.x = str;
        this.y = false;
        this.z = str;
        this.A = str;
        this.B = str;
        this.C = false;
        this.D = str;
        this.E = null;
        this.F = null;
        this.G = str;
        this.H = 0.0d;
        this.I = false;
        this.J = adzr.a();
        this.K = 0;
        this.L = false;
        this.M = WireFormatNano.EMPTY_STRING_ARRAY;
        this.N = WireFormatNano.EMPTY_STRING_ARRAY;
        this.O = 0;
        this.P = null;
        this.Q = false;
        this.R = null;
        this.S = str;
        this.T = null;
        this.U = WireFormatNano.EMPTY_STRING_ARRAY;
        this.V = false;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = false;
        this.aa = str;
        this.ab = WireFormatNano.EMPTY_STRING_ARRAY;
        this.ac = null;
        this.ad = false;
        this.ae = WireFormatNano.EMPTY_STRING_ARRAY;
        this.af = false;
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.al = null;
        this.am = str;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.aq = 0;
        this.ar = WireFormatNano.EMPTY_BYTES;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static adzo a(byte[] bArr) {
        return (adzo) MessageNano.mergeFrom(new adzo(), bArr);
    }

    public static adzo[] a() {
        if (as == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (as == null) {
                    as = new adzo[0];
                }
            }
        }
        return as;
    }

    public final int computeSerializedSize() {
        int i;
        int i2;
        MessageNano messageNano;
        String[] strArr;
        String str;
        int computeSerializedSize = super.computeSerializedSize();
        String str2 = "";
        if (!this.a.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        long j = this.b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j);
        }
        if (!this.c.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        Map map = this.d;
        if (map != null) {
            computeSerializedSize += InternalNano.computeMapFieldSize(map, 4, 9, 9);
        }
        if (!this.e.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        adzk adzk = this.f;
        if (adzk != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, adzk);
        }
        adzi adzi = this.g;
        if (adzi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, adzi);
        }
        if (!this.h.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        if (!this.i.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        int i3 = this.j;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        String[] strArr2 = this.k;
        int i4 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i3 = 0;
            i = 0;
            int i5 = 0;
            while (true) {
                String[] strArr3 = this.k;
                if (i3 >= strArr3.length) {
                    break;
                }
                String str3 = strArr3[i3];
                if (str3 != null) {
                    i5++;
                    i += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i3++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (i5 * 1);
        }
        adzm[] adzmArr = this.l;
        if (adzmArr != null && adzmArr.length > 0) {
            i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzm[] adzmArr2 = this.l;
                if (computeSerializedSize >= adzmArr2.length) {
                    break;
                }
                messageNano = adzmArr2[computeSerializedSize];
                if (messageNano != null) {
                    i2 += CodedOutputByteBufferNano.computeMessageSize(12, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        boolean z = this.m;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(13, z);
        }
        long j2 = this.n;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(14, j2);
        }
        j2 = this.o;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(15, j2);
        }
        z = this.p;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(16, z);
        }
        aeab aeab = this.q;
        if (aeab != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(17, aeab);
        }
        if (!this.r.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(18, this.r);
        }
        if (!this.s.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.s);
        }
        adzh adzh = this.t;
        if (adzh != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(20, adzh);
        }
        z = this.u;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(21, z);
        }
        adzs adzs = this.v;
        if (adzs != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(22, adzs);
        }
        String[] strArr4 = this.w;
        if (strArr4 != null && strArr4.length > 0) {
            i2 = 0;
            i3 = 0;
            i = 0;
            while (true) {
                strArr = this.w;
                if (i2 >= strArr.length) {
                    break;
                }
                str = strArr[i2];
                if (str != null) {
                    i++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i * 2);
        }
        if (!this.x.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(24, this.x);
        }
        z = this.y;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(25, z);
        }
        if (!this.z.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(26, this.z);
        }
        if (!this.A.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(27, this.A);
        }
        if (!this.B.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(28, this.B);
        }
        z = this.C;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(29, z);
        }
        if (!this.D.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(30, this.D);
        }
        adzn adzn = this.E;
        if (adzn != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(31, adzn);
        }
        aeaj aeaj = this.F;
        if (aeaj != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(32, aeaj);
        }
        if (!this.G.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(33, this.G);
        }
        if (Double.doubleToLongBits(this.H) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(34, this.H);
        }
        z = this.I;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(35, z);
        }
        adzr[] adzrArr = this.J;
        if (adzrArr != null && adzrArr.length > 0) {
            i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                adzr[] adzrArr2 = this.J;
                if (computeSerializedSize >= adzrArr2.length) {
                    break;
                }
                messageNano = adzrArr2[computeSerializedSize];
                if (messageNano != null) {
                    i2 += CodedOutputByteBufferNano.computeMessageSize(36, messageNano);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        j2 = this.K;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(37, j2);
        }
        z = this.L;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(38, z);
        }
        strArr4 = this.M;
        if (strArr4 != null && strArr4.length > 0) {
            i2 = 0;
            i3 = 0;
            i = 0;
            while (true) {
                strArr = this.M;
                if (i2 >= strArr.length) {
                    break;
                }
                str = strArr[i2];
                if (str != null) {
                    i++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i * 2);
        }
        strArr4 = this.N;
        if (strArr4 != null && strArr4.length > 0) {
            i2 = 0;
            i3 = 0;
            i = 0;
            while (true) {
                strArr = this.N;
                if (i2 >= strArr.length) {
                    break;
                }
                str = strArr[i2];
                if (str != null) {
                    i++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i * 2);
        }
        i2 = this.O;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(41, i2);
        }
        adzt adzt = this.P;
        if (adzt != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(42, adzt);
        }
        z = this.Q;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(43, z);
        }
        aeai aeai = this.R;
        if (aeai != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(44, aeai);
        }
        if (!this.S.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(45, this.S);
        }
        aebt aebt = this.T;
        if (aebt != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(46, aebt);
        }
        strArr4 = this.U;
        if (strArr4 != null && strArr4.length > 0) {
            i2 = 0;
            i3 = 0;
            i = 0;
            while (true) {
                strArr = this.U;
                if (i2 >= strArr.length) {
                    break;
                }
                str = strArr[i2];
                if (str != null) {
                    i++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i * 2);
        }
        z = this.V;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(48, z);
        }
        aebd aebd = this.W;
        if (aebd != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(49, aebd);
        }
        aead aead = this.X;
        if (aead != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(50, aead);
        }
        aeax aeax = this.Y;
        if (aeax != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(51, aeax);
        }
        z = this.Z;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(52, z);
        }
        if (!this.aa.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(53, this.aa);
        }
        strArr4 = this.ab;
        if (strArr4 != null && strArr4.length > 0) {
            i2 = 0;
            i3 = 0;
            i = 0;
            while (true) {
                strArr = this.ab;
                if (i2 >= strArr.length) {
                    break;
                }
                str = strArr[i2];
                if (str != null) {
                    i++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + (i * 2);
        }
        aeac aeac = this.ac;
        if (aeac != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(55, aeac);
        }
        z = this.ad;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(56, z);
        }
        strArr4 = this.ae;
        if (strArr4 != null && strArr4.length > 0) {
            i2 = 0;
            i3 = 0;
            while (true) {
                String[] strArr5 = this.ae;
                if (i4 >= strArr5.length) {
                    break;
                }
                String str4 = strArr5[i4];
                if (str4 != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i4++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 * 2);
        }
        boolean z2 = this.af;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(58, z2);
        }
        aeba aeba = this.ag;
        if (aeba != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(59, aeba);
        }
        aeau aeau = this.ah;
        if (aeau != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(60, aeau);
        }
        aeav aeav = this.ai;
        if (aeav != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(61, aeav);
        }
        aebc aebc = this.aj;
        if (aebc != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(62, aebc);
        }
        aebl aebl = this.ak;
        if (aebl != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(63, aebl);
        }
        aebr aebr = this.al;
        if (aebr != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(64, aebr);
        }
        if (!this.am.equals(str2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(65, this.am);
        }
        aeaw aeaw = this.an;
        if (aeaw != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(66, aeaw);
        }
        aebj aebj = this.ao;
        if (aebj != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(67, aebj);
        }
        aeaz aeaz = this.ap;
        if (aeaz != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(68, aeaz);
        }
        long j3 = this.aq;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(69, j3);
        }
        return !Arrays.equals(this.ar, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(70, this.ar) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        MapFactory mapFactory = MapFactories.getMapFactory();
        while (true) {
            MessageNano messageNano;
            int readTag = codedInputByteBufferNano.readTag();
            String[] strArr;
            int length;
            String[] strArr2;
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.a = codedInputByteBufferNano.readString();
                    continue;
                case 16:
                    this.b = codedInputByteBufferNano.readInt64();
                    continue;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    continue;
                case 34:
                    this.d = InternalNano.mergeMapEntry(codedInputByteBufferNano, this.d, mapFactory, 9, 9, null, 10, 18);
                    continue;
                case 42:
                    this.e = codedInputByteBufferNano.readString();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new adzk();
                    }
                    messageNano = this.f;
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new adzi();
                    }
                    messageNano = this.g;
                    break;
                case 66:
                    this.h = codedInputByteBufferNano.readString();
                    continue;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    continue;
                case 80:
                    this.j = codedInputByteBufferNano.readInt32();
                    continue;
                case 90:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    strArr = this.k;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.k = strArr2;
                    continue;
                case 98:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                    adzm[] adzmArr = this.l;
                    length = adzmArr == null ? 0 : adzmArr.length;
                    adzm[] adzmArr2 = new adzm[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, adzmArr2, 0, length);
                    }
                    while (length < adzmArr2.length - 1) {
                        adzmArr2[length] = new adzm();
                        codedInputByteBufferNano.readMessage(adzmArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzmArr2[length] = new adzm();
                    codedInputByteBufferNano.readMessage(adzmArr2[length]);
                    this.l = adzmArr2;
                    continue;
                case 104:
                    this.m = codedInputByteBufferNano.readBool();
                    continue;
                case 112:
                    this.n = codedInputByteBufferNano.readInt64();
                    continue;
                case 120:
                    this.o = codedInputByteBufferNano.readInt64();
                    continue;
                case 128:
                    this.p = codedInputByteBufferNano.readBool();
                    continue;
                case 138:
                    if (this.q == null) {
                        this.q = new aeab();
                    }
                    messageNano = this.q;
                    break;
                case 146:
                    this.r = codedInputByteBufferNano.readString();
                    continue;
                case 154:
                    this.s = codedInputByteBufferNano.readString();
                    continue;
                case 162:
                    if (this.t == null) {
                        this.t = new adzh();
                    }
                    messageNano = this.t;
                    break;
                case 168:
                    this.u = codedInputByteBufferNano.readBool();
                    continue;
                case 178:
                    if (this.v == null) {
                        this.v = new adzs();
                    }
                    messageNano = this.v;
                    break;
                case 186:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    strArr = this.w;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.w, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.w = strArr2;
                    continue;
                case 194:
                    this.x = codedInputByteBufferNano.readString();
                    continue;
                case Callback.DEFAULT_DRAG_ANIMATION_DURATION /*200*/:
                    this.y = codedInputByteBufferNano.readBool();
                    continue;
                case 210:
                    this.z = codedInputByteBufferNano.readString();
                    continue;
                case 218:
                    this.A = codedInputByteBufferNano.readString();
                    continue;
                case 226:
                    this.B = codedInputByteBufferNano.readString();
                    continue;
                case 232:
                    this.C = codedInputByteBufferNano.readBool();
                    continue;
                case 242:
                    this.D = codedInputByteBufferNano.readString();
                    continue;
                case 250:
                    if (this.E == null) {
                        this.E = new adzn();
                    }
                    messageNano = this.E;
                    break;
                case 258:
                    if (this.F == null) {
                        this.F = new aeaj();
                    }
                    messageNano = this.F;
                    break;
                case 266:
                    this.G = codedInputByteBufferNano.readString();
                    continue;
                case ModuleDescriptor.MODULE_VERSION /*273*/:
                    this.H = codedInputByteBufferNano.readDouble();
                    continue;
                case 280:
                    this.I = codedInputByteBufferNano.readBool();
                    continue;
                case 290:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 290);
                    adzr[] adzrArr = this.J;
                    length = adzrArr == null ? 0 : adzrArr.length;
                    adzr[] adzrArr2 = new adzr[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.J, 0, adzrArr2, 0, length);
                    }
                    while (length < adzrArr2.length - 1) {
                        adzrArr2[length] = new adzr();
                        codedInputByteBufferNano.readMessage(adzrArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    adzrArr2[length] = new adzr();
                    codedInputByteBufferNano.readMessage(adzrArr2[length]);
                    this.J = adzrArr2;
                    continue;
                case 296:
                    this.K = codedInputByteBufferNano.readInt64();
                    continue;
                case 304:
                    this.L = codedInputByteBufferNano.readBool();
                    continue;
                case 314:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 314);
                    strArr = this.M;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.M, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.M = strArr2;
                    continue;
                case 322:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 322);
                    strArr = this.N;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.N, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.N = strArr2;
                    continue;
                case 328:
                    this.O = codedInputByteBufferNano.readInt32();
                    continue;
                case 338:
                    if (this.P == null) {
                        this.P = new adzt();
                    }
                    messageNano = this.P;
                    break;
                case 344:
                    this.Q = codedInputByteBufferNano.readBool();
                    continue;
                case 354:
                    if (this.R == null) {
                        this.R = new aeai();
                    }
                    messageNano = this.R;
                    break;
                case 362:
                    this.S = codedInputByteBufferNano.readString();
                    continue;
                case 370:
                    if (this.T == null) {
                        this.T = new aebt();
                    }
                    messageNano = this.T;
                    break;
                case 378:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 378);
                    strArr = this.U;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.U, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.U = strArr2;
                    continue;
                case 384:
                    this.V = codedInputByteBufferNano.readBool();
                    continue;
                case 394:
                    if (this.W == null) {
                        this.W = new aebd();
                    }
                    messageNano = this.W;
                    break;
                case 402:
                    if (this.X == null) {
                        this.X = new aead();
                    }
                    messageNano = this.X;
                    break;
                case 410:
                    if (this.Y == null) {
                        this.Y = new aeax();
                    }
                    messageNano = this.Y;
                    break;
                case 416:
                    this.Z = codedInputByteBufferNano.readBool();
                    continue;
                case 426:
                    this.aa = codedInputByteBufferNano.readString();
                    continue;
                case 434:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 434);
                    strArr = this.ab;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.ab, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.ab = strArr2;
                    continue;
                case 442:
                    if (this.ac == null) {
                        this.ac = new aeac();
                    }
                    messageNano = this.ac;
                    break;
                case 448:
                    this.ad = codedInputByteBufferNano.readBool();
                    continue;
                case 458:
                    readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 458);
                    strArr = this.ae;
                    length = strArr == null ? 0 : strArr.length;
                    strArr2 = new String[(readTag + length)];
                    if (length != 0) {
                        System.arraycopy(this.ae, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.ae = strArr2;
                    continue;
                case 464:
                    this.af = codedInputByteBufferNano.readBool();
                    continue;
                case 474:
                    if (this.ag == null) {
                        this.ag = new aeba();
                    }
                    messageNano = this.ag;
                    break;
                case 482:
                    if (this.ah == null) {
                        this.ah = new aeau();
                    }
                    messageNano = this.ah;
                    break;
                case 490:
                    if (this.ai == null) {
                        this.ai = new aeav();
                    }
                    messageNano = this.ai;
                    break;
                case 498:
                    if (this.aj == null) {
                        this.aj = new aebc();
                    }
                    messageNano = this.aj;
                    break;
                case 506:
                    if (this.ak == null) {
                        this.ak = new aebl();
                    }
                    messageNano = this.ak;
                    break;
                case 514:
                    if (this.al == null) {
                        this.al = new aebr();
                    }
                    messageNano = this.al;
                    break;
                case 522:
                    this.am = codedInputByteBufferNano.readString();
                    continue;
                case 530:
                    if (this.an == null) {
                        this.an = new aeaw();
                    }
                    messageNano = this.an;
                    break;
                case 538:
                    if (this.ao == null) {
                        this.ao = new aebj();
                    }
                    messageNano = this.ao;
                    break;
                case 546:
                    if (this.ap == null) {
                        this.ap = new aeaz();
                    }
                    messageNano = this.ap;
                    break;
                case 552:
                    this.aq = codedInputByteBufferNano.readInt64();
                    continue;
                case 562:
                    this.ar = codedInputByteBufferNano.readBytes();
                    continue;
                default:
                    if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    continue;
            }
            codedInputByteBufferNano.readMessage(messageNano);
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        String[] strArr;
        String str;
        MessageNano messageNano;
        String str2 = "";
        if (!this.a.equals(str2)) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        long j = this.b;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(2, j);
        }
        if (!this.c.equals(str2)) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        Map map = this.d;
        if (map != null) {
            InternalNano.serializeMapField(codedOutputByteBufferNano, map, 4, 9, 9);
        }
        if (!this.e.equals(str2)) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        adzk adzk = this.f;
        if (adzk != null) {
            codedOutputByteBufferNano.writeMessage(6, adzk);
        }
        adzi adzi = this.g;
        if (adzi != null) {
            codedOutputByteBufferNano.writeMessage(7, adzi);
        }
        if (!this.h.equals(str2)) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        if (!this.i.equals(str2)) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        int i = this.j;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(10, i);
        }
        String[] strArr2 = this.k;
        int i2 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.k;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i++;
            }
        }
        adzm[] adzmArr = this.l;
        if (adzmArr != null && adzmArr.length > 0) {
            i = 0;
            while (true) {
                adzm[] adzmArr2 = this.l;
                if (i >= adzmArr2.length) {
                    break;
                }
                messageNano = adzmArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(12, messageNano);
                }
                i++;
            }
        }
        boolean z = this.m;
        if (z) {
            codedOutputByteBufferNano.writeBool(13, z);
        }
        long j2 = this.n;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(14, j2);
        }
        j2 = this.o;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(15, j2);
        }
        z = this.p;
        if (z) {
            codedOutputByteBufferNano.writeBool(16, z);
        }
        aeab aeab = this.q;
        if (aeab != null) {
            codedOutputByteBufferNano.writeMessage(17, aeab);
        }
        if (!this.r.equals(str2)) {
            codedOutputByteBufferNano.writeString(18, this.r);
        }
        if (!this.s.equals(str2)) {
            codedOutputByteBufferNano.writeString(19, this.s);
        }
        adzh adzh = this.t;
        if (adzh != null) {
            codedOutputByteBufferNano.writeMessage(20, adzh);
        }
        z = this.u;
        if (z) {
            codedOutputByteBufferNano.writeBool(21, z);
        }
        adzs adzs = this.v;
        if (adzs != null) {
            codedOutputByteBufferNano.writeMessage(22, adzs);
        }
        strArr2 = this.w;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.w;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(23, str);
                }
                i++;
            }
        }
        if (!this.x.equals(str2)) {
            codedOutputByteBufferNano.writeString(24, this.x);
        }
        z = this.y;
        if (z) {
            codedOutputByteBufferNano.writeBool(25, z);
        }
        if (!this.z.equals(str2)) {
            codedOutputByteBufferNano.writeString(26, this.z);
        }
        if (!this.A.equals(str2)) {
            codedOutputByteBufferNano.writeString(27, this.A);
        }
        if (!this.B.equals(str2)) {
            codedOutputByteBufferNano.writeString(28, this.B);
        }
        z = this.C;
        if (z) {
            codedOutputByteBufferNano.writeBool(29, z);
        }
        if (!this.D.equals(str2)) {
            codedOutputByteBufferNano.writeString(30, this.D);
        }
        adzn adzn = this.E;
        if (adzn != null) {
            codedOutputByteBufferNano.writeMessage(31, adzn);
        }
        aeaj aeaj = this.F;
        if (aeaj != null) {
            codedOutputByteBufferNano.writeMessage(32, aeaj);
        }
        if (!this.G.equals(str2)) {
            codedOutputByteBufferNano.writeString(33, this.G);
        }
        if (Double.doubleToLongBits(this.H) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(34, this.H);
        }
        z = this.I;
        if (z) {
            codedOutputByteBufferNano.writeBool(35, z);
        }
        adzr[] adzrArr = this.J;
        if (adzrArr != null && adzrArr.length > 0) {
            i = 0;
            while (true) {
                adzr[] adzrArr2 = this.J;
                if (i >= adzrArr2.length) {
                    break;
                }
                messageNano = adzrArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(36, messageNano);
                }
                i++;
            }
        }
        j2 = this.K;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(37, j2);
        }
        z = this.L;
        if (z) {
            codedOutputByteBufferNano.writeBool(38, z);
        }
        strArr2 = this.M;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.M;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(39, str);
                }
                i++;
            }
        }
        strArr2 = this.N;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.N;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(40, str);
                }
                i++;
            }
        }
        i = this.O;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(41, i);
        }
        adzt adzt = this.P;
        if (adzt != null) {
            codedOutputByteBufferNano.writeMessage(42, adzt);
        }
        z = this.Q;
        if (z) {
            codedOutputByteBufferNano.writeBool(43, z);
        }
        aeai aeai = this.R;
        if (aeai != null) {
            codedOutputByteBufferNano.writeMessage(44, aeai);
        }
        if (!this.S.equals(str2)) {
            codedOutputByteBufferNano.writeString(45, this.S);
        }
        aebt aebt = this.T;
        if (aebt != null) {
            codedOutputByteBufferNano.writeMessage(46, aebt);
        }
        strArr2 = this.U;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.U;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(47, str);
                }
                i++;
            }
        }
        z = this.V;
        if (z) {
            codedOutputByteBufferNano.writeBool(48, z);
        }
        aebd aebd = this.W;
        if (aebd != null) {
            codedOutputByteBufferNano.writeMessage(49, aebd);
        }
        aead aead = this.X;
        if (aead != null) {
            codedOutputByteBufferNano.writeMessage(50, aead);
        }
        aeax aeax = this.Y;
        if (aeax != null) {
            codedOutputByteBufferNano.writeMessage(51, aeax);
        }
        z = this.Z;
        if (z) {
            codedOutputByteBufferNano.writeBool(52, z);
        }
        if (!this.aa.equals(str2)) {
            codedOutputByteBufferNano.writeString(53, this.aa);
        }
        strArr2 = this.ab;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.ab;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(54, str);
                }
                i++;
            }
        }
        aeac aeac = this.ac;
        if (aeac != null) {
            codedOutputByteBufferNano.writeMessage(55, aeac);
        }
        z = this.ad;
        if (z) {
            codedOutputByteBufferNano.writeBool(56, z);
        }
        strArr2 = this.ae;
        if (strArr2 != null && strArr2.length > 0) {
            while (true) {
                strArr2 = this.ae;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i2];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(57, str3);
                }
                i2++;
            }
        }
        z = this.af;
        if (z) {
            codedOutputByteBufferNano.writeBool(58, z);
        }
        aeba aeba = this.ag;
        if (aeba != null) {
            codedOutputByteBufferNano.writeMessage(59, aeba);
        }
        aeau aeau = this.ah;
        if (aeau != null) {
            codedOutputByteBufferNano.writeMessage(60, aeau);
        }
        aeav aeav = this.ai;
        if (aeav != null) {
            codedOutputByteBufferNano.writeMessage(61, aeav);
        }
        aebc aebc = this.aj;
        if (aebc != null) {
            codedOutputByteBufferNano.writeMessage(62, aebc);
        }
        aebl aebl = this.ak;
        if (aebl != null) {
            codedOutputByteBufferNano.writeMessage(63, aebl);
        }
        aebr aebr = this.al;
        if (aebr != null) {
            codedOutputByteBufferNano.writeMessage(64, aebr);
        }
        if (!this.am.equals(str2)) {
            codedOutputByteBufferNano.writeString(65, this.am);
        }
        aeaw aeaw = this.an;
        if (aeaw != null) {
            codedOutputByteBufferNano.writeMessage(66, aeaw);
        }
        aebj aebj = this.ao;
        if (aebj != null) {
            codedOutputByteBufferNano.writeMessage(67, aebj);
        }
        aeaz aeaz = this.ap;
        if (aeaz != null) {
            codedOutputByteBufferNano.writeMessage(68, aeaz);
        }
        long j3 = this.aq;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(69, j3);
        }
        if (!Arrays.equals(this.ar, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(70, this.ar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
