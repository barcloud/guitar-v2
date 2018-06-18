package dao;

import java.sql.*;

public class SqliteUtil {

    private static Connection connect;

   static {
       if(connect==null){
           createConnect();
        System.out.println("==================================执行"+connect);
       }
   }


    public static  void createConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            connect= DriverManager.getConnection("jdbc:sqlite:d:\\guitar.db");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Opened database successfully");
    }

    public static boolean executeUpdate(String sql,Object[] args){
        Connection conn=null;
        PreparedStatement pst=null;
        int rowsCount=0;
        try{
            pst=conn.prepareStatement(sql);
            if(args!=null&args.length>0){
                for(int i=0;i<args.length;i++){
                    pst.setObject(i+1, args[i]);
                }
            }
            rowsCount=pst.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rowsCount>0?true:false;
    }

    public static ResultSet executeQuery(String sql,Object[] args){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            conn=connect;
            pst=conn.prepareStatement(sql);
            if(args!=null&args.length>0){
                for(int i=0;i<args.length;i++){
                    pst.setObject(i+1, args[i]);
                }
            }
            rs=pst.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
}
