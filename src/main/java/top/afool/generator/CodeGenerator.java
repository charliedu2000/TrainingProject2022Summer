package top.afool.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/citi?useUnicode=true&useSSL=false&characterEncoding=utf8";
        String username = "chldu";
        String passwd = "rH@ps0dydb";

        FastAutoGenerator.create(url, username, passwd)
                .globalConfig(builder -> {
                    builder.outputDir("D:\\baomidou")
                            .author("Charlie Du")
                            .commentDate("yyyy-mm-dd");
                })
                .packageConfig(builder -> {
                    builder.parent("top.afool")
                            .moduleName("demo")
                            .entity("entity")
                            .mapper("mapper")
                            .xml("mapper")
                            .service("service")
                            .serviceImpl("serviceImpl")
                            .controller("controller");
                })
                .strategyConfig(builder -> {
                    builder.addInclude("salesman")
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            .formatFileName("%sController")
                            .mapperBuilder()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .formatXmlFileName("%sMapper");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
