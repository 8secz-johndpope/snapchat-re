package com.google.common.base;

import defpackage.ppy;
import java.util.Arrays;

public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        static final class ValueHolder {
            String name;
            ValueHolder next;
            Object value;

            private ValueHolder() {
            }
        }

        private ToStringHelper(String str) {
            this.holderHead = new ValueHolder();
            this.holderTail = this.holderHead;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private ToStringHelper addHolder(Object obj) {
            addHolder().value = obj;
            return this;
        }

        private ToStringHelper addHolder(String str, Object obj) {
            ValueHolder addHolder = addHolder();
            addHolder.value = obj;
            addHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public final ToStringHelper add(String str, double d) {
            return addHolder(str, String.valueOf(d));
        }

        public final ToStringHelper add(String str, float f) {
            return addHolder(str, String.valueOf(f));
        }

        public final ToStringHelper add(String str, int i) {
            return addHolder(str, String.valueOf(i));
        }

        public final ToStringHelper add(String str, long j) {
            return addHolder(str, String.valueOf(j));
        }

        public final ToStringHelper add(String str, Object obj) {
            return addHolder(str, obj);
        }

        public final ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }

        public final ToStringHelper addValue(Object obj) {
            return addHolder(obj);
        }

        public final ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public final String toString() {
            boolean z = this.omitNullValues;
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.className);
            stringBuilder.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                Object obj = valueHolder.value;
                if (!z || obj != null) {
                    stringBuilder.append(str);
                    if (valueHolder.name != null) {
                        stringBuilder.append(valueHolder.name);
                        stringBuilder.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        stringBuilder.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        stringBuilder.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ppy.d;
                }
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static <T> T firstNonNull(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
