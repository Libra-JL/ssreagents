package com.ssreagents.test;

import com.ssreagents.utils.JdbcUtils;
import com.ssreagents.utils.UUIDGenerator;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils() {
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }

    @Test
    public void test1() {
        String uuid = UUIDGenerator.getUUID();
        System.out.println(uuid);

    }

    @Test
    public void test2() throws SQLException {
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);

//        LocalDate now = LocalDate.now();
//        System.out.println(now);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into test(aaa) values(?)");
        preparedStatement.setObject(1,now1);
        preparedStatement.execute();
        connection.close();


        System.out.println();
//        java.sql.Date date1 = new java.sql.Date();
    }

    @Test
    public void test4(){
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        System.out.println(timestamp);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


    }


    @Test
    public void test5(){
        String name  = "a.b.c.jpg";

        String substring = name.substring(name.lastIndexOf("."));


    }


}



