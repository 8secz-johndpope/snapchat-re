package org.jcodec.common.io;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelWrapper implements SeekableByteChannel {
    private FileChannel ch;

    public FileChannelWrapper(FileChannel fileChannel) {
        this.ch = fileChannel;
    }

    public void close() {
        this.ch.close();
    }

    public boolean isOpen() {
        return this.ch.isOpen();
    }

    public long position() {
        return this.ch.position();
    }

    public int read(ByteBuffer byteBuffer) {
        return this.ch.read(byteBuffer);
    }

    public SeekableByteChannel setPosition(long j) {
        this.ch.position(j);
        return this;
    }

    public long size() {
        return this.ch.size();
    }

    public int write(ByteBuffer byteBuffer) {
        return this.ch.write(byteBuffer);
    }
}
