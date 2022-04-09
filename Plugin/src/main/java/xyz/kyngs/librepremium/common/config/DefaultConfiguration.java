package xyz.kyngs.librepremium.common.config;

import org.spongepowered.configurate.CommentedConfigurationNode;
import xyz.kyngs.librepremium.common.config.key.ConfigurationKey;

import java.util.List;

/**
 * All the keys for the configuration.
 * BTW: Most of the comments were generated by GitHub's Copilot :D
 */
public class DefaultConfiguration {

    public static final CommentedConfigurationNode DEFAULT_CONFIGURATION;

    public static final ConfigurationKey<List<String>> ALLOWED_COMMANDS_WHILE_UNAUTHORIZED = new ConfigurationKey<>(
            "allowed-commands-while-unauthorized",
            List.of(
                    "login",
                    "register"
            ),
            "Commands that are allowed while the user is not authorized.",
            ConfigurateHelper::getStringList
    );

    public static final ConfigurationKey<String> LIMBO = new ConfigurationKey<>(
            "limbo",
            "",
            "The limbo, players should be sent to, when not authenticated.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<List<String>> PASS_THROUGH = new ConfigurationKey<>(
            "pass-through",
            List.of(
                    "lobby0",
                    "lobby1"
            ),
            "The server, player should be sent through, after they're authenticated.",
            ConfigurateHelper::getStringList
    );

