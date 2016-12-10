package t;

import com.alibaba.com.caucho.hessian.io.Hessian2Input;
import com.alibaba.com.caucho.hessian.io.Hessian2Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by hanzhihua on 2016/11/29.
 */
public class Tm {

    public static void main(String[] args) throws  Exception {
//        FileOutputStream fos = new FileOutputStream("/tmp/tm.log");
//        Hessian2Output out = new Hessian2Output(fos);
//        out.writeObject(genUser());
//        out.close();;

//        FileOutputStream fos = new FileOutputStream("/tmp/tm.log");
//        Hessian2Output out = new Hessian2Output(fos);
//        out.writeObject(genUser());
//        out.close();;

        FileInputStream fis= new FileInputStream("/tmp/tm.log");
        Hessian2Input input = new Hessian2Input(fis);
        User user = (User)input.readObject();
        System.out.println("user:"+user);
//
//        fos = new FileOutputStream("/tmp/tm.log2");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(genUser());
//        oos.close();


//        FileOutputStream fos = new FileOutputStream("/tmp/tm.log");
//        Hessian2Output out = new Hessian2Output(fos);
////        out.writeInt(10);
////        out.writeInt(100000);
//        out.writeString("abc");
//        out.close();;
//
//        FileInputStream fis= new FileInputStream("/tmp/tm.log");
//        Hessian2Input input = new Hessian2Input(fis);
////        System.out.println(input.readInt());
//        System.out.println(input.readString());
    }

    private static User genUser(){
        User user = new User();
        user.setName("张三");
//        user.setType(UserType.A);
//        user.setAge(16);
        Address addr = new Address();
        addr.setProv("上海市");
        addr.setCity("虹口");
        user.setAddress(addr);

        return user;
    }
}
