
package lab10p2_fernandopadilla;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


class ArrayListComboBoxModel extends AbstractListModel implements ComboBoxModel{


  private Object selectedItem;

  private ArrayList anArrayList;

  public ArrayListComboBoxModel(ArrayList arrayList) {
    anArrayList = arrayList;
  }

  public Object getSelectedItem() {
    return selectedItem;
  }

  public void setSelectedItem(Object newValue) {
    selectedItem = newValue;
  }

  public int getSize() {
    return anArrayList.size();
  }

  public Object getElementAt(int i) {
    return anArrayList.get(i);
  }
    
}
