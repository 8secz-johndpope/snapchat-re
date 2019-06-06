package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection.Builder;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private transient Set<Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        public final boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        /* Access modifiers changed, original: final */
        public final V forEntry(int i) {
            return HashBiMap.this.values[i];
        }

        public final boolean remove(Object obj) {
            int smearedHash = Hashing.smearedHash(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, smearedHash);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Entry<V, K>> inverseEntrySet;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        public void clear() {
            this.forward.clear();
        }

        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        public Set<Entry<V, K>> entrySet() {
            Set set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        public K get(Object obj) {
            return this.forward.getInverse(obj);
        }

        public BiMap<K, V> inverse() {
            return this.forward;
        }

        public Set<V> keySet() {
            return this.forward.values();
        }

        public K put(V v, K k) {
            return this.forward.putInverse(v, k, false);
        }

        public K remove(Object obj) {
            return this.forward.removeInverse(obj);
        }

        public int size() {
            return this.forward.size;
        }

        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        public void clear() {
            this.biMap.clear();
        }

        public abstract T forEntry(int i);

        public Iterator<T> iterator() {
            return new Iterator<T>() {
                private int expectedModCount = View.this.biMap.modCount;
                private int index = View.this.biMap.firstInInsertionOrder;
                private int indexToRemove = -1;
                private int remaining = View.this.biMap.size;

                private void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                public T next() {
                    if (hasNext()) {
                        Object forEntry = View.this.forEntry(this.index);
                        this.indexToRemove = this.index;
                        this.index = View.this.biMap.nextInInsertionOrder[this.index];
                        this.remaining--;
                        return forEntry;
                    }
                    throw new NoSuchElementException();
                }

                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    if (this.index == View.this.biMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = View.this.biMap.modCount;
                }
            };
        }

        public int size() {
            return this.biMap.size;
        }
    }

    final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;
        final K key;

        EntryForKey(int i) {
            this.key = HashBiMap.this.keys[i];
            this.index = i;
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            updateIndex();
            return this.index == -1 ? null : HashBiMap.this.values[this.index];
        }

        public final V setValue(V v) {
            updateIndex();
            if (this.index == -1) {
                return HashBiMap.this.put(this.key, v);
            }
            Object obj = HashBiMap.this.values[this.index];
            if (Objects.equal(obj, v)) {
                return v;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v, false);
            return obj;
        }

        /* Access modifiers changed, original: final */
        public final void updateIndex() {
            int i = this.index;
            if (i == -1 || i > HashBiMap.this.size || !Objects.equal(HashBiMap.this.keys[this.index], this.key)) {
                this.index = HashBiMap.this.findEntryByKey(this.key);
            }
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;
        final V value;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i) {
            this.biMap = hashBiMap;
            this.value = hashBiMap.values[i];
            this.index = i;
        }

        private void updateIndex() {
            int i = this.index;
            if (i == -1 || i > this.biMap.size || !Objects.equal(this.value, this.biMap.values[this.index])) {
                this.index = this.biMap.findEntryByValue(this.value);
            }
        }

        public final V getKey() {
            return this.value;
        }

        public final K getValue() {
            updateIndex();
            return this.index == -1 ? null : this.biMap.keys[this.index];
        }

        public final K setValue(K k) {
            updateIndex();
            if (this.index == -1) {
                return this.biMap.putInverse(this.value, k, false);
            }
            Object obj = this.biMap.keys[this.index];
            if (Objects.equal(obj, k)) {
                return k;
            }
            this.biMap.replaceKeyInEntry(this.index, k, false);
            return obj;
        }
    }

    final class EntrySet extends View<K, V, Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                obj = entry.getValue();
                int findEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (findEntryByKey != -1 && Objects.equal(obj, HashBiMap.this.values[findEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: final */
        public final Entry<K, V> forEntry(int i) {
            return new EntryForKey(i);
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                obj = entry.getValue();
                int smearedHash = Hashing.smearedHash(key);
                int findEntryByKey = HashBiMap.this.findEntryByKey(key, smearedHash);
                if (findEntryByKey != -1 && Objects.equal(obj, HashBiMap.this.values[findEntryByKey])) {
                    HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
                    return true;
                }
            }
            return false;
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        public boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                obj = entry.getValue();
                int findEntryByValue = this.biMap.findEntryByValue(key);
                if (findEntryByValue != -1 && Objects.equal(this.biMap.keys[findEntryByValue], obj)) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public Entry<V, K> forEntry(int i) {
            return new EntryForValue(this.biMap, i);
        }

        public boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                obj = entry.getValue();
                int smearedHash = Hashing.smearedHash(key);
                int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
                if (findEntryByValue != -1 && Objects.equal(this.biMap.keys[findEntryByValue], obj)) {
                    this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
                    return true;
                }
            }
            return false;
        }
    }

    final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        public final boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        /* Access modifiers changed, original: final */
        public final K forEntry(int i) {
            return HashBiMap.this.keys[i];
        }

        public final boolean remove(Object obj) {
            int smearedHash = Hashing.smearedHash(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, smearedHash);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }
    }

    private HashBiMap(int i) {
        init(i);
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap(i);
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x004f in {2, 3, 7, 13, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void deleteFromTableKToV(int r6, int r7) {
        /*
        r5 = this;
        r0 = -1;
        if (r6 == r0) goto L_0x0005;
        r1 = 1;
        goto L_0x0006;
        r1 = 0;
        com.google.common.base.Preconditions.checkArgument(r1);
        r7 = r5.bucket(r7);
        r1 = r5.hashTableKToV;
        r2 = r1[r7];
        if (r2 != r6) goto L_0x001c;
        r2 = r5.nextInBucketKToV;
        r3 = r2[r6];
        r1[r7] = r3;
        r2[r6] = r0;
        return;
        r7 = r1[r7];
        r1 = r5.nextInBucketKToV;
        r1 = r1[r7];
        r4 = r1;
        r1 = r7;
        r7 = r4;
        if (r7 == r0) goto L_0x0037;
        if (r7 != r6) goto L_0x0032;
        r7 = r5.nextInBucketKToV;
        r2 = r7[r6];
        r7[r1] = r2;
        r7[r6] = r0;
        return;
        r1 = r5.nextInBucketKToV;
        r1 = r1[r7];
        goto L_0x0022;
        r7 = new java.lang.AssertionError;
        r0 = new java.lang.StringBuilder;
        r1 = "Expected to find entry with key ";
        r0.<init>(r1);
        r1 = r5.keys;
        r6 = r1[r6];
        r0.append(r6);
        r6 = r0.toString();
        r7.<init>(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.HashBiMap.deleteFromTableKToV(int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x004f in {2, 3, 7, 13, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void deleteFromTableVToK(int r6, int r7) {
        /*
        r5 = this;
        r0 = -1;
        if (r6 == r0) goto L_0x0005;
        r1 = 1;
        goto L_0x0006;
        r1 = 0;
        com.google.common.base.Preconditions.checkArgument(r1);
        r7 = r5.bucket(r7);
        r1 = r5.hashTableVToK;
        r2 = r1[r7];
        if (r2 != r6) goto L_0x001c;
        r2 = r5.nextInBucketVToK;
        r3 = r2[r6];
        r1[r7] = r3;
        r2[r6] = r0;
        return;
        r7 = r1[r7];
        r1 = r5.nextInBucketVToK;
        r1 = r1[r7];
        r4 = r1;
        r1 = r7;
        r7 = r4;
        if (r7 == r0) goto L_0x0037;
        if (r7 != r6) goto L_0x0032;
        r7 = r5.nextInBucketVToK;
        r2 = r7[r6];
        r7[r1] = r2;
        r7[r6] = r0;
        return;
        r1 = r5.nextInBucketVToK;
        r1 = r1[r7];
        goto L_0x0022;
        r7 = new java.lang.AssertionError;
        r0 = new java.lang.StringBuilder;
        r1 = "Expected to find entry with value ";
        r0.<init>(r1);
        r1 = r5.values;
        r6 = r1[r6];
        r0.append(r6);
        r6 = r0.toString();
        r7.<init>(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.HashBiMap.deleteFromTableVToK(int, int):void");
    }

    private void ensureCapacity(int i) {
        int expandedCapacity;
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            expandedCapacity = Builder.expandedCapacity(iArr.length, i);
            this.keys = Arrays.copyOf(this.keys, expandedCapacity);
            this.values = Arrays.copyOf(this.values, expandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, expandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, expandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, expandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, expandedCapacity);
        }
        if (this.hashTableKToV.length < i) {
            i = Hashing.closedTableSize(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(i);
            this.hashTableVToK = createFilledWithAbsent(i);
            for (i = 0; i < this.size; i++) {
                expandedCapacity = bucket(Hashing.smearedHash(this.keys[i]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i] = iArr3[expandedCapacity];
                iArr3[expandedCapacity] = i;
                expandedCapacity = bucket(Hashing.smearedHash(this.values[i]));
                iArr2 = this.nextInBucketVToK;
                iArr3 = this.hashTableVToK;
                iArr2[i] = iArr3[expandedCapacity];
                iArr3[expandedCapacity] = i;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        iArr = Arrays.copyOf(iArr, i);
        Arrays.fill(iArr, length, i, -1);
        return iArr;
    }

    private void insertIntoTableKToV(int i, int i2) {
        Preconditions.checkArgument(i != -1);
        i2 = bucket(i2);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i] = iArr2[i2];
        iArr2[i2] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        Preconditions.checkArgument(i != -1);
        i2 = bucket(i2);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i] = iArr2[i2];
        iArr2[i2] = i;
    }

    private void moveEntryToIndex(int i, int i2) {
        if (i != i2) {
            int i3;
            int i4 = this.prevInInsertionOrder[i];
            int i5 = this.nextInInsertionOrder[i];
            setSucceeds(i4, i2);
            setSucceeds(i2, i5);
            Object[] objArr = this.keys;
            Object obj = objArr[i];
            Object[] objArr2 = this.values;
            Object obj2 = objArr2[i];
            objArr[i2] = obj;
            objArr2[i2] = obj2;
            i4 = bucket(Hashing.smearedHash(obj));
            int[] iArr = this.hashTableKToV;
            if (iArr[i4] == i) {
                iArr[i4] = i2;
            } else {
                i4 = iArr[i4];
                i5 = this.nextInBucketKToV[i4];
                while (true) {
                    i3 = i5;
                    i5 = i4;
                    i4 = i3;
                    if (i4 == i) {
                        break;
                    }
                    i5 = this.nextInBucketKToV[i4];
                }
                this.nextInBucketKToV[i5] = i2;
            }
            int[] iArr2 = this.nextInBucketKToV;
            iArr2[i2] = iArr2[i];
            iArr2[i] = -1;
            i4 = bucket(Hashing.smearedHash(obj2));
            int[] iArr3 = this.hashTableVToK;
            if (iArr3[i4] == i) {
                iArr3[i4] = i2;
            } else {
                i4 = iArr3[i4];
                int i6 = this.nextInBucketVToK[i4];
                while (true) {
                    i3 = i6;
                    i6 = i4;
                    i4 = i3;
                    if (i4 == i) {
                        break;
                    }
                    i6 = this.nextInBucketVToK[i4];
                }
                this.nextInBucketVToK[i6] = i2;
            }
            iArr2 = this.nextInBucketVToK;
            iArr2[i2] = iArr2[i];
            iArr2[i] = -1;
        }
    }

    private void removeEntry(int i, int i2, int i3) {
        Preconditions.checkArgument(i != -1);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        Object[] objArr = this.keys;
        i2 = this.size;
        objArr[i2 - 1] = null;
        this.values[i2 - 1] = null;
        this.size = i2 - 1;
        this.modCount++;
    }

    private void replaceKeyInEntry(int i, K k, boolean z) {
        int i2;
        int i3;
        Preconditions.checkArgument(i != -1);
        int smearedHash = Hashing.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash);
        int i4 = this.lastInInsertionOrder;
        if (findEntryByKey == -1) {
            i2 = i4;
            i3 = -2;
        } else if (z) {
            i2 = this.prevInInsertionOrder[findEntryByKey];
            i3 = this.nextInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            if (i == this.size) {
                i = findEntryByKey;
            }
        } else {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(k)));
        }
        if (i2 == i) {
            i2 = this.prevInInsertionOrder[i];
        } else if (i2 == this.size) {
            i2 = findEntryByKey;
        }
        if (i3 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (i3 != this.size) {
            findEntryByKey = i3;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, Hashing.smearedHash(this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, Hashing.smearedHash(k));
        setSucceeds(i2, i);
        setSucceeds(i, findEntryByKey);
    }

    private void replaceValueInEntry(int i, V v, boolean z) {
        Preconditions.checkArgument(i != -1);
        int smearedHash = Hashing.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, smearedHash);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(v)));
            }
        }
        deleteFromTableVToK(i, Hashing.smearedHash(this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, smearedHash);
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    public final void clear() {
        Arrays.fill(this.keys, 0, this.size, null);
        Arrays.fill(this.values, 0, this.size, null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    public final boolean containsKey(Object obj) {
        return findEntryByKey(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return findEntryByValue(obj) != -1;
    }

    public final Set<Entry<K, V>> entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    /* Access modifiers changed, original: final */
    public final int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        i = iArr[bucket(i)];
        while (i != -1) {
            if (Objects.equal(objArr[i], obj)) {
                return i;
            }
            i = iArr2[i];
        }
        return -1;
    }

    /* Access modifiers changed, original: final */
    public final int findEntryByKey(Object obj) {
        return findEntryByKey(obj, Hashing.smearedHash(obj));
    }

    /* Access modifiers changed, original: final */
    public final int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    /* Access modifiers changed, original: final */
    public final int findEntryByValue(Object obj) {
        return findEntryByValue(obj, Hashing.smearedHash(obj));
    }

    /* Access modifiers changed, original: final */
    public final int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    public final V get(Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        return findEntryByKey == -1 ? null : this.values[findEntryByKey];
    }

    /* Access modifiers changed, original: final */
    public final K getInverse(Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        return findEntryByValue == -1 ? null : this.keys[findEntryByValue];
    }

    /* Access modifiers changed, original: final */
    public final void init(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        int closedTableSize = Hashing.closedTableSize(i, 1.0d);
        this.size = 0;
        this.keys = new Object[i];
        this.values = new Object[i];
        this.hashTableKToV = createFilledWithAbsent(closedTableSize);
        this.hashTableVToK = createFilledWithAbsent(closedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    public final BiMap<V, K> inverse() {
        BiMap biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    public final Set<K> keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public final V put(K k, V v) {
        return put(k, v, false);
    }

    /* Access modifiers changed, original: final */
    public final V put(K k, V v, boolean z) {
        int smearedHash = Hashing.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash);
        if (findEntryByKey != -1) {
            Object obj = this.values[findEntryByKey];
            if (Objects.equal(obj, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return obj;
        }
        findEntryByKey = Hashing.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, findEntryByKey);
        if (!z) {
            Preconditions.checkArgument(findEntryByValue == -1, "Value already present: %s", (Object) v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, findEntryByKey);
        }
        ensureCapacity(this.size + 1);
        Object[] objArr = this.keys;
        int i = this.size;
        objArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, smearedHash);
        insertIntoTableVToK(this.size, findEntryByKey);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    /* Access modifiers changed, original: final */
    public final K putInverse(V v, K k, boolean z) {
        int smearedHash = Hashing.smearedHash(v);
        int findEntryByValue = findEntryByValue(v, smearedHash);
        if (findEntryByValue != -1) {
            Object obj = this.keys[findEntryByValue];
            if (Objects.equal(obj, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return obj;
        }
        findEntryByValue = this.lastInInsertionOrder;
        int smearedHash2 = Hashing.smearedHash(k);
        int findEntryByKey = findEntryByKey(k, smearedHash2);
        if (!z) {
            Preconditions.checkArgument(findEntryByKey == -1, "Key already present: %s", (Object) k);
        } else if (findEntryByKey != -1) {
            findEntryByValue = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        Object[] objArr = this.keys;
        int i = this.size;
        objArr[i] = k;
        this.values[i] = v;
        insertIntoTableKToV(i, smearedHash2);
        insertIntoTableVToK(this.size, smearedHash);
        int i2 = findEntryByValue == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[findEntryByValue];
        setSucceeds(findEntryByValue, this.size);
        setSucceeds(this.size, i2);
        this.size++;
        this.modCount++;
        return null;
    }

    public final V remove(Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int findEntryByKey = findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return v;
    }

    /* Access modifiers changed, original: final */
    public final void removeEntry(int i) {
        removeEntryKeyHashKnown(i, Hashing.smearedHash(this.keys[i]));
    }

    /* Access modifiers changed, original: final */
    public final void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, Hashing.smearedHash(this.values[i]));
    }

    /* Access modifiers changed, original: final */
    public final void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, Hashing.smearedHash(this.keys[i]), i2);
    }

    /* Access modifiers changed, original: final */
    public final K removeInverse(Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int findEntryByValue = findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return k;
    }

    public final int size() {
        return this.size;
    }

    public final Set<V> values() {
        Set set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }
}
