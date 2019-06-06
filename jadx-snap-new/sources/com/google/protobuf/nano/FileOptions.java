package com.google.protobuf.nano;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.core.db.DbConstantsKt;
import org.opencv.imgproc.Imgproc;

public final class FileOptions extends ExtendableMessageNano<FileOptions> {
    public static final int CODE_SIZE = 2;
    public static final int LITE_RUNTIME = 3;
    public static final int SPEED = 1;
    private static volatile FileOptions[] _emptyArray;
    private int bitField0_;
    private boolean ccEnableArenas_;
    private boolean ccGenericServices_;
    private String csharpNamespace_;
    private boolean deprecated_;
    private String goPackage_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private String javaOuterClassname_;
    private String javaPackage_;
    private boolean javaStringCheckUtf8_;
    private String objcClassPrefix_;
    private int optimizeFor_;
    private boolean pyGenericServices_;
    public UninterpretedOption[] uninterpretedOption;

    public FileOptions() {
        clear();
    }

    public static FileOptions[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (_emptyArray == null) {
                    _emptyArray = new FileOptions[0];
                }
            }
        }
        return _emptyArray;
    }

    public static FileOptions parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new FileOptions().mergeFrom(codedInputByteBufferNano);
    }

    public static FileOptions parseFrom(byte[] bArr) {
        return (FileOptions) MessageNano.mergeFrom(new FileOptions(), bArr);
    }

    public final FileOptions clear() {
        this.bitField0_ = 0;
        String str = "";
        this.javaPackage_ = str;
        this.javaOuterClassname_ = str;
        this.javaMultipleFiles_ = false;
        this.javaGenerateEqualsAndHash_ = false;
        this.javaStringCheckUtf8_ = false;
        this.optimizeFor_ = 1;
        this.goPackage_ = str;
        this.ccGenericServices_ = false;
        this.javaGenericServices_ = false;
        this.pyGenericServices_ = false;
        this.deprecated_ = false;
        this.ccEnableArenas_ = false;
        this.objcClassPrefix_ = str;
        this.csharpNamespace_ = str;
        this.uninterpretedOption = UninterpretedOption.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final FileOptions clearCcEnableArenas() {
        this.ccEnableArenas_ = false;
        this.bitField0_ &= -2049;
        return this;
    }

    public final FileOptions clearCcGenericServices() {
        this.ccGenericServices_ = false;
        this.bitField0_ &= -129;
        return this;
    }

    public final FileOptions clearCsharpNamespace() {
        this.csharpNamespace_ = "";
        this.bitField0_ &= -8193;
        return this;
    }

    public final FileOptions clearDeprecated() {
        this.deprecated_ = false;
        this.bitField0_ &= -1025;
        return this;
    }

    public final FileOptions clearGoPackage() {
        this.goPackage_ = "";
        this.bitField0_ &= -65;
        return this;
    }

    public final FileOptions clearJavaGenerateEqualsAndHash() {
        this.javaGenerateEqualsAndHash_ = false;
        this.bitField0_ &= -9;
        return this;
    }

    public final FileOptions clearJavaGenericServices() {
        this.javaGenericServices_ = false;
        this.bitField0_ &= -257;
        return this;
    }

    public final FileOptions clearJavaMultipleFiles() {
        this.javaMultipleFiles_ = false;
        this.bitField0_ &= -5;
        return this;
    }

    public final FileOptions clearJavaOuterClassname() {
        this.javaOuterClassname_ = "";
        this.bitField0_ &= -3;
        return this;
    }

    public final FileOptions clearJavaPackage() {
        this.javaPackage_ = "";
        this.bitField0_ &= -2;
        return this;
    }

    public final FileOptions clearJavaStringCheckUtf8() {
        this.javaStringCheckUtf8_ = false;
        this.bitField0_ &= -17;
        return this;
    }

    public final FileOptions clearObjcClassPrefix() {
        this.objcClassPrefix_ = "";
        this.bitField0_ &= -4097;
        return this;
    }

    public final FileOptions clearOptimizeFor() {
        this.optimizeFor_ = 1;
        this.bitField0_ &= -33;
        return this;
    }

    public final FileOptions clearPyGenericServices() {
        this.pyGenericServices_ = false;
        this.bitField0_ &= -513;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.javaPackage_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.javaOuterClassname_);
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, this.optimizeFor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(10, this.javaMultipleFiles_);
        }
        if ((this.bitField0_ & 64) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.goPackage_);
        }
        if ((this.bitField0_ & 128) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(16, this.ccGenericServices_);
        }
        if ((this.bitField0_ & 256) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, this.javaGenericServices_);
        }
        if ((this.bitField0_ & RasterSource.DEFAULT_TILE_SIZE) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(18, this.pyGenericServices_);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(20, this.javaGenerateEqualsAndHash_);
        }
        if ((this.bitField0_ & Imgproc.INTER_TAB_SIZE2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(23, this.deprecated_);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(27, this.javaStringCheckUtf8_);
        }
        if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(31, this.ccEnableArenas_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(36, this.objcClassPrefix_);
        }
        if ((this.bitField0_ & 8192) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(37, this.csharpNamespace_);
        }
        UninterpretedOption[] uninterpretedOptionArr = this.uninterpretedOption;
        if (uninterpretedOptionArr != null && uninterpretedOptionArr.length > 0) {
            int i = 0;
            while (true) {
                UninterpretedOption[] uninterpretedOptionArr2 = this.uninterpretedOption;
                if (i >= uninterpretedOptionArr2.length) {
                    break;
                }
                MessageNano messageNano = uninterpretedOptionArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(DbConstantsKt.MAX_QUERY_VARIABLE_COUNT, messageNano);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    public final boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    public final String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    public final boolean getDeprecated() {
        return this.deprecated_;
    }

    public final String getGoPackage() {
        return this.goPackage_;
    }

    public final boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    public final boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    public final boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    public final String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    public final String getJavaPackage() {
        return this.javaPackage_;
    }

    public final boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    public final String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    public final int getOptimizeFor() {
        return this.optimizeFor_;
    }

    public final boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    public final boolean hasCcEnableArenas() {
        return (this.bitField0_ & ItemAnimator.FLAG_MOVED) != 0;
    }

    public final boolean hasCcGenericServices() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasCsharpNamespace() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean hasDeprecated() {
        return (this.bitField0_ & Imgproc.INTER_TAB_SIZE2) != 0;
    }

    public final boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasJavaGenericServices() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 4096) != 0;
    }

    public final boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasPyGenericServices() {
        return (this.bitField0_ & RasterSource.DEFAULT_TILE_SIZE) != 0;
    }

    public final com.google.protobuf.nano.FileOptions mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano r6) {
        /*
        r5 = this;
    L_0x0000:
        r0 = r6.readTag();
        r1 = 2;
        r2 = 1;
        switch(r0) {
            case 0: goto L_0x00f4;
            case 10: goto L_0x00e7;
            case 66: goto L_0x00dd;
            case 72: goto L_0x00c9;
            case 80: goto L_0x00be;
            case 90: goto L_0x00b3;
            case 128: goto L_0x00a8;
            case 136: goto L_0x009d;
            case 144: goto L_0x0092;
            case 160: goto L_0x0087;
            case 184: goto L_0x007c;
            case 216: goto L_0x0071;
            case 248: goto L_0x0065;
            case 290: goto L_0x0059;
            case 298: goto L_0x004d;
            case 7994: goto L_0x0010;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = r5.storeUnknownField(r6, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000f:
        return r5;
    L_0x0010:
        r0 = 7994; // 0x1f3a float:1.1202E-41 double:3.9496E-320;
        r0 = com.google.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(r6, r0);
        r1 = r5.uninterpretedOption;
        r3 = 0;
        if (r1 != 0) goto L_0x001d;
    L_0x001b:
        r1 = 0;
        goto L_0x001e;
    L_0x001d:
        r1 = r1.length;
    L_0x001e:
        r0 = r0 + r1;
        r0 = new com.google.protobuf.nano.UninterpretedOption[r0];
        if (r1 == 0) goto L_0x0028;
    L_0x0023:
        r4 = r5.uninterpretedOption;
        java.lang.System.arraycopy(r4, r3, r0, r3, r1);
    L_0x0028:
        r3 = r0.length;
        r3 = r3 - r2;
        if (r1 >= r3) goto L_0x003e;
    L_0x002c:
        r3 = new com.google.protobuf.nano.UninterpretedOption;
        r3.<init>();
        r0[r1] = r3;
        r3 = r0[r1];
        r6.readMessage(r3);
        r6.readTag();
        r1 = r1 + 1;
        goto L_0x0028;
    L_0x003e:
        r2 = new com.google.protobuf.nano.UninterpretedOption;
        r2.<init>();
        r0[r1] = r2;
        r1 = r0[r1];
        r6.readMessage(r1);
        r5.uninterpretedOption = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r6.readString();
        r5.csharpNamespace_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 8192;
        goto L_0x00f0;
    L_0x0059:
        r0 = r6.readString();
        r5.objcClassPrefix_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 4096;
        goto L_0x00f0;
    L_0x0065:
        r0 = r6.readBool();
        r5.ccEnableArenas_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 2048;
        goto L_0x00f0;
    L_0x0071:
        r0 = r6.readBool();
        r5.javaStringCheckUtf8_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 16;
        goto L_0x00f0;
    L_0x007c:
        r0 = r6.readBool();
        r5.deprecated_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 1024;
        goto L_0x00f0;
    L_0x0087:
        r0 = r6.readBool();
        r5.javaGenerateEqualsAndHash_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 8;
        goto L_0x00f0;
    L_0x0092:
        r0 = r6.readBool();
        r5.pyGenericServices_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 512;
        goto L_0x00f0;
    L_0x009d:
        r0 = r6.readBool();
        r5.javaGenericServices_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 256;
        goto L_0x00f0;
    L_0x00a8:
        r0 = r6.readBool();
        r5.ccGenericServices_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 128;
        goto L_0x00f0;
    L_0x00b3:
        r0 = r6.readString();
        r5.goPackage_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 64;
        goto L_0x00f0;
    L_0x00be:
        r0 = r6.readBool();
        r5.javaMultipleFiles_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 4;
        goto L_0x00f0;
    L_0x00c9:
        r0 = r6.readInt32();
        if (r0 == r2) goto L_0x00d6;
    L_0x00cf:
        if (r0 == r1) goto L_0x00d6;
    L_0x00d1:
        r1 = 3;
        if (r0 == r1) goto L_0x00d6;
    L_0x00d4:
        goto L_0x0000;
    L_0x00d6:
        r5.optimizeFor_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | 32;
        goto L_0x00f0;
    L_0x00dd:
        r0 = r6.readString();
        r5.javaOuterClassname_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | r1;
        goto L_0x00f0;
    L_0x00e7:
        r0 = r6.readString();
        r5.javaPackage_ = r0;
        r0 = r5.bitField0_;
        r0 = r0 | r2;
    L_0x00f0:
        r5.bitField0_ = r0;
        goto L_0x0000;
    L_0x00f4:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.FileOptions.mergeFrom(com.google.protobuf.nano.CodedInputByteBufferNano):com.google.protobuf.nano.FileOptions");
    }

    public final FileOptions setCcEnableArenas(boolean z) {
        this.ccEnableArenas_ = z;
        this.bitField0_ |= ItemAnimator.FLAG_MOVED;
        return this;
    }

    public final FileOptions setCcGenericServices(boolean z) {
        this.ccGenericServices_ = z;
        this.bitField0_ |= 128;
        return this;
    }

    public final FileOptions setCsharpNamespace(String str) {
        if (str != null) {
            this.csharpNamespace_ = str;
            this.bitField0_ |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileOptions setDeprecated(boolean z) {
        this.deprecated_ = z;
        this.bitField0_ |= Imgproc.INTER_TAB_SIZE2;
        return this;
    }

    public final FileOptions setGoPackage(String str) {
        if (str != null) {
            this.goPackage_ = str;
            this.bitField0_ |= 64;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileOptions setJavaGenerateEqualsAndHash(boolean z) {
        this.javaGenerateEqualsAndHash_ = z;
        this.bitField0_ |= 8;
        return this;
    }

    public final FileOptions setJavaGenericServices(boolean z) {
        this.javaGenericServices_ = z;
        this.bitField0_ |= 256;
        return this;
    }

    public final FileOptions setJavaMultipleFiles(boolean z) {
        this.javaMultipleFiles_ = z;
        this.bitField0_ |= 4;
        return this;
    }

    public final FileOptions setJavaOuterClassname(String str) {
        if (str != null) {
            this.javaOuterClassname_ = str;
            this.bitField0_ |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileOptions setJavaPackage(String str) {
        if (str != null) {
            this.javaPackage_ = str;
            this.bitField0_ |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileOptions setJavaStringCheckUtf8(boolean z) {
        this.javaStringCheckUtf8_ = z;
        this.bitField0_ |= 16;
        return this;
    }

    public final FileOptions setObjcClassPrefix(String str) {
        if (str != null) {
            this.objcClassPrefix_ = str;
            this.bitField0_ |= 4096;
            return this;
        }
        throw new NullPointerException();
    }

    public final FileOptions setOptimizeFor(int i) {
        this.optimizeFor_ = i;
        this.bitField0_ |= 32;
        return this;
    }

    public final FileOptions setPyGenericServices(boolean z) {
        this.pyGenericServices_ = z;
        this.bitField0_ |= RasterSource.DEFAULT_TILE_SIZE;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.javaPackage_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputByteBufferNano.writeString(8, this.javaOuterClassname_);
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputByteBufferNano.writeInt32(9, this.optimizeFor_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputByteBufferNano.writeBool(10, this.javaMultipleFiles_);
        }
        if ((this.bitField0_ & 64) != 0) {
            codedOutputByteBufferNano.writeString(11, this.goPackage_);
        }
        if ((this.bitField0_ & 128) != 0) {
            codedOutputByteBufferNano.writeBool(16, this.ccGenericServices_);
        }
        if ((this.bitField0_ & 256) != 0) {
            codedOutputByteBufferNano.writeBool(17, this.javaGenericServices_);
        }
        if ((this.bitField0_ & RasterSource.DEFAULT_TILE_SIZE) != 0) {
            codedOutputByteBufferNano.writeBool(18, this.pyGenericServices_);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputByteBufferNano.writeBool(20, this.javaGenerateEqualsAndHash_);
        }
        if ((this.bitField0_ & Imgproc.INTER_TAB_SIZE2) != 0) {
            codedOutputByteBufferNano.writeBool(23, this.deprecated_);
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputByteBufferNano.writeBool(27, this.javaStringCheckUtf8_);
        }
        if ((this.bitField0_ & ItemAnimator.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.writeBool(31, this.ccEnableArenas_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            codedOutputByteBufferNano.writeString(36, this.objcClassPrefix_);
        }
        if ((this.bitField0_ & 8192) != 0) {
            codedOutputByteBufferNano.writeString(37, this.csharpNamespace_);
        }
        UninterpretedOption[] uninterpretedOptionArr = this.uninterpretedOption;
        if (uninterpretedOptionArr != null && uninterpretedOptionArr.length > 0) {
            int i = 0;
            while (true) {
                UninterpretedOption[] uninterpretedOptionArr2 = this.uninterpretedOption;
                if (i >= uninterpretedOptionArr2.length) {
                    break;
                }
                MessageNano messageNano = uninterpretedOptionArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(DbConstantsKt.MAX_QUERY_VARIABLE_COUNT, messageNano);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
