package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import org.opencv.imgproc.Imgproc;

/* renamed from: adzj */
public final class adzj extends ExtendableMessageNano<adzj> {
    public int a = 0;
    public String b;
    public String c;
    public String d;
    public String e;
    public float f;
    public aeah g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;

    public adzj() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = MapboxConstants.MINIMUM_ZOOM;
        this.g = null;
        this.h = false;
        this.i = str;
        this.j = 0;
        this.k = str;
        this.l = str;
        this.m = str;
        this.n = str;
        this.o = str;
        this.p = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        String str = "";
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
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(6, this.f);
        }
        aeah aeah = this.g;
        if (aeah != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, aeah);
        }
        boolean z = this.h;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        if (!this.i.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        i = this.j;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i);
        }
        if (!this.k.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.k);
        }
        if (!this.l.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(12, this.l);
        }
        if (!this.m.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.m);
        }
        if (!this.n.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(14, this.n);
        }
        if (!this.o.equals(str)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.o);
        }
        return !this.p.equals(str) ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(16, this.p) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.a = codedInputByteBufferNano.readInt32();
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
                case 53:
                    this.f = codedInputByteBufferNano.readFloat();
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new aeah();
                    }
                    codedInputByteBufferNano.readMessage(this.g);
                    break;
                case 64:
                    this.h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.l = codedInputByteBufferNano.readString();
                    break;
                case 106:
                    this.m = codedInputByteBufferNano.readString();
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
                default:
                    if (storeUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                    return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = this.a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        String str = "";
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
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(MapboxConstants.MINIMUM_ZOOM)) {
            codedOutputByteBufferNano.writeFloat(6, this.f);
        }
        aeah aeah = this.g;
        if (aeah != null) {
            codedOutputByteBufferNano.writeMessage(7, aeah);
        }
        boolean z = this.h;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        if (!this.i.equals(str)) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        i = this.j;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(10, i);
        }
        if (!this.k.equals(str)) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        if (!this.l.equals(str)) {
            codedOutputByteBufferNano.writeString(12, this.l);
        }
        if (!this.m.equals(str)) {
            codedOutputByteBufferNano.writeString(13, this.m);
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
        super.writeTo(codedOutputByteBufferNano);
    }
}
