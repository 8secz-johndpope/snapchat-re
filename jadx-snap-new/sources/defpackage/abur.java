package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import com.google.common.base.Preconditions;

/* renamed from: abur */
public final class abur<T extends View> {
    private ViewStub a;
    private View b;
    private int c;
    private final int d;
    private abpl<a<T>> e;
    private View f;
    private T g;
    private int h;

    /* renamed from: abur$a */
    public interface a<T extends View> {
        void onViewInflated(T t);
    }

    public abur(View view, int i, int i2) {
        this(view, i, i2, null, (byte) 0);
    }

    public abur(View view, int i, int i2, a<T> aVar) {
        this(view, i, i2, aVar, (byte) 0);
    }

    private abur(View view, int i, int i2, a<T> aVar, byte b) {
        this.e = new abpt();
        this.h = 0;
        this.b = (View) Preconditions.checkNotNull(view);
        this.c = i;
        this.d = i2;
        if (aVar != null) {
            this.e.c(aVar);
        }
    }

    public abur(ViewStub viewStub, int i, a<T> aVar) {
        this.e = new abpt();
        this.h = 0;
        this.a = viewStub;
        this.d = i;
        if (aVar != null) {
            this.e.c(aVar);
        }
    }

    public final T a() {
        if (this.g == null) {
            ViewStub viewStub = this.a;
            if (viewStub == null) {
                viewStub = (ViewStub) this.b.findViewById(this.c);
            }
            if (viewStub != null) {
                this.f = viewStub.inflate();
            }
            View view = this.f;
            if (view == null) {
                view = this.b;
            }
            this.g = view.findViewById(this.d);
            if (this.g != null) {
                for (a onViewInflated : this.e) {
                    onViewInflated.onViewInflated(this.g);
                }
                this.e = new abpt();
                this.b = null;
            } else {
                Resources resources = this.b.getContext().getResources();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(resources.getResourceName(this.d));
                stringBuilder.append(" is not a valid ID within ");
                stringBuilder.append(resources.getResourceName(this.b.getId()));
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return this.g;
    }

    public final void a(int i) {
        if (this.g != null || i == 0) {
            a().setVisibility(i);
        }
    }

    public final void a(a<T> aVar) {
        Preconditions.checkNotNull(aVar);
        if (b()) {
            aVar.onViewInflated(this.g);
        } else {
            this.e.c(aVar);
        }
    }

    public final boolean b() {
        return this.g != null;
    }

    public final boolean c() {
        View view = this.g;
        return view != null && view.getVisibility() == 0;
    }
}
