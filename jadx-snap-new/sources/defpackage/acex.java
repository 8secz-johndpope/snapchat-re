package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import org.opencv.imgproc.Imgproc;

/* renamed from: acex */
public final class acex extends ExtendableMessageNano<acex> {
    private static volatile acex[] a;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private String e;
    private String f;

    public acex() {
        String str = "";
        this.e = str;
        this.f = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acex[] a() {
        if (a == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (a == null) {
                    a = new acex[0];
                }
            }
        }
        return a;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.c);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, this.d);
        }
        if ((this.b & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.e);
        }
        return (this.b & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            int i = 8;
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                i = 1;
                if (readTag == 0 || readTag == 1 || readTag == 2) {
                    this.c = readTag;
                }
            } else if (readTag == 16) {
                readTag = codedInputByteBufferNano.readInt32();
                switch (readTag) {
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
                        break;
                    default:
                        switch (readTag) {
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case Imgproc.COLOR_YUV2RGBA_YVYU /*121*/:
                            case Imgproc.COLOR_YUV2BGRA_YVYU /*122*/:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 127:
                                break;
                            default:
                                continue;
                                continue;
                        }
                }
                this.d = readTag;
                readTag = this.b | 2;
                this.b = readTag;
            } else if (readTag == 26) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.b | 4;
                this.b = readTag;
            } else if (readTag == 34) {
                this.f = codedInputByteBufferNano.readString();
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            readTag = this.b | i;
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.c);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(2, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeString(3, this.e);
        }
        if ((this.b & 8) != 0) {
            codedOutputByteBufferNano.writeString(4, this.f);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
