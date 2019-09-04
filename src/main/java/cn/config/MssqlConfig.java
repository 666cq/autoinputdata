package cn.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MssqlConfig {

       private static String className="com.microsoft.sqlserver.jdbc.SQLServerDriver";

//	private static String url="jdbc:sqlserver://172.19.0.246:1433;DataBase=xjDatabase";

        private static String url="jdbc:sqlserver://172.19.0.246:1433;DataBase=xjDatabase-new";

        private static String user = "sa";

        private static String password = "qunzhi";

        private static Connection connection = null;

       private static PreparedStatement preparedStatement = null;

       private static ResultSet resultSet = null;

    public static Connection openConnection(){

            //加载驱动
            try {
                Class.forName(className);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //获得连接对象
            try {
                connection = DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return connection;
        }

        public static void closeConnection(){
            //关闭结果集
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            //关闭执行sql语句对象
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try{
                    connection.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }


}
