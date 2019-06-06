package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.R;

/* renamed from: zoa */
public final class zoa {
    int a = -1;
    ViewGroup b;
    private View c;

    public zoa(ViewGroup viewGroup, View view) {
        this.b = viewGroup;
        this.c = view;
    }

    static zoa a(View view) {
        return (zoa) view.getTag(R.id.current_scene);
    }

    public final ViewGroup a() {
        return this.b;
    }

    public final void b() {
        if (this.a > 0 || this.c != null) {
            this.b.removeAllViews();
            if (this.a > 0) {
                LayoutInflater.from(null).inflate(this.a, this.b);
            } else {
                this.b.addView(this.c);
            }
        }
        this.b.setTag(R.id.current_scene, this);
    }
}
