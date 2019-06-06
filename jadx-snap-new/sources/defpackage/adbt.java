package defpackage;

import android.text.TextUtils;
import java.security.GeneralSecurityException;

/* renamed from: adbt */
public final class adbt {
    public final String a;
    public final String b;
    public final int c;
    private alkh d;
    private final aczv e;

    public adbt(alkh alkh, aczv aczv) {
        Object obj = alkh.e;
        Object obj2 = null;
        if (TextUtils.isEmpty(obj)) {
            String str = alkh.f;
            if (TextUtils.isEmpty(str)) {
                obj = "https://app.snapchat.com/ranking/story_thumbnails?width=360&mediaId=".concat(String.valueOf(alkh.b));
                obj2 = 1;
            } else {
                obj = "https://storage.googleapis.com/scm-thumb/thumbs/".concat(String.valueOf(str));
            }
        }
        String str2 = alkh.b;
        if (TextUtils.isEmpty(str2)) {
            str2 = "thumbid~".concat(String.valueOf(obj));
        }
        this.c = alkh.g;
        this.a = str2;
        this.b = obj;
        this.d = alkh;
        if (obj2 == null) {
            aczv = null;
        }
        this.e = aczv;
    }

    public final byte[] a(byte[] bArr) {
        if (this.e == null) {
            return bArr;
        }
        try {
            return new abmv(this.d.c, this.d.d).b(bArr);
        } catch (GeneralSecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
