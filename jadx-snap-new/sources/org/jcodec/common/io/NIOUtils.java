package org.jcodec.common.io;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jcodec.platform.Platform;

public class NIOUtils {
    public static byte[] asciiString(String str) {
        return Platform.getBytes(str);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer fetchFromChannel(ReadableByteChannel readableByteChannel, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        readFromChannel(readableByteChannel, allocate);
        allocate.flip();
        return allocate;
    }

    public static final ByteBuffer read(ByteBuffer byteBuffer, int i) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int position = byteBuffer.position() + i;
        duplicate.limit(position);
        byteBuffer.position(position);
        return duplicate;
    }

    public static ByteBuffer readBuf(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        byteBuffer.position(byteBuffer.limit());
        return duplicate;
    }

    public static int readFromChannel(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        while (readableByteChannel.read(byteBuffer) != -1) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
        }
        return byteBuffer.position() - position;
    }

    public static String readNullTermString(ByteBuffer byteBuffer) {
        return readNullTermStringCharset(byteBuffer, Charset.defaultCharset());
    }

    public static String readNullTermStringCharset(ByteBuffer byteBuffer, Charset charset) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.get() == (byte) 0) {
                break;
            }
        }
        if (byteBuffer.hasRemaining()) {
            duplicate.limit(byteBuffer.position() - 1);
        }
        return Platform.stringFromCharset(toArray(duplicate), charset);
    }

    public static String readPascalString(ByteBuffer byteBuffer) {
        return readString(byteBuffer, byteBuffer.get() & 255);
    }

    public static String readPascalStringL(ByteBuffer byteBuffer, int i) {
        byteBuffer = read(byteBuffer, i + 1);
        return Platform.stringFromBytes(toArray(read(byteBuffer, Math.min(byteBuffer.get() & 255, i))));
    }

    public static String readString(ByteBuffer byteBuffer, int i) {
        return Platform.stringFromBytes(toArray(read(byteBuffer, i)));
    }

    public static FileChannelWrapper readableChannel(File file) {
        return new FileChannelWrapper(new FileInputStream(file).getChannel());
    }

    public static FileChannelWrapper rwChannel(File file) {
        return new FileChannelWrapper(new RandomAccessFile(file, "rw").getChannel());
    }

    public static int skip(ByteBuffer byteBuffer, int i) {
        i = Math.min(byteBuffer.remaining(), i);
        byteBuffer.position(byteBuffer.position() + i);
        return i;
    }

    public static byte[] toArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.duplicate().get(bArr);
        return bArr;
    }

    public static byte[] toArrayL(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[Math.min(byteBuffer.remaining(), i)];
        byteBuffer.duplicate().get(bArr);
        return bArr;
    }

    public static FileChannelWrapper writableChannel(File file) {
        return new FileChannelWrapper(new FileOutputStream(file).getChannel());
    }

    public static void write(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2.hasArray()) {
            byteBuffer.put(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        } else {
            byteBuffer.put(toArrayL(byteBuffer2, byteBuffer.remaining()));
        }
    }

    public static void writePascalString(ByteBuffer byteBuffer, String str) {
        byteBuffer.put((byte) str.length());
        byteBuffer.put(asciiString(str));
    }

    public static void writePascalStringL(ByteBuffer byteBuffer, String str, int i) {
        byteBuffer.put((byte) str.length());
        byteBuffer.put(asciiString(str));
        skip(byteBuffer, i - str.length());
    }
}
