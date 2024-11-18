package com.biit.drools.plugin;

import com.biit.plugins.BasePlugin;
import com.biit.plugins.configuration.PluginConfigurationReader;
import com.biit.plugins.interfaces.IPlugin;
import org.pf4j.Extension;
import org.springframework.beans.factory.annotation.Autowired;

@Extension
public class KnowledgeSystemRequest extends BasePlugin implements IPlugin {

    private static final String PLUGIN_NAME = "knowledge-base-drools-plugin";

    @Override
    public String getPluginName() {
        return PLUGIN_NAME;
    }

    @Autowired
    public KnowledgeSystemRequest(PluginConfigurationReader pluginConfigurationReader) {
        super();
    }


    public String methodGetsKnowledgeSystemText(String textAlias) {
        return "$KnowledgeSystem{" + textAlias + "}";
    }

}
