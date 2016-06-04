
package com.adroitltd.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Okello
 */
public class TableViewMetaData {
  private String title;
  private List<Column> columns = new ArrayList<>();

    public List<Column> getColumns() {
        return columns;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
  
public void addColumn(String Caption, double Width, String binding){
    columns.add(new Column(Caption, Width, binding));
}  
  
public class Column{
  private String caption;
  private double Width;
  private String binding;

        public String getBinding() {
            return binding;
        }

        public String getCaption() {
            return caption;
        }

        public double getWidth() {
            return Width;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public void setWidth(double Width) {
            this.Width = Width;
        }
  
    public Column(String Caption, double Width, String Binding){
        this.Width = Width;
        this.binding = Binding;
        this.caption = Caption;
        }
    }


}
