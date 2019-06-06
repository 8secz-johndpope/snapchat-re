package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adic */
public enum adic {
    TEXTURE_2D("TEXTURE_2D_VIDEO_TEXTURE", 3553),
    EXTERNAL_OES("EXTERNAL_OES_VIDEO_TEXTURE", 36197);
    
    public final int mBindValue;
    public final String mFragmentShaderDefinition;

    private adic(String str, int i) {
        this.mFragmentShaderDefinition = (String) Preconditions.checkNotNull(str);
        this.mBindValue = i;
    }

    public final int a() {
        return this.mBindValue;
    }
}
