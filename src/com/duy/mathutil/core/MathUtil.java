/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duy.mathutil.core;

/**
 *
 * @author DUY
 */
//Class này sẽ chứa các hàm static, là tiện ích dùng chung cho các class khác
public class MathUtil {

    //hàm tính n! = 1.2.3...n.
    //0! = 1! = 1 quy ước
    //vì giai thừa tăng cực nhanh, 21! tràn kiểu long (18 số 0)
    //ko có giai thừa âm
    //quy ước: n nhận vào từ 0..20!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; //tích khởi đầu là 1, biến tích luỹ acc
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    //tư duy viết code theo kiểu TDD - Test Driven Development
    //Test First Development: khi viết code thì song song đó phải viết các tình huống kiểm thử code/hàm/class/kiểm thử app
    //tư duy viết code kèm kiểm thử
    //hàm của ta getFactorial(n đưa vào) -> trả về n! trong giới hạn long
    //ta suy nghĩ luôn 1 tình huống kiểm thử - TEST CASE
    //TEST CASE: 1 TÌNH HUỐNG TA XÀI APP, TỨC LÀ TA ĐƯA DATA ĐẦU VÀO VÀ CHỜ APP TRẢ RA KQ VÀ SO SÁNH APP TRẢ RA CÓ ĐÚNG KO
    //TDD là kĩ thuật vừa viết code vừa suy nghĩ luôn các TEST CASE để kiểm thử code
}
