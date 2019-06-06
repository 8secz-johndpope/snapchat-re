package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.snapchat.android.framework.ui.views.RoundedFrameLayout;

/* renamed from: ackk */
public class ackk extends RoundedFrameLayout {
    private a a;

    /* renamed from: ackk$a */
    public interface a {
        void a(ackk ackk, boolean z);
    }

    public ackk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ackk(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }

    public final void a(a aVar) {
        this.a = aVar;
        if (aVar != null) {
            aVar.a(this, isAttachedToWindow());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this, true);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this, false);
        }
    }
}
