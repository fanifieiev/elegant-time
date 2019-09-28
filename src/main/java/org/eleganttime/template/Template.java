package org.eleganttime.template;

public interface Template {

    Template with(String key, String value);

    Object read();
}
