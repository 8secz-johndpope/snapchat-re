package com.looksery.sdk.domain;

import android.content.Context;
import com.looksery.sdk.Trackers;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Category {
    private static final String CATEGORIES_NATURAL_FEATURE_INIT_EFFECT_PATH = "/Categories/NaturalFeature/InitEffect";
    private static final String CATEGORIES_SELFIE_INIT_EFFECT_PATH = "/Categories/Selfie/InitEffect";
    private static final Category CATEGORY_NONE;
    private static final Category DEFAULT_CATEGORY_GROUND;
    private static final Category DEFAULT_CATEGORY_NFT = new Category(NFT_CATEGORY_ID, ActivatorType.NATURAL_FEATURE, CATEGORIES_NATURAL_FEATURE_INIT_EFFECT_PATH);
    private static final Category DEFAULT_CATEGORY_SELFIE = new Category(SELFIE_CATEGORY_ID, ActivatorType.SELFIE, CATEGORIES_SELFIE_INIT_EFFECT_PATH);
    private static final Category DEFAULT_CATEGORY_SKY;
    private static final Category DEFAULT_CATEGORY_SNAPCODE;
    private static final Category DEFAULT_CATEGORY_VISUAL_CONTEXT;
    public static final String GROUND_CATEGORY_ID = "LENS_CATEGORY_GROUND";
    public static final String NFT_CATEGORY_ID = "LENS_CATEGORY_NFT";
    public static final String SELFIE_CATEGORY_ID = "LENS_CATEGORY_SELFIE";
    public static final String SKY_CATEGORY_ID = "LENS_CATEGORY_SKY";
    public static final String SNAPCODE_CATEGORY_ID = "LENS_CATEGORY_SNAPCODE";
    public static final String VISUAL_CONTEXT_CATEGORY_ID = "LENS_CATEGORY_VISUAL_CONTEXT";
    private final Map<String, List<String>> mActivatorParameters;
    private final ActivatorType mActivatorType;
    private final LinkedHashSet<String> mAdditionalCategories;
    private final String mId;
    private final String mInitialEffectPath;
    private final SupportAssessor mSupportAssessor;

    interface SupportAssessor {
        public static final SupportAssessor ALWAYS = new SupportAssessor() {
            public boolean isSupported(Context context) {
                return true;
            }
        };
        public static final SupportAssessor DEVICE_MOTION = new SupportAssessor() {
            public boolean isSupported(Context context) {
                return Trackers.deviceMotionSupported(context);
            }
        };

        boolean isSupported(Context context);
    }

    public enum ActivatorType {
        NONE,
        SELFIE,
        SKY,
        NATURAL_FEATURE,
        VISUAL_CONTEXT,
        GROUND,
        SNAPCODE;
        
        private static final String ACTIVATOR_NAME_GYRO = "GYRO";
        private static final String ACTIVATOR_NAME_NFT = "NFT";

        public static ActivatorType fromString(String str) {
            if (NONE.name().equals(str)) {
                return NONE;
            }
            if (SELFIE.name().equals(str)) {
                return SELFIE;
            }
            if (SKY.name().equals(str)) {
                return SKY;
            }
            if (ACTIVATOR_NAME_GYRO.equals(str)) {
                return SKY;
            }
            if (NATURAL_FEATURE.name().equals(str)) {
                return NATURAL_FEATURE;
            }
            if (ACTIVATOR_NAME_NFT.equals(str)) {
                return NATURAL_FEATURE;
            }
            if (GROUND.name().equals(str)) {
                return GROUND;
            }
            if (SNAPCODE.name().equals(str)) {
                return SNAPCODE;
            }
            if (VISUAL_CONTEXT.name().equals(str)) {
                return VISUAL_CONTEXT;
            }
            throw new IllegalArgumentException("Bad activator name: ".concat(String.valueOf(str)));
        }
    }

    public static final class ActivatorParameters {
        private static final String NATURAL_FEATURE_MODEL_SET_PATH_SUFFIX = "nft-model";
        private static final String NATURAL_FEATURE_TIMEOUT_KEY = "NaturalFeatureTimeout";
        private static final String[] PERMITTED_KEYS = new String[]{TARGET_PATHS_KEY, NATURAL_FEATURE_TIMEOUT_KEY, VISUAL_CONTEXT_MODEL_PATH_KEY, VISUAL_CONTEXT_TIMEOUT_KEY};
        private static final String TARGET_PATHS_KEY = "TargetPathsKey";
        private static final String VISUAL_CONTEXT_MODEL_PATH_KEY = "VisualContextModelKey";
        private static final String VISUAL_CONTEXT_TIMEOUT_KEY = "VisualContextTimeoutKey";

        private ActivatorParameters() {
            throw new AssertionError("No instances");
        }

        public static String naturalFeatureModelSetPathSuffix() {
            return NATURAL_FEATURE_MODEL_SET_PATH_SUFFIX;
        }

        public static String naturalFeatureTimeoutKey() {
            return NATURAL_FEATURE_TIMEOUT_KEY;
        }

        public static String targetPathsKey() {
            return TARGET_PATHS_KEY;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x001f in {4, 5, 7, 9} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        static void verify(java.lang.String r5) {
            /*
            r0 = PERMITTED_KEYS;
            r1 = r0.length;
            r2 = 0;
            r3 = 0;
            if (r3 >= r1) goto L_0x0014;
            r4 = r0[r3];
            r4 = r4.equals(r5);
            if (r4 == 0) goto L_0x0011;
            r2 = 1;
            goto L_0x0014;
            r3 = r3 + 1;
            goto L_0x0005;
            if (r2 == 0) goto L_0x0017;
            return;
            r5 = new java.lang.IllegalArgumentException;
            r0 = "Unrecognized activator parameter key";
            r5.<init>(r0);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.domain.Category$ActivatorParameters.verify(java.lang.String):void");
        }

        public static String visualContextModelPathKey() {
            return VISUAL_CONTEXT_MODEL_PATH_KEY;
        }

        public static String visualContextTimeoutKey() {
            return VISUAL_CONTEXT_TIMEOUT_KEY;
        }
    }

    static {
        String str = "";
        CATEGORY_NONE = new Category(str, ActivatorType.NONE, str);
        DEFAULT_CATEGORY_SKY = new Category(SKY_CATEGORY_ID, ActivatorType.SKY, str);
        DEFAULT_CATEGORY_GROUND = new Category(GROUND_CATEGORY_ID, ActivatorType.GROUND, str);
        DEFAULT_CATEGORY_SNAPCODE = new Category(SNAPCODE_CATEGORY_ID, ActivatorType.SNAPCODE, str);
        DEFAULT_CATEGORY_VISUAL_CONTEXT = new Category(VISUAL_CONTEXT_CATEGORY_ID, ActivatorType.VISUAL_CONTEXT, str);
    }

    private Category(String str, ActivatorType activatorType, String str2) {
        this(str, activatorType, str2, Collections.emptyMap());
    }

    private Category(String str, ActivatorType activatorType, String str2, Map<String, List<String>> map) {
        this(str, activatorType, str2, map, new LinkedHashSet(), getSupportAssessorFor(activatorType));
    }

    Category(String str, ActivatorType activatorType, String str2, Map<String, List<String>> map, LinkedHashSet<String> linkedHashSet, SupportAssessor supportAssessor) {
        this.mId = str;
        this.mActivatorType = activatorType;
        this.mInitialEffectPath = str2;
        this.mActivatorParameters = map;
        this.mAdditionalCategories = linkedHashSet;
        this.mSupportAssessor = supportAssessor;
    }

    public static Category create(String str, ActivatorType activatorType, String str2) {
        return new Category(str, activatorType, str2);
    }

    public static Category defaultCategoryNaturalFeature() {
        return DEFAULT_CATEGORY_NFT;
    }

    public static Category defaultCategorySelfie() {
        return DEFAULT_CATEGORY_SELFIE;
    }

    public static Category defaultCategorySky() {
        return DEFAULT_CATEGORY_SKY;
    }

    public static Category defaultCategorySnapcode() {
        return DEFAULT_CATEGORY_SNAPCODE;
    }

    public static Category getDefaultCategoryGround() {
        return DEFAULT_CATEGORY_GROUND;
    }

    public static Category getDefaultCategoryVisualContext() {
        return DEFAULT_CATEGORY_VISUAL_CONTEXT;
    }

    private static SupportAssessor getSupportAssessorFor(ActivatorType activatorType) {
        return ActivatorType.SKY.equals(activatorType) ? SupportAssessor.DEVICE_MOTION : ActivatorType.GROUND.equals(activatorType) ? SupportAssessor.DEVICE_MOTION : SupportAssessor.ALWAYS;
    }

    public static boolean matchesCategory(String str, String str2) {
        if (SELFIE_CATEGORY_ID.equals(str2) || SKY_CATEGORY_ID.equals(str2) || NFT_CATEGORY_ID.equals(str2) || SNAPCODE_CATEGORY_ID.equals(str2) || GROUND_CATEGORY_ID.equals(str2)) {
            return str.startsWith(str2);
        }
        throw new IllegalArgumentException("A non-NONE Category must be one of SELFIE, SKY, NFT, SNAPCODE or GROUND, provided: ".concat(String.valueOf(str2)));
    }

    public static Category none() {
        return CATEGORY_NONE;
    }

    public static Category withGroundActivator(String str) {
        return create(str, ActivatorType.GROUND, "");
    }

    public static Category withNaturalFeatureActivator(String str) {
        return create(str, ActivatorType.NATURAL_FEATURE, CATEGORIES_NATURAL_FEATURE_INIT_EFFECT_PATH);
    }

    public static Category withSelfieActivator(String str) {
        return create(str, ActivatorType.SELFIE, CATEGORIES_SELFIE_INIT_EFFECT_PATH);
    }

    public static Category withSkyActivator(String str) {
        return create(str, ActivatorType.SKY, "");
    }

    public static Category withSnapcodeActivator(String str) {
        return create(str, ActivatorType.SNAPCODE, "");
    }

    public static Category withVisualContextActivator(String str) {
        return create(str, ActivatorType.VISUAL_CONTEXT, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Category category = (Category) obj;
            if (this.mId.equals(category.mId) && this.mActivatorType == category.mActivatorType && this.mInitialEffectPath.equals(category.mInitialEffectPath) && this.mActivatorParameters.equals(category.mActivatorParameters) && this.mAdditionalCategories.equals(category.mAdditionalCategories)) {
                return true;
            }
        }
        return false;
    }

    public final String getActivatorParameter(String str) {
        List activatorParameters = getActivatorParameters(str);
        return activatorParameters.isEmpty() ? null : (String) activatorParameters.get(0);
    }

    /* Access modifiers changed, original: final */
    public final String[] getActivatorParameterKeys() {
        Set keySet = this.mActivatorParameters.keySet();
        return (String[]) keySet.toArray(new String[keySet.size()]);
    }

    public final List<String> getActivatorParameters(String str) {
        ActivatorParameters.verify(str);
        List list = (List) this.mActivatorParameters.get(str);
        return list == null ? Collections.emptyList() : list;
    }

    /* Access modifiers changed, original: final */
    public final String[] getActivatorParametersArray(String str) {
        ActivatorParameters.verify(str);
        List list = (List) this.mActivatorParameters.get(str);
        return list == null ? new String[0] : (String[]) list.toArray(new String[list.size()]);
    }

    public final ActivatorType getActivatorType() {
        return this.mActivatorType;
    }

    public final Set<String> getAdditionalCategories() {
        return this.mAdditionalCategories;
    }

    public final String getId() {
        return this.mId;
    }

    public final String getInitialEffectPath() {
        return this.mInitialEffectPath;
    }

    public final int hashCode() {
        return (((((this.mId.hashCode() * 31) + this.mActivatorType.hashCode()) * 31) + this.mInitialEffectPath.hashCode()) * 31) + this.mActivatorParameters.hashCode();
    }

    public final boolean isSupported(Context context) {
        return this.mSupportAssessor.isSupported(context);
    }

    public final boolean matchesCategory(String str) {
        return matchesCategory(this.mId, str);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Category{mId='");
        stringBuilder.append(this.mId);
        stringBuilder.append('\'');
        stringBuilder.append(", mActivatorType=");
        stringBuilder.append(this.mActivatorType);
        stringBuilder.append(", mInitialEffectPath='");
        stringBuilder.append(this.mInitialEffectPath);
        stringBuilder.append('\'');
        stringBuilder.append(", mActivatorParameters=");
        stringBuilder.append(this.mActivatorParameters);
        stringBuilder.append(", mAdditionalCategories=");
        stringBuilder.append(this.mAdditionalCategories);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Category withActivatorParameter(String str, String str2) {
        ActivatorParameters.verify(str);
        HashMap hashMap = new HashMap(this.mActivatorParameters);
        hashMap.put(str, Arrays.asList(new String[]{str2}));
        return new Category(this.mId, this.mActivatorType, this.mInitialEffectPath, hashMap, this.mAdditionalCategories, this.mSupportAssessor);
    }

    public final Category withActivatorParameters(String str, List<String> list) {
        ActivatorParameters.verify(str);
        HashMap hashMap = new HashMap(this.mActivatorParameters);
        hashMap.put(str, list);
        return new Category(this.mId, this.mActivatorType, this.mInitialEffectPath, hashMap, this.mAdditionalCategories, this.mSupportAssessor);
    }

    /* Access modifiers changed, original: final */
    public final Category withActivatorParameters(String str, String[] strArr) {
        return withActivatorParameters(str, Arrays.asList(strArr));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0053 in {6, 8, 10, 12} preds:[]
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
    public final com.looksery.sdk.domain.Category withAdditionalCategories(java.util.Collection<java.lang.String> r8) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x004b;
        r5 = new java.util.LinkedHashSet;
        r5.<init>();
        r8 = r8.iterator();
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x003a;
        r0 = r8.next();
        r0 = (java.lang.String) r0;
        r1 = r5.contains(r0);
        if (r1 != 0) goto L_0x0021;
        r5.add(r0);
        goto L_0x000b;
        r8 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Duplicate categoryId: ";
        r1.<init>(r2);
        r1.append(r0);
        r0 = " in addititionalCategories set";
        r1.append(r0);
        r0 = r1.toString();
        r8.<init>(r0);
        throw r8;
        r8 = new com.looksery.sdk.domain.Category;
        r1 = r7.mId;
        r2 = r7.mActivatorType;
        r3 = r7.mInitialEffectPath;
        r4 = r7.mActivatorParameters;
        r6 = r7.mSupportAssessor;
        r0 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r8;
        r8 = new java.lang.IllegalArgumentException;
        r0 = "Null additional categories data";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.domain.Category.withAdditionalCategories(java.util.Collection):com.looksery.sdk.domain.Category");
    }
}
