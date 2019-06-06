package android.arch.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import defpackage.fv;
import defpackage.fz;
import defpackage.h;
import defpackage.n;
import defpackage.u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class LifecycleDispatcher {
    static AtomicBoolean a = new AtomicBoolean(false);

    static class a extends h {
        private final b a = new b();

        a() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).d.a.d.a(this.a);
            }
            u.a(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                LifecycleDispatcher.a((FragmentActivity) activity, defpackage.j.b.CREATED);
            }
        }

        public final void onActivityStopped(Activity activity) {
            if (activity instanceof FragmentActivity) {
                LifecycleDispatcher.a((FragmentActivity) activity, defpackage.j.b.CREATED);
            }
        }
    }

    static class b extends defpackage.fz.a {
        b() {
        }

        public final void a(fv fvVar) {
            LifecycleDispatcher.a(fvVar, defpackage.j.a.ON_CREATE);
            if (fvVar instanceof n) {
                String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
                if (fvVar.getChildFragmentManager().a(str) == null) {
                    fvVar.getChildFragmentManager().a().a(new DestructionReportFragment(), str).b();
                }
            }
        }

        public final void b(fv fvVar) {
            LifecycleDispatcher.a(fvVar, defpackage.j.a.ON_START);
        }

        public final void c(fv fvVar) {
            LifecycleDispatcher.a(fvVar, defpackage.j.a.ON_RESUME);
        }
    }

    public static class DestructionReportFragment extends fv {
        private void a(defpackage.j.a aVar) {
            LifecycleDispatcher.a(getParentFragment(), aVar);
        }

        public void onDestroy() {
            super.onDestroy();
            a(defpackage.j.a.ON_DESTROY);
        }

        public void onPause() {
            super.onPause();
            a(defpackage.j.a.ON_PAUSE);
        }

        public void onStop() {
            super.onStop();
            a(defpackage.j.a.ON_STOP);
        }
    }

    private static void a(fz fzVar, defpackage.j.b bVar) {
        List<Object> d = fzVar.d();
        if (d != null) {
            for (Object obj : d) {
                if (obj != null) {
                    a(obj, bVar);
                    if (obj.isAdded()) {
                        a(obj.getChildFragmentManager(), bVar);
                    }
                }
            }
        }
    }

    private static void a(Object obj, defpackage.j.b bVar) {
        if (obj instanceof n) {
            ((n) obj).a().b(bVar);
        }
    }
}
