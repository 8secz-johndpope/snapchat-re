package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    final transient Object[] alternatingKeysAndValues;
    private final transient int[] hashTable;
    private final transient int size;

    static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        public final Object get(int i) {
            Preconditions.checkElementIndex(i, this.size);
            return this.alternatingKeysAndValues[(i * 2) + this.offset];
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.size;
        }
    }

    static class EntrySet<K, V> extends ImmutableSet<Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i;
            this.size = i2;
        }

        public boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                obj = entry.getValue();
                if (obj != null && obj.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        /* Access modifiers changed, original: 0000 */
        public ImmutableList<Entry<K, V>> createAsList() {
            return new ImmutableList<Entry<K, V>>() {
                public Entry<K, V> get(int i) {
                    Preconditions.checkElementIndex(i, EntrySet.this.size);
                    i *= 2;
                    return new SimpleImmutableEntry(EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i], EntrySet.this.alternatingKeysAndValues[i + (EntrySet.this.keyOffset ^ 1)]);
                }

                public boolean isPartialView() {
                    return true;
                }

                public int size() {
                    return EntrySet.this.size;
                }
            };
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isPartialView() {
            return true;
        }

        public UnmodifiableIterator<Entry<K, V>> iterator() {
            return asList().iterator();
        }

        public int size() {
            return this.size;
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        public final ImmutableList<K> asList() {
            return this.list;
        }

        public final boolean contains(Object obj) {
            return this.map.get(obj) != null;
        }

        /* Access modifiers changed, original: final */
        public final int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        /* Access modifiers changed, original: final */
        public final boolean isPartialView() {
            return true;
        }

        public final UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        public final int size() {
            return this.map.size();
        }
    }

    private RegularImmutableMap(int[] iArr, Object[] objArr, int i) {
        this.hashTable = iArr;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr) {
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            CollectPreconditions.checkEntryNotNull(objArr[0], objArr[1]);
            return new RegularImmutableMap(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        return new RegularImmutableMap(createHashTable(objArr, i, ImmutableSet.chooseTableSize(i), 0), objArr, i);
    }

    /* JADX WARNING: Missing block: B:9:0x0034, code skipped:
            r12[r7] = r5;
            r3 = r3 + 1;
     */
    static int[] createHashTable(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
        r0 = 1;
        if (r11 != r0) goto L_0x000e;
    L_0x0003:
        r11 = r10[r13];
        r12 = r13 ^ 1;
        r10 = r10[r12];
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(r11, r10);
        r10 = 0;
        return r10;
    L_0x000e:
        r1 = r12 + -1;
        r12 = new int[r12];
        r2 = -1;
        java.util.Arrays.fill(r12, r2);
        r3 = 0;
    L_0x0017:
        if (r3 >= r11) goto L_0x0074;
    L_0x0019:
        r4 = r3 * 2;
        r5 = r4 + r13;
        r6 = r10[r5];
        r7 = r13 ^ 1;
        r4 = r4 + r7;
        r4 = r10[r4];
        com.google.common.collect.CollectPreconditions.checkEntryNotNull(r6, r4);
        r7 = r6.hashCode();
        r7 = com.google.common.collect.Hashing.smear(r7);
    L_0x002f:
        r7 = r7 & r1;
        r8 = r12[r7];
        if (r8 != r2) goto L_0x0039;
    L_0x0034:
        r12[r7] = r5;
        r3 = r3 + 1;
        goto L_0x0017;
    L_0x0039:
        r9 = r10[r8];
        r9 = r9.equals(r6);
        if (r9 != 0) goto L_0x0044;
    L_0x0041:
        r7 = r7 + 1;
        goto L_0x002f;
    L_0x0044:
        r11 = new java.lang.IllegalArgumentException;
        r12 = new java.lang.StringBuilder;
        r13 = "Multiple entries with same key: ";
        r12.<init>(r13);
        r12.append(r6);
        r13 = "=";
        r12.append(r13);
        r12.append(r4);
        r1 = " and ";
        r12.append(r1);
        r1 = r10[r8];
        r12.append(r1);
        r12.append(r13);
        r13 = r8 ^ 1;
        r10 = r10[r13];
        r12.append(r10);
        r10 = r12.toString();
        r11.<init>(r10);
        throw r11;
    L_0x0074:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.createHashTable(java.lang.Object[], int, int, int):int[]");
    }

    static Object get(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            return objArr[i2].equals(obj) ? objArr[i2 ^ 1] : null;
        } else {
            if (iArr == null) {
                return null;
            }
            i = iArr.length - 1;
            i2 = Hashing.smear(obj.hashCode());
            while (true) {
                i2 &= i;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return objArr[i3 ^ 1];
                }
                i2++;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final ImmutableSet<Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    /* Access modifiers changed, original: final */
    public final ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    /* Access modifiers changed, original: final */
    public final ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    public final V get(Object obj) {
        return get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
    }

    /* Access modifiers changed, original: final */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.size;
    }
}
