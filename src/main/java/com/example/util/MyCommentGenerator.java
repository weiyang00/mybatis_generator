package com.example.util;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * mybatis generator生成注释插件
 * <p>
 */
public class MyCommentGenerator extends DefaultCommentGenerator {
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    /**
     * 是否取消注释
     */
    private boolean suppressAllComments;
    private String currentDateStr;

    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

//    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
//                                 IntrospectedColumn introspectedColumn) {
//
//    }
//
//    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
//                                 IntrospectedColumn introspectedColumn) {
//
//    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

        StringBuilder sb = new StringBuilder();

        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(sb.toString());

        sb.setLength(0);
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        sb.append(" ");
        sb.append(currentDateStr);
        innerClass.addJavaDocLine(" */");
        sb.setLength(0);
        sb.append("@Table ( name = \"").append(introspectedTable.getFullyQualifiedTable()).append("\")");
        innerClass.addJavaDocLine(sb.toString());
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        if (suppressAllComments) {
            return;
        }

    }


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Properties getSystemPro() {
        return systemPro;
    }

    public void setSystemPro(Properties systemPro) {
        this.systemPro = systemPro;
    }

    public boolean isSuppressDate() {
        return suppressDate;
    }

    public void setSuppressDate(boolean suppressDate) {
        this.suppressDate = suppressDate;
    }

    public boolean isSuppressAllComments() {
        return suppressAllComments;
    }

    public void setSuppressAllComments(boolean suppressAllComments) {
        this.suppressAllComments = suppressAllComments;
    }

    public String getCurrentDateStr() {
        return currentDateStr;
    }

    public void setCurrentDateStr(String currentDateStr) {
        this.currentDateStr = currentDateStr;
    }
}
