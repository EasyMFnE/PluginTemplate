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
package net.easymfne.plugintemplate.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class used for testing plugin functionality using the JUnit framework.
 * Testing is important for detecting bugs and tracking the effects of changes.
 * 
 * @author Eric Hildebrand
 */
public class PluginTest {
    
    /**
     * Verify that one is greater than zero as an example.
     */
    @Test
    public void testTrue() {
        assert(1 > 0);
    }
    
    /**
     * Fail a test as an example.
     */
    @Test
    public void testFalse() {
        fail("Not yet implemented");
    }
    
}
