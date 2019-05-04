package edu.uni;

import edu.uni.am.domain.AmLeaveBar;
import edu.uni.am.mapper.AmLeaveBarMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniApplicationTests {


    @Autowired
    private AmLeaveBarMapper amLeaveBarMapper;

    @Test
    public void contextLoads() throws IOException {

    }

    @Test
    public void aa(){
        System.out.println("-------------------------");
        AmLeaveBar amLeaveBar = amLeaveBarMapper.getById(2L);
        System.out.println(amLeaveBar.toString());
        System.out.println("=======================================");
        AmLeaveBar amLeaveBar1 = amLeaveBarMapper.selectByPrimaryKey(2L);
        System.out.println(amLeaveBar.toString());
    }
}
