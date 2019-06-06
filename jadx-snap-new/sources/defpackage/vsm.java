package defpackage;

import android.graphics.Bitmap;
import com.snap.scan.core.SnapScanResult;
import com.snap.scan.core.SnapScanResult.CodeType;
import java.util.Set;

/* renamed from: vsm */
public interface vsm {
    SnapScanResult a(int i, int i2, int i3, byte[] bArr, Set<CodeType> set);

    SnapScanResult a(Bitmap bitmap);
}
