package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gd */
public abstract class gd extends jz {
    private final fz a;
    private gg b = null;
    private fv c = null;

    public gd(fz fzVar) {
        this.a = fzVar;
    }

    private static String a(int i, long j) {
        StringBuilder stringBuilder = new StringBuilder("android:switcher:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }

    public abstract fv a(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        this.b.d((fv) obj);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        gg ggVar = this.b;
        if (ggVar != null) {
            ggVar.e();
            this.b = null;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        long j = (long) i;
        fv a = this.a.a(gd.a(viewGroup.getId(), j));
        if (a != null) {
            this.b.e(a);
        } else {
            a = a(i);
            this.b.a(viewGroup.getId(), a, gd.a(viewGroup.getId(), j));
        }
        if (a != this.c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((fv) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        fv fvVar = (fv) obj;
        fv fvVar2 = this.c;
        if (fvVar != fvVar2) {
            if (fvVar2 != null) {
                fvVar2.setMenuVisibility(false);
                this.c.setUserVisibleHint(false);
            }
            if (fvVar != null) {
                fvVar.setMenuVisibility(true);
                fvVar.setUserVisibleHint(true);
            }
            this.c = fvVar;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
