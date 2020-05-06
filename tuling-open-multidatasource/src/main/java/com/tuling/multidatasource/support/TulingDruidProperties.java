package com.tuling.multidatasource.support;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by smlz on 2019/4/17.
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class TulingDruidProperties {

    private String druid00username;

    private String druid00passwrod;

    private String druid00jdbcUrl;

    private String druid00driverClass;

    private String druid01username;

    private String druid01passwrod;

    private String druid01jdbcUrl;

    private String druid01driverClass;

    private String druid02username;

    private String druid02passwrod;

    private String druid02jdbcUrl;

    private String druid02driverClass;

    public String getDruid00username() {
        return druid00username;
    }

    public void setDruid00username(String druid00username) {
        this.druid00username = druid00username;
    }

    public String getDruid00passwrod() {
        return druid00passwrod;
    }

    public void setDruid00passwrod(String druid00passwrod) {
        this.druid00passwrod = druid00passwrod;
    }

    public String getDruid00jdbcUrl() {
        return druid00jdbcUrl;
    }

    public void setDruid00jdbcUrl(String druid00jdbcUrl) {
        this.druid00jdbcUrl = druid00jdbcUrl;
    }

    public String getDruid00driverClass() {
        return druid00driverClass;
    }

    public void setDruid00driverClass(String druid00driverClass) {
        this.druid00driverClass = druid00driverClass;
    }

    public String getDruid01username() {
        return druid01username;
    }

    public void setDruid01username(String druid01username) {
        this.druid01username = druid01username;
    }

    public String getDruid01passwrod() {
        return druid01passwrod;
    }

    public void setDruid01passwrod(String druid01passwrod) {
        this.druid01passwrod = druid01passwrod;
    }

    public String getDruid01jdbcUrl() {
        return druid01jdbcUrl;
    }

    public void setDruid01jdbcUrl(String druid01jdbcUrl) {
        this.druid01jdbcUrl = druid01jdbcUrl;
    }

    public String getDruid01driverClass() {
        return druid01driverClass;
    }

    public void setDruid01driverClass(String druid01driverClass) {
        this.druid01driverClass = druid01driverClass;
    }

    public String getDruid02username() {
        return druid02username;
    }

    public void setDruid02username(String druid02username) {
        this.druid02username = druid02username;
    }

    public String getDruid02passwrod() {
        return druid02passwrod;
    }

    public void setDruid02passwrod(String druid02passwrod) {
        this.druid02passwrod = druid02passwrod;
    }

    public String getDruid02jdbcUrl() {
        return druid02jdbcUrl;
    }

    public void setDruid02jdbcUrl(String druid02jdbcUrl) {
        this.druid02jdbcUrl = druid02jdbcUrl;
    }

    public String getDruid02driverClass() {
        return druid02driverClass;
    }

    public void setDruid02driverClass(String druid02driverClass) {
        this.druid02driverClass = druid02driverClass;
    }
}