    public static final ConfigurationKey<String> DEFAULT_CRYPTO_PROVIDER = new ConfigurationKey<>(
            "default-crypto-provider",
            "BCrypt-2A",
            """
                    The default crypto provider. This is used for hashing passwords. Available Providers:
                    SHA-256 - Older, not recommended. Kept for compatibility reasons.
                    SHA-512 - More safer than SHA-256, but still not recommended. Kept for compatibility reasons.
                    BCrypt-2A - Newer, more safe, recommended
                    """,
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<Boolean> KICK_ON_WRONG_PASSWORD = new ConfigurationKey<>(
            "kick-on-wrong-password",
            false,
            "Kick the player, if the password is wrong.",
            ConfigurateHelper::getBoolean
    );

    public static final ConfigurationKey<Boolean> USE_TITLES = new ConfigurationKey<>(
            "use-titles",
            true,
            "Whether or not to use titles when player is awaiting authentication.",
            ConfigurateHelper::getBoolean
    );

    public static final ConfigurationKey<String> NEW_UUID_CREATOR = new ConfigurationKey<>(
            "new-uuid-creator",
            "RANDOM",
            """
                    Sets which method should be used for creating fixed UUID when a new player is created.
                    See the wiki for further information: https://github.com/kyngs/LibrePremium/wiki/UUID-Creators
                    Available Creators:
                    RANDOM - Generates a random UUID
                    CRACKED - Generates a UUID based on the player's name, the same method as if the server was in offline mode
                    MOJANG - If the player exists in the Mojang's database, it will be used. Otherwise, CRACKED will be used.
                    """,
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<Boolean> AUTO_REGISTER = new ConfigurationKey<>(
            "auto-register",
            false,
            """
                    Should we automatically register all players with a premium nickname?
                    !!CRACKED PLAYERS WILL NOT BE ABLE TO REGISTER PREMIUM USERNAMES!!
                    """,
            ConfigurateHelper::getBoolean
    );

    public static final ConfigurationKey<Integer> MILLISECONDS_TO_REFRESH_NOTIFICATION = new ConfigurationKey<>(
            "milliseconds-to-refresh-notification",
            10000,
            """
                    This specifies how often players should be notified when not authenticated. Set to negative to disable.
                    This includes (but is not limited to):
                    - Message in chat
                    - Title
                    """,
            ConfigurateHelper::getInt
    );

    public static final ConfigurationKey<String> DATABASE_HOST = new ConfigurationKey<>(
            "database.host",
            "localhost",
            "The host of the database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<String> DATABASE_NAME = new ConfigurationKey<>(
            "database.database",
            "librepremium",
            "The name of the database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<String> DATABASE_PASSWORD = new ConfigurationKey<>(
            "database.password",
            "",
            "The password of the database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<Integer> DATABASE_PORT = new ConfigurationKey<>(
            "database.port",
            3306,
            "The port of the database.",
            ConfigurateHelper::getInt
    );

    public static final ConfigurationKey<String> DATABASE_USER = new ConfigurationKey<>(
            "database.user",
            "root",
            "The user of the database.",
            ConfigurateHelper::getString
    );
    
    public static final ConfigurationKey<Integer> DATABASE_CACHE = new ConfigurationKey<>(
            "database.cache",
            10,
            "Database cache time in minutes.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<Boolean> MIGRATION_ON_NEXT_STARTUP = new ConfigurationKey<>(
            "migration.on-next-startup",
            false,
            "Migrate the database on the next startup.",
            ConfigurateHelper::getBoolean
    );

    public static final ConfigurationKey<String> MIGRATION_TYPE = new ConfigurationKey<>(
            "migration.type",
            "",
            """
                    The type of the migration. Available Types:
                    JPremium - Can convert from JPremium SHA256
                    AuthMe - Can convert from AuthMe BCrypt and SHA256
                    Aegis - Can convert from Aegis BCrypt
                    DBA-SHA-512 - Can convert from DynamicBungeeAuth, which was configured to use SHA-512
                    """,
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<String> MIGRATION_OLD_DATABASE_HOST = new ConfigurationKey<>(
            "migration.old-database.host",
            "localhost",
            "The host of the old database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<String> MIGRATION_OLD_DATABASE_NAME = new ConfigurationKey<>(
            "migration.old-database.database",
            "",
            "The name of the old database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<String> MIGRATION_OLD_DATABASE_PASSWORD = new ConfigurationKey<>(
            "migration.old-database.password",
            "",
            "The password of the old database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<Integer> MIGRATION_OLD_DATABASE_PORT = new ConfigurationKey<>(
            "migration.old-database.port",
            3306,
            "The port of the old database.",
            ConfigurateHelper::getInt
    );

    public static final ConfigurationKey<String> MIGRATION_OLD_DATABASE_USER = new ConfigurationKey<>(
            "migration.old-database.user",
            "root",
            "The user of the old database.",
            ConfigurateHelper::getString
    );

    public static final ConfigurationKey<String> MIGRATION_OLD_DATABASE_TABLE = new ConfigurationKey<>(
            "migration.old-database.table",
            "user-data",
            "The table of the old database.",
            ConfigurateHelper::getString
    );

    static {
        DEFAULT_CONFIGURATION = CommentedConfigurationNode.root()
                .comment("""
                          !!THIS FILE IS WRITTEN IN THE HOCON FORMAT!!
                          The hocon format is very similar to JSON, but it has some extra features.
                          You can find more information about the format on the sponge wiki:
                          https://docs.spongepowered.org/stable/en/server/getting-started/configuration/hocon.html
                          ----------------------------------------------------------------------------------------
                          LibrePremium Configuration
                          ----------------------------------------------------------------------------------------
                          This is the configuration file for LibrePremium.
                          You can find more information about LibrePremium on the github page:
                          https://github.com/kyngs/LibrePremium
                        """);

        var helper = new ConfigurateHelper(DEFAULT_CONFIGURATION);

        helper.setDefault(ALLOWED_COMMANDS_WHILE_UNAUTHORIZED);
        helper.setDefault(LIMBO);
        helper.setDefault(PASS_THROUGH);
        helper.setDefault(KICK_ON_WRONG_PASSWORD);
        helper.setDefault(DEFAULT_CRYPTO_PROVIDER);
        helper.setDefault(USE_TITLES);
        helper.setDefault(NEW_UUID_CREATOR);
        helper.setDefault(AUTO_REGISTER);
        helper.setDefault(MILLISECONDS_TO_REFRESH_NOTIFICATION);

        helper.setDefault(DATABASE_HOST);
        helper.setDefault(DATABASE_PORT);
        helper.setDefault(DATABASE_USER);
        helper.setDefault(DATABASE_PASSWORD);
        helper.setDefault(DATABASE_NAME);

        helper.setDefault(MIGRATION_ON_NEXT_STARTUP);
        helper.setDefault(MIGRATION_TYPE);
        helper.setDefault(MIGRATION_OLD_DATABASE_HOST);
        helper.setDefault(MIGRATION_OLD_DATABASE_PORT);
        helper.setDefault(MIGRATION_OLD_DATABASE_USER);
        helper.setDefault(MIGRATION_OLD_DATABASE_PASSWORD);
        helper.setDefault(MIGRATION_OLD_DATABASE_NAME);
        helper.setDefault(MIGRATION_OLD_DATABASE_TABLE);

    }

}
