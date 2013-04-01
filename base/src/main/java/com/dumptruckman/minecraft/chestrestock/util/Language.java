package com.dumptruckman.minecraft.chestrestock.util;

import com.dumptruckman.minecraft.chestrestock.ChestConstants;
import com.dumptruckman.minecraft.pluginbase.messages.Message;

public class Language {

    public static final Message IN_GAME_ONLY = Message.createMessage("cmd.in_game_only",
            "You may only use this command in game!");
    public static final Message TARGETING = Message.createMessage("cmd.targeting",
            "You must be targeting a chest to use this command!");
    public static final Message CMD_NOT_RCHEST = Message.createMessage("cmd.not_restock_chest",
            "The targeted chest is not managed by ChestRestock.");
    public static final Message CMD_CHEST_DISABLED = Message.createMessage("cmd.chest_disabled",
            "The targeted is managed by ChestRestock but is disabled! (use &6/cr set enabled true&f to enable)");
    public static final Message CMD_INVALID_WORLD = Message.createMessage("cmd.invalid_world",
            "%1 is not a valid world name!");
    public static final Message CMD_PATIENCE = Message.createMessage("cmd.patience",
            "This command may cause server lag.  Please be patient...");
    public static final Message CMD_POSITIVE_NUMBER = Message.createMessage("cmd.positive_number",
            "You must indicate a positive number!");

    public static final Message CMD_CREATE_NAME = Message.createMessage("cmd.create.name",
            "Initiates targeted chest for restocking.");
    public static final Message CMD_CREATE_ALREADY_MADE = Message.createMessage("cmd.create.already_made",
            "This chest is already configured! Make use of the other sub-commands to change the options for this chest."
            + "\nTo update the chest contents, use the update sub-command.");
    public static final Message CMD_CREATE_SUCCESS = Message.createMessage("cmd.create.success",
            "This chest will restock with the items currently inside of it, every %1 seconds. (default)");
    public static final Message CMD_CREATE_ERROR = Message.createMessage("cmd.create.error",
            "There was an internal error while creating a new restock chest.  Please refer to server.log");

    public static final Message CMD_DEFAULTS_NAME = Message.createMessage("cmd.defaults.name",
            "Checks the global defaults or defaults for specified world");
    public static final Message CMD_DEFAULTS_NO_DEFAULTS = Message.createMessage("cmd.defaults.no_defaults",
            "No specific defaults for world: %1");
    public static final Message CMD_DEFAULTS_GLOBAL = Message.createMessage("cmd.defaults.global",
            "&6=== Global Defaults ===");
    public static final Message CMD_DEFAULTS_WORLD = Message.createMessage("cmd.defaults.world",
            "&6=== World Defaults: %1 ===");

    public static final Message CMD_CHECK_NAME = Message.createMessage("cmd.check.name",
            "Checks a chest and gives info relating to ChestRestock");
    public static final Message CMD_CHECK_INFO = Message.createMessage("cmd.check.info",
            "&6=== Chest Settings @ %1 ===");

    public static final Message CMD_UPDATE_NAME = Message.createMessage("cmd.update.name",
            "Updates the restocking contents of a chest.");
    public static final Message CMD_UPDATE_SUCCESS = Message.createMessage("cmd.update.success",
            "Chest will now restock with the items currently inside of it.");

    public static final Message CMD_DISABLE_NAME = Message.createMessage("cmd.disable.name",
            "Disables restocking for a chest.");
    public static final Message CMD_DISABLE_SUCCESS = Message.createMessage("cmd.disable.success",
            "Chest will no longer be managed by ChestRestock.");

    public static final Message CMD_RESTOCK_NAME = Message.createMessage("cmd.restock.name",
            "Restocks a chest immediately.");
    public static final Message CMD_RESTOCK_SUCCESS = Message.createMessage("cmd.restock.success",
            "Chest has been restocked!");

    public static final Message CMD_RESTOCKALL_NAME = Message.createMessage("cmd.restockall.name",
            "Restocks all or specified chests immediately.");
    public static final Message CMD_RESTOCKALL_SUCCESS = Message.createMessage("cmd.restockall.success",
            "%1 chest(s) have been restocked!");

    public static final Message CMD_CREATEALL_NAME = Message.createMessage("cmd.createall.name",
            "Enables all inventory blocks in the specified area (LOADED CHUNKS ONLY!) as ChestRestock chests.");
    public static final Message CMD_CREATEALL_INVALID_TYPE = Message.createMessage("cmd.createall.invalid_type",
            "That is not a valid inventory type!"
            + "\nValid options are: &b%1");
    public static final Message CMD_CREATEALL_CONFIRM = Message.createMessage("cmd.createall.confirm",
            "This command will potentially affect a LARGE amount of chests."
            + "\nIf you still wish to execute &c/cr createall&f");
    public static final Message CMD_CREATEALL_SUCCESS = Message.createMessage("cmd.createall.success",
            "%1 chest(s) have been restocked!");

    public static final Message CMD_DEFAULT_NAME = Message.createMessage("cmd.default.name",
            "Alters a default property.");
    public static final Message CMD_DEFAULT_SUCCESS_WORLD = Message.createMessage("cmd.default.success.world",
            "'%1' for world '%2' is now '%3'");
    public static final Message CMD_DEFAULT_SUCCESS_GLOBAL = Message.createMessage("cmd.default.success.global",
            "'%1' for global defaults is now '%2'");

