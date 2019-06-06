package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.AspectRatioMode;
import com.looksery.sdk.domain.LensInfo;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mmi.b;
import java.util.List;

/* renamed from: mks */
public final class mks {
    static final b a(LensInfo lensInfo, List<? extends miq> list) {
        String lensId = lensInfo.getLensId();
        akcr.a((Object) lensId, DiscoverStorySnapModel.LENSID);
        return new b(new mhs.b(lensId), lensInfo.supportsTouchApi(), lensInfo.supportsPresetApi(), lensInfo.supportsExternalImage(), lensInfo.isTouchBlocking(), lensInfo.hasAudioEffect(), lensInfo.hasAudioAnalysis(), lensInfo.isBitmojiRequired(), lensInfo.isRedirectToBitmojiAppRequired(), list);
    }

    static final void a(LSCoreManagerWrapper lSCoreManagerWrapper) {
        lSCoreManagerWrapper.setOverlay("", AspectRatioMode.NONE);
    }
}
