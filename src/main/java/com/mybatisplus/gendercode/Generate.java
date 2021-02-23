package com.mybatisplus.gendercode;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generate {
    // ================= 自定义配置  =================
    private static final DbType DB_TYPE = DbType.MYSQL;
    private static final String JDBC_URL = "jdbc:mysql://192.168.3.191:3306/small_world_sit?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&useSSL=false";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "huke123456";

    /**
     * 生成代码的@author
     */
    private static final String AUTHOR = "heian";

    /**
     * 数据库表名前缀
     */
    private static final String[] TABLE_PREFIXS = new String[]{""};

    public static void main(String[] args) {

        TableInfos[] tableInfos = new TableInfos[]{new AdminTables()};
        //TableInfos[] tableInfos = new TableInfos[]{new AppTables()};

        for(int i = 0;i<tableInfos.length;i++) {
            AutoGenerator mpg = new AutoGenerator();
            mpg.setDataSource(getDataSourceConfig());
            mpg.setGlobalConfig(getGlobalConfig(tableInfos[i]));
            mpg.setStrategy(getStrategyConfig(tableInfos[i]));
            mpg.setPackageInfo(getPackageConfig(tableInfos[i]));
            mpg.setCfg(getInjectionConfig(tableInfos[i]));
            mpg.setTemplate(getTemplateConfig());
            // 执行生成
            mpg.execute();
        }
    }

    /**
     * 数据源配置
     *
     * @return
     */
    private static DataSourceConfig getDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DB_TYPE);
        dsc.setDriverName(JDBC_DRIVER);
        dsc.setUrl(JDBC_URL);
        dsc.setUsername(JDBC_USERNAME);
        dsc.setPassword(JDBC_PASSWORD);
        return dsc;
    }

    /**
     * 全局配置
     *
     * @return
     */
    private static GlobalConfig getGlobalConfig(TableInfos tableInfos) {
        GlobalConfig gc = new GlobalConfig();
        //gc.setOutputDir(ROOT_DIR);
        gc.setOutputDir(tableInfos.getROOT_DIR());
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor(AUTHOR);
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        return gc;
    }

    /**
     * 生成策略配置
     *
     * @return
     */
    private static StrategyConfig getStrategyConfig(TableInfos tableInfos) {
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(TABLE_PREFIXS);// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        //strategy.setInclude(TABLES); // 需要生成的表
        strategy.setInclude(tableInfos.getTABLES());
        strategy.setEntityLombokModel(true);
        return strategy;
    }

    /**
     * 生成包名设置
     *
     * @return
     */
    private static PackageConfig getPackageConfig(TableInfos tableInfos) {
        // 4.生成文件所在包配置：
        PackageConfig pc = new PackageConfig();
        pc.setParent(tableInfos.getPACKAGE_PARENT_NAME());
       // pc.setController(tableInfos.getPACKAGE_CONTROLLER_NAME());
        pc.setService(tableInfos.getPACKAGE_SERVICE_NAME());
        pc.setServiceImpl(tableInfos.getPACKAGE_SERVICEIMPL_NAME());
        pc.setEntity(tableInfos.getPACKAGE_ENTITY_NAME());
        pc.setMapper(tableInfos.getPACKAGE_MAPPER_NAME());

        return pc;
    }

    /**
     * xml文件配置
     *
     * @return
     */
    private static InjectionConfig getInjectionConfig(final TableInfos tableInfos) {
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                this.setMap(map);
            }
        };
        //xml生成路径
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return tableInfos.getRESOURCES_DIR() + "/" + tableInfos.getMAPPER_XML_PATH() + "/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    /**
     * 关闭默认 xml 生成
     *
     * @return
     */
    private static TemplateConfig getTemplateConfig() {
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        return tc;
    }
}
