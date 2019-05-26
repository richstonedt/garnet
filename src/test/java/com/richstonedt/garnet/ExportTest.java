package com.richstonedt.garnet;
import com.richstonedt.garnet.common.utils.ExcelUtils;
import com.richstonedt.garnet.model.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.io.FileOutputStream;
import java.util.*;

/**
 * <b><code>ExportTest</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2018\10\18 0018 19:00.
 *
 * @author xxx
 * @since garnet-core-be-fe 0.0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExportTest {
    @Test
    public void testExport(){
        List<User> l=new ArrayList<>();
        for(int i=0;i<10;i++){
            User u=new User();
            u.setUserName("111");
            l.add(u);
        }
        File file=new File("D:\\简历\\.xlsx");
        FileOutputStream FO=null;
        try {
             FO= new FileOutputStream(file);
        }catch (FileNotFoundException e){
            System.out.print("找不到文件");
        }
        ExcelUtils<User> e=new ExcelUtils<>(User.class);
        e.exportExcel(l,"121",FO, ExcelUtils.ExcelVersion.EXCEL_VERSION_07);

    }
}
