package com.knoldus.singleton_builder;

public class ConfigurationBuilder {
    private Configuration configuration;
        public ConfigurationBuilder() {
            this.configuration = Configuration.getConfigurationInstance();
        }

    public ConfigurationBuilder setProperty1(String property1) {
        this.configuration.setProperty1(property1);
        return this;
    }
    public ConfigurationBuilder setProperty2(Integer property2) {
        this.configuration.setProperty2(property2);
        return this;
    }
    public Configuration build() {
            return this.configuration;
    }
}
