package com.nheatyon.rprinter.impl;

import com.nheatyon.rprinter.ReversePrinter;

public final class HelloWorldPrinter extends ReversePrinter {

    public static void HelloWorld(String s, Object... args) {
        ReversePrinter.print(s, args);
    }
}
