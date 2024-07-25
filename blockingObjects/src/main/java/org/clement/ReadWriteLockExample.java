package org.clement;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    int n;

    ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increament() {
        try {
            lock.writeLock().lock();
            n++; // n = n + 1 which is non-concurrent
        } finally {
            lock.writeLock().unlock();
        }

    }

    public int getN() {
        try {
            lock.readLock().lock();
            return n;
        } finally {
            lock.readLock().unlock();
        }

    }
}
