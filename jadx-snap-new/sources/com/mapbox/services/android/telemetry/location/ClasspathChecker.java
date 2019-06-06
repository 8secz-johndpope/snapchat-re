package com.mapbox.services.android.telemetry.location;

class ClasspathChecker {
    ClasspathChecker() {
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasDependencyOnClasspath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
