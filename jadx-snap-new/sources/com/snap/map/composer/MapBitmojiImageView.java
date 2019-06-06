package com.snap.map.composer;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.views.ComposerImageView;
import com.snap.composer.views.ComposerRecyclableView;
import com.snap.core.db.record.StickerMessageModel;
import defpackage.afnd;
import defpackage.akcr;
import defpackage.dds;
import defpackage.idl;

@Keep
public class MapBitmojiImageView extends ComposerImageView implements ComposerRecyclableView {
    public static final a Companion = new a();
    private static final String TAG = "MapBitmojiImageView";
    private String avatarId;
    private idl page;
    private String stickerId;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public MapBitmojiImageView(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    private final void internalSetUri() {
        String str = this.avatarId;
        if (str != null && str != null) {
            String str2 = this.stickerId;
            if (str2 != null && str2 != null) {
                idl idl = this.page;
                if (idl != null && idl != null) {
                    ComposerImageView.loadSrc$default(this, dds.a(str, str2, afnd.MAPS, false, 0, 16), null, null, false, 14, null);
                }
            }
        }
    }

    public final void resetAvatarId() {
        this.page = getUiPage();
        this.avatarId = null;
        clear();
    }

    public final void resetStickerId() {
        this.stickerId = null;
        clear();
    }

    public final void setAvatarId(String str) {
        akcr.b(str, "avatarId");
        this.avatarId = str;
        internalSetUri();
    }

    public final void setStickerId(String str, idl idl) {
        akcr.b(str, StickerMessageModel.STICKERID);
        akcr.b(idl, "uiPage");
        this.page = idl;
        this.stickerId = str;
        internalSetUri();
    }
}
