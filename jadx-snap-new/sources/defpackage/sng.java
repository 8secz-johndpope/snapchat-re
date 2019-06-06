package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sng */
public class sng extends slm {
    private final ViewGroup a;
    private final a b;

    /* renamed from: sng$a */
    static class a extends BaseAdapter {
        private final Context a;
        private final List<srh> b = new ArrayList();

        protected a(Context context) {
            this.a = context;
        }

        public final void a(List<srh> list) {
            this.b.clear();
            this.b.addAll(list);
            notifyDataSetChanged();
        }

        public final boolean areAllItemsEnabled() {
            return false;
        }

        public final int getCount() {
            return this.b.size();
        }

        public final Object getItem(int i) {
            return this.b.get(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = View.inflate(this.a, R.layout.debug_item_view, null);
                view.setOnClickListener(null);
                view.setClickable(false);
            }
            TextView textView = (TextView) view.findViewById(R.id.debug_value_text_view);
            srh srh = (srh) getItem(i);
            ((TextView) view.findViewById(R.id.debug_title_text_view)).setText(srh.a);
            textView.setText(srh.b != null ? srh.b : "<null>");
            return view;
        }
    }

    sng(Context context) {
        this(new a(context), (ViewGroup) View.inflate(context, R.layout.opera_debug_view, null));
    }

    private sng(a aVar, ViewGroup viewGroup) {
        this.a = viewGroup;
        ViewGroup viewGroup2 = this.a;
        viewGroup2.setPadding((int) viewGroup2.getResources().getDimension(R.dimen.default_gap), (int) this.a.getResources().getDimension(R.dimen.default_gap_8x), (int) this.a.getResources().getDimension(R.dimen.default_gap), (int) this.a.getResources().getDimension(R.dimen.default_gap));
        this.b = aVar;
        ListView listView = (ListView) viewGroup.findViewById(R.id.debug_item_list_view);
        listView.setAdapter(this.b);
        listView.setOnItemClickListener(null);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.b.a((List) sqh.a(sqh.co));
    }

    public final void b() {
        super.b();
        this.b.a(new ArrayList());
    }

    public final View e() {
        return this.a;
    }

    public final String f() {
        return "DEBUG";
    }

    public final boolean h() {
        return false;
    }
}
