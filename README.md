# PluginTemplate #
This is a template for quickly starting a new Plugin project for Minecraft using the Bukkit API.  Included are:

- Sample `plugin.yml`
- Blank `config.yml`
- Main plugin class (enable, disable, saves default config, etc)
- Command handler class (registers, unregisters, and handles command)
- Configuration helper class (for interpreting `config.yml`)
- Event Listener class (registers and unregisters events)
- Permissions class (static, used to checking permissions)
- JUnit testing class (used to check plugin correctness)
- Maven `pom.xml` (typical use: `mvn clean package install`)
- Maven `package.xml` (creates a secondary artifact with source code)
