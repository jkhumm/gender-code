package com.mybatisplus.gendercode;

public class AdminTables extends TableInfos {
    private static final String ROOT_DIR = "../small_world/world-mybatiesplus/src/main/java";
    private static final String PACKAGE_PARENT_NAME = "com.huke.admin";
    //private static final String PACKAGE_CONTROLLER_NAME = "controller";
    private static final String PACKAGE_SERVICE_NAME = "service";
    private static final String PACKAGE_SERVICEIMPL_NAME = "service.impl";
    private static final String PACKAGE_ENTITY_NAME = "entity";
    private static final String PACKAGE_MAPPER_NAME = "dao";
    private static final String RESOURCES_DIR = "../small_world/world-mybatiesplus/src/main/java/com/huke/admin";
    private static final String MAPPER_XML_PATH = "mapper";

    //你希望生成的表
    private static final  String[] tables = new String[]{
            "admin_pkg_manage"
    };

    public AdminTables() {
        super(ROOT_DIR, PACKAGE_PARENT_NAME, PACKAGE_SERVICE_NAME, PACKAGE_SERVICEIMPL_NAME, PACKAGE_ENTITY_NAME, PACKAGE_MAPPER_NAME, RESOURCES_DIR, MAPPER_XML_PATH,tables);
    }
}
