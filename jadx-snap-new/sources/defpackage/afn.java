package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: afn */
public final class afn extends Fragment {
    final afd a;
    final afp b;
    yn c;
    Fragment d;
    private final Set<afn> e;
    private afn f;

    /* renamed from: afn$a */
    class a implements afp {
        a() {
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(afn.this);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public afn() {
        this(new afd());
    }

    @SuppressLint({"ValidFragment"})
    private afn(afd afd) {
        this.b = new a();
        this.e = new HashSet();
        this.a = afd;
    }

    private void a() {
        afn afn = this.f;
        if (afn != null) {
            afn.a(this);
            this.f = null;
        }
    }

    private void a(afn afn) {
        this.e.remove(afn);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a();
            this.f = yh.a((Context) activity).e.a(activity.getFragmentManager(), afo.a(activity));
            if (!equals(this.f)) {
                this.f.e.add(this);
            }
        } catch (IllegalStateException e) {
            String str = "RMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
        a();
    }

    public final void onDetach() {
        super.onDetach();
        a();
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    public final void onStop() {
        super.onStop();
        this.a.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        Object parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        if (parentFragment == null) {
            parentFragment = this.d;
        }
        stringBuilder.append(parentFragment);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
