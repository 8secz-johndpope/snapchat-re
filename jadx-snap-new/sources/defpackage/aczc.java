package defpackage;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import defpackage.acyl.f;
import defpackage.acyl.g;
import defpackage.acyl.h;
import defpackage.acyl.i;
import java.lang.ref.WeakReference;

/* renamed from: aczc */
final class aczc implements Runnable {
    final WeakReference<acyl> a;

    /* renamed from: aczc$1 */
    class 1 implements OnMapReadyCallback {
        1() {
        }

        public final void onMapReady(MapboxMap mapboxMap) {
            acyl acyl = (acyl) aczc.this.a.get();
            if (acyl != null) {
                aczh l = acyl.l();
                if (l != null) {
                    akcr.b(mapboxMap, "mapboxMap");
                    akcr.b(l, "view");
                    acyl.a = new acys(mapboxMap, l);
                    mapboxMap.setOnMapClickListener(new acyo(new f(acyl.g)));
                    mapboxMap.setOnMapLongClickListener(new acyp(new g(acyl.g)));
                    mapboxMap.setOnScrollListener(new acyq(new h(acyl.g)));
                    NativeMapView nativeMapView = l.getNativeMapView();
                    if (nativeMapView != null) {
                        nativeMapView.setDebug(false);
                    }
                    l.post(new i(acyl));
                }
            }
        }
    }

    public aczc(acyl acyl) {
        this.a = new WeakReference(acyl);
    }

    public final void run() {
        acyl acyl = (acyl) this.a.get();
        if (acyl != null) {
            aczh l = acyl.l();
            if (l != null) {
                akcr.b(l, "view");
                if (acyl.e) {
                    if (!acyl.c) {
                        NativeMapView nativeMapView = l.getNativeMapView();
                        IllegalStateException illegalStateException;
                        if (nativeMapView == null) {
                            illegalStateException = new IllegalStateException("Native map is destroyed but app is resumed.");
                        } else if (TextUtils.isEmpty(nativeMapView.getStyleUrl())) {
                            illegalStateException = new IllegalStateException("You have to set a non-default style before calling start.");
                        } else {
                            l.onStart();
                            acyl.c = true;
                        }
                    }
                    acyl.m();
                }
                l.getMapAsync(new 1());
            }
        }
    }
}
