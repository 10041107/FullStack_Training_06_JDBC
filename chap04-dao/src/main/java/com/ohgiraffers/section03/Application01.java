package com.ohgiraffers.section03;

import java.sql.Connection;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.*;

public class Application01 {
    public static void main(String[] args){
        /* transaction */
        Connection con = getConnection();
        try {
            con.setAutoCommit(false);
//            insert 1
//            if(result < 0){
//                con.rollback();
//            }
//            insert 2

//            insert 3

            con.commit();
            System.out.println("autoCommit의 현재 값 : ");
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            throw new RuntimeException(e);
        }
    }
}
