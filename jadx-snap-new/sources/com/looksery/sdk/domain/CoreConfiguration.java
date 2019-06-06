package com.looksery.sdk.domain;

import android.content.Context;
import com.looksery.sdk.ExperimentProvider;
import com.looksery.sdk.InstrumentationDelegatesFactory;
import com.looksery.sdk.media.VideoCodecFactory;
import java.io.File;

public class CoreConfiguration {
    public static final String CORE_ASSETS_PATH = "asset:looksery/core";
    private final String mCachePath;
    private final String mCoreResourcesPath;
    private final boolean mDisableTracking;
    private final String mDocumentsPath;
    private final ExperimentProvider mExperimentProvider;
    private final InstrumentationDelegatesFactory mInstrumentationDelegatesFactory;
    private final boolean mPreferGmsFaceDetector;
    private final String mResourcesPath;
    private final String mUserDataPath;
    private final VideoCodecFactory mVideoCodecFactory;

    public static class CoreConfigurationBuilder {
        private String mCachePath;
        private String mCoreResourcesPath = CoreConfiguration.CORE_ASSETS_PATH;
        private boolean mDisableTracking = false;
        private String mDocumentsPath;
        private ExperimentProvider mExperimentProvider;
        private InstrumentationDelegatesFactory mInstrumentationDelegatesFactory;
        private boolean mPreferGmsFaceDetector = true;
        private String mResourcesPath = "dummyResourcesPath";
        private String mUserDataPath;
        private VideoCodecFactory mVideoCodecFactory;

        public CoreConfigurationBuilder(Context context) {
            File file = new File(context.getFilesDir(), "looksery_sdk");
            File file2 = new File(context.getCacheDir(), "looksery_cache");
            File file3 = new File(context.getFilesDir(), "looksery_user_data_cache");
            setDocumentsPath(file);
            setCachePath(file2);
            setUserDataPath(file3);
        }

        public CoreConfiguration build() {
            return new CoreConfiguration(this);
        }

        /* Access modifiers changed, original: 0000 */
        public String getCachePath() {
            return this.mCachePath;
        }

        /* Access modifiers changed, original: 0000 */
        public String getCoreResourcesPath() {
            return this.mCoreResourcesPath;
        }

        /* Access modifiers changed, original: 0000 */
        public String getDocumentsPath() {
            return this.mDocumentsPath;
        }

        /* Access modifiers changed, original: 0000 */
        public InstrumentationDelegatesFactory getInstrumentationDelegatesFactory() {
            return this.mInstrumentationDelegatesFactory;
        }

        /* Access modifiers changed, original: 0000 */
        public String getResourcesPath() {
            return this.mResourcesPath;
        }

        /* Access modifiers changed, original: 0000 */
        public String getUserDataPath() {
            return this.mUserDataPath;
        }

        /* Access modifiers changed, original: 0000 */
        public VideoCodecFactory getVideoCodecFactory() {
            return this.mVideoCodecFactory;
        }

