package day06_JUnitFrameWork;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethodlari {
    @Test
    public void  test01(){
     /* Eger testin sonucu tukce olarak olumlu bir cümle ile sorulduysa assertTrue ,
     olumsuz bir cümle ile sorulduysa assertFalse tercih edilir  */

         int sayi1=20;
         int sayi2=10;
         int sayi3=30;

         //sayi1'in sayi2'den büyük oldugunu test edin

        Assert.assertTrue(sayi1>sayi2);// sayi1>sayi2 PASSED

        //sayi1'in sayi3!den buyuk olmadıgını test edin

        Assert.assertFalse(sayi1>sayi3);

        //sayi1'in sayi3'den kucuk oldugunu test edin

        Assert.assertTrue(sayi1<sayi3);















    }









































}
