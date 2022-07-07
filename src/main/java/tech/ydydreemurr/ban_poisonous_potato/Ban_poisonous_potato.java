package tech.ydydreemurr.ban_poisonous_potato;

import org.bukkit.plugin.java.JavaPlugin;

public final class Ban_poisonous_potato extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("禁吃毒马铃薯插件已启动>w<");
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("禁吃马铃薯插件关闭=w=");
    }
}
