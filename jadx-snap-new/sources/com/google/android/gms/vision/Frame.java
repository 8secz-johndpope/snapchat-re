package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public class Frame {
    private Bitmap mBitmap;
    private Metadata zzlgd;
    private ByteBuffer zzlge;

    public static class Builder {
        private Frame zzlgf = new Frame();

        public Frame build() {
            if (this.zzlgf.zzlge != null || this.zzlgf.mBitmap != null) {
                return this.zzlgf;
            }
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        public Builder setBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zzlgf.mBitmap = bitmap;
            Metadata metadata = this.zzlgf.getMetadata();
            metadata.zzalt = width;
            metadata.zzalu = height;
            return this;
        }

        public Builder setImageData(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                this.zzlgf.zzlge = byteBuffer;
                Metadata metadata = this.zzlgf.getMetadata();
                metadata.zzalt = i;
                metadata.zzalu = i2;
                metadata.format = i3;
                return this;
            } else {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Unsupported image format: ");
                stringBuilder.append(i3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public static class Metadata {
        private int format = -1;
        private int mId;
        private int zzalt;
        private int zzalu;
        private int zzcma;
        private long zziee;

        public int getFormat() {
            return this.format;
        }

        public int getHeight() {
            return this.zzalu;
        }

        public int getId() {
            return this.mId;
        }

        public int getRotation() {
            return this.zzcma;
        }

        public long getTimestampMillis() {
            return this.zziee;
        }

        public int getWidth() {
            return this.zzalt;
        }
    }

    private Frame() {
        this.zzlgd = new Metadata();
        this.zzlge = null;
        this.mBitmap = null;
    }

    /* synthetic */ Frame(zzb zzb) {
        this();
    }

    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            return this.zzlge;
        }
        int width = bitmap.getWidth();
        int height = this.mBitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.mBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            bArr[i2] = (byte) ((int) (((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f)) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    public Metadata getMetadata() {
        return this.zzlgd;
    }
}
