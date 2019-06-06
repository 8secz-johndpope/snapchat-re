package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: akko */
public final class akko {
    static final Logger a = Logger.getLogger(akko.class.getName());

    private akko() {
    }

    public static akke a(akku akku) {
        return new akkp(akku);
    }

    public static akkf a(akkv akkv) {
        return new akkq(akkv);
    }

    public static akku a(OutputStream outputStream) {
        return akko.a(outputStream, new akkw());
    }

    private static akku a(final OutputStream outputStream, final akkw akkw) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (akkw != null) {
            return new akku() {
                public final akkw a() {
                    return akkw;
                }

                public final void a_(akkd akkd, long j) {
                    akkx.a(akkd.b, 0, j);
                    while (j > 0) {
                        akkw.f();
                        akkr akkr = akkd.a;
                        int min = (int) Math.min(j, (long) (akkr.c - akkr.b));
                        outputStream.write(akkr.a, akkr.b, min);
                        akkr.b += min;
                        long j2 = (long) min;
                        j -= j2;
                        akkd.b -= j2;
                        if (akkr.b == akkr.c) {
                            akkd.a = akkr.a();
                            akks.a(akkr);
                        }
                    }
                }

                public final void close() {
                    outputStream.close();
                }

                public final void flush() {
                    outputStream.flush();
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("sink(");
                    stringBuilder.append(outputStream);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static akku a(Socket socket) {
        if (socket != null) {
            akkw c = akko.c(socket);
            return c.a(akko.a(socket.getOutputStream(), c));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static akkv a(InputStream inputStream) {
        return akko.a(inputStream, new akkw());
    }

    private static akkv a(final InputStream inputStream, final akkw akkw) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (akkw != null) {
            return new akkv() {
                public final long a(akkd akkd, long j) {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (j == 0) {
                        return 0;
                    } else {
                        try {
                            akkw.f();
                            akkr f = akkd.f(1);
                            int read = inputStream.read(f.a, f.c, (int) Math.min(j, (long) (8192 - f.c)));
                            if (read == -1) {
                                return -1;
                            }
                            f.c += read;
                            j = (long) read;
                            akkd.b += j;
                            return j;
                        } catch (AssertionError e) {
                            if (akko.a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final akkw a() {
                    return akkw;
                }

                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("source(");
                    stringBuilder.append(inputStream);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static akkv b(Socket socket) {
        if (socket != null) {
            akkw c = akko.c(socket);
            return c.a(akko.a(socket.getInputStream(), c));
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static akkb c(final Socket socket) {
        return new akkb() {
            /* Access modifiers changed, original: protected|final */
            public final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            /* Access modifiers changed, original: protected|final */
            public final void a() {
                Throwable e;
                Logger logger;
                Level level;
                StringBuilder stringBuilder;
                String str = "Failed to close timed out socket ";
                try {
                    socket.close();
                } catch (Exception e2) {
                    e = e2;
                    logger = akko.a;
                    level = Level.WARNING;
                    stringBuilder = new StringBuilder(str);
                    stringBuilder.append(socket);
                    logger.log(level, stringBuilder.toString(), e);
                } catch (AssertionError e3) {
                    e = e3;
                    if (akko.a((AssertionError) e)) {
                        logger = akko.a;
                        level = Level.WARNING;
                        stringBuilder = new StringBuilder(str);
                        stringBuilder.append(socket);
                        logger.log(level, stringBuilder.toString(), e);
                    }
                    throw e;
                }
            }
        };
    }
}
