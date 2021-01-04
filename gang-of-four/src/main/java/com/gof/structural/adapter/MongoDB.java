package com.gof.structural.adapter;


import com.gof.structural.adapter.mongodb.DeleteResult;
import com.gof.structural.adapter.mongodb.FindIterable;
import com.gof.structural.adapter.mongodb.TDocument;
import org.bson.conversions.Bson;

public interface MongoDB extends NoSQL {

    void insertOne(TDocument document);
    FindIterable<TDocument> find(Bson filter);
    DeleteResult deleteOne(Bson filter);
    TDocument findOneAndUpdate(Bson filter, Bson update);
}
