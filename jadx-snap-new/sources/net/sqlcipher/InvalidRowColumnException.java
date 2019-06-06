package net.sqlcipher;

public class InvalidRowColumnException extends RuntimeException {
    public InvalidRowColumnException(String str) {
        super(str);
    }
}
