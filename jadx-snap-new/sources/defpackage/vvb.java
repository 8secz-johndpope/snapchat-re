package defpackage;

import com.snap.scan.core.SnapScanResult;
import java.nio.ByteBuffer;

/* renamed from: vvb */
public final class vvb implements vvi {
    public final boolean a(vvd vvd) {
        if (!(vvd instanceof SnapScanResult)) {
            return true;
        }
        SnapScanResult snapScanResult = (SnapScanResult) vvd;
        int codeTypeMeta = snapScanResult.getScannedData().getCodeTypeMeta();
        if (snapScanResult.hasScanResult()) {
            if (!(codeTypeMeta == 0 || codeTypeMeta == 1)) {
                Object obj;
                byte[] rawData = snapScanResult.getScannedData().getRawData();
                if (codeTypeMeta == 2 && rawData.length == 16) {
                    ByteBuffer wrap = ByteBuffer.wrap(rawData);
                    short s = wrap.getShort(14);
                    wrap.rewind();
                    byte[] bArr = new byte[14];
                    wrap.get(bArr, 0, 14);
                    abmy abmy = abmy.CCITT;
                    int i = abmy.mInitial;
                    int i2 = 0;
                    while (i2 < 14) {
                        byte b = bArr[i2];
                        int i3 = i;
                        for (i = 0; i < 8; i++) {
                            int i4 = ((b >> (7 - i)) & 1) == 1 ? 1 : 0;
                            int i5 = ((i3 >> 15) & 1) == 1 ? 1 : 0;
                            i3 <<= 1;
                            if ((i4 ^ i5) != 0) {
                                i3 ^= abmy.mPolynomial;
                            }
                        }
                        i2++;
                        i = i3;
                    }
                    if (s == ((short) (abmy.mInitial & i))) {
                        obj = 1;
                        if (obj == null) {
                            return true;
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
