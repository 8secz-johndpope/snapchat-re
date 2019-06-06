package com.mapbox.services.android.telemetry.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {
    private int activationCounter;
    private Boolean connectedFlag = null;
    private CopyOnWriteArrayList<ConnectivityListener> connectivityListeners = new CopyOnWriteArrayList();
    private Context context;

    public ConnectivityReceiver(Context context) {
        this.context = context;
    }

    private boolean getManagedConnectivity() {
        Boolean bool = this.connectedFlag;
        return bool == null ? getSystemConnectivity(this.context) : bool.booleanValue();
    }

    private static boolean getSystemConnectivity(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean isConnected(Context context) {
        return getSystemConnectivity(context);
    }

    public void addConnectivityListener(ConnectivityListener connectivityListener) {
        if (!this.connectivityListeners.contains(connectivityListener)) {
            this.connectivityListeners.add(connectivityListener);
        }
    }

    public Boolean getConnectedFlag() {
        return this.connectedFlag;
    }

    public boolean isConnected() {
        return getManagedConnectivity();
    }

    public void onReceive(Context context, Intent intent) {
        boolean managedConnectivity = getManagedConnectivity();
        Iterator it = this.connectivityListeners.iterator();
        while (it.hasNext()) {
            ((ConnectivityListener) it.next()).onConnectivityChanged(managedConnectivity);
        }
    }

    public boolean removeConnectivityListener(ConnectivityListener connectivityListener) {
        return this.connectivityListeners.remove(connectivityListener);
    }

    public void removeConnectivityUpdates() {
        this.activationCounter--;
        if (this.activationCounter == 0) {
            this.context.unregisterReceiver(this);
        }
    }

    public void requestConnectivityUpdates() {
        if (this.activationCounter == 0) {
            this.context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.activationCounter++;
    }

    public void setConnectedFlag(Boolean bool) {
        this.connectedFlag = bool;
    }
}
