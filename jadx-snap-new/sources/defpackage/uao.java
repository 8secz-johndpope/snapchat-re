package defpackage;

import android.view.View;

/* renamed from: uao */
public final class uao implements uan, uap {
    private uan a;

    public final View a(String str) {
        akcr.b(str, "toolId");
        uan uan = this.a;
        return uan != null ? uan.a(str) : null;
    }

    public final void a(uan uan) {
        akcr.b(uan, "tooltipViewProvider");
        this.a = uan;
    }
}
