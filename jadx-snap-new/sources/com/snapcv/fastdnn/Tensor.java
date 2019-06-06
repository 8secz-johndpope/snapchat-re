package com.snapcv.fastdnn;

import java.nio.ByteBuffer;

public final class Tensor {
    private final ByteBuffer data;
    private final TensorFormat format;
    private final TensorShape shape;

    public Tensor(TensorShape tensorShape, TensorFormat tensorFormat) {
        this.shape = tensorShape;
        this.format = tensorFormat;
        this.data = ByteBuffer.allocateDirect(tensorShape.getTotalElementCount() * tensorFormat.getElementByteSize());
    }

    public Tensor(TensorShape tensorShape, TensorFormat tensorFormat, ByteBuffer byteBuffer) {
        this.shape = tensorShape;
        this.format = tensorFormat;
        if (byteBuffer.isDirect()) {
            long totalElementCount = (long) (tensorShape.getTotalElementCount() * tensorFormat.getElementByteSize());
            if (((long) byteBuffer.capacity()) >= totalElementCount) {
                this.data = byteBuffer;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Tensor requires at least ");
            stringBuilder.append(totalElementCount);
            stringBuilder.append(" bytes capacity, but data only fits ");
            stringBuilder.append(byteBuffer.capacity());
            stringBuilder.append(" bytes");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("Tensor requires data buffer to be direct");
    }

    public final ByteBuffer getData() {
        return this.data;
    }

    public final TensorFormat getFormat() {
        return this.format;
    }

    public final TensorShape getShape() {
        return this.shape;
    }
}
