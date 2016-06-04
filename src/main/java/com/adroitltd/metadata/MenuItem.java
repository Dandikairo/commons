
package com.adroitltd.metadata;

/**
 *
 * @author Okello
 */
public class MenuItem{
        private String caption;
        private int target;

        public MenuItem(int target, String caption) {
            this.caption = caption;
            this.target = target;
            
        }

        @Override
        public String toString() {
            return caption;
        }

        public int getTarget() {
            return target;
        }
        
    }