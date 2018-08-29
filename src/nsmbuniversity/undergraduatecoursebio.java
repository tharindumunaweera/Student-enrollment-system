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
public   class undergraduatecoursebio extends AbstractTableModel{
    private static final String[] columnName={"faculty","studentid","courseId","numofyrears"};
    private static ArrayList<UnderGraduateCourseDetail> list;
    
    
   undergraduatecoursebio(ArrayList<UnderGraduateCourseDetail> stlist){
        list=stlist;
    }

   
    @Override
    public int getRowCount() {
        return list.size();  //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columnName[columnIndex];
    }
    @Override
    public int getColumnCount() {
        return columnName.length; 
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
            case 3:
                return list.get(rowIndex).getNumOfYears();   
            default:
                return "error";
        } //To change body of generated methods, choose Tools | Templates.
    }

    

   

}   