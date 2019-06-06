package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import java.util.concurrent.TimeUnit;

/* renamed from: wqj */
public class wqj extends zja implements zjq {
    private static long g = TimeUnit.SECONDS.toMillis(60);
    private final LayoutInflater a;
    private View b;
    private final View c;
    private final zjm d;
    private final int e;
    private final int f;
    public final Context m;
    public final achb<zjm, zjk> n;
    public final zkq o;
    public final acgu<zjm> p;

    /* renamed from: wqj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static acgu<zjm> a(zjm zjm) {
            akcr.b(zjm, "pageType");
            Object a = acgu.a(achr.RIGHT_TO_LEFT, acir.a(acis.b, new aciq(-1392508928)), zjm, true);
            akcr.a(a, "NavigationAction.present…          pageType, true)");
            return a;
        }
    }

    /* renamed from: wqj$b */
    static final class b implements OnClickListener {
        private /* synthetic */ wqj a;

        b(wqj wqj) {
            this.a = wqj;
        }

        public final void onClick(View view) {
            this.a.n.e();
        }
    }

    static {
        a aVar = new a();
    }

    public /* synthetic */ wqj(Context context, zjm zjm, int i, int i2, achb achb, zkq zkq) {
        this(context, zjm, i, i2, achb, zkq, a.a(zjm));
    }

    public wqj(Context context, zjm zjm, int i, int i2, achb<zjm, zjk> achb, zkq zkq, acgu<zjm> acgu) {
        akcr.b(context, "context");
        akcr.b(zjm, "pageType");
        akcr.b(achb, "navigationHost");
        akcr.b(zkq, "insetsDetector");
        akcr.b(acgu, "presentNavigationAction");
        super(zjm, acgv.a().a(acgu.j()).a(), zkq);
        this.m = context;
        this.d = zjm;
        this.e = i;
        this.f = i2;
        this.n = achb;
        this.o = zkq;
        this.p = acgu;
        Object from = LayoutInflater.from(this.m);
        akcr.a(from, "LayoutInflater.from(context)");
        this.a = from;
        from = this.a.inflate(R.layout.settings_page_container, null);
        akcr.a(from, "layoutInflater.inflate(R…ngs_page_container, null)");
        this.c = from;
    }

    public long S_() {
        return g;
    }

    public View getContentView() {
        return this.c;
    }

    public void onPageAdded() {
        super.onPageAdded();
        Object obj = (ScHeaderView) getContentView().findViewById(R.id.sc_header);
        obj.setBackArrowOnClickListener(new b(this));
        int i = this.e;
        if (i != 0) {
            obj.setTitleText(i);
        } else {
            akcr.a(obj, "headerView");
            obj.setVisibility(8);
        }
        LayoutInflater layoutInflater = this.a;
        i = this.f;
        View contentView = getContentView();
        if (contentView != null) {
            obj = layoutInflater.inflate(i, (ViewGroup) contentView, true);
            akcr.a(obj, "layoutInflater.inflate(l…tView as ViewGroup, true)");
            this.b = obj;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
