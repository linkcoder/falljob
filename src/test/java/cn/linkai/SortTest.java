package cn.linkai;

import cn.linkai.sorts.Bubble;
import cn.linkai.sorts.Insert;
import cn.linkai.sorts.Selection;
import cn.linkai.sorts.Shell;
import org.junit.Test;

public class SortTest {

    @Test
    public void testSelection(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Selection<Integer> selection=new Selection<>();
        selection.sort(nums);
    }

    @Test
    public void testBubble(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Bubble<Integer> bubble=new Bubble<>();
        bubble.sort(nums);
    }

    @Test
    public void testInsert(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Insert<Integer> insert=new Insert<>();
        insert.sort(nums);
    }

    @Test
    public void testShell(){
        Integer[] nums={2,5,3,1,4,6,0,8};
        Shell<Integer> shell=new Shell<>();
        shell.sort(nums);
    }
}
