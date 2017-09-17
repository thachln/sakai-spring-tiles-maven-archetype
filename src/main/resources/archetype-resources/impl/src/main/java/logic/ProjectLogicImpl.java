#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Licensed to MKS Group under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * MKS Group licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ${package}.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ${package}.model.Item;

/**
 * Implementation of {@link ProjectLogic}
 * 
 * @author Mike Jennings (mike_jennings@unc.edu)
 *
 */
public class ProjectLogicImpl implements ProjectLogic {

	private static final Logger log = Logger.getLogger(ProjectLogicImpl.class);

	
	/**
	 * {@inheritDoc}
	 */
	public List<Item> getItems() {
		
		List<Item> items = new ArrayList<Item>();
		
//		items.add(new Item(1,"hello"));
//		items.add(new Item(2,"world"));
		
		return items;
		
	}
	
	/**
	 * init - perform any actions required here for when this bean starts up
	 */
	public void init() {
		log.info("init");
	}

}
