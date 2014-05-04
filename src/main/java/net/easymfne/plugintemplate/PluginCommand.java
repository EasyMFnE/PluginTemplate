/*
 * This file is part of the PluginTemplate plugin by EasyMFnE.
 * 
 * PluginTemplate is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or any later version.
 * 
 * PluginTemplate is distributed in the hope that it will be useful, but without
 * any warranty; without even the implied warranty of merchantability or fitness
 * for a particular purpose. See the GNU General Public License for details.
 * 
 * You should have received a copy of the GNU General Public License v3 along
 * with PluginTemplate. If not, see <http://www.gnu.org/licenses/>.
 */
package net.easymfne.plugintemplate;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * The class that handles the "/plugincommand" command for the plugin.
 * 
 * @author Eric Hildebrand
 */
public class PluginCommand implements CommandExecutor {
    
    private PluginTemplate plugin = null;
    
    /**
     * Instantiate by getting a reference to the plugin instance and registering
     * this class to handle the '/plugincommand' command.
     * 
     * @param plugin
     *            Reference to PluginTemplate plugin instance
     */
    public PluginCommand(PluginTemplate plugin) {
        this.plugin = plugin;
        plugin.getCommand("plugincommand").setExecutor(this);
    }
    
    /**
     * Release the '/plugincommand' command from its ties to this class.
     */
    public void close() {
        plugin.getCommand("plugincommand").setExecutor(null);
    }
    
    /**
     * This method handles user commands. Usage: "/plugincommand"
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command,
            String label, String[] args) {
        // TODO: stub
        return false;
    }
    
}
