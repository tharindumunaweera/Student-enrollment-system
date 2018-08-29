/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nsmbuniversity;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tharindu dilshan
 */
public class PostGraduateCourseBio extends AbstractTableModel{
     private static final String[] columnName={"faculty","studentid","courseid"};
     private static ArrayList<PostGraduateCourseDetail>list;
     
     
    PostGraduateCourseBio(ArrayList<PostGraduateCourseDetail> stlist){
        list=stlist;
    }
     
    @Override
    public int getRowCount() {
        return list.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
     public String getColumnName(int columnIndex){
        return columnName[columnIndex];
    }
    
    @Override
    public int getColumnCount() {
        return columnName.length;  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex){
            case 0:
                return list.get(rowIndex).getFaculty();
            case 1:
                return list.get(rowIndex).getStudentId();
            case 2:
                return list.get(rowIndex).getCourseId();
            default:
                return null;
    }
    
}
}