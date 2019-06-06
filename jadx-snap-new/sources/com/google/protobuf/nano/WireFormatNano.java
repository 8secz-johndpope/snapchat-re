package com.google.protobuf.nano;

public final class WireFormatNano {
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final byte[][] EMPTY_BYTES_ARRAY = new byte[0][];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    static final int WIRETYPE_END_GROUP = 4;
    static final int WIRETYPE_FIXED32 = 5;
    static final int WIRETYPE_FIXED64 = 1;
    static final int WIRETYPE_LENGTH_DELIMITED = 2;
    static final int WIRETYPE_START_GROUP = 3;
    static final int WIRETYPE_VARINT = 0;

    private WireFormatNano() {
    }

    public static final int getRepeatedFieldArrayLength(CodedInputByteBufferNano codedInputByteBufferNano, int i) {
        int position = codedInputByteBufferNano.getPosition();
        codedInputByteBufferNano.skipField(i);
        int i2 = 1;
        while (codedInputByteBufferNano.readTag() == i) {
            codedInputByteBufferNano.skipField(i);
            i2++;
        }
        codedInputByteBufferNano.rewindToPosition(position);
        return i2;
    }

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    static int getTagWireType(int i) {
        return i & 7;
    }

    static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean parseUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int i) {
        return codedInputByteBufferNano.skipField(i);
    }
}
