package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Queue;

public final class Queues {
    public static <E> ArrayDeque<E> newArrayDeque() {
        return new ArrayDeque();
    }

    public static <E> Queue<E> synchronizedQueue(Queue<E> queue) {
        return Synchronized.queue(queue, null);
    }
}
