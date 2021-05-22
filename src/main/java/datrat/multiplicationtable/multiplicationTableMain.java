package datrat.multiplicationtable;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class multiplicationTableMain extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable() {
		Objects.requireNonNull(this.getCommand("multiply"));
	}

	@Override
	public void onDisable() {
	}

	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("multiply")) {
			Player player = (Player) sender;
			if (args.length == 0) {
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You didn't give me a number.");
				return true;
			}
			if (args.length == 1 && isInt(args[0])) {
				int x = Integer.parseInt(args[0]);
				int x2 = x * 2;
				int x3 = x * 3;
				int x4 = x * 4;
				int x5 = x * 5;
				int x6 = x * 6;
				int x7 = x * 7;
				int x8 = x * 8;
				int x9 = x * 9;

				// Expanding!

				int x10 = x * 10;
				int x11 = x * 11;
				int x12 = x * 12;
				int x13 = x * 13;
				int x14 = x * 14;
				int x15 = x * 15;
				int x16 = x * 16;
				int x17 = x * 17;
				int x18 = x * 18;

				// Holy shit, that is what a call EXPANDING BITCHES!

				int x19 = x * 19;
				int x20 = x * 20;
				int x21 = x * 21;
				int x22 = x * 22;
				int x23 = x * 23;
				int x24 = x * 24;
				int x25 = x * 25;
				int x26 = x * 26;
				int x27 = x * 27;

				 player.sendMessage(ChatColor.GOLD + "------- " + "Multiplication Table for: " + ChatColor.RED + x + ChatColor.GOLD + " -------");
				 player.sendMessage("");
				 player.sendMessage("  " + x + " x 1 = " + x + "  " + x + " x 10 = " + x10 + "  " + x + " x 19 = " + x19);
				 player.sendMessage("  " + x + " x 2 = " + x2 + "  " + x + " x 11 = " + x11 + "  " + x + " x 20 = " + x20);
				 player.sendMessage("  " + x + " x 3 = " + x3 + "  " + x + " x 12 = " + x12 + "  " + x + " x 21 = " + x21);
				 player.sendMessage("  " + x + " x 4 = " + x4 + "  " + x + " x 13 = " + x13 + "  " + x + " x 22 = " + x22);
				 player.sendMessage("  " + x + " x 5 = " + x5 + "  " + x + " x 14 = " + x14 + "  " + x + " x 23 = " + x23);
				 player.sendMessage("  " + x + " x 6 = " + x6 + "  " + x + " x 15 = " + x15 + "  " + x + " x 24 = " + x24);
				 player.sendMessage("  " + x + " x 7 = " + x7 + "  " + x + " x 16 = " + x16 + "  " + x + " x 25 = " + x25);
				 player.sendMessage("  " + x + " x 8 = " + x8 + "  " + x + " x 17 = " + x17 + "  " + x + " x 26 = " + x26);
				 player.sendMessage("  " + x + " x 9 = " + x9 + "  " + x + " x 18 = " + x18 + "  " + x + " x 27 = " + x27);
				 player.sendMessage("");
				 player.sendMessage(ChatColor.GOLD + "------------------------------------");
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "Your argument is not a number, if else, something is wrong.");
				return true;
			}
		}
		return false;
	}
}
