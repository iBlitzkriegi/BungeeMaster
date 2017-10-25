package me.tonymaster21.bungeemaster;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.ExpressionType;
import me.tonymaster21.bungeemaster.Effects.*;
import me.tonymaster21.bungeemaster.Expressions.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
// import java.lime.lang;

/**
 * Created by TonyMaster21 on 10/21/2017.
 */
public class BungeeMaster extends JavaPlugin {
    private static SkriptAddon addonInstance;
    @Override
    public void onEnable(){
        getLogger().info("For help with BungeeMaster, please visit https://bungeemaster.tonymaster21.me");
        if (Bukkit.getPluginManager().getPlugin("BungeeBridgeC") != null) {
            if (Bukkit.getPluginManager().getPlugin("Skript") != null) {
                Skript.registerAddon(this);
                addonInstance = this;
                getAddonInstance.loadClasses("me.tonymaster21.bungeemaster", "effects", "expressions");
            }else{
                getLogger().info("You must have Skript installed in order to use this plugin.")
            }
        }else{
                getLogger().info("BungeeBridgeClient is not installed on your server. This plugin will not work!");
        }
    }
    public static SkriptAddon getAddonInstance(){
    if(addonInstance == null) {
        addonInstance = Skript.registerAddon(getInstance());
    }
    return addonInstance;
}

    public void onDisable(){
        getLogger().info("Thank you for using BungeeMaster. Have a nice day!");
    }

}
