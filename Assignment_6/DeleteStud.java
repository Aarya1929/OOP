package Assignment_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeleteStud {
	String driverName = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/students";
    static final String USER = "root";
    static final String PASS = "";
	 public void deleteTableData() {
	    	
	       try {
	    	  Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
	    	  InputDialogFrame frame = new InputDialogFrame();
	         String m = JOptionPane.showInputDialog(frame, "Enter RollNo to delete a record");
	         if(m.isEmpty()){
	             frame.closeIt();
	         } 
	        
	          String usql = "delete from studData WHERE roll =?";
	          java.sql.PreparedStatement pst = conn.prepareStatement(usql);
	          pst.setString(1,m);
	    	  pst.executeUpdate();
	    	 JOptionPane.showMessageDialog(null, "record deleted");
	    	 } catch (SQLException e ) {
	      JOptionPane.showMessageDialog(null, e);

	  }
  }}      

