/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nsmbuniversity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBOperation {
    
        String url="jdbc:mysql://localhost:3306/nsbm";
        String username="root";
        String password="";
        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
    void underGraduateStudent(UnderGraduateDetail ugd){
        //stote details of students
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO undergraduatestudent VALUES(?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setString(1, ugd.getFullName());
            pst.setInt(2,ugd.getStudentId() );
            pst.setString(3, ugd.getDob());
            pst.setInt(4,ugd.getAge());
            pst.setString(5,ugd.getAddress());
            pst.setInt(6,ugd.getAlIndex() );
            pst.setInt(7,ugd.getRank());
                        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    
    void underGraduateCourse(UnderGraduateCourseDetail ugd){
        
        //store under graduate course details to database
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO undergraduatecourse VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setString(1, ugd.getFaculty());
            pst.setInt(2,ugd.getStudentId() );
            pst.setString(3, ugd.getCourseId());
            pst.setInt(4, ugd.getNumOfYears());
            pst.setString(5,ugd.getMainSubject1());
            pst.setString(6,ugd.getMainSubject2());
            pst.setString(7, ugd.getSubject1());
            pst.setString(8,ugd.getSubject2());
            pst.setString(9,ugd.getSubject3());
            pst.setString(10,ugd.getSubject4());
            pst.setInt(11, ugd.getMain1payment());
            pst.setInt(12,ugd.getMain2payment());
            pst.setInt(13, ugd.getSub1payment());
            pst.setInt(14, ugd.getSub2payment());
            pst.setInt(15, ugd.getSub3payment());
            pst.setInt(16, ugd.getSub4payment());
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    
    ArrayList<UnderGraduateCourseDetail> getstudent(){ 
        
        //create object of UnderGraduateCourseDetailUnderGraduateCourseDetail
        try{
            ArrayList<UnderGraduateCourseDetail> list= new ArrayList<UnderGraduateCourseDetail>();
          
            
            con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="SELECT * FROM undergraduatecourse";
            pst=(PreparedStatement)con.prepareStatement(query);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
            UnderGraduateCourseDetail sb=new UnderGraduateCourseDetail();
                sb.setFaculty(rs.getString(1));
                sb.setStudentId(rs.getInt(2));
                sb.setCourseId(rs.getString(3));
                sb.setNumOfYears(rs.getInt(4));
                sb.setMainSubject1(rs.getString(5));
                sb.setMainSubject2(rs.getString(6));
                sb.setSubject1(rs.getString(7));
                sb.setSubject2(rs.getString(8));
                sb.setSubject3(rs.getString(9));
                sb.setSubject4(rs.getString(10));
            
            list.add(sb);
            }
            return list;
        }catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
    } 
    
    ArrayList<UnderGraduateDetail> getstudent10(){ 
        
        //create object of UnderGraduateDetail
        try{
            ArrayList<UnderGraduateDetail> list= new ArrayList<UnderGraduateDetail>();
          
            
            con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="SELECT * FROM undergraduatestudent";
            pst=(PreparedStatement)con.prepareStatement(query);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
            UnderGraduateDetail sb=new UnderGraduateDetail();
                sb.setFullName(rs.getString(1));
                sb.setStudentId(rs.getInt(2));
                sb.setDob(rs.getString(3));
                sb.setAge(rs.getInt(4));
                sb.setAddress(rs.getString(5));
                sb.setAlIndex(rs.getInt(6));
                sb.setRank(rs.getInt(7));
                
            
            list.add(sb);
            }
            return list;
        }catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
    }
    
    
    void underGraduateResult(UnderGraduateResult em ){
        //store under graduate result in database
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO undergraduateresult VALUES(?,?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setInt(1, em.getStudentId());
            pst.setString(2, em.getCourseId());
            pst.setString(3, em.getFaculty());
            pst.setString(4,em.getMainSubject1Rus() );
            pst.setString(5, em.getMainSubject1Rus());
            pst.setString(6,em.getSubject1Rus());
            pst.setString(7, em.getSubject2Rus());
            pst.setString(8, em.getSubject3Rus());
            pst.setString(9, em.getSubject4Rus());
           
            
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    
    public ResultSet find(String s,String s1){
        
        //find the data with relavent to student id and course id
        try{
            con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="SELECT * FROM undergraduateresult WHERE studentid=? AND courseid=?";
            pst=(PreparedStatement)con.prepareStatement(query);
            pst.setString(1, s);
            pst.setString(2, s1);
           
            rs=pst.executeQuery();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return rs;
    }
    
    
    
    
    int checkStudentId(String studentid){
        try{
            con=(Connection)DriverManager.getConnection(url,username,password);
            String query="SELECT studentid FROM undergraduatestudent";
            pst=(PreparedStatement)con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                if(studentid.equals(rs.getString(1))){
                    return 0;
                }
            }
            return 1;
            
        }catch(Exception e){
            System.out.println(e);
            return 2;
        }
        
        
    
    }
    
    int checkStudentId2(String studentid,String courseid){
        try{
            con=(Connection)DriverManager.getConnection(url,username,password);
            String query="SELECT studentid,courseid FROM undergraduateresult";
            pst=(PreparedStatement)con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                if(studentid.equals(rs.getString(1))&& courseid.equals(rs.getString(2))){
                    return 0;
                }
            }
            return 1;
            
        }catch(Exception e){
            System.out.println(e);
            return 2;
        }
        
        
    
    }
    
    int checkStudentId3(String studentid,String courseid){
        try{
            con=(Connection)DriverManager.getConnection(url,username,password);
            String query="SELECT studentid,courseid FROM undergraduatecourse";
            pst=(PreparedStatement)con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                if(studentid.equals(rs.getString(1))&& courseid.equals(rs.getString(2))){
                    return 0;
                }
            }
            return 1;
            
        }catch(Exception e){
            System.out.println(e);
            return 2;
        }
        
        
    
    }
    
    
    
    
     void PostGraduateCourse(PostGraduateCourseDetail ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO postgraduatecourse VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setString(1, ugd.getFaculty());
            pst.setInt(2,ugd.getStudentId() );
            pst.setString(3, ugd.getCourseId());
            pst.setInt(4, ugd.getNumOfYears());
            pst.setString(5,ugd.getMainSubject1());
            pst.setString(6,ugd.getMainSubject2());
            pst.setString(7, ugd.getSubject1());
            pst.setString(8,ugd.getSubject2());
            pst.setString(9,ugd.getSubject3());
            pst.setInt(10, ugd.getMain1payment());
            pst.setInt(11, ugd.getMain2payment());
            pst.setInt(12, ugd.getSub1payment());
            pst.setInt(13, ugd.getSub2payment());
            pst.setInt(14, ugd.getSub3payment());
            
            
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
     
     int checkStudentId4(String studentid,String courseid){
        try{
            con=(Connection)DriverManager.getConnection(url,username,password);
            String query="SELECT studentid,courseid FROM postgraduatecourse";
            pst=(PreparedStatement)con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                if(studentid.equals(rs.getString(1))&& courseid.equals(rs.getString(2))){
                    return 0;
                }
            }
            return 1;
            
        }catch(Exception e){
            System.out.println(e);
            return 2;
        }
        
        
    
    }
     
    void postrGraduateStudent(AddPostGraduateDetail ugd){
        
        // store postgraduate student to database
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO addpostgraduate VALUES(?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setString(1, ugd.getFullName());
            pst.setString(2,ugd.getDob());
            pst.setInt(3, ugd.getAge());
            pst.setString(4,ugd.getAddress());
            pst.setString(5,ugd.getQualificationType());
            pst.setString(6,ugd.getInstitute() );
            pst.setInt(7,ugd.getYearOfCompletion());
            
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
     
   
    ArrayList<PostGraduateCourseDetail> getstudent2(){   
        try{
            ArrayList<PostGraduateCourseDetail> list1= new ArrayList<PostGraduateCourseDetail>();
          
            
            con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="SELECT * FROM postgraduatecourse";
            pst=(PreparedStatement)con.prepareStatement(query);
            
            rs=pst.executeQuery();
            
            while(rs.next()){
            PostGraduateCourseDetail sb=new PostGraduateCourseDetail();
                sb.setFaculty(rs.getString(1));
                sb.setStudentId(rs.getInt(2));
                sb.setCourseId(rs.getString(3));
                sb.setNumOfYears(rs.getInt(4));
                sb.setMainSubject1(rs.getString(5));
                sb.setMainSubject2(rs.getString(6));
                sb.setSubject1(rs.getString(7));
                sb.setSubject2(rs.getString(8));
                sb.setSubject3(rs.getString(9));
                
            
            list1.add(sb);
            }
            return list1;
        }catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
    } 
    
    
    void postGraduateResult(PostGraduateResult em ){
        
        // store post graduate result to database
         try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO postgraduateresult VALUES(?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setInt(1, em.getStudentId());
            pst.setString(2, em.getCourseId());
            pst.setString(3, em.getFaculty());
            pst.setString(4,em.getMainSubject1Rus() );
            pst.setString(5, em.getMainSubject1Rus());
            pst.setString(6,em.getSubject1Rus());
            pst.setString(7, em.getSubject2Rus());
            pst.setString(8, em.getSubject3Rus());
           
           
            
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }

    int checkStudentId6(String studentid, String courseid) {
          try{
            con=(Connection)DriverManager.getConnection(url,username,password);
            String query="SELECT studentid,courseid FROM undergraduateresult";
            pst=(PreparedStatement)con.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
                if(studentid.equals(rs.getString(1))&& courseid.equals(rs.getString(2))){
                    return 0;
                }
            }
            return 1;
            
        }catch(Exception e){
            System.out.println(e);
            return 2;
        }
    }
    
     public ResultSet find1(String s,String s1){
        try{
            con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="SELECT * FROM postgraduateresult WHERE studentid=? AND courseid=?";
            pst=(PreparedStatement)con.prepareStatement(query);
            pst.setString(1, s);
            pst.setString(2, s1);
           
            rs=pst.executeQuery();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return rs;
    }

     
      void lectures(lecturesDetails ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO addlectures VALUES(?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
            
            pst.setString(1, ugd.getFullName());
            pst.setInt(2,ugd.getLecturesId() );
            pst.setString(3, ugd.getFaculty());
            pst.setInt(4,ugd.getAge());
            pst.setString(5,ugd.getNIC());
            pst.setString(6,ugd.getQualificationType() );
            
            
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
      
     void instructors(AddInstructorDetail ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO addinstructor VALUES(?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
            
            pst.setString(1, ugd.getFullName());
            pst.setInt(2,ugd.getInstructorId() );
            pst.setString(3, ugd.getFaculty());
            pst.setInt(4,ugd.getAge());
            pst.setString(5,ugd.getNIC());
            pst.setString(6,ugd.getQualificationType() );
            
            
        
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    } 
     
    public boolean updateUndergraduateStudent(UnderGraduateDetail unsd) {
        try {
            System.out.println("update student 1");
            con = (Connection) DriverManager.getConnection(url, username, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE undergraduatestudent SET fullname = '" + unsd.getFullName()
                    +  "',age =" + unsd.getAge() + " ,dob='"
                    + unsd.getDob()  + "',address='"
                    + unsd.getAddress()  +  " ,alindex='" + unsd.getAlIndex() + "',rank = "
                    + unsd.getRank() + " WHERE studentid ='" + unsd.getStudentId() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update student 2");

            pst.executeUpdate();
            System.out.println("update student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    
    public boolean updateUndergraduateccourse(UnderGraduateCourseDetail unsd) {
        try {
            System.out.println("update student 1");
            con = (Connection) DriverManager.getConnection(url, username, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type

            String query = "UPDATE undergraduatestudent SET faculty = '" + unsd.getFaculty()
                    +  "',numofyears =" + unsd.getNumOfYears() + " ,mainasubject1='"
                    + unsd.getMainSubject1()  + "',mainsubject2='"
                    + unsd.getMainSubject2()  +  " ,subject1='" + unsd.getSubject1() + "',subject2 = "
                    + unsd.getSubject2()+ " ,subject3='" + unsd.getSubject4()  + " WHERE studentid ='" + unsd.getStudentId() + "'";

            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            System.out.println("update student 2");

            pst.executeUpdate();
            System.out.println("update student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this
            return false; //*** if have a exception return false 
        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    
     public boolean deleteUndergraduateStudent(UnderGraduateDetail unsd) {
        try {
            System.out.println("delete student 1");
            con = (Connection) DriverManager.getConnection(url, username, password); //***this line get the connection****   getConnction method return abstract form so it cast connection type
            String query = "DELETE FROM undergraduatestudent WHERE studentid = '" + unsd.getStudentId() + "'";
            pst = con.prepareStatement(query);
            System.out.println("delete student 2");

            pst.executeUpdate();
            System.out.println("delete student 3");
            return true;

        } catch (Exception e) {
            System.out.println(e);  // if have error show that from this

            return false; //*** if have a exception return false 

        } finally {        //release the resourses that we use connection and prepared statements
            try {    //we use this because bellow closes thow sql exception
                if (pst != null) {// if prepared statement not null close that
                    pst.close();
                }
                if (con != null) {//if connection is not null close that
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
     
     void lecturerUnderGraduateSubject(AddLecturerSubject ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO lecturerundersubject VALUES(?,?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setInt(1, ugd.getLecturerId());
            pst.setString(2,ugd.getFaculty() );
            pst.setString(3, ugd.getCourseId());
            pst.setString(4,ugd.getMainSubject1());
            pst.setString(5,ugd.getMainsubject2());
            pst.setString(6,ugd.getSubject1());
            pst.setString(7,ugd.getSubject2());
            pst.setString(8,ugd.getSubject3());
            pst.setString(9,ugd.getSubject4());
            
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
     
     
     void lecturerPostGraduateSubject(AddLecturerSubject ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO lecturerpostsubject VALUES(?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setInt(1, ugd.getLecturerId());
            pst.setString(2,ugd.getFaculty() );
            pst.setString(3, ugd.getCourseId());
            pst.setString(4,ugd.getMainSubject1());
            pst.setString(5,ugd.getMainsubject2());
            pst.setString(6,ugd.getSubject1());
            pst.setString(7,ugd.getSubject2());
            pst.setString(8,ugd.getSubject3());
           
            
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
     
     
    void InstructorUnderGraduateSubject(AddLecturerSubject ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO instructorundersubhect VALUES(?,?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setInt(1, ugd.getLecturerId());
            pst.setString(2,ugd.getFaculty() );
            pst.setString(3, ugd.getCourseId());
            pst.setString(4,ugd.getMainSubject1());
            pst.setString(5,ugd.getMainsubject2());
            pst.setString(6,ugd.getSubject1());
            pst.setString(7,ugd.getSubject2());
            pst.setString(8,ugd.getSubject3());
            pst.setString(9,ugd.getSubject4());
            
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    
    
    void InstructorPostGraduateSubject(AddLecturerSubject ugd){
       try{
           con=(Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query="INSERT INTO instructorpostsubject VALUES(?,?,?,?,?,?,?,?)";
            pst=(PreparedStatement)con.prepareStatement(query);
        
            pst.setInt(1, ugd.getLecturerId());
            pst.setString(2,ugd.getFaculty() );
            pst.setString(3, ugd.getCourseId());
            pst.setString(4,ugd.getMainSubject1());
            pst.setString(5,ugd.getMainsubject2());
            pst.setString(6,ugd.getSubject1());
            pst.setString(7,ugd.getSubject2());
            pst.setString(8,ugd.getSubject3());
           
            
            pst.executeUpdate();//execute the sql query and insert to values to the db table
           
           
       }catch(SQLException e){
           System.out.println(e);
       }
    }
}
