package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;

/* renamed from: acok */
public final class acok extends ViewHolder {
    final View a;
    final SnapFontTextView b;
    final SnapFontTextView c;
    final acon d;

    public acok(View view, acon acon) {
        super(view);
        this.a = view.findViewById(R.id.map_group_card_root);
        this.a.setBackground(view.getResources().getDrawable(R.drawable.map_carousel_card));
        this.b = (SnapFontTextView) view.findViewById(R.id.group_name);
        this.c = (SnapFontTextView) view.findViewById(R.id.group_subtext);
        this.d = acon;
        this.d.a(this.a.findViewById(R.id.avatar_container));
    }
}
