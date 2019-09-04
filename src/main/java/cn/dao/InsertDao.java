package cn.dao;


import cn.model.KeyData;

import java.sql.Statement;


public class InsertDao {

    public static String insert(KeyData keyData, Statement statement) throws Exception {


        //String sql = "insert into [关键生产数据]([日期时间]) values ('2019-09-04 11:59:00')";

        String sql =  "insert into [关键生产数据] VALUES ('"+
                keyData.getTime()+ "', '" +
                keyData.getOne_water_in_flow()+ "', '" +
                keyData.getTwo_water_in_flow()+ "', '" +
                keyData.getOnechuchang_flow()+ "', '" +
                keyData.getTwochuchang_flow()+ "', '" +
                keyData.getSource_water_turbidity()+ "', '" +
                keyData.getSource_water_ph()+ "', '" +
                keyData.getOut_water_turbidity()+ "', '" +
                keyData.getOut_water_total_cl()+ "', '" +
                keyData.getOut_water_ph()+ "', '" +
                keyData.getOneout_water_pressure()+ "', '" +
                keyData.getTwoout_water_pressure()+ "', '" +
                keyData.getOne_after_cl()+ "', '" +
                keyData.getTwo_after_cl()+ "', '" +
                keyData.getOne_clear_wate_level()+ "', '" +
                keyData.getTwo_clear_wate_level()+ "', '" +
                keyData.getOriginal_water_level()+ "', '" +
                keyData.getTemperature()+ "', '" +
                keyData.getOne_pump_frequency_control()+ "', '" +
                keyData.getSix_pump_frequency_control()+ "', '" +
                keyData.getSeven_pump_frequency_control()+ "', '" +
                keyData.getOne_water_in_flow_total()+ "', '" +
                keyData.getTwo_water_in_flow_total()+ "', '" +
                keyData.getOne_out_water_total()+ "', '" +
                keyData.getTwo_out_water_total()+ "', '" +
                keyData.getUsedforself_total()+ "', '" +
                keyData.getFan_flow()+ "', '" +
                keyData.getHuiliu_flow()+ "', '" +
                keyData.getOneyougongdiandu()+ "', '" +
                keyData.getTwoyougongdiandu()+ "', '" +
                keyData.getThreeyougongdiandu()+ "', '" +
                keyData.getFouryougongdiandu()+ "', '" +
                keyData.getWorkyougongdiandu()+ "', '" +
                keyData.getBeiyongyougongdiandu()+ "', '" +
                keyData.getOnesongshuidiandu()+ "', '" +
                keyData.getTwosongshuidiandu()+ "', '" +
                keyData.getThreesongshuidiandu()+ "', '" +
                keyData.getFoursongshuidiandu()+ "', '" +
                keyData.getFivesongshuidiandu()+ "', '" +
                keyData.getSixsongshuidiandu()+ "', '" +
                keyData.getSevensongshuidiandu() + "')";


        boolean execute = statement.execute(sql);
        if (!execute){
            return "1";
        }else {
            return "0";
        }








        //Statement statement = conn.createStatement();
       /* boolean execute = statement.execute("SELECT * from [关键生产数据] where [日期时间] = '2019-08-22 11:20:00.000'");
        ResultSet resultSet = statement.executeQuery("SELECT * from [关键生产数据] where [日期时间] = '2019-08-22 11:20:00.000'");
       */
        /*PreparedStatement preparedStatement1 = conn.prepareStatement(sql);

        PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);*/

       /* preparedStatement.setString(1, keyData.getTime());
        preparedStatement.setString(2, keyData.getOne_water_in_flow());
        preparedStatement.setString(3,keyData.getTwo_water_in_flow());
        preparedStatement.setString(4,keyData.getOnechuchang_flow());
        preparedStatement.setString(5,keyData.getTwochuchang_flow());
        preparedStatement.setString(6,keyData.getSource_water_turbidity());
        preparedStatement.setString(7,keyData.getSource_water_ph());
        preparedStatement.setString(8,keyData.getOut_water_turbidity());
        preparedStatement.setString(9,keyData.getOut_water_total_cl());
        preparedStatement.setString(10,keyData.getOut_water_ph());
        preparedStatement.setString(11,keyData.getOneout_water_pressure());
        preparedStatement.setString(12,keyData.getTwoout_water_pressure());
        preparedStatement.setString(13,keyData.getOne_after_cl());
        preparedStatement.setString(14,keyData.getTwo_after_cl());
        preparedStatement.setString(15,keyData.getOne_clear_wate_level());
        preparedStatement.setString(16,keyData.getTwo_clear_wate_level());
        preparedStatement.setString(17,keyData.getOriginal_water_level());
        preparedStatement.setString(18,keyData.getTemperature());
        preparedStatement.setString(19,keyData.getOne_pump_frequency_control());
        preparedStatement.setString(20,keyData.getSix_pump_frequency_control());
        preparedStatement.setString(21,keyData.getSeven_pump_frequency_control());
        preparedStatement.setString(22,keyData.getOne_water_in_flow_total());
        preparedStatement.setString(23,keyData.getTwo_water_in_flow_total());
        preparedStatement.setString(24,keyData.getOne_out_water_total());
        preparedStatement.setString(25,keyData.getTwo_out_water_total());
        preparedStatement.setString(26,keyData.getUsedforself_total());

        preparedStatement.setString(27, keyData.getFan_flow());
        preparedStatement.setString(28, keyData.getHuiliu_flow());
        preparedStatement.setString(29, keyData.getOneyougongdiandu());
        preparedStatement.setString(30, keyData.getTwoyougongdiandu());
        preparedStatement.setString(31, keyData.getThreeyougongdiandu());
        preparedStatement.setString(32, keyData.getFouryougongdiandu());
        preparedStatement.setString(33, keyData.getWorkyougongdiandu());
        preparedStatement.setString(34,keyData.getBeiyongyougongdiandu());
        preparedStatement.setString(35,keyData.getOnesongshuidiandu());
        preparedStatement.setString(36,keyData.getTwosongshuidiandu());
        preparedStatement.setString(37,keyData.getThreesongshuidiandu());
        preparedStatement.setString(38,keyData.getFoursongshuidiandu());
        preparedStatement.setString(39,keyData.getFivesongshuidiandu());
        preparedStatement.setString(40,keyData.getSixsongshuidiandu());
        preparedStatement.setString(41,keyData.getSevensongshuidiandu());

        preparedStatement.executeUpdate();
        preparedStatement.close();*/


    }
}
