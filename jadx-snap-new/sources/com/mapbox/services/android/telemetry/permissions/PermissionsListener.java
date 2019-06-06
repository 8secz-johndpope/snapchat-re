package com.mapbox.services.android.telemetry.permissions;

import java.util.List;

public interface PermissionsListener {
    void onExplanationNeeded(List<String> list);

    void onPermissionResult(boolean z);
}