    public static final Message CMD_SET_NAME = Message.createMessage("cmd.set.name",
            "Sets a property of a restock chest.");
    public static final Message CMD_SET_NEW_CMD = Message.createMessage("cmd.set.new_cmd",
            "If you are trying to set up a restock chest, use the \"create\" command instead.");
    public static final Message CMD_SET_LIST_PROPS = Message.createMessage("cmd.set.list_props",
            "Possible properties you may set are: %1");
    public static final Message CMD_SET_INVALID_PROP = Message.createMessage("cmd.set.invalid_prop",
            "'%1' is not a valid chest property!");
    public static final Message CMD_SET_INVALID_VALUE = Message.createMessage("cmd.set.invalid_value",
            "'%1' is not a valid value for '%2'!"
            + "\nUse '/%1' for more information.");
    public static final Message CMD_SET_POSSIBLE_VALUES = Message.createMessage("cmd.set.possible_values",
            "Possible values for property '%1' are: %2");
    public static final Message CMD_SET_SUCCESS = Message.createMessage("cmd.set.success",
            "'%1' for this chest is now '%2'!");

    public static final Message PERIOD_DESC = Message.createMessage("props.period.desc",
            "This will change the period at which the chest restocks its contents.");
    public static final Message PERIOD_MODE_DESC = Message.createMessage("props.period_mode.desc",
            "This will change the period mode of the chest.  Options are \"player\" and \"fixed\"."
            + "\nPlayer mode means the chest will restock every Period amount of seconds after a player checks a restocked chest."
            + "\nFixed mode means the chest will restock every Period amount of seconds after configuration, regardless of player interaction.");
    public static final Message PERIOD_MODE_INVALID = Message.createMessage("props.period_mode.invalid",
            "Valid options are \"player\" and \"fixed\"!");
    public static final Message RESTOCK_MODE_DESC = Message.createMessage("props.restock_mode.desc",
            "This will change the restock mode of the chest.  Options are \"add\" and \"replace\"."
            + "\nAdd mode means the restock items will be added to whatever is in the chest."
            + "\nReplace mode means the restock items will replace anything in the chest.");
    public static final Message RESTOCK_MODE_INVALID = Message.createMessage("props.restock_mode.invalid",
            "Valid options are \"add\" and \"replace\"!");
    public static final Message PRESERVE_SLOTS_DESC = Message.createMessage("props.preserve_slots.desc",
            "This will set the default setting for whether or not to preserve the item slots of chests that are restocked."
            + "\nThat is to say, the position of restocked items will stay the same.");
    public static final Message INDESTRUCTIBLE_DESC = Message.createMessage("props.indestructible.desc",
            "This will cause a chest managed by dChest to become indestructible except by those with sufficient permission.");
    public static final Message PLAYER_LIMIT_DESC = Message.createMessage("props.player_limit.desc",
            "This will change the number of times a single player can loot the chest."
            + "\n-1 = no limit, 0 = none or permission based"
            + "\n1 (or greater) = number of times a chest will restock for a player.");
    public static final Message UNIQUE_DESC = Message.createMessage("props.unique.desc",
            "Ensures that the chest is unique per player.  This means, they will each see a different set of items per chest");
    public static final Message ENABLED_DESC = Message.createMessage("props.enabled.desc",
            "Whether this chest is enabled with ChestRestock properties.  A setting of false makes the chest behave as a NORMAL chest.");
    public static final Message NAME_DESC = Message.createMessage("props.name.desc",
            "A name for this chest.  This is used for giving specific permissions for a chest.");
    public static final Message REDSTONE_DESC = Message.createMessage("props.redstone.desc",
            "This will cause the chest to be restocked when it receives redstone power.");
    public static final Message ACCEPT_POLL_DESC = Message.createMessage("props.accept_poll.desc",
            "When true, the global polling task for ChestRestock will check to see if this chest needs to restock and restock it if it is time.");
    public static final Message LOOT_TABLE_DESC = Message.createMessage("props.loot_table.desc",
            "The name of the loot table to use as defined in loot_tables.yml");
    public static final Message GLOBAL_MESSAGE_DESC = Message.createMessage("props.global_message.desc",
            "A message to be broadcast to the server when this chest restocks.  Blank means no message.");
    public static final Message ONLY_RESTOCK_EMPTY_DESC = Message.createMessage("props.only_restock_empty.desc",
            "When true, only empty chests will restock.");

    public static final Message AUTO_CREATE_DESC = Message.createMessage("props.other.auto_create.desc",
            "Automatically initializes chests, when opened, as if you created them with /cr create.");
    public static final Message AUTO_CREATE_NEW_DESC = Message.createMessage("props.other.auto_create_new.desc",
            "Automatically initializes chests, when placed, as if you created them with /cr create but only if auto_create is enabled.  Most useful when set to false so auto_create only affects chests previously on the map and not ones places by players.");
    public static final Message EMPTY_LOOT_TABLE_DESC = Message.createMessage("props.other.empty_loot_table.desc",
            "The loot table to use for empty chests.");

    public static final Message MAX_INVENTORY_SIZE_INVALID = Message.createMessage("settings.max_inventory_size.invalid",
            "You must specify a number that is equal to or larger than " + ChestConstants.MIN_MAX_INVENTORY_SIZE);

}
