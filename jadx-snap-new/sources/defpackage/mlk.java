package defpackage;

import com.looksery.sdk.domain.RemoteAssetType;

/* renamed from: mlk */
public final /* synthetic */ class mlk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RemoteAssetType.values().length];
        a = iArr;
        iArr[RemoteAssetType.STATIC.ordinal()] = 1;
        a[RemoteAssetType.USER_GENERATED.ordinal()] = 2;
        a[RemoteAssetType.URL.ordinal()] = 3;
    }
}
