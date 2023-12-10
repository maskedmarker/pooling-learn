package org.cjh.pooling.reader;

import org.apache.commons.pool2.impl.GenericObjectPool;

public class ReaderDemo {
    public static void main(String[] args) {
        ReaderUtil readerUtil = new ReaderUtil(new GenericObjectPool<StringBuffer>(new StringBufferFactory()));
    }
}