        /* Access modifiers changed, original: 0000 */
        public ExperimentProvider getmExperimentProvider() {
            return this.mExperimentProvider;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean preferGmsFaceDetector() {
            return this.mPreferGmsFaceDetector;
        }

        public CoreConfigurationBuilder setCachePath(File file) {
            StringBuilder stringBuilder = new StringBuilder("file:");
            stringBuilder.append(file.getAbsolutePath());
            this.mCachePath = stringBuilder.toString();
            return this;
        }

        public CoreConfigurationBuilder setCoreResourcesPath(String str) {
            this.mCoreResourcesPath = str;
            return this;
        }

        public CoreConfigurationBuilder setDisableTracking(boolean z) {
            this.mDisableTracking = z;
            return this;
        }

        public CoreConfigurationBuilder setDocumentsPath(File file) {
            StringBuilder stringBuilder = new StringBuilder("file:");
            stringBuilder.append(file.getAbsolutePath());
            this.mDocumentsPath = stringBuilder.toString();
            return this;
        }

        public CoreConfigurationBuilder setExperimentProvider(ExperimentProvider experimentProvider) {
            this.mExperimentProvider = experimentProvider;
            return this;
        }

        public CoreConfigurationBuilder setInstrumentationDelegatesFactory(InstrumentationDelegatesFactory instrumentationDelegatesFactory) {
            this.mInstrumentationDelegatesFactory = instrumentationDelegatesFactory;
            return this;
        }

        public CoreConfigurationBuilder setPreferGmsFaceDetector(boolean z) {
            this.mPreferGmsFaceDetector = z;
            return this;
        }

        public CoreConfigurationBuilder setResourcesPath(String str) {
            this.mResourcesPath = str;
            return this;
        }

        public CoreConfigurationBuilder setUserDataPath(File file) {
            StringBuilder stringBuilder = new StringBuilder("file:");
            stringBuilder.append(file.getAbsolutePath());
            this.mUserDataPath = stringBuilder.toString();
            return this;
        }

        public CoreConfigurationBuilder setVideoCodecFactory(VideoCodecFactory videoCodecFactory) {
            this.mVideoCodecFactory = videoCodecFactory;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean shouldDisableTracking() {
            return this.mDisableTracking;
        }
    }

    CoreConfiguration(CoreConfigurationBuilder coreConfigurationBuilder) {
        this.mCoreResourcesPath = coreConfigurationBuilder.getCoreResourcesPath();
        this.mResourcesPath = coreConfigurationBuilder.getResourcesPath();
        this.mDocumentsPath = coreConfigurationBuilder.getDocumentsPath();
        this.mCachePath = coreConfigurationBuilder.getCachePath();
        this.mUserDataPath = coreConfigurationBuilder.getUserDataPath();
        this.mDisableTracking = coreConfigurationBuilder.shouldDisableTracking();
        this.mPreferGmsFaceDetector = coreConfigurationBuilder.preferGmsFaceDetector();
        this.mInstrumentationDelegatesFactory = coreConfigurationBuilder.getInstrumentationDelegatesFactory();
        this.mVideoCodecFactory = coreConfigurationBuilder.getVideoCodecFactory();
        this.mExperimentProvider = coreConfigurationBuilder.getmExperimentProvider();
    }

    public static CoreConfigurationBuilder newBuilder(Context context) {
        return new CoreConfigurationBuilder(context);
    }

    public String getCachePath() {
        return this.mCachePath;
    }

    public String getCoreResourcesPath() {
        return this.mCoreResourcesPath;
    }

    public String getDocumentsPath() {
        return this.mDocumentsPath;
    }

    public ExperimentProvider getExperimentProvider() {
        return this.mExperimentProvider;
    }

    public InstrumentationDelegatesFactory getInstrumentationDelegatesFactory() {
        return this.mInstrumentationDelegatesFactory;
    }

    public String getResourcesPath() {
        return this.mResourcesPath;
    }

    public String getUserDataPath() {
        return this.mUserDataPath;
    }

    public VideoCodecFactory getVideoCodecFactory() {
        return this.mVideoCodecFactory;
    }

    public boolean preferGmsFaceDetector() {
        return this.mPreferGmsFaceDetector;
    }

    public boolean shouldDisableTracking() {
        return this.mDisableTracking;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoreConfiguration{mCoreResourcesPath='");
        stringBuilder.append(this.mCoreResourcesPath);
        stringBuilder.append('\'');
        stringBuilder.append(", mResourcesPath='");
        stringBuilder.append(this.mResourcesPath);
        stringBuilder.append('\'');
        stringBuilder.append(", mDocumentsPath='");
        stringBuilder.append(this.mDocumentsPath);
        stringBuilder.append('\'');
        stringBuilder.append(", mCachePath='");
        stringBuilder.append(this.mCachePath);
        stringBuilder.append('\'');
        stringBuilder.append(", mUserDataPath='");
        stringBuilder.append(this.mUserDataPath);
        stringBuilder.append('\'');
        stringBuilder.append(", mDisableTracking=");
        stringBuilder.append(this.mDisableTracking);
        stringBuilder.append('\'');
        stringBuilder.append(", mInstrumentationDelegatesFactory='");
        stringBuilder.append(this.mInstrumentationDelegatesFactory);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
