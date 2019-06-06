package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: adnt */
public final class adnt {
    private final Resources a;

    public adnt(Context context) {
        this.a = context.getResources();
    }

    public final String a(int i) {
        String str = "Failed to close input stream for resource: %d %s";
        InputStream openRawResource = this.a.openRawResource(i);
        try {
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            String str2 = new String(bArr, Charsets.UTF_8);
            Preconditions.checkNotNull(str2);
            return str2;
        } finally {
            try {
                openRawResource.close();
            } catch (IOException e) {
                adni.e(str, Integer.valueOf(i), e.getMessage());
            }
        }
    }
}
