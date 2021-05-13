
package com.lab.cdc;

import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws Exception {
        CDC[] cdcs=Util.getCdcs();
        Stream.of(cdcs).forEach(System.out::println);
    }
}
