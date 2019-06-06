package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

final class NioByteString extends LeafByteString {
    private final ByteBuffer buffer;

    NioByteString(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
            return;
        }
        throw new NullPointerException("buffer");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    public final byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    /* Access modifiers changed, original: protected|final */
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        return size() != byteString.size() ? false : size() == 0 ? true : obj instanceof NioByteString ? this.buffer.equals(((NioByteString) obj).buffer) : obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    /* Access modifiers changed, original: final */
    public final boolean equalsRange(ByteString byteString, int i, int i2) {
        return substring(0, i2).equals(byteString.substring(i, i2 + i));
    }

    public final boolean isValidUtf8() {
        return Utf8.isValidUtf8(this.buffer);
    }

    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer);
    }

    public final InputStream newInput() {
        return new InputStream() {
            private final ByteBuffer buf = NioByteString.this.buffer.slice();

            public int available() {
                return this.buf.remaining();
            }

            public void mark(int i) {
                this.buf.mark();
            }

            public boolean markSupported() {
                return true;
            }

            public int read() {
                return !this.buf.hasRemaining() ? -1 : this.buf.get() & 255;
            }

            public int read(byte[] bArr, int i, int i2) {
                if (!this.buf.hasRemaining()) {
                    return -1;
                }
                i2 = Math.min(i2, this.buf.remaining());
                this.buf.get(bArr, i, i2);
                return i2;
            }

            public void reset() {
                try {
                    this.buf.reset();
                } catch (InvalidMarkException e) {
                    throw new IOException(e);
                }
            }
        };
    }

    /* Access modifiers changed, original: protected|final */
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + this.buffer.get(i);
        }
        return i4;
    }

    /* Access modifiers changed, original: protected|final */
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        return Utf8.partialIsValidUtf8(i, this.buffer, i2, i3 + i2);
    }

    public final int size() {
        return this.buffer.remaining();
    }

    public final ByteString substring(int i, int i2) {
        try {
            return new NioByteString(slice(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String toStringInternal(Charset charset) {
        byte[] array;
        int arrayOffset;
        int remaining;
        if (this.buffer.hasArray()) {
            array = this.buffer.array();
            arrayOffset = this.buffer.arrayOffset() + this.buffer.position();
            remaining = this.buffer.remaining();
        } else {
            array = toByteArray();
            arrayOffset = 0;
            remaining = array.length;
        }
        return new String(array, arrayOffset, remaining, charset);
    }

    /* Access modifiers changed, original: final */
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.buffer.slice());
    }

    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }

    /* Access modifiers changed, original: final */
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), (this.buffer.arrayOffset() + this.buffer.position()) + i, i2);
            return;
        }
        ByteBufferWriter.write(slice(i, i2 + i), outputStream);
    }
}
