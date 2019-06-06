package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Joiner {
    private final String separator;

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        /* synthetic */ MapJoiner(Joiner joiner, String str, AnonymousClass1 anonymousClass1) {
            this(joiner, str);
        }

        public final <A extends Appendable> A appendTo(A a, Iterator<? extends Entry<?, ?>> it) {
            Preconditions.checkNotNull(a);
            if (it.hasNext()) {
                while (true) {
                    Entry entry = (Entry) it.next();
                    a.append(this.joiner.toString(entry.getKey()));
                    a.append(this.keyValueSeparator);
                    a.append(this.joiner.toString(entry.getValue()));
                    if (!it.hasNext()) {
                        break;
                    }
                    a.append(this.joiner.separator);
                }
            }
            return a;
        }

        public final StringBuilder appendTo(StringBuilder stringBuilder, Iterable<? extends Entry<?, ?>> iterable) {
            return appendTo(stringBuilder, iterable.iterator());
        }

        public final StringBuilder appendTo(StringBuilder stringBuilder, Iterator<? extends Entry<?, ?>> it) {
            try {
                appendTo((Appendable) stringBuilder, (Iterator) it);
                return stringBuilder;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public final String join(Iterable<? extends Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public final String join(Iterator<? extends Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), (Iterator) it).toString();
        }

        public final String join(Map<?, ?> map) {
            return join(map.entrySet());
        }
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    /* synthetic */ Joiner(Joiner joiner, AnonymousClass1 anonymousClass1) {
        this(joiner);
    }

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    private static Iterable<Object> iterable(final Object obj, final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() {
            public final Object get(int i) {
                return i != 0 ? i != 1 ? objArr[i - 2] : obj2 : obj;
            }

            public final int size() {
                return objArr.length + 2;
            }
        };
    }

    public static Joiner on(char c) {
        return new Joiner(String.valueOf(c));
    }

    public static Joiner on(String str) {
        return new Joiner(str);
    }

    public <A extends Appendable> A appendTo(A a, Iterator<?> it) {
        Preconditions.checkNotNull(a);
        if (it.hasNext()) {
            while (true) {
                a.append(toString(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a.append(this.separator);
            }
        }
        return a;
    }

    public final StringBuilder appendTo(StringBuilder stringBuilder, Iterable<?> iterable) {
        return appendTo(stringBuilder, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder stringBuilder, Iterator<?> it) {
        try {
            appendTo((Appendable) stringBuilder, (Iterator) it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    public final String join(Iterator<?> it) {
        return appendTo(new StringBuilder(), (Iterator) it).toString();
    }

    public Joiner skipNulls() {
        return new Joiner(this) {
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            public <A extends java.lang.Appendable> A appendTo(A r3, java.util.Iterator<?> r4) {
                /*
                r2 = this;
                r0 = "appendable";
                com.google.common.base.Preconditions.checkNotNull(r3, r0);
                r0 = "parts";
                com.google.common.base.Preconditions.checkNotNull(r4, r0);
            L_0x000a:
                r0 = r4.hasNext();
                if (r0 == 0) goto L_0x001f;
            L_0x0010:
                r0 = r4.next();
                if (r0 == 0) goto L_0x000a;
            L_0x0016:
                r1 = com.google.common.base.Joiner.this;
                r0 = r1.toString(r0);
                r3.append(r0);
            L_0x001f:
                r0 = r4.hasNext();
                if (r0 == 0) goto L_0x0035;
            L_0x0025:
                r0 = r4.next();
                if (r0 == 0) goto L_0x001f;
            L_0x002b:
                r1 = com.google.common.base.Joiner.this;
                r1 = r1.separator;
                r3.append(r1);
                goto L_0x0016;
            L_0x0035:
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Joiner$AnonymousClass2.appendTo(java.lang.Appendable, java.util.Iterator):java.lang.Appendable");
            }

            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public CharSequence toString(Object obj) {
        Preconditions.checkNotNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this) {
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            /* Access modifiers changed, original: 0000 */
            public CharSequence toString(Object obj) {
                return obj == null ? str : Joiner.this.toString(obj);
            }

            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(this, str, null);
    }
}
