package proyectz;
//Importando cosas bukkit
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.event.player.*;
import org.bukkit.block.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
/**
 * Proyect Z Para bukkit
 * 
 * @author Alarar
 */
//Empezamos el class
public class Proyectoz extends JavaPlugin{

        Logger hola;
		public void onEnable(){
            hola = this.getLogger();
            hola.info("Activacion completada!");
                              }

        public void onDisable(){
            hola.info("Desactivado correctamente!");
                              }
                //Command
        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
            if(cmd.getName().equalsIgnoreCase("hola")){ //Si el jugador escribe /hola se ejecutara lo que sigue...
                // asdfasdf
                //Definiendo el jugador 
                Player player = null;
                player = (Player) sender;
                //Te da madera en tu inv
                Location loc = player.getPlayer().getLocation();
                PlayerInventory inventory = player.getInventory(); // Inventario del jugador!
            ItemStack woodstack = new ItemStack(Material.WOOD, 5); // Un stack de 5 de madera
            //Verifica que ya tenga la madera el player :)
            if (!inventory.contains(woodstack)) {
                inventory.addItem(woodstack); // Añade un stack al inventario del player
                //Ahora veremos para que te salga la localizacion!
                player.sendMessage(ChatColor.RED + "Hola! Has visto tus cinco de madera? :)" + "Estas en:" + loc);
                }
		
                sender.sendMessage(ChatColor.GOLD + "Tu eres un jugador!" + player.getDisplayName() );
                sender.sendMessage(ChatColor.GOLD + "X: " + loc.getX() );
                sender.sendMessage(ChatColor.GOLD + "Y: " + loc.getY() );
                sender.sendMessage(ChatColor.GOLD + "WORLD: " + loc.getWorld() ); //Ver las localizaciones :)
				
                return true;
                }
         
		 	
         return false;
			
			}
		
		}

