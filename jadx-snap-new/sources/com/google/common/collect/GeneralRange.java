package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            int i = 1;
            Preconditions.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", (Object) t, (Object) t2);
            if (compare == 0) {
                compare = boundType != BoundType.OPEN ? 1 : 0;
                if (boundType2 == BoundType.OPEN) {
                    i = 0;
                }
                Preconditions.checkArgument(compare | i);
            }
        }
    }

    static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        return new GeneralRange(comparator, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
    }

    static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new GeneralRange(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new GeneralRange(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    /* Access modifiers changed, original: final */
    public final Comparator<? super T> comparator() {
        return this.comparator;
    }

    /* Access modifiers changed, original: final */
    public final boolean contains(T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    /* Access modifiers changed, original: final */
    public final T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    /* Access modifiers changed, original: final */
    public final BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    /* Access modifiers changed, original: final */
    public final T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    /* Access modifiers changed, original: final */
    public final boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    /* Access modifiers changed, original: final */
    public final boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public final int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Missing block: B:9:0x003f, code skipped:
            if (r11.getLowerBoundType() != com.google.common.collect.BoundType.OPEN) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:20:0x007b, code skipped:
            if (r11.getUpperBoundType() != com.google.common.collect.BoundType.OPEN) goto L_0x0085;
     */
    public final com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> r11) {
        /*
        r10 = this;
        com.google.common.base.Preconditions.checkNotNull(r11);
        r0 = r10.comparator;
        r1 = r11.comparator;
        r0 = r0.equals(r1);
        com.google.common.base.Preconditions.checkArgument(r0);
        r0 = r10.hasLowerBound;
        r1 = r10.getLowerEndpoint();
        r2 = r10.getLowerBoundType();
        r3 = r10.hasLowerBound();
        if (r3 != 0) goto L_0x0021;
    L_0x001e:
        r0 = r11.hasLowerBound;
        goto L_0x0041;
    L_0x0021:
        r3 = r11.hasLowerBound();
        if (r3 == 0) goto L_0x0049;
    L_0x0027:
        r3 = r10.comparator;
        r4 = r10.getLowerEndpoint();
        r5 = r11.getLowerEndpoint();
        r3 = r3.compare(r4, r5);
        if (r3 < 0) goto L_0x0041;
    L_0x0037:
        if (r3 != 0) goto L_0x0049;
    L_0x0039:
        r3 = r11.getLowerBoundType();
        r4 = com.google.common.collect.BoundType.OPEN;
        if (r3 != r4) goto L_0x0049;
    L_0x0041:
        r1 = r11.getLowerEndpoint();
        r2 = r11.getLowerBoundType();
    L_0x0049:
        r4 = r0;
        r0 = r10.hasUpperBound;
        r3 = r10.getUpperEndpoint();
        r5 = r10.getUpperBoundType();
        r6 = r10.hasUpperBound();
        if (r6 != 0) goto L_0x005d;
    L_0x005a:
        r0 = r11.hasUpperBound;
        goto L_0x007d;
    L_0x005d:
        r6 = r11.hasUpperBound();
        if (r6 == 0) goto L_0x0085;
    L_0x0063:
        r6 = r10.comparator;
        r7 = r10.getUpperEndpoint();
        r8 = r11.getUpperEndpoint();
        r6 = r6.compare(r7, r8);
        if (r6 > 0) goto L_0x007d;
    L_0x0073:
        if (r6 != 0) goto L_0x0085;
    L_0x0075:
        r6 = r11.getUpperBoundType();
        r7 = com.google.common.collect.BoundType.OPEN;
        if (r6 != r7) goto L_0x0085;
    L_0x007d:
        r3 = r11.getUpperEndpoint();
        r5 = r11.getUpperBoundType();
    L_0x0085:
        r7 = r0;
        r8 = r3;
        if (r4 == 0) goto L_0x00a5;
    L_0x0089:
        if (r7 == 0) goto L_0x00a5;
    L_0x008b:
        r11 = r10.comparator;
        r11 = r11.compare(r1, r8);
        if (r11 > 0) goto L_0x009d;
    L_0x0093:
        if (r11 != 0) goto L_0x00a5;
    L_0x0095:
        r11 = com.google.common.collect.BoundType.OPEN;
        if (r2 != r11) goto L_0x00a5;
    L_0x0099:
        r11 = com.google.common.collect.BoundType.OPEN;
        if (r5 != r11) goto L_0x00a5;
    L_0x009d:
        r11 = com.google.common.collect.BoundType.OPEN;
        r0 = com.google.common.collect.BoundType.CLOSED;
        r6 = r11;
        r9 = r0;
        r5 = r8;
        goto L_0x00a8;
    L_0x00a5:
        r6 = r2;
        r9 = r5;
        r5 = r1;
    L_0x00a8:
        r11 = new com.google.common.collect.GeneralRange;
        r3 = r10.comparator;
        r2 = r11;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.intersect(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.comparator);
        stringBuilder.append(":");
        stringBuilder.append(this.lowerBoundType == BoundType.CLOSED ? '[' : '(');
        stringBuilder.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        stringBuilder.append(',');
        stringBuilder.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        stringBuilder.append(this.upperBoundType == BoundType.CLOSED ? ']' : ')');
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final boolean tooHigh(T t) {
        if (!hasUpperBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, getUpperEndpoint());
        int i = 1;
        int i2 = compare > 0 ? 1 : 0;
        compare = compare == 0 ? 1 : 0;
        if (getUpperBoundType() != BoundType.OPEN) {
            i = 0;
        }
        return (compare & i) | i2;
    }

    /* Access modifiers changed, original: final */
    public final boolean tooLow(T t) {
        if (!hasLowerBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, getLowerEndpoint());
        int i = 1;
        int i2 = compare < 0 ? 1 : 0;
        compare = compare == 0 ? 1 : 0;
        if (getLowerBoundType() != BoundType.OPEN) {
            i = 0;
        }
        return (compare & i) | i2;
    }
}
