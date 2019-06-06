package com.snap.scan.core;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import defpackage.aayc;
import defpackage.abps;
import defpackage.vvd;
import defpackage.vvd.a;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public class SnapScanResult implements vvd {
    private final ScannerViewData a;
    private final ScannedData b;

    public enum CodeType {
        SNAPCODE_18x18,
        QR_CODE,
        BARCODE,
        SNAPCODE_10x10,
        SNAPCODE_18x18_OLD,
        SNAPCODE_18x18_PASSIVE_SCAN,
        SNAPCODE_BITMOJI
    }

    public static class ScannerViewData {
        private final boolean a;
        private final byte[] b;
        private final int c;
        private final int d;

        public ScannerViewData(boolean z, byte[] bArr, int i, int i2) {
            this.a = z;
            this.b = bArr;
            this.c = i;
            this.d = i2;
        }

        public Bitmap getScannerViewBitmapImage() {
            if (this.a) {
                byte[] bArr = this.b;
                if (bArr != null && this.d > 0 && this.c > 0) {
                    IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
                    int[] iArr = new int[asIntBuffer.remaining()];
                    asIntBuffer.get(iArr);
                    return Bitmap.createBitmap(iArr, this.c, this.d, Config.ARGB_8888);
                }
            }
            return null;
        }

        public byte[] getScannerViewImage() {
            return this.b;
        }

        public boolean hasScannerViewImage() {
            return this.a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("ScannerViewData{mHasImage=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mImage=");
            stringBuilder.append(Arrays.toString(this.b));
            stringBuilder.append(", mImageWidth=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mImageHeight=");
            stringBuilder.append(this.d);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static class ScannedData {
        private final boolean a;
        private final int b;
        private final int c;
        private final String d;
        private final byte[] e;

        public ScannedData(boolean z, int i, int i2, String str, byte[] bArr) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = bArr;
        }

        public BarcodeType getBarcodeType() {
            BarcodeType[] values = BarcodeType.values();
            int i = this.c;
            return i < values.length ? values[i] : BarcodeType.UPC_A;
        }

        public CodeType getCodeType() {
            return this.b < CodeType.values().length ? CodeType.values()[this.b] : this.e != null ? CodeType.SNAPCODE_18x18_OLD : TextUtils.isDigitsOnly(this.d) ? CodeType.BARCODE : CodeType.QR_CODE;
        }

        public int getCodeTypeMeta() {
            return this.c;
        }

        public String getData() {
            return this.d;
        }

        public byte[] getRawData() {
            return this.e;
        }

        public boolean hasScannedData() {
            return this.a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("ScannedData{mHasScannedData=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mCodeType=");
            stringBuilder.append(this.b);
            stringBuilder.append(", mCodeTypeMeta=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mData='");
            stringBuilder.append(this.d);
            stringBuilder.append('\'');
            stringBuilder.append(", mRawData=");
            stringBuilder.append(Arrays.toString(this.e));
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.snap.scan.core.SnapScanResult$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[CodeType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.snap.scan.core.SnapScanResult.CodeType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snap.scan.core.SnapScanResult.CodeType.QR_CODE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snap.scan.core.SnapScanResult.CodeType.SNAPCODE_18x18;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snap.scan.core.SnapScanResult.CodeType.SNAPCODE_18x18_OLD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.snap.scan.core.SnapScanResult.CodeType.BARCODE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.scan.core.SnapScanResult$AnonymousClass1.<clinit>():void");
        }
    }

    public enum BarcodeType {
        EAN_13,
        EAN_8,
        UPC_A,
        UPC_E
    }

    public SnapScanResult(ScannerViewData scannerViewData, ScannedData scannedData) {
        this.a = scannerViewData;
        this.b = scannedData;
    }

    public static boolean hasScannedData(SnapScanResult snapScanResult) {
        return (snapScanResult == null || snapScanResult.getScannedData() == null || !snapScanResult.getScannedData().hasScannedData()) ? false : true;
    }

    public static boolean hasScannerViewData(SnapScanResult snapScanResult) {
        return (snapScanResult == null || snapScanResult.getScannerViewData() == null || !snapScanResult.getScannerViewData().hasScannerViewImage()) ? false : true;
    }

    public a getResultType() {
        return a.SNAP_SCAN_RESULT;
    }

    public aayc getScanAnalyticsType() {
        int i = AnonymousClass1.a[getScannedData().getCodeType().ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? aayc.SNAPCODE : i != 4 ? aayc.SNAPCODE : aayc.BARCODE : aayc.QRCODE;
    }

    public String getScanVersionData() {
        if (getScannedData().getCodeType() != CodeType.SNAPCODE_18x18 && getScannedData().getCodeType() != CodeType.SNAPCODE_18x18_OLD && getScannedData().getCodeType() != CodeType.SNAPCODE_BITMOJI) {
            return getScannedData().getData();
        }
        StringBuilder stringBuilder = new StringBuilder("0");
        stringBuilder.append(Integer.toHexString(getScannedData().getCodeTypeMeta()));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(abps.a(getScannedData().getRawData()));
        return stringBuilder3.toString();
    }

    public ScannedData getScannedData() {
        return this.b;
    }

    public ScannerViewData getScannerViewData() {
        return this.a;
    }

    public boolean hasScanResult() {
        ScannedData scannedData = this.b;
        return scannedData != null && scannedData.hasScannedData();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapScanResult{mScannerViewData=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mScannedData=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
