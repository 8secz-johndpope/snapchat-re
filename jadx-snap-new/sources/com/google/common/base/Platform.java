package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.logging.Logger;

final class Platform {
    private static final Logger logger = Logger.getLogger(Platform.class.getName());
    private static final PatternCompiler patternCompiler = loadPatternCompiler();

    static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        /* synthetic */ JdkPatternCompiler(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private Platform() {
    }

    static String formatCompact4Digits(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> cls, String str) {
        WeakReference weakReference = (WeakReference) Enums.getEnumConstants(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.of(cls.cast(weakReference.get()));
    }

    private static PatternCompiler loadPatternCompiler() {
        return new JdkPatternCompiler();
    }

    static String nullToEmpty(String str) {
        return str == null ? "" : str;
    }

    static boolean stringIsNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    static long systemNanoTime() {
        return System.nanoTime();
    }
}
