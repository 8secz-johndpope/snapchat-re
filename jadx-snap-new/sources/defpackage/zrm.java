package defpackage;

import com.snap.core.db.column.PersistableUnlockableType;

/* renamed from: zrm */
public final /* synthetic */ class zrm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PersistableUnlockableType.values().length];
        a = iArr;
        iArr[PersistableUnlockableType.FILTER.ordinal()] = 1;
        a[PersistableUnlockableType.LENS.ordinal()] = 2;
        a[PersistableUnlockableType.PREFETCH_LENS.ordinal()] = 3;
        a[PersistableUnlockableType.STICKER_PACK.ordinal()] = 4;
        a[PersistableUnlockableType.CAPTION_STYLE.ordinal()] = 5;
    }
}
