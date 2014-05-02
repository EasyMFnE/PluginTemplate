/*
 * This file is part of the PluginTemplate plugin by EasyMFnE.
 *
 *   PluginTemplate is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free 
 * Software Foundation, either version 3 of the License, or any later version.
 *
 *   PluginTemplate is distributed in the hope that it will be useful, but 
 * without any warranty; without even the implied warranty of merchantability or
 * fitness for a particular purpose.  See the GNU General Public License for
 * details.
 *
 *   You should have received a copy of the GNU General Public License v3 along
 * with PluginTemplate.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.easymfne.plugintemplate;

import java.io.File;
import java.util.Calendar;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main plugin class, responsible for its own setup, logging, reloading, and
 * shutdown operations.  Maintains instances of PluginConfig, PluginCommand, and
 * PluginListener.
 * 
 * @author Eric Hildebrand
 */
public class PluginTemplate extends JavaPlugin {

    private PluginConfig pluginConfig = null;
    private PluginCommand pluginCommand = null;
    private PluginListener pluginListener = null;

    /* Strings for fancyLog() methods */
    private final String logPrefix = ChatColor.BLUE + "[PluginTemplate] ";
    private final String logColor = ChatColor.YELLOW.toString();

    /**
     * Set up the plugin by: loading config.yml (creating from default if not
     * existent), then instantiating its own PluginConfig, PluginCommand, and
     * PluginListener objects.  Displays elapsed time to console when finished.
     */
    @Override
    public void onEnable() {
        long start = Calendar.getInstance().getTimeInMillis();
        fancyLog("=== ENABLE START ===");
        File configFile = new File(getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            saveDefaultConfig();
            fancyLog("Saved default config.yml");
        }

        this.pluginConfig = new PluginConfig(this);
        this.pluginCommand = new PluginCommand(this);
        this.pluginListener = new PluginListener(this);
        fancyLog("=== ENABLE COMPLETE (" + (Calendar.getInstance().getTimeInMillis() - start) + "ms) ===");
    }

    /**
     * Reload the configuration from disk and perform any necessary functions.
     * Displays elapsed time to console when finished.
     */
    public void reload() {
        long start = Calendar.getInstance().getTimeInMillis();
        fancyLog("=== RELOAD START ===");
        reloadConfig();
        fancyLog("=== RELOAD COMPLETE (" + (Calendar.getInstance().getTimeInMillis() - start) + "ms) ===");
    }

    /**
     * Close all event handlers and command listeners, then null instances to
     * mark them for garbage collection.  Displays elapsed time to console when
     * finished.
     */
    @Override
    public void onDisable() {
        long start = Calendar.getInstance().getTimeInMillis();
        fancyLog("=== DISABLE START ===");
        pluginListener.close();
        pluginListener = null;
        pluginCommand.close();
        pluginCommand = null;
        pluginConfig = null;
        fancyLog("=== DISABLE COMPLETE (" + (Calendar.getInstance().getTimeInMillis() - start) + "ms) ===");
    }

    /**
     * @return the configuration helper instance
     */
    public PluginConfig getPluginConfig() {
        return pluginConfig;
    }

    /**
     * Log a message to the console using color, defaulting to the Info level.
     * If there is no console open, log the message without any coloration.
     * 
     * @param message The message to be logged
     */
    protected void fancyLog(String message) {
        fancyLog(Level.INFO, message);
    }

    /**
     * Log a message to the console using color, with a specific logging Level.
     * If there is no console open, log the message without any coloration.
     * 
     * @param level Level at which the message should be logged
     * @param message The message to be logged
     */
    protected void fancyLog(Level level, String message) {
        if (getServer().getConsoleSender() != null)
            getServer().getConsoleSender().sendMessage(logPrefix + logColor + message);
        else
            getServer().getLogger().log(level, ChatColor.stripColor(logPrefix + message));
    }

}
