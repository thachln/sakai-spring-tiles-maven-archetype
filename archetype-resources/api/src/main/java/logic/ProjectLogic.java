#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.logic;

import java.util.List;

import ${package}.model.Item;

/**
 * An example logic interface
 * 
 * @author Mike Jennings (mike_jennings@unc.edu)
 *
 */
public interface ProjectLogic {

	/**
	 * Get a list of Items
	 * @return
	 */
	public List<Item> getItems();
}
