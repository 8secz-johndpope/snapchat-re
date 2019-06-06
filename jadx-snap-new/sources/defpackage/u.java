package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import defpackage.j.a;

/* renamed from: u */
public final class u extends Fragment {
    a a;

    /* renamed from: u$a */
    interface a {
        void a();

        void b();
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new u(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void a(a aVar) {
        Activity activity = getActivity();
        if (activity instanceof n) {
            ((n) activity).a().a(aVar);
            return;
        }
        if (activity instanceof l) {
            j lifecycle = ((l) activity).getLifecycle();
            if (lifecycle instanceof m) {
                ((m) lifecycle).a(aVar);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(a.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(a.ON_DESTROY);
        this.a = null;
    }

    public final void onPause() {
        super.onPause();
        a(a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
        a(a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        a(a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(a.ON_STOP);
    }
}
