package com.yunqi.ch01base

import scala.math.sqrt//

/**
  * @author: yunqi
  * @createdTime: 2019/4/23
  *               描述 
  */
object HelloWorld {

  def main(args: Array[String]): Unit = {


                             //数据类型,scala 不需要换行
                          //import scala.math.sqrt导入math函数
    /*println(5);//int 类型
    println(sqrt(5));
    println("hello".distinct) //String类型*/
    //apply update 方法
    /* println("hello".apply (4)); //和"hello"(4)相同
     println(Array(1, 2, 3)); //和Array.apply(3)相同
     println(Array(4) = 5)//和Array.update(4,5)相同*/


                                //option类型
    /* val scores = Map("James" -> 1729, "Bob" -> 25, "Jack" -> null);
     val james = scores.get("James");
     println(james)//some（1729），some表示有某个值，none 表示为空
     println(james.getOrElse("No score"))//1729
     println(james.isEmpty)//false
     println(scores.get("Jack"))//some(null)有空值
     println(scores.get("aa"))//None*/

                                        //控制类型
    //if else
    /*val x = 5;
    val s = if (x > 0) 1 else -1
    println(s);//1  java中没有三元运算符
    val s1  = if (x > 0) "hello" else -1
    println(s1);//Any = hello scala中如果if 和 else中返回的结果不一致，就返回Any类型(所有的类型的公共超类型)
    val s2 = if (x < 0) "hello";
    println(s2)////Any = ()如果缺少一个判断类型，什么都不返回，scala对于任何表达式都值，对于空值使用Unit类
    val s3 = if (x < 0) "hello" else ();//写做() 相当于java中的void
    println(s3);//Any =()*/

    // while 与if 语句不同，while本身没有值，整个while的结果为Unit类型的
    /*  var n =5;
      while(n > 0) {
         n -= 1;
        println(n)*/

    //for 表达式 for 中 <-, Map 中 ->

    for (i <- 1 to 3; j <- 1 to 3) {
      println(i*10 + j)//推导式
    }
    for (i <- 1 to 3; j <- 1 to 3 if i != j) {
      println(i*10 + j)//保护式，也叫守卫；可以引入一个或者多个变量，不需要continue语句
    }
    for (i <- 1 to 3; x = i -1) {
      println(i + "*" + x);//for推导式可以引入变量
    }
    val res = for (i <- 1 to 3)
      yield i %2;
      println(res)// Vector(1,0,1)使用yield关键字可以生成新新的集合



}
}








