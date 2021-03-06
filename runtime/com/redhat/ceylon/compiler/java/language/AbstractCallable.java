package com.redhat.ceylon.compiler.java.language;

import java.util.Arrays;

import com.redhat.ceylon.compiler.java.Util;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;

import ceylon.language.Callable;
import ceylon.language.Sequential;
import ceylon.language.empty_;

/**
 * Stub implementation for {@link Callable}, so the anonymous inner classes 
 * generated by the compiler don't need to implement every method.
 *
 * @param <Return>
 */
// Note: The compiler sometimes generates anonymous subclasses with 
// an extra $call$typed() method. This is used when dealing with 
// defaulted parameters so as to avoid multiple boxings and unboxings.

public class AbstractCallable<Return> implements Callable<Return>, ReifiedType {
    
    private final String string;
    private final TypeDescriptor $reifiedArguments;
    private final TypeDescriptor $reifiedReturn;
    private final short variadicParameterIndex;

    public AbstractCallable(TypeDescriptor $reifiedReturn, TypeDescriptor $reifiedArguments, String string, short variadicParameterIndex) {
        this.string = string;
        this.$reifiedReturn = $reifiedReturn;
        this.$reifiedArguments = $reifiedArguments;
        this.variadicParameterIndex = variadicParameterIndex;
    }
    
    public Return $call() {
        throw new UnsupportedOperationException();
    }
    
    public Return $call(java.lang.Object arg0) {
        throw new UnsupportedOperationException();
    }
    
    public Return $call(java.lang.Object arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException();
    }
    
    public Return $call(java.lang.Object arg0, java.lang.Object arg1, java.lang.Object arg2) {
        throw new UnsupportedOperationException();
    }
    
    public Return $call(java.lang.Object... args) {
        throw new UnsupportedOperationException();
    }
    
    @java.lang.Override
    public String toString() {
        return string;
    }

    @Override
    public TypeDescriptor $getType() {
        return TypeDescriptor.klass(Callable.class, $reifiedReturn, $reifiedArguments);
    }

    @Override
    public short $getVariadicParameterIndex() {
        return variadicParameterIndex;
    }
    
    @Override
    @Ignore
    public Return $call$variadic(Sequential<?> varargs) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Ignore
    public Return $call$variadic(Object arg0, Sequential<?> varargs) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Ignore
    public Return $call$variadic(Object arg0, Object arg1, Sequential<?> varargs) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Ignore
    public Return $call$variadic(Object arg0, Object arg1, Object arg2, Sequential<?> varargs) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Ignore
    public Return $call$variadic(Object... argsAndVarargs) {
        throw new UnsupportedOperationException();
    }

    /**
     * Construct a sequential from the given array.
     * <li>the elements {@code start} (incluside) to 
     *     {@code argsAndVarargs.length-1} (exclusive) 
     *     are the initial elements in the returned sequential
     * <li>the last element of the given array is a Sequential, whose elements 
     *     make up the rest of the elements in the returned sequential.
     */
    protected static Sequential $spreadVarargs(TypeDescriptor $reifiedElement, 
            int start, Object[] argsAndVarargs) {
        Sequential<?> callsiteVarargs = (Sequential<?>)argsAndVarargs[argsAndVarargs.length-1];
        return $spreadVarargs($reifiedElement,  
                start, argsAndVarargs.length - 1 - start, argsAndVarargs, 
                callsiteVarargs);
    }
    
    /**
     * Construct a sequential from the given array and sequential.
     * <li>the elements {@code start} (incluside) to 
     *     {@code start+length} (exclusive) 
     *     are the initial elements in the returned sequential
     * <li>elements of {@code rest} 
     *     make up the rest of the elements in the returned sequential.
     */
    protected static Sequential $spreadVarargs(TypeDescriptor $reifiedElement, 
            int start, int length, Object[] initial, Sequential<?> rest) {
        return Util.sequentialInstance($reifiedElement, 
                start, length, initial, false, rest);
    }
    
    @Override
    @Ignore
    public Return $call$variadic() {
        return $call$variadic(empty_.$get());
    }

    @Override
    @Ignore
    public Return $call$variadic(Object arg0) {
        return $call$variadic(arg0, empty_.$get());
    }

    @Override
    @Ignore
    public Return $call$variadic(Object arg0, Object arg1) {
        return $call$variadic(arg0, arg1, empty_.$get());
    }

    @Override
    @Ignore
    public Return $call$variadic(Object arg0, Object arg1, Object arg2) {
        return $call$variadic(arg0, arg1, arg2, empty_.$get());
    }
}