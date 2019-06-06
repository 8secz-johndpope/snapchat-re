package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> comparator;
    private EntrySet entrySet;
    final Node<K, V> header;
    private KeySet keySet;
    int modCount;
    int size;
    Node<K, V>[] table;
    int threshold;

    static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private Node<K, V> stack;

        AvlBuilder() {
        }

        /* Access modifiers changed, original: final */
        public final void add(Node<K, V> node) {
            int i;
            node.right = null;
            node.parent = null;
            node.left = null;
            node.height = 1;
            int i2 = this.leavesToSkip;
            if (i2 > 0) {
                i = this.size;
                if ((i & 1) == 0) {
                    this.size = i + 1;
                    this.leavesToSkip = i2 - 1;
                    this.leavesSkipped++;
                }
            }
            node.parent = this.stack;
            this.stack = node;
            this.size++;
            int i3 = this.leavesToSkip;
            if (i3 > 0) {
                i2 = this.size;
                if ((i2 & 1) == 0) {
                    this.size = i2 + 1;
                    this.leavesToSkip = i3 - 1;
                    this.leavesSkipped++;
                }
            }
            i3 = 4;
            while (true) {
                i = i3 - 1;
                if ((this.size & i) == i) {
                    i2 = this.leavesSkipped;
                    Node node2;
                    Node node3;
                    if (i2 == 0) {
                        node2 = this.stack;
                        Node node4 = node2.parent;
                        node3 = node4.parent;
                        node4.parent = node3.parent;
                        this.stack = node4;
                        node4.left = node3;
                        node4.right = node2;
                        node4.height = node2.height + 1;
                        node3.parent = node4;
                        node2.parent = node4;
                    } else {
                        if (i2 == 1) {
                            node2 = this.stack;
                            node3 = node2.parent;
                            this.stack = node3;
                            node3.right = node2;
                            node3.height = node2.height + 1;
                            node2.parent = node3;
                        } else if (i2 != 2) {
                        }
                        this.leavesSkipped = 0;
                    }
                    i3 <<= 1;
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void reset(int i) {
            this.leavesToSkip = ((Integer.highestOneBit(i) << 1) - 1) - i;
            this.size = 0;
            this.leavesSkipped = 0;
            this.stack = null;
        }

        /* Access modifiers changed, original: final */
        public final Node<K, V> root() {
            Node node = this.stack;
            if (node.parent == null) {
                return node;
            }
            throw new IllegalStateException();
        }
    }

    static class AvlIterator<K, V> {
        private Node<K, V> stackTop;

        AvlIterator() {
        }

        public Node<K, V> next() {
            Node node = this.stackTop;
            if (node == null) {
                return null;
            }
            Node node2 = node.parent;
            node.parent = null;
            Node node3 = node.right;
            while (true) {
                Node node4 = node2;
                node2 = node3;
                node3 = node4;
                if (node2 != null) {
                    node2.parent = node3;
                    node3 = node2.left;
                } else {
                    this.stackTop = node3;
                    return node;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void reset(Node<K, V> node) {
            Node node2 = null;
            while (true) {
                Node node3 = node2;
                Node<K, V> node22 = node;
                Node node4 = node3;
                if (node22 != null) {
                    node22.parent = node4;
                    node = node22.left;
                } else {
                    this.stackTop = node4;
                    return;
                }
            }
        }
    }

    final class EntrySet extends AbstractSet<Entry<K, V>> {
        EntrySet() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Entry) && LinkedHashTreeMap.this.findByEntry((Entry) obj) != null;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new LinkedTreeMapIterator<Entry<K, V>>() {
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                public Entry<K, V> next() {
                    return nextNode();
                }
            };
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Node findByEntry = LinkedHashTreeMap.this.findByEntry((Entry) obj);
            if (findByEntry == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new LinkedTreeMapIterator<K>() {
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                public K next() {
                    return nextNode().key;
                }
            };
        }

        public final boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount = LinkedHashTreeMap.this.modCount;
        Node<K, V> lastReturned = null;
        Node<K, V> next = LinkedHashTreeMap.this.header.next;

        LinkedTreeMapIterator() {
        }

        public final boolean hasNext() {
            return this.next != LinkedHashTreeMap.this.header;
        }

        /* Access modifiers changed, original: final */
        public final Node<K, V> nextNode() {
            Node node = this.next;
            if (node == LinkedHashTreeMap.this.header) {
                throw new NoSuchElementException();
            } else if (LinkedHashTreeMap.this.modCount == this.expectedModCount) {
                this.next = node.next;
                this.lastReturned = node;
                return node;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final void remove() {
            Node node = this.lastReturned;
            if (node != null) {
                LinkedHashTreeMap.this.removeInternal(node, true);
                this.lastReturned = null;
                this.expectedModCount = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class Node<K, V> implements Entry<K, V> {
        final int hash;
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;

        Node() {
            this.key = null;
            this.hash = -1;
            this.prev = this;
            this.next = this;
        }

        Node(Node<K, V> node, K k, int i, Node<K, V> node2, Node<K, V> node3) {
            this.parent = node;
            this.key = k;
            this.hash = i;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object obj2 = this.key;
                if (obj2 != null ? !obj2.equals(entry.getKey()) : entry.getKey() != null) {
                    obj2 = this.value;
                    if (obj2 != null ? !obj2.equals(entry.getValue()) : entry.getValue() != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.left; node2 != null; node2 = node2.left) {
                node = node2;
            }
            return node;
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            return this.value;
        }

        public final int hashCode() {
            Object obj = this.key;
            int i = 0;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.value;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode ^ i;
        }

        public final Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.right; node2 != null; node2 = node2.right) {
                node = node2;
            }
            return node;
        }

        public final V setValue(V v) {
            Object obj = this.value;
            this.value = v;
            return obj;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append("=");
            stringBuilder.append(this.value);
            return stringBuilder.toString();
        }
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        Comparator comparator2;
        this.size = 0;
        this.modCount = 0;
        if (comparator2 == null) {
            comparator2 = NATURAL_ORDER;
        }
        this.comparator = comparator2;
        this.header = new Node();
        this.table = new Node[16];
        Node[] nodeArr = this.table;
        this.threshold = (nodeArr.length / 2) + (nodeArr.length / 4);
    }

    private void doubleCapacity() {
        this.table = doubleCapacity(this.table);
        Node[] nodeArr = this.table;
        this.threshold = (nodeArr.length / 2) + (nodeArr.length / 4);
    }

    static <K, V> Node<K, V>[] doubleCapacity(Node<K, V>[] nodeArr) {
        int length = nodeArr.length;
        Node[] nodeArr2 = new Node[(length << 1)];
        AvlIterator avlIterator = new AvlIterator();
        AvlBuilder avlBuilder = new AvlBuilder();
        AvlBuilder avlBuilder2 = new AvlBuilder();
        for (int i = 0; i < length; i++) {
            Node node = nodeArr[i];
            if (node != null) {
                avlIterator.reset(node);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Node next = avlIterator.next();
                    if (next == null) {
                        break;
                    } else if ((next.hash & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                avlBuilder.reset(i2);
                avlBuilder2.reset(i3);
                avlIterator.reset(node);
                while (true) {
                    node = avlIterator.next();
                    if (node == null) {
                        break;
                    } else if ((node.hash & length) == 0) {
                        avlBuilder.add(node);
                    } else {
                        avlBuilder2.add(node);
                    }
                }
                node = null;
                nodeArr2[i] = i2 > 0 ? avlBuilder.root() : null;
                i2 = i + length;
                if (i3 > 0) {
                    node = avlBuilder2.root();
                }
                nodeArr2[i2] = node;
            }
        }
        return nodeArr2;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(Node<K, V> node, boolean z) {
        Node node2;
        while (node2 != null) {
            Node node3 = node2.left;
            Node node4 = node2.right;
            int i = 0;
            int i2 = node3 != null ? node3.height : 0;
            int i3 = node4 != null ? node4.height : 0;
            int i4 = i2 - i3;
            Node node5;
            if (i4 != -2) {
                if (i4 != 2) {
                    if (i4 != 0) {
                        node2.height = Math.max(i2, i3) + 1;
                        if (!z) {
                            break;
                        }
                    } else {
                        node2.height = i2 + 1;
                        if (z) {
                            return;
                        }
                    }
                } else {
                    node4 = node3.left;
                    node5 = node3.right;
                    i2 = node5 != null ? node5.height : 0;
                    if (node4 != null) {
                        i = node4.height;
                    }
                    i -= i2;
                    if (i != 1 && (i != 0 || z)) {
                        rotateLeft(node3);
                    }
                    rotateRight(node2);
                    if (z) {
                        break;
                    }
                }
            } else {
                node3 = node4.left;
                node5 = node4.right;
                i2 = node5 != null ? node5.height : 0;
                if (node3 != null) {
                    i = node3.height;
                }
                i -= i2;
                if (i != -1 && (i != 0 || z)) {
                    rotateRight(node4);
                }
                rotateLeft(node2);
                if (z) {
                    break;
                }
            }
            node2 = node2.parent;
        }
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
        Node node3 = node.parent;
        node.parent = null;
        if (node2 != null) {
            node2.parent = node3;
        }
        if (node3 == null) {
            int i = node.hash;
            Node[] nodeArr = this.table;
            nodeArr[i & (nodeArr.length - 1)] = node2;
        } else if (node3.left == node) {
            node3.left = node2;
        } else {
            node3.right = node2;
        }
    }

    private void rotateLeft(Node<K, V> node) {
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node3.left;
        Node node5 = node3.right;
        node.right = node4;
        if (node4 != null) {
            node4.parent = node;
        }
        replaceInParent(node, node3);
        node3.left = node;
        node.parent = node3;
        int i = 0;
        node.height = Math.max(node2 != null ? node2.height : 0, node4 != null ? node4.height : 0) + 1;
        int i2 = node.height;
        if (node5 != null) {
            i = node5.height;
        }
        node3.height = Math.max(i2, i) + 1;
    }

    private void rotateRight(Node<K, V> node) {
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node2.left;
        Node node5 = node2.right;
        node.left = node5;
        if (node5 != null) {
            node5.parent = node;
        }
        replaceInParent(node, node2);
        node2.right = node;
        node.parent = node2;
        int i = 0;
        node.height = Math.max(node3 != null ? node3.height : 0, node5 != null ? node5.height : 0) + 1;
        int i2 = node.height;
        if (node4 != null) {
            i = node4.height;
        }
        node2.height = Math.max(i2, i) + 1;
    }

    private static int secondaryHash(int i) {
        i ^= (i >>> 20) ^ (i >>> 12);
        return (i >>> 4) ^ ((i >>> 7) ^ i);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final void clear() {
        Arrays.fill(this.table, null);
        this.size = 0;
        this.modCount++;
        Node node = this.header;
        Node node2 = node.next;
        while (node2 != node) {
            Node node3 = node2.next;
            node2.prev = null;
            node2.next = null;
            node2 = node3;
        }
        node.prev = node;
        node.next = node;
    }

    public final boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public final Set<Entry<K, V>> entrySet() {
        EntrySet entrySet = this.entrySet;
        if (entrySet != null) {
            return entrySet;
        }
        entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    /* Access modifiers changed, original: final */
    public final Node<K, V> find(K k, boolean z) {
        Node node;
        int i;
        Comparator comparator = this.comparator;
        Node[] nodeArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (nodeArr.length - 1) & secondaryHash;
        Node node2 = nodeArr[length];
        if (node2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(node2.key) : comparator.compare(k, node2.key);
                if (compareTo != 0) {
                    Node node3 = compareTo < 0 ? node2.left : node2.right;
                    if (node3 == null) {
                        node = node2;
                        i = compareTo;
                        break;
                    }
                    node2 = node3;
                } else {
                    return node2;
                }
            }
        }
        node = node2;
        i = 0;
        if (!z) {
            return null;
        }
        Node node4 = this.header;
        Node<K, V> node5;
        if (node != null) {
            node5 = new Node(node, k, secondaryHash, node4, node4.prev);
            if (i < 0) {
                node.left = node5;
            } else {
                node.right = node5;
            }
            rebalance(node, true);
        } else if (comparator != NATURAL_ORDER || (k instanceof Comparable)) {
            node5 = new Node(node, k, secondaryHash, node4, node4.prev);
            nodeArr[length] = node5;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(k.getClass().getName());
            stringBuilder.append(" is not Comparable");
            throw new ClassCastException(stringBuilder.toString());
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return r14;
    }

    /* Access modifiers changed, original: final */
    public final Node<K, V> findByEntry(Entry<?, ?> entry) {
        Node findByObject = findByObject(entry.getKey());
        Object obj = (findByObject == null || !equal(findByObject.value, entry.getValue())) ? null : 1;
        return obj != null ? findByObject : null;
    }

    /* Access modifiers changed, original: final */
    public final Node<K, V> findByObject(Object obj) {
        if (obj != null) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final V get(Object obj) {
        Node findByObject = findByObject(obj);
        return findByObject != null ? findByObject.value : null;
    }

    public final Set<K> keySet() {
        KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public final V put(K k, V v) {
        if (k != null) {
            Node find = find(k, true);
            Object obj = find.value;
            find.value = v;
            return obj;
        }
        throw new NullPointerException("key == null");
    }

    public final V remove(Object obj) {
        Node removeInternalByKey = removeInternalByKey(obj);
        return removeInternalByKey != null ? removeInternalByKey.value : null;
    }

    /* Access modifiers changed, original: final */
    public final void removeInternal(Node<K, V> node, boolean z) {
        if (z) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node.parent;
        int i = 0;
        if (node2 == null || node3 == null) {
            if (node2 != null) {
                replaceInParent(node, node2);
                node.left = null;
            } else if (node3 != null) {
                replaceInParent(node, node3);
                node.right = null;
            } else {
                replaceInParent(node, null);
            }
            rebalance(node4, false);
            this.size--;
            this.modCount++;
            return;
        }
        int i2;
        node2 = node2.height > node3.height ? node2.last() : node3.first();
        removeInternal(node2, false);
        node3 = node.left;
        if (node3 != null) {
            i2 = node3.height;
            node2.left = node3;
            node3.parent = node2;
            node.left = null;
        } else {
            i2 = 0;
        }
        node3 = node.right;
        if (node3 != null) {
            i = node3.height;
            node2.right = node3;
            node3.parent = node2;
            node.right = null;
        }
        node2.height = Math.max(i2, i) + 1;
        replaceInParent(node, node2);
    }

    /* Access modifiers changed, original: final */
    public final Node<K, V> removeInternalByKey(Object obj) {
        Node findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public final int size() {
        return this.size;
    }
}
