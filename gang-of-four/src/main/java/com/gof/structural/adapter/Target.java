package com.gof.structural.adapter;

/**
 * Defines the domain-specific interface that Client uses.
 */
public interface Target<T, E> {

    <T>T request(E e);
}
