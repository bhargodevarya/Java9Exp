module com.bhargo.web {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires java.sql;
    exports com.bhargo.web to com.bhargo,spring.core,spring.context;
    exports com.bhargo.web.cotroller to spring.core;
    opens com.bhargo.web to spring.core,spring.web,spring.beans;
    opens com.bhargo.web.cotroller to spring.core,spring.web,spring.beans;
}