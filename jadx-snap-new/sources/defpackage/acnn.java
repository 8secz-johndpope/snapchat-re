package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: acnn */
public final class acnn extends ViewHolder {
    public final SnapFontTextView a;
    private acoh b;

    public acnn(View view, acoh acoh) {
        super(view);
        this.a = (SnapFontTextView) view.findViewById(R.id.create_group_button);
        this.b = acoh;
    }

    public final void a(Resources resources, List<String> list, boolean z, acnk acnk) {
        this.b.a(z, list, new WeakReference(this), resources, list, acnk.j);
    }
}
