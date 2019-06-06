package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

@TargetApi(11)
/* renamed from: any */
public final class any extends Fragment {
    final anp a;
    final aoa b;
    aib c;
    private final HashSet<any> d;
    private any e;

    /* renamed from: any$a */
    class a implements aoa {
        private a() {
        }

        /* synthetic */ a(any any, byte b) {
            this();
        }
    }

    public any() {
        this(new anp());
    }

    @SuppressLint({"ValidFragment"})
    private any(anp anp) {
        this.b = new a(this, (byte) 0);
        this.d = new HashSet();
        this.a = anp;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.e = anz.a.a(getActivity().getFragmentManager());
            if (this.e != this) {
                this.e.d.add(this);
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
    }

    public final void onDetach() {
        super.onDetach();
        any any = this.e;
        if (any != null) {
            any.d.remove(this);
            this.e = null;
        }
    }

    public final void onLowMemory() {
        aib aib = this.c;
        if (aib != null) {
            aib.d.a();
        }
        super.onLowMemory();
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    public final void onStop() {
        super.onStop();
        this.a.b();
    }

    public final void onTrimMemory(int i) {
        aib aib = this.c;
        if (aib != null) {
            aib.d.a(i);
        }
        super.onTrimMemory(i);
    }
}
