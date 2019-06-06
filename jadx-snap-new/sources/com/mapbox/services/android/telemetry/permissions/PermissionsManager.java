package com.mapbox.services.android.telemetry.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import defpackage.fq;
import java.util.ArrayList;

public class PermissionsManager {
    public static final String COARSE_LOCATION_PERMISSION = "android.permission.ACCESS_COARSE_LOCATION";
    public static final String FINE_LOCATION_PERMISSION = "android.permission.ACCESS_FINE_LOCATION";
    private final int REQUEST_PERMISSIONS_CODE = 0;
    private PermissionsListener listener;

    public PermissionsManager(PermissionsListener permissionsListener) {
        this.listener = permissionsListener;
    }

    public static boolean areLocationPermissionsGranted(Context context) {
        return isCoarseLocationPermissionGranted(context) || isFineLocationPermissionGranted(context);
    }

    public static boolean areRuntimePermissionsRequired() {
        return VERSION.SDK_INT >= 23;
    }

    public static boolean isCoarseLocationPermissionGranted(Context context) {
        return isPermissionGranted(context, COARSE_LOCATION_PERMISSION);
    }

    public static boolean isFineLocationPermissionGranted(Context context) {
        return isPermissionGranted(context, FINE_LOCATION_PERMISSION);
    }

    public static boolean isPermissionGranted(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public PermissionsListener getListener() {
        return this.listener;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 0 && this.listener != null) {
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            this.listener.onPermissionResult(z);
        }
    }

    public void requestLocationPermissions(Activity activity) {
        requestLocationPermissions(activity, true);
    }

    public void requestLocationPermissions(Activity activity, boolean z) {
        requestPermissions(activity, new String[]{z ? FINE_LOCATION_PERMISSION : COARSE_LOCATION_PERMISSION});
    }

    public void requestPermissions(Activity activity, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (fq.a(activity, str)) {
                arrayList.add(str);
            }
        }
        if (this.listener != null && arrayList.size() > 0) {
            this.listener.onExplanationNeeded(arrayList);
        }
        fq.a(activity, strArr, 0);
    }

    public void setListener(PermissionsListener permissionsListener) {
        this.listener = permissionsListener;
    }
}
