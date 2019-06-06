package com.google.common.util.concurrent;

import java.util.concurrent.ExecutorService;

public interface ListeningExecutorService extends ExecutorService {
    <T> ListenableFuture<T> submit(Runnable runnable, T t);
}
