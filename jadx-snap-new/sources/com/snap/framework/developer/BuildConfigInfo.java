package com.snap.framework.developer;

import java.lang.reflect.Field;

public class BuildConfigInfo {
    private static final String FIELD_TYPE_MISMATCH_MSG = "[Field Type Mismatches] %s: BuildConfig=%s, BuildConfigInfo=%s. ";
    private static final String ILLEGAL_ACCESS_EXCEPTION_MSG = "[Illegal Access Exception] bcFieldName=%s, bcFieldType=%s.";
    private static final String MIGRATION_SUCCESS_MSG = "[Migration Succeeds] %s: (%s) = %s";
    private static final String NO_SUCH_FIELD_EXCEPTION_MSG = "[No Such Field Registered] BuildConfigInfo.java: %s %s = %s. ";
    public static final String TAG = "BuildConfigInfo";
    public String APPLICATION_ID;
    public String BUILD_TYPE;
    public boolean CRASHLYTICS_ENABLED;
    public boolean CRITICAL_PERF_LOGGING;
    public boolean DEBUG;
    public String DEV_AUTH_PRIVATE_KEY;
    public boolean DISABLE_GOOGLE_PLAY;
    public boolean DOGOOD_BLOCK;
    public int EXOPACKAGE_FLAGS;
    public boolean EXTERNAL_LOGGING;
    public String FLAVOR;
    public boolean FORCE_REPORT_ALL_SLOW_METHODS;
    public String HOCKEYAPP_ID;
    public boolean INTERNAL_BUILD;
    public boolean IS_EXOPACKAGE;
    public String LAGUNA_HOCKEYAPP_IDENTIFIER;
    public boolean LOGGING;
    public boolean LOGGING_DATABASE;
    public boolean LOGGING_FILTER;
    public boolean LOGGING_NETWORK;
    public boolean LOG_SYSTRACE;
    public boolean MARCOPOLO_BLOCK;
    public int MAX_FAST_METHOD_COUNT;
    public boolean PAYMENTS_ENABLED;
    public boolean PAYMENTS_ENABLED_V2;
    public boolean RECORD_MEMORY_ALLOCATION;
    public boolean REPORT_SLOW_METHODS;
    public final String SAFETYNET_API_KEY;
    public int SLOW_METHOD_REPORT_THRESHOLD;
    public boolean SNAP_ADS_PORTAL_BLOCK;
    public boolean STETHO_DEBUG;
    public String TRACEUR_MODE;
    public boolean TRACE_ALL_THREADS;
    public boolean TRACE_EVENTS;
    public boolean TURDUCKEN;
    public boolean TWEAK_FLAG;
    public String VERSION_NAME;
    public String VERSION_NUM;

    public BuildConfigInfo() {
        this.DEBUG = true;
        this.INTERNAL_BUILD = false;
        this.TRACE_EVENTS = false;
        this.STETHO_DEBUG = false;
        this.CRASHLYTICS_ENABLED = true;
        this.DOGOOD_BLOCK = false;
        this.DISABLE_GOOGLE_PLAY = false;
        this.FORCE_REPORT_ALL_SLOW_METHODS = false;
        this.IS_EXOPACKAGE = false;
        this.LOG_SYSTRACE = false;
        this.MARCOPOLO_BLOCK = false;
        this.PAYMENTS_ENABLED = false;
        this.PAYMENTS_ENABLED_V2 = false;
        this.RECORD_MEMORY_ALLOCATION = false;
        this.REPORT_SLOW_METHODS = false;
        this.TWEAK_FLAG = false;
        this.TRACE_ALL_THREADS = false;
        this.SNAP_ADS_PORTAL_BLOCK = false;
        this.APPLICATION_ID = "DEFAULT_APPLICATION_ID";
        this.BUILD_TYPE = "DEFAULT_BUILD_TYPER";
        this.HOCKEYAPP_ID = "DEFAULT_HOCKEYAPP_ID";
        this.VERSION_NUM = "DEFAULT_VERSION_NUMBER";
        this.VERSION_NAME = "DEFAULT_VERSION_NAME";
        this.FLAVOR = "DEFAULT_FLAVOR";
        this.LAGUNA_HOCKEYAPP_IDENTIFIER = "DEFAULT_LAGUNA_HOCKEYAPP_IDENTIFIER";
        this.DEV_AUTH_PRIVATE_KEY = "DEV_AUTH_PRIVATE_KEY";
        this.LOGGING = true;
        this.LOGGING_NETWORK = true;
        this.LOGGING_DATABASE = false;
        this.CRITICAL_PERF_LOGGING = false;
        this.EXTERNAL_LOGGING = false;
        this.LOGGING_FILTER = false;
        this.TRACEUR_MODE = "full";
        this.TURDUCKEN = false;
        this.EXOPACKAGE_FLAGS = 1;
        this.MAX_FAST_METHOD_COUNT = 5;
        this.SLOW_METHOD_REPORT_THRESHOLD = 50;
        this.SAFETYNET_API_KEY = "AIzaSyBw8SH3GKWmBS-HwS7qucQYGqSPRFnYJck";
    }

    public BuildConfigInfo(Class cls) {
        this(cls.getFields());
    }

