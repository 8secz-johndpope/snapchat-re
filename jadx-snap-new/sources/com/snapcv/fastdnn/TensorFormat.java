package com.snapcv.fastdnn;

public final class TensorFormat {
    private final TensorDataLayout dataLayout;
    private final TensorDataType dataType;

    /* renamed from: com.snapcv.fastdnn.TensorFormat$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$snapcv$fastdnn$TensorDataType = new int[TensorDataType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.snapcv.fastdnn.TensorDataType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$snapcv$fastdnn$TensorDataType = r0;
            r0 = $SwitchMap$com$snapcv$fastdnn$TensorDataType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snapcv.fastdnn.TensorDataType.FLOAT16;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$snapcv$fastdnn$TensorDataType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snapcv.fastdnn.TensorDataType.FLOAT32;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$snapcv$fastdnn$TensorDataType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snapcv.fastdnn.TensorDataType.FLOAT64;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapcv.fastdnn.TensorFormat$AnonymousClass1.<clinit>():void");
        }
    }

    public TensorFormat() {
        this.dataType = TensorDataType.FLOAT32;
        this.dataLayout = TensorDataLayout.NHWC;
    }

    public TensorFormat(TensorDataType tensorDataType, TensorDataLayout tensorDataLayout) {
        this.dataType = tensorDataType;
        this.dataLayout = tensorDataLayout;
    }

    public final TensorDataLayout getDataLayout() {
        return this.dataLayout;
    }

    public final TensorDataType getDataType() {
        return this.dataType;
    }

    public final int getElementByteSize() {
        int i = AnonymousClass1.$SwitchMap$com$snapcv$fastdnn$TensorDataType[this.dataType.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        StringBuilder stringBuilder = new StringBuilder("Unsupported data type '");
        stringBuilder.append(this.dataType);
        stringBuilder.append("'");
        throw new RuntimeException(stringBuilder.toString());
    }
}
