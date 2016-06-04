
package com.adroitltd.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Okello
 */
public class MenuGroup extends MenuItem{
        private List<MenuItem> children = new ArrayList<>();

        public MenuGroup(String caption) {
            super(0, caption);
        }
        public void addMenuItem(MenuItem menuItem){
            children.add(menuItem);
        }
        public List<MenuItem> getChildren(){
            return children;
        }
    }