package com.google.common.base;

import defpackage.ppy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = charSequence;
        }

        /* Access modifiers changed, original: protected */
        /* JADX WARNING: Missing block: B:12:0x0031, code skipped:
            if (r0 >= r1) goto L_0x0044;
     */
        /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            if (r6.trimmer.matches(r6.toSplit.charAt(r0)) == false) goto L_0x0044;
     */
        /* JADX WARNING: Missing block: B:15:0x0041, code skipped:
            r0 = r0 + 1;
     */
        /* JADX WARNING: Missing block: B:16:0x0044, code skipped:
            if (r1 <= r0) goto L_0x0059;
     */
        /* JADX WARNING: Missing block: B:18:0x0054, code skipped:
            if (r6.trimmer.matches(r6.toSplit.charAt(r1 - 1)) == false) goto L_0x0059;
     */
        /* JADX WARNING: Missing block: B:19:0x0056, code skipped:
            r1 = r1 - 1;
     */
        /* JADX WARNING: Missing block: B:21:0x005b, code skipped:
            if (r6.omitEmptyStrings == false) goto L_0x0060;
     */
        /* JADX WARNING: Missing block: B:22:0x005d, code skipped:
            if (r0 != r1) goto L_0x0060;
     */
        public java.lang.String computeNext() {
            /*
            r6 = this;
        L_0x0000:
            r0 = r6.offset;
        L_0x0002:
            r1 = r6.offset;
            r2 = -1;
            if (r1 == r2) goto L_0x0090;
        L_0x0007:
            r1 = r6.separatorStart(r1);
            if (r1 != r2) goto L_0x0016;
        L_0x000d:
            r1 = r6.toSplit;
            r1 = r1.length();
            r6.offset = r2;
            goto L_0x001c;
        L_0x0016:
            r3 = r6.separatorEnd(r1);
            r6.offset = r3;
        L_0x001c:
            r3 = r6.offset;
            if (r3 != r0) goto L_0x0031;
        L_0x0020:
            r3 = r3 + 1;
            r6.offset = r3;
            r1 = r6.offset;
            r3 = r6.toSplit;
            r3 = r3.length();
            if (r1 <= r3) goto L_0x0002;
        L_0x002e:
            r6.offset = r2;
            goto L_0x0002;
        L_0x0031:
            if (r0 >= r1) goto L_0x0044;
        L_0x0033:
            r3 = r6.trimmer;
            r4 = r6.toSplit;
            r4 = r4.charAt(r0);
            r3 = r3.matches(r4);
            if (r3 == 0) goto L_0x0044;
        L_0x0041:
            r0 = r0 + 1;
            goto L_0x0031;
        L_0x0044:
            if (r1 <= r0) goto L_0x0059;
        L_0x0046:
            r3 = r6.trimmer;
            r4 = r6.toSplit;
            r5 = r1 + -1;
            r4 = r4.charAt(r5);
            r3 = r3.matches(r4);
            if (r3 == 0) goto L_0x0059;
        L_0x0056:
            r1 = r1 + -1;
            goto L_0x0044;
        L_0x0059:
            r3 = r6.omitEmptyStrings;
            if (r3 == 0) goto L_0x0060;
        L_0x005d:
            if (r0 != r1) goto L_0x0060;
        L_0x005f:
            goto L_0x0000;
        L_0x0060:
            r3 = r6.limit;
            r4 = 1;
            if (r3 != r4) goto L_0x0082;
        L_0x0065:
            r1 = r6.toSplit;
            r1 = r1.length();
            r6.offset = r2;
        L_0x006d:
            if (r1 <= r0) goto L_0x0085;
        L_0x006f:
            r2 = r6.trimmer;
            r3 = r6.toSplit;
            r4 = r1 + -1;
            r3 = r3.charAt(r4);
            r2 = r2.matches(r3);
            if (r2 == 0) goto L_0x0085;
        L_0x007f:
            r1 = r1 + -1;
            goto L_0x006d;
        L_0x0082:
            r3 = r3 - r4;
            r6.limit = r3;
        L_0x0085:
            r2 = r6.toSplit;
            r0 = r2.subSequence(r0, r1);
            r0 = r0.toString();
            return r0;
        L_0x0090:
            r0 = r6.endOfData();
            r0 = (java.lang.String) r0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter$SplittingIterator.computeNext():java.lang.String");
        }

        public abstract int separatorEnd(int i);

        public abstract int separatorStart(int i);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = strategy;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static Splitter fixedLength(final int i) {
        Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    public int separatorEnd(int i) {
                        return i;
                    }

                    public int separatorStart(int i) {
                        i += i;
                        return i < this.toSplit.length() ? i : -1;
                    }
                };
            }
        });
    }

    public static Splitter on(char c) {
        return on(CharMatcher.is(c));
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* Access modifiers changed, original: 0000 */
                    public int separatorEnd(int i) {
                        return i + 1;
                    }

                    /* Access modifiers changed, original: 0000 */
                    public int separatorStart(int i) {
                        return charMatcher.indexIn(this.toSplit, i);
                    }
                };
            }
        });
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? on(str.charAt(0)) : new Splitter(new Strategy() {
            public final SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    public int separatorEnd(int i) {
                        return i + str.length();
                    }

                    public int separatorStart(int i) {
                        int length = str.length();
                        int length2 = this.toSplit.length() - length;
                        while (i <= length2) {
                            int i2 = 0;
                            while (i2 < length) {
                                if (this.toSplit.charAt(i2 + i) == str.charAt(i2)) {
                                    i2++;
                                } else {
                                    i++;
                                }
                            }
                            return i;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public final Splitter limit(int i) {
        Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public final Iterable<String> split(final CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return Splitter.this.splittingIterator(charSequence);
            }

            public String toString() {
                StringBuilder appendTo = Joiner.on(ppy.d).appendTo(new StringBuilder("["), (Iterable) this);
                appendTo.append(']');
                return appendTo.toString();
            }
        };
    }

    public final List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public final Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }
}
