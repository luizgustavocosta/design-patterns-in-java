package com.gof.structural.adapter;

/**
 * Defines the domain-specific interface that Client uses.
 * T Type
 * E Element
 */
public interface Target<E> {

    <T>T request(E element);
}
