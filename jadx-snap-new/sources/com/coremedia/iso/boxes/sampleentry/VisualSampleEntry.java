package com.coremedia.iso.boxes.sampleentry;

import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.aqp;
import defpackage.ccy;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class VisualSampleEntry extends AbstractSampleEntry implements aqp {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    public VisualSampleEntry() {
        super(TYPE3);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        aqk.b(allocate, this.dataReferenceIndex);
        aqk.b(allocate, 0);
        aqk.b(allocate, 0);
        aqk.b(allocate, this.predefined[0]);
        aqk.b(allocate, this.predefined[1]);
        aqk.b(allocate, this.predefined[2]);
        aqk.b(allocate, getWidth());
        aqk.b(allocate, getHeight());
        aqk.a(allocate, getHorizresolution());
        aqk.a(allocate, getVertresolution());
        aqk.b(allocate, 0);
        aqk.b(allocate, getFrameCount());
        aqk.c(allocate, aqn.b(getCompressorname()));
        allocate.put(aqn.a(getCompressorname()));
        int b = aqn.b(getCompressorname());
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        aqk.b(allocate, getDepth());
        aqk.b(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public final String getCompressorname() {
        return this.compressorname;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final int getHeight() {
        return this.height;
    }

    public final double getHorizresolution() {
        return this.horizresolution;
    }

    public final long getSize() {
        long containerSize = getContainerSize() + 78;
        int i = (this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public final double getVertresolution() {
        return this.vertresolution;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void parse(final ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        final long b = ccy.b() + j;
        byteBuffer = ByteBuffer.allocate(78);
        ccy.a(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = aqi.c(byteBuffer);
        aqi.c(byteBuffer);
        aqi.c(byteBuffer);
        this.predefined[0] = aqi.a(byteBuffer);
        this.predefined[1] = aqi.a(byteBuffer);
        this.predefined[2] = aqi.a(byteBuffer);
        this.width = aqi.c(byteBuffer);
        this.height = aqi.c(byteBuffer);
        this.horizresolution = aqi.f(byteBuffer);
        this.vertresolution = aqi.f(byteBuffer);
        aqi.a(byteBuffer);
        this.frameCount = aqi.c(byteBuffer);
        int a = aqi.a(byteBuffer.get());
        if (a > 31) {
            System.out.println("invalid compressor name displayable data: ".concat(String.valueOf(a)));
            a = 31;
        }
        byte[] bArr = new byte[a];
        byteBuffer.get(bArr);
        this.compressorname = aqn.a(bArr);
        if (a < 31) {
            byteBuffer.get(new byte[(31 - a)]);
        }
        this.depth = aqi.c(byteBuffer);
        aqi.c(byteBuffer);
        initContainer(new ccy() {
            public final int a(ByteBuffer byteBuffer) {
                if (b == ccy.b()) {
                    return -1;
                }
                if (((long) byteBuffer.remaining()) <= b - ccy.b()) {
                    return ccy.a(byteBuffer);
                }
                ByteBuffer allocate = ByteBuffer.allocate(ces.a(b - ccy.b()));
                ccy.a(allocate);
                byteBuffer.put((ByteBuffer) allocate.rewind());
                return allocate.capacity();
            }

            public final long a() {
                return b;
            }

            public final long a(long j, long j2, WritableByteChannel writableByteChannel) {
                return ccy.a(j, j2, writableByteChannel);
            }

            public final ByteBuffer a(long j, long j2) {
                return ccy.a(j, j2);
            }

            public final void a(long j) {
                ccy.a(j);
            }

            public final long b() {
                return ccy.b();
            }

            public final void close() {
                ccy.close();
            }
        }, j - 78, aqf);
    }

    public final void setCompressorname(String str) {
        this.compressorname = str;
    }

    public final void setDepth(int i) {
        this.depth = i;
    }

    public final void setFrameCount(int i) {
        this.frameCount = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setHorizresolution(double d) {
        this.horizresolution = d;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVertresolution(double d) {
        this.vertresolution = d;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
