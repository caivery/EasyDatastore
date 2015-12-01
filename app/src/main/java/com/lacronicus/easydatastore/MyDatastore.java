package com.lacronicus.easydatastore;

import com.lacronicus.easydatastorelib.BooleanEntry;
import com.lacronicus.easydatastorelib.FloatEntry;
import com.lacronicus.easydatastorelib.IntEntry;
import com.lacronicus.easydatastorelib.LongEntry;
import com.lacronicus.easydatastorelib.ObjectEntry;
import com.lacronicus.easydatastorelib.Preference;
import com.lacronicus.easydatastorelib.StringEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fdoyle on 7/10/15.
 */
public interface MyDatastore {
    @Preference("foo")
    StringEntry foo();

    @Preference("bar")
    StringEntry bar();

    @Preference("baz")
    IntEntry myInt();

    @Preference("float")
    FloatEntry myFloat();

    @Preference("long")
    LongEntry myLong();

    @Preference("boolean")
    BooleanEntry myBoolean();

    @Preference("object")
    ObjectEntry<MyModel> myModel();

    @Preference("list")
    ObjectEntry<List<MyModel>> myModelList();
}
