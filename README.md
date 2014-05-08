<center>![PluginTemplate](http://www.easymfne.net/images/plugintemplate.png)</center>

<center>[Source](https://github.com/EasyMFnE/PluginTemplate) |
[Change Log](https://github.com/EasyMFnE/PluginTemplate/blob/master/CHANGES.log) |
[Feature Request](https://github.com/EasyMFnE/PluginTemplate/issues) |
[Bug Report](https://github.com/EasyMFnE/PluginTemplate/issues) |
[Donate](https://www.paypal.com/cgi-bin/webscr?hosted_button_id=457RX2KYUDY5G&item_name=PluginTemplate&cmd=_s-xclick)</center>

<center>**Latest Version:** v1.0 for Bukkit 1.7+</center>

## About ##

PluginTemplate is a project for Minecraft designed to reduce the time overhead of creating new [Bukkit](https://bukkit.org/) plugins by providing a fully-featured pre-made project structure.  This project can also be useful as a reference for entry-level plugin developers and a tool for learning how plugins are written.

**Note:** This project is not a **Plugin**, it is a Plugin **Template**.

## Features ##

This project contains the following files:

- Sample `plugin.yml` (see [here](http://wiki.bukkit.org/Plugin_YAML) for help)
- Blank `config.yml`
- Main plugin class (enable, disable, saves default config, etc)
- Command handler class (registers, unregisters, and handles command)
- Configuration helper class (for interpreting `config.yml`)
- Event Listener class (registers and unregisters events)
- Permissions class (static, used to checking permissions)
- JUnit testing class (used to check plugin correctness)
- Maven `pom.xml` (typical use: `mvn clean package javadoc:jar install`)
- Maven `package.xml` (creates a secondary artifact with source code)
- MetricsLite included and shaded via Maven.  See [mcstats.org](http://mcstats.org)
- GNU [GPLv3](http://www.gnu.org/copyleft/gpl.html) License file (`LICENSE`)
- License file for Metrics (`METRICS-LICENSE`)
- This README template

The project populates the directory and package structures with each of the file in their place.  Each file also has an existing header for release under GNU GPLv3, and starter [Javadoc](http://www.oracle.com/technetwork/java/javase/documentation/javadoc-137458.html) documentation.

## Installation ##

1.  Clone PluginTemplate from the Github repository
    **-or-**
    Download and extract zipped source from Releases

## Permissions ##
## Commands ##
## Configuration ##
## Bugs/Requests ##

This template is continually tested to ensure that it is correct, but sometimes bugs can sneak in.  If you have found a bug within the project, or if you have a feature request, please [create an issue on Github](https://github.com/EasyMFnE/PluginTemplate/issues).

## Donations ##

Donating is a great way to thank the developer if you find the project useful for your server, and encourages work on more 100% free and open-source plugins.  If you would like to donate (any amount), there is an easily accessible link in the top right corner of this page.  Thank you!

## Privacy ##

This project template utilizes Hidendra's **Plugin-Metrics** system.  Users may opt out of this service by editing their configuration located in `plugins/Plugin Metrics`.  The following anonymous data is collected and sent to [mcstats.org](http://mcstats.org):

* A unique identifier
* The server's version of Java
* Whether the server is in online or offline mode
* The plugin's version
* The server's version
* The OS version, name, and architecture
* The number of CPU cores
* The number of online players
* The Metrics version

## License ##

This template is released as a free and open-source project under the [GNU General Public License version 3 (GPLv3)](http://www.gnu.org/copyleft/gpl.html).  To learn more about what this means, click that link or [read about it on Wikipedia](http://en.wikipedia.org/wiki/GNU_General_Public_License).
