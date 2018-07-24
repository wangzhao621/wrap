package com.example.wrap.mydemo;

import com.example.wrap.mydemo.entity.Address;
import com.example.wrap.mydemo.entity.User;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by admin on 2018/7/9.
 */
public class OptionalDemo {

    public static void main(String[] args){
        OptionalDemo demo = new OptionalDemo();
        demo.demo8();
    }


    private void demo1(){
        //创建空的optional对象
        Optional<User> emptyopt = Optional.empty();
    }

    private void demo2(){
        User user = null;
        //of---对象为null值时，直接抛出nullPointException
        Optional<User> opt1 = Optional.of(user);
    }

    private void demo3(){
        User user = null;
        //ofNullable---对象不确定为null值时可以使用
        Optional<User> opt2 = Optional.ofNullable(user);
        opt2.ifPresent(u -> {
            System.out.print(u.getName());
        });
        System.out.print(opt2.isPresent());
    }

    private void demo4(){
        String name = "Jonn";
        Optional<String> opt = Optional.ofNullable(name);
        //get方法取值
        System.out.print(opt.get());
    }

    private void demo5(){
        User user = new User("Rose");
        Optional<User> opt = Optional.ofNullable(user);
        //ifPresent---判断空值,可以加参数  isPresent()函数，只判断、不能传参数
        opt.ifPresent(user1 -> {
                System.out.print(user1.getName());
            }
        );
    }

    private void demo6(){
        User user = null;
        User user1 = new User("user1");
        User user2 = new User("user2");

        User resultUser1 = Optional.ofNullable(user).orElse(user1);
        User resultUser2 = Optional.ofNullable(user1).orElse(user2);

    }

    //orElse()与orElseGet()的区别
    private void demo7(){
        User user = null;
        User user1 = new User("user1");
        User user2 = new User("user2");

        /**
         * 当user为空值时，orElse()与orElseGet()用法相同，都会去创建一个新对象替代空值
         */
        System.out.println("使用orElse替换user空值");
        User resultUser1 = Optional.ofNullable(user).orElse(createUser());
        System.out.println("使用orElseGet替换user空值");
        User resultUser2 = Optional.ofNullable(user).orElseGet(() -> createUser());

        /**
         * 当user为非空值时，
         * orElse()与orElseGet()用法：
         * 新对象都不会替代原先值，但是orElse依然会创建一个新的对象，orElseGet则不会
         * orElseGet()的性能要优于orElse()
         */
        System.out.println("使用orElse替换user1");
        User resultUser3 = Optional.ofNullable(user1).orElse(createUser());
        System.out.println("使用orElseGet替换user1");
        User resultUser4 = Optional.ofNullable(user1).orElseGet(() -> createUser());
    }
    private User createUser(){
        System.out.println("创建新用户对象");
        return new User("newuser");
    }

    /**
     * map和flatMap的区别
     */
    private void demo8(){
        Address address = new Address("China","Beijing");
        User user = new User("user1",address);

        Optional<Optional<Address>> opt = Optional.ofNullable(user).map(User::getOptionalAddress);
        Optional<Address> opt2 = Optional.ofNullable(user).flatMap(User::getOptionalAddress);
    }



    @Test
    public void demo9(){
        Address address = new Address("china","beijing");
        User user  = new User("tom", address);
        if(user != null){
            Address address1 = user.getAddress();

            if(address1!=null && address1.getCountry().equalsIgnoreCase("china")){
                System.out.println("1、user belong to china");
            }
        }

        Optional<User> userOptional = Optional.of(user);
        userOptional
                .map(User::getAddress)
                .filter(address1 -> address1.getCountry().equalsIgnoreCase("china"))
                .ifPresent(address1 -> {
                    System.out.println("2、user belong to china");
                });
        //拆分流程
        //1、使用map方法获取包含Address的Optional
        Optional<Address> addressOptional = userOptional.map(User::getAddress);
        //2 过滤是china的地址
        Optional<Address> addressOptional1 = addressOptional.filter(address1 -> address1.getCountry().equalsIgnoreCase("china"));
        //3、查看是否存在
        addressOptional1.ifPresent(address1 -> {
            System.out.println("3、user belong to china");
        });


    }


}
