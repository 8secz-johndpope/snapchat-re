package com.googlecode.mp4parser;

import defpackage.aqf;
import defpackage.aqg;
import defpackage.aqh;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccy;
import defpackage.ces;
import defpackage.cex;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractBox implements aqo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static cex LOG = cex.a(AbstractBox.class);
    private ByteBuffer content;
    long contentStartPosition;
    ccy dataSource;
    private ByteBuffer deadBytes = null;
    boolean isParsed;
    boolean isRead;
    long memMapSize = -1;
    long offset;
    private aqp parent;
    protected String type;
    private byte[] userType;

    protected AbstractBox(String str) {
        this.type = str;
        this.isRead = true;
        this.isParsed = true;
    }

    protected AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
        this.isRead = true;
        this.isParsed = true;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            aqk.b(byteBuffer, getSize());
            byteBuffer.put(aqh.a(getType()));
        } else {
            aqk.b(byteBuffer, 1);
            byteBuffer.put(aqh.a(getType()));
            aqk.a(byteBuffer, getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    private boolean isSmallBox() {
        int i = "uuid".equals(getType()) ? 24 : 8;
        if (!this.isRead) {
            return this.memMapSize + ((long) i) < 4294967296L;
        } else {
            if (!this.isParsed) {
                return ((long) (this.content.limit() + i)) < 4294967296L;
            } else {
                long contentSize = getContentSize();
                ByteBuffer byteBuffer = this.deadBytes;
                return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
            }
        }
    }

    private synchronized void readContent() {
        if (!this.isRead) {
            try {
                cex cex = LOG;
                StringBuilder stringBuilder = new StringBuilder("mem mapping ");
                stringBuilder.append(getType());
                cex.a(stringBuilder.toString());
                this.content = this.dataSource.a(this.contentStartPosition, this.memMapSize);
                this.isRead = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean verify(ByteBuffer byteBuffer) {
        long contentSize = getContentSize();
        ByteBuffer byteBuffer2 = this.deadBytes;
        ByteBuffer allocate = ByteBuffer.allocate(ces.a(contentSize + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0))));
        getContent(allocate);
        ByteBuffer byteBuffer3 = this.deadBytes;
        if (byteBuffer3 != null) {
            byteBuffer3.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(getType()));
            String str = ": remaining differs ";
            stringBuilder.append(str);
            stringBuilder.append(byteBuffer.remaining());
            String str2 = " vs. ";
            stringBuilder.append(str2);
            stringBuilder.append(allocate.remaining());
            printStream.print(stringBuilder.toString());
            cex cex = LOG;
            stringBuilder = new StringBuilder(String.valueOf(getType()));
            stringBuilder.append(str);
            stringBuilder.append(byteBuffer.remaining());
            stringBuilder.append(str2);
            stringBuilder.append(allocate.remaining());
            cex.b(stringBuilder.toString());
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            if (byteBuffer.get(limit) != allocate.get(limit2)) {
                LOG.b(String.format("%s: buffers differ at %d: %2X/%2X", new Object[]{getType(), Integer.valueOf(limit), Byte.valueOf(byteBuffer.get(limit)), Byte.valueOf(allocate.get(limit2))}));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                PrintStream printStream2 = System.err;
                StringBuilder stringBuilder2 = new StringBuilder("original      : ");
                stringBuilder2.append(aqg.a(bArr, 4));
                printStream2.println(stringBuilder2.toString());
                printStream2 = System.err;
                stringBuilder2 = new StringBuilder("reconstructed : ");
                stringBuilder2.append(aqg.a(bArr2, 4));
                printStream2.println(stringBuilder2.toString());
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    public abstract void _parseDetails(ByteBuffer byteBuffer);

    public void getBox(WritableByteChannel writableByteChannel) {
        String str = "uuid";
        int i = 8;
        int i2 = 0;
        int i3 = 16;
        ByteBuffer allocate;
        if (!this.isRead) {
            if (!isSmallBox()) {
                i = 16;
            }
            if (str.equals(getType())) {
                i2 = 16;
            }
            allocate = ByteBuffer.allocate(i + i2);
            getHeader(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            this.dataSource.a(this.contentStartPosition, this.memMapSize, writableByteChannel);
        } else if (this.isParsed) {
            allocate = ByteBuffer.allocate(ces.a(getSize()));
            getHeader(allocate);
            getContent(allocate);
            ByteBuffer byteBuffer = this.deadBytes;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.deadBytes.remaining() > 0) {
                    allocate.put(this.deadBytes);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate.rewind());
        } else {
            if (!isSmallBox()) {
                i = 16;
            }
            if (!str.equals(getType())) {
                i3 = 0;
            }
            allocate = ByteBuffer.allocate(i + i3);
            getHeader(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
        }
    }

    public abstract void getContent(ByteBuffer byteBuffer);

    public abstract long getContentSize();

    public long getOffset() {
        return this.offset;
    }

    public aqp getParent() {
        return this.parent;
    }

    public String getPath() {
        String str = "";
        aqo aqo = this;
        while (true) {
            aqp parent = aqo.getParent();
            int i = 0;
            for (aqo aqo2 : parent.getBoxes()) {
                if (aqo2.getType().equals(aqo.getType())) {
                    if (aqo2 == aqo) {
                        break;
                    }
                    i++;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(String.format("/%s[%d]", new Object[]{aqo.getType(), Integer.valueOf(i)})));
            stringBuilder.append(str);
            str = stringBuilder.toString();
            if (!(parent instanceof aqo)) {
                return str;
            }
            aqo = (aqo) parent;
        }
    }

    public long getSize() {
        long j;
        ByteBuffer byteBuffer;
        int i = 0;
        if (!this.isRead) {
            j = this.memMapSize;
        } else if (this.isParsed) {
            j = getContentSize();
        } else {
            byteBuffer = this.content;
            j = (long) (byteBuffer != null ? byteBuffer.limit() : 0);
        }
        j += (long) (((j >= 4294967288L ? 8 : 0) + 8) + ("uuid".equals(getType()) ? 16 : 0));
        byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            i = byteBuffer.limit();
        }
        return j + ((long) i);
    }

    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        this.contentStartPosition = ccy.b();
        this.offset = this.contentStartPosition - ((long) byteBuffer.remaining());
        this.memMapSize = j;
        this.dataSource = ccy;
        ccy.a(ccy.b() + j);
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        readContent();
        cex cex = LOG;
        StringBuilder stringBuilder = new StringBuilder("parsing details of ");
        stringBuilder.append(getType());
        cex.a(stringBuilder.toString());
        if (this.content != null) {
            ByteBuffer byteBuffer = this.content;
            this.isParsed = true;
            byteBuffer.rewind();
            _parseDetails(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.deadBytes = byteBuffer.slice();
            }
            this.content = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void setDeadBytes(ByteBuffer byteBuffer) {
        this.deadBytes = byteBuffer;
    }

    public void setParent(aqp aqp) {
        this.parent = aqp;
    }
}
