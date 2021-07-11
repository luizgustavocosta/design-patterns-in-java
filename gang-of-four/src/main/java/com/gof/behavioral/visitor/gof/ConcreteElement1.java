package com.gof.behavioral.visitor.gof;

class ConcreteElement1 implements Element {

    private final String paramAsString;
    private final Integer paramAsInteger;

    ConcreteElement1(String paramAsString, Integer paramAsInteger) {
        this.paramAsString = paramAsString;
        this.paramAsInteger = paramAsInteger;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(paramAsInteger);
        visitor.visit(paramAsString);
    }
}
