package com.mybatisplus.gendercode;

public class TableInfos {
    private  String ROOT_DIR ;
    private  String PACKAGE_PARENT_NAME ;
    //private  String PACKAGE_CONTROLLER_NAME ;
    private  String PACKAGE_SERVICE_NAME ;
    private  String PACKAGE_SERVICEIMPL_NAME;
    private  String PACKAGE_ENTITY_NAME;
    private  String PACKAGE_MAPPER_NAME ;
    private  String RESOURCES_DIR ;
    private String MAPPER_XML_PATH;

    private String[] TABLES;

    public TableInfos(String ROOT_DIR, String PACKAGE_PARENT_NAME,
                      String PACKAGE_SERVICE_NAME,
                      String PACKAGE_SERVICEIMPL_NAME, String PACKAGE_ENTITY_NAME,
                      String PACKAGE_MAPPER_NAME,
                      String RESOURCES_DIR, String MAPPER_XML_PATH,
                      String[] TABLES) {
        this.ROOT_DIR = ROOT_DIR;
        this.PACKAGE_PARENT_NAME = PACKAGE_PARENT_NAME;
        //this.PACKAGE_CONTROLLER_NAME = PACKAGE_CONTROLLER_NAME;
        this.PACKAGE_SERVICE_NAME = PACKAGE_SERVICE_NAME;
        this.PACKAGE_SERVICEIMPL_NAME = PACKAGE_SERVICEIMPL_NAME;
        this.PACKAGE_ENTITY_NAME = PACKAGE_ENTITY_NAME;
        this.PACKAGE_MAPPER_NAME = PACKAGE_MAPPER_NAME;
        this.RESOURCES_DIR = RESOURCES_DIR;
        this.MAPPER_XML_PATH = MAPPER_XML_PATH;
        this.TABLES = TABLES;
    }

    public String getROOT_DIR() {
        return ROOT_DIR;
    }

    public void setROOT_DIR(String ROOT_DIR) {
        this.ROOT_DIR = ROOT_DIR;
    }

    public String getPACKAGE_PARENT_NAME() {
        return PACKAGE_PARENT_NAME;
    }

    public void setPACKAGE_PARENT_NAME(String PACKAGE_PARENT_NAME) {
        this.PACKAGE_PARENT_NAME = PACKAGE_PARENT_NAME;
    }

   /* public String getPACKAGE_CONTROLLER_NAME() {
        return PACKAGE_CONTROLLER_NAME;
    }*/

   /* public void setPACKAGE_CONTROLLER_NAME(String PACKAGE_CONTROLLER_NAME) {
        this.PACKAGE_CONTROLLER_NAME = PACKAGE_CONTROLLER_NAME;
    }*/

    public String getPACKAGE_SERVICE_NAME() {
        return PACKAGE_SERVICE_NAME;
    }

    public void setPACKAGE_SERVICE_NAME(String PACKAGE_SERVICE_NAME) {
        this.PACKAGE_SERVICE_NAME = PACKAGE_SERVICE_NAME;
    }

    public String getPACKAGE_SERVICEIMPL_NAME() {
        return PACKAGE_SERVICEIMPL_NAME;
    }

    public void setPACKAGE_SERVICEIMPL_NAME(String PACKAGE_SERVICEIMPL_NAME) {
        this.PACKAGE_SERVICEIMPL_NAME = PACKAGE_SERVICEIMPL_NAME;
    }

    public String getPACKAGE_ENTITY_NAME() {
        return PACKAGE_ENTITY_NAME;
    }

    public void setPACKAGE_ENTITY_NAME(String PACKAGE_ENTITY_NAME) {
        this.PACKAGE_ENTITY_NAME = PACKAGE_ENTITY_NAME;
    }

    public String getPACKAGE_MAPPER_NAME() {
        return PACKAGE_MAPPER_NAME;
    }

    public void setPACKAGE_MAPPER_NAME(String PACKAGE_MAPPER_NAME) {
        this.PACKAGE_MAPPER_NAME = PACKAGE_MAPPER_NAME;
    }

    public String getRESOURCES_DIR() {
        return RESOURCES_DIR;
    }

    public void setRESOURCES_DIR(String RESOURCES_DIR) {
        this.RESOURCES_DIR = RESOURCES_DIR;
    }

    public String getMAPPER_XML_PATH() {
        return MAPPER_XML_PATH;
    }

    public void setMAPPER_XML_PATH(String MAPPER_XML_PATH) {
        this.MAPPER_XML_PATH = MAPPER_XML_PATH;
    }

    public String[] getTABLES() {
        return TABLES;
    }
}
