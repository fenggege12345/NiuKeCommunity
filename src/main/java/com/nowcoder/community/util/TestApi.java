package com.nowcoder.community.util;


import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

public class TestApi {

        public static void main(String[] args) {
            DocsConfig config = new DocsConfig();
            // 项目根目录
            config.setProjectPath("G:\\code\\NiuKeCommunity");
            // 项目名称
            config.setProjectName("NiuKeCommunity");
            // 声明该API的版本
            config.setApiVersion("V1.0");
            // 生成API 文档所在目录
            config.setDocsPath("G:\\code\\NiuKeCommunity\\apiDoc");
            // 配置自动生成
            config.setAutoGenerate(Boolean.TRUE);
            // 执行生成文档
            Docs.buildHtmlDocs(config);
        }

    }
