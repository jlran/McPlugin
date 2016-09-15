package com.github.jlran;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstMcPlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		//当插件被加载时调用
		getLogger().info("onEnable 被加载了....");
	}
	
	@Override
	public void onDisable() {
		//当插件卸载时调用
		//getLogger().info("onDisable 被卸载了....");
	}
}
