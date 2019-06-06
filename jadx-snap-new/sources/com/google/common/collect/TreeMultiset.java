package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset.Entry;
import com.google.common.primitives.Ints;
import com.looksery.sdk.listener.AnalyticsListener;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    private final transient AvlNode<E> header;
    private final transient GeneralRange<E> range;
    private final transient Reference<AvlNode<E>> rootReference;

    static final class AvlNode<E> {
        private int distinctElements;
        private final E elem;
        private int elemCount;
        private int height;
        private AvlNode<E> left;
        private AvlNode<E> pred;
        private AvlNode<E> right;
        private AvlNode<E> succ;
        private long totalCount;

        AvlNode(E e, int i) {
            Preconditions.checkArgument(i > 0);
            this.elem = e;
            this.elemCount = i;
            this.totalCount = (long) i;
            this.distinctElements = 1;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        private AvlNode<E> addLeftChild(E e, int i) {
            this.left = new AvlNode(e, i);
            TreeMultiset.successor(this.pred, this.left, this);
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += (long) i;
            return this;
        }

        private AvlNode<E> addRightChild(E e, int i) {
            this.right = new AvlNode(e, i);
            TreeMultiset.successor(this, this.right, this.succ);
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += (long) i;
            return this;
        }

        private int balanceFactor() {
            return height(this.left) - height(this.right);
        }

        private AvlNode<E> ceiling(Comparator<? super E> comparator, E e) {
            AvlNode avlNode = this;
            do {
                int compare = comparator.compare(e, avlNode.elem);
                if (compare < 0) {
                    AvlNode avlNode2 = avlNode.left;
                    return avlNode2 == null ? avlNode : (AvlNode) MoreObjects.firstNonNull(avlNode2.ceiling(comparator, e), avlNode);
                } else if (compare == 0) {
                    return avlNode;
                } else {
                    avlNode = avlNode.right;
                }
            } while (avlNode != null);
            return null;
        }

        private AvlNode<E> deleteMe() {
            int i = this.elemCount;
            this.elemCount = 0;
            TreeMultiset.successor(this.pred, this.succ);
            AvlNode avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            AvlNode avlNode2 = this.right;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.height >= avlNode2.height) {
                avlNode2 = this.pred;
                avlNode2.left = avlNode.removeMax(avlNode2);
                avlNode2.right = this.right;
                avlNode2.distinctElements = this.distinctElements - 1;
                avlNode2.totalCount = this.totalCount - ((long) i);
                return avlNode2.rebalance();
            }
            avlNode = this.succ;
            avlNode.right = avlNode2.removeMin(avlNode);
            avlNode.left = this.left;
            avlNode.distinctElements = this.distinctElements - 1;
            avlNode.totalCount = this.totalCount - ((long) i);
            return avlNode.rebalance();
        }

        private AvlNode<E> floor(Comparator<? super E> comparator, E e) {
            AvlNode avlNode = this;
            do {
                int compare = comparator.compare(e, avlNode.elem);
                if (compare > 0) {
                    AvlNode avlNode2 = avlNode.right;
                    return avlNode2 == null ? avlNode : (AvlNode) MoreObjects.firstNonNull(avlNode2.floor(comparator, e), avlNode);
                } else if (compare == 0) {
                    return avlNode;
                } else {
                    avlNode = avlNode.left;
                }
            } while (avlNode != null);
            return null;
        }

        private static int height(AvlNode<?> avlNode) {
            return avlNode == null ? 0 : avlNode.height;
        }

        private AvlNode<E> rebalance() {
            int balanceFactor = balanceFactor();
            if (balanceFactor == -2) {
                if (this.right.balanceFactor() > 0) {
                    this.right = this.right.rotateRight();
                }
                return rotateLeft();
            } else if (balanceFactor != 2) {
                recomputeHeight();
                return this;
            } else {
                if (this.left.balanceFactor() < 0) {
                    this.left = this.left.rotateLeft();
                }
                return rotateRight();
            }
        }

        private void recompute() {
            recomputeMultiset();
            recomputeHeight();
        }

        private void recomputeHeight() {
            this.height = Math.max(height(this.left), height(this.right)) + 1;
        }

        private void recomputeMultiset() {
            this.distinctElements = (TreeMultiset.distinctElements(this.left) + 1) + TreeMultiset.distinctElements(this.right);
            this.totalCount = (((long) this.elemCount) + totalCount(this.left)) + totalCount(this.right);
        }

        private AvlNode<E> removeMax(AvlNode<E> avlNode) {
            AvlNode avlNode2 = this.right;
            if (avlNode2 == null) {
                return this.left;
            }
            this.right = avlNode2.removeMax(avlNode);
            this.distinctElements--;
            this.totalCount -= (long) avlNode.elemCount;
            return rebalance();
        }

        private AvlNode<E> removeMin(AvlNode<E> avlNode) {
            AvlNode avlNode2 = this.left;
            if (avlNode2 == null) {
                return this.right;
            }
            this.left = avlNode2.removeMin(avlNode);
            this.distinctElements--;
            this.totalCount -= (long) avlNode.elemCount;
            return rebalance();
        }

        private AvlNode<E> rotateLeft() {
            Preconditions.checkState(this.right != null);
            AvlNode avlNode = this.right;
            this.right = avlNode.left;
            avlNode.left = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private AvlNode<E> rotateRight() {
            Preconditions.checkState(this.left != null);
            AvlNode avlNode = this.left;
            this.left = avlNode.right;
            avlNode.right = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private static long totalCount(AvlNode<?> avlNode) {
            return avlNode == null ? 0 : avlNode.totalCount;
        }

        /* Access modifiers changed, original: final */
        public final AvlNode<E> add(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            boolean z = true;
            AvlNode avlNode;
            int i2;
            if (compare < 0) {
                avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return addLeftChild(e, i);
                }
                i2 = avlNode.height;
                this.left = avlNode.add(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) i;
                return this.left.height == i2 ? this : rebalance();
            } else if (compare > 0) {
                avlNode = this.right;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return addRightChild(e, i);
                }
                i2 = avlNode.height;
                this.right = avlNode.add(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) i;
                return this.right.height == i2 ? this : rebalance();
            } else {
                int i3 = this.elemCount;
                iArr[0] = i3;
                long j = (long) i;
                if (((long) i3) + j > 2147483647L) {
                    z = false;
                }
                Preconditions.checkArgument(z);
                this.elemCount += i;
                this.totalCount += j;
                return this;
            }
        }

        public final int count(Comparator<? super E> comparator, E e) {
            AvlNode avlNode = this;
            while (true) {
                int compare = comparator.compare(e, avlNode.elem);
                if (compare < 0) {
                    avlNode = avlNode.left;
                    if (avlNode == null) {
                        return 0;
                    }
                } else if (compare <= 0) {
                    return avlNode.elemCount;
                } else {
                    avlNode = avlNode.right;
                    if (avlNode == null) {
                        return 0;
                    }
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final int getCount() {
            return this.elemCount;
        }

        /* Access modifiers changed, original: final */
        public final E getElement() {
            return this.elem;
        }

        /* Access modifiers changed, original: final */
        public final AvlNode<E> remove(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            AvlNode avlNode;
            long j;
            if (compare < 0) {
                avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.left = avlNode.remove(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.distinctElements--;
                        j = this.totalCount;
                        i = iArr[0];
                    } else {
                        j = this.totalCount;
                    }
                    this.totalCount = j - ((long) i);
                }
                return iArr[0] == 0 ? this : rebalance();
            } else if (compare > 0) {
                avlNode = this.right;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.right = avlNode.remove(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.distinctElements--;
                        j = this.totalCount;
                        i = iArr[0];
                    } else {
                        j = this.totalCount;
                    }
                    this.totalCount = j - ((long) i);
                }
                return rebalance();
            } else {
                int i2 = this.elemCount;
                iArr[0] = i2;
                if (i >= i2) {
                    return deleteMe();
                }
                this.elemCount = i2 - i;
                this.totalCount -= (long) i;
                return this;
            }
        }

        /* Access modifiers changed, original: final */
        public final AvlNode<E> setCount(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            AvlNode avlNode;
            int i3;
            if (compare < 0) {
                avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : addLeftChild(e, i2);
                } else {
                    this.left = avlNode.setCount(comparator, e, i, i2, iArr);
                    if (iArr[0] == i) {
                        if (i2 != 0 || iArr[0] == 0) {
                            if (i2 > 0 && iArr[0] == 0) {
                                i3 = this.distinctElements + 1;
                            }
                            this.totalCount += (long) (i2 - iArr[0]);
                        } else {
                            i3 = this.distinctElements - 1;
                        }
                        this.distinctElements = i3;
                        this.totalCount += (long) (i2 - iArr[0]);
                    }
                    return rebalance();
                }
            } else if (compare > 0) {
                avlNode = this.right;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : addRightChild(e, i2);
                } else {
                    this.right = avlNode.setCount(comparator, e, i, i2, iArr);
                    if (iArr[0] == i) {
                        if (i2 != 0 || iArr[0] == 0) {
                            if (i2 > 0 && iArr[0] == 0) {
                                i3 = this.distinctElements + 1;
                            }
                            this.totalCount += (long) (i2 - iArr[0]);
                        } else {
                            i3 = this.distinctElements - 1;
                        }
                        this.distinctElements = i3;
                        this.totalCount += (long) (i2 - iArr[0]);
                    }
                    return rebalance();
                }
            } else {
                i3 = this.elemCount;
                iArr[0] = i3;
                if (i == i3) {
                    if (i2 == 0) {
                        return deleteMe();
                    }
                    this.totalCount += (long) (i2 - i3);
                    this.elemCount = i2;
                }
                return this;
            }
        }

        /* Access modifiers changed, original: final */
        public final AvlNode<E> setCount(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            long j;
            int i2;
            int compare = comparator.compare(e, this.elem);
            AvlNode avlNode;
            int i3;
            if (compare < 0) {
                avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return i > 0 ? addLeftChild(e, i) : this;
                } else {
                    this.left = avlNode.setCount(comparator, e, i, iArr);
                    if (i != 0 || iArr[0] == 0) {
                        if (i > 0 && iArr[0] == 0) {
                            i3 = this.distinctElements + 1;
                        }
                        j = this.totalCount;
                        i2 = iArr[0];
                    } else {
                        i3 = this.distinctElements - 1;
                    }
                    this.distinctElements = i3;
                    j = this.totalCount;
                    i2 = iArr[0];
                }
            } else if (compare > 0) {
                avlNode = this.right;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return i > 0 ? addRightChild(e, i) : this;
                } else {
                    this.right = avlNode.setCount(comparator, e, i, iArr);
                    if (i != 0 || iArr[0] == 0) {
                        if (i > 0 && iArr[0] == 0) {
                            i3 = this.distinctElements + 1;
                        }
                        j = this.totalCount;
                        i2 = iArr[0];
                    } else {
                        i3 = this.distinctElements - 1;
                    }
                    this.distinctElements = i3;
                    j = this.totalCount;
                    i2 = iArr[0];
                }
            } else {
                i3 = this.elemCount;
                iArr[0] = i3;
                if (i == 0) {
                    return deleteMe();
                }
                this.totalCount += (long) (i - i3);
                this.elemCount = i;
                return this;
            }
            this.totalCount = j + ((long) (i - i2));
            return rebalance();
        }

        public final String toString() {
            return Multisets.immutableEntry(getElement(), getCount()).toString();
        }
    }

    static final class Reference<T> {
        private T value;

        private Reference() {
        }

        /* synthetic */ Reference(AnonymousClass1 anonymousClass1) {
            this();
        }

        public final void checkAndSet(T t, T t2) {
            if (this.value == t) {
                this.value = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* Access modifiers changed, original: final */
        public final void clear() {
            this.value = null;
        }

        public final T get() {
            return this.value;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = new int[BoundType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.google.common.collect.BoundType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$google$common$collect$BoundType = r0;
            r0 = $SwitchMap$com$google$common$collect$BoundType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.common.collect.BoundType.OPEN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$google$common$collect$BoundType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.common.collect.BoundType.CLOSED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset$AnonymousClass4.<clinit>():void");
        }
    }

    enum Aggregate {
        SIZE {
            /* Access modifiers changed, original: final */
            public final int nodeAggregate(AvlNode<?> avlNode) {
                return avlNode.elemCount;
            }

            /* Access modifiers changed, original: final */
            public final long treeAggregate(AvlNode<?> avlNode) {
                return avlNode == null ? 0 : avlNode.totalCount;
            }
        },
        DISTINCT {
            /* Access modifiers changed, original: final */
            public final int nodeAggregate(AvlNode<?> avlNode) {
                return 1;
            }

            /* Access modifiers changed, original: final */
            public final long treeAggregate(AvlNode<?> avlNode) {
                return avlNode == null ? 0 : (long) avlNode.distinctElements;
            }
        };

        public abstract int nodeAggregate(AvlNode<?> avlNode);

        public abstract long treeAggregate(AvlNode<?> avlNode);
    }

    TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
        super(generalRange.comparator());
        this.rootReference = reference;
        this.range = generalRange;
        this.header = avlNode;
    }

    TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        this.header = new AvlNode(null, 1);
        AvlNode avlNode = this.header;
        successor(avlNode, avlNode);
        this.rootReference = new Reference();
    }

    private long aggregateAboveRange(Aggregate aggregate, AvlNode<E> avlNode) {
        AvlNode avlNode2;
        while (avlNode2 != null) {
            int compare = comparator().compare(this.range.getUpperEndpoint(), avlNode2.elem);
            if (compare > 0) {
                avlNode2 = avlNode2.right;
            } else {
                long nodeAggregate;
                long treeAggregate;
                if (compare == 0) {
                    compare = AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType[this.range.getUpperBoundType().ordinal()];
                    if (compare == 1) {
                        nodeAggregate = (long) aggregate.nodeAggregate(avlNode2);
                        treeAggregate = aggregate.treeAggregate(avlNode2.right);
                    } else if (compare == 2) {
                        return aggregate.treeAggregate(avlNode2.right);
                    } else {
                        throw new AssertionError();
                    }
                }
                nodeAggregate = aggregate.treeAggregate(avlNode2.right) + ((long) aggregate.nodeAggregate(avlNode2));
                treeAggregate = aggregateAboveRange(aggregate, avlNode2.left);
                return nodeAggregate + treeAggregate;
            }
        }
        return 0;
    }

    private long aggregateBelowRange(Aggregate aggregate, AvlNode<E> avlNode) {
        AvlNode avlNode2;
        while (avlNode2 != null) {
            int compare = comparator().compare(this.range.getLowerEndpoint(), avlNode2.elem);
            if (compare < 0) {
                avlNode2 = avlNode2.left;
            } else {
                long nodeAggregate;
                long treeAggregate;
                if (compare == 0) {
                    compare = AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType[this.range.getLowerBoundType().ordinal()];
                    if (compare == 1) {
                        nodeAggregate = (long) aggregate.nodeAggregate(avlNode2);
                        treeAggregate = aggregate.treeAggregate(avlNode2.left);
                    } else if (compare == 2) {
                        return aggregate.treeAggregate(avlNode2.left);
                    } else {
                        throw new AssertionError();
                    }
                }
                nodeAggregate = aggregate.treeAggregate(avlNode2.left) + ((long) aggregate.nodeAggregate(avlNode2));
                treeAggregate = aggregateBelowRange(aggregate, avlNode2.right);
                return nodeAggregate + treeAggregate;
            }
        }
        return 0;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        AvlNode avlNode = (AvlNode) this.rootReference.get();
        long treeAggregate = aggregate.treeAggregate(avlNode);
        if (this.range.hasLowerBound()) {
            treeAggregate -= aggregateBelowRange(aggregate, avlNode);
        }
        return this.range.hasUpperBound() ? treeAggregate - aggregateAboveRange(aggregate, avlNode) : treeAggregate;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset(Ordering.natural());
    }

    static int distinctElements(AvlNode<?> avlNode) {
        return avlNode == null ? 0 : avlNode.distinctElements;
    }

    private AvlNode<E> firstNode() {
        if (((AvlNode) this.rootReference.get()) == null) {
            return null;
        }
        AvlNode access$1000;
        if (this.range.hasLowerBound()) {
            Object lowerEndpoint = this.range.getLowerEndpoint();
            access$1000 = ((AvlNode) this.rootReference.get()).ceiling(comparator(), lowerEndpoint);
            if (access$1000 == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(lowerEndpoint, access$1000.getElement()) == 0) {
                access$1000 = access$1000.succ;
            }
        } else {
            access$1000 = this.header.succ;
        }
        return (access$1000 == this.header || !this.range.contains(access$1000.getElement())) ? null : access$1000;
    }

    private AvlNode<E> lastNode() {
        if (((AvlNode) this.rootReference.get()) == null) {
            return null;
        }
        AvlNode access$1100;
        if (this.range.hasUpperBound()) {
            Object upperEndpoint = this.range.getUpperEndpoint();
            access$1100 = ((AvlNode) this.rootReference.get()).floor(comparator(), upperEndpoint);
            if (access$1100 == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(upperEndpoint, access$1100.getElement()) == 0) {
                access$1100 = access$1100.pred;
            }
        } else {
            access$1100 = this.header.pred;
        }
        return (access$1100 == this.header || !this.range.contains(access$1100.getElement())) ? null : access$1100;
    }

    private static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2) {
        avlNode.succ = avlNode2;
        avlNode2.pred = avlNode;
    }

    private static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2, AvlNode<T> avlNode3) {
        successor(avlNode, avlNode2);
        successor(avlNode2, avlNode3);
    }

    private Entry<E> wrapEntry(final AvlNode<E> avlNode) {
        return new AbstractEntry<E>() {
            public int getCount() {
                int count = avlNode.getCount();
                return count == 0 ? TreeMultiset.this.count(getElement()) : count;
            }

            public E getElement() {
                return avlNode.getElement();
            }
        };
    }

    public final int add(E e, int i) {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(this.range.contains(e));
        AvlNode avlNode = (AvlNode) this.rootReference.get();
        if (avlNode == null) {
            comparator().compare(e, e);
            AvlNode avlNode2 = new AvlNode(e, i);
            AvlNode avlNode3 = this.header;
            successor(avlNode3, avlNode2, avlNode3);
            this.rootReference.checkAndSet(avlNode, avlNode2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.add(comparator(), e, i, iArr));
        return iArr[0];
    }

    public final void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            Iterators.clear(entryIterator());
            return;
        }
        AvlNode access$800 = this.header.succ;
        while (true) {
            AvlNode avlNode = this.header;
            if (access$800 != avlNode) {
                avlNode = access$800.succ;
                access$800.elemCount = 0;
                access$800.left = null;
                access$800.right = null;
                access$800.pred = null;
                access$800.succ = null;
                access$800 = avlNode;
            } else {
                successor(avlNode, avlNode);
                this.rootReference.clear();
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final int count(Object obj) {
        try {
            AvlNode avlNode = (AvlNode) this.rootReference.get();
            if (this.range.contains(obj)) {
                if (avlNode != null) {
                    return avlNode.count(comparator(), obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final Iterator<Entry<E>> descendingEntryIterator() {
        return new Iterator<Entry<E>>() {
            AvlNode<E> current = TreeMultiset.this.lastNode();
            Entry<E> prevEntry = null;

            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooLow(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            public Entry<E> next() {
                if (hasNext()) {
                    Entry access$1400 = TreeMultiset.this.wrapEntry(this.current);
                    this.prevEntry = access$1400;
                    this.current = this.current.pred == TreeMultiset.this.header ? null : this.current.pred;
                    return access$1400;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                CollectPreconditions.checkRemove(this.prevEntry != null);
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    public final /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    /* Access modifiers changed, original: final */
    public final int distinctElements() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.DISTINCT));
    }

    /* Access modifiers changed, original: final */
    public final Iterator<E> elementIterator() {
        return Multisets.elementIterator(entryIterator());
    }

    public final /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    /* Access modifiers changed, original: final */
    public final Iterator<Entry<E>> entryIterator() {
        return new Iterator<Entry<E>>() {
            AvlNode<E> current = TreeMultiset.this.firstNode();
            Entry<E> prevEntry;

            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            public Entry<E> next() {
                if (hasNext()) {
                    Entry access$1400 = TreeMultiset.this.wrapEntry(this.current);
                    this.prevEntry = access$1400;
                    this.current = this.current.succ == TreeMultiset.this.header ? null : this.current.succ;
                    return access$1400;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                CollectPreconditions.checkRemove(this.prevEntry != null);
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ Entry firstEntry() {
        return super.firstEntry();
    }

    public final SortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public final /* bridge */ /* synthetic */ Entry lastEntry() {
        return super.lastEntry();
    }

    public final /* bridge */ /* synthetic */ Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public final /* bridge */ /* synthetic */ Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    public final int remove(Object obj, int i) {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        AvlNode avlNode = (AvlNode) this.rootReference.get();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj)) {
                if (avlNode != null) {
                    this.rootReference.checkAndSet(avlNode, avlNode.remove(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public final int setCount(E e, int i) {
        CollectPreconditions.checkNonnegative(i, AnalyticsListener.ANALYTICS_COUNT_KEY);
        boolean z = true;
        if (this.range.contains(e)) {
            AvlNode avlNode = (AvlNode) this.rootReference.get();
            if (avlNode == null) {
                if (i > 0) {
                    add(e, i);
                }
                return 0;
            }
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), e, i, iArr));
            return iArr[0];
        }
        if (i != 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        return 0;
    }

    public final boolean setCount(E e, int i, int i2) {
        CollectPreconditions.checkNonnegative(i2, "newCount");
        CollectPreconditions.checkNonnegative(i, "oldCount");
        Preconditions.checkArgument(this.range.contains(e));
        AvlNode avlNode = (AvlNode) this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                add(e, i2);
            }
            return true;
        }
    }

    public final int size() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.SIZE));
    }

    public final /* bridge */ /* synthetic */ SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    public final SortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(comparator(), e, boundType)), this.header);
    }
}
