package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import org.opencv.imgproc.Imgproc;

/* renamed from: alev */
public final class alev extends ExtendableMessageNano<alev> {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public alev() {
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alev a() {
        this.f = true;
        this.a |= 16;
        return this;
    }

    public final alev a(boolean z) {
        this.b = z;
        this.a |= 1;
        return this;
    }

    public final alev b() {
        this.j = false;
        this.a |= 256;
        return this;
    }

    public final alev b(boolean z) {
        this.c = z;
        this.a |= 2;
        return this;
    }

    public final alev c(boolean z) {
        this.d = z;
        this.a |= 4;
        return this;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, this.d);
        }
        if ((this.a & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, this.e);
        }
        if ((this.a & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, this.f);
        }
        if ((this.a & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(6, this.g);
        }
        if ((this.a & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, this.h);
        }
        if ((this.a & 128) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, this.i);
        }
        if ((this.a & 256) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(9, this.j);
        }
        if ((this.a & RasterSource.DEFAULT_TILE_SIZE) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(10, this.k);
        }
        if ((this.a & Imgproc.INTER_TAB_SIZE2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, this.l);
        }
        return (this.a & ItemAnimator.FLAG_MOVED) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(12, this.m) : computeSerializedSize;
    }

    public final alev d(boolean z) {
        this.e = z;
        this.a |= 8;
        return this;
    }

    public final alev e(boolean z) {
        this.g = z;
        this.a |= 32;
        return this;
    }

    public final alev f(boolean z) {
        this.h = z;
        this.a |= 64;
        return this;
    }

    public final alev g(boolean z) {
        this.i = z;
        this.a |= 128;
        return this;
    }

    public final alev h(boolean z) {
        this.k = z;
        this.a |= RasterSource.DEFAULT_TILE_SIZE;
        return this;
    }

    public final alev i(boolean z) {
        this.l = z;
        this.a |= Imgproc.INTER_TAB_SIZE2;
        return this;
    }

    public final alev j(boolean z) {
        this.m = z;
        this.a |= ItemAnimator.FLAG_MOVED;
        return this;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.b = codedInputByteBufferNano.readBool();
                    readTag = this.a | 1;
                    break;
                case 16:
                    this.c = codedInputByteBufferNano.readBool();
                    readTag = this.a | 2;
                    break;
                case 24:
                    this.d = codedInputByteBufferNano.readBool();
                    readTag = this.a | 4;
                    break;
                case 32:
                    this.e = codedInputByteBufferNano.readBool();
                    readTag = this.a | 8;
                    break;
                case 40:
                    this.f = codedInputByteBufferNano.readBool();
                    readTag = this.a | 16;
                    break;
                case 48:
                    this.g = codedInputByteBufferNano.readBool();
                    readTag = this.a | 32;
                    break;
                case 56:
                    this.h = codedInputByteBufferNano.readBool();
                    readTag = this.a | 64;
                    break;
                case 64:
                    this.i = codedInputByteBufferNano.readBool();
                    readTag = this.a | 128;
                    break;
                case 72:
                    this.j = codedInputByteBufferNano.readBool();
                    readTag = this.a | 256;
                    break;
                case 80:
                    this.k = codedInputByteBufferNano.readBool();
                    readTag = this.a | RasterSource.DEFAULT_TILE_SIZE;
                    break;
                case 88:
                    this.l = codedInputByteBufferNano.readBool();
                    readTag = this.a | Imgproc.INTER_TAB_SIZE2;
                    break;
                case 96:
                    this.m = codedInputByteBufferNano.readBool();
                    readTag = this.a | ItemAnimator.FLAG_MOVED;
                    break;
                default:
                    if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    continue;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeBool(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeBool(2, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeBool(3, this.d);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeBool(4, this.e);
        }
        if ((this.a & 16) != 0) {
            codedOutputByteBufferNano.writeBool(5, this.f);
        }
        if ((this.a & 32) != 0) {
            codedOutputByteBufferNano.writeBool(6, this.g);
        }
        if ((this.a & 64) != 0) {
            codedOutputByteBufferNano.writeBool(7, this.h);
        }
        if ((this.a & 128) != 0) {
            codedOutputByteBufferNano.writeBool(8, this.i);
        }
        if ((this.a & 256) != 0) {
            codedOutputByteBufferNano.writeBool(9, this.j);
        }
        if ((this.a & RasterSource.DEFAULT_TILE_SIZE) != 0) {
            codedOutputByteBufferNano.writeBool(10, this.k);
        }
        if ((this.a & Imgproc.INTER_TAB_SIZE2) != 0) {
            codedOutputByteBufferNano.writeBool(11, this.l);
        }
        if ((this.a & ItemAnimator.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.writeBool(12, this.m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
