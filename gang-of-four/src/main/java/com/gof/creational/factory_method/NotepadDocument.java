package com.gof.creational.factory_method;

import java.util.List;

public class NotepadDocument implements Document {

    @Override
    public void rename(String newName) {
    }

    @Override
    public void delete() {
    }

    @Override
    public void share(List<String> users) {
        throw new UnsupportedOperationException();
    }
}
