package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: alrv */
public final class alrv extends ExtendableMessageNano<alrv> {
    public a a;
    private int b = 0;
    private String c;
    private String d;
    private String e;

    /* renamed from: alrv$a */
    public static final class a extends ExtendableMessageNano<a> {
        private int a;
        private float b;
        private float c;
        private int d;
        private int e;

        public a() {
            this.a = 0;
            this.b = MapboxConstants.MINIMUM_ZOOM;
            this.c = MapboxConstants.MINIMUM_ZOOM;
            this.d = 0;
            this.e = 0;
            this.unknownFieldData = null;
            this.cachedSize = -1;
        }

        public final a a(float f) {
            this.b = f;
            this.a |= 1;
            return this;
        }

        public final a a(int i) {
            this.d = i;
            this.a |= 4;
            return this;
        }

        public final a b(float f) {
            this.c = f;
            this.a |= 2;
            return this;
        }

        public final a b(int i) {
            this.e = i;
            this.a |= 8;
            return this;
        }

        public final int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.a & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(1, this.b);
            }
            if ((this.a & 2) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeFloatSize(2, this.c);
            }
            if ((this.a & 4) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.d);
            }
            return (this.a & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, this.e) : computeSerializedSize;
        }

        public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    return this;
                }
                if (readTag == 13) {
                    this.b = codedInputByteBufferNano.readFloat();
                    readTag = this.a | 1;
                } else if (readTag == 21) {
                    this.c = codedInputByteBufferNano.readFloat();
                    readTag = this.a | 2;
                } else if (readTag == 24) {
                    this.d = codedInputByteBufferNano.readInt32();
                    readTag = this.a | 4;
                } else if (readTag == 32) {
                    this.e = codedInputByteBufferNano.readInt32();
                    readTag = this.a | 8;
                } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
                this.a = readTag;
            }
        }

        public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if ((this.a & 1) != 0) {
                codedOutputByteBufferNano.writeFloat(1, this.b);
            }
            if ((this.a & 2) != 0) {
                codedOutputByteBufferNano.writeFloat(2, this.c);
            }
            if ((this.a & 4) != 0) {
                codedOutputByteBufferNano.writeInt32(3, this.d);
            }
            if ((this.a & 8) != 0) {
                codedOutputByteBufferNano.writeInt32(4, this.e);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public alrv() {
        String str = "";
        this.c = str;
        this.a = null;
        this.d = str;
        this.e = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final alrv a(String str) {
        if (str != null) {
            this.c = str;
            this.b |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final alrv b(String str) {
        if (str != null) {
            this.d = str;
            this.b |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final alrv c(String str) {
        if (str != null) {
            this.e = str;
            this.b |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.b & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.c);
        }
        a aVar = this.a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        if ((this.b & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.d);
        }
        return (this.b & 4) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.c = codedInputByteBufferNano.readString();
                readTag = this.b | 1;
            } else if (readTag == 18) {
                if (this.a == null) {
                    this.a = new a();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 26) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.b | 2;
            } else if (readTag == 34) {
                this.e = codedInputByteBufferNano.readString();
                readTag = this.b | 4;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.b = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.b & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.c);
        }
        a aVar = this.a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        if ((this.b & 2) != 0) {
            codedOutputByteBufferNano.writeString(3, this.d);
        }
        if ((this.b & 4) != 0) {
            codedOutputByteBufferNano.writeString(4, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