    public BuildConfigInfo(Class[] clsArr) {
        this.DEBUG = true;
        int i = 0;
        this.INTERNAL_BUILD = false;
        this.TRACE_EVENTS = false;
        this.STETHO_DEBUG = false;
        this.CRASHLYTICS_ENABLED = true;
        this.DOGOOD_BLOCK = false;
        this.DISABLE_GOOGLE_PLAY = false;
        this.FORCE_REPORT_ALL_SLOW_METHODS = false;
        this.IS_EXOPACKAGE = false;
        this.LOG_SYSTRACE = false;
        this.MARCOPOLO_BLOCK = false;
        this.PAYMENTS_ENABLED = false;
        this.PAYMENTS_ENABLED_V2 = false;
        this.RECORD_MEMORY_ALLOCATION = false;
        this.REPORT_SLOW_METHODS = false;
        this.TWEAK_FLAG = false;
        this.TRACE_ALL_THREADS = false;
        this.SNAP_ADS_PORTAL_BLOCK = false;
        this.APPLICATION_ID = "DEFAULT_APPLICATION_ID";
        this.BUILD_TYPE = "DEFAULT_BUILD_TYPER";
        this.HOCKEYAPP_ID = "DEFAULT_HOCKEYAPP_ID";
        this.VERSION_NUM = "DEFAULT_VERSION_NUMBER";
        this.VERSION_NAME = "DEFAULT_VERSION_NAME";
        this.FLAVOR = "DEFAULT_FLAVOR";
        this.LAGUNA_HOCKEYAPP_IDENTIFIER = "DEFAULT_LAGUNA_HOCKEYAPP_IDENTIFIER";
        this.DEV_AUTH_PRIVATE_KEY = "DEV_AUTH_PRIVATE_KEY";
        this.LOGGING = true;
        this.LOGGING_NETWORK = true;
        this.LOGGING_DATABASE = false;
        this.CRITICAL_PERF_LOGGING = false;
        this.EXTERNAL_LOGGING = false;
        this.LOGGING_FILTER = false;
        this.TRACEUR_MODE = "full";
        this.TURDUCKEN = false;
        this.EXOPACKAGE_FLAGS = 1;
        this.MAX_FAST_METHOD_COUNT = 5;
        this.SLOW_METHOD_REPORT_THRESHOLD = 50;
        this.SAFETYNET_API_KEY = "AIzaSyBw8SH3GKWmBS-HwS7qucQYGqSPRFnYJck";
        int length = clsArr.length;
        while (i < length) {
            reflectBuildConfigClass(clsArr[i]);
            i++;
        }
    }

    public BuildConfigInfo(Field[] fieldArr) {
        this.DEBUG = true;
        this.INTERNAL_BUILD = false;
        this.TRACE_EVENTS = false;
        this.STETHO_DEBUG = false;
        this.CRASHLYTICS_ENABLED = true;
        this.DOGOOD_BLOCK = false;
        this.DISABLE_GOOGLE_PLAY = false;
        this.FORCE_REPORT_ALL_SLOW_METHODS = false;
        this.IS_EXOPACKAGE = false;
        this.LOG_SYSTRACE = false;
        this.MARCOPOLO_BLOCK = false;
        this.PAYMENTS_ENABLED = false;
        this.PAYMENTS_ENABLED_V2 = false;
        this.RECORD_MEMORY_ALLOCATION = false;
        this.REPORT_SLOW_METHODS = false;
        this.TWEAK_FLAG = false;
        this.TRACE_ALL_THREADS = false;
        this.SNAP_ADS_PORTAL_BLOCK = false;
        this.APPLICATION_ID = "DEFAULT_APPLICATION_ID";
        this.BUILD_TYPE = "DEFAULT_BUILD_TYPER";
        this.HOCKEYAPP_ID = "DEFAULT_HOCKEYAPP_ID";
        this.VERSION_NUM = "DEFAULT_VERSION_NUMBER";
        this.VERSION_NAME = "DEFAULT_VERSION_NAME";
        this.FLAVOR = "DEFAULT_FLAVOR";
        this.LAGUNA_HOCKEYAPP_IDENTIFIER = "DEFAULT_LAGUNA_HOCKEYAPP_IDENTIFIER";
        this.DEV_AUTH_PRIVATE_KEY = "DEV_AUTH_PRIVATE_KEY";
        this.LOGGING = true;
        this.LOGGING_NETWORK = true;
        this.LOGGING_DATABASE = false;
        this.CRITICAL_PERF_LOGGING = false;
        this.EXTERNAL_LOGGING = false;
        this.LOGGING_FILTER = false;
        this.TRACEUR_MODE = "full";
        this.TURDUCKEN = false;
        this.EXOPACKAGE_FLAGS = 1;
        this.MAX_FAST_METHOD_COUNT = 5;
        this.SLOW_METHOD_REPORT_THRESHOLD = 50;
        this.SAFETYNET_API_KEY = "AIzaSyBw8SH3GKWmBS-HwS7qucQYGqSPRFnYJck";
        reflectAllBuildConfigFields(fieldArr);
    }

    private void reflectAllBuildConfigFields(Field[] fieldArr) {
        for (Field reflectBuildConfigField : fieldArr) {
            reflectBuildConfigField(reflectBuildConfigField);
        }
    }

    private void reflectBuildConfigClass(Class cls) {
        reflectAllBuildConfigFields(cls.getFields());
    }

    private void reflectBuildConfigField(Field field) {
        String name = field.getName();
        Class type = field.getType();
        try {
            Object obj = field.get(null);
            Field field2 = getClass().getField(name);
            type.equals(field2.getType());
            field2.setAccessible(true);
            field2.set(this, obj);
            getClass().getField(name).get(this);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }
}
