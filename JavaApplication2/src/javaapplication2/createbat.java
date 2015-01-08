/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package winshareupdate;
import java.io.*;

/**
 *
 * @author sf
 * create bat script
 */
    
public class createbat {
        public static void creatfile() //生成空白bat文件
        {
            
        // TODO code application logic here
         try {
             File path =new File("C:/copy") ;
             File dir=new File(path,"test.bat");
            
             if(!dir.exists())
                 dir.createNewFile();
         }
         catch(IOException e){
             System.out.print("创建文件失败");
         }
         
    }

    private static void createdir()// 生成文件夹
    {
    }
      
    }

 
    

