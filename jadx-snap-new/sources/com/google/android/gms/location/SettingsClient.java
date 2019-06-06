package com.google.android.gms.location;

import android.app.Activity;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zzg;
import com.google.android.gms.common.internal.zzbj;
import com.google.android.gms.tasks.Task;

public class SettingsClient extends GoogleApi<Object> {
    public SettingsClient(Activity activity) {
        super(activity, LocationServices.API, null, new zzg());
    }

    public Task<LocationSettingsResponse> checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        return zzbj.zza(LocationServices.SettingsApi.checkLocationSettings(zzahw(), locationSettingsRequest), new LocationSettingsResponse());
    }
}
