package com.mapbox.mapboxsdk.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.alsj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {
    private static ConnectivityReceiver INSTANCE;
    private static Provider sProvider;
    private int activationCounter;
    private Context context;
    private List<ConnectivityListener> listeners = new CopyOnWriteArrayList();

    public interface Provider {
        boolean isConnected();

        void onListenerListChanged(List<ConnectivityListener> list, ConnectivityListener connectivityListener, boolean z);
    }

    private ConnectivityReceiver(Context context) {
        this.context = context;
    }

    public static synchronized ConnectivityReceiver instance(Context context) {
        ConnectivityReceiver connectivityReceiver;
        synchronized (ConnectivityReceiver.class) {
            if (INSTANCE == null) {
                ConnectivityReceiver connectivityReceiver2 = new ConnectivityReceiver(context.getApplicationContext());
                INSTANCE = connectivityReceiver2;
                connectivityReceiver2.addListener(new NativeConnectivityListener());
            }
            connectivityReceiver = INSTANCE;
        }
        return connectivityReceiver;
    }

    public static void setProvider(Provider provider) {
        sProvider = provider;
    }

    public void activate() {
        if (this.activationCounter == 0 && sProvider == null) {
            this.context.registerReceiver(INSTANCE, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.activationCounter++;
    }

    public void addListener(ConnectivityListener connectivityListener) {
        this.listeners.add(connectivityListener);
        Provider provider = sProvider;
        if (provider != null) {
            provider.onListenerListChanged(this.listeners, connectivityListener, true);
        }
    }

    public void deactivate() {
        this.activationCounter--;
        if (sProvider == null && this.activationCounter == 0) {
            this.context.unregisterReceiver(INSTANCE);
        }
    }

    public boolean isConnected(Context context) {
        Provider provider = sProvider;
        if (provider != null) {
            return provider.isConnected();
        }
        Boolean isConnected = Mapbox.isConnected();
        if (isConnected != null) {
            return isConnected.booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onReceive(Context context, Intent intent) {
        boolean isConnected = isConnected(context);
        alsj.a("Connected: ".concat(String.valueOf(isConnected)), new Object[0]);
        for (ConnectivityListener onNetworkStateChanged : this.listeners) {
            onNetworkStateChanged.onNetworkStateChanged(isConnected);
        }
    }

    public void removeListener(ConnectivityListener connectivityListener) {
        this.listeners.remove(connectivityListener);
        Provider provider = sProvider;
        if (provider != null) {
            provider.onListenerListChanged(this.listeners, connectivityListener, false);
        }
    }
}
