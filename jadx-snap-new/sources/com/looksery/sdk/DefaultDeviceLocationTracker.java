package com.looksery.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class DefaultDeviceLocationTracker implements LocationListener, DeviceLocationTracker {
    private final Set<String> mExcludedProviders;
    private final Handler mHandler;
    private volatile Location mLocation;
    private final LocationManager mLocationManager;
    private final Object mRunningLock = new Object();
    private boolean mStarted = false;

    private DefaultDeviceLocationTracker(LocationManager locationManager, Handler handler, String... strArr) {
        this.mLocationManager = locationManager;
        this.mHandler = handler;
        this.mExcludedProviders = new HashSet(Arrays.asList(strArr));
    }

    static DeviceLocationTracker create(Context context, String... strArr) {
        return create((LocationManager) context.getSystemService(MapboxEvent.TYPE_LOCATION), new Handler(Looper.getMainLooper()), strArr);
    }

    static DeviceLocationTracker create(LocationManager locationManager, Handler handler, String... strArr) {
        return new DefaultDeviceLocationTracker(locationManager, handler, strArr);
    }

    static boolean isSupported(Context context) {
        if (context == null) {
            return false;
        }
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        return context.checkPermission(PermissionsManager.COARSE_LOCATION_PERMISSION, myPid, myUid) == 0 && context.checkPermission(PermissionsManager.FINE_LOCATION_PERMISSION, myPid, myUid) == 0;
    }

    public final Location getLocation() {
        return this.mLocation;
    }

    public final void onLocationChanged(Location location) {
        this.mLocation = location;
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x006a in {5, 16, 19, 20, 23, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void start(com.looksery.sdk.domain.LocationTrackingParameters r12) {
        /*
        r11 = this;
        r0 = r11.mRunningLock;
        monitor-enter(r0);
        r1 = r11.mStarted;	 Catch:{ all -> 0x0067 }
        if (r1 == 0) goto L_0x000a;	 Catch:{ all -> 0x0067 }
        r11.stop();	 Catch:{ all -> 0x0067 }
        r1 = r11.mLocationManager;	 Catch:{ all -> 0x0067 }
        r2 = 1;	 Catch:{ all -> 0x0067 }
        r1 = r1.getProviders(r2);	 Catch:{ all -> 0x0067 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0067 }
        r3 = r1.hasNext();	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x0063;	 Catch:{ all -> 0x0067 }
        r3 = r1.next();	 Catch:{ all -> 0x0067 }
        r5 = r3;	 Catch:{ all -> 0x0067 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x0067 }
        r3 = r11.mExcludedProviders;	 Catch:{ all -> 0x0067 }
        r3 = r3.contains(r5);	 Catch:{ all -> 0x0067 }
        if (r3 != 0) goto L_0x0015;	 Catch:{ all -> 0x0067 }
        r3 = "gps";	 Catch:{ all -> 0x0067 }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x0067 }
        if (r3 != 0) goto L_0x0042;	 Catch:{ all -> 0x0067 }
        r3 = "passive";	 Catch:{ all -> 0x0067 }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x0067 }
        if (r3 != 0) goto L_0x0042;	 Catch:{ all -> 0x0067 }
        r3 = "network";	 Catch:{ all -> 0x0067 }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x0015;	 Catch:{ all -> 0x0067 }
        r3 = r11.mLocation;	 Catch:{ all -> 0x0067 }
        if (r3 != 0) goto L_0x004e;	 Catch:{ all -> 0x0067 }
        r3 = r11.mLocationManager;	 Catch:{ all -> 0x0067 }
        r3 = r3.getLastKnownLocation(r5);	 Catch:{ all -> 0x0067 }
        r11.mLocation = r3;	 Catch:{ all -> 0x0067 }
        r4 = r11.mLocationManager;	 Catch:{ all -> 0x0067 }
        r6 = r12.getLocationUpdateIntervalMillis();	 Catch:{ all -> 0x0067 }
        r8 = r12.getDistanceFilterMeters();	 Catch:{ all -> 0x0067 }
        r3 = r11.mHandler;	 Catch:{ all -> 0x0067 }
        r10 = r3.getLooper();	 Catch:{ all -> 0x0067 }
        r9 = r11;	 Catch:{ all -> 0x0067 }
        r4.requestLocationUpdates(r5, r6, r8, r9, r10);	 Catch:{ all -> 0x0067 }
        goto L_0x0015;	 Catch:{ all -> 0x0067 }
        r11.mStarted = r2;	 Catch:{ all -> 0x0067 }
        monitor-exit(r0);	 Catch:{ all -> 0x0067 }
        return;	 Catch:{ all -> 0x0067 }
        r12 = move-exception;	 Catch:{ all -> 0x0067 }
        monitor-exit(r0);	 Catch:{ all -> 0x0067 }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.DefaultDeviceLocationTracker.start(com.looksery.sdk.domain.LocationTrackingParameters):void");
    }

    public final void stop() {
        synchronized (this.mRunningLock) {
            if (this.mStarted) {
                this.mLocationManager.removeUpdates(this);
                this.mStarted = false;
                return;
            }
        }
    }
}
