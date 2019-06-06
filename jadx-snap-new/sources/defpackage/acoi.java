package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.acol.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acoi */
public final class acoi extends Adapter<ViewHolder> implements a {
    final ajwo<Optional<? extends acop>> a = new ajwo();
    private final LayoutInflater b;
    private final acnk c;
    private final acpv d;
    private List<Object> e = new ArrayList();

    public acoi(LayoutInflater layoutInflater, acpv acpv, acnk acnk) {
        this.b = layoutInflater;
        this.d = acpv;
        this.c = acnk;
    }

    public final void a(List<Object> list) {
        this.e = list;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        List list = this.e;
        return list != null ? list.size() : 0;
    }

    public final int getItemViewType(int i) {
        Object obj = this.e.get(i);
        return obj instanceof acoj ? 0 : obj instanceof acov ? 1 : -1;
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        Object obj = this.e.get(i);
        if ((viewHolder instanceof acok) && (obj instanceof acoj)) {
            SnapFontTextView snapFontTextView;
            Resources resources;
            int i2;
            Object[] objArr;
            acok acok = (acok) viewHolder;
            acoj acoj = (acoj) obj;
            acok.d.a(acok.a, acoj.a.a());
            acok.b.setText(acoj.a.c());
            if (acoj.b > 1) {
                snapFontTextView = acok.c;
                resources = acok.b.getResources();
                i2 = R.string.map_group_card_subtext_friends_sharing_plural;
                objArr = new Object[]{Integer.valueOf(i)};
            } else {
                snapFontTextView = acok.c;
                resources = acok.b.getResources();
                i2 = R.string.map_group_card_subtext_friend_sharing_singular;
                objArr = new Object[]{Integer.valueOf(i)};
            }
            snapFontTextView.setText(resources.getString(i2, objArr));
            return;
        }
        if ((viewHolder instanceof acof) && (obj instanceof acov)) {
            acov acov = (acov) obj;
            ((acof) viewHolder).a(acov.d, acov.e, null);
        }
    }

    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate;
        if (i == 0) {
            inflate = this.b.inflate(R.layout.map_group_card, viewGroup, false);
            this.c.e.a(this.b, inflate);
            return new acok(inflate, this.c.e.a());
        } else if (i == 1) {
            inflate = this.b.inflate(R.layout.carousel_user_item, viewGroup, false);
            this.c.e.a(this.b, inflate);
            acof acof = new acof(inflate, this.d, this.c, true);
            acof.a(this.a);
            return acof;
        } else {
            StringBuilder stringBuilder = new StringBuilder("ViewType ");
            stringBuilder.append(i);
            stringBuilder.append(" is not supported by this adapter");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
