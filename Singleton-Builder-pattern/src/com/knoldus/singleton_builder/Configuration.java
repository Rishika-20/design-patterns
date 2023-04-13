package com.knoldus.singleton_builder;

public class Configuration {
    private  static volatile Configuration configurationInstance;
    private String property1;
    private Integer property2;

    private Configuration() {
    }
    public static Configuration getConfigurationInstance() {
        if(configurationInstance == null)
        {
            configurationInstance = new Configuration();
        }
        return configurationInstance;
    }
    public String getProperty1() {
        return property1;
    }
    public Integer getProperty2() {
        return property2;
    }
    public void setProperty1(String property1) {
        this.property1 = property1;
    }
    public void setProperty2(Integer property2) {
        this.property2 = property2;
    }

    @Override
    public String toString() {
        return "Configuration { " +
                " property1 = '" + property1 + '\'' +
                ", property2 = " + property2 +
                '}';
    }
    }
