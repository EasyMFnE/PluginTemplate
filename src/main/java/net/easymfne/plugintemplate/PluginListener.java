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

import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

/**
 * The class that monitors and reacts to server events.
 * 
 * @author Eric Hildebrand
 */
public class PluginListener implements Listener {

    private PluginTemplate plugin = null;

    /**
     * Instantiate by getting a reference to the plugin instance and registering
     * each of the defined EventHandlers.
     * 
     * @param plugin Reference to PluginTemplate plugin instance
     */
    public PluginListener(PluginTemplate plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    /**
     * Unregister all registered EventHandlers, preventing further reactions.
     */
    public void close() {
        HandlerList.unregisterAll(this);
    }

}
